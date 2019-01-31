package br.com.introgamer.mapmeel.commands;

import java.util.Collections;

import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.craftbukkit.v1_8_R3.CraftServer;
import org.bukkit.craftbukkit.v1_8_R3.entity.CraftPlayer;
import org.bukkit.entity.Player;

import br.com.introgamer.mapmeel.variables.Jogadores;
import br.com.introgamer.mapmeel.variables.Strings;
import br.com.introgamer.mapmeel.variables.Variables;
import me.libraryaddict.disguise.DisguiseAPI;
import net.minecraft.server.v1_8_R3.PlayerList;

public class CommandVis implements CommandExecutor {

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
            Bukkit.getServer().getConsoleSender().sendMessage(Strings.prefix + Strings.inGame);
            return true;
        }

        Jogadores.admins.remove(sender.getName());

        if (DisguiseAPI.isDisguised((Player) sender)) {
            if (sender.getName().equalsIgnoreCase(Jogadores.Intro)) {
                if (Jogadores.FakePlayerIntro) {
                    ((Player) sender).setPlayerListName(Jogadores.FakeNickIntro);
                    ((Player) sender).setDisplayName(Jogadores.FakeNickIntro);
                    PlayerList playerList = ((CraftServer) Bukkit.getServer()).getHandle();
                    playerList.d(((CraftPlayer) sender).getHandle());

                    sender.sendMessage(Strings.prefix + "§6Fake em Modo player Ativado! Nick: §e" + Jogadores.FakeNickIntro);
                } else {
                    ((Player) sender).setPlayerListName(Strings.Mapa);
                    ((Player) sender).setDisplayName(Strings.Mapa + "§f");
                    PlayerList playerList = ((CraftServer) Bukkit.getServer()).getHandle();
                    playerList.d(((CraftPlayer) sender).getHandle());

                    sender.sendMessage(Strings.prefix + "§6Fake em Modo Etidade Ativado! Entidade: §e" + Jogadores.FakeNickIntro);
                }
            } else if (sender.getName().equalsIgnoreCase(Jogadores.Meel)) {
                if (Jogadores.FakePlayerMeel) {
                    ((Player) sender).setPlayerListName(Jogadores.FakeNickMeel);
                    ((Player) sender).setDisplayName(Jogadores.FakeNickMeel);
                    PlayerList playerList = ((CraftServer) Bukkit.getServer()).getHandle();
                    playerList.d(((CraftPlayer) sender).getHandle());

                    sender.sendMessage(Strings.prefix + "§6Fake em Modo player Ativado! Nick: §e" + Jogadores.FakeNickMeel);
                } else {
                    ((Player) sender).setPlayerListName(Strings.Mapa);
                    ((Player) sender).setDisplayName(Strings.Mapa + "§f");
                    PlayerList playerList = ((CraftServer) Bukkit.getServer()).getHandle();
                    playerList.d(((CraftPlayer) sender).getHandle());

                    sender.sendMessage(Strings.prefix + "§6Fake em Modo Etidade Ativado! Entidade: §e" + Jogadores.FakeNickMeel);
                }
            } else if (sender.getName().equalsIgnoreCase(Jogadores.Diego)) {
                if (Jogadores.FakePlayerDiego) {
                    ((Player) sender).setPlayerListName(Jogadores.FakeNickDiego);
                    ((Player) sender).setDisplayName(Jogadores.FakeNickDiego);
                    PlayerList playerList = ((CraftServer) Bukkit.getServer()).getHandle();
                    playerList.d(((CraftPlayer) sender).getHandle());

                    sender.sendMessage(Strings.prefix + "§6Fake em Modo player Ativado! Nick: §e" + Jogadores.FakeNickDiego);
                } else {
                    ((Player) sender).setPlayerListName(Strings.Mapa);
                    ((Player) sender).setDisplayName(Strings.Mapa + "§f");
                    PlayerList playerList = ((CraftServer) Bukkit.getServer()).getHandle();
                    playerList.d(((CraftPlayer) sender).getHandle());

                    sender.sendMessage(Strings.prefix + "§6Fake em Modo Etidade Ativado! Entidade: §e" + Jogadores.FakeNickDiego);
                }
            } else if (sender.getName().equalsIgnoreCase(Jogadores.Sombra)) {
                if (Jogadores.FakePlayerSombra) {
                    ((Player) sender).setPlayerListName(Jogadores.FakeNickSombra);
                    ((Player) sender).setDisplayName(Jogadores.FakeNickSombra);
                    PlayerList playerList = ((CraftServer) Bukkit.getServer()).getHandle();
                    playerList.d(((CraftPlayer) sender).getHandle());

                    sender.sendMessage(Strings.prefix + "§6Fake em Modo player Ativado! Nick: §e" + Jogadores.FakeNickSombra);
                } else {
                    ((Player) sender).setPlayerListName(Strings.Mapa);
                    ((Player) sender).setDisplayName(Strings.Mapa + "§f");
                    PlayerList playerList = ((CraftServer) Bukkit.getServer()).getHandle();
                    playerList.d(((CraftPlayer) sender).getHandle());

                    sender.sendMessage(Strings.prefix + "§6Fake em Modo Etidade Ativado! Entidade: §e" + Jogadores.FakeNickSombra);
                }
            } else if (sender.getName().equalsIgnoreCase(Jogadores.Raymeki)) {
                if (Jogadores.FakePlayerRaymeki) {
                    ((Player) sender).setPlayerListName(Jogadores.FakeNickRaymeki);
                    ((Player) sender).setDisplayName(Jogadores.FakeNickRaymeki);
                    PlayerList playerList = ((CraftServer) Bukkit.getServer()).getHandle();
                    playerList.d(((CraftPlayer) sender).getHandle());

                    sender.sendMessage(Strings.prefix + "§6Fake em Modo player Ativado! Nick: §e" + Jogadores.FakeNickRaymeki);
                } else {
                    ((Player) sender).setPlayerListName(Strings.Mapa);
                    ((Player) sender).setDisplayName(Strings.Mapa + "§f");
                    PlayerList playerList = ((CraftServer) Bukkit.getServer()).getHandle();
                    playerList.d(((CraftPlayer) sender).getHandle());

                    sender.sendMessage(Strings.prefix + "§6Fake em Modo Etidade Ativado! Entidade: §e" + Jogadores.FakeNickRaymeki);
                }
            } else if (sender.getName().equalsIgnoreCase(Jogadores.Edder)) {
                if (Jogadores.FakePlayerEdder) {
                    ((Player) sender).setPlayerListName(Jogadores.FakeNickEdder);
                    ((Player) sender).setDisplayName(Jogadores.FakeNickEdder);
                    PlayerList playerList = ((CraftServer) Bukkit.getServer()).getHandle();
                    playerList.d(((CraftPlayer) sender).getHandle());

                    sender.sendMessage(Strings.prefix + "§6Fake em Modo player Ativado! Nick: §e" + Jogadores.FakeNickEdder);
                } else {
                    ((Player) sender).setPlayerListName(Strings.Mapa);
                    ((Player) sender).setDisplayName(Strings.Mapa + "§f");
                    PlayerList playerList = ((CraftServer) Bukkit.getServer()).getHandle();
                    playerList.d(((CraftPlayer) sender).getHandle());

                    sender.sendMessage(Strings.prefix + "§6Fake em Modo Etidade Ativado! Entidade: §e" + Jogadores.FakeNickEdder);
                }
            } else if (sender.getName().equalsIgnoreCase(Jogadores.Crazy)) {
                if (Jogadores.FakePlayerCrazy) {
                    ((Player) sender).setPlayerListName(Jogadores.FakeNickCrazy);
                    ((Player) sender).setDisplayName(Jogadores.FakeNickCrazy);
                    PlayerList playerList = ((CraftServer) Bukkit.getServer()).getHandle();
                    playerList.d(((CraftPlayer) sender).getHandle());

                    sender.sendMessage(Strings.prefix + "§6Fake em Modo player Ativado! Nick: §e" + Jogadores.FakeNickCrazy);
                } else {
                    ((Player) sender).setPlayerListName(Strings.Mapa);
                    ((Player) sender).setDisplayName(Strings.Mapa + "§f");
                    PlayerList playerList = ((CraftServer) Bukkit.getServer()).getHandle();
                    playerList.d(((CraftPlayer) sender).getHandle());

                    sender.sendMessage(Strings.prefix + "§6Fake em Modo Etidade Ativado! Entidade: §e" + Jogadores.FakeNickCrazy);
                }
            } else if (sender.getName().equalsIgnoreCase(Jogadores.Dede)) {
                if (Jogadores.FakePlayerDede) {
                    ((Player) sender).setPlayerListName(Jogadores.FakeNickDede);
                    ((Player) sender).setDisplayName(Jogadores.FakeNickDede);
                    PlayerList playerList = ((CraftServer) Bukkit.getServer()).getHandle();
                    playerList.d(((CraftPlayer) sender).getHandle());

                    sender.sendMessage(Strings.prefix + "§6Fake em Modo player Ativado! Nick: §e" + Jogadores.FakeNickDede);
                } else {
                    ((Player) sender).setPlayerListName(Strings.Mapa);
                    ((Player) sender).setDisplayName(Strings.Mapa + "§f");
                    PlayerList playerList = ((CraftServer) Bukkit.getServer()).getHandle();
                    playerList.d(((CraftPlayer) sender).getHandle());

                    sender.sendMessage(Strings.prefix + "§6Fake em Modo Etidade Ativado! Entidade: §e" + Jogadores.FakeNickDede);
                }
            } else if (sender.getName().equalsIgnoreCase(Jogadores.Beaats)) {
                if (Jogadores.FakePlayerBeaats) {
                    ((Player) sender).setPlayerListName(Jogadores.FakeNickBeaats);
                    ((Player) sender).setDisplayName(Jogadores.FakeNickBeaats);
                    PlayerList playerList = ((CraftServer) Bukkit.getServer()).getHandle();
                    playerList.d(((CraftPlayer) sender).getHandle());

                    sender.sendMessage(Strings.prefix + "§6Fake em Modo player Ativado! Nick: §e" + Jogadores.FakeNickBeaats);
                } else {
                    ((Player) sender).setPlayerListName(Strings.Mapa);
                    ((Player) sender).setDisplayName(Strings.Mapa + "§f");
                    PlayerList playerList = ((CraftServer) Bukkit.getServer()).getHandle();
                    playerList.d(((CraftPlayer) sender).getHandle());

                    sender.sendMessage(Strings.prefix + "§6Fake em Modo Etidade Ativado! Entidade: §e" + Jogadores.FakeNickBeaats);
                }
            } else if (sender.getName().equalsIgnoreCase(Jogadores.Biidu)) {
                if (Jogadores.FakePlayerBiidu) {
                    ((Player) sender).setPlayerListName(Jogadores.FakeNickBiidu);
                    ((Player) sender).setDisplayName(Jogadores.FakeNickBiidu);
                    PlayerList playerList = ((CraftServer) Bukkit.getServer()).getHandle();
                    playerList.d(((CraftPlayer) sender).getHandle());

                    sender.sendMessage(Strings.prefix + "§6Fake em Modo player Ativado! Nick: §e" + Jogadores.FakeNickBiidu);
                } else {
                    ((Player) sender).setPlayerListName(Strings.Mapa);
                    ((Player) sender).setDisplayName(Strings.Mapa + "§f");
                    PlayerList playerList = ((CraftServer) Bukkit.getServer()).getHandle();
                    playerList.d(((CraftPlayer) sender).getHandle());

                    sender.sendMessage(Strings.prefix + "§6Fake em Modo Etidade Ativado! Entidade: §e" + Jogadores.FakeNickBiidu);
                }
            } else if (sender.getName().equalsIgnoreCase(Jogadores.Keroch)) {
                if (Jogadores.FakePlayerKeroch) {
                    ((Player) sender).setPlayerListName(Jogadores.FakeNickKeroch);
                    ((Player) sender).setDisplayName(Jogadores.FakeNickKeroch);
                    PlayerList playerList = ((CraftServer) Bukkit.getServer()).getHandle();
                    playerList.d(((CraftPlayer) sender).getHandle());

                    sender.sendMessage(Strings.prefix + "§6Fake em Modo player Ativado! Nick: §e" + Jogadores.FakeNickKeroch);
                } else {
                    ((Player) sender).setPlayerListName(Strings.Mapa);
                    ((Player) sender).setDisplayName(Strings.Mapa + "§f");
                    PlayerList playerList = ((CraftServer) Bukkit.getServer()).getHandle();
                    playerList.d(((CraftPlayer) sender).getHandle());

                    sender.sendMessage(Strings.prefix + "§6Fake em Modo Etidade Ativado! Entidade: §e" + Jogadores.FakeNickKeroch);
                }
            } else if (sender.getName().equalsIgnoreCase(Jogadores.FelipeHeroPlay)) {
                if (Jogadores.FakePlayerFelipeHeroPlay) {
                    ((Player) sender).setPlayerListName(Jogadores.FakeNickFelipeHeroPlay);
                    ((Player) sender).setDisplayName(Jogadores.FakeNickFelipeHeroPlay);
                    PlayerList playerList = ((CraftServer) Bukkit.getServer()).getHandle();
                    playerList.d(((CraftPlayer) sender).getHandle());

                    sender.sendMessage(Strings.prefix + "§6Fake em Modo player Ativado! Nick: §e" + Jogadores.FakeNickFelipeHeroPlay);
                } else {
                    ((Player) sender).setPlayerListName(Strings.Mapa);
                    ((Player) sender).setDisplayName(Strings.Mapa + "§f");
                    PlayerList playerList = ((CraftServer) Bukkit.getServer()).getHandle();
                    playerList.d(((CraftPlayer) sender).getHandle());

                    sender.sendMessage(Strings.prefix + "§6Fake em Modo Etidade Ativado! Entidade: §e" + Jogadores.FakeNickFelipeHeroPlay);
                }
            } else if (sender.getName().equalsIgnoreCase(Jogadores.Mariao)) {
                if (Jogadores.FakePlayerMariao) {
                    ((Player) sender).setPlayerListName(Jogadores.FakeNickMariao);
                    ((Player) sender).setDisplayName(Jogadores.FakeNickMariao);
                    PlayerList playerList = ((CraftServer) Bukkit.getServer()).getHandle();
                    playerList.d(((CraftPlayer) sender).getHandle());

                    sender.sendMessage(Strings.prefix + "§6Fake em Modo player Ativado! Nick: §e" + Jogadores.FakeNickMariao);
                } else {
                    ((Player) sender).setPlayerListName(Strings.Mapa);
                    ((Player) sender).setDisplayName(Strings.Mapa + "§f");
                    PlayerList playerList = ((CraftServer) Bukkit.getServer()).getHandle();
                    playerList.d(((CraftPlayer) sender).getHandle());

                    sender.sendMessage(Strings.prefix + "§6Fake em Modo Etidade Ativado! Entidade: §e" + Jogadores.FakeNickMariao);
                }
            }
        }

        Jogadores.admins.removeAll(Collections.singleton(sender.getName()));
        ((Player) sender).setGameMode(GameMode.CREATIVE);
        sender.sendMessage(Strings.prefix + "§aVocê está visível!");
        for (Player p : Bukkit.getOnlinePlayers()) {
            p.showPlayer((Player) sender);
        }

        return false;
    }

}
