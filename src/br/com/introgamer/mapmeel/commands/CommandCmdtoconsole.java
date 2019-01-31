package br.com.introgamer.mapmeel.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import br.com.introgamer.mapmeel.variables.Jogadores;
import br.com.introgamer.mapmeel.variables.Strings;
import br.com.introgamer.mapmeel.variables.Variables;

public class CommandCmdtoconsole implements CommandExecutor {

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
            sender.sendMessage(Strings.prefix + "§bUse: /cmdtoconsole [CMD]");
            return true;
        }

        StringBuilder buffer = new StringBuilder();
        for (int i = 0; i < args.length; i++) {
            if (i != 0) {
                buffer.append(" ").append(args[i]);
            } else {
                buffer.append(args[i]);
            }

        }
        Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), buffer.toString());

        return false;
    }

}
