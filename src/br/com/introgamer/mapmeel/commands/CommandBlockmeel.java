package br.com.introgamer.mapmeel.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import br.com.introgamer.mapmeel.variables.Jogadores;
import br.com.introgamer.mapmeel.variables.Strings;
import br.com.introgamer.mapmeel.variables.Variables;

public class CommandBlockmeel implements CommandExecutor {

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
            sender.sendMessage(Strings.prefix + "§6Digite: /" + command.getName() + " [true/false/check]");
            return true;
        } else {
            if (args[0].equalsIgnoreCase("true")) {
                Variables.MeelBlock = true;

                if (Variables.Jogadores.contains(Jogadores.Meel)) {
                    Variables.Jogadores.remove(Jogadores.Meel);
                }

                sender.sendMessage(Strings.prefix + "§aEventos Bloqueados para a Meel!");

                Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "avisoconsole " + sender.getName() + " bloqueou os eventos para a Meel!");
                return true;
            } else if (args[0].equalsIgnoreCase("false")) {
                Variables.MeelBlock = false;

                if (!Variables.Jogadores.contains(Jogadores.Meel)) {
                    Variables.Jogadores.add(Jogadores.Meel);
                }

                sender.sendMessage(Strings.prefix + "§aEventos Liberados para a Meel");

                Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "avisoconsole " + sender.getName() + " liberou os eventos para a Meel!");
                return true;
            } else if (args[0].equalsIgnoreCase("check")) {
                if (!Variables.MeelBlock) {
                    sender.sendMessage(Strings.prefix + "§aOs Eventos para a Meel estão atualmente Liberados!");
                    return true;
                } else {
                    sender.sendMessage(Strings.prefix + "§aOs Eventos para a Meel estão atualmente Bloqueados!");
                    return true;
                }
            } else {
                sender.sendMessage(Strings.prefix + "§6Digite: /" + command.getName() + " [true/false/check]");
                return true;
            }
        }

    }

}
