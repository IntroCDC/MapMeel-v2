package br.com.introgamer.mapmeel.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import br.com.introgamer.mapmeel.variables.Jogadores;
import br.com.introgamer.mapmeel.variables.Strings;
import br.com.introgamer.mapmeel.variables.Variables;
import br.com.introgamer.mapmeel.variables.scoreManager;

public class CommandScoremanager implements CommandExecutor {

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

        if (args.length <= 1) {
            sender.sendMessage(Strings.prefix + "§bUse: /scoremanager [setlevel]");
        } else {
            if (args[0].equalsIgnoreCase("setlevel")) {
                if (args[1].length() > 25) {
                    sender.sendMessage(Strings.prefix + "§cNome Grande demais! §4MAX: 25");
                    return true;
                }
                scoreManager.tipo = args[1];
            }
        }

        return false;
    }

}
