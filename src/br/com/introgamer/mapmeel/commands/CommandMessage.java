package br.com.introgamer.mapmeel.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import br.com.introgamer.mapmeel.variables.Jogadores;
import br.com.introgamer.mapmeel.variables.Strings;
import br.com.introgamer.mapmeel.variables.Variables;

public class CommandMessage implements CommandExecutor {

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

        StringBuilder buffer = new StringBuilder();
        for (int i = 0; i < args.length; i++) {
            if (i != 0) {
                buffer.append(" ").append(args[i]);
            } else {
                buffer.append(args[i]);
            }

        }

        if (Bukkit.getPlayer(Jogadores.Meel) == null) {
            sender.sendMessage(Strings.prefix + "§c" + Jogadores.Meel + Strings.naoOnline);
            return true;
        }

        if (args.length == 0) {
            sender.sendMessage(Strings.prefix + "§bUse: /" + command.getName() + " [ARGS]");
            return true;
        }

        Bukkit.getPlayer(Jogadores.Meel).sendTitle("§7§l#IntroBase64", buffer.toString());
        Bukkit.getPlayer(Jogadores.Meel).sendMessage("§7§l#IntroBase64 §f" + buffer.toString());

        return true;
    }

}
