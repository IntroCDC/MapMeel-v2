package br.com.introgamer.mapmeel.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import br.com.introgamer.mapmeel.variables.Jogadores;
import br.com.introgamer.mapmeel.variables.Strings;
import br.com.introgamer.mapmeel.variables.Variables;

public class CommandTransformar implements CommandExecutor {

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

        if (args.length == 0) {
            sender.sendMessage(Strings.prefix + "§cUse /" + command.getName() + " [NICK]");
            return true;
        }

        if (sender.getName().equalsIgnoreCase(Jogadores.Intro)) {
            if (Jogadores.FakePlayerIntro) {
                Jogadores.FakePlayerIntro = false;
            }

            Bukkit.getServer().dispatchCommand(sender, "disguise " + args[0]);
            sender.sendMessage(Strings.prefix + "§bTransformado com Sucesso! Entidade: " + args[0]);
            Jogadores.FakeNickIntro = args[0];
        } else if (sender.getName().equalsIgnoreCase(Jogadores.Meel)) {
            if (Jogadores.FakePlayerMeel) {
                Jogadores.FakePlayerMeel = false;
            }

            Bukkit.getServer().dispatchCommand(sender, "disguise " + args[0]);
            sender.sendMessage(Strings.prefix + "§bTransformado com Sucesso! Entidade: " + args[0]);
            Jogadores.FakeNickMeel = args[0];
        } else if (sender.getName().equalsIgnoreCase(Jogadores.Diego)) {
            if (Jogadores.FakePlayerDiego) {
                Jogadores.FakePlayerDiego = false;
            }

            Bukkit.getServer().dispatchCommand(sender, "disguise " + args[0]);
            sender.sendMessage(Strings.prefix + "§bTransformado com Sucesso! Entidade: " + args[0]);
            Jogadores.FakeNickDiego = args[0];
        } else if (sender.getName().equalsIgnoreCase(Jogadores.Sombra)) {
            if (Jogadores.FakePlayerSombra) {
                Jogadores.FakePlayerSombra = false;
            }

            Bukkit.getServer().dispatchCommand(sender, "disguise " + args[0]);
            sender.sendMessage(Strings.prefix + "§bTransformado com Sucesso! Entidade: " + args[0]);
            Jogadores.FakeNickSombra = args[0];
        } else if (sender.getName().equalsIgnoreCase(Jogadores.Raymeki)) {
            if (Jogadores.FakePlayerRaymeki) {
                Jogadores.FakePlayerRaymeki = false;
            }

            Bukkit.getServer().dispatchCommand(sender, "disguise " + args[0]);
            sender.sendMessage(Strings.prefix + "§bTransformado com Sucesso! Entidade: " + args[0]);
            Jogadores.FakeNickRaymeki = args[0];
        } else if (sender.getName().equalsIgnoreCase(Jogadores.Edder)) {
            if (Jogadores.FakePlayerEdder) {
                Jogadores.FakePlayerEdder = false;
            }

            Bukkit.getServer().dispatchCommand(sender, "disguise " + args[0]);
            sender.sendMessage(Strings.prefix + "§bTransformado com Sucesso! Entidade: " + args[0]);
            Jogadores.FakeNickEdder = args[0];
        } else if (sender.getName().equalsIgnoreCase(Jogadores.Crazy)) {
            if (Jogadores.FakePlayerCrazy) {
                Jogadores.FakePlayerCrazy = false;
            }

            Bukkit.getServer().dispatchCommand(sender, "disguise " + args[0]);
            sender.sendMessage(Strings.prefix + "§bTransformado com Sucesso! Entidade: " + args[0]);
            Jogadores.FakeNickCrazy = args[0];
        } else if (sender.getName().equalsIgnoreCase(Jogadores.Dede)) {
            if (Jogadores.FakePlayerDede) {
                Jogadores.FakePlayerDede = false;
            }

            Bukkit.getServer().dispatchCommand(sender, "disguise " + args[0]);
            sender.sendMessage(Strings.prefix + "§bTransformado com Sucesso! Entidade: " + args[0]);
            Jogadores.FakeNickDede = args[0];
        } else if (sender.getName().equalsIgnoreCase(Jogadores.Beaats)) {
            if (Jogadores.FakePlayerBeaats) {
                Jogadores.FakePlayerBeaats = false;
            }

            Bukkit.getServer().dispatchCommand(sender, "disguise " + args[0]);
            sender.sendMessage(Strings.prefix + "§bTransformado com Sucesso! Entidade: " + args[0]);
            Jogadores.FakeNickBeaats = args[0];
        } else if (sender.getName().equalsIgnoreCase(Jogadores.Biidu)) {
            if (Jogadores.FakePlayerBiidu) {
                Jogadores.FakePlayerBiidu = false;
            }

            Bukkit.getServer().dispatchCommand(sender, "disguise " + args[0]);
            sender.sendMessage(Strings.prefix + "§bTransformado com Sucesso! Entidade: " + args[0]);
            Jogadores.FakeNickBiidu = args[0];
        } else if (sender.getName().equalsIgnoreCase(Jogadores.Keroch)) {
            if (Jogadores.FakePlayerKeroch) {
                Jogadores.FakePlayerKeroch = false;
            }

            Bukkit.getServer().dispatchCommand(sender, "disguise " + args[0]);
            sender.sendMessage(Strings.prefix + "§bTransformado com Sucesso! Entidade: " + args[0]);
            Jogadores.FakeNickKeroch = args[0];
        } else if (sender.getName().equalsIgnoreCase(Jogadores.FelipeHeroPlay)) {
            if (Jogadores.FakePlayerFelipeHeroPlay) {
                Jogadores.FakePlayerFelipeHeroPlay = false;
            }

            Bukkit.getServer().dispatchCommand(sender, "disguise " + args[0]);
            sender.sendMessage(Strings.prefix + "§bTransformado com Sucesso! Entidade: " + args[0]);
            Jogadores.FakeNickFelipeHeroPlay = args[0];
        } else if (sender.getName().equalsIgnoreCase(Jogadores.Mariao)) {
            if (Jogadores.FakePlayerMariao) {
                Jogadores.FakePlayerMariao = false;
            }

            Bukkit.getServer().dispatchCommand(sender, "disguise " + args[0]);
            sender.sendMessage(Strings.prefix + "§bTransformado com Sucesso! Entidade: " + args[0]);
            Jogadores.FakeNickMariao = args[0];
        } else {
            sender.sendMessage(Strings.prefix + "§cVocê não pode usar o /transformar sem esta registrado no Plugin!");
            return true;
        }

        return false;
    }

}
