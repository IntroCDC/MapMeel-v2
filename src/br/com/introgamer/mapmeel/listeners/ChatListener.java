package br.com.introgamer.mapmeel.listeners;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

import br.com.introgamer.mapmeel.variables.Jogadores;
import br.com.introgamer.mapmeel.variables.Strings;
import br.com.introgamer.mapmeel.variables.Variables;

public class ChatListener implements Listener {

    @EventHandler
    public void onChat(final AsyncPlayerChatEvent e) {
        if (Variables.PassouDoTesteActive) {
            if (e.getMessage().contains("oi")) {
                if (!Variables.NaoPassouDoTeste.contains(e.getPlayer().getName())) {
                    e.getPlayer().sendMessage(Strings.prefix + "§cVocê já passou o teste!");
                    e.setCancelled(true);
                    return;
                }

                Variables.NaoPassouDoTeste.remove(e.getPlayer().getName());
                e.getPlayer().sendMessage(Strings.prefix + "§aVocê passou o teste!");
                e.setCancelled(true);
            }
            if (e.getMessage().contains("OI")) {
                if (!Variables.NaoPassouDoTeste.contains(e.getPlayer().getName())) {
                    e.getPlayer().sendMessage(Strings.prefix + "§cVocê já passou o teste!");
                    e.setCancelled(true);
                    return;
                }

                Variables.NaoPassouDoTeste.remove(e.getPlayer().getName());
                e.getPlayer().sendMessage(Strings.prefix + "§aVocê passou o teste!");
                e.setCancelled(true);
            }
            if (e.getMessage().contains("oI")) {
                if (!Variables.NaoPassouDoTeste.contains(e.getPlayer().getName())) {
                    e.getPlayer().sendMessage(Strings.prefix + "§cVocê já passou o teste!");
                    e.setCancelled(true);
                    return;
                }

                Variables.NaoPassouDoTeste.remove(e.getPlayer().getName());
                e.getPlayer().sendMessage(Strings.prefix + "§aVocê passou o teste!");
                e.setCancelled(true);
            }
            if (e.getMessage().contains("Oi")) {
                if (!Variables.NaoPassouDoTeste.contains(e.getPlayer().getName())) {
                    e.getPlayer().sendMessage(Strings.prefix + "§cVocê já passou o teste!");
                    e.setCancelled(true);
                    return;
                }

                Variables.NaoPassouDoTeste.remove(e.getPlayer().getName());
                e.getPlayer().sendMessage(Strings.prefix + "§aVocê passou o teste!");
                e.setCancelled(true);
            }
        }

        if (Variables.ChatPrivate.contains(e.getPlayer().getName())) {
            for (final Player p : Bukkit.getOnlinePlayers()) {
                if (Variables.ChatPrivate.contains(p.getName())) {
                    p.sendMessage(
                        "§6§l[ChatPV] §f" + e
                                .getPlayer()
                                .getName() + ": " + e.getMessage().replace("&1", "§1").replace("&2", "§2").replace("&3", "§3").replace("&4", "§4").replace("&5", "§5").replace("&6", "§6").replace("&7", "§7").replace("&8", "§8").replace("&9", "§9").replace("&0", "§0").replace("&a", "§a").replace("&b", "§b").replace("&c", "§c").replace("&d", "§d").replace("&e", "§e").replace("&f", "§f").replace("&l", "§l").replace("&o", "§o").replace("&k", "§k").replace("&m", "§m").replace("&n", "§n").replace(
                                    "&r",
                                    "§r"));
                }
            }
            e.setCancelled(true);
        }

        if (e.getPlayer().getName().equalsIgnoreCase(Jogadores.Meel)) {
            if (Jogadores.FakePlayerMeel) {
                e.setFormat(
                    Jogadores.CustonNameMeel + Jogadores.FakeNickMeel + " §f§l>" + Jogadores.CustonNameMeel + "> §f" + e
                            .getMessage()
                            .replace("&1", "§1")
                            .replace("&2", "§2")
                            .replace("&3", "§3")
                            .replace("&4", "§4")
                            .replace("&5", "§5")
                            .replace("&6", "§6")
                            .replace("&7", "§7")
                            .replace("&8", "§8")
                            .replace("&9", "§9")
                            .replace("&0", "§0")
                            .replace("&a", "§a")
                            .replace("&b", "§b")
                            .replace("&c", "§c")
                            .replace("&d", "§d")
                            .replace("&e", "§e")
                            .replace("&f", "§f")
                            .replace("&l", "§l")
                            .replace("&o", "§o")
                            .replace("&k", "§k")
                            .replace("&m", "§m")
                            .replace("&n", "§n")
                            .replace("&r", "§r"));
            } else {
                e.setFormat(
                    Jogadores.CustonNameMeel + Jogadores.Meel + " §f§l>" + Jogadores.CustonNameMeel + "> §f" + e
                            .getMessage()
                            .replace("&1", "§1")
                            .replace("&2", "§2")
                            .replace("&3", "§3")
                            .replace("&4", "§4")
                            .replace("&5", "§5")
                            .replace("&6", "§6")
                            .replace("&7", "§7")
                            .replace("&8", "§8")
                            .replace("&9", "§9")
                            .replace("&0", "§0")
                            .replace("&a", "§a")
                            .replace("&b", "§b")
                            .replace("&c", "§c")
                            .replace("&d", "§d")
                            .replace("&e", "§e")
                            .replace("&f", "§f")
                            .replace("&l", "§l")
                            .replace("&o", "§o")
                            .replace("&k", "§k")
                            .replace("&m", "§m")
                            .replace("&n", "§n")
                            .replace("&r", "§r"));
            }

        } else if (e.getPlayer().getName().equalsIgnoreCase(Jogadores.Intro)) {
            if (Jogadores.FakePlayerIntro) {
                e.setFormat(
                    Jogadores.CustonNameIntro + Jogadores.FakeNickIntro + " §f§l>" + Jogadores.CustonNameIntro + "> §f" + e
                            .getMessage()
                            .replace("&1", "§1")
                            .replace("&2", "§2")
                            .replace("&3", "§3")
                            .replace("&4", "§4")
                            .replace("&5", "§5")
                            .replace("&6", "§6")
                            .replace("&7", "§7")
                            .replace("&8", "§8")
                            .replace("&9", "§9")
                            .replace("&0", "§0")
                            .replace("&a", "§a")
                            .replace("&b", "§b")
                            .replace("&c", "§c")
                            .replace("&d", "§d")
                            .replace("&e", "§e")
                            .replace("&f", "§f")
                            .replace("&l", "§l")
                            .replace("&o", "§o")
                            .replace("&k", "§k")
                            .replace("&m", "§m")
                            .replace("&n", "§n")
                            .replace("&r", "§r"));
            } else {
                e.setFormat(
                    Jogadores.CustonNameIntro + Jogadores.Intro + " §f§l>" + Jogadores.CustonNameIntro + "> §f" + e
                            .getMessage()
                            .replace("&1", "§1")
                            .replace("&2", "§2")
                            .replace("&3", "§3")
                            .replace("&4", "§4")
                            .replace("&5", "§5")
                            .replace("&6", "§6")
                            .replace("&7", "§7")
                            .replace("&8", "§8")
                            .replace("&9", "§9")
                            .replace("&0", "§0")
                            .replace("&a", "§a")
                            .replace("&b", "§b")
                            .replace("&c", "§c")
                            .replace("&d", "§d")
                            .replace("&e", "§e")
                            .replace("&f", "§f")
                            .replace("&l", "§l")
                            .replace("&o", "§o")
                            .replace("&k", "§k")
                            .replace("&m", "§m")
                            .replace("&n", "§n")
                            .replace("&r", "§r"));
            }
        } else if (e.getPlayer().getName().equalsIgnoreCase(Jogadores.Diego)) {
            if (Jogadores.FakePlayerDiego) {
                e.setFormat(
                    Jogadores.CustonNameDiego + Jogadores.FakeNickDiego + " §f§l>" + Jogadores.CustonNameDiego + "> §f" + e
                            .getMessage()
                            .replace("&1", "§1")
                            .replace("&2", "§2")
                            .replace("&3", "§3")
                            .replace("&4", "§4")
                            .replace("&5", "§5")
                            .replace("&6", "§6")
                            .replace("&7", "§7")
                            .replace("&8", "§8")
                            .replace("&9", "§9")
                            .replace("&0", "§0")
                            .replace("&a", "§a")
                            .replace("&b", "§b")
                            .replace("&c", "§c")
                            .replace("&d", "§d")
                            .replace("&e", "§e")
                            .replace("&f", "§f")
                            .replace("&l", "§l")
                            .replace("&o", "§o")
                            .replace("&k", "§k")
                            .replace("&m", "§m")
                            .replace("&n", "§n")
                            .replace("&r", "§r"));
            } else {
                e.setFormat(
                    Jogadores.CustonNameDiego + Jogadores.Diego + " §f§l>" + Jogadores.CustonNameDiego + "> §f" + e
                            .getMessage()
                            .replace("&1", "§1")
                            .replace("&2", "§2")
                            .replace("&3", "§3")
                            .replace("&4", "§4")
                            .replace("&5", "§5")
                            .replace("&6", "§6")
                            .replace("&7", "§7")
                            .replace("&8", "§8")
                            .replace("&9", "§9")
                            .replace("&0", "§0")
                            .replace("&a", "§a")
                            .replace("&b", "§b")
                            .replace("&c", "§c")
                            .replace("&d", "§d")
                            .replace("&e", "§e")
                            .replace("&f", "§f")
                            .replace("&l", "§l")
                            .replace("&o", "§o")
                            .replace("&k", "§k")
                            .replace("&m", "§m")
                            .replace("&n", "§n")
                            .replace("&r", "§r"));
            }
        } else if (e.getPlayer().getName().equalsIgnoreCase(Jogadores.Sombra)) {
            if (Jogadores.FakePlayerSombra) {
                e.setFormat(
                    Jogadores.CustonNameSombra + Jogadores.FakeNickSombra + " §f§l>" + Jogadores.CustonNameSombra + "> §f" + e
                            .getMessage()
                            .replace("&1", "§1")
                            .replace("&2", "§2")
                            .replace("&3", "§3")
                            .replace("&4", "§4")
                            .replace("&5", "§5")
                            .replace("&6", "§6")
                            .replace("&7", "§7")
                            .replace("&8", "§8")
                            .replace("&9", "§9")
                            .replace("&0", "§0")
                            .replace("&a", "§a")
                            .replace("&b", "§b")
                            .replace("&c", "§c")
                            .replace("&d", "§d")
                            .replace("&e", "§e")
                            .replace("&f", "§f")
                            .replace("&l", "§l")
                            .replace("&o", "§o")
                            .replace("&k", "§k")
                            .replace("&m", "§m")
                            .replace("&n", "§n")
                            .replace("&r", "§r"));
            } else {
                e.setFormat(
                    Jogadores.CustonNameSombra + Jogadores.Sombra + " §f§l>" + Jogadores.CustonNameSombra + "> §f" + e
                            .getMessage()
                            .replace("&1", "§1")
                            .replace("&2", "§2")
                            .replace("&3", "§3")
                            .replace("&4", "§4")
                            .replace("&5", "§5")
                            .replace("&6", "§6")
                            .replace("&7", "§7")
                            .replace("&8", "§8")
                            .replace("&9", "§9")
                            .replace("&0", "§0")
                            .replace("&a", "§a")
                            .replace("&b", "§b")
                            .replace("&c", "§c")
                            .replace("&d", "§d")
                            .replace("&e", "§e")
                            .replace("&f", "§f")
                            .replace("&l", "§l")
                            .replace("&o", "§o")
                            .replace("&k", "§k")
                            .replace("&m", "§m")
                            .replace("&n", "§n")
                            .replace("&r", "§r"));
            }
        } else if (e.getPlayer().getName().equalsIgnoreCase(Jogadores.Raymeki)) {
            if (Jogadores.FakePlayerRaymeki) {
                e.setFormat(
                    Jogadores.CustonNameRaymeki + Jogadores.FakeNickRaymeki + " §f§l>" + Jogadores.CustonNameRaymeki + "> §f" + e
                            .getMessage()
                            .replace("&1", "§1")
                            .replace("&2", "§2")
                            .replace("&3", "§3")
                            .replace("&4", "§4")
                            .replace("&5", "§5")
                            .replace("&6", "§6")
                            .replace("&7", "§7")
                            .replace("&8", "§8")
                            .replace("&9", "§9")
                            .replace("&0", "§0")
                            .replace("&a", "§a")
                            .replace("&b", "§b")
                            .replace("&c", "§c")
                            .replace("&d", "§d")
                            .replace("&e", "§e")
                            .replace("&f", "§f")
                            .replace("&l", "§l")
                            .replace("&o", "§o")
                            .replace("&k", "§k")
                            .replace("&m", "§m")
                            .replace("&n", "§n")
                            .replace("&r", "§r"));
            } else {
                e.setFormat(
                    Jogadores.CustonNameRaymeki + Jogadores.Raymeki + " §f§l>" + Jogadores.CustonNameRaymeki + "> §f" + e
                            .getMessage()
                            .replace("&1", "§1")
                            .replace("&2", "§2")
                            .replace("&3", "§3")
                            .replace("&4", "§4")
                            .replace("&5", "§5")
                            .replace("&6", "§6")
                            .replace("&7", "§7")
                            .replace("&8", "§8")
                            .replace("&9", "§9")
                            .replace("&0", "§0")
                            .replace("&a", "§a")
                            .replace("&b", "§b")
                            .replace("&c", "§c")
                            .replace("&d", "§d")
                            .replace("&e", "§e")
                            .replace("&f", "§f")
                            .replace("&l", "§l")
                            .replace("&o", "§o")
                            .replace("&k", "§k")
                            .replace("&m", "§m")
                            .replace("&n", "§n")
                            .replace("&r", "§r"));
            }
        } else if (e.getPlayer().getName().equalsIgnoreCase(Jogadores.Edder)) {
            if (Jogadores.FakePlayerEdder) {
                e.setFormat(
                    Jogadores.CustonNameEdder + Jogadores.FakeNickEdder + " §f§l>" + Jogadores.CustonNameEdder + "> §f" + e
                            .getMessage()
                            .replace("&1", "§1")
                            .replace("&2", "§2")
                            .replace("&3", "§3")
                            .replace("&4", "§4")
                            .replace("&5", "§5")
                            .replace("&6", "§6")
                            .replace("&7", "§7")
                            .replace("&8", "§8")
                            .replace("&9", "§9")
                            .replace("&0", "§0")
                            .replace("&a", "§a")
                            .replace("&b", "§b")
                            .replace("&c", "§c")
                            .replace("&d", "§d")
                            .replace("&e", "§e")
                            .replace("&f", "§f")
                            .replace("&l", "§l")
                            .replace("&o", "§o")
                            .replace("&k", "§k")
                            .replace("&m", "§m")
                            .replace("&n", "§n")
                            .replace("&r", "§r"));
            } else {
                e.setFormat(
                    Jogadores.CustonNameEdder + Jogadores.Edder + " §f§l>" + Jogadores.CustonNameEdder + "> §f" + e
                            .getMessage()
                            .replace("&1", "§1")
                            .replace("&2", "§2")
                            .replace("&3", "§3")
                            .replace("&4", "§4")
                            .replace("&5", "§5")
                            .replace("&6", "§6")
                            .replace("&7", "§7")
                            .replace("&8", "§8")
                            .replace("&9", "§9")
                            .replace("&0", "§0")
                            .replace("&a", "§a")
                            .replace("&b", "§b")
                            .replace("&c", "§c")
                            .replace("&d", "§d")
                            .replace("&e", "§e")
                            .replace("&f", "§f")
                            .replace("&l", "§l")
                            .replace("&o", "§o")
                            .replace("&k", "§k")
                            .replace("&m", "§m")
                            .replace("&n", "§n")
                            .replace("&r", "§r"));
            }
        } else if (e.getPlayer().getName().equalsIgnoreCase(Jogadores.Crazy)) {
            if (Jogadores.FakePlayerCrazy) {
                e.setFormat(
                    Jogadores.CustonNameCrazy + Jogadores.FakeNickCrazy + " §f§l>" + Jogadores.CustonNameCrazy + "> §f" + e
                            .getMessage()
                            .replace("&1", "§1")
                            .replace("&2", "§2")
                            .replace("&3", "§3")
                            .replace("&4", "§4")
                            .replace("&5", "§5")
                            .replace("&6", "§6")
                            .replace("&7", "§7")
                            .replace("&8", "§8")
                            .replace("&9", "§9")
                            .replace("&0", "§0")
                            .replace("&a", "§a")
                            .replace("&b", "§b")
                            .replace("&c", "§c")
                            .replace("&d", "§d")
                            .replace("&e", "§e")
                            .replace("&f", "§f")
                            .replace("&l", "§l")
                            .replace("&o", "§o")
                            .replace("&k", "§k")
                            .replace("&m", "§m")
                            .replace("&n", "§n")
                            .replace("&r", "§r"));
            } else {
                e.setFormat(
                    Jogadores.CustonNameCrazy + Jogadores.Crazy + " §f§l>" + Jogadores.CustonNameCrazy + "> §f" + e
                            .getMessage()
                            .replace("&1", "§1")
                            .replace("&2", "§2")
                            .replace("&3", "§3")
                            .replace("&4", "§4")
                            .replace("&5", "§5")
                            .replace("&6", "§6")
                            .replace("&7", "§7")
                            .replace("&8", "§8")
                            .replace("&9", "§9")
                            .replace("&0", "§0")
                            .replace("&a", "§a")
                            .replace("&b", "§b")
                            .replace("&c", "§c")
                            .replace("&d", "§d")
                            .replace("&e", "§e")
                            .replace("&f", "§f")
                            .replace("&l", "§l")
                            .replace("&o", "§o")
                            .replace("&k", "§k")
                            .replace("&m", "§m")
                            .replace("&n", "§n")
                            .replace("&r", "§r"));
            }
        } else if (e.getPlayer().getName().equalsIgnoreCase(Jogadores.Dede)) {
            if (Jogadores.FakePlayerDede) {
                e.setFormat(
                    Jogadores.CustonNameDede + Jogadores.FakeNickDede + " §f§l>" + Jogadores.CustonNameDede + "> §f" + e
                            .getMessage()
                            .replace("&1", "§1")
                            .replace("&2", "§2")
                            .replace("&3", "§3")
                            .replace("&4", "§4")
                            .replace("&5", "§5")
                            .replace("&6", "§6")
                            .replace("&7", "§7")
                            .replace("&8", "§8")
                            .replace("&9", "§9")
                            .replace("&0", "§0")
                            .replace("&a", "§a")
                            .replace("&b", "§b")
                            .replace("&c", "§c")
                            .replace("&d", "§d")
                            .replace("&e", "§e")
                            .replace("&f", "§f")
                            .replace("&l", "§l")
                            .replace("&o", "§o")
                            .replace("&k", "§k")
                            .replace("&m", "§m")
                            .replace("&n", "§n")
                            .replace("&r", "§r"));
            } else {
                e.setFormat(
                    Jogadores.CustonNameDede + Jogadores.Dede + " §f§l>" + Jogadores.CustonNameDede + "> §f" + e
                            .getMessage()
                            .replace("&1", "§1")
                            .replace("&2", "§2")
                            .replace("&3", "§3")
                            .replace("&4", "§4")
                            .replace("&5", "§5")
                            .replace("&6", "§6")
                            .replace("&7", "§7")
                            .replace("&8", "§8")
                            .replace("&9", "§9")
                            .replace("&0", "§0")
                            .replace("&a", "§a")
                            .replace("&b", "§b")
                            .replace("&c", "§c")
                            .replace("&d", "§d")
                            .replace("&e", "§e")
                            .replace("&f", "§f")
                            .replace("&l", "§l")
                            .replace("&o", "§o")
                            .replace("&k", "§k")
                            .replace("&m", "§m")
                            .replace("&n", "§n")
                            .replace("&r", "§r"));
            }
        } else if (e.getPlayer().getName().equalsIgnoreCase(Jogadores.Beaats)) {
            if (Jogadores.FakePlayerBeaats) {
                e.setFormat(
                    Jogadores.CustonNameBeaats + Jogadores.FakeNickBeaats + " §f§l>" + Jogadores.CustonNameBeaats + "> §f" + e
                            .getMessage()
                            .replace("&1", "§1")
                            .replace("&2", "§2")
                            .replace("&3", "§3")
                            .replace("&4", "§4")
                            .replace("&5", "§5")
                            .replace("&6", "§6")
                            .replace("&7", "§7")
                            .replace("&8", "§8")
                            .replace("&9", "§9")
                            .replace("&0", "§0")
                            .replace("&a", "§a")
                            .replace("&b", "§b")
                            .replace("&c", "§c")
                            .replace("&d", "§d")
                            .replace("&e", "§e")
                            .replace("&f", "§f")
                            .replace("&l", "§l")
                            .replace("&o", "§o")
                            .replace("&k", "§k")
                            .replace("&m", "§m")
                            .replace("&n", "§n")
                            .replace("&r", "§r"));
            } else {
                e.setFormat(
                    Jogadores.CustonNameBeaats + Jogadores.Beaats + " §f§l>" + Jogadores.CustonNameBeaats + "> §f" + e
                            .getMessage()
                            .replace("&1", "§1")
                            .replace("&2", "§2")
                            .replace("&3", "§3")
                            .replace("&4", "§4")
                            .replace("&5", "§5")
                            .replace("&6", "§6")
                            .replace("&7", "§7")
                            .replace("&8", "§8")
                            .replace("&9", "§9")
                            .replace("&0", "§0")
                            .replace("&a", "§a")
                            .replace("&b", "§b")
                            .replace("&c", "§c")
                            .replace("&d", "§d")
                            .replace("&e", "§e")
                            .replace("&f", "§f")
                            .replace("&l", "§l")
                            .replace("&o", "§o")
                            .replace("&k", "§k")
                            .replace("&m", "§m")
                            .replace("&n", "§n")
                            .replace("&r", "§r"));
            }
        } else if (e.getPlayer().getName().equalsIgnoreCase(Jogadores.Biidu)) {
            if (Jogadores.FakePlayerBiidu) {
                e.setFormat(
                    Jogadores.CustonNameBiidu + Jogadores.FakeNickBiidu + " §f§l>" + Jogadores.CustonNameBiidu + "> §f" + e
                            .getMessage()
                            .replace("&1", "§1")
                            .replace("&2", "§2")
                            .replace("&3", "§3")
                            .replace("&4", "§4")
                            .replace("&5", "§5")
                            .replace("&6", "§6")
                            .replace("&7", "§7")
                            .replace("&8", "§8")
                            .replace("&9", "§9")
                            .replace("&0", "§0")
                            .replace("&a", "§a")
                            .replace("&b", "§b")
                            .replace("&c", "§c")
                            .replace("&d", "§d")
                            .replace("&e", "§e")
                            .replace("&f", "§f")
                            .replace("&l", "§l")
                            .replace("&o", "§o")
                            .replace("&k", "§k")
                            .replace("&m", "§m")
                            .replace("&n", "§n")
                            .replace("&r", "§r"));
            } else {
                e.setFormat(
                    Jogadores.CustonNameBiidu + Jogadores.Biidu + " §f§l>" + Jogadores.CustonNameBiidu + "> §f" + e
                            .getMessage()
                            .replace("&1", "§1")
                            .replace("&2", "§2")
                            .replace("&3", "§3")
                            .replace("&4", "§4")
                            .replace("&5", "§5")
                            .replace("&6", "§6")
                            .replace("&7", "§7")
                            .replace("&8", "§8")
                            .replace("&9", "§9")
                            .replace("&0", "§0")
                            .replace("&a", "§a")
                            .replace("&b", "§b")
                            .replace("&c", "§c")
                            .replace("&d", "§d")
                            .replace("&e", "§e")
                            .replace("&f", "§f")
                            .replace("&l", "§l")
                            .replace("&o", "§o")
                            .replace("&k", "§k")
                            .replace("&m", "§m")
                            .replace("&n", "§n")
                            .replace("&r", "§r"));
            }
        } else if (e.getPlayer().getName().equalsIgnoreCase(Jogadores.Keroch)) {
            if (Jogadores.FakePlayerKeroch) {
                e.setFormat(
                    Jogadores.CustonNameKeroch + Jogadores.FakeNickKeroch + " §f§l>" + Jogadores.CustonNameKeroch + "> §f" + e
                            .getMessage()
                            .replace("&1", "§1")
                            .replace("&2", "§2")
                            .replace("&3", "§3")
                            .replace("&4", "§4")
                            .replace("&5", "§5")
                            .replace("&6", "§6")
                            .replace("&7", "§7")
                            .replace("&8", "§8")
                            .replace("&9", "§9")
                            .replace("&0", "§0")
                            .replace("&a", "§a")
                            .replace("&b", "§b")
                            .replace("&c", "§c")
                            .replace("&d", "§d")
                            .replace("&e", "§e")
                            .replace("&f", "§f")
                            .replace("&l", "§l")
                            .replace("&o", "§o")
                            .replace("&k", "§k")
                            .replace("&m", "§m")
                            .replace("&n", "§n")
                            .replace("&r", "§r"));
            } else {
                e.setFormat(
                    Jogadores.CustonNameKeroch + Jogadores.Keroch + " §f§l>" + Jogadores.CustonNameKeroch + "> §f" + e
                            .getMessage()
                            .replace("&1", "§1")
                            .replace("&2", "§2")
                            .replace("&3", "§3")
                            .replace("&4", "§4")
                            .replace("&5", "§5")
                            .replace("&6", "§6")
                            .replace("&7", "§7")
                            .replace("&8", "§8")
                            .replace("&9", "§9")
                            .replace("&0", "§0")
                            .replace("&a", "§a")
                            .replace("&b", "§b")
                            .replace("&c", "§c")
                            .replace("&d", "§d")
                            .replace("&e", "§e")
                            .replace("&f", "§f")
                            .replace("&l", "§l")
                            .replace("&o", "§o")
                            .replace("&k", "§k")
                            .replace("&m", "§m")
                            .replace("&n", "§n")
                            .replace("&r", "§r"));
            }
        } else if (e.getPlayer().getName().equalsIgnoreCase(Jogadores.FelipeHeroPlay)) {
            if (Jogadores.FakePlayerFelipeHeroPlay) {
                e.setFormat(
                    Jogadores.CustonNameFelipeHeroPlay + Jogadores.FakeNickFelipeHeroPlay + " §f§l>" + Jogadores.CustonNameFelipeHeroPlay + "> §f" + e
                            .getMessage()
                            .replace("&1", "§1")
                            .replace("&2", "§2")
                            .replace("&3", "§3")
                            .replace("&4", "§4")
                            .replace("&5", "§5")
                            .replace("&6", "§6")
                            .replace("&7", "§7")
                            .replace("&8", "§8")
                            .replace("&9", "§9")
                            .replace("&0", "§0")
                            .replace("&a", "§a")
                            .replace("&b", "§b")
                            .replace("&c", "§c")
                            .replace("&d", "§d")
                            .replace("&e", "§e")
                            .replace("&f", "§f")
                            .replace("&l", "§l")
                            .replace("&o", "§o")
                            .replace("&k", "§k")
                            .replace("&m", "§m")
                            .replace("&n", "§n")
                            .replace("&r", "§r"));
            } else {
                e.setFormat(
                    Jogadores.CustonNameFelipeHeroPlay + Jogadores.FelipeHeroPlay + " §f§l>" + Jogadores.CustonNameFelipeHeroPlay + "> §f" + e
                            .getMessage()
                            .replace("&1", "§1")
                            .replace("&2", "§2")
                            .replace("&3", "§3")
                            .replace("&4", "§4")
                            .replace("&5", "§5")
                            .replace("&6", "§6")
                            .replace("&7", "§7")
                            .replace("&8", "§8")
                            .replace("&9", "§9")
                            .replace("&0", "§0")
                            .replace("&a", "§a")
                            .replace("&b", "§b")
                            .replace("&c", "§c")
                            .replace("&d", "§d")
                            .replace("&e", "§e")
                            .replace("&f", "§f")
                            .replace("&l", "§l")
                            .replace("&o", "§o")
                            .replace("&k", "§k")
                            .replace("&m", "§m")
                            .replace("&n", "§n")
                            .replace("&r", "§r"));
            }
        } else if (e.getPlayer().getName().equalsIgnoreCase(Jogadores.Mariao)) {
            if (Jogadores.FakePlayerMariao) {
                e.setFormat(
                    Jogadores.CustonNameMariao + Jogadores.FakeNickMariao + " §f§l>" + Jogadores.CustonNameMariao + "> §f" + e
                            .getMessage()
                            .replace("&1", "§1")
                            .replace("&2", "§2")
                            .replace("&3", "§3")
                            .replace("&4", "§4")
                            .replace("&5", "§5")
                            .replace("&6", "§6")
                            .replace("&7", "§7")
                            .replace("&8", "§8")
                            .replace("&9", "§9")
                            .replace("&0", "§0")
                            .replace("&a", "§a")
                            .replace("&b", "§b")
                            .replace("&c", "§c")
                            .replace("&d", "§d")
                            .replace("&e", "§e")
                            .replace("&f", "§f")
                            .replace("&l", "§l")
                            .replace("&o", "§o")
                            .replace("&k", "§k")
                            .replace("&m", "§m")
                            .replace("&n", "§n")
                            .replace("&r", "§r"));
            } else {
                e.setFormat(
                    Jogadores.CustonNameMariao + Jogadores.Mariao + " §f§l>" + Jogadores.CustonNameMariao + "> §f" + e
                            .getMessage()
                            .replace("&1", "§1")
                            .replace("&2", "§2")
                            .replace("&3", "§3")
                            .replace("&4", "§4")
                            .replace("&5", "§5")
                            .replace("&6", "§6")
                            .replace("&7", "§7")
                            .replace("&8", "§8")
                            .replace("&9", "§9")
                            .replace("&0", "§0")
                            .replace("&a", "§a")
                            .replace("&b", "§b")
                            .replace("&c", "§c")
                            .replace("&d", "§d")
                            .replace("&e", "§e")
                            .replace("&f", "§f")
                            .replace("&l", "§l")
                            .replace("&o", "§o")
                            .replace("&k", "§k")
                            .replace("&m", "§m")
                            .replace("&n", "§n")
                            .replace("&r", "§r"));
            }
        } else {
            e.setFormat(
                Jogadores.CustonNameUnregistered + e.getPlayer().getName() + " §f§l>" + Jogadores.CustonNameUnregistered + "> §f" + e
                        .getMessage()
                        .replace("&1", "§1")
                        .replace("&2", "§2")
                        .replace("&3", "§3")
                        .replace("&4", "§4")
                        .replace("&5", "§5")
                        .replace("&6", "§6")
                        .replace("&7", "§7")
                        .replace("&8", "§8")
                        .replace("&9", "§9")
                        .replace("&0", "§0")
                        .replace("&a", "§a")
                        .replace("&b", "§b")
                        .replace("&c", "§c")
                        .replace("&d", "§d")
                        .replace("&e", "§e")
                        .replace("&f", "§f")
                        .replace("&l", "§l")
                        .replace("&o", "§o")
                        .replace("&k", "§k")
                        .replace("&m", "§m")
                        .replace("&n", "§n")
                        .replace("&r", "§r"));
        }
    }

}
