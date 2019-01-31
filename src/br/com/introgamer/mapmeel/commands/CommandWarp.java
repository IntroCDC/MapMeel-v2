package br.com.introgamer.mapmeel.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import br.com.introgamer.mapmeel.variables.Jogadores;
import br.com.introgamer.mapmeel.variables.Locations;
import br.com.introgamer.mapmeel.variables.Strings;
import br.com.introgamer.mapmeel.variables.Variables;

public class CommandWarp implements CommandExecutor {

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
            sender.sendMessage(Strings.prefix + "§6Digite: /" + command.getName() + " [NomeDaFase] [NICK<Opcional>]");

            StringBuilder s = new StringBuilder();
            for (int i = 0; i < Locations.Warps.size(); i++) {
                if (i != 0) {
                    s.append("§6, ").append(Locations.Warps.get(i));
                } else {
                    s.append(Locations.Warps.get(i));
                }
            }

            sender.sendMessage(Strings.prefix + "§6Warps: " + s.toString());

            return true;
        } else if (args.length == 1) {
            if (!(sender instanceof Player)) {
                Bukkit.getServer().getConsoleSender().sendMessage(Strings.prefix + "Apenas o Intro em Jogo pode executar este comando!");
                return true;
            }

            if (args[0].equalsIgnoreCase("lobby")) {
                ((Player) sender).teleport(Locations.lobby);
                sender.sendMessage(Strings.prefix + "§6Teleportado para a warp " + args[0] + " com Sucesso!");
                return true;
            } else

            if (args[0].equalsIgnoreCase("Lobby1")) {
                ((Player) sender).teleport(Locations.lobby1);
                sender.sendMessage(Strings.prefix + "§6Teleportado para a warp " + args[0] + " com Sucesso!");
                return true;
            } else

            if (args[0].equalsIgnoreCase("Lobby2")) {
                ((Player) sender).teleport(Locations.lobby2);
                sender.sendMessage(Strings.prefix + "§6Teleportado para a warp " + args[0] + " com Sucesso!");
                return true;
            } else

            if (args[0].equalsIgnoreCase("Lobby3")) {
                ((Player) sender).teleport(Locations.lobby3);
                sender.sendMessage(Strings.prefix + "§6Teleportado para a warp " + args[0] + " com Sucesso!");
                return true;
            } else

            if (args[0].equalsIgnoreCase("Lobby4")) {
                ((Player) sender).teleport(Locations.lobby4);
                sender.sendMessage(Strings.prefix + "§6Teleportado para a warp " + args[0] + " com Sucesso!");
                return true;
            } else

            if (args[0].equalsIgnoreCase("1A")) {
                ((Player) sender).teleport(Locations.fase1a);
                sender.sendMessage(Strings.prefix + "§6Teleportado para a warp " + args[0] + " com Sucesso!");
                return true;
            } else

            if (args[0].equalsIgnoreCase("1B")) {
                ((Player) sender).teleport(Locations.fase1b);
                sender.sendMessage(Strings.prefix + "§6Teleportado para a warp " + args[0] + " com Sucesso!");
                return true;
            } else

            if (args[0].equalsIgnoreCase("1C")) {
                ((Player) sender).teleport(Locations.fase1c);
                sender.sendMessage(Strings.prefix + "§6Teleportado para a warp " + args[0] + " com Sucesso!");
                return true;
            } else

            if (args[0].equalsIgnoreCase("1D")) {
                ((Player) sender).teleport(Locations.fase1d);
                sender.sendMessage(Strings.prefix + "§6Teleportado para a warp " + args[0] + " com Sucesso!");
                return true;
            } else

            if (args[0].equalsIgnoreCase("2A")) {
                ((Player) sender).teleport(Locations.fase2a);
                sender.sendMessage(Strings.prefix + "§6Teleportado para a warp " + args[0] + " com Sucesso!");
                return true;
            } else

            if (args[0].equalsIgnoreCase("2B")) {
                ((Player) sender).teleport(Locations.fase2b);
                sender.sendMessage(Strings.prefix + "§6Teleportado para a warp " + args[0] + " com Sucesso!");
                return true;
            } else

            if (args[0].equalsIgnoreCase("2C")) {
                ((Player) sender).teleport(Locations.fase2c);
                sender.sendMessage(Strings.prefix + "§6Teleportado para a warp " + args[0] + " com Sucesso!");
                return true;
            } else

            if (args[0].equalsIgnoreCase("2D")) {
                ((Player) sender).teleport(Locations.fase2d);
                sender.sendMessage(Strings.prefix + "§6Teleportado para a warp " + args[0] + " com Sucesso!");
                return true;
            } else

            if (args[0].equalsIgnoreCase("3A")) {
                ((Player) sender).teleport(Locations.fase3a);
                sender.sendMessage(Strings.prefix + "§6Teleportado para a warp " + args[0] + " com Sucesso!");
                return true;
            } else

            if (args[0].equalsIgnoreCase("3B")) {
                ((Player) sender).teleport(Locations.fase3b);
                sender.sendMessage(Strings.prefix + "§6Teleportado para a warp " + args[0] + " com Sucesso!");
                return true;
            } else

            if (args[0].equalsIgnoreCase("3C")) {
                ((Player) sender).teleport(Locations.fase3c);
                sender.sendMessage(Strings.prefix + "§6Teleportado para a warp " + args[0] + " com Sucesso!");
                return true;
            } else

            if (args[0].equalsIgnoreCase("3D")) {
                ((Player) sender).teleport(Locations.fase3d);
                sender.sendMessage(Strings.prefix + "§6Teleportado para a warp " + args[0] + " com Sucesso!");
                return true;
            } else

            if (args[0].equalsIgnoreCase("4A")) {
                ((Player) sender).teleport(Locations.fase4a);
                sender.sendMessage(Strings.prefix + "§6Teleportado para a warp " + args[0] + " com Sucesso!");
                return true;
            } else

            if (args[0].equalsIgnoreCase("4B")) {
                ((Player) sender).teleport(Locations.fase4b);
                sender.sendMessage(Strings.prefix + "§6Teleportado para a warp " + args[0] + " com Sucesso!");
                return true;
            } else

            if (args[0].equalsIgnoreCase("4C")) {
                ((Player) sender).teleport(Locations.fase4c);
                sender.sendMessage(Strings.prefix + "§6Teleportado para a warp " + args[0] + " com Sucesso!");
                return true;
            } else

            if (args[0].equalsIgnoreCase("4D")) {
                ((Player) sender).teleport(Locations.fase4d);
                sender.sendMessage(Strings.prefix + "§6Teleportado para a warp " + args[0] + " com Sucesso!");
                return true;
            } else

            if (args[0].equalsIgnoreCase("EasterEgg1")) {
                ((Player) sender).teleport(Locations.easteregg1);
                sender.sendMessage(Strings.prefix + "§6Teleportado para a warp " + args[0] + " com Sucesso!");
                return true;
            } else

            if (args[0].equalsIgnoreCase("EasterEgg2")) {
                ((Player) sender).teleport(Locations.easteregg2);
                sender.sendMessage(Strings.prefix + "§6Teleportado para a warp " + args[0] + " com Sucesso!");
                return true;
            } else

            if (args[0].equalsIgnoreCase("EasterEgg3")) {
                ((Player) sender).teleport(Locations.easteregg3);
                sender.sendMessage(Strings.prefix + "§6Teleportado para a warp " + args[0] + " com Sucesso!");
                return true;
            } else

            if (args[0].equalsIgnoreCase("EasterEgg4")) {
                ((Player) sender).teleport(Locations.easteregg4);
                sender.sendMessage(Strings.prefix + "§6Teleportado para a warp " + args[0] + " com Sucesso!");
                return true;
            } else

            if (args[0].equalsIgnoreCase("PlataformaFinal")) {
                ((Player) sender).teleport(Locations.plataformafinal);
                sender.sendMessage(Strings.prefix + "§6Teleportado para a warp " + args[0] + " com Sucesso!");
                return true;
            } else

            if (args[0].equalsIgnoreCase("Warps")) {
                ((Player) sender).teleport(Locations.warps);
                sender.sendMessage(Strings.prefix + "§6Teleportado para a warp " + args[0] + " com Sucesso!");
                return true;
            } else

            {
                sender.sendMessage(Strings.prefix + "§cWarp Inexistente!");
                sender.sendMessage(Strings.prefix + "§6Digite: /" + command.getName() + " [NomeDaFase]");
                return true;
            }
        } else {

            if (Bukkit.getPlayer(args[1]) == null) {
                sender.sendMessage(Strings.prefix + args[1] + "§c" + Strings.naoOnline);
                return true;
            }

            if (args[0].equalsIgnoreCase("lobby")) {
                Bukkit.getPlayer(args[1]).teleport(Locations.lobby);
                sender.sendMessage(Strings.prefix + "§6Teleportado §5" + args[1] + "§6 para a warp " + args[0] + " com Sucesso!");
                return true;
            } else

            if (args[0].equalsIgnoreCase("Lobby1")) {
                Bukkit.getPlayer(args[1]).teleport(Locations.lobby1);
                sender.sendMessage(Strings.prefix + "§6Teleportado §5" + args[1] + "§6 para a warp " + args[0] + " com Sucesso!");
                return true;
            } else

            if (args[0].equalsIgnoreCase("Lobby2")) {
                Bukkit.getPlayer(args[1]).teleport(Locations.lobby2);
                sender.sendMessage(Strings.prefix + "§6Teleportado §5" + args[1] + "§6 para a warp " + args[0] + " com Sucesso!");
                return true;
            } else

            if (args[0].equalsIgnoreCase("Lobby3")) {
                Bukkit.getPlayer(args[1]).teleport(Locations.lobby3);
                sender.sendMessage(Strings.prefix + "§6Teleportado §5" + args[1] + "§6 para a warp " + args[0] + " com Sucesso!");
                return true;
            } else

            if (args[0].equalsIgnoreCase("Lobby4")) {
                Bukkit.getPlayer(args[1]).teleport(Locations.lobby4);
                sender.sendMessage(Strings.prefix + "§6Teleportado §5" + args[1] + "§6 para a warp " + args[0] + " com Sucesso!");
                return true;
            } else

            if (args[0].equalsIgnoreCase("1A")) {
                Bukkit.getPlayer(args[1]).teleport(Locations.fase1a);
                sender.sendMessage(Strings.prefix + "§6Teleportado §5" + args[1] + "§6 para a warp " + args[0] + " com Sucesso!");
                return true;
            } else

            if (args[0].equalsIgnoreCase("1B")) {
                Bukkit.getPlayer(args[1]).teleport(Locations.fase1b);
                sender.sendMessage(Strings.prefix + "§6Teleportado §5" + args[1] + "§6 para a warp " + args[0] + " com Sucesso!");
                return true;
            } else

            if (args[0].equalsIgnoreCase("1C")) {
                Bukkit.getPlayer(args[1]).teleport(Locations.fase1c);
                sender.sendMessage(Strings.prefix + "§6Teleportado §5" + args[1] + "§6 para a warp " + args[0] + " com Sucesso!");
                return true;
            } else

            if (args[0].equalsIgnoreCase("1D")) {
                Bukkit.getPlayer(args[1]).teleport(Locations.fase1d);
                sender.sendMessage(Strings.prefix + "§6Teleportado §5" + args[1] + "§6 para a warp " + args[0] + " com Sucesso!");
                return true;
            } else

            if (args[0].equalsIgnoreCase("2A")) {
                Bukkit.getPlayer(args[1]).teleport(Locations.fase2a);
                sender.sendMessage(Strings.prefix + "§6Teleportado §5" + args[1] + "§6 para a warp " + args[0] + " com Sucesso!");
                return true;
            } else

            if (args[0].equalsIgnoreCase("2B")) {
                Bukkit.getPlayer(args[1]).teleport(Locations.fase2b);
                sender.sendMessage(Strings.prefix + "§6Teleportado §5" + args[1] + "§6 para a warp " + args[0] + " com Sucesso!");
                return true;
            } else

            if (args[0].equalsIgnoreCase("2C")) {
                Bukkit.getPlayer(args[1]).teleport(Locations.fase2c);
                sender.sendMessage(Strings.prefix + "§6Teleportado §5" + args[1] + "§6 para a warp " + args[0] + " com Sucesso!");
                return true;
            } else

            if (args[0].equalsIgnoreCase("2D")) {
                Bukkit.getPlayer(args[1]).teleport(Locations.fase2d);
                sender.sendMessage(Strings.prefix + "§6Teleportado §5" + args[1] + "§6 para a warp " + args[0] + " com Sucesso!");
                return true;
            } else

            if (args[0].equalsIgnoreCase("3A")) {
                Bukkit.getPlayer(args[1]).teleport(Locations.fase3a);
                sender.sendMessage(Strings.prefix + "§6Teleportado §5" + args[1] + "§6 para a warp " + args[0] + " com Sucesso!");
                return true;
            } else

            if (args[0].equalsIgnoreCase("3B")) {
                Bukkit.getPlayer(args[1]).teleport(Locations.fase3b);
                sender.sendMessage(Strings.prefix + "§6Teleportado §5" + args[1] + "§6 para a warp " + args[0] + " com Sucesso!");
                return true;
            } else

            if (args[0].equalsIgnoreCase("3C")) {
                Bukkit.getPlayer(args[1]).teleport(Locations.fase3c);
                sender.sendMessage(Strings.prefix + "§6Teleportado §5" + args[1] + "§6 para a warp " + args[0] + " com Sucesso!");
                return true;
            } else

            if (args[0].equalsIgnoreCase("3D")) {
                Bukkit.getPlayer(args[1]).teleport(Locations.fase3d);
                sender.sendMessage(Strings.prefix + "§6Teleportado §5" + args[1] + "§6 para a warp " + args[0] + " com Sucesso!");
                return true;
            } else

            if (args[0].equalsIgnoreCase("4A")) {
                Bukkit.getPlayer(args[1]).teleport(Locations.fase4a);
                sender.sendMessage(Strings.prefix + "§6Teleportado §5" + args[1] + "§6 para a warp " + args[0] + " com Sucesso!");
                return true;
            } else

            if (args[0].equalsIgnoreCase("4B")) {
                Bukkit.getPlayer(args[1]).teleport(Locations.fase4b);
                sender.sendMessage(Strings.prefix + "§6Teleportado §5" + args[1] + "§6 para a warp " + args[0] + " com Sucesso!");
                return true;
            } else

            if (args[0].equalsIgnoreCase("4C")) {
                Bukkit.getPlayer(args[1]).teleport(Locations.fase4c);
                sender.sendMessage(Strings.prefix + "§6Teleportado §5" + args[1] + "§6 para a warp " + args[0] + " com Sucesso!");
                return true;
            } else

            if (args[0].equalsIgnoreCase("4D")) {
                Bukkit.getPlayer(args[1]).teleport(Locations.fase4d);
                sender.sendMessage(Strings.prefix + "§6Teleportado §5" + args[1] + "§6 para a warp " + args[0] + " com Sucesso!");
                return true;
            } else

            if (args[0].equalsIgnoreCase("EasterEgg1")) {
                Bukkit.getPlayer(args[1]).teleport(Locations.easteregg1);
                sender.sendMessage(Strings.prefix + "§6Teleportado §5" + args[1] + "§6 para a warp " + args[0] + " com Sucesso!");
                return true;
            } else

            if (args[0].equalsIgnoreCase("EasterEgg2")) {
                Bukkit.getPlayer(args[1]).teleport(Locations.easteregg2);
                sender.sendMessage(Strings.prefix + "§6Teleportado §5" + args[1] + "§6 para a warp " + args[0] + " com Sucesso!");
                return true;
            } else

            if (args[0].equalsIgnoreCase("EasterEgg3")) {
                Bukkit.getPlayer(args[1]).teleport(Locations.easteregg3);
                sender.sendMessage(Strings.prefix + "§6Teleportado §5" + args[1] + "§6 para a warp " + args[0] + " com Sucesso!");
                return true;
            } else

            if (args[0].equalsIgnoreCase("EasterEgg4")) {
                Bukkit.getPlayer(args[1]).teleport(Locations.easteregg4);
                sender.sendMessage(Strings.prefix + "§6Teleportado §5" + args[1] + "§6 para a warp " + args[0] + " com Sucesso!");
                return true;
            } else

            if (args[0].equalsIgnoreCase("PlataformaFinal")) {
                Bukkit.getPlayer(args[1]).teleport(Locations.plataformafinal);
                sender.sendMessage(Strings.prefix + "§6Teleportado §5" + args[1] + "§6 para a warp " + args[0] + " com Sucesso!");
                return true;
            } else

            if (args[0].equalsIgnoreCase("Warps")) {
                Bukkit.getPlayer(args[1]).teleport(Locations.warps);
                sender.sendMessage(Strings.prefix + "§6Teleportado §5" + args[1] + "§6 para a warp " + args[0] + " com Sucesso!");
                return true;
            } else

            {
                sender.sendMessage(Strings.prefix + "§cWarp Inexistente!");
                sender.sendMessage(Strings.prefix + "§6Digite: /" + command.getName() + " [NomeDaFase]");
                return true;
            }

        }

    }

}
