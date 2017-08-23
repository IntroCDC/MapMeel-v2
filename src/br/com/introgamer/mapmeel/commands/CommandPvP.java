package br.com.introgamer.mapmeel.commands;

import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import br.com.introgamer.mapmeel.variables.Strings;

public class CommandPvP implements CommandExecutor {

    @Override
    public boolean onCommand(final CommandSender sender, final Command command, final String label, final String[] args) {

        if (!(sender instanceof Player)) {
            sender.sendMessage(Strings.prefix + Strings.inGame);
            return true;
        }

        final ItemStack Sopa = new ItemStack(Material.MUSHROOM_SOUP);
        final ItemMeta SopaMeta = Sopa.getItemMeta();
        SopaMeta.setDisplayName("§6§lSopa");
        Sopa.setItemMeta(SopaMeta);

        final ItemStack Espada = new ItemStack(Material.DIAMOND_SWORD);
        final ItemMeta EspadaMeta = Espada.getItemMeta();
        EspadaMeta.setDisplayName("§6§lEspada");
        EspadaMeta.addEnchant(Enchantment.DAMAGE_ALL, 1, true);
        Espada.setItemMeta(EspadaMeta);

        final ItemStack Peito = new ItemStack(Material.IRON_CHESTPLATE);
        final ItemMeta PeitoMeta = Peito.getItemMeta();
        PeitoMeta.setDisplayName("§6§lPeito");
        Peito.setItemMeta(PeitoMeta);

        final ItemStack Capa = new ItemStack(Material.IRON_HELMET);
        final ItemMeta CapaMeta = Capa.getItemMeta();
        CapaMeta.setDisplayName("§6§lCapa");
        Capa.setItemMeta(CapaMeta);

        final ItemStack Calca = new ItemStack(Material.IRON_LEGGINGS);
        final ItemMeta CalcaMeta = Calca.getItemMeta();
        CalcaMeta.setDisplayName("§6§lCalca");
        Calca.setItemMeta(CalcaMeta);

        final ItemStack Bota = new ItemStack(Material.IRON_BOOTS);
        final ItemMeta BotaMeta = Bota.getItemMeta();
        BotaMeta.setDisplayName("§6§lBota");
        Bota.setItemMeta(BotaMeta);

        final ItemStack CoguV = new ItemStack(Material.RED_MUSHROOM, 64);
        final ItemMeta CoguVMeta = CoguV.getItemMeta();
        CoguVMeta.setDisplayName("§6§lCogu");
        CoguV.setItemMeta(CoguVMeta);

        final ItemStack CoguM = new ItemStack(Material.BROWN_MUSHROOM, 64);
        final ItemMeta CoguMMeta = CoguM.getItemMeta();
        CoguMMeta.setDisplayName("§6§lCogu");
        CoguM.setItemMeta(CoguMMeta);

        final ItemStack Pote = new ItemStack(Material.BOWL, 64);
        final ItemMeta PoteMeta = Pote.getItemMeta();
        PoteMeta.setDisplayName("§6§lPote");
        Pote.setItemMeta(PoteMeta);

        ((Player) sender).setHealth(20);
        ((Player) sender).setFoodLevel(20);
        ((Player) sender).setGameMode(GameMode.ADVENTURE);

        ((Player) sender).getInventory().clear();

        ((Player) sender).getInventory().setHelmet(Capa);
        ((Player) sender).getInventory().setChestplate(Peito);
        ((Player) sender).getInventory().setLeggings(Calca);
        ((Player) sender).getInventory().setBoots(Bota);

        ((Player) sender).getInventory().setItem(0, Espada);
        ((Player) sender).getInventory().setItem(1, Sopa);
        ((Player) sender).getInventory().setItem(2, Sopa);
        ((Player) sender).getInventory().setItem(3, Sopa);
        ((Player) sender).getInventory().setItem(4, Sopa);
        ((Player) sender).getInventory().setItem(5, Sopa);
        ((Player) sender).getInventory().setItem(6, Sopa);
        ((Player) sender).getInventory().setItem(7, Sopa);
        ((Player) sender).getInventory().setItem(8, Sopa);
        ((Player) sender).getInventory().setItem(9, Sopa);
        ((Player) sender).getInventory().setItem(10, Sopa);
        ((Player) sender).getInventory().setItem(11, Sopa);
        ((Player) sender).getInventory().setItem(12, Sopa);
        ((Player) sender).getInventory().setItem(13, CoguV);
        ((Player) sender).getInventory().setItem(14, CoguM);
        ((Player) sender).getInventory().setItem(15, Pote);
        ((Player) sender).getInventory().setItem(16, Sopa);
        ((Player) sender).getInventory().setItem(17, Sopa);
        ((Player) sender).getInventory().setItem(18, Sopa);
        ((Player) sender).getInventory().setItem(19, Sopa);
        ((Player) sender).getInventory().setItem(20, Sopa);
        ((Player) sender).getInventory().setItem(21, Sopa);
        ((Player) sender).getInventory().setItem(22, Sopa);
        ((Player) sender).getInventory().setItem(23, Sopa);
        ((Player) sender).getInventory().setItem(24, Sopa);
        ((Player) sender).getInventory().setItem(25, Sopa);
        ((Player) sender).getInventory().setItem(26, Sopa);
        ((Player) sender).getInventory().setItem(27, Sopa);
        ((Player) sender).getInventory().setItem(28, Sopa);
        ((Player) sender).getInventory().setItem(29, Sopa);
        ((Player) sender).getInventory().setItem(30, Sopa);
        ((Player) sender).getInventory().setItem(31, Sopa);
        ((Player) sender).getInventory().setItem(32, Sopa);
        ((Player) sender).getInventory().setItem(33, Sopa);
        ((Player) sender).getInventory().setItem(34, Sopa);
        ((Player) sender).getInventory().setItem(35, Sopa);

        sender.sendMessage(Strings.prefix + "§2§lKit escolhido!");

        return false;
    }

}
