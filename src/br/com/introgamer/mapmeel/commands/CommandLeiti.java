package br.com.introgamer.mapmeel.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import br.com.introgamer.mapmeel.variables.Strings;

public class CommandLeiti implements CommandExecutor {

    @Override
    public boolean onCommand(final CommandSender sender, final Command command, final String label, final String[] args) {

        if (!(sender instanceof Player)) {
            sender.sendMessage(Strings.prefix + Strings.inGame);
            return true;
        }

        ((Player) sender).sendTitle("§f§l#LEITI", "§7");

        return false;
    }

}
