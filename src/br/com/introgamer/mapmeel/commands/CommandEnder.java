package br.com.introgamer.mapmeel.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import br.com.introgamer.mapmeel.variables.Jogadores;
import br.com.introgamer.mapmeel.variables.Strings;
import br.com.introgamer.mapmeel.variables.Variables;

public class CommandEnder implements CommandExecutor {

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

        if (args.length == 0) {
            sender.sendMessage(Strings.prefix + "§bUse: /" + command.getName() + " [NICK]");
            return true;
        }
        if (Bukkit.getPlayer(args[0]) == null) {
            sender.sendMessage(Strings.prefix + "§c" + args[0] + Strings.naoOnline);
            return true;
        }

        ((Player) sender).openInventory(Bukkit.getPlayer(args[0]).getEnderChest());
        sender.sendMessage(Strings.prefix + "§6EnderChest de §5" + args[0] + " §6Aberto com Sucesso!");

        return false;
    }

}
