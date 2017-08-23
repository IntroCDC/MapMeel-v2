package br.com.introgamer.mapmeel.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import br.com.introgamer.mapmeel.variables.Jogadores;
import br.com.introgamer.mapmeel.variables.Strings;
import br.com.introgamer.mapmeel.variables.Variables;

public class CommandChatpv implements CommandExecutor {

    @Override
    public boolean onCommand(final CommandSender sender, final Command command, final String label, final String[] args) {

        if (Variables.MeelBlock) {
            if (sender.getName().equalsIgnoreCase(Jogadores.Meel)) {
                sender.sendMessage(Strings.prefix + Strings.semPerm);
                return true;
            }
        }

        if (!Variables.Jogadores.contains(sender.getName())) {
            sender.sendMessage(Strings.prefix + Strings.semPerm);
            return true;
        }

        if (Variables.ChatPrivate.contains(sender.getName())) {
            Variables.ChatPrivate.remove(sender.getName());
            sender.sendMessage(Strings.prefix + "�6Voc� saiu do Chat Private!");

            for (final Player p : Bukkit.getOnlinePlayers()) {
                if (Variables.Jogadores.contains(p.getName())) {
                    p.sendMessage(Strings.prefix + "�c�l" + sender.getName() + " Saiu do Chat Private!");
                }
            }
        } else {
            Variables.ChatPrivate.add(sender.getName());
            sender.sendMessage(Strings.prefix + "�6Voc� entrou no Chat Private!");

            for (final Player p : Bukkit.getOnlinePlayers()) {
                if (Variables.Jogadores.contains(p.getName())) {
                    p.sendMessage(Strings.prefix + "�a�l" + sender.getName() + " Entrou no Chat Private!");
                }
            }
        }

        return false;
    }

}
