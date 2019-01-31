package br.com.introgamer.mapmeel.commands;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import br.com.introgamer.mapmeel.variables.Jogadores;
import br.com.introgamer.mapmeel.variables.Strings;
import br.com.introgamer.mapmeel.variables.Variables;

public class CommandTeleport implements CommandExecutor {

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

        if (args.length == 0) {
            sender.sendMessage(Strings.prefix + "§bUse: /teleport [nick] [nick] - e todos os tipos");
            return true;
        } else if (args.length == 1) {
            if (!(sender instanceof Player)) {
                sender.sendMessage(Strings.prefix + Strings.inGame);
                return true;
            }
            if (Bukkit.getPlayer(args[0]) == null) {
                sender.sendMessage(Strings.prefix + args[0] + Strings.naoOnline);
                return true;
            }

            ((Player) sender).teleport(Bukkit.getPlayer(args[0]).getLocation());
            sender.sendMessage(Strings.prefix + "§6Teleportado para §5" + args[0] + " §6com Sucesso!");
            return true;
        } else if (args.length == 2) {

            if (Bukkit.getPlayer(args[0]) == null || Bukkit.getPlayer(args[1]) == null) {
                sender.sendMessage(Strings.prefix + "§cUm dos jogadores não está online!");
                return true;
            }

            Bukkit.getPlayer(args[0]).teleport(Bukkit.getPlayer(args[1]).getLocation());
            sender.sendMessage(Strings.prefix + "§6Teleportado §5" + args[0] + "§6 para §5" + args[1] + " §6com Sucesso!");
            return true;
        } else if (args.length == 3) {
            if (!(sender instanceof Player)) {
                sender.sendMessage(Strings.prefix + Strings.inGame);
                return true;
            }

            ((Player) sender).teleport(new Location(Bukkit.getWorld("world"), Double.parseDouble(args[0]), Double.parseDouble(args[1]), Double.parseDouble(args[2])));

            sender.sendMessage(Strings.prefix + "§6Teleportado para as Coordenadas: §5" + Double.parseDouble(args[0]) + "§6, §5" + Double.parseDouble(args[1]) + "§6, §5" + Double.parseDouble(args[2]) + "§6 com Sucesso!");
            return true;
        } else {
            if (Bukkit.getPlayer(args[0]) == null) {
                sender.sendMessage(Strings.prefix + args[0] + Strings.naoOnline);
                return true;
            }

            Bukkit.getPlayer(args[0]).teleport(new Location(Bukkit.getWorld("world"), Double.parseDouble(args[1]), Double.parseDouble(args[2]), Double.parseDouble(args[3])));
            sender.sendMessage(Strings.prefix + "§6Teleportado §5" + args[0] + "§6 para as Coordenadas: §5" + Double.parseDouble(args[1]) + "§6, §5" + Double.parseDouble(args[2]) + "§6, §5" + Double.parseDouble(args[3]) + "§6 com Sucesso!");
            return true;
        }

    }

}
