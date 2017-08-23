package br.com.introgamer.mapmeel.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;

import br.com.introgamer.mapmeel.variables.ItemStacks;
import br.com.introgamer.mapmeel.variables.Jogadores;
import br.com.introgamer.mapmeel.variables.Strings;
import br.com.introgamer.mapmeel.variables.Variables;

public class CommandKit implements CommandExecutor {

    @Override
    public boolean onCommand(final CommandSender sender, final Command command, final String label, final String[] args) {

        if (Variables.MeelBlock) {
            if (sender.getName().equalsIgnoreCase(Jogadores.Meel)) {
                sender.sendMessage(Strings.prefix + Strings.semPerm);
                return true;
            }
        }

        if (args.length == 0) {
            sender.sendMessage(Strings.prefix + "§bUse: /" + command.getName() + " [NomeKit]");
            sender.sendMessage(Strings.prefix + "§6Kits: §eTeatro§6, §eFullSopa§6, §eTocha");
            return true;
        }

        if (args.length == 1) {

            if (!(sender instanceof Player)) {
                Bukkit.getServer().getConsoleSender().sendMessage(Strings.prefix + Strings.inGame);
                return true;
            }

            if (args[0].equalsIgnoreCase("teatro")) {
                ((Player) sender).getInventory().clear();

                ItemStacks.TeatEspadaDimaMeta.setDisplayName(Strings.TeatEspadaDimaNome);
                ItemStacks.TeatEspadaDimaMeta.addEnchant(Enchantment.DURABILITY, 1, true);
                ItemStacks.TeatEspadaDima.setItemMeta(ItemStacks.TeatEspadaDimaMeta);

                ItemStacks.TeatEspadaMeta.setDisplayName(Strings.TeatEspadaNome);
                ItemStacks.TeatEspada.setItemMeta(ItemStacks.TeatEspadaMeta);

                ItemStacks.TeatIsqueiroMeta.setDisplayName(Strings.TeatIsqueiroNome);
                ItemStacks.TeatIsqueiroMeta.addEnchant(Enchantment.DURABILITY, 64, true);
                ItemStacks.TeatIsqueiro.setItemMeta(ItemStacks.TeatIsqueiroMeta);

                ItemStacks.TeatBowMeta.setDisplayName(Strings.TeatBowNome);
                ItemStacks.TeatBow.setItemMeta(ItemStacks.TeatBowMeta);

                ItemStacks.TeatArrowMeta.setDisplayName(Strings.TeatArrowNome);
                ItemStacks.TeatArrow.setItemMeta(ItemStacks.TeatArrowMeta);

                ItemStacks.TeatPeitoMeta.setDisplayName(Strings.TeatPeitoNome);
                ItemStacks.TeatPeito.setItemMeta(ItemStacks.TeatPeitoMeta);

                ItemStacks.TeatCalcaMeta.setDisplayName(Strings.TeatCalcaNome);
                ItemStacks.TeatCalca.setItemMeta(ItemStacks.TeatCalcaMeta);

                ItemStacks.TeatBotaMeta.setDisplayName(Strings.TeatBotaNome);
                ItemStacks.TeatBota.setItemMeta(ItemStacks.TeatBotaMeta);

                ((Player) sender).getInventory().setItem(7, ItemStacks.TeatIsqueiro);
                ((Player) sender).getInventory().setItem(8, ItemStacks.TeatEspadaDima);

                ((Player) sender).getInventory().setItem(0, ItemStacks.TeatEspada);
                ((Player) sender).getInventory().setItem(1, ItemStacks.TeatBow);
                ((Player) sender).getInventory().setItem(3, ItemStacks.TeatPeito);
                ((Player) sender).getInventory().setItem(4, ItemStacks.TeatCalca);
                ((Player) sender).getInventory().setItem(5, ItemStacks.TeatBota);
                ((Player) sender).getInventory().setItem(13, ItemStacks.TeatArrow);

                sender.sendMessage(Strings.prefix + "§6Kit Selecionado com Sucesso! §eKit: " + args[0]);
                return true;
            } else if (args[0].equalsIgnoreCase("fullsopa")) {
                ((Player) sender).getInventory().clear();

                ItemStacks.SopaMeta.setDisplayName(Strings.SopaNome);
                ItemStacks.Sopa.setItemMeta(ItemStacks.SopaMeta);

                ItemStacks.CogumeloMMeta.setDisplayName(Strings.RecraftNome);
                ItemStacks.CogumeloM.setItemMeta(ItemStacks.CogumeloMMeta);

                ItemStacks.CogumeloVMeta.setDisplayName(Strings.RecraftNome);
                ItemStacks.CogumeloV.setItemMeta(ItemStacks.CogumeloVMeta);

                ItemStacks.Pote64Meta.setDisplayName(Strings.RecraftNome);
                ItemStacks.Pote64.setItemMeta(ItemStacks.Pote64Meta);

                ((Player) sender).getInventory().setItem(0, ItemStacks.Sopa);
                ((Player) sender).getInventory().setItem(1, ItemStacks.Sopa);
                ((Player) sender).getInventory().setItem(2, ItemStacks.Sopa);
                ((Player) sender).getInventory().setItem(3, ItemStacks.Sopa);
                ((Player) sender).getInventory().setItem(4, ItemStacks.Sopa);
                ((Player) sender).getInventory().setItem(5, ItemStacks.Sopa);
                ((Player) sender).getInventory().setItem(6, ItemStacks.Sopa);
                ((Player) sender).getInventory().setItem(7, ItemStacks.Sopa);
                ((Player) sender).getInventory().setItem(8, ItemStacks.Sopa);
                ((Player) sender).getInventory().setItem(9, ItemStacks.Sopa);
                ((Player) sender).getInventory().setItem(10, ItemStacks.Sopa);
                ((Player) sender).getInventory().setItem(11, ItemStacks.Sopa);
                ((Player) sender).getInventory().setItem(12, ItemStacks.Sopa);
                ((Player) sender).getInventory().setItem(13, ItemStacks.CogumeloV);
                ((Player) sender).getInventory().setItem(14, ItemStacks.CogumeloM);
                ((Player) sender).getInventory().setItem(15, ItemStacks.Pote64);
                ((Player) sender).getInventory().setItem(16, ItemStacks.Sopa);
                ((Player) sender).getInventory().setItem(17, ItemStacks.Sopa);
                ((Player) sender).getInventory().setItem(18, ItemStacks.Sopa);
                ((Player) sender).getInventory().setItem(19, ItemStacks.Sopa);
                ((Player) sender).getInventory().setItem(20, ItemStacks.Sopa);
                ((Player) sender).getInventory().setItem(21, ItemStacks.Sopa);
                ((Player) sender).getInventory().setItem(22, ItemStacks.Sopa);
                ((Player) sender).getInventory().setItem(23, ItemStacks.Sopa);
                ((Player) sender).getInventory().setItem(24, ItemStacks.Sopa);
                ((Player) sender).getInventory().setItem(25, ItemStacks.Sopa);
                ((Player) sender).getInventory().setItem(26, ItemStacks.Sopa);
                ((Player) sender).getInventory().setItem(27, ItemStacks.Sopa);
                ((Player) sender).getInventory().setItem(28, ItemStacks.Sopa);
                ((Player) sender).getInventory().setItem(29, ItemStacks.Sopa);
                ((Player) sender).getInventory().setItem(30, ItemStacks.Sopa);
                ((Player) sender).getInventory().setItem(31, ItemStacks.Sopa);
                ((Player) sender).getInventory().setItem(32, ItemStacks.Sopa);
                ((Player) sender).getInventory().setItem(33, ItemStacks.Sopa);
                ((Player) sender).getInventory().setItem(34, ItemStacks.Sopa);
                ((Player) sender).getInventory().setItem(35, ItemStacks.Sopa);

                sender.sendMessage(Strings.prefix + "§6Kit Selecionado com Sucesso! §eKit: " + args[0]);
                return true;
            } else if (args[0].equalsIgnoreCase("tocha")) {
                ((Player) sender).getInventory().clear();

                ItemStacks.Torch64Meta.setDisplayName(Strings.TorchNome);
                ItemStacks.Torch64.setItemMeta(ItemStacks.Torch64Meta);

                ItemStacks.RedstoneTorch64Meta.setDisplayName(Strings.TorchNome);
                ItemStacks.RedstoneTorch64.setItemMeta(ItemStacks.RedstoneTorch64Meta);

                ((Player) sender).getInventory().setItem(0, ItemStacks.Torch64);
                ((Player) sender).getInventory().setItem(1, ItemStacks.Torch64);
                ((Player) sender).getInventory().setItem(2, ItemStacks.Torch64);
                ((Player) sender).getInventory().setItem(3, ItemStacks.RedstoneTorch64);
                ((Player) sender).getInventory().setItem(4, ItemStacks.RedstoneTorch64);
                ((Player) sender).getInventory().setItem(5, ItemStacks.RedstoneTorch64);

                sender.sendMessage(Strings.prefix + "§6Kit Selecionado com Sucesso! §eKit: " + args[0]);
                return true;
            } else {
                sender.sendMessage(Strings.prefix + "§cKit inexistente!");
            }

        } else {

            if (Bukkit.getPlayer(args[1]) == null) {
                sender.sendMessage(Strings.prefix + Strings.naoOnline);
                return true;
            }

            if (args[0].equalsIgnoreCase("teatro")) {
                Bukkit.getPlayer(args[1]).getInventory().clear();

                ItemStacks.TeatEspadaDimaMeta.setDisplayName(Strings.TeatEspadaDimaNome);
                ItemStacks.TeatEspadaDimaMeta.addEnchant(Enchantment.DURABILITY, 1, true);
                ItemStacks.TeatEspadaDima.setItemMeta(ItemStacks.TeatEspadaDimaMeta);

                ItemStacks.TeatEspadaMeta.setDisplayName(Strings.TeatEspadaNome);
                ItemStacks.TeatEspada.setItemMeta(ItemStacks.TeatEspadaMeta);

                ItemStacks.TeatIsqueiroMeta.setDisplayName(Strings.TeatIsqueiroNome);
                ItemStacks.TeatIsqueiroMeta.addEnchant(Enchantment.DURABILITY, 64, true);
                ItemStacks.TeatIsqueiro.setItemMeta(ItemStacks.TeatIsqueiroMeta);

                ItemStacks.TeatBowMeta.setDisplayName(Strings.TeatBowNome);
                ItemStacks.TeatBow.setItemMeta(ItemStacks.TeatBowMeta);

                ItemStacks.TeatArrowMeta.setDisplayName(Strings.TeatArrowNome);
                ItemStacks.TeatArrow.setItemMeta(ItemStacks.TeatArrowMeta);

                ItemStacks.TeatPeitoMeta.setDisplayName(Strings.TeatPeitoNome);
                ItemStacks.TeatPeito.setItemMeta(ItemStacks.TeatPeitoMeta);

                ItemStacks.TeatCalcaMeta.setDisplayName(Strings.TeatCalcaNome);
                ItemStacks.TeatCalca.setItemMeta(ItemStacks.TeatCalcaMeta);

                ItemStacks.TeatBotaMeta.setDisplayName(Strings.TeatBotaNome);
                ItemStacks.TeatBota.setItemMeta(ItemStacks.TeatBotaMeta);

                Bukkit.getPlayer(args[1]).getInventory().setItem(7, ItemStacks.TeatIsqueiro);
                Bukkit.getPlayer(args[1]).getInventory().setItem(8, ItemStacks.TeatEspadaDima);

                Bukkit.getPlayer(args[1]).getInventory().setItem(0, ItemStacks.TeatEspada);
                Bukkit.getPlayer(args[1]).getInventory().setItem(1, ItemStacks.TeatBow);
                Bukkit.getPlayer(args[1]).getInventory().setItem(3, ItemStacks.TeatPeito);
                Bukkit.getPlayer(args[1]).getInventory().setItem(4, ItemStacks.TeatCalca);
                Bukkit.getPlayer(args[1]).getInventory().setItem(5, ItemStacks.TeatBota);
                Bukkit.getPlayer(args[1]).getInventory().setItem(13, ItemStacks.TeatArrow);

                sender.sendMessage(Strings.prefix + "§6Você um Kit para " + args[1] + " com Sucesso! §eKit: " + args[0]);
            } else if (args[0].equalsIgnoreCase("fullsopa")) {
                Bukkit.getPlayer(args[1]).getInventory().clear();

                ItemStacks.SopaMeta.setDisplayName(Strings.SopaNome);
                ItemStacks.Sopa.setItemMeta(ItemStacks.SopaMeta);

                ItemStacks.CogumeloMMeta.setDisplayName(Strings.RecraftNome);
                ItemStacks.CogumeloM.setItemMeta(ItemStacks.CogumeloMMeta);

                ItemStacks.CogumeloVMeta.setDisplayName(Strings.RecraftNome);
                ItemStacks.CogumeloV.setItemMeta(ItemStacks.CogumeloVMeta);

                ItemStacks.Pote64Meta.setDisplayName(Strings.RecraftNome);
                ItemStacks.Pote64.setItemMeta(ItemStacks.Pote64Meta);

                Bukkit.getPlayer(args[1]).getInventory().setItem(0, ItemStacks.Sopa);
                Bukkit.getPlayer(args[1]).getInventory().setItem(1, ItemStacks.Sopa);
                Bukkit.getPlayer(args[1]).getInventory().setItem(2, ItemStacks.Sopa);
                Bukkit.getPlayer(args[1]).getInventory().setItem(3, ItemStacks.Sopa);
                Bukkit.getPlayer(args[1]).getInventory().setItem(4, ItemStacks.Sopa);
                Bukkit.getPlayer(args[1]).getInventory().setItem(5, ItemStacks.Sopa);
                Bukkit.getPlayer(args[1]).getInventory().setItem(6, ItemStacks.Sopa);
                Bukkit.getPlayer(args[1]).getInventory().setItem(7, ItemStacks.Sopa);
                Bukkit.getPlayer(args[1]).getInventory().setItem(8, ItemStacks.Sopa);
                Bukkit.getPlayer(args[1]).getInventory().setItem(9, ItemStacks.Sopa);
                Bukkit.getPlayer(args[1]).getInventory().setItem(10, ItemStacks.Sopa);
                Bukkit.getPlayer(args[1]).getInventory().setItem(11, ItemStacks.Sopa);
                Bukkit.getPlayer(args[1]).getInventory().setItem(12, ItemStacks.Sopa);
                Bukkit.getPlayer(args[1]).getInventory().setItem(13, ItemStacks.CogumeloV);
                Bukkit.getPlayer(args[1]).getInventory().setItem(14, ItemStacks.CogumeloM);
                Bukkit.getPlayer(args[1]).getInventory().setItem(15, ItemStacks.Pote64);
                Bukkit.getPlayer(args[1]).getInventory().setItem(16, ItemStacks.Sopa);
                Bukkit.getPlayer(args[1]).getInventory().setItem(17, ItemStacks.Sopa);
                Bukkit.getPlayer(args[1]).getInventory().setItem(18, ItemStacks.Sopa);
                Bukkit.getPlayer(args[1]).getInventory().setItem(19, ItemStacks.Sopa);
                Bukkit.getPlayer(args[1]).getInventory().setItem(20, ItemStacks.Sopa);
                Bukkit.getPlayer(args[1]).getInventory().setItem(21, ItemStacks.Sopa);
                Bukkit.getPlayer(args[1]).getInventory().setItem(22, ItemStacks.Sopa);
                Bukkit.getPlayer(args[1]).getInventory().setItem(23, ItemStacks.Sopa);
                Bukkit.getPlayer(args[1]).getInventory().setItem(24, ItemStacks.Sopa);
                Bukkit.getPlayer(args[1]).getInventory().setItem(25, ItemStacks.Sopa);
                Bukkit.getPlayer(args[1]).getInventory().setItem(26, ItemStacks.Sopa);
                Bukkit.getPlayer(args[1]).getInventory().setItem(27, ItemStacks.Sopa);
                Bukkit.getPlayer(args[1]).getInventory().setItem(28, ItemStacks.Sopa);
                Bukkit.getPlayer(args[1]).getInventory().setItem(29, ItemStacks.Sopa);
                Bukkit.getPlayer(args[1]).getInventory().setItem(30, ItemStacks.Sopa);
                Bukkit.getPlayer(args[1]).getInventory().setItem(31, ItemStacks.Sopa);
                Bukkit.getPlayer(args[1]).getInventory().setItem(32, ItemStacks.Sopa);
                Bukkit.getPlayer(args[1]).getInventory().setItem(33, ItemStacks.Sopa);
                Bukkit.getPlayer(args[1]).getInventory().setItem(34, ItemStacks.Sopa);
                Bukkit.getPlayer(args[1]).getInventory().setItem(35, ItemStacks.Sopa);

                sender.sendMessage(Strings.prefix + "§6Você um Kit para " + args[1] + " com Sucesso! §eKit: " + args[0]);
                return true;
            } else if (args[0].equalsIgnoreCase("tocha")) {
                Bukkit.getPlayer(args[1]).getInventory().clear();

                ItemStacks.Torch64Meta.setDisplayName(Strings.TorchNome);
                ItemStacks.Torch64.setItemMeta(ItemStacks.Torch64Meta);

                ItemStacks.RedstoneTorch64Meta.setDisplayName(Strings.TorchNome);
                ItemStacks.RedstoneTorch64.setItemMeta(ItemStacks.RedstoneTorch64Meta);

                Bukkit.getPlayer(args[1]).getInventory().setItem(0, ItemStacks.Torch64);
                Bukkit.getPlayer(args[1]).getInventory().setItem(1, ItemStacks.Torch64);
                Bukkit.getPlayer(args[1]).getInventory().setItem(2, ItemStacks.Torch64);
                Bukkit.getPlayer(args[1]).getInventory().setItem(3, ItemStacks.RedstoneTorch64);
                Bukkit.getPlayer(args[1]).getInventory().setItem(4, ItemStacks.RedstoneTorch64);
                Bukkit.getPlayer(args[1]).getInventory().setItem(5, ItemStacks.RedstoneTorch64);

                sender.sendMessage(Strings.prefix + "§6Você um Kit para " + args[1] + " com Sucesso! §eKit: " + args[0]);
                return true;
            } else {
                sender.sendMessage(Strings.prefix + "§cKit inexistente!");
            }

        }

        return false;
    }

}
