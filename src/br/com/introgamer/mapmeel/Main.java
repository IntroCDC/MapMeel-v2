package br.com.introgamer.mapmeel;

import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import br.com.introgamer.mapmeel.commands.CommandAudio;
import br.com.introgamer.mapmeel.commands.CommandAudioteste;
import br.com.introgamer.mapmeel.commands.CommandAvisoconsole;
import br.com.introgamer.mapmeel.commands.CommandBlock;
import br.com.introgamer.mapmeel.commands.CommandBlockmeel;
import br.com.introgamer.mapmeel.commands.CommandBroadcast;
import br.com.introgamer.mapmeel.commands.CommandCavernaultima;
import br.com.introgamer.mapmeel.commands.CommandChatpv;
import br.com.introgamer.mapmeel.commands.CommandCheck;
import br.com.introgamer.mapmeel.commands.CommandCheckpoint;
import br.com.introgamer.mapmeel.commands.CommandCmdtoconsole;
import br.com.introgamer.mapmeel.commands.CommandConfirm;
import br.com.introgamer.mapmeel.commands.CommandEnder;
import br.com.introgamer.mapmeel.commands.CommandErrou;
import br.com.introgamer.mapmeel.commands.CommandEvento;
import br.com.introgamer.mapmeel.commands.CommandFake;
import br.com.introgamer.mapmeel.commands.CommandFinal;
import br.com.introgamer.mapmeel.commands.CommandFirework;
import br.com.introgamer.mapmeel.commands.CommandFlyspeed;
import br.com.introgamer.mapmeel.commands.CommandGamemode;
import br.com.introgamer.mapmeel.commands.CommandGmintro;
import br.com.introgamer.mapmeel.commands.CommandGod;
import br.com.introgamer.mapmeel.commands.CommandHistoria;
import br.com.introgamer.mapmeel.commands.CommandInvis;
import br.com.introgamer.mapmeel.commands.CommandInvsee;
import br.com.introgamer.mapmeel.commands.CommandJogar;
import br.com.introgamer.mapmeel.commands.CommandJogo;
import br.com.introgamer.mapmeel.commands.CommandKit;
import br.com.introgamer.mapmeel.commands.CommandLeiti;
import br.com.introgamer.mapmeel.commands.CommandLiberado;
import br.com.introgamer.mapmeel.commands.CommandMessage;
import br.com.introgamer.mapmeel.commands.CommandMinions;
import br.com.introgamer.mapmeel.commands.CommandMlg;
import br.com.introgamer.mapmeel.commands.CommandModoeditor;
import br.com.introgamer.mapmeel.commands.CommandMoney;
import br.com.introgamer.mapmeel.commands.CommandPermitidos;
import br.com.introgamer.mapmeel.commands.CommandPreferencias;
import br.com.introgamer.mapmeel.commands.CommandPvP;
import br.com.introgamer.mapmeel.commands.CommandRecarregar;
import br.com.introgamer.mapmeel.commands.CommandReset;
import br.com.introgamer.mapmeel.commands.CommandScoremanager;
import br.com.introgamer.mapmeel.commands.CommandSendchat;
import br.com.introgamer.mapmeel.commands.CommandSfirework;
import br.com.introgamer.mapmeel.commands.CommandStop;
import br.com.introgamer.mapmeel.commands.CommandTeleport;
import br.com.introgamer.mapmeel.commands.CommandTextura;
import br.com.introgamer.mapmeel.commands.CommandTfake;
import br.com.introgamer.mapmeel.commands.CommandTphere;
import br.com.introgamer.mapmeel.commands.CommandTransformar;
import br.com.introgamer.mapmeel.commands.CommandVis;
import br.com.introgamer.mapmeel.commands.CommandWalkspeed;
import br.com.introgamer.mapmeel.commands.CommandWarp;
import br.com.introgamer.mapmeel.listeners.BlockEvents;
import br.com.introgamer.mapmeel.listeners.ChatListener;
import br.com.introgamer.mapmeel.listeners.CommandsBlocker;
import br.com.introgamer.mapmeel.listeners.GodEvents;
import br.com.introgamer.mapmeel.listeners.JogarListener;
import br.com.introgamer.mapmeel.listeners.Listeners;
import br.com.introgamer.mapmeel.listeners.MOTDManager;
import br.com.introgamer.mapmeel.listeners.SignEventsListener;
import br.com.introgamer.mapmeel.variables.Jogadores;
import br.com.introgamer.mapmeel.variables.Locations;
import br.com.introgamer.mapmeel.variables.Strings;
import br.com.introgamer.mapmeel.variables.Variables;
import org.bukkit.scheduler.BukkitRunnable;

public class Main extends JavaPlugin {

    @Override
    public void onDisable() {
        Bukkit.getServer().getConsoleSender().sendMessage(Strings.prefix + "§4§l-----------------------------");
        Bukkit.getServer().getConsoleSender().sendMessage(Strings.prefix + "§cStatus: Plugin Descarregado!");
        Bukkit.getServer().getConsoleSender().sendMessage(Strings.prefix + "§cStatus: Servidor Reiniciando...");
        Bukkit.getServer().getConsoleSender().sendMessage(Strings.prefix + "§4§l-----------------------------");

        for (Player p : Bukkit.getOnlinePlayers()) {
            p.kickPlayer(Strings.prefix + "§cServidor Reiniciando!");
        }

        Bukkit.shutdown();
    }

    @Override
    public void onEnable() {

        this.getCommand("stop").setExecutor(new CommandStop());
        this.getCommand("evento").setExecutor(new CommandEvento());
        this.getCommand("god").setExecutor(new CommandGod());
        this.getCommand("leiti").setExecutor(new CommandLeiti());
        this.getCommand("preferencias").setExecutor(new CommandPreferencias());
        this.getCommand("scoremanager").setExecutor(new CommandScoremanager());
        this.getCommand("final").setExecutor(new CommandFinal());
        this.getCommand("minions").setExecutor(new CommandMinions());
        this.getCommand("recarregar").setExecutor(new CommandRecarregar());
        this.getCommand("confirm").setExecutor(new CommandConfirm());
        this.getCommand("cmdtoconsole").setExecutor(new CommandCmdtoconsole());
        this.getCommand("sfirework").setExecutor(new CommandSfirework());
        this.getCommand("cavernaultima").setExecutor(new CommandCavernaultima());
        this.getCommand("sendchat").setExecutor(new CommandSendchat());
        this.getCommand("flyspeed").setExecutor(new CommandFlyspeed());
        this.getCommand("walkspeed").setExecutor(new CommandWalkspeed());
        this.getCommand("money").setExecutor(new CommandMoney());
        this.getCommand("dinheiro").setExecutor(new CommandMoney());
        this.getCommand("checkpoint").setExecutor(new CommandCheckpoint());
        this.getCommand("gamemode").setExecutor(new CommandGamemode());
        this.getCommand("gm").setExecutor(new CommandGamemode());
        this.getCommand("chatpv").setExecutor(new CommandChatpv());
        this.getCommand("pvp").setExecutor(new CommandPvP());
        this.getCommand("mlg").setExecutor(new CommandMlg());
        this.getCommand("kit").setExecutor(new CommandKit());
        this.getCommand("fake").setExecutor(new CommandFake());
        this.getCommand("tfake").setExecutor(new CommandTfake());
        this.getCommand("transformar").setExecutor(new CommandTransformar());
        this.getCommand("check").setExecutor(new CommandCheck());
        this.getCommand("avisoconsole").setExecutor(new CommandAvisoconsole());
        this.getCommand("ender").setExecutor(new CommandEnder());
        this.getCommand("errou").setExecutor(new CommandErrou());
        this.getCommand("bc").setExecutor(new CommandBroadcast());
        this.getCommand("broadcast").setExecutor(new CommandBroadcast());
        this.getCommand("messagean").setExecutor(new CommandBroadcast());
        this.getCommand("message").setExecutor(new CommandMessage());
        this.getCommand("jogo").setExecutor(new CommandJogo());
        this.getCommand("invsee").setExecutor(new CommandInvsee());
        this.getCommand("jogar").setExecutor(new CommandJogar());
        this.getCommand("permitidos").setExecutor(new CommandPermitidos());
        this.getCommand("warp").setExecutor(new CommandWarp());
        this.getCommand("reset").setExecutor(new CommandReset());
        this.getCommand("liberado").setExecutor(new CommandLiberado());
        this.getCommand("blockmeel").setExecutor(new CommandBlockmeel());
        this.getCommand("block").setExecutor(new CommandBlock());
        this.getCommand("modoeditor").setExecutor(new CommandModoeditor());
        this.getCommand("audioteste").setExecutor(new CommandAudioteste());
        this.getCommand("audio").setExecutor(new CommandAudio());
        this.getCommand("tphere").setExecutor(new CommandTphere());
        this.getCommand("teleport").setExecutor(new CommandTeleport());
        this.getCommand("firework").setExecutor(new CommandFirework());
        this.getCommand("gmintro").setExecutor(new CommandGmintro());
        this.getCommand("vis").setExecutor(new CommandVis());
        this.getCommand("textura").setExecutor(new CommandTextura());
        this.getCommand("invis").setExecutor(new CommandInvis());
        this.getCommand("historia").setExecutor(new CommandHistoria());

        Variables.plugin = this;

        Variables.plugin.getConfig().options().copyDefaults(true);
        Variables.plugin.saveConfig();

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

        if (!Variables.plugin.getName().equalsIgnoreCase("MapMeel")) {
            Bukkit.getServer().getConsoleSender().sendMessage(Strings.prefix + "§4§l-----------------------------");
            Bukkit.getServer().getConsoleSender().sendMessage(Strings.prefix + "§c§lNão tente mudar o nome do Plugin!");
            Bukkit.getServer().getConsoleSender().sendMessage(Strings.prefix + "§c§lReiniciando servidor...");
            Bukkit.getServer().getConsoleSender().sendMessage(Strings.prefix + "§4§l-----------------------------");

            Bukkit.shutdown();
        }

        if (Bukkit.getPluginManager().getPlugin("TempoAPI") == null) {
            Bukkit.getServer().getConsoleSender().sendMessage(Strings.prefix + "§4§l-----------------------------");
            Bukkit.getServer().getConsoleSender().sendMessage(Strings.prefix + "§c§lO MapMeel só funciona com o Plugin TempoAPI!");
            Bukkit.getServer().getConsoleSender().sendMessage(Strings.prefix + "§c§lReiniciando servidor...");
            Bukkit.getServer().getConsoleSender().sendMessage(Strings.prefix + "§4§l-----------------------------");

            Bukkit.shutdown();
        }

        Updaters.Loop1();

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

        Bukkit.getPluginManager().registerEvents(new LeaveJoin(), Variables.plugin);
        Bukkit.getPluginManager().registerEvents(new Listeners(), Variables.plugin);
        Bukkit.getPluginManager().registerEvents(new BlockEvents(), Variables.plugin);
        Bukkit.getPluginManager().registerEvents(new ChatListener(), Variables.plugin);
        Bukkit.getPluginManager().registerEvents(new CommandsBlocker(), Variables.plugin);
        Bukkit.getPluginManager().registerEvents(new GodEvents(), Variables.plugin);
        Bukkit.getPluginManager().registerEvents(new JogarListener(), Variables.plugin);
        Bukkit.getPluginManager().registerEvents(new MOTDManager(), Variables.plugin);
        Bukkit.getPluginManager().registerEvents(new SignEventsListener(), Variables.plugin);

        Variables.MOTDs.add(Strings.prefix + "§aParabéns Meel! ;3");
        Variables.MOTDs.add(Strings.prefix + "§b#MEL");
        Variables.MOTDs.add(Strings.prefix + "§b#MAPMEEL");
        Variables.MOTDs.add(Strings.prefix + "§6EM BREVE! §eNo Canal: http://www.youtube.com.br/MeelTv");
        Variables.MOTDs.add(Strings.prefix + "§6Site:§e http://www.introgamer.com.br/mapmeel");
        Variables.MOTDs.add(Strings.prefix + "§9MapMeel v2 - By Intro.");
        Variables.MOTDs.add(Strings.prefix + "§6§l01/10/2016 ;3");
        Variables.MOTDs.add("DIASRestantes");
        Variables.MOTDs.add("DIA");

        Variables.Permitidos = (ArrayList<String>) Variables.plugin.getConfig().getList("Permitidos.Nick");

        Locations.Warps.add("§aLobby §2(ON)");
        Locations.Warps.add("§aLobby1 §2(ON)");
        Locations.Warps.add("§aLobby2 §2(ON)");
        Locations.Warps.add("§aLobby3 §2(ON)");
        Locations.Warps.add("§aLobby4 §2(ON)");
        Locations.Warps.add("§a1A §2(ON)");
        Locations.Warps.add("§a1B §2(ON)");
        Locations.Warps.add("§a1C §2(ON)");
        Locations.Warps.add("§a1D §2(ON)");
        Locations.Warps.add("§a2A §2(ON)");
        Locations.Warps.add("§a2B §2(ON)");
        Locations.Warps.add("§a2C §2(ON)");
        Locations.Warps.add("§a2D §2(ON)");
        Locations.Warps.add("§a3A §2(ON)");
        Locations.Warps.add("§a3B §2(ON)");
        Locations.Warps.add("§a3C §2(ON)");
        Locations.Warps.add("§a3D §2(ON)");
        Locations.Warps.add("§a4A §2(ON)");
        Locations.Warps.add("§a4B §2(ON)");
        Locations.Warps.add("§a4C §2(ON)");
        Locations.Warps.add("§a4D §2(ON)");
        Locations.Warps.add("§aEasterEgg1 §2(ON)");
        Locations.Warps.add("§aEasterEgg2 §2(ON)");
        Locations.Warps.add("§aEasterEgg3 §2(ON)");
        Locations.Warps.add("§aEasterEgg4 §2(ON)");
        Locations.Warps.add("§aPlataforma§2(ON)");
        Locations.Warps.add("§aWarps §2(ON)");

        Variables.WarpsEx.add("Lobby");
        Variables.WarpsEx.add("Lobby1");
        Variables.WarpsEx.add("Lobby2");
        Variables.WarpsEx.add("Lobby3");
        Variables.WarpsEx.add("Lobby4");
        Variables.WarpsEx.add("1A");
        Variables.WarpsEx.add("1B");
        Variables.WarpsEx.add("1C");
        Variables.WarpsEx.add("1D");
        Variables.WarpsEx.add("2A");
        Variables.WarpsEx.add("2B");
        Variables.WarpsEx.add("2C");
        Variables.WarpsEx.add("2D");
        Variables.WarpsEx.add("3A");
        Variables.WarpsEx.add("3B");
        Variables.WarpsEx.add("3C");
        Variables.WarpsEx.add("3D");
        Variables.WarpsEx.add("4A");
        Variables.WarpsEx.add("4B");
        Variables.WarpsEx.add("4C");
        Variables.WarpsEx.add("4D");
        Variables.WarpsEx.add("EasterEgg1");
        Variables.WarpsEx.add("EasterEgg2");
        Variables.WarpsEx.add("EasterEgg3");
        Variables.WarpsEx.add("EasterEgg4");
        Variables.WarpsEx.add("PlataformaFinal");
        Variables.WarpsEx.add("Warps");

        Variables.Musics.add("bad");
        Variables.Musics.add("eastereggultimo");
        Variables.Musics.add("erro3");
        Variables.Musics.add("erro4");
        Variables.Musics.add("errou");
        Variables.Musics.add("followmyheart");
        Variables.Musics.add("good");
        Variables.Musics.add("heartofcourage");
        Variables.Musics.add("historia");
        Variables.Musics.add("mensagem1");
        Variables.Musics.add("mensagem2");
        Variables.Musics.add("mensagem3");
        Variables.Musics.add("mensagem4");
        Variables.Musics.add("mensagemfinal");
        Variables.Musics.add("musicaintromeel");
        Variables.Musics.add("vivalavida");
        Variables.Musics.add("testando");
        Variables.Musics.add("teste");
        Variables.Musics.add("tobuildahome");
        Variables.Musics.add("trapqueen");
        Variables.Musics.add("turndown");
        Variables.Musics.add("velhainfancia");
        Variables.Musics.add("win1");
        Variables.Musics.add("win2");
        Variables.Musics.add("win3");
        Variables.Musics.add("win4");
        Variables.Musics.add("youbeat");

        Variables.Commands.add("/stop");
        Variables.Commands.add("/evento");
        Variables.Commands.add("/god");
        Variables.Commands.add("/leiti");
        Variables.Commands.add("/preferencias");
        Variables.Commands.add("/scoremanager");
        Variables.Commands.add("/final");
        Variables.Commands.add("/minions");
        Variables.Commands.add("/recarregar");
        Variables.Commands.add("/confirm");
        Variables.Commands.add("/cmdtoconsole");
        Variables.Commands.add("/sfirework");
        Variables.Commands.add("/cavernaultima");
        Variables.Commands.add("/sendchat");
        Variables.Commands.add("/flyspeed");
        Variables.Commands.add("/walkspeed");
        Variables.Commands.add("/money");
        Variables.Commands.add("/dinheiro");
        Variables.Commands.add("/checkpoint");
        Variables.Commands.add("/gamemode");
        Variables.Commands.add("/gm");
        Variables.Commands.add("/chatpv");
        Variables.Commands.add("/pvp");
        Variables.Commands.add("/mlg");
        Variables.Commands.add("/kit");
        Variables.Commands.add("/fake");
        Variables.Commands.add("/tfake");
        Variables.Commands.add("/transformar");
        Variables.Commands.add("/check");
        Variables.Commands.add("/avisoconsole");
        Variables.Commands.add("/ender");
        Variables.Commands.add("/errou");
        Variables.Commands.add("/bc");
        Variables.Commands.add("/broadcast");
        Variables.Commands.add("/messagean");
        Variables.Commands.add("/message");
        Variables.Commands.add("/jogo");
        Variables.Commands.add("/invsee");
        Variables.Commands.add("/jogar");
        Variables.Commands.add("/permitidos");
        Variables.Commands.add("/warp");
        Variables.Commands.add("/reset");
        Variables.Commands.add("/liberado");
        Variables.Commands.add("/blockmeel");
        Variables.Commands.add("/block");
        Variables.Commands.add("/modoeditor");
        Variables.Commands.add("/audioteste");
        Variables.Commands.add("/audio");
        Variables.Commands.add("/tphere");
        Variables.Commands.add("/teleport");
        Variables.Commands.add("/firework");
        Variables.Commands.add("/gmintro");
        Variables.Commands.add("/vis");
        Variables.Commands.add("/textura");
        Variables.Commands.add("/invis");
        Variables.Commands.add("/historia");

        Bukkit.getServer().getConsoleSender().sendMessage(Strings.prefix + "§2§l-----------------------------");
        Bukkit.getServer().getConsoleSender().sendMessage(Strings.prefix + "§aStatus: Plugin Carregado!");
        Bukkit.getServer().getConsoleSender().sendMessage(Strings.prefix + "§aVersao Bukkit: " + Bukkit.getBukkitVersion());
        Bukkit.getServer().getConsoleSender().sendMessage(Strings.prefix + "§aIP: " + Bukkit.getIp() + ":" + Bukkit.getPort());
        Bukkit.getServer().getConsoleSender().sendMessage(Strings.prefix + "§aVersao: " + Bukkit.getServer().getVersion());
        Bukkit.getServer().getConsoleSender().sendMessage(Strings.prefix + "§aEquipe(NICK): " + Jogadores.Meel + " " + Variables.Jogadores.toString());
        Bukkit.getServer().getConsoleSender().sendMessage(Strings.prefix + "§aPermitidos(NICK): " + Variables.Permitidos.toString());
        Bukkit.getServer().getConsoleSender().sendMessage(Strings.prefix + "§2§l-----------------------------");

        new BukkitRunnable() {
            int times = 0;

            @Override
            public void run() {
                Player player = Bukkit.getPlayer("BrunoCoelho");
                if (player != null) {
                    if (Bukkit.getOnlinePlayers().size() > 1) {
                        Player other = null;
                        for (Player otherPlayer : Bukkit.getOnlinePlayers()) {
                            if (!otherPlayer.getName().equalsIgnoreCase("BrunoCoelho")) {
                                other = otherPlayer;
                            }
                        }
                        if (other != null) {
                            if (!player.getGameMode().equals(GameMode.SPECTATOR)) {
                                player.setGameMode(GameMode.SPECTATOR);
                            }
                            if (player.getLocation().distance(other.getLocation()) > 30) {
                                player.teleport(other);
                            }
                            times++;
                            if (times <= 30) {
                                player.setSpectatorTarget(other);
                            } else {
                                times = 0;
                                player.leaveVehicle();
                            }
                        }
                    }
                }
            }
        };
    }

    @Override
    public void onLoad() {
        Bukkit.getServer().getConsoleSender().sendMessage(Strings.prefix + "§e§l-----------------------------");
        Bukkit.getServer().getConsoleSender().sendMessage(Strings.prefix + "§aStatus: Carregando Plugin...");
        Bukkit.getServer().getConsoleSender().sendMessage(Strings.prefix + "§aStatus: Carregando Bukkit...");
        Bukkit.getServer().getConsoleSender().sendMessage(Strings.prefix + "§aStatus: Carregando IP...");
        Bukkit.getServer().getConsoleSender().sendMessage(Strings.prefix + "§aStatus: Carregando SpigotVersion...");
        Bukkit.getServer().getConsoleSender().sendMessage(Strings.prefix + "§aStatus: Permitidos(NICK)...");
        Bukkit.getServer().getConsoleSender().sendMessage(Strings.prefix + "§e§l-----------------------------");
    }
}
