package br.com.introgamer.mapmeel.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import br.com.introgamer.mapmeel.variables.Strings;
import br.com.introgamer.mapmeel.variables.Variables;

public class CommandConfirm implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (!Variables.ConfirmOn) {
            sender.sendMessage(Strings.prefix + "§cComando sem função para confirmar!");
            return true;
        } else {
            if (Variables.ConfirmType == null) {
                sender.sendMessage(Strings.prefix + "§4§lBUG");
            } else {
                if (Variables.ConfirmType.equalsIgnoreCase("Minion")) {
                    Variables.Dinheiro = Variables.Dinheiro - Variables.MinionCusto;

                    sender.sendMessage(Strings.prefix + "§a§lVocê comprou um Ajuda Dos Minions com Sucesso!");
                    sender.sendMessage(Strings.prefix + "§a§lEles estão chegando...");

                    Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "avisoconsole §6§lAVISO!!!!!!!!!!!!!§a§l " + sender.getName() + " CONFIRMOU A COMPRA DA AJUDA DOS MINIONS! GOGOGOGOGO!!!");

                    Variables.ConfirmOn = false;
                    Variables.ConfirmType = null;
                    return true;
                }
            }
        }

        return false;
    }

}
