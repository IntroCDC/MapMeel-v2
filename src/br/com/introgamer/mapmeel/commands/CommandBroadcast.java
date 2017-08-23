package br.com.introgamer.mapmeel.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import br.com.introgamer.mapmeel.variables.Jogadores;
import br.com.introgamer.mapmeel.variables.Strings;
import br.com.introgamer.mapmeel.variables.Variables;

public class CommandBroadcast implements CommandExecutor {

    @Override
    public boolean onCommand(final CommandSender sender, final Command command, final String label, final String[] args) {

        if (Variables.MeelBlock) {
            if (sender.getName().equalsIgnoreCase(Jogadores.Meel)) {
                sender.sendMessage(Strings.prefix + Strings.semPerm);
                return true;
            }
        }

        if (args.length == 0) {
            sender.sendMessage(Strings.prefix + "§bUse: /" + command.getName() + " [ARGS]");
            return true;
        }

        final StringBuilder buffer = new StringBuilder();
        for (int i = 0; i < args.length; i++) {
            if (i != 0) {
                buffer.append(" ").append(args[i]);
            } else {
                buffer.append(args[i]);
            }

        }

        Bukkit.broadcastMessage(Strings.prefix + buffer.toString());

        return true;
    }

}
