package br.com.introgamer.mapmeel.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import br.com.introgamer.mapmeel.variables.Jogadores;
import br.com.introgamer.mapmeel.variables.Strings;
import br.com.introgamer.mapmeel.variables.Variables;

public class CommandSendchat implements CommandExecutor {

    @Override
    public boolean onCommand(final CommandSender sender, final Command command, final String label, final String[] args) {

        if (Variables.MeelBlock) {
            if (sender.getName().equalsIgnoreCase(Jogadores.Meel)) {
                sender.sendMessage(Strings.prefix + Strings.semPerm);
                return true;
            }
        }

        if (args.length <= 1) {
            sender.sendMessage(Strings.prefix + "§bUse: /sendchat [NICK] Chat");
            return true;
        }

        final int ultimo = args.length - 1;

        if (Bukkit.getPlayer(args[ultimo]) == null) {
            sender.sendMessage(Strings.prefix + "§c" + args[ultimo] + Strings.naoOnline);
            return true;
        }

        if (args[0].contains("/sendchat")) {
            sender.sendMessage(Strings.prefix + "§cNão faça um loop infinito!");
            return true;
        }

        final String Jogador = args[ultimo];
        args[ultimo] = "";

        final StringBuilder s = new StringBuilder();
        for (int i = 0; i < args.length; i++) {
            if (i != 0) {
                s.append(" ").append(args[i]);
            } else {
                s.append(args[i]);
            }

        }

        Bukkit.getPlayer(Jogador).chat(s.toString());

        return false;
    }

}
