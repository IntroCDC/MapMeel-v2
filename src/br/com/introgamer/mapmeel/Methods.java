package br.com.introgamer.mapmeel;

import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;

import br.com.introgamer.mapmeel.variables.Jogadores;
import br.com.introgamer.mapmeel.variables.Locations;
import br.com.introgamer.mapmeel.variables.Strings;
import br.com.introgamer.mapmeel.variables.Variables;
import br.com.introgamer.mapmeel.variables.scoreManager;

public class Methods {

    public static void Errou() {
        double perderPorErro = 1.0;

        if (Variables.MLGCommand) {
            Bukkit.getServer().broadcastMessage(Strings.prefix + "§4§lERROOOUUU O MLG!");
            Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "playsound mapmeel.errou @a -1662 50 639 50000 1");
            Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "clear " + Bukkit.getPlayer(Strings.BaldeMLGJogador).getName() + " water_bucket");
            Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "clear " + Bukkit.getPlayer(Strings.BaldeMLGJogador).getName() + " bucket");
            Bukkit.getPlayer(Strings.BaldeMLGJogador).setGameMode(GameMode.ADVENTURE);
            Variables.MLGYJogador = 0.0;
            Variables.failstotal++;
            Strings.BaldeMLGJogador = null;
            Variables.MLGMorreu = false;
            Variables.MLGCommand = false;

            if (Variables.Dinheiro < perderPorErro) {
                Variables.Dinheiro = 0.0;
                Bukkit.broadcastMessage(Strings.prefix + "§cVocê perdeu todo dinheiro por errar!");
            } else {
                Variables.Dinheiro = Variables.Dinheiro - perderPorErro;
                Bukkit.broadcastMessage(Strings.prefix + "§cVocê perdeu " + perderPorErro + " de Money por errar!");
            }

            return;
        }

        if (!Variables.Jogo) {
            Bukkit.getServer().broadcastMessage(Strings.prefix + "§4§lERROOOUUU O MLG!");
            Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "playsound mapmeel.errou @a -1662 50 639 50000 1");
            Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "clear @a water_bucket");
            Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "clear @a bucket");
            Variables.mlg = 2;

            if (Variables.Dinheiro < perderPorErro) {
                Variables.Dinheiro = 0.0;
                Bukkit.broadcastMessage(Strings.prefix + "§cVocê perdeu todo dinheiro por errar!");
            } else {
                Variables.Dinheiro = Variables.Dinheiro - perderPorErro;
                Bukkit.broadcastMessage(Strings.prefix + "§cVocê perdeu " + perderPorErro + " de Money por errar!");
            }

            return;
        }

        if (Variables.Dinheiro < perderPorErro) {
            Variables.Dinheiro = 0.0;
            Bukkit.broadcastMessage(Strings.prefix + "§cVocê perdeu todo dinheiro por errar!");
        } else {
            Variables.Dinheiro = Variables.Dinheiro - perderPorErro;
            Bukkit.broadcastMessage(Strings.prefix + "§cVocê perdeu " + perderPorErro + " de Money por errar!");
        }

        Variables.failstotal++;

        Variables.mlg = 0;

        Bukkit.getServer().broadcastMessage(Strings.prefix + "§4§lERROOOUUU! §cFails total: " + Variables.failstotal);

        Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "playsound mapmeel.errou @a -1662 50 639 50000 1");

        if (Variables.failstotal == 50) {
            for (Player p : Bukkit.getOnlinePlayers()) {
                p.sendTitle("§6§l#Meel50Deaths", "§7Será que consegue 100? kkkkkk ;3 (zuera kk)");
            }
        } else if (Variables.failstotal == 100) {
            for (Player p : Bukkit.getOnlinePlayers()) {
                p.sendTitle("§6§l#Meel100Deaths", "§7Será que consegue 150? kkkkkk ;3 (zuera kk)");
            }
        } else if (Variables.failstotal == 150) {
            for (Player p : Bukkit.getOnlinePlayers()) {
                p.sendTitle("§6§l#Meel150Deaths", "§7Será que consegue 200? kkkkkk ;3 (zuera kk)");
            }
        } else if (Variables.failstotal == 200) {
            for (Player p : Bukkit.getOnlinePlayers()) {
                p.sendTitle("§6§l#Meel200Deaths", "§7Será que consegue 250? kkkkkk ;3 (zuera kk)");
            }
        } else if (Variables.failstotal == 250) {
            for (Player p : Bukkit.getOnlinePlayers()) {
                p.sendTitle("§6§l#Meel250Deaths", "§7Será que consegue 300? kkkkkk ;3 (zuera kk)");
            }
        } else if (Variables.failstotal == 300) {
            for (Player p : Bukkit.getOnlinePlayers()) {
                p.sendTitle("§6§l#Meel300Deaths", "§7Será que consegue 350? kkkkkk ;3 (zuera kk)");
            }
        } else if (Variables.failstotal == 350) {
            for (Player p : Bukkit.getOnlinePlayers()) {
                p.sendTitle("§6§l#Meel350Deaths", "§7Será que consegue 400? kkkkkk ;3 (zuera kk)");
            }
        } else if (Variables.failstotal == 400) {
            for (Player p : Bukkit.getOnlinePlayers()) {
                p.sendTitle("§6§l#Meel400Deaths", "§7Será que consegue 450? kkkkkk ;3 (zuera kk)");
            }
        } else if (Variables.failstotal == 450) {
            for (Player p : Bukkit.getOnlinePlayers()) {
                p.sendTitle("§6§l#Meel450Deaths", "§7Será que consegue 500? kkkkkk ;3 (zuera kk)");
            }
        } else if (Variables.failstotal == 500) {
            for (Player p : Bukkit.getOnlinePlayers()) {
                p.sendTitle("§6§l#Meel500Deaths", "§7Carai '=' 500 Deaths em kk");
            }
        }
    }

    public static void PararAudio() {
        Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "playsound mapmeel.errou @a -1662 50 639 50000 1");

        new BukkitRunnable() {
            @Override
            public void run() {
                Variables.Audio++;
                if (Variables.Audio >= 10) {
                    Variables.Audio = 0;
                    try {
                        Bukkit.getPlayer(Strings.Jogador).sendMessage(Strings.prefix + "§6Áudio parado com Sucesso!");
                    } catch (Exception e) {
                        Bukkit.getServer().getConsoleSender().sendMessage(Strings.prefix + "§6Ocorreu um erro ao pegar o Jogador In-Game de /audio parar");
                        Bukkit.getServer().getConsoleSender().sendMessage(Strings.prefix + "§6Áudio parado com Sucesso!");
                    }
                    return;
                }
                Methods.PararAudio();
            }
        }.runTaskLater(Variables.plugin, 2L);
    }

    public static void Reload() {
        Variables.plugin.reloadConfig();

        Variables.Permitidos = (ArrayList<String>) Variables.plugin.getConfig().getList("Permitidos.Nick");

        Jogadores.Intro = Variables.plugin.getConfig().getString("Jogadores.Intro.Nick").replace("&", "§");
        Jogadores.CustonNameIntro = Variables.plugin.getConfig().getString("Jogadores.Intro.Cor").replace("&", "§");

        Jogadores.Diego = Variables.plugin.getConfig().getString("Jogadores.Diego.Nick").replace("&", "§");
        Jogadores.CustonNameDiego = Variables.plugin.getConfig().getString("Jogadores.Diego.Cor").replace("&", "§");

        Jogadores.Sombra = Variables.plugin.getConfig().getString("Jogadores.Sombra.Nick").replace("&", "§");
        Jogadores.CustonNameSombra = Variables.plugin.getConfig().getString("Jogadores.Sombra.Cor").replace("&", "§");

        Jogadores.Meel = Variables.plugin.getConfig().getString("Jogadores.Meel.Nick").replace("&", "§");
        Jogadores.CustonNameMeel = Variables.plugin.getConfig().getString("Jogadores.Meel.Cor").replace("&", "§");

        Jogadores.Raymeki = Variables.plugin.getConfig().getString("Jogadores.Raymeki.Nick").replace("&", "§");
        Jogadores.CustonNameRaymeki = Variables.plugin.getConfig().getString("Jogadores.Raymeki.Cor").replace("&", "§");

        Jogadores.Edder = Variables.plugin.getConfig().getString("Jogadores.Edder.Nick").replace("&", "§");
        Jogadores.CustonNameEdder = Variables.plugin.getConfig().getString("Jogadores.Edder.Cor").replace("&", "§");

        Jogadores.Crazy = Variables.plugin.getConfig().getString("Jogadores.Crazy.Nick").replace("&", "§");
        Jogadores.CustonNameCrazy = Variables.plugin.getConfig().getString("Jogadores.Crazy.Cor").replace("&", "§");

        Jogadores.Dede = Variables.plugin.getConfig().getString("Jogadores.Dede.Nick").replace("&", "§");
        Jogadores.CustonNameDede = Variables.plugin.getConfig().getString("Jogadores.Dede.Cor".replace("&", "§"));

        Jogadores.Beaats = Variables.plugin.getConfig().getString("Jogadores.Beaats.Nick").replace("&", "§");
        Jogadores.CustonNameBeaats = Variables.plugin.getConfig().getString("Jogadores.Beaats.Cor").replace("&", "§");

        Jogadores.Biidu = Variables.plugin.getConfig().getString("Jogadores.Biidu.Nick").replace("&", "§");
        Jogadores.CustonNameBiidu = Variables.plugin.getConfig().getString("Jogadores.Biidu.Cor").replace("&", "§");

        Jogadores.Keroch = Variables.plugin.getConfig().getString("Jogadores.Keroch.Nick").replace("&", "§");
        Jogadores.CustonNameKeroch = Variables.plugin.getConfig().getString("Jogadores.Keroch.Cor").replace("&", "§");

        Jogadores.FelipeHeroPlay = Variables.plugin.getConfig().getString("Jogadores.FelipeHeroPlay.Nick").replace("&", "§");
        Jogadores.CustonNameFelipeHeroPlay = Variables.plugin.getConfig().getString("Jogadores.FelipeHeroPlay.Cor").replace("&", "§");

        Jogadores.Mariao = Variables.plugin.getConfig().getString("Jogadores.Mariao.Nick").replace("&", "§");
        Jogadores.CustonNameMariao = Variables.plugin.getConfig().getString("Jogadores.Mariao.Cor").replace("&", "§");

        Variables.Jogadores.clear();

        Variables.Jogadores.add(Jogadores.Intro);
        Variables.Jogadores.add(Jogadores.Diego);
        Variables.Jogadores.add(Jogadores.Sombra);
        Variables.Jogadores.add(Jogadores.Raymeki);
        Variables.Jogadores.add(Jogadores.Edder);
        Variables.Jogadores.add(Jogadores.Crazy);
        Variables.Jogadores.add(Jogadores.Dede);
        Variables.Jogadores.add(Jogadores.Beaats);
        Variables.Jogadores.add(Jogadores.Biidu);
        Variables.Jogadores.add(Jogadores.Keroch);
        Variables.Jogadores.add(Jogadores.FelipeHeroPlay);
        Variables.Jogadores.add(Jogadores.Mariao);

        for (Player p : Bukkit.getOnlinePlayers()) {
            if (Variables.Block) {
                if (!Variables.Permitidos.contains(p.getName()) && !Variables.Jogadores.contains(p.getName()) && !p.getName().equalsIgnoreCase(Jogadores.Meel)) {
                    p.kickPlayer(Strings.prefix + "§4Você não tem permissão para entrar neste servidor!");
                }
            }
        }

    }

    public static void Reset() {
        if (Bukkit.getPlayer(Jogadores.Intro) == null) {
            Bukkit.getServer().getConsoleSender().sendMessage(Strings.prefix + "§4O Reset só pode ser efetuado com o " + Jogadores.Intro + " online no Servidor!");
            return;
        }

        Bukkit.getPlayer(Jogadores.Intro).teleport(Locations.easteregg1);
        Bukkit.broadcastMessage(Strings.prefix + "§cServidor/Mapa Resetando...");

        new BukkitRunnable() {
            @Override
            public void run() {
                Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "setblock -2173 68 627 minecraft:redstone_torch");
                Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "setblock -2173 66 611 minecraft:redstone_torch");
            }
        }.runTaskLater(Variables.plugin, 20L);

        Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "scoreboard players reset @a");

        scoreManager.tipo = "Carregando Leveis...";

        Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "scoreboard players set @a Fase1a 0");
        Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "scoreboard players set @a Fase1b 0");
        Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "scoreboard players set @a Fase1c 0");
        Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "scoreboard players set @a Fase1d 0");
        Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "scoreboard players set @a Fase2a 0");
        Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "scoreboard players set @a Fase2b 0");
        Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "scoreboard players set @a Fase2bD 0");
        Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "scoreboard players set @a Fase2c 0");
        Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "scoreboard players set @a Fase2d 0");
        Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "scoreboard players set @a Fase3a 0");
        Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "scoreboard players set @a Fase3aD 0");
        Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "scoreboard players set @a Fase3b 0");
        Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "scoreboard players set @a Fase3c 0");
        Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "scoreboard players set @a Fase3d 0");
        Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "scoreboard players set @a Fase4a 0");
        Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "scoreboard players set @a Fase4b 0");
        Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "scoreboard players set @a Fase4c 0");
        Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "scoreboard players set @a Fase4d 0");
        Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "scoreboard players set @a Fase4dD 0");
        Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "scoreboard players set @a Variables.failstotal 0");
        Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "scoreboard players set @a fails 0");

        Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "gamemode 2 @a");

        Bukkit.broadcastMessage(Strings.prefix + "§aServidor/Mapa Resetado!");

        new BukkitRunnable() {

            @Override
            public void run() {

                for (Player p : Bukkit.getOnlinePlayers()) {
                    if (!Variables.Jogadores.contains(p.getName()) && !Variables.Permitidos.contains(p.getName())) {
                        p.kickPlayer(Strings.prefix + "§cServidor/Mapa Resetado!");
                    }
                }

                Variables.Primeira = true;

                Variables.Liberado = false;

                Variables.Dinheiro = 0.0;

                Variables.ModoEditor = false;
                Variables.GmIntro = false;

                Variables.Jogo = false;
                Variables.mlg = 0;

                Variables.failstotal = 0;

                Bukkit.getServer().getConsoleSender().sendMessage(Strings.prefix + "§aServidor/Mapa Resetado!");

            }
        }.runTaskLater(Variables.plugin, 20L);
    }

}
