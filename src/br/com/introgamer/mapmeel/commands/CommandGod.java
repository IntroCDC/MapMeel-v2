package br.com.introgamer.mapmeel.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import br.com.introgamer.mapmeel.variables.Jogadores;
import br.com.introgamer.mapmeel.variables.Strings;
import br.com.introgamer.mapmeel.variables.Variables;

public class CommandGod implements CommandExecutor {

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

        if (!(sender instanceof Player)) {
            sender.sendMessage(Strings.prefix + Strings.inGame);
            return true;
        }

        if (args.length == 0) {
            if (!Variables.inGod.contains(sender.getName())) {
                sender.sendMessage(Strings.prefix + "§bVocê ficou invencivel a tudo!");
                Variables.inGod.add(sender.getName());
            } else {
                sender.sendMessage(Strings.prefix + "§bVocê está vuneravel agora");
                Variables.inGod.remove(sender.getName());
            }
        } else {
            if (Bukkit.getPlayer(args[0]) == null) {
                Bukkit.broadcastMessage(Strings.prefix + args[0] + Strings.naoOnline);
                return true;
            }

            if (!Variables.inGod.contains(Bukkit.getPlayer(args[0]).getName())) {
                sender.sendMessage(Strings.prefix + "§b" + Bukkit.getPlayer(args[0]).getName() + " ficou invencível a tudo!");
                Variables.inGod.add(Bukkit.getPlayer(args[0]).getName());
            } else {
                sender.sendMessage(Strings.prefix + "§b" + Bukkit.getPlayer(args[0]).getName() + " está vuneravel agora!");
                Variables.inGod.remove(Bukkit.getPlayer(args[0]).getName());
            }
        }

        return false;
    }

}
