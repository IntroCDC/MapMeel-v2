package br.com.introgamer.mapmeel.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import br.com.introgamer.mapmeel.variables.Jogadores;
import br.com.introgamer.mapmeel.variables.Strings;
import br.com.introgamer.mapmeel.variables.Variables;

public class CommandAvisoconsole implements CommandExecutor {

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
            sender.sendMessage(Strings.prefix + "§bUse: /" + command.getName() + " [ARGS]");
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

        Bukkit.getServer().getConsoleSender().sendMessage(Strings.prefixadmin + "§4§l-----------------------------");
        Bukkit.getServer().getConsoleSender().sendMessage(Strings.prefixadmin + "§f" + buffer.toString());
        Bukkit.getServer().getConsoleSender().sendMessage(Strings.prefixadmin + "§4§l-----------------------------");

        if (Bukkit.getPlayer(Jogadores.Intro) != null) {
            Bukkit.getPlayer(Jogadores.Intro).sendMessage(Strings.prefixadmin + "§4§l-----------------------------");
            Bukkit.getPlayer(Jogadores.Intro).sendMessage(Strings.prefixadmin + "§f" + buffer.toString());
            Bukkit.getPlayer(Jogadores.Intro).sendMessage(Strings.prefixadmin + "§4§l-----------------------------");
        }
        if (Bukkit.getPlayer(Jogadores.Meel) != null) {
            if (!Variables.MeelBlock) {
                Bukkit.getPlayer(Jogadores.Meel).sendMessage(Strings.prefixadmin + "§4§l-----------------------------");
                Bukkit.getPlayer(Jogadores.Meel).sendMessage(Strings.prefixadmin + "§f" + buffer.toString());
                Bukkit.getPlayer(Jogadores.Meel).sendMessage(Strings.prefixadmin + "§4§l-----------------------------");
            }
        }
        if (Bukkit.getPlayer(Jogadores.Diego) != null) {
            Bukkit.getPlayer(Jogadores.Diego).sendMessage(Strings.prefixadmin + "§4§l-----------------------------");
            Bukkit.getPlayer(Jogadores.Diego).sendMessage(Strings.prefixadmin + "§f" + buffer.toString());
            Bukkit.getPlayer(Jogadores.Diego).sendMessage(Strings.prefixadmin + "§4§l-----------------------------");
        }
        if (Bukkit.getPlayer(Jogadores.Sombra) != null) {
            Bukkit.getPlayer(Jogadores.Sombra).sendMessage(Strings.prefixadmin + "§4§l-----------------------------");
            Bukkit.getPlayer(Jogadores.Sombra).sendMessage(Strings.prefixadmin + "§f" + buffer.toString());
            Bukkit.getPlayer(Jogadores.Sombra).sendMessage(Strings.prefixadmin + "§4§l-----------------------------");
        }
        if (Bukkit.getPlayer(Jogadores.Raymeki) != null) {
            Bukkit.getPlayer(Jogadores.Raymeki).sendMessage(Strings.prefixadmin + "§4§l-----------------------------");
            Bukkit.getPlayer(Jogadores.Raymeki).sendMessage(Strings.prefixadmin + "§f" + buffer.toString());
            Bukkit.getPlayer(Jogadores.Raymeki).sendMessage(Strings.prefixadmin + "§4§l-----------------------------");
        }
        if (Bukkit.getPlayer(Jogadores.Edder) != null) {
            Bukkit.getPlayer(Jogadores.Edder).sendMessage(Strings.prefixadmin + "§4§l-----------------------------");
            Bukkit.getPlayer(Jogadores.Edder).sendMessage(Strings.prefixadmin + "§f" + buffer.toString());
            Bukkit.getPlayer(Jogadores.Edder).sendMessage(Strings.prefixadmin + "§4§l-----------------------------");
        }
        if (Bukkit.getPlayer(Jogadores.Crazy) != null) {
            Bukkit.getPlayer(Jogadores.Crazy).sendMessage(Strings.prefixadmin + "§4§l-----------------------------");
            Bukkit.getPlayer(Jogadores.Crazy).sendMessage(Strings.prefixadmin + "§f" + buffer.toString());
            Bukkit.getPlayer(Jogadores.Crazy).sendMessage(Strings.prefixadmin + "§4§l-----------------------------");
        }
        if (Bukkit.getPlayer(Jogadores.Dede) != null) {
            Bukkit.getPlayer(Jogadores.Dede).sendMessage(Strings.prefixadmin + "§4§l-----------------------------");
            Bukkit.getPlayer(Jogadores.Dede).sendMessage(Strings.prefixadmin + "§f" + buffer.toString());
            Bukkit.getPlayer(Jogadores.Dede).sendMessage(Strings.prefixadmin + "§4§l-----------------------------");
        }
        if (Bukkit.getPlayer(Jogadores.Beaats) != null) {
            Bukkit.getPlayer(Jogadores.Beaats).sendMessage(Strings.prefixadmin + "§4§l-----------------------------");
            Bukkit.getPlayer(Jogadores.Beaats).sendMessage(Strings.prefixadmin + "§f" + buffer.toString());
            Bukkit.getPlayer(Jogadores.Beaats).sendMessage(Strings.prefixadmin + "§4§l-----------------------------");
        }
        if (Bukkit.getPlayer(Jogadores.Biidu) != null) {
            Bukkit.getPlayer(Jogadores.Biidu).sendMessage(Strings.prefixadmin + "§4§l-----------------------------");
            Bukkit.getPlayer(Jogadores.Biidu).sendMessage(Strings.prefixadmin + "§f" + buffer.toString());
            Bukkit.getPlayer(Jogadores.Biidu).sendMessage(Strings.prefixadmin + "§4§l-----------------------------");
        }
        if (Bukkit.getPlayer(Jogadores.Keroch) != null) {
            Bukkit.getPlayer(Jogadores.Keroch).sendMessage(Strings.prefixadmin + "§4§l-----------------------------");
            Bukkit.getPlayer(Jogadores.Keroch).sendMessage(Strings.prefixadmin + "§f" + buffer.toString());
            Bukkit.getPlayer(Jogadores.Keroch).sendMessage(Strings.prefixadmin + "§4§l-----------------------------");
        }
        if (Bukkit.getPlayer(Jogadores.FelipeHeroPlay) != null) {
            Bukkit.getPlayer(Jogadores.FelipeHeroPlay).sendMessage(Strings.prefixadmin + "§4§l-----------------------------");
            Bukkit.getPlayer(Jogadores.FelipeHeroPlay).sendMessage(Strings.prefixadmin + "§f" + buffer.toString());
            Bukkit.getPlayer(Jogadores.FelipeHeroPlay).sendMessage(Strings.prefixadmin + "§4§l-----------------------------");
        }
        if (Bukkit.getPlayer(Jogadores.Mariao) != null) {
            Bukkit.getPlayer(Jogadores.Mariao).sendMessage(Strings.prefixadmin + "§4§l-----------------------------");
            Bukkit.getPlayer(Jogadores.Mariao).sendMessage(Strings.prefixadmin + "§f" + buffer.toString());
            Bukkit.getPlayer(Jogadores.Mariao).sendMessage(Strings.prefixadmin + "§4§l-----------------------------");
        }

        return false;
    }

}
