package br.com.introgamer.mapmeel.variables;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.scoreboard.DisplaySlot;
import org.bukkit.scoreboard.Objective;
import org.bukkit.scoreboard.Score;
import org.bukkit.scoreboard.Scoreboard;

public class scoreManager {

    public static scoreManager scoreManager = new scoreManager();

    public static String tipo = "Carregando Leveis...";

    public static scoreManager getManager() {
        return scoreManager;
    }

    public void Scoreboard(Player p) {

        Scoreboard ScoreMap = Bukkit.getScoreboardManager().getNewScoreboard();

        Objective objMapMeel = ScoreMap.registerNewObjective("ScoreMapMeel", "dummy");

        objMapMeel.setDisplayName(Strings.Mapa);
        objMapMeel.setDisplaySlot(DisplaySlot.SIDEBAR);

        if (p.getName().equalsIgnoreCase(Jogadores.Intro)) {
            if (Jogadores.FakePlayerIntro) {
                Score nick = objMapMeel.getScore("§f§lNick: " + Jogadores.CustonNameIntro + Jogadores.FakeNickIntro);
                nick.setScore(8);
            } else {
                Score nick = objMapMeel.getScore("§f§lNick: " + Jogadores.CustonNameIntro + Jogadores.Intro);
                nick.setScore(8);
            }
        } else if (p.getName().equalsIgnoreCase(Jogadores.Meel)) {
            if (Jogadores.FakePlayerMeel) {
                Score nick = objMapMeel.getScore("§f§lNick: " + Jogadores.CustonNameMeel + Jogadores.FakeNickMeel);
                nick.setScore(8);
            } else {
                Score nick = objMapMeel.getScore("§f§lNick: " + Jogadores.CustonNameMeel + Jogadores.Meel);
                nick.setScore(8);
            }
        } else if (p.getName().equalsIgnoreCase(Jogadores.Diego)) {
            if (Jogadores.FakePlayerDiego) {
                Score nick = objMapMeel.getScore("§f§lNick: " + Jogadores.CustonNameDiego + Jogadores.FakeNickDiego);
                nick.setScore(8);
            } else {
                Score nick = objMapMeel.getScore("§f§lNick: " + Jogadores.CustonNameDiego + Jogadores.Diego);
                nick.setScore(8);
            }
        } else if (p.getName().equalsIgnoreCase(Jogadores.Sombra)) {
            if (Jogadores.FakePlayerSombra) {
                Score nick = objMapMeel.getScore("§f§lNick: " + Jogadores.CustonNameSombra + Jogadores.FakeNickSombra);
                nick.setScore(8);
            } else {
                Score nick = objMapMeel.getScore("§f§lNick: " + Jogadores.CustonNameSombra + Jogadores.Sombra);
                nick.setScore(8);
            }
        } else if (p.getName().equalsIgnoreCase(Jogadores.Raymeki)) {
            if (Jogadores.FakePlayerRaymeki) {
                Score nick = objMapMeel.getScore("§f§lNick: " + Jogadores.CustonNameRaymeki + Jogadores.FakeNickRaymeki);
                nick.setScore(8);
            } else {
                Score nick = objMapMeel.getScore("§f§lNick: " + Jogadores.CustonNameRaymeki + Jogadores.Raymeki);
                nick.setScore(8);
            }
        } else if (p.getName().equalsIgnoreCase(Jogadores.Crazy)) {
            if (Jogadores.FakePlayerCrazy) {
                Score nick = objMapMeel.getScore("§f§lNick: " + Jogadores.CustonNameCrazy + Jogadores.FakeNickCrazy);
                nick.setScore(8);
            } else {
                Score nick = objMapMeel.getScore("§f§lNick: " + Jogadores.CustonNameCrazy + Jogadores.Crazy);
                nick.setScore(8);
            }
        } else if (p.getName().equalsIgnoreCase(Jogadores.Dede)) {
            if (Jogadores.FakePlayerDede) {
                Score nick = objMapMeel.getScore("§f§lNick: " + Jogadores.CustonNameDede + Jogadores.FakeNickDede);
                nick.setScore(8);
            } else {
                Score nick = objMapMeel.getScore("§f§lNick: " + Jogadores.CustonNameDede + Jogadores.Dede);
                nick.setScore(8);
            }
        } else if (p.getName().equalsIgnoreCase(Jogadores.Beaats)) {
            if (Jogadores.FakePlayerBeaats) {
                Score nick = objMapMeel.getScore("§f§lNick: " + Jogadores.CustonNameBeaats + Jogadores.FakeNickBeaats);
                nick.setScore(8);
            } else {
                Score nick = objMapMeel.getScore("§f§lNick: " + Jogadores.CustonNameBeaats + Jogadores.Beaats);
                nick.setScore(8);
            }
        } else if (p.getName().equalsIgnoreCase(Jogadores.Biidu)) {
            if (Jogadores.FakePlayerBiidu) {
                Score nick = objMapMeel.getScore("§f§lNick: " + Jogadores.CustonNameBiidu + Jogadores.FakeNickBiidu);
                nick.setScore(8);
            } else {
                Score nick = objMapMeel.getScore("§f§lNick: " + Jogadores.CustonNameBiidu + Jogadores.Biidu);
                nick.setScore(8);
            }
        } else if (p.getName().equalsIgnoreCase(Jogadores.Keroch)) {
            if (Jogadores.FakePlayerKeroch) {
                Score nick = objMapMeel.getScore("§f§lNick: " + Jogadores.CustonNameKeroch + Jogadores.FakeNickKeroch);
                nick.setScore(8);
            } else {
                Score nick = objMapMeel.getScore("§f§lNick: " + Jogadores.CustonNameKeroch + Jogadores.Keroch);
                nick.setScore(8);
            }
        } else if (p.getName().equalsIgnoreCase(Jogadores.FelipeHeroPlay)) {
            if (Jogadores.FakePlayerFelipeHeroPlay) {
                Score nick = objMapMeel.getScore("§f§lNick: " + Jogadores.CustonNameFelipeHeroPlay + Jogadores.FakeNickFelipeHeroPlay);
                nick.setScore(8);
            } else {
                Score nick = objMapMeel.getScore("§f§lNick: " + Jogadores.CustonNameFelipeHeroPlay + Jogadores.FelipeHeroPlay);
                nick.setScore(8);
            }
        } else if (p.getName().equalsIgnoreCase(Jogadores.Mariao)) {
            if (Jogadores.FakePlayerMariao) {
                Score nick = objMapMeel.getScore("§f§lNick: " + Jogadores.CustonNameMariao + Jogadores.FakeNickMariao);
                nick.setScore(8);
            } else {
                Score nick = objMapMeel.getScore("§f§lNick: " + Jogadores.CustonNameMariao + Jogadores.Mariao);
                nick.setScore(8);
            }
        } else {
            Score nick = objMapMeel.getScore("§f§lNick: " + Jogadores.CustonNameUnregistered + p.getName());
            nick.setScore(8);
        }

        if (Jogadores.admins.contains(p.getName())) {
            Score admin = objMapMeel.getScore("§f§o(Você está invisível!)");
            admin.setScore(7);
        } else {
            Score admin = objMapMeel.getScore("§9");
            admin.setScore(7);
        }

        Score level = objMapMeel.getScore("§f§lLevel: §a§l" + tipo);
        level.setScore(6);

        if (Variables.inGod.contains(p.getName())) {
            Score God = objMapMeel.getScore("§e§o(Modo God Ativado!)");
            God.setScore(5);
        } else {
            Score God = objMapMeel.getScore("§e");
            God.setScore(5);
        }

        Score fails = objMapMeel.getScore("§f§lFails: §c§l" + Variables.failstotal);
        fails.setScore(4);

        Score nada03 = objMapMeel.getScore("§7");
        nada03.setScore(3);

        Score money = objMapMeel.getScore("§f§lMoney: §2§l" + Variables.Dinheiro);
        money.setScore(2);

        Score nada04 = objMapMeel.getScore("§6");
        nada04.setScore(1);

        Score tempo = objMapMeel.getScore("§f§lTempo: §e§l" + br.com.introgamer.tempoon.Variables.Horas + "H, " + br.com.introgamer.tempoon.Variables.Minutos + "M, " + br.com.introgamer.tempoon.Variables.Segundos + "S");
        tempo.setScore(0);

        p.setScoreboard(ScoreMap);
    }

}
