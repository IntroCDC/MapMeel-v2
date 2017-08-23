package br.com.introgamer.mapmeel.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import br.com.introgamer.mapmeel.variables.Jogadores;
import br.com.introgamer.mapmeel.variables.Strings;
import br.com.introgamer.mapmeel.variables.Variables;

public class CommandLiberado implements CommandExecutor {

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
                Variables.Liberado = true;

                sender.sendMessage(Strings.prefix + "§aServidor Liberado!");
                return true;
            } else if (args[0].equalsIgnoreCase("false")) {
                Variables.Liberado = false;

                if (Bukkit.getPlayer(Jogadores.Meel) != null) {
                    Bukkit.getPlayer(Jogadores.Meel).kickPlayer(Strings.prefix + "§cServidor foi Bloqueado! §aJájá voltamos! :3");
                }

                sender.sendMessage(Strings.prefix + "§aServidor Bloqueado!");
                return true;
            } else if (args[0].equalsIgnoreCase("check")) {
                if (!Variables.Liberado) {
                    sender.sendMessage(Strings.prefix + "§aO Servidor está atualmente Bloqueado!");
                    return true;
                } else if (Variables.Liberado) {
                    sender.sendMessage(Strings.prefix + "§aO Servidor está atualmente Liberado!");
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
