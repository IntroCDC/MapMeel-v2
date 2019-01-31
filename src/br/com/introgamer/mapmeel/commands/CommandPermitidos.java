package br.com.introgamer.mapmeel.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import br.com.introgamer.mapmeel.variables.Jogadores;
import br.com.introgamer.mapmeel.variables.Strings;
import br.com.introgamer.mapmeel.variables.Variables;

public class CommandPermitidos implements CommandExecutor {

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
            sender.sendMessage(Strings.prefix + "§bUse: /permitidos [add/rem/check/equipe]");
            return true;
        }
        if (args.length == 1) {
            if (args[0].equalsIgnoreCase("check")) {
                sender.sendMessage(Strings.prefix + "§6Permitidos para entrar no Mapa: " + Variables.Permitidos.toString());
                return true;
            } else if (args[0].equalsIgnoreCase("equipe")) {
                sender.sendMessage(Strings.prefix + "§6Equipe de Criação de Conteúdo MapMeel: " + Variables.Jogadores.toString());
                return true;
            } else {
                sender.sendMessage(Strings.prefix + "§bUse: /permitidos [add/rem/check/equipe]");
                return true;
            }
        }
        if (args.length >= 2) {
            if (Variables.Jogadores.contains(args[1]) || args[1].equalsIgnoreCase(Jogadores.Meel)) {
                sender.sendMessage(Strings.prefix + "§cEste Jogador já está registrado no Plugin!");
                return true;
            }
            if (args[0].equalsIgnoreCase("add")) {
                if (Variables.Permitidos.contains(args[1])) {
                    sender.sendMessage(Strings.prefix + "§c" + args[1] + " Já está permitido para entrar no Servidor!");
                    return true;
                } else {
                    Variables.Permitidos.add(args[1]);
                    Variables.plugin.getConfig().set("Permitidos.Nick", Variables.Permitidos);
                    Variables.plugin.saveConfig();
                    sender.sendMessage(Strings.prefix + "§6Adicionado §e" + args[1] + " §6Para a lista de Permitidos com Sucesso!");
                    return true;
                }
            } else if (args[0].equalsIgnoreCase("rem")) {
                if (!Variables.Permitidos.contains(args[1])) {
                    sender.sendMessage(Strings.prefix + "§c" + args[1] + " Já não está permitido para entrar no Servidor!");
                    return true;
                } else {
                    Variables.Permitidos.remove(args[1]);
                    Variables.plugin.getConfig().set("Permitidos.Nick", Variables.Permitidos);
                    Variables.plugin.saveConfig();
                    sender.sendMessage(Strings.prefix + "§6Removido §e" + args[1] + " §6Para a lista de Permitidos com Sucesso!");

                    if (Bukkit.getPlayer(args[1]) != null) {
                        Bukkit.getPlayer(args[1]).kickPlayer(Strings.prefix + "§4§l" + sender.getName() + " REMOVEU SUA PERMISSÃO DE ENTRAR NO SERVIDOR!");
                    }

                    return true;
                }
            } else {
                sender.sendMessage(Strings.prefix + "§bUse: /permitidos [add/rem/check]");
                return true;
            }
        }

        return false;
    }

}
