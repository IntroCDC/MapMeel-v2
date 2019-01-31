package br.com.introgamer.mapmeel.commands;

import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import br.com.introgamer.mapmeel.variables.Inventorys;
import br.com.introgamer.mapmeel.variables.ItemStacks;
import br.com.introgamer.mapmeel.variables.Jogadores;
import br.com.introgamer.mapmeel.variables.Strings;
import br.com.introgamer.mapmeel.variables.Variables;

public class CommandJogar implements CommandExecutor {

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
        if (!(sender instanceof Player)) {
            sender.sendMessage(Strings.prefix + Strings.inGame);
            return true;
        }

        if (Bukkit.getPlayer(Jogadores.Meel) != null) {
            sender.sendMessage(Strings.prefix + "§cUSE O /WARP!");
            return true;
        }

        ArrayList<String> LoreOn = new ArrayList<>();
        LoreOn.add("§aStatus: §2ON");
        LoreOn.add("§7§o(Clique para Jogar)");

        ArrayList<String> LoreMapa = new ArrayList<>();
        LoreMapa.add("§7§oMapa de Aniversário para " + Jogadores.Meel);
        LoreMapa.add("§7§oBy: " + Jogadores.Intro);
        LoreMapa.add("§r");
        LoreMapa.add("§7§o(Clique aqui para Resetar o Mapa!)");

        Inventorys.invWarps.clear();

        ItemStacks.LobbyMeta.setDisplayName("§lLobby-1");
        ItemStacks.LobbyMeta.setLore(LoreOn);
        ItemStacks.Lobby.setItemMeta(ItemStacks.LobbyMeta);

        Inventorys.invWarps.setItem(0, ItemStacks.Lobby);

        ItemStacks.LobbyMeta.setDisplayName("§lLobby-2");
        ItemStacks.Lobby.setItemMeta(ItemStacks.LobbyMeta);

        Inventorys.invWarps.setItem(2, ItemStacks.Lobby);

        ItemStacks.LobbyMeta.setDisplayName("§lLobby-3");
        ItemStacks.Lobby.setItemMeta(ItemStacks.LobbyMeta);

        Inventorys.invWarps.setItem(6, ItemStacks.Lobby);

        ItemStacks.LobbyMeta.setDisplayName("§lLobby-4");
        ItemStacks.Lobby.setItemMeta(ItemStacks.LobbyMeta);

        Inventorys.invWarps.setItem(8, ItemStacks.Lobby);

        ItemStacks.Level1Meta.setDisplayName("§l1A");
        ItemStacks.Level1Meta.setLore(LoreOn);
        ItemStacks.Level1.setItemMeta(ItemStacks.Level1Meta);

        Inventorys.invWarps.setItem(9, ItemStacks.Level1);

        ItemStacks.Level1Meta.setDisplayName("§l1B");
        ItemStacks.Level1.setItemMeta(ItemStacks.Level1Meta);

        Inventorys.invWarps.setItem(18, ItemStacks.Level1);

        ItemStacks.Level1Meta.setDisplayName("§l1C");
        ItemStacks.Level1.setItemMeta(ItemStacks.Level1Meta);

        Inventorys.invWarps.setItem(27, ItemStacks.Level1);

        ItemStacks.Level1Meta.setDisplayName("§l1D");
        ItemStacks.Level1.setItemMeta(ItemStacks.Level1Meta);

        Inventorys.invWarps.setItem(36, ItemStacks.Level1);

        ItemStacks.Level2Meta.setDisplayName("§l2A");
        ItemStacks.Level2Meta.setLore(LoreOn);
        ItemStacks.Level2.setItemMeta(ItemStacks.Level2Meta);

        Inventorys.invWarps.setItem(11, ItemStacks.Level2);

        ItemStacks.Level2Meta.setDisplayName("§l2B");
        ItemStacks.Level2.setItemMeta(ItemStacks.Level2Meta);

        Inventorys.invWarps.setItem(20, ItemStacks.Level2);

        ItemStacks.Level2Meta.setDisplayName("§l2C");
        ItemStacks.Level2.setItemMeta(ItemStacks.Level2Meta);

        Inventorys.invWarps.setItem(29, ItemStacks.Level2);

        ItemStacks.Level2Meta.setDisplayName("§l2D");
        ItemStacks.Level2.setItemMeta(ItemStacks.Level2Meta);

        Inventorys.invWarps.setItem(38, ItemStacks.Level2);

        ItemStacks.Level3Meta.setDisplayName("§l3A");
        ItemStacks.Level3Meta.setLore(LoreOn);
        ItemStacks.Level3.setItemMeta(ItemStacks.Level3Meta);

        Inventorys.invWarps.setItem(15, ItemStacks.Level3);

        ItemStacks.Level3Meta.setDisplayName("§l3B");
        ItemStacks.Level3.setItemMeta(ItemStacks.Level3Meta);

        Inventorys.invWarps.setItem(24, ItemStacks.Level3);

        ItemStacks.Level3Meta.setDisplayName("§l3C");
        ItemStacks.Level3.setItemMeta(ItemStacks.Level3Meta);

        Inventorys.invWarps.setItem(33, ItemStacks.Level3);

        ItemStacks.Level3Meta.setDisplayName("§l3D");
        ItemStacks.Level3.setItemMeta(ItemStacks.Level3Meta);

        Inventorys.invWarps.setItem(42, ItemStacks.Level3);

        ItemStacks.Level4Meta.setDisplayName("§l4A");
        ItemStacks.Level4Meta.setLore(LoreOn);
        ItemStacks.Level4.setItemMeta(ItemStacks.Level4Meta);

        Inventorys.invWarps.setItem(17, ItemStacks.Level4);

        ItemStacks.Level4Meta.setDisplayName("§l4B");
        ItemStacks.Level4.setItemMeta(ItemStacks.Level4Meta);

        Inventorys.invWarps.setItem(26, ItemStacks.Level4);

        ItemStacks.Level4Meta.setDisplayName("§l4C");
        ItemStacks.Level4.setItemMeta(ItemStacks.Level4Meta);

        Inventorys.invWarps.setItem(35, ItemStacks.Level4);

        ItemStacks.Level4Meta.setDisplayName("§l4D");
        ItemStacks.Level4.setItemMeta(ItemStacks.Level4Meta);

        Inventorys.invWarps.setItem(44, ItemStacks.Level4);

        ItemStacks.LobbyPadraoMeta.setDisplayName("§lLobbyPrincipal");
        ItemStacks.LobbyPadraoMeta.setLore(LoreOn);
        ItemStacks.LobbyPadrao.setItemMeta(ItemStacks.LobbyPadraoMeta);

        Inventorys.invWarps.setItem(22, ItemStacks.LobbyPadrao);

        ItemStacks.LobbyPadraoMeta.setDisplayName("§lPlataformaFinal");
        ItemStacks.LobbyPadraoMeta.setLore(LoreOn);
        ItemStacks.LobbyPadrao.setItemMeta(ItemStacks.LobbyPadraoMeta);

        Inventorys.invWarps.setItem(31, ItemStacks.LobbyPadrao);

        ItemStacks.EasterEggMeta.setDisplayName("§lEasterEgg-1");
        ItemStacks.EasterEggMeta.setLore(LoreOn);
        ItemStacks.EasterEgg.setItemMeta(ItemStacks.EasterEggMeta);

        Inventorys.invWarps.setItem(46, ItemStacks.EasterEgg);

        ItemStacks.EasterEggMeta.setDisplayName("§lEasterEgg-2");
        ItemStacks.EasterEgg.setItemMeta(ItemStacks.EasterEggMeta);

        Inventorys.invWarps.setItem(48, ItemStacks.EasterEgg);

        ItemStacks.EasterEggMeta.setDisplayName("§lEasterEgg-3");
        ItemStacks.EasterEggMeta.setLore(LoreOn);
        ItemStacks.EasterEgg.setItemMeta(ItemStacks.EasterEggMeta);

        Inventorys.invWarps.setItem(50, ItemStacks.EasterEgg);

        ItemStacks.EasterEggMeta.setDisplayName("§lEasterEgg-4");
        ItemStacks.EasterEggMeta.setLore(LoreOn);
        ItemStacks.EasterEgg.setItemMeta(ItemStacks.EasterEggMeta);

        Inventorys.invWarps.setItem(52, ItemStacks.EasterEgg);

        ItemStacks.MapaMeta.setDisplayName(Strings.Mapa);
        ItemStacks.MapaMeta.setLore(LoreMapa);
        ItemStacks.Mapa.setItemMeta(ItemStacks.MapaMeta);

        Inventorys.invWarps.setItem(4, ItemStacks.Mapa);

        ((Player) sender).openInventory(Inventorys.invWarps);
        return true;
    }

}
