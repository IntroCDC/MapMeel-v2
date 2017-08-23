package br.com.introgamer.mapmeel.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import br.com.introgamer.mapmeel.variables.Jogadores;
import br.com.introgamer.mapmeel.variables.Strings;
import br.com.introgamer.mapmeel.variables.Variables;

public class CommandGmintro implements CommandExecutor {

    @Override
    public boolean onCommand(final CommandSender sender, final Command command, final String label, final String[] args) {

        if (Variables.MeelBlock) {
            if (sender.getName().equalsIgnoreCase(Jogadores.Meel)) {
                sender.sendMessage(Strings.prefix + Strings.semPerm);
                return true;
            }
        }

        if (args.length != 1) {
            sender.sendMessage(Strings.prefix + "§6Digite: /" + command.getName() + " [true/false/check]");
            return true;
        } else {
            if (args[0].equalsIgnoreCase("true")) {
                Variables.GmIntro = true;

                sender.sendMessage(Strings.prefix + "§aGamemodes de " + Jogadores.Intro + " Ativado!");
                return true;
            } else if (args[0].equalsIgnoreCase("false")) {
                Variables.GmIntro = false;

                sender.sendMessage(Strings.prefix + "§aGamemodes de " + Jogadores.Intro + " Desativados!");
                return true;
            } else if (args[0].equalsIgnoreCase("check")) {
                if (!Variables.GmIntro) {
                    sender.sendMessage(Strings.prefix + "§aOS Gamemodes de " + Jogadores.Intro + " estam desativados!");
                    return true;
                } else if (Variables.GmIntro) {
                    sender.sendMessage(Strings.prefix + "§aOS Gamemodes de " + Jogadores.Intro + " estam ativados!");
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
