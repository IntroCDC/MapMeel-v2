package br.com.introgamer.mapmeel.commands;
/*
 * Written by IntroCDC, Bruno Coêlho at 20/07/2019 - 03:53
 */

import br.com.introgamer.mapmeel.variables.Variables;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class CommandComplete implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        if (commandSender instanceof Player) {
            return false;
        }

        new BukkitRunnable() {
            @Override
            public void run() {
                for (Player player : Bukkit.getOnlinePlayers()) {
                    sendPluginMessage(player, "MapMeelv2Complete");
                    sendPlayer(player, "KitPvP");
                }
            }
        }.runTaskLater(Variables.plugin, 200);
        return false;
    }

    public static void sendPlayer(Player player, String server) {
        sendPluginMessage(player, "Connect", server);
    }

    public static void sendPluginMessage(Player player, String... messages) {
        ByteArrayOutputStream byteArray = new ByteArrayOutputStream();
        DataOutputStream output = new DataOutputStream(byteArray);
        try {
            for (String message : messages) {
                output.writeUTF(message);
            }
        } catch (IOException ignored) {
        }
        player.sendPluginMessage(Variables.plugin, "kindome:pm", byteArray.toByteArray());
    }

}
