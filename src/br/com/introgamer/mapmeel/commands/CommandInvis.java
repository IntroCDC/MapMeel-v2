package br.com.introgamer.mapmeel.commands;

import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import br.com.introgamer.mapmeel.variables.Jogadores;
import br.com.introgamer.mapmeel.variables.Strings;
import br.com.introgamer.mapmeel.variables.Variables;

public class CommandInvis implements CommandExecutor {

    @Override
    public boolean onCommand(final CommandSender sender, final Command command, final String label, final String[] args) {

        if (Variables.MeelBlock) {
            if (sender.getName().equalsIgnoreCase(Jogadores.Meel)) {
                sender.sendMessage(Strings.prefix + Strings.semPerm);
                return true;
            }
        }

        if (!(sender instanceof Player)) {
            Bukkit.getServer().getConsoleSender().sendMessage(Strings.prefix + Strings.inGame);
            return true;
        }

        if (!Jogadores.admins.contains(sender.getName())) {
            Jogadores.admins.add(sender.getName());
        }

        ((Player) sender).setGameMode(GameMode.SPECTATOR);
        sender.sendMessage(Strings.prefix + "§bVocê está invisível!");
        for (final Player p : Bukkit.getOnlinePlayers()) {
            if (!Variables.Jogadores.contains(p.getName()) && !Variables.Permitidos.contains(p.getName())) {
                p.hidePlayer((Player) sender);
            }
        }

        return false;
    }

}
