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

public class CommandGamemode implements CommandExecutor {

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
            sender.sendMessage(Strings.prefix + "§bUse: /" + command.getName() + " [0/1/2/3] {NICK<Opcional>}");
            return true;
        } else if (args.length == 1) {
            if (!(sender instanceof Player)) {
                sender.sendMessage(Strings.prefix + Strings.inGame);
                return true;
            }

            Player p = (Player) sender;

            if (args[0].equalsIgnoreCase("0") || args[0].equalsIgnoreCase("survival") || args[0].equalsIgnoreCase("sobrevivencia") || args[0].equalsIgnoreCase("s")) {
                p.setGameMode(GameMode.SURVIVAL);
                p.sendMessage(Strings.prefix + "§bVocê alterou seu GameMode para: §3SURVIVAL!");
                return true;
            } else if (args[0].equalsIgnoreCase("1") || args[0].equalsIgnoreCase("creative") || args[0].equalsIgnoreCase("criativo") || args[0].equalsIgnoreCase("c")) {
                p.setGameMode(GameMode.CREATIVE);
                p.sendMessage(Strings.prefix + "§bVocê alterou seu GameMode para: §3CRIATIVO!");
                return true;
            } else if (args[0].equalsIgnoreCase("2") || args[0].equalsIgnoreCase("adventure") || args[0].equalsIgnoreCase("aventura") || args[0].equalsIgnoreCase("a")) {
                p.setGameMode(GameMode.ADVENTURE);
                p.sendMessage(Strings.prefix + "§bVocê alterou seu GameMode para: §3AVENTURA!");
                return true;
            } else if (args[0].equalsIgnoreCase("3") || args[0].equalsIgnoreCase("spectator") || args[0].equalsIgnoreCase("espectador") || args[0].equalsIgnoreCase("e")) {
                p.setGameMode(GameMode.SPECTATOR);
                p.sendMessage(Strings.prefix + "§bVocê alterou seu GameMode para: §3ESPECTADOR!");
                return true;
            } else {
                sender.sendMessage(Strings.prefix + "§bUse: /" + command.getName() + " [0/1/2/3] {NICK<Opcional>}");
                return true;
            }
        } else {
            if (Bukkit.getPlayer(args[1]) == null) {
                sender.sendMessage(Strings.prefix + "§c" + args[1] + Strings.naoOnline);
                return true;
            }

            Player p = Bukkit.getPlayer(args[1]);

            if (args[0].equalsIgnoreCase("0") || args[0].equalsIgnoreCase("survival") || args[0].equalsIgnoreCase("sobrevivencia") || args[0].equalsIgnoreCase("s")) {
                p.setGameMode(GameMode.SURVIVAL);
                sender.sendMessage(Strings.prefix + "§bVocê alterou o GameMode de " + args[1] + " para: §3SURVIVAL!");
                return true;
            } else if (args[0].equalsIgnoreCase("1") || args[0].equalsIgnoreCase("creative") || args[0].equalsIgnoreCase("criativo") || args[0].equalsIgnoreCase("c")) {
                p.setGameMode(GameMode.CREATIVE);
                sender.sendMessage(Strings.prefix + "§bVocê alterou o GameMode de " + args[1] + " para: §3CRIATIVO!");
                return true;
            } else if (args[0].equalsIgnoreCase("2") || args[0].equalsIgnoreCase("adventure") || args[0].equalsIgnoreCase("aventura") || args[0].equalsIgnoreCase("a")) {
                p.setGameMode(GameMode.ADVENTURE);
                sender.sendMessage(Strings.prefix + "§bVocê alterou o GameMode de " + args[1] + " para: §3AVENTURA!");
                return true;
            } else if (args[0].equalsIgnoreCase("3") || args[0].equalsIgnoreCase("spectator") || args[0].equalsIgnoreCase("espectador") || args[0].equalsIgnoreCase("e")) {
                p.setGameMode(GameMode.SPECTATOR);
                sender.sendMessage(Strings.prefix + "§bVocê alterou o GameMode de " + args[1] + " para: §3ESPECTADOR!");
                return true;
            } else {
                sender.sendMessage(Strings.prefix + "§bUse: /" + command.getName() + " [0/1/2/3] {NICK<Opcional>}");
                return true;
            }
        }

    }

}
