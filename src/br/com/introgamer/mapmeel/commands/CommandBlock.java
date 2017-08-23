package br.com.introgamer.mapmeel.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import br.com.introgamer.mapmeel.variables.Jogadores;
import br.com.introgamer.mapmeel.variables.Strings;
import br.com.introgamer.mapmeel.variables.Variables;

public class CommandBlock implements CommandExecutor {

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
                Variables.Block = true;

                for (final Player p : Bukkit.getOnlinePlayers()) {
                    if (!Variables.Jogadores.contains(p.getName()) && !Variables.Permitidos.contains(p.getName()) && !p.getName().equalsIgnoreCase(Jogadores.Meel)) {
                        p.kickPlayer(Strings.prefix + "§4§lO SERVIDOR FOI BLOQUEADO!");
                    }
                }

                sender.sendMessage(Strings.prefix + "§aServidor Bloqueado!!");
                Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "avisoconsole " + sender.getName() + " bloqueou o Servidor!");
                return true;
            } else if (args[0].equalsIgnoreCase("false")) {
                Variables.Block = false;

                sender.sendMessage(Strings.prefix + "§aServidor Desbloqueado!");
                Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "avisoconsole " + sender.getName() + " desbloqueou o Servidor!");
                return true;
            } else if (args[0].equalsIgnoreCase("check")) {
                if (!Variables.Block) {
                    sender.sendMessage(Strings.prefix + "§aO Servidor está atualmente §4§lLiberado§a para Jogadores de Fora do Projeto! (Para Bloquear, Digite: /block true)");
                    return true;
                } else if (Variables.Block) {
                    sender.sendMessage(Strings.prefix + "§aO Servidor está atualmente §2§lBloqueado§a para Jogadores de Fora do Projeto!");
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
