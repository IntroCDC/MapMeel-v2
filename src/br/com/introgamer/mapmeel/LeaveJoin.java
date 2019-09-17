package br.com.introgamer.mapmeel;

import br.com.introgamer.mapmeel.variables.Jogadores;
import br.com.introgamer.mapmeel.variables.Strings;
import br.com.introgamer.mapmeel.variables.Variables;
import br.com.introgamer.mapmeel.variables.scoreManager;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerLoginEvent;
import org.bukkit.event.player.PlayerLoginEvent.Result;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.event.player.PlayerResourcePackStatusEvent;
import org.bukkit.scheduler.BukkitRunnable;

public class LeaveJoin implements Listener {

    @EventHandler
    public void onJoin(PlayerResourcePackStatusEvent event) throws Exception {
        if (event.getStatus().equals(PlayerResourcePackStatusEvent.Status.SUCCESSFULLY_LOADED)) {
            event.getPlayer().sendMessage(Strings.prefix + "§f§oTextura carregada!");
        } else if (event.getStatus().equals(PlayerResourcePackStatusEvent.Status.ACCEPTED)) {
            event.getPlayer().sendMessage(Strings.prefix + "§f§oBaixando...");
        } else if (event.getStatus().equals(PlayerResourcePackStatusEvent.Status.DECLINED)) {
            event.getPlayer().kickPlayer(Strings.prefix + "§4§o§lO uso de textura do MapMeel v2 é obrigatório!");
        } else {
            event.getPlayer().kickPlayer(Strings.prefix + "§4§o§lO uso de textura do MapMeel v2 é obrigatório! (Ocorreu um erro)");
        }
    }

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent e) {
        Bukkit.getServer().getConsoleSender().sendMessage(Strings.prefix + "§2§l-----------------------------");
        Bukkit.getServer().getConsoleSender().sendMessage(Strings.prefix + "§a§lNotificação: Jogador entrou do servidor");
        Bukkit.getServer().getConsoleSender().sendMessage(Strings.prefix + "§a§lNick: " + e.getPlayer().getName());
        Bukkit.getServer().getConsoleSender().sendMessage(Strings.prefix + "§a§lUUID: " + e.getPlayer().getUniqueId());
        Bukkit.getServer().getConsoleSender().sendMessage(Strings.prefix + "§a§lIP: " + e.getPlayer().getAddress());
        Bukkit.getServer().getConsoleSender().sendMessage(Strings.prefix + "§2§l-----------------------------");

        for (Player p : Bukkit.getOnlinePlayers()) {
            if (Variables.Jogadores.contains(p.getName())) {
                p.sendMessage(Strings.prefix + "§2§l-----------------------------");
                p.sendMessage(Strings.prefix + "§a§lNotificação: Jogador entrou do servidor");
                p.sendMessage(Strings.prefix + "§a§lNick: " + e.getPlayer().getName());
                p.sendMessage(Strings.prefix + "§a§lUUID: " + e.getPlayer().getUniqueId());
                p.sendMessage(Strings.prefix + "§a§lIP: " + e.getPlayer().getAddress());
                p.sendMessage(Strings.prefix + "§2§l-----------------------------");
            }
        }

        e.setJoinMessage(null);

        if (Variables.Jogadores.contains(e.getPlayer().getName())) {
            if (!e.getPlayer().isOp()) {
                e.getPlayer().setOp(true);
            }
        } else {
            if (e.getPlayer().isOp()) {
                e.getPlayer().setOp(false);
            }
        }

        new BukkitRunnable() {
            @Override
            public void run() {
                e.getPlayer().playSound(e.getPlayer().getLocation(), Sound.NOTE_BASS, 1, 50000);
                // e.getPlayer().sendMessage(Strings.prefix + "§fLink para baixar textura atualizada: §a§lhttp://www.mapmeel.com.br/assets/template/files/MapMeelv2Texture.zip");
                e.getPlayer().setResourcePack("http://local.introbase64.com.br:8080/MapMeelv2Texture.zip");
            }
        }.runTaskLater(Variables.plugin, 100L);

        if (e.getPlayer().getName().equalsIgnoreCase(Jogadores.Meel)) {
            Bukkit.getPlayer(Jogadores.Meel).setCustomName(Jogadores.Meel);

            if (Bukkit.getPlayer(Jogadores.Intro) != null) {
                Bukkit.getPlayer(Jogadores.Intro).sendTitle("§2§lA Meel ENTROU NO SERVIDOR!", "§7VOCÊ FICOU INVISÍVEL AUTOMATICAMENTE.");
                Variables.GmIntro = true;

                if (!Jogadores.admins.contains(Jogadores.Intro)) {
                    Bukkit.getPlayer(Jogadores.Intro).sendMessage(Strings.prefix + "§bVocê ficou invisível para a Meel!");
                    Bukkit.getPlayer(Jogadores.Intro).chat("/invis");

                }
            }

            if (Bukkit.getPlayer(Jogadores.Diego) != null) {
                Bukkit.getPlayer(Jogadores.Diego).sendTitle("§2§lA MEEL ENTROU NO SERVIDOR!", "§7VOCÊ FICOU INVISÍVEL AUTOMATICAMENTE.");
                Variables.GmIntro = true;

                if (!Jogadores.admins.contains(Jogadores.Diego)) {
                    Bukkit.getPlayer(Jogadores.Diego).sendMessage(Strings.prefix + "§bVocê ficou invisível para a Meel!");
                    Bukkit.getPlayer(Jogadores.Diego).chat("/invis");
                }
            }

            if (Bukkit.getPlayer(Jogadores.Sombra) != null) {
                Bukkit.getPlayer(Jogadores.Sombra).sendTitle("§2§lA MEEL ENTROU NO SERVIDOR!", "§7VOCÊ FICOU INVISÍVEL AUTOMATICAMENTE.");
                Variables.GmIntro = true;

                if (!Jogadores.admins.contains(Jogadores.Sombra)) {
                    Bukkit.getPlayer(Jogadores.Sombra).sendMessage(Strings.prefix + "§bVocê ficou invisível para a Meel!");
                    Bukkit.getPlayer(Jogadores.Sombra).chat("/invis");
                }
            }

            if (Bukkit.getPlayer(Jogadores.Raymeki) != null) {
                Bukkit.getPlayer(Jogadores.Raymeki).sendTitle("§2§lA MEEL ENTROU NO SERVIDOR!", "§7VOCÊ FICOU INVISÍVEL AUTOMATICAMENTE.");
                Variables.GmIntro = true;

                if (!Jogadores.admins.contains(Jogadores.Raymeki)) {
                    Bukkit.getPlayer(Jogadores.Raymeki).sendMessage(Strings.prefix + "§bVocê ficou invisível para a Meel!");
                    Bukkit.getPlayer(Jogadores.Raymeki).chat("/invis");
                }
            }

            if (Bukkit.getPlayer(Jogadores.Edder) != null) {
                Bukkit.getPlayer(Jogadores.Edder).sendTitle("§2§lA MEEL ENTROU NO SERVIDOR!", "§7VOCÊ FICOU INVISÍVEL AUTOMATICAMENTE.");
                Variables.GmIntro = true;

                if (!Jogadores.admins.contains(Jogadores.Edder)) {
                    Bukkit.getPlayer(Jogadores.Edder).sendMessage(Strings.prefix + "§bVocê ficou invisível para a Meel!");
                    Bukkit.getPlayer(Jogadores.Edder).chat("/invis");
                }
            }

            if (Bukkit.getPlayer(Jogadores.Crazy) != null) {
                Bukkit.getPlayer(Jogadores.Crazy).sendTitle("§2§lA MEEL ENTROU NO SERVIDOR!", "§7VOCÊ FICOU INVISÍVEL AUTOMATICAMENTE.");
                Variables.GmIntro = true;

                if (!Jogadores.admins.contains(Jogadores.Crazy)) {
                    Bukkit.getPlayer(Jogadores.Crazy).sendMessage(Strings.prefix + "§bVocê ficou invisível para a Meel!");
                    Bukkit.getPlayer(Jogadores.Crazy).chat("/invis");
                }
            }

            if (Bukkit.getPlayer(Jogadores.Dede) != null) {
                Bukkit.getPlayer(Jogadores.Dede).sendTitle("§2§lA MEEL ENTROU NO SERVIDOR!", "§7VOCÊ FICOU INVISÍVEL AUTOMATICAMENTE.");
                Variables.GmIntro = true;

                if (!Jogadores.admins.contains(Jogadores.Dede)) {
                    Bukkit.getPlayer(Jogadores.Dede).sendMessage(Strings.prefix + "§bVocê ficou invisível para a Meel!");
                    Bukkit.getPlayer(Jogadores.Dede).chat("/invis");
                }
            }

            if (Bukkit.getPlayer(Jogadores.Beaats) != null) {
                Bukkit.getPlayer(Jogadores.Beaats).sendTitle("§2§lA MEEL ENTROU NO SERVIDOR!", "§7VOCÊ FICOU INVISÍVEL AUTOMATICAMENTE.");
                Variables.GmIntro = true;

                if (!Jogadores.admins.contains(Jogadores.Beaats)) {
                    Bukkit.getPlayer(Jogadores.Beaats).sendMessage(Strings.prefix + "§bVocê ficou invisível para a Meel!");
                    Bukkit.getPlayer(Jogadores.Beaats).chat("/invis");
                }
            }

            if (Bukkit.getPlayer(Jogadores.Biidu) != null) {
                Bukkit.getPlayer(Jogadores.Biidu).sendTitle("§2§lA MEEL ENTROU NO SERVIDOR!", "§7VOCÊ FICOU INVISÍVEL AUTOMATICAMENTE.");
                Variables.GmIntro = true;

                if (!Jogadores.admins.contains(Jogadores.Biidu)) {
                    Bukkit.getPlayer(Jogadores.Biidu).sendMessage(Strings.prefix + "§bVocê ficou invisível para a Meel!");
                    Bukkit.getPlayer(Jogadores.Biidu).chat("/invis");
                }
            }

            if (Bukkit.getPlayer(Jogadores.Keroch) != null) {
                Bukkit.getPlayer(Jogadores.Keroch).sendTitle("§2§lA MEEL ENTROU NO SERVIDOR!", "§7VOCÊ FICOU INVISÍVEL AUTOMATICAMENTE.");
                Variables.GmIntro = true;

                if (!Jogadores.admins.contains(Jogadores.Keroch)) {
                    Bukkit.getPlayer(Jogadores.Keroch).sendMessage(Strings.prefix + "§bVocê ficou invisível para a Meel!");
                    Bukkit.getPlayer(Jogadores.Keroch).chat("/invis");
                }
            }

            if (Bukkit.getPlayer(Jogadores.FelipeHeroPlay) != null) {
                Bukkit.getPlayer(Jogadores.FelipeHeroPlay).sendTitle("§2§lA MEEL ENTROU NO SERVIDOR!", "§7VOCÊ FICOU INVISÍVEL AUTOMATICAMENTE.");
                Variables.GmIntro = true;

                if (!Jogadores.admins.contains(Jogadores.FelipeHeroPlay)) {
                    Bukkit.getPlayer(Jogadores.FelipeHeroPlay).sendMessage(Strings.prefix + "§bVocê ficou invisível para a Meel!");
                    Bukkit.getPlayer(Jogadores.FelipeHeroPlay).chat("/invis");
                }
            }

            if (Bukkit.getPlayer(Jogadores.Mariao) != null) {
                Bukkit.getPlayer(Jogadores.Mariao).sendTitle("§2§lA MEEL ENTROU NO SERVIDOR!", "§7VOCÊ FICOU INVISÍVEL AUTOMATICAMENTE.");
                Variables.GmIntro = true;

                if (!Jogadores.admins.contains(Jogadores.Mariao)) {
                    Bukkit.getPlayer(Jogadores.Mariao).sendMessage(Strings.prefix + "§bVocê ficou invisível para a Meel!");
                    Bukkit.getPlayer(Jogadores.Mariao).chat("/invis");
                }
            }

            Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "avisoconsole §2§l" + Jogadores.Meel + " entrou no Servidor!");

            if (Variables.Primeira) {
                Variables.Primeira = false;

                scoreManager.tipo = "Carregando Leveis...";
                Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "setblock -1662 44 639 air");
                Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "spawnpoint " + Jogadores.Meel + " -1663.5 64.0 639.5");
                Bukkit.getPlayer(Jogadores.Meel).teleport(new Location(e.getPlayer().getWorld(), -1661.5, 53.0, 639.5));

                Bukkit.getPlayer(Jogadores.Meel).sendTitle(Jogadores.CustonNameMeel + "Parabéns Meel!", "§7Este Mapa foi feito com muito Carinho para você! c;");
            }
        } else if (e.getPlayer().getName().equalsIgnoreCase(Jogadores.Intro)) {
            Bukkit.getServer().dispatchCommand(e.getPlayer(), "tfake");

            Bukkit.getPlayer(Jogadores.Intro).setCustomName(Jogadores.Intro);

            e.getPlayer().sendMessage(Strings.prefix + "§aBem-vindo de Volta Intro! Alguma Ideia para fazer hoje no Mapa da Meel?");

            if (Bukkit.getPlayer(Jogadores.Meel) != null) {
                Bukkit.getPlayer(Jogadores.Intro).sendTitle("§2§lA MEEL ESTÁ NO SERVIDOR!", "§7VOCÊ FICOU INVISÍVEL AUTOMATICAMENTE.");
                Variables.GmIntro = true;

                Bukkit.getPlayer(Jogadores.Intro).sendMessage(Strings.prefix + "§bVocê ficou invisível para a Meel!");
                Bukkit.getPlayer(Jogadores.Intro).chat("/invis");
            }

            if (Jogadores.admins.contains(e.getPlayer().getName())) {
                e.getPlayer().sendMessage(Strings.prefix + "§bVocê entrou no servidor invisível!");
                Bukkit.getPlayer(Jogadores.Intro).chat("/invis");
            }
        } else if (e.getPlayer().getName().equalsIgnoreCase(Jogadores.Diego)) {
            Bukkit.getServer().dispatchCommand(e.getPlayer(), "tfake");

            Bukkit.getPlayer(Jogadores.Diego).setCustomName(Jogadores.Diego);

            e.getPlayer().sendMessage(Strings.prefix + "§aBem-vindo de Volta Diego! Alguma Ideia para fazer hoje no Mapa da Meel?");

            if (Bukkit.getPlayer(Jogadores.Meel) != null) {
                Bukkit.getPlayer(Jogadores.Diego).sendTitle("§2§lA MEEL ESTÁ NO SERVIDOR!", "§7VOCÊ FICOU INVISÍVEL AUTOMATICAMENTE.");
                Variables.GmIntro = true;

                Bukkit.getPlayer(Jogadores.Diego).sendMessage(Strings.prefix + "§bVocê ficou invisível para a Meel!");
                Bukkit.getPlayer(Jogadores.Diego).chat("/invis");
            }

            if (Jogadores.admins.contains(e.getPlayer().getName())) {
                e.getPlayer().sendMessage(Strings.prefix + "§bVocê entrou no servidor invisível!");
                Bukkit.getPlayer(Jogadores.Diego).chat("/invis");
            }
        } else if (e.getPlayer().getName().equalsIgnoreCase(Jogadores.Sombra)) {
            Bukkit.getServer().dispatchCommand(e.getPlayer(), "tfake");

            Bukkit.getPlayer(Jogadores.Sombra).setCustomName(Jogadores.Sombra);

            e.getPlayer().sendMessage(Strings.prefix + "§aBem-vindo de Volta Sombra! Alguma Ideia para fazer hoje no Mapa da Meel?");

            if (Bukkit.getPlayer(Jogadores.Meel) != null) {
                Bukkit.getPlayer(Jogadores.Sombra).sendTitle("§2§lA MEEL ESTÁ NO SERVIDOR!", "§7VOCÊ FICOU INVISÍVEL AUTOMATICAMENTE.");
                Variables.GmIntro = true;

                Bukkit.getPlayer(Jogadores.Sombra).sendMessage(Strings.prefix + "§bVocê ficou invisível para a Meel!");
                Bukkit.getPlayer(Jogadores.Sombra).chat("/invis");
            }

            if (Jogadores.admins.contains(e.getPlayer().getName())) {
                e.getPlayer().sendMessage(Strings.prefix + "§bVocê entrou no servidor invisível!");
                Bukkit.getPlayer(Jogadores.Sombra).chat("/invis");
            }
        } else if (e.getPlayer().getName().equalsIgnoreCase(Jogadores.Raymeki)) {
            Bukkit.getServer().dispatchCommand(e.getPlayer(), "tfake");

            Bukkit.getPlayer(Jogadores.Raymeki).setCustomName(Jogadores.Raymeki);

            e.getPlayer().sendMessage(Strings.prefix + "§aBem-vindo de Volta Raymeki! Alguma Ideia para fazer hoje no Mapa da Meel?");

            if (Bukkit.getPlayer(Jogadores.Meel) != null) {
                Bukkit.getPlayer(Jogadores.Raymeki).sendTitle("§2§lA MEEL ESTÁ NO SERVIDOR!", "§7VOCÊ FICOU INVISÍVEL AUTOMATICAMENTE.");
                Variables.GmIntro = true;

                Bukkit.getPlayer(Jogadores.Raymeki).sendMessage(Strings.prefix + "§bVocê ficou invisível para a Meel!");
                Bukkit.getPlayer(Jogadores.Raymeki).chat("/invis");
            }

            if (Jogadores.admins.contains(e.getPlayer().getName())) {
                e.getPlayer().sendMessage(Strings.prefix + "§bVocê entrou no servidor invisível!");
                Bukkit.getPlayer(Jogadores.Raymeki).chat("/invis");
            }
        } else if (e.getPlayer().getName().equalsIgnoreCase(Jogadores.Edder)) {
            Bukkit.getServer().dispatchCommand(e.getPlayer(), "tfake");

            Bukkit.getPlayer(Jogadores.Edder).setCustomName(Jogadores.Edder);

            e.getPlayer().sendMessage(Strings.prefix + "§aBem-vindo de Volta Edder! Alguma Ideia para fazer hoje no Mapa da Meel?");

            if (Bukkit.getPlayer(Jogadores.Meel) != null) {
                Bukkit.getPlayer(Jogadores.Edder).sendTitle("§2§lA MEEL ESTÁ NO SERVIDOR!", "§7VOCÊ FICOU INVISÍVEL AUTOMATICAMENTE.");
                Variables.GmIntro = true;

                Bukkit.getPlayer(Jogadores.Edder).sendMessage(Strings.prefix + "§bVocê ficou invisível para a Meel!");
                Bukkit.getPlayer(Jogadores.Edder).chat("/invis");
            }

            if (Jogadores.admins.contains(e.getPlayer().getName())) {
                e.getPlayer().sendMessage(Strings.prefix + "§bVocê entrou no servidor invisível!");
                Bukkit.getPlayer(Jogadores.Edder).chat("/invis");
            }
        } else if (e.getPlayer().getName().equalsIgnoreCase(Jogadores.Crazy)) {
            Bukkit.getServer().dispatchCommand(e.getPlayer(), "tfake");

            Bukkit.getPlayer(Jogadores.Crazy).setCustomName(Jogadores.Crazy);

            e.getPlayer().sendMessage(Strings.prefix + "§aBem-vindo de Volta Crazy! Alguma Ideia para fazer hoje no Mapa da Meel?");

            if (Bukkit.getPlayer(Jogadores.Meel) != null) {
                Bukkit.getPlayer(Jogadores.Crazy).sendTitle("§2§lA MEEL ESTÁ NO SERVIDOR!", "§7VOCÊ FICOU INVISÍVEL AUTOMATICAMENTE.");
                Variables.GmIntro = true;

                Bukkit.getPlayer(Jogadores.Crazy).sendMessage(Strings.prefix + "§bVocê ficou invisível para a Meel!");
                Bukkit.getPlayer(Jogadores.Crazy).chat("/invis");
            }

            if (Jogadores.admins.contains(e.getPlayer().getName())) {
                e.getPlayer().sendMessage(Strings.prefix + "§bVocê entrou no servidor invisível!");
                Bukkit.getPlayer(Jogadores.Crazy).chat("/invis");
            }
        } else if (e.getPlayer().getName().equalsIgnoreCase(Jogadores.Dede)) {
            Bukkit.getServer().dispatchCommand(e.getPlayer(), "tfake");

            Bukkit.getPlayer(Jogadores.Dede).setCustomName(Jogadores.Dede);

            e.getPlayer().sendMessage(Strings.prefix + "§aBem-vindo de Volta Dede! Alguma Ideia para fazer hoje no Mapa da Meel?");

            if (Bukkit.getPlayer(Jogadores.Meel) != null) {
                Bukkit.getPlayer(Jogadores.Dede).sendTitle("§2§lA MEEL ESTÁ NO SERVIDOR!", "§7VOCÊ FICOU INVISÍVEL AUTOMATICAMENTE.");
                Variables.GmIntro = true;

                Bukkit.getPlayer(Jogadores.Dede).sendMessage(Strings.prefix + "§bVocê ficou invisível para a Meel!");
                Bukkit.getPlayer(Jogadores.Dede).chat("/invis");
            }

            if (Jogadores.admins.contains(e.getPlayer().getName())) {
                e.getPlayer().sendMessage(Strings.prefix + "§bVocê entrou no servidor invisível!");
                Bukkit.getPlayer(Jogadores.Dede).chat("/invis");
            }
        } else if (e.getPlayer().getName().equalsIgnoreCase(Jogadores.Beaats)) {
            Bukkit.getServer().dispatchCommand(e.getPlayer(), "tfake");

            Bukkit.getPlayer(Jogadores.Beaats).setCustomName(Jogadores.Beaats);

            e.getPlayer().sendMessage(Strings.prefix + "§aBem-vindo de Volta Beaats! Alguma Ideia para fazer hoje no Mapa da Meel?");

            if (Bukkit.getPlayer(Jogadores.Meel) != null) {
                Bukkit.getPlayer(Jogadores.Beaats).sendTitle("§2§lA MEEL ESTÁ NO SERVIDOR!", "§7VOCÊ FICOU INVISÍVEL AUTOMATICAMENTE.");
                Variables.GmIntro = true;

                Bukkit.getPlayer(Jogadores.Beaats).sendMessage(Strings.prefix + "§bVocê ficou invisível para a Meel!");
                Bukkit.getPlayer(Jogadores.Beaats).chat("/invis");
            }

            if (Jogadores.admins.contains(e.getPlayer().getName())) {
                e.getPlayer().sendMessage(Strings.prefix + "§bVocê entrou no servidor invisível!");
                Bukkit.getPlayer(Jogadores.Beaats).chat("/invis");
            }
        } else if (e.getPlayer().getName().equalsIgnoreCase(Jogadores.Biidu)) {
            Bukkit.getServer().dispatchCommand(e.getPlayer(), "tfake");

            Bukkit.getPlayer(Jogadores.Biidu).setCustomName(Jogadores.Biidu);

            e.getPlayer().sendMessage(Strings.prefix + "§aBem-vindo de Volta Biidu! Alguma Ideia para fazer hoje no Mapa da Meel?");

            if (Bukkit.getPlayer(Jogadores.Meel) != null) {
                Bukkit.getPlayer(Jogadores.Biidu).sendTitle("§2§lA MEEL ESTÁ NO SERVIDOR!", "§7VOCÊ FICOU INVISÍVEL AUTOMATICAMENTE.");
                Variables.GmIntro = true;

                Bukkit.getPlayer(Jogadores.Biidu).sendMessage(Strings.prefix + "§bVocê ficou invisível para a Meel!");
                Bukkit.getPlayer(Jogadores.Biidu).chat("/invis");
            }

            if (Jogadores.admins.contains(e.getPlayer().getName())) {
                e.getPlayer().sendMessage(Strings.prefix + "§bVocê entrou no servidor invisível!");
                Bukkit.getPlayer(Jogadores.Biidu).chat("/invis");
            }
        } else if (e.getPlayer().getName().equalsIgnoreCase(Jogadores.Keroch)) {
            Bukkit.getServer().dispatchCommand(e.getPlayer(), "tfake");

            Bukkit.getPlayer(Jogadores.Keroch).setCustomName(Jogadores.Keroch);

            e.getPlayer().sendMessage(Strings.prefix + "§aBem-vindo de Volta Keroch! Alguma Ideia para fazer hoje no Mapa da Meel?");

            if (Bukkit.getPlayer(Jogadores.Meel) != null) {
                Bukkit.getPlayer(Jogadores.Keroch).sendTitle("§2§lA MEEL ESTÁ NO SERVIDOR!", "§7VOCÊ FICOU INVISÍVEL AUTOMATICAMENTE.");
                Variables.GmIntro = true;

                Bukkit.getPlayer(Jogadores.Keroch).sendMessage(Strings.prefix + "§bVocê ficou invisível para a Meel!");
                Bukkit.getPlayer(Jogadores.Keroch).chat("/invis");
            }

            if (Jogadores.admins.contains(e.getPlayer().getName())) {
                e.getPlayer().sendMessage(Strings.prefix + "§bVocê entrou no servidor invisível!");
                Bukkit.getPlayer(Jogadores.Keroch).chat("/invis");
            }
        } else if (e.getPlayer().getName().equalsIgnoreCase(Jogadores.FelipeHeroPlay)) {
            Bukkit.getServer().dispatchCommand(e.getPlayer(), "tfake");

            Bukkit.getPlayer(Jogadores.FelipeHeroPlay).setCustomName(Jogadores.FelipeHeroPlay);

            e.getPlayer().sendMessage(Strings.prefix + "§aBem-vindo de Volta FelipeHeroPlay! Alguma Ideia para fazer hoje no Mapa da Meel?");

            if (Bukkit.getPlayer(Jogadores.Meel) != null) {
                Bukkit.getPlayer(Jogadores.FelipeHeroPlay).sendTitle("§2§lA MEEL ESTÁ NO SERVIDOR!", "§7VOCÊ FICOU INVISÍVEL AUTOMATICAMENTE.");
                Variables.GmIntro = true;

                Bukkit.getPlayer(Jogadores.FelipeHeroPlay).sendMessage(Strings.prefix + "§bVocê ficou invisível para a Meel!");
                Bukkit.getPlayer(Jogadores.FelipeHeroPlay).chat("/invis");
            }

            if (Jogadores.admins.contains(e.getPlayer().getName())) {
                e.getPlayer().sendMessage(Strings.prefix + "§bVocê entrou no servidor invisível!");
                Bukkit.getPlayer(Jogadores.FelipeHeroPlay).chat("/invis");
            }
        } else if (e.getPlayer().getName().equalsIgnoreCase(Jogadores.Mariao)) {
            Bukkit.getServer().dispatchCommand(e.getPlayer(), "tfake");

            Bukkit.getPlayer(Jogadores.Mariao).setCustomName(Jogadores.Mariao);

            e.getPlayer().sendMessage(Strings.prefix + "§aBem-vindo de Volta Mariao! Alguma Ideia para fazer hoje no Mapa da Meel?");

            if (Bukkit.getPlayer(Jogadores.Meel) != null) {
                Bukkit.getPlayer(Jogadores.Mariao).sendTitle("§2§lA MEEL ESTÁ NO SERVIDOR!", "§7VOCÊ FICOU INVISÍVEL AUTOMATICAMENTE.");
                Variables.GmIntro = true;

                Bukkit.getPlayer(Jogadores.Mariao).sendMessage(Strings.prefix + "§bVocê ficou invisível para a Meel!");
                Bukkit.getPlayer(Jogadores.Mariao).chat("/invis");
            }

            if (Jogadores.admins.contains(e.getPlayer().getName())) {
                e.getPlayer().sendMessage(Strings.prefix + "§bVocê entrou no servidor invisível!");
                Bukkit.getPlayer(Jogadores.Mariao).chat("/invis");
            }
        } else {
            e.getPlayer().sendMessage(Strings.prefix + "§cVocê não está registrado no Projeto, Então a maioria dos comandos do Servidor não funcionan para você!");
        }
    }

    @EventHandler
    public void onPlayerLogin(PlayerLoginEvent e) {
        Bukkit.getServer().getConsoleSender().sendMessage(Strings.prefix + "§6§l-----------------------------");
        Bukkit.getServer().getConsoleSender().sendMessage(Strings.prefix + "§e§lNotificação: Jogador logando no servidor");
        Bukkit.getServer().getConsoleSender().sendMessage(Strings.prefix + "§e§lNick: " + e.getPlayer().getName());
        Bukkit.getServer().getConsoleSender().sendMessage(Strings.prefix + "§e§lUUID: " + e.getPlayer().getUniqueId());
        Bukkit.getServer().getConsoleSender().sendMessage(Strings.prefix + "§e§lIP: " + e.getPlayer().getAddress());
        Bukkit.getServer().getConsoleSender().sendMessage(Strings.prefix + "§6§l-----------------------------");

        for (Player p : Bukkit.getOnlinePlayers()) {
            if (Variables.Jogadores.contains(p.getName())) {
                p.sendMessage(Strings.prefix + "§6§l-----------------------------");
                p.sendMessage(Strings.prefix + "§e§lNotificação: Jogador logando no servidor");
                p.sendMessage(Strings.prefix + "§e§lNick: " + e.getPlayer().getName());
                p.sendMessage(Strings.prefix + "§e§lUUID: " + e.getPlayer().getUniqueId());
                p.sendMessage(Strings.prefix + "§e§lIP: " + e.getPlayer().getAddress());
                p.sendMessage(Strings.prefix + "§6§l-----------------------------");
            }
        }

        if (e.getPlayer().getName().equalsIgnoreCase(Jogadores.Meel)) {
            if (!Variables.Liberado) {
                e.disallow(Result.KICK_OTHER, Strings.prefix + "§aServidor ainda não foi liberado! §2Aguarde mais um pouco... :3 c;");
                Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "avisoconsole " + Jogadores.Meel + " tentou entrar no servidor, porém não estava liberado...");
                return;
            } else {
                return;
            }
        }

        if (Variables.Permitidos.contains(e.getPlayer().getName())) {
            new BukkitRunnable() {
                @Override
                public void run() {
                    Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "avisoconsole §c" + e.getPlayer().getName() + " conseguiu entrar no Servidor, pois está na lista de Permitidos! Para remover, Digite: /permitidos rem " + e.getPlayer().getName());
                }
            }.runTaskLater(Variables.plugin, 20L);
            return;
        }

        if (!Variables.Jogadores.contains(e.getPlayer().getName())) {
            if (!Variables.Block) {
                new BukkitRunnable() {
                    @Override
                    public void run() {
                        Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "avisoconsole §c" + e.getPlayer().getName() + " conseguiu entrar no Servidor pois §4§l§nNÃO ESTÁ BLOQUEADO§r! §aPara Bloquear, Digite: §b§l/block true");
                    }
                }.runTaskLater(Variables.plugin, 20L);
                return;
            }

            e.disallow(Result.KICK_OTHER, Strings.prefix + "§4Você não tem permissão para entrar neste servidor!");

            Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "avisoconsole §c" + e.getPlayer().getName() + " tentou entrar no Servidor!");
        }

    }

    @EventHandler
    public void onPlayerQuit(PlayerQuitEvent e) {
        Bukkit.getServer().getConsoleSender().sendMessage(Strings.prefix + "§4§l-----------------------------");
        Bukkit.getServer().getConsoleSender().sendMessage(Strings.prefix + "§c§lNotificação: Jogador saiu do servidor");
        Bukkit.getServer().getConsoleSender().sendMessage(Strings.prefix + "§c§lNick: " + e.getPlayer().getName());
        Bukkit.getServer().getConsoleSender().sendMessage(Strings.prefix + "§c§lUUID: " + e.getPlayer().getUniqueId());
        Bukkit.getServer().getConsoleSender().sendMessage(Strings.prefix + "§c§lIP: " + e.getPlayer().getAddress());
        Bukkit.getServer().getConsoleSender().sendMessage(Strings.prefix + "§4§l-----------------------------");

        for (Player p : Bukkit.getOnlinePlayers()) {
            if (Variables.Jogadores.contains(p.getName())) {
                p.sendMessage(Strings.prefix + "§4§l-----------------------------");
                p.sendMessage(Strings.prefix + "§c§lNotificação: Jogador saiu do servidor");
                p.sendMessage(Strings.prefix + "§c§lNick: " + e.getPlayer().getName());
                p.sendMessage(Strings.prefix + "§c§lUUID: " + e.getPlayer().getUniqueId());
                p.sendMessage(Strings.prefix + "§c§lIP: " + e.getPlayer().getAddress());
                p.sendMessage(Strings.prefix + "§4§l-----------------------------");
            }
        }

        e.setQuitMessage(null);

        if (e.getPlayer().isOp()) {
            e.getPlayer().setOp(false);
        }

        if (e.getPlayer().getName().equalsIgnoreCase(Jogadores.Intro)) {
            Jogadores.FakeNickIntro = "nenhum";
            Jogadores.FakePlayerIntro = false;
        }
        if (e.getPlayer().getName().equalsIgnoreCase(Jogadores.Meel)) {
            Jogadores.FakeNickMeel = "nenhum";
            Jogadores.FakePlayerMeel = false;
        }
        if (e.getPlayer().getName().equalsIgnoreCase(Jogadores.Diego)) {
            Jogadores.FakeNickDiego = "nenhum";
            Jogadores.FakePlayerDiego = false;
        }
        if (e.getPlayer().getName().equalsIgnoreCase(Jogadores.Sombra)) {
            Jogadores.FakeNickSombra = "nenhum";
            Jogadores.FakePlayerSombra = false;
        }
        if (e.getPlayer().getName().equalsIgnoreCase(Jogadores.Raymeki)) {
            Jogadores.FakeNickRaymeki = "nenhum";
            Jogadores.FakePlayerRaymeki = false;
        }
        if (e.getPlayer().getName().equalsIgnoreCase(Jogadores.Edder)) {
            Jogadores.FakeNickEdder = "nenhum";
            Jogadores.FakePlayerEdder = false;
        }
        if (e.getPlayer().getName().equalsIgnoreCase(Jogadores.Crazy)) {
            Jogadores.FakeNickCrazy = "nenhum";
            Jogadores.FakePlayerCrazy = false;
        }
        if (e.getPlayer().getName().equalsIgnoreCase(Jogadores.Dede)) {
            Jogadores.FakeNickDede = "nenhum";
            Jogadores.FakePlayerDede = false;
        }
        if (e.getPlayer().getName().equalsIgnoreCase(Jogadores.Beaats)) {
            Jogadores.FakeNickBeaats = "nenhum";
            Jogadores.FakePlayerBeaats = false;
        }
        if (e.getPlayer().getName().equalsIgnoreCase(Jogadores.Biidu)) {
            Jogadores.FakeNickBiidu = "nenhum";
            Jogadores.FakePlayerBiidu = false;
        }
        if (e.getPlayer().getName().equalsIgnoreCase(Jogadores.Keroch)) {
            Jogadores.FakeNickKeroch = "nenhum";
            Jogadores.FakePlayerKeroch = false;
        }
        if (e.getPlayer().getName().equalsIgnoreCase(Jogadores.FelipeHeroPlay)) {
            Jogadores.FakeNickFelipeHeroPlay = "nenhum";
            Jogadores.FakePlayerFelipeHeroPlay = false;
        }
        if (e.getPlayer().getName().equalsIgnoreCase(Jogadores.Mariao)) {
            Jogadores.FakeNickMariao = "nenhum";
            Jogadores.FakePlayerMariao = false;
        }

    }

}
