package br.com.introgamer.mapmeel.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;

import br.com.introgamer.mapmeel.variables.Jogadores;
import br.com.introgamer.mapmeel.variables.Strings;
import br.com.introgamer.mapmeel.variables.Variables;

public class CommandTextura implements CommandExecutor {

    @Override
    public boolean onCommand(final CommandSender sender, final Command command, final String label, final String[] args) {

        if (Variables.MeelBlock) {
            if (sender.getName().equalsIgnoreCase(Jogadores.Meel)) {
                sender.sendMessage(Strings.prefix + Strings.semPerm);
                return true;
            }
        }

        final Player p = (Player) sender;

        Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "avisoconsole " + sender.getName() + " esta baixando a textura...");

        p.chat("/rp");

        new BukkitRunnable() {
            @Override
            public void run() {
                if (Bukkit.getPlayer(sender.getName()) != null) {
                    Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "avisoconsole " + sender.getName() + " Baixou e Ativou a textura");
                }
            }
        }.runTaskLater(Variables.plugin, 100L);

        return false;
    }

}
