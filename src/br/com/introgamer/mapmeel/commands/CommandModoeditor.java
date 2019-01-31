package br.com.introgamer.mapmeel.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import br.com.introgamer.mapmeel.variables.Jogadores;
import br.com.introgamer.mapmeel.variables.Strings;
import br.com.introgamer.mapmeel.variables.Variables;

public class CommandModoeditor implements CommandExecutor {

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

        if (args.length != 1) {
            sender.sendMessage(Strings.prefix + "§6Digite: /" + command.getName() + " [true/false/check]");
            return true;
        } else {
            if (args[0].equalsIgnoreCase("true")) {
                Variables.ModoEditor = true;

                sender.sendMessage(Strings.prefix + "§aModo Editor Ativado!");
                Bukkit.getServer().getConsoleSender().sendMessage(Strings.prefix + "§aModo Editor ativado por " + sender.getName());
                return true;
            } else if (args[0].equalsIgnoreCase("false")) {
                Variables.ModoEditor = false;

                sender.sendMessage(Strings.prefix + "§aModo Editor Desativado!");
                Bukkit.getServer().getConsoleSender().sendMessage(Strings.prefix + "§aModo Editor desativado por " + sender.getName());
                return true;
            } else if (args[0].equalsIgnoreCase("check")) {
                if (!Variables.ModoEditor) {
                    sender.sendMessage(Strings.prefix + "§aO Modo Editor esta desativado!");
                    return true;
                } else if (Variables.ModoEditor) {
                    sender.sendMessage(Strings.prefix + "§aO Modo Editor esta ativado!");
                    return true;
                }
            } else {
                sender.sendMessage(Strings.prefix + "§6Digite: /" + command.getName() + " [true/false/check]");
                return true;
            }
        }

        return false;
    }

}
