package br.com.introgamer.mapmeel.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import br.com.introgamer.mapmeel.variables.Jogadores;
import br.com.introgamer.mapmeel.variables.Strings;
import br.com.introgamer.mapmeel.variables.Variables;

public class CommandCheck implements CommandExecutor {

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
            sender.sendMessage(Strings.prefix + "зbUse: /" + command.getName() + " [NICK]");
            return true;
        }

        if (args[0].equalsIgnoreCase(Jogadores.Meel)) {
            sender.sendMessage(Strings.prefix + "зfзl-----------------------------");
            sender.sendMessage(Strings.prefix + "з6Nick: " + Jogadores.Meel);
            if (Bukkit.getPlayer(Jogadores.Meel) != null) {
                sender.sendMessage(Strings.prefix + "з6Status: з2ONLINE");
                sender.sendMessage(Strings.prefix + "з6IP: " + Bukkit.getPlayer(Jogadores.Meel).getAddress());
                sender.sendMessage(Strings.prefix + "з6X: " + Bukkit.getPlayer(Jogadores.Meel).getLocation().getX());
                sender.sendMessage(Strings.prefix + "з6Y: " + Bukkit.getPlayer(Jogadores.Meel).getLocation().getY());
                sender.sendMessage(Strings.prefix + "з6Z: " + Bukkit.getPlayer(Jogadores.Meel).getLocation().getZ());
                sender.sendMessage(Strings.prefix + "з6Vida: " + Bukkit.getPlayer(Jogadores.Meel).getHealth());
                sender.sendMessage(Strings.prefix + "з6Fome: " + Bukkit.getPlayer(Jogadores.Meel).getFoodLevel());
                sender.sendMessage(Strings.prefix + "з6Fails(Total): " + Variables.failstotal);
                sender.sendMessage(Strings.prefix + "з6Gamemode: " + Bukkit.getPlayer(Jogadores.Meel).getGameMode().name());
            } else {
                sender.sendMessage(Strings.prefix + "з6Status: з7OFFLINE");
                if (Variables.Primeira) {
                    sender.sendMessage(Strings.prefix + "з6Entrou: зcNunca entrou no Servidor(Desde ultima reinicializaчуo)!");
                } else {
                    sender.sendMessage(Strings.prefix + "з6Entrou: зaJс entrou no Servidor!");
                }
            }
            sender.sendMessage(Strings.prefix + "зfзl-----------------------------");
            return true;

        } else if (args[0].equalsIgnoreCase(Jogadores.Intro)) {
            sender.sendMessage(Strings.prefix + "зfзl-----------------------------");
            sender.sendMessage(Strings.prefix + "з6Nick: " + Jogadores.Intro);
            if (Bukkit.getPlayer(Jogadores.Intro) != null) {
                sender.sendMessage(Strings.prefix + "з6Status: з2ONLINE");
                sender.sendMessage(Strings.prefix + "з6IP: " + Bukkit.getPlayer(Jogadores.Intro).getAddress());
                sender.sendMessage(Strings.prefix + "з6X: " + Bukkit.getPlayer(Jogadores.Intro).getLocation().getX());
                sender.sendMessage(Strings.prefix + "з6Y: " + Bukkit.getPlayer(Jogadores.Intro).getLocation().getY());
                sender.sendMessage(Strings.prefix + "з6Z: " + Bukkit.getPlayer(Jogadores.Intro).getLocation().getZ());
                sender.sendMessage(Strings.prefix + "з6Vida: " + Bukkit.getPlayer(Jogadores.Intro).getHealth());
                sender.sendMessage(Strings.prefix + "з6Fome: " + Bukkit.getPlayer(Jogadores.Intro).getFoodLevel());
                sender.sendMessage(Strings.prefix + "з6Fails(Total): " + Variables.failstotal);
                sender.sendMessage(Strings.prefix + "з6Gamemode: " + Bukkit.getPlayer(Jogadores.Intro).getGameMode().name());
            } else {
                sender.sendMessage(Strings.prefix + "з6Status: з7OFFLINE");
            }
            sender.sendMessage(Strings.prefix + "зfзl-----------------------------");
            return true;
        } else if (args[0].equalsIgnoreCase(Jogadores.Diego)) {
            sender.sendMessage(Strings.prefix + "зfзl-----------------------------");
            sender.sendMessage(Strings.prefix + "з6Nick: " + Jogadores.Diego);
            if (Bukkit.getPlayer(Jogadores.Diego) != null) {
                sender.sendMessage(Strings.prefix + "з6Status: з2ONLINE");
                sender.sendMessage(Strings.prefix + "з6IP: " + Bukkit.getPlayer(Jogadores.Diego).getAddress());
                sender.sendMessage(Strings.prefix + "з6X: " + Bukkit.getPlayer(Jogadores.Diego).getLocation().getX());
                sender.sendMessage(Strings.prefix + "з6Y: " + Bukkit.getPlayer(Jogadores.Diego).getLocation().getY());
                sender.sendMessage(Strings.prefix + "з6Z: " + Bukkit.getPlayer(Jogadores.Diego).getLocation().getZ());
                sender.sendMessage(Strings.prefix + "з6Vida: " + Bukkit.getPlayer(Jogadores.Diego).getHealth());
                sender.sendMessage(Strings.prefix + "з6Fome: " + Bukkit.getPlayer(Jogadores.Diego).getFoodLevel());
                sender.sendMessage(Strings.prefix + "з6Fails(Total): " + Variables.failstotal);
                sender.sendMessage(Strings.prefix + "з6Gamemode: " + Bukkit.getPlayer(Jogadores.Diego).getGameMode().name());
            } else {
                sender.sendMessage(Strings.prefix + "з6Status: з7OFFLINE");
            }
            sender.sendMessage(Strings.prefix + "зfзl-----------------------------");
            return true;
        } else if (args[0].equalsIgnoreCase(Jogadores.Sombra)) {
            sender.sendMessage(Strings.prefix + "зfзl-----------------------------");
            sender.sendMessage(Strings.prefix + "з6Nick: " + Jogadores.Sombra);
            if (Bukkit.getPlayer(Jogadores.Sombra) != null) {
                sender.sendMessage(Strings.prefix + "з6Status: з2ONLINE");
                sender.sendMessage(Strings.prefix + "з6IP: " + Bukkit.getPlayer(Jogadores.Sombra).getAddress());
                sender.sendMessage(Strings.prefix + "з6X: " + Bukkit.getPlayer(Jogadores.Sombra).getLocation().getX());
                sender.sendMessage(Strings.prefix + "з6Y: " + Bukkit.getPlayer(Jogadores.Sombra).getLocation().getY());
                sender.sendMessage(Strings.prefix + "з6Z: " + Bukkit.getPlayer(Jogadores.Sombra).getLocation().getZ());
                sender.sendMessage(Strings.prefix + "з6Vida: " + Bukkit.getPlayer(Jogadores.Sombra).getHealth());
                sender.sendMessage(Strings.prefix + "з6Fome: " + Bukkit.getPlayer(Jogadores.Sombra).getFoodLevel());
                sender.sendMessage(Strings.prefix + "з6Fails(Total): " + Variables.failstotal);
                sender.sendMessage(Strings.prefix + "з6Gamemode: " + Bukkit.getPlayer(Jogadores.Sombra).getGameMode().name());
            } else {
                sender.sendMessage(Strings.prefix + "з6Status: з7OFFLINE");
            }
            sender.sendMessage(Strings.prefix + "зfзl-----------------------------");
            return true;
        } else if (args[0].equalsIgnoreCase(Jogadores.Raymeki)) {
            sender.sendMessage(Strings.prefix + "зfзl-----------------------------");
            sender.sendMessage(Strings.prefix + "з6Nick: " + Jogadores.Raymeki);
            if (Bukkit.getPlayer(Jogadores.Raymeki) != null) {
                sender.sendMessage(Strings.prefix + "з6Status: з2ONLINE");
                sender.sendMessage(Strings.prefix + "з6IP: " + Bukkit.getPlayer(Jogadores.Raymeki).getAddress());
                sender.sendMessage(Strings.prefix + "з6X: " + Bukkit.getPlayer(Jogadores.Raymeki).getLocation().getX());
                sender.sendMessage(Strings.prefix + "з6Y: " + Bukkit.getPlayer(Jogadores.Raymeki).getLocation().getY());
                sender.sendMessage(Strings.prefix + "з6Z: " + Bukkit.getPlayer(Jogadores.Raymeki).getLocation().getZ());
                sender.sendMessage(Strings.prefix + "з6Vida: " + Bukkit.getPlayer(Jogadores.Raymeki).getHealth());
                sender.sendMessage(Strings.prefix + "з6Fome: " + Bukkit.getPlayer(Jogadores.Raymeki).getFoodLevel());
                sender.sendMessage(Strings.prefix + "з6Fails(Total): " + Variables.failstotal);
                sender.sendMessage(Strings.prefix + "з6Gamemode: " + Bukkit.getPlayer(Jogadores.Raymeki).getGameMode().name());
            } else {
                sender.sendMessage(Strings.prefix + "з6Status: з7OFFLINE");
            }
            sender.sendMessage(Strings.prefix + "зfзl-----------------------------");
            return true;
        } else if (args[0].equalsIgnoreCase(Jogadores.Edder)) {
            sender.sendMessage(Strings.prefix + "зfзl-----------------------------");
            sender.sendMessage(Strings.prefix + "з6Nick: " + Jogadores.Edder);
            if (Bukkit.getPlayer(Jogadores.Edder) != null) {
                sender.sendMessage(Strings.prefix + "з6Status: з2ONLINE");
                sender.sendMessage(Strings.prefix + "з6IP: " + Bukkit.getPlayer(Jogadores.Edder).getAddress());
                sender.sendMessage(Strings.prefix + "з6X: " + Bukkit.getPlayer(Jogadores.Edder).getLocation().getX());
                sender.sendMessage(Strings.prefix + "з6Y: " + Bukkit.getPlayer(Jogadores.Edder).getLocation().getY());
                sender.sendMessage(Strings.prefix + "з6Z: " + Bukkit.getPlayer(Jogadores.Edder).getLocation().getZ());
                sender.sendMessage(Strings.prefix + "з6Vida: " + Bukkit.getPlayer(Jogadores.Edder).getHealth());
                sender.sendMessage(Strings.prefix + "з6Fome: " + Bukkit.getPlayer(Jogadores.Edder).getFoodLevel());
                sender.sendMessage(Strings.prefix + "з6Fails(Total): " + Variables.failstotal);
                sender.sendMessage(Strings.prefix + "з6Gamemode: " + Bukkit.getPlayer(Jogadores.Edder).getGameMode().name());
            } else {
                sender.sendMessage(Strings.prefix + "з6Status: з7OFFLINE");
            }
            sender.sendMessage(Strings.prefix + "зfзl-----------------------------");
            return true;
        } else if (args[0].equalsIgnoreCase(Jogadores.Crazy)) {
            sender.sendMessage(Strings.prefix + "зfзl-----------------------------");
            sender.sendMessage(Strings.prefix + "з6Nick: " + Jogadores.Crazy);
            if (Bukkit.getPlayer(Jogadores.Crazy) != null) {
                sender.sendMessage(Strings.prefix + "з6Status: з2ONLINE");
                sender.sendMessage(Strings.prefix + "з6IP: " + Bukkit.getPlayer(Jogadores.Crazy).getAddress());
                sender.sendMessage(Strings.prefix + "з6X: " + Bukkit.getPlayer(Jogadores.Crazy).getLocation().getX());
                sender.sendMessage(Strings.prefix + "з6Y: " + Bukkit.getPlayer(Jogadores.Crazy).getLocation().getY());
                sender.sendMessage(Strings.prefix + "з6Z: " + Bukkit.getPlayer(Jogadores.Crazy).getLocation().getZ());
                sender.sendMessage(Strings.prefix + "з6Vida: " + Bukkit.getPlayer(Jogadores.Crazy).getHealth());
                sender.sendMessage(Strings.prefix + "з6Fome: " + Bukkit.getPlayer(Jogadores.Crazy).getFoodLevel());
                sender.sendMessage(Strings.prefix + "з6Fails(Total): " + Variables.failstotal);
                sender.sendMessage(Strings.prefix + "з6Gamemode: " + Bukkit.getPlayer(Jogadores.Crazy).getGameMode().name());
            } else {
                sender.sendMessage(Strings.prefix + "з6Status: з7OFFLINE");
            }
            sender.sendMessage(Strings.prefix + "зfзl-----------------------------");
            return true;
        } else if (args[0].equalsIgnoreCase(Jogadores.Dede)) {
            sender.sendMessage(Strings.prefix + "зfзl-----------------------------");
            sender.sendMessage(Strings.prefix + "з6Nick: " + Jogadores.Dede);
            if (Bukkit.getPlayer(Jogadores.Dede) != null) {
                sender.sendMessage(Strings.prefix + "з6Status: з2ONLINE");
                sender.sendMessage(Strings.prefix + "з6IP: " + Bukkit.getPlayer(Jogadores.Dede).getAddress());
                sender.sendMessage(Strings.prefix + "з6X: " + Bukkit.getPlayer(Jogadores.Dede).getLocation().getX());
                sender.sendMessage(Strings.prefix + "з6Y: " + Bukkit.getPlayer(Jogadores.Dede).getLocation().getY());
                sender.sendMessage(Strings.prefix + "з6Z: " + Bukkit.getPlayer(Jogadores.Dede).getLocation().getZ());
                sender.sendMessage(Strings.prefix + "з6Vida: " + Bukkit.getPlayer(Jogadores.Dede).getHealth());
                sender.sendMessage(Strings.prefix + "з6Fome: " + Bukkit.getPlayer(Jogadores.Dede).getFoodLevel());
                sender.sendMessage(Strings.prefix + "з6Fails(Total): " + Variables.failstotal);
                sender.sendMessage(Strings.prefix + "з6Gamemode: " + Bukkit.getPlayer(Jogadores.Dede).getGameMode().name());
            } else {
                sender.sendMessage(Strings.prefix + "з6Status: з7OFFLINE");
            }
            sender.sendMessage(Strings.prefix + "зfзl-----------------------------");
            return true;
        } else if (args[0].equalsIgnoreCase(Jogadores.Beaats)) {
            sender.sendMessage(Strings.prefix + "зfзl-----------------------------");
            sender.sendMessage(Strings.prefix + "з6Nick: " + Jogadores.Beaats);
            if (Bukkit.getPlayer(Jogadores.Beaats) != null) {
                sender.sendMessage(Strings.prefix + "з6Status: з2ONLINE");
                sender.sendMessage(Strings.prefix + "з6IP: " + Bukkit.getPlayer(Jogadores.Beaats).getAddress());
                sender.sendMessage(Strings.prefix + "з6X: " + Bukkit.getPlayer(Jogadores.Beaats).getLocation().getX());
                sender.sendMessage(Strings.prefix + "з6Y: " + Bukkit.getPlayer(Jogadores.Beaats).getLocation().getY());
                sender.sendMessage(Strings.prefix + "з6Z: " + Bukkit.getPlayer(Jogadores.Beaats).getLocation().getZ());
                sender.sendMessage(Strings.prefix + "з6Vida: " + Bukkit.getPlayer(Jogadores.Beaats).getHealth());
                sender.sendMessage(Strings.prefix + "з6Fome: " + Bukkit.getPlayer(Jogadores.Beaats).getFoodLevel());
                sender.sendMessage(Strings.prefix + "з6Fails(Total): " + Variables.failstotal);
                sender.sendMessage(Strings.prefix + "з6Gamemode: " + Bukkit.getPlayer(Jogadores.Beaats).getGameMode().name());
            } else {
                sender.sendMessage(Strings.prefix + "з6Status: з7OFFLINE");
            }
            sender.sendMessage(Strings.prefix + "зfзl-----------------------------");
            return true;
        } else if (args[0].equalsIgnoreCase(Jogadores.Biidu)) {
            sender.sendMessage(Strings.prefix + "зfзl-----------------------------");
            sender.sendMessage(Strings.prefix + "з6Nick: " + Jogadores.Biidu);
            if (Bukkit.getPlayer(Jogadores.Biidu) != null) {
                sender.sendMessage(Strings.prefix + "з6Status: з2ONLINE");
                sender.sendMessage(Strings.prefix + "з6IP: " + Bukkit.getPlayer(Jogadores.Biidu).getAddress());
                sender.sendMessage(Strings.prefix + "з6X: " + Bukkit.getPlayer(Jogadores.Biidu).getLocation().getX());
                sender.sendMessage(Strings.prefix + "з6Y: " + Bukkit.getPlayer(Jogadores.Biidu).getLocation().getY());
                sender.sendMessage(Strings.prefix + "з6Z: " + Bukkit.getPlayer(Jogadores.Biidu).getLocation().getZ());
                sender.sendMessage(Strings.prefix + "з6Vida: " + Bukkit.getPlayer(Jogadores.Biidu).getHealth());
                sender.sendMessage(Strings.prefix + "з6Fome: " + Bukkit.getPlayer(Jogadores.Biidu).getFoodLevel());
                sender.sendMessage(Strings.prefix + "з6Fails(Total): " + Variables.failstotal);
                sender.sendMessage(Strings.prefix + "з6Gamemode: " + Bukkit.getPlayer(Jogadores.Biidu).getGameMode().name());
            } else {
                sender.sendMessage(Strings.prefix + "з6Status: з7OFFLINE");
            }
            sender.sendMessage(Strings.prefix + "зfзl-----------------------------");
            return true;
        } else if (args[0].equalsIgnoreCase(Jogadores.Keroch)) {
            sender.sendMessage(Strings.prefix + "зfзl-----------------------------");
            sender.sendMessage(Strings.prefix + "з6Nick: " + Jogadores.Keroch);
            if (Bukkit.getPlayer(Jogadores.Keroch) != null) {
                sender.sendMessage(Strings.prefix + "з6Status: з2ONLINE");
                sender.sendMessage(Strings.prefix + "з6IP: " + Bukkit.getPlayer(Jogadores.Keroch).getAddress());
                sender.sendMessage(Strings.prefix + "з6X: " + Bukkit.getPlayer(Jogadores.Keroch).getLocation().getX());
                sender.sendMessage(Strings.prefix + "з6Y: " + Bukkit.getPlayer(Jogadores.Keroch).getLocation().getY());
                sender.sendMessage(Strings.prefix + "з6Z: " + Bukkit.getPlayer(Jogadores.Keroch).getLocation().getZ());
                sender.sendMessage(Strings.prefix + "з6Vida: " + Bukkit.getPlayer(Jogadores.Keroch).getHealth());
                sender.sendMessage(Strings.prefix + "з6Fome: " + Bukkit.getPlayer(Jogadores.Keroch).getFoodLevel());
                sender.sendMessage(Strings.prefix + "з6Fails(Total): " + Variables.failstotal);
                sender.sendMessage(Strings.prefix + "з6Gamemode: " + Bukkit.getPlayer(Jogadores.Keroch).getGameMode().name());
            } else {
                sender.sendMessage(Strings.prefix + "з6Status: з7OFFLINE");
            }
            sender.sendMessage(Strings.prefix + "зfзl-----------------------------");
            return true;
        } else if (args[0].equalsIgnoreCase(Jogadores.FelipeHeroPlay)) {
            sender.sendMessage(Strings.prefix + "зfзl-----------------------------");
            sender.sendMessage(Strings.prefix + "з6Nick: " + Jogadores.FelipeHeroPlay);
            if (Bukkit.getPlayer(Jogadores.FelipeHeroPlay) != null) {
                sender.sendMessage(Strings.prefix + "з6Status: з2ONLINE");
                sender.sendMessage(Strings.prefix + "з6IP: " + Bukkit.getPlayer(Jogadores.FelipeHeroPlay).getAddress());
                sender.sendMessage(Strings.prefix + "з6X: " + Bukkit.getPlayer(Jogadores.FelipeHeroPlay).getLocation().getX());
                sender.sendMessage(Strings.prefix + "з6Y: " + Bukkit.getPlayer(Jogadores.FelipeHeroPlay).getLocation().getY());
                sender.sendMessage(Strings.prefix + "з6Z: " + Bukkit.getPlayer(Jogadores.FelipeHeroPlay).getLocation().getZ());
                sender.sendMessage(Strings.prefix + "з6Vida: " + Bukkit.getPlayer(Jogadores.FelipeHeroPlay).getHealth());
                sender.sendMessage(Strings.prefix + "з6Fome: " + Bukkit.getPlayer(Jogadores.FelipeHeroPlay).getFoodLevel());
                sender.sendMessage(Strings.prefix + "з6Fails(Total): " + Variables.failstotal);
                sender.sendMessage(Strings.prefix + "з6Gamemode: " + Bukkit.getPlayer(Jogadores.FelipeHeroPlay).getGameMode().name());
            } else {
                sender.sendMessage(Strings.prefix + "з6Status: з7OFFLINE");
            }
            sender.sendMessage(Strings.prefix + "зfзl-----------------------------");
            return true;
        } else if (args[0].equalsIgnoreCase(Jogadores.Mariao)) {
            sender.sendMessage(Strings.prefix + "зfзl-----------------------------");
            sender.sendMessage(Strings.prefix + "з6Nick: " + Jogadores.Mariao);
            if (Bukkit.getPlayer(Jogadores.Mariao) != null) {
                sender.sendMessage(Strings.prefix + "з6Status: з2ONLINE");
                sender.sendMessage(Strings.prefix + "з6IP: " + Bukkit.getPlayer(Jogadores.Mariao).getAddress());
                sender.sendMessage(Strings.prefix + "з6X: " + Bukkit.getPlayer(Jogadores.Mariao).getLocation().getX());
                sender.sendMessage(Strings.prefix + "з6Y: " + Bukkit.getPlayer(Jogadores.Mariao).getLocation().getY());
                sender.sendMessage(Strings.prefix + "з6Z: " + Bukkit.getPlayer(Jogadores.Mariao).getLocation().getZ());
                sender.sendMessage(Strings.prefix + "з6Vida: " + Bukkit.getPlayer(Jogadores.Mariao).getHealth());
                sender.sendMessage(Strings.prefix + "з6Fome: " + Bukkit.getPlayer(Jogadores.Mariao).getFoodLevel());
                sender.sendMessage(Strings.prefix + "з6Fails(Total): " + Variables.failstotal);
                sender.sendMessage(Strings.prefix + "з6Gamemode: " + Bukkit.getPlayer(Jogadores.Mariao).getGameMode().name());
            } else {
                sender.sendMessage(Strings.prefix + "з6Status: з7OFFLINE");
            }
            sender.sendMessage(Strings.prefix + "зfзl-----------------------------");
            return true;
        } else {
            sender.sendMessage(Strings.prefix + "зcJogador nуo registrado no Plugin!");
            return true;
        }

    }

}
