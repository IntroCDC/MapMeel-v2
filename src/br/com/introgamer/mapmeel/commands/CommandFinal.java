package br.com.introgamer.mapmeel.commands;

import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;

import br.com.introgamer.mapmeel.variables.Jogadores;
import br.com.introgamer.mapmeel.variables.Strings;
import br.com.introgamer.mapmeel.variables.Variables;

public class CommandFinal implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (Variables.MeelBlock) {
            if (sender.getName().equalsIgnoreCase(Jogadores.Meel)) {
                sender.sendMessage(Strings.prefix + Strings.semPerm);
                return true;
            }
        }

        if (!sender.isOp()) {
            sender.sendMessage(Strings.prefix + Strings.semPerm);
            return true;
        }

        Variables.ModoEditor = true;
        Variables.MeelBlock = false;
        Variables.GmIntro = true;

        Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "playsound mapmeel.trapqueen @a 0 120 0 50000 1");

        new BukkitRunnable() {
            @Override
            public void run() {
                for (Player p : Bukkit.getOnlinePlayers()) {
                    p.sendTitle(Strings.Mapa, "§7Agora você irá re-ver os Mapas que passou! :)");
                    p.setGameMode(GameMode.CREATIVE);
                    p.setOp(true);

                    p.sendMessage(Strings.prefix + "§aAgora todos os Comandos estão liberados para você!");
                    p.sendMessage(Strings.prefix + "§6Comandos: " + Variables.Commands.toString());
                    p.sendMessage(Strings.prefix + "§7Agora você irá re-ver os Mapas que passou! :)");
                    p.sendMessage(Strings.prefix + "§2§lExperimente o comando: /jogar :3");
                }
            }
        }.runTaskLater(Variables.plugin, 55L);

        return false;
    }

}
