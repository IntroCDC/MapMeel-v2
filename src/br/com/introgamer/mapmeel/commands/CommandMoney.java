package br.com.introgamer.mapmeel.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import br.com.introgamer.mapmeel.variables.Jogadores;
import br.com.introgamer.mapmeel.variables.Strings;
import br.com.introgamer.mapmeel.variables.Variables;

public class CommandMoney implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (args.length == 0) {
            sender.sendMessage(Strings.prefix + "§aMoney: " + Variables.Dinheiro);
            return true;
        }

        if (args[0].equalsIgnoreCase("give")) {
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

            if (args.length == 1) {
                sender.sendMessage(Strings.prefix + "§bUse: /" + command.getName() + " give [quantidade]");
                return true;
            }

            try {
                Variables.Dinheiro = Variables.Dinheiro + Double.parseDouble(args[1]);

                double numero = Double.parseDouble(args[1]);

                if (sender instanceof Player) {
                    Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "avisoconsole " + sender.getName() + " deu " + args[1] + " de Money!");
                }

                Bukkit.broadcastMessage(Strings.prefix + "§2§lParabéns! §aVocê ganhou " + numero + " de Money por ter ganhado a Fase!");
                Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "playsound random.levelup @a -1662 50 639 50000 1");
            } catch (Exception e) {
                sender.sendMessage(Strings.prefix + "§cUse Apenas números e pontos!");
                return true;
            }
        }

        if (args[0].equalsIgnoreCase("set")) {
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

            if (args.length == 1) {
                sender.sendMessage(Strings.prefix + "§bUse: /" + command.getName() + " set [quantidade]");
                return true;
            }

            try {
                Variables.Dinheiro = Double.parseDouble(args[1]);

                double numero = Double.parseDouble(args[1]);

                if (sender instanceof Player) {
                    Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "avisoconsole " + sender.getName() + " setou o Dinheiro para " + args[1] + "!");
                }

                Bukkit.broadcastMessage(Strings.prefix + "§aMoney foi alterado para " + numero + "!");
                Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "playsound random.levelup @a -1662 50 639 50000 1");
            } catch (Exception e) {
                sender.sendMessage(Strings.prefix + "§cUse Apenas números e pontos!");
                return true;
            }
        }

        if (args[0].equalsIgnoreCase("remove")) {
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

            if (args.length == 1) {
                sender.sendMessage(Strings.prefix + "§bUse: /" + command.getName() + " remove [quantidade]");
                return true;
            }

            try {
                double numero = Double.parseDouble(args[1]);

                if (Variables.Dinheiro < Double.parseDouble(args[1])) {
                    Variables.Dinheiro = 0.0;
                    Bukkit.broadcastMessage(Strings.prefix + "§aMoney Resetado!");
                } else {
                    Variables.Dinheiro = Variables.Dinheiro - Double.parseDouble(args[1]);
                    Bukkit.broadcastMessage(Strings.prefix + "§aRemovido " + numero + " de Money!");
                }

                if (sender instanceof Player) {
                    Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "avisoconsole " + sender.getName() + " removeu " + args[1] + " de Money!");
                }
            } catch (Exception e) {
                sender.sendMessage(Strings.prefix + "§cUse Apenas números e pontos!");
                return true;
            }
        }

        return false;
    }

}
