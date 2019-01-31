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

public class CommandStop implements CommandExecutor {

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

        Bukkit.broadcastMessage(Strings.prefix + "§c§lServidor Reiniciando!!!!! §7§o(By: " + sender.getName() + ")");
        Bukkit.broadcastMessage(Strings.prefix + "§c§lServidor Reiniciando!!!!! §7§o(By: " + sender.getName() + ")");
        Bukkit.broadcastMessage(Strings.prefix + "§c§lServidor Reiniciando!!!!! §7§o(By: " + sender.getName() + ")");
        Bukkit.broadcastMessage(Strings.prefix + "§c§lServidor Reiniciando!!!!! §7§o(By: " + sender.getName() + ")");
        Bukkit.broadcastMessage(Strings.prefix + "§c§lServidor Reiniciando!!!!! §7§o(By: " + sender.getName() + ")");

        new BukkitRunnable() {
            @Override
            public void run() {
                for (Player p : Bukkit.getOnlinePlayers()) {
                    p.kickPlayer(Strings.prefix + "§cServidor Reiniciando...");
                }
            }
        }.runTaskLater(Variables.plugin, 100L);

        new BukkitRunnable() {
            @Override
            public void run() {
                Bukkit.shutdown();
            }
        }.runTaskLater(Variables.plugin, 110L);

        return false;
    }

}
