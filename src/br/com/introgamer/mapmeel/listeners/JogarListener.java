package br.com.introgamer.mapmeel.listeners;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

import br.com.introgamer.mapmeel.Methods;
import br.com.introgamer.mapmeel.variables.Jogadores;
import br.com.introgamer.mapmeel.variables.Strings;
import br.com.introgamer.mapmeel.variables.Variables;

import java.util.Objects;

public class JogarListener implements Listener {

    @EventHandler
    public void onInventoryClick(InventoryClickEvent e) {
        try {
            if (Objects.equals(e.getInventory().getName(), Strings.invWarpList)) {
                Player p = (Player) e.getWhoClicked();

                e.setCancelled(true);

                if (Variables.MeelBlock) {
                    if (p.getName().equalsIgnoreCase(Jogadores.Meel)) {
                        p.sendMessage(Strings.prefix + Strings.semPerm);
                        return;
                    }
                    if (Bukkit.getPlayer(Jogadores.Meel) != null) {
                        p.closeInventory();
                        p.sendMessage(Strings.prefix + "§cO /jogar é proibido quando a Meel está online!");
                        return;
                    }

                }

                if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§lLobby-1")) {
                    Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "jogo false");
                    Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "scoremanager setlevel Lobby-1");
                    Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "spawnpoint @a -1670 77 1521");
                    Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "avisoconsole " + e.getWhoClicked().getName() + " Entrou no Lobby-1! §a(/jogar)");
                    Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "warp lobby1 " + e.getWhoClicked().getName());
                    p.sendTitle(ChatColor.GOLD + "" + ChatColor.BOLD + "Teleportado para o Lobby-1!", "§7");
                } else if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§lLobby-2")) {
                    Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "jogo false");
                    Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "scoremanager setlevel Lobby-2");
                    Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "spawnpoint @a -1657 67 1");
                    Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "avisoconsole " + e.getWhoClicked().getName() + " Entrou no Lobby-2! §a(/jogar)");
                    Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "warp lobby2 " + e.getWhoClicked().getName());
                    p.sendTitle(ChatColor.GOLD + "" + ChatColor.BOLD + "Teleportado para o Lobby-2!", "§7");
                } else if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§lLobby-3")) {
                    Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "jogo false");
                    Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "scoremanager setlevel Lobby-3");
                    Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "spawnpoint @a -946 67 634");
                    Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "avisoconsole " + e.getWhoClicked().getName() + " Entrou no Lobby-3! §a(/jogar)");
                    Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "warp lobby3 " + e.getWhoClicked().getName());
                    p.sendTitle(ChatColor.GOLD + "" + ChatColor.BOLD + "Teleportado para o Lobby-3!", "§7");
                } else if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§lLobby-4")) {
                    Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "jogo false");
                    Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "scoremanager setlevel Lobby-4");
                    Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "spawnpoint @a -2281 86 1024");
                    Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "avisoconsole " + e.getWhoClicked().getName() + " Entrou no Lobby-4! §a(/jogar)");
                    Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "warp lobby4 " + e.getWhoClicked().getName());
                    p.sendTitle(ChatColor.GOLD + "" + ChatColor.BOLD + "Teleportado para o Lobby-4!", "§7");
                } else if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§l1A")) {
                    Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "jogo true");
                    Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "scoremanager setlevel 1A");
                    Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "spawnpoint @a -1671 81 1086");
                    Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "avisoconsole " + e.getWhoClicked().getName() + " Entrou no LEVEL: 1A §a(/jogar)");
                    Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "warp 1a " + e.getWhoClicked().getName());
                    p.sendTitle(ChatColor.GOLD + "" + ChatColor.BOLD + "Teleportado para o level: 1A!", "§7");
                } else if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§l1B")) {
                    Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "jogo true");
                    Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "scoremanager setlevel 1B");
                    Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "spawnpoint @a -1402 80 1520");
                    Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "avisoconsole " + e.getWhoClicked().getName() + " Entrou no LEVEL: 1B §a(/jogar)");
                    Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "warp 1b " + e.getWhoClicked().getName());
                    p.sendTitle(ChatColor.GOLD + "" + ChatColor.BOLD + "Teleportado para o level: 1B!", "§7");
                } else if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§l1C")) {
                    Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "jogo true");
                    Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "scoremanager setlevel 1C");
                    Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "spawnpoint @a -1665 74 1892");
                    Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "avisoconsole " + e.getWhoClicked().getName() + " Entrou no LEVEL: 1C §a(/jogar)");
                    Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "warp 1c " + e.getWhoClicked().getName());
                    p.sendTitle(ChatColor.GOLD + "" + ChatColor.BOLD + "Teleportado para o level: 1C!", "§7");
                } else if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§l1D")) {
                    Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "jogo true");
                    Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "scoremanager setlevel 1D");
                    Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "spawnpoint @a -2105 78 1522");
                    Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "avisoconsole " + e.getWhoClicked().getName() + " Entrou no LEVEL: 1D §a(/jogar)");
                    Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "warp 1d " + e.getWhoClicked().getName());
                    p.sendTitle(ChatColor.GOLD + "" + ChatColor.BOLD + "Teleportado para o level: 1D!", "§7");
                } else if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§l2A")) {
                    Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "jogo true");
                    Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "scoremanager setlevel 2A");
                    Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "spawnpoint @a -1166 67 -4");
                    Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "avisoconsole " + e.getWhoClicked().getName() + " Entrou no LEVEL: 2A §a(/jogar)");
                    Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "warp 2a " + e.getWhoClicked().getName());
                    p.sendTitle(ChatColor.GOLD + "" + ChatColor.BOLD + "Teleportado para o level: 2A!", "§7");
                } else if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§l2B")) {
                    Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "jogo true");
                    Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "scoremanager setlevel 2B");
                    Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "spawnpoint @a -1677 69 424");
                    Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "avisoconsole " + e.getWhoClicked().getName() + " Entrou no LEVEL: 2B §a(/jogar)");
                    Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "warp 2b " + e.getWhoClicked().getName());
                    p.sendTitle(ChatColor.GOLD + "" + ChatColor.BOLD + "Teleportado para o level: 2B!", "§7");
                } else if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§l2C")) {
                    Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "jogo true");
                    Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "scoremanager setlevel 2C");
                    Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "spawnpoint @a -1992 66 -3");
                    Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "avisoconsole " + e.getWhoClicked().getName() + " Entrou no LEVEL: 2C §a(/jogar)");
                    Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "warp 2c " + e.getWhoClicked().getName());
                    p.sendTitle(ChatColor.GOLD + "" + ChatColor.BOLD + "Teleportado para o level: 2C!", "§7");
                } else if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§l2D")) {
                    Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "jogo true");
                    Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "scoremanager setlevel 2D");
                    Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "spawnpoint @a -1658 69 -510");
                    Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "avisoconsole " + e.getWhoClicked().getName() + " Entrou no LEVEL: 2D §a(/jogar)");
                    Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "warp 2d " + e.getWhoClicked().getName());
                    p.sendTitle(ChatColor.GOLD + "" + ChatColor.BOLD + "Teleportado para o level: 2D!", "§7");
                } else if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§l3A")) {
                    Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "jogo true");
                    Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "scoremanager setlevel 3A");
                    Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "spawnpoint @a -1414 77 645");
                    Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "avisoconsole " + e.getWhoClicked().getName() + " Entrou no LEVEL: 3A §a(/jogar)");
                    Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "warp 3a " + e.getWhoClicked().getName());
                    p.sendTitle(ChatColor.GOLD + "" + ChatColor.BOLD + "Teleportado para o level: 3A!", "§7");
                } else if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§l3B")) {
                    Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "jogo true");
                    Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "scoremanager setlevel 3B");
                    Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "spawnpoint @a -1351 92 716");
                    Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "avisoconsole " + e.getWhoClicked().getName() + " Entrou no LEVEL: 3B §a(/jogar)");
                    Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "warp 3b " + e.getWhoClicked().getName());
                    p.sendTitle(ChatColor.GOLD + "" + ChatColor.BOLD + "Teleportado para o level: 3B!", "§7");
                } else if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§l3C")) {
                    Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "jogo true");
                    Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "scoremanager setlevel 3C");
                    Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "spawnpoint @a -675 68 395");
                    Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "avisoconsole " + e.getWhoClicked().getName() + " Entrou no LEVEL: 3C §a(/jogar)");
                    Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "warp 3c " + e.getWhoClicked().getName());
                    p.sendTitle(ChatColor.GOLD + "" + ChatColor.BOLD + "Teleportado para o level: 3C!", "§7");
                } else if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§l3D")) {
                    Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "modoeditor true");
                    Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "avisoconsole Eu sei que o ModoEditor foi Ativado! Isto e normal para a Fase 3D!");
                    Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "kit tocha " + e.getWhoClicked().getName());
                    Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "jogo true");
                    Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "scoremanager setlevel 3D");
                    Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "spawnpoint @a -216 87 249");
                    Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "avisoconsole " + e.getWhoClicked().getName() + " Entrou no LEVEL: 3D §a(/jogar)");
                    Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "warp 3d " + e.getWhoClicked().getName());
                    p.setGameMode(GameMode.SURVIVAL);
                    p.sendTitle(ChatColor.GOLD + "" + ChatColor.BOLD + "Teleportado para o level: 3D!", "§7");
                } else if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§l4A")) {
                    Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "jogo true");
                    Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "scoremanager setlevel 4A");
                    Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "spawnpoint @a -2720 107 1030");
                    Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "avisoconsole " + e.getWhoClicked().getName() + " Entrou no LEVEL: 4A §a(/jogar)");
                    Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "warp 4a " + e.getWhoClicked().getName());
                    p.sendTitle(ChatColor.GOLD + "" + ChatColor.BOLD + "Teleportado para o level: 4A!", "§7");
                } else if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§l4B")) {
                    Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "jogo true");
                    Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "scoremanager setlevel 4B");
                    Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "spawnpoint @a -2278 92 1425");
                    Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "avisoconsole " + e.getWhoClicked().getName() + " Entrou no LEVEL: 4B §a(/jogar)");
                    Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "warp 4b " + e.getWhoClicked().getName());
                    p.sendTitle(ChatColor.GOLD + "" + ChatColor.BOLD + "Teleportado para o level: 4B!", "§7");
                } else if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§l4C")) {
                    Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "jogo true");
                    Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "scoremanager setlevel 4C");
                    Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "spawnpoint @a -2528 101 660");
                    Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "avisoconsole " + e.getWhoClicked().getName() + " Entrou no LEVEL: 4C §a(/jogar)");
                    Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "warp 4c " + e.getWhoClicked().getName());
                    p.sendTitle(ChatColor.GOLD + "" + ChatColor.BOLD + "Teleportado para o level: 4C!", "§7");
                } else if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§l4D")) {
                    Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "jogo true");
                    Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "scoremanager setlevel 4D");
                    Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "spawnpoint @a -1968 90 1023");
                    Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "avisoconsole " + e.getWhoClicked().getName() + " Entrou no LEVEL: 4D §a(/jogar)");
                    Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "warp 4d " + e.getWhoClicked().getName());
                    p.sendTitle(ChatColor.GOLD + "" + ChatColor.BOLD + "Teleportado para o level: 4D!", "§7");
                } else if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§lEasterEgg-1")) {
                    Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "jogo true");
                    Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "scoremanager setlevel EasterEgg-1");
                    Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "spawnpoint @a -2181 67 636");
                    Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "avisoconsole " + e.getWhoClicked().getName() + " Entrou no EasterEgg(#1)! §a(/jogar)");
                    Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "warp easteregg1 " + e.getWhoClicked().getName());
                    p.sendTitle(ChatColor.GOLD + "" + ChatColor.BOLD + "Teleportado para o EG-1!", "§7");
                } else if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§lEasterEgg-2")) {
                    Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "jogo true");
                    Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "scoremanager setlevel EasterEgg-2");
                    Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "spawnpoint @a -474 63 613");
                    Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "avisoconsole " + e.getWhoClicked().getName() + " Entrou no EasterEgg(#2)! §a(/jogar)");
                    Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "warp easteregg2 " + e.getWhoClicked().getName());
                    p.sendTitle(ChatColor.GOLD + "" + ChatColor.BOLD + "Teleportado para o EG-2!", "§7");
                } else if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§lEasterEgg-3")) {
                    Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "jogo true");
                    Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "scoremanager setlevel EasterEgg-3");
                    Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "spawnpoint @a -2238 28 -59");
                    Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "avisoconsole " + e.getWhoClicked().getName() + " Entrou no EasterEgg(#3)! §a(/jogar)");
                    Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "warp easteregg3 " + e.getWhoClicked().getName());
                    p.sendTitle(ChatColor.GOLD + "" + ChatColor.BOLD + "Teleportado para o EG-3!", "§7");
                } else if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§lEasterEgg-4")) {
                    Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "jogo true");
                    Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "scoremanager setlevel EasterEgg-4");
                    Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "spawnpoint @a -458 213 317");
                    Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "avisoconsole " + e.getWhoClicked().getName() + " Entrou no EasterEgg(#4)! §a(/jogar)");
                    Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "warp easteregg4 " + e.getWhoClicked().getName());
                    p.sendTitle(ChatColor.GOLD + "" + ChatColor.BOLD + "Teleportado para o EG-4!", "§7");
                } else if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§lLobbyPrincipal")) {
                    Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "jogo false");
                    Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "scoremanager setlevel LobbyPrincipal");
                    Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "spawnpoint @a -1662 63 639");
                    Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "warp lobby " + e.getWhoClicked().getName());
                    p.sendTitle(ChatColor.GOLD + "" + ChatColor.BOLD + "Teleportado para o Lobby!", "§7");
                } else if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§lPlataformaFinal")) {
                    Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "jogo false");
                    Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "scoremanager setlevel PlataformaFinal");
                    Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "spawnpoint @a -8 94 5");
                    Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "avisoconsole " + e.getWhoClicked().getName() + " Entrou no LobbyPrincipal! §a(/jogar)");
                    Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "warp plataforma" + e.getWhoClicked().getName());
                    p.sendTitle(ChatColor.GOLD + "" + ChatColor.BOLD + "Teleportado para a PF!", "§7");
                } else if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(Strings.Mapa)) {
                    Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "avisoconsole " + e.getWhoClicked().getName() + " Está resetando o Mapa! §a(/jogar)");
                    Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "scoremanager setlevel Resetando...");
                    Methods.Reset();
                } else {
                    return;
                }

                e.getWhoClicked().closeInventory();
            }

        } catch (Exception ignored) {
        }

    }

}
