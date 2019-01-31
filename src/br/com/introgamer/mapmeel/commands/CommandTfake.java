package br.com.introgamer.mapmeel.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import br.com.introgamer.mapmeel.variables.Jogadores;
import br.com.introgamer.mapmeel.variables.Strings;
import br.com.introgamer.mapmeel.variables.Variables;
import me.libraryaddict.disguise.DisguiseAPI;

public class CommandTfake implements CommandExecutor {

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

        Bukkit.getServer().dispatchCommand(sender, "undisguise");

        if (sender.getName().equalsIgnoreCase(Jogadores.Intro)) {
            DisguiseAPI.undisguiseToAll((Player) sender);
            ((Player) sender).setPlayerListName(sender.getName());
            ((Player) sender).setCustomName(sender.getName());
            sender.sendMessage(Strings.prefix + "§bFake Resetado!");
            ((Player) sender).setDisplayName(sender.getName() + "§f");

            Jogadores.FakeNickIntro = "nenhum";
            Jogadores.FakePlayerIntro = false;
        } else if (sender.getName().equalsIgnoreCase(Jogadores.Meel)) {
            DisguiseAPI.undisguiseToAll((Player) sender);
            ((Player) sender).setPlayerListName(sender.getName());
            ((Player) sender).setCustomName(sender.getName());
            sender.sendMessage(Strings.prefix + "§bFake Resetado!");
            ((Player) sender).setDisplayName(sender.getName() + "§f");

            Jogadores.FakeNickMeel = "nenhum";
            Jogadores.FakePlayerMeel = false;
        } else if (sender.getName().equalsIgnoreCase(Jogadores.Diego)) {
            DisguiseAPI.undisguiseToAll((Player) sender);
            ((Player) sender).setPlayerListName(sender.getName());
            ((Player) sender).setCustomName(sender.getName());
            sender.sendMessage(Strings.prefix + "§bFake Resetado!");
            ((Player) sender).setDisplayName(sender.getName() + "§f");

            Jogadores.FakeNickDiego = "nenhum";
            Jogadores.FakePlayerDiego = false;
        } else if (sender.getName().equalsIgnoreCase(Jogadores.Sombra)) {
            DisguiseAPI.undisguiseToAll((Player) sender);
            ((Player) sender).setPlayerListName(sender.getName());
            ((Player) sender).setCustomName(sender.getName());
            sender.sendMessage(Strings.prefix + "§bFake Resetado!");
            ((Player) sender).setDisplayName(sender.getName() + "§f");

            Jogadores.FakeNickSombra = "nenhum";
            Jogadores.FakePlayerSombra = false;
        } else if (sender.getName().equalsIgnoreCase(Jogadores.Raymeki)) {
            DisguiseAPI.undisguiseToAll((Player) sender);
            ((Player) sender).setPlayerListName(sender.getName());
            ((Player) sender).setCustomName(sender.getName());
            sender.sendMessage(Strings.prefix + "§bFake Resetado!");
            ((Player) sender).setDisplayName(sender.getName() + "§f");

            Jogadores.FakeNickRaymeki = "nenhum";
            Jogadores.FakePlayerRaymeki = false;
        } else if (sender.getName().equalsIgnoreCase(Jogadores.Edder)) {
            DisguiseAPI.undisguiseToAll((Player) sender);
            ((Player) sender).setPlayerListName(sender.getName());
            ((Player) sender).setCustomName(sender.getName());
            sender.sendMessage(Strings.prefix + "§bFake Resetado!");
            ((Player) sender).setDisplayName(sender.getName() + "§f");

            Jogadores.FakeNickEdder = "nenhum";
            Jogadores.FakePlayerEdder = false;
        } else if (sender.getName().equalsIgnoreCase(Jogadores.Crazy)) {
            DisguiseAPI.undisguiseToAll((Player) sender);
            ((Player) sender).setPlayerListName(sender.getName());
            ((Player) sender).setCustomName(sender.getName());
            sender.sendMessage(Strings.prefix + "§bFake Resetado!");
            ((Player) sender).setDisplayName(sender.getName() + "§f");

            Jogadores.FakeNickCrazy = "nenhum";
            Jogadores.FakePlayerCrazy = false;
        } else if (sender.getName().equalsIgnoreCase(Jogadores.Dede)) {
            DisguiseAPI.undisguiseToAll((Player) sender);
            ((Player) sender).setPlayerListName(sender.getName());
            ((Player) sender).setCustomName(sender.getName());
            sender.sendMessage(Strings.prefix + "§bFake Resetado!");
            ((Player) sender).setDisplayName(sender.getName() + "§f");

            Jogadores.FakeNickDede = "nenhum";
            Jogadores.FakePlayerDede = false;
        } else if (sender.getName().equalsIgnoreCase(Jogadores.Beaats)) {
            DisguiseAPI.undisguiseToAll((Player) sender);
            ((Player) sender).setPlayerListName(sender.getName());
            ((Player) sender).setCustomName(sender.getName());
            sender.sendMessage(Strings.prefix + "§bFake Resetado!");
            ((Player) sender).setDisplayName(sender.getName() + "§f");

            Jogadores.FakeNickBeaats = "nenhum";
            Jogadores.FakePlayerBeaats = false;
        } else if (sender.getName().equalsIgnoreCase(Jogadores.Biidu)) {
            DisguiseAPI.undisguiseToAll((Player) sender);
            ((Player) sender).setPlayerListName(sender.getName());
            ((Player) sender).setCustomName(sender.getName());
            sender.sendMessage(Strings.prefix + "§bFake Resetado!");
            ((Player) sender).setDisplayName(sender.getName() + "§f");

            Jogadores.FakeNickBiidu = "nenhum";
            Jogadores.FakePlayerBiidu = false;
        } else if (sender.getName().equalsIgnoreCase(Jogadores.Keroch)) {
            DisguiseAPI.undisguiseToAll((Player) sender);
            ((Player) sender).setPlayerListName(sender.getName());
            ((Player) sender).setCustomName(sender.getName());
            sender.sendMessage(Strings.prefix + "§bFake Resetado!");
            ((Player) sender).setDisplayName(sender.getName() + "§f");

            Jogadores.FakeNickKeroch = "nenhum";
            Jogadores.FakePlayerKeroch = false;
        } else if (sender.getName().equalsIgnoreCase(Jogadores.FelipeHeroPlay)) {
            DisguiseAPI.undisguiseToAll((Player) sender);
            ((Player) sender).setPlayerListName(sender.getName());
            ((Player) sender).setCustomName(sender.getName());
            sender.sendMessage(Strings.prefix + "§bFake Resetado!");
            ((Player) sender).setDisplayName(sender.getName() + "§f");

            Jogadores.FakeNickFelipeHeroPlay = "nenhum";
            Jogadores.FakePlayerFelipeHeroPlay = false;
        } else if (sender.getName().equalsIgnoreCase(Jogadores.Mariao)) {
            DisguiseAPI.undisguiseToAll((Player) sender);
            ((Player) sender).setPlayerListName(sender.getName());
            ((Player) sender).setCustomName(sender.getName());
            sender.sendMessage(Strings.prefix + "§bFake Resetado!");
            ((Player) sender).setDisplayName(sender.getName() + "§f");

            Jogadores.FakeNickMariao = "nenhum";
            Jogadores.FakePlayerMariao = false;
        } else {
            sender.sendMessage(Strings.prefix + "Você não pode usar /tfake por que não esta registrado no Plugin!");
            return true;
        }

        return false;
    }

}
