package br.com.introgamer.mapmeel.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.scheduler.BukkitRunnable;

import br.com.introgamer.mapmeel.variables.Jogadores;
import br.com.introgamer.mapmeel.variables.Strings;
import br.com.introgamer.mapmeel.variables.Variables;

public class CommandMinions implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (args.length == 0) {
            if (!Variables.MinionsEnabled) {
                sender.sendMessage(Strings.prefix + "§cOs Minions não estão ativados no momento :/");
                return true;
            }

            if (Variables.Dinheiro < Variables.MinionCusto) {
                sender.sendMessage(Strings.prefix + "§cVocê não tem Money suficiente para utilizar os Minions!");
                return true;
            } else {
                sender.sendMessage(Strings.prefix + "§6Os Minions custa " + Variables.MinionCusto + " de Money! Utilize seu Money Direito!");
                sender.sendMessage(Strings.prefix + "§6Para comfirmar a compra dos Minions, Digite: /confirm");
                sender.sendMessage(Strings.prefix + "§7§o(Disponível por 15 segundos)");

                Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "avisoconsole §6§lAVISO!!!!!!!!!!!!!§a§l " + sender.getName() + " VAI COMPRAR A AJUDA DOS MINIONS! SÓ FALTA CONFIRMAR!");

                Variables.ConfirmOn = true;
                Variables.ConfirmType = "Minion";

                new BukkitRunnable() {
                    @Override
                    public void run() {
                        if (Variables.ConfirmOn) {
                            Variables.ConfirmOn = false;
                            Variables.ConfirmType = null;

                            sender.sendMessage(Strings.prefix + "§cCompra Cancelada!");

                            Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "avisoconsole §6§lAVISO!!!!!!!!!!!!!§c§l " + sender.getName() + " CANCELOU A COMPRA!");
                        } else {
                            Variables.ConfirmOn = false;
                            Variables.ConfirmType = null;
                        }
                    }
                }.runTaskLater(Variables.plugin, 300L);

            }
        }

        if (args.length == 1) {
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

            if (args[0].equalsIgnoreCase("true")) {
                sender.sendMessage(Strings.prefix + "§aCompra dos Minions Ativada!");
                Variables.MinionsEnabled = true;

                Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "avisoconsole §a§l" + sender.getName() + " ATIVOU A COMPRA DOS MINIONS!");
                return true;
            } else if (args[0].equalsIgnoreCase("false")) {
                sender.sendMessage(Strings.prefix + "§aCompra dos Minions Desativada!");
                Variables.MinionsEnabled = false;

                Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "avisoconsole §a§l" + sender.getName() + " DESATIVOU A COMPRA DOS MINIONS!");
                return true;
            } else {
                sender.sendMessage(Strings.prefix + "§6Use: /minions [true/false] para ativar ou desativar a compra da ajuda dos minions!");
                return true;
            }
        }

        return false;
    }

}
