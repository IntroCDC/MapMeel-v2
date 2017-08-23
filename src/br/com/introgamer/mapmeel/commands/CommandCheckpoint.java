package br.com.introgamer.mapmeel.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import br.com.introgamer.mapmeel.variables.Jogadores;
import br.com.introgamer.mapmeel.variables.Strings;
import br.com.introgamer.mapmeel.variables.Variables;

public class CommandCheckpoint implements CommandExecutor {

    @Override
    public boolean onCommand(final CommandSender sender, final Command command, final String label, final String[] args) {

        if (Variables.MeelBlock) {
            if (sender.getName().equalsIgnoreCase(Jogadores.Meel)) {
                sender.sendMessage(Strings.prefix + Strings.semPerm);
                return true;
            }
        }

        if (args.length == 0) {
            sender.sendMessage(Strings.prefix + "§bUse: /" + command.getName() + " [NICK]");
            return true;
        }
        if (Bukkit.getPlayer(args[0]) == null) {
            sender.sendMessage(Strings.prefix + "§c" + args[0] + Strings.naoOnline);
            return true;
        }

        Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "spawnpoint @a " + Bukkit.getPlayer(args[0]).getLocation().getX() + " " + Bukkit.getPlayer(args[0]).getLocation().getY() + " " + Bukkit.getPlayer(args[0]).getLocation().getZ());
        sender.sendMessage(Strings.prefix + "§6Spawnpoint alterado para: §e" + Bukkit.getPlayer(args[0]).getLocation().getX() + " " + Bukkit.getPlayer(args[0]).getLocation().getY() + " " + Bukkit.getPlayer(args[0]).getLocation().getZ() + "!");
        Bukkit.broadcastMessage(Strings.prefix + "§6§lCHECKPOINT!");
        Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "playsound random.levelup @a -1662 50 639 50000 1");

        return false;
    }

}
