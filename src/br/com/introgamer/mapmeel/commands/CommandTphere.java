package br.com.introgamer.mapmeel.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import br.com.introgamer.mapmeel.variables.Jogadores;
import br.com.introgamer.mapmeel.variables.Strings;
import br.com.introgamer.mapmeel.variables.Variables;

public class CommandTphere implements CommandExecutor {

    @Override
    public boolean onCommand(final CommandSender sender, final Command command, final String label, final String[] args) {

        if (Variables.MeelBlock) {
            if (sender.getName().equalsIgnoreCase(Jogadores.Meel)) {
                sender.sendMessage(Strings.prefix + Strings.semPerm);
                return true;
            }
        }

        if (!(sender instanceof Player)) {
            Bukkit.getServer().getConsoleSender().sendMessage(Strings.prefix + Strings.inGame);
            return true;
        }

        if (args.length == 0) {
            sender.sendMessage(Strings.prefix + "§bUse: /tphere [nick]");
            return true;
        }

        if (Bukkit.getPlayer(args[0]) == null) {
            sender.sendMessage(Strings.prefix + args[0] + Strings.naoOnline);
            return true;
        }

        Bukkit.getPlayer(args[0]).teleport(((Player) sender).getLocation());
        sender.sendMessage(Strings.prefix + "§5" + args[0] + "§6 Foi teleportado(a) para você com Sucesso!");

        return false;
    }

}
