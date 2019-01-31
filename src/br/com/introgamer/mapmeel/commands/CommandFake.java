package br.com.introgamer.mapmeel.commands;

import org.bukkit.Bukkit;
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
import me.libraryaddict.disguise.disguisetypes.PlayerDisguise;
import net.minecraft.server.v1_8_R3.PlayerList;

public class CommandFake implements CommandExecutor {

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

        if (args.length == 0) {
            sender.sendMessage(Strings.prefix + "§cUse /" + command.getName() + " [NICK]");
        } else if (args.length >= 2) {
            sender.sendMessage(Strings.prefix + "§cUse /" + command.getName() + " [NICK]");
        } else if (args.length == 1) {
            if (args[0].length() > 26) {
                sender.sendMessage(Strings.prefix + "§cO Fake não pode ser tao grande! MAX: 26");
                return true;
            }

            if (sender.getName().equalsIgnoreCase(Jogadores.Intro)) {
                sender.sendMessage(Strings.prefix + "§bSeu fake  foi alterado para '" + args[0] + "' com Sucesso!");
                sender.sendMessage(Strings.prefix + "§bPara resetar seu fake, Digite: /tfake");

                PlayerDisguise pD = new PlayerDisguise(args[0], args[0]);
                DisguiseAPI.disguiseToAll((Player) sender, pD);
                ((Player) sender).setPlayerListName(args[0]);
                ((Player) sender).setDisplayName(args[0]);
                ((Player) sender).setCustomName(args[0]);
                PlayerList playerList = ((CraftServer) Bukkit.getServer()).getHandle();
                playerList.d(((CraftPlayer) sender).getHandle());

                Jogadores.FakeNickIntro = args[0];
                Jogadores.FakePlayerIntro = true;
            } else if (sender.getName().equalsIgnoreCase(Jogadores.Meel)) {
                sender.sendMessage(Strings.prefix + "§bSeu fake  foi alterado para '" + args[0] + "' com Sucesso!");
                sender.sendMessage(Strings.prefix + "§bPara resetar seu fake, Digite: /tfake");

                PlayerDisguise pD = new PlayerDisguise(args[0], args[0]);
                DisguiseAPI.disguiseToAll((Player) sender, pD);
                ((Player) sender).setPlayerListName(args[0]);
                ((Player) sender).setDisplayName(args[0]);
                ((Player) sender).setCustomName(args[0]);
                PlayerList playerList = ((CraftServer) Bukkit.getServer()).getHandle();
                playerList.d(((CraftPlayer) sender).getHandle());

                Jogadores.FakeNickMeel = args[0];
                Jogadores.FakePlayerMeel = true;
            } else if (sender.getName().equalsIgnoreCase(Jogadores.Diego)) {
                sender.sendMessage(Strings.prefix + "§bSeu fake  foi alterado para '" + args[0] + "' com Sucesso!");
                sender.sendMessage(Strings.prefix + "§bPara resetar seu fake, Digite: /tfake");

                PlayerDisguise pD = new PlayerDisguise(args[0], args[0]);
                DisguiseAPI.disguiseToAll((Player) sender, pD);
                ((Player) sender).setPlayerListName(args[0]);
                ((Player) sender).setDisplayName(args[0]);
                ((Player) sender).setCustomName(args[0]);
                PlayerList playerList = ((CraftServer) Bukkit.getServer()).getHandle();
                playerList.d(((CraftPlayer) sender).getHandle());

                Jogadores.FakeNickDiego = args[0];
                Jogadores.FakePlayerDiego = true;
            } else if (sender.getName().equalsIgnoreCase(Jogadores.Sombra)) {
                sender.sendMessage(Strings.prefix + "§bSeu fake  foi alterado para '" + args[0] + "' com Sucesso!");
                sender.sendMessage(Strings.prefix + "§bPara resetar seu fake, Digite: /tfake");

                PlayerDisguise pD = new PlayerDisguise(args[0], args[0]);
                DisguiseAPI.disguiseToAll((Player) sender, pD);
                ((Player) sender).setPlayerListName(args[0]);
                ((Player) sender).setDisplayName(args[0]);
                ((Player) sender).setCustomName(args[0]);
                PlayerList playerList = ((CraftServer) Bukkit.getServer()).getHandle();
                playerList.d(((CraftPlayer) sender).getHandle());

                Jogadores.FakeNickSombra = args[0];
                Jogadores.FakePlayerSombra = true;
            } else if (sender.getName().equalsIgnoreCase(Jogadores.Raymeki)) {
                sender.sendMessage(Strings.prefix + "§bSeu fake  foi alterado para '" + args[0] + "' com Sucesso!");
                sender.sendMessage(Strings.prefix + "§bPara resetar seu fake, Digite: /tfake");

                PlayerDisguise pD = new PlayerDisguise(args[0], args[0]);
                DisguiseAPI.disguiseToAll((Player) sender, pD);
                ((Player) sender).setPlayerListName(args[0]);
                ((Player) sender).setDisplayName(args[0]);
                ((Player) sender).setCustomName(args[0]);
                PlayerList playerList = ((CraftServer) Bukkit.getServer()).getHandle();
                playerList.d(((CraftPlayer) sender).getHandle());

                Jogadores.FakeNickRaymeki = args[0];
                Jogadores.FakePlayerRaymeki = true;
            } else if (sender.getName().equalsIgnoreCase(Jogadores.Edder)) {
                sender.sendMessage(Strings.prefix + "§bSeu fake  foi alterado para '" + args[0] + "' com Sucesso!");
                sender.sendMessage(Strings.prefix + "§bPara resetar seu fake, Digite: /tfake");

                PlayerDisguise pD = new PlayerDisguise(args[0], args[0]);
                DisguiseAPI.disguiseToAll((Player) sender, pD);
                ((Player) sender).setPlayerListName(args[0]);
                ((Player) sender).setDisplayName(args[0]);
                ((Player) sender).setCustomName(args[0]);
                PlayerList playerList = ((CraftServer) Bukkit.getServer()).getHandle();
                playerList.d(((CraftPlayer) sender).getHandle());

                Jogadores.FakeNickEdder = args[0];
                Jogadores.FakePlayerEdder = true;
            } else if (sender.getName().equalsIgnoreCase(Jogadores.Crazy)) {
                sender.sendMessage(Strings.prefix + "§bSeu fake  foi alterado para '" + args[0] + "' com Sucesso!");
                sender.sendMessage(Strings.prefix + "§bPara resetar seu fake, Digite: /tfake");

                PlayerDisguise pD = new PlayerDisguise(args[0], args[0]);
                DisguiseAPI.disguiseToAll((Player) sender, pD);
                ((Player) sender).setPlayerListName(args[0]);
                ((Player) sender).setDisplayName(args[0]);
                ((Player) sender).setCustomName(args[0]);
                PlayerList playerList = ((CraftServer) Bukkit.getServer()).getHandle();
                playerList.d(((CraftPlayer) sender).getHandle());

                Jogadores.FakeNickCrazy = args[0];
                Jogadores.FakePlayerCrazy = true;
            } else if (sender.getName().equalsIgnoreCase(Jogadores.Dede)) {
                sender.sendMessage(Strings.prefix + "§bSeu fake  foi alterado para '" + args[0] + "' com Sucesso!");
                sender.sendMessage(Strings.prefix + "§bPara resetar seu fake, Digite: /tfake");

                PlayerDisguise pD = new PlayerDisguise(args[0], args[0]);
                DisguiseAPI.disguiseToAll((Player) sender, pD);
                ((Player) sender).setPlayerListName(args[0]);
                ((Player) sender).setDisplayName(args[0]);
                ((Player) sender).setCustomName(args[0]);
                PlayerList playerList = ((CraftServer) Bukkit.getServer()).getHandle();
                playerList.d(((CraftPlayer) sender).getHandle());

                Jogadores.FakeNickDede = args[0];
                Jogadores.FakePlayerDede = true;
            } else if (sender.getName().equalsIgnoreCase(Jogadores.Beaats)) {
                sender.sendMessage(Strings.prefix + "§bSeu fake  foi alterado para '" + args[0] + "' com Sucesso!");
                sender.sendMessage(Strings.prefix + "§bPara resetar seu fake, Digite: /tfake");

                PlayerDisguise pD = new PlayerDisguise(args[0], args[0]);
                DisguiseAPI.disguiseToAll((Player) sender, pD);
                ((Player) sender).setPlayerListName(args[0]);
                ((Player) sender).setDisplayName(args[0]);
                ((Player) sender).setCustomName(args[0]);
                PlayerList playerList = ((CraftServer) Bukkit.getServer()).getHandle();
                playerList.d(((CraftPlayer) sender).getHandle());

                Jogadores.FakeNickBeaats = args[0];
                Jogadores.FakePlayerBeaats = true;
            } else if (sender.getName().equalsIgnoreCase(Jogadores.Biidu)) {
                sender.sendMessage(Strings.prefix + "§bSeu fake  foi alterado para '" + args[0] + "' com Sucesso!");
                sender.sendMessage(Strings.prefix + "§bPara resetar seu fake, Digite: /tfake");

                PlayerDisguise pD = new PlayerDisguise(args[0], args[0]);
                DisguiseAPI.disguiseToAll((Player) sender, pD);
                ((Player) sender).setPlayerListName(args[0]);
                ((Player) sender).setDisplayName(args[0]);
                ((Player) sender).setCustomName(args[0]);
                PlayerList playerList = ((CraftServer) Bukkit.getServer()).getHandle();
                playerList.d(((CraftPlayer) sender).getHandle());

                Jogadores.FakeNickBiidu = args[0];
                Jogadores.FakePlayerBiidu = true;
            } else if (sender.getName().equalsIgnoreCase(Jogadores.Keroch)) {
                sender.sendMessage(Strings.prefix + "§bSeu fake  foi alterado para '" + args[0] + "' com Sucesso!");
                sender.sendMessage(Strings.prefix + "§bPara resetar seu fake, Digite: /tfake");

                PlayerDisguise pD = new PlayerDisguise(args[0], args[0]);
                DisguiseAPI.disguiseToAll((Player) sender, pD);
                ((Player) sender).setPlayerListName(args[0]);
                ((Player) sender).setDisplayName(args[0]);
                ((Player) sender).setCustomName(args[0]);
                PlayerList playerList = ((CraftServer) Bukkit.getServer()).getHandle();
                playerList.d(((CraftPlayer) sender).getHandle());

                Jogadores.FakeNickKeroch = args[0];
                Jogadores.FakePlayerKeroch = true;
            } else if (sender.getName().equalsIgnoreCase(Jogadores.FelipeHeroPlay)) {
                sender.sendMessage(Strings.prefix + "§bSeu fake  foi alterado para '" + args[0] + "' com Sucesso!");
                sender.sendMessage(Strings.prefix + "§bPara resetar seu fake, Digite: /tfake");

                PlayerDisguise pD = new PlayerDisguise(args[0], args[0]);
                DisguiseAPI.disguiseToAll((Player) sender, pD);
                ((Player) sender).setPlayerListName(args[0]);
                ((Player) sender).setDisplayName(args[0]);
                ((Player) sender).setCustomName(args[0]);
                PlayerList playerList = ((CraftServer) Bukkit.getServer()).getHandle();
                playerList.d(((CraftPlayer) sender).getHandle());

                Jogadores.FakeNickFelipeHeroPlay = args[0];
                Jogadores.FakePlayerFelipeHeroPlay = true;
            } else if (sender.getName().equalsIgnoreCase(Jogadores.Mariao)) {
                sender.sendMessage(Strings.prefix + "§bSeu fake  foi alterado para '" + args[0] + "' com Sucesso!");
                sender.sendMessage(Strings.prefix + "§bPara resetar seu fake, Digite: /tfake");

                PlayerDisguise pD = new PlayerDisguise(args[0], args[0]);
                DisguiseAPI.disguiseToAll((Player) sender, pD);
                ((Player) sender).setPlayerListName(args[0]);
                ((Player) sender).setDisplayName(args[0]);
                ((Player) sender).setCustomName(args[0]);
                PlayerList playerList = ((CraftServer) Bukkit.getServer()).getHandle();
                playerList.d(((CraftPlayer) sender).getHandle());

                Jogadores.FakeNickMariao = args[0];
                Jogadores.FakePlayerMariao = true;
            } else {
                sender.sendMessage(Strings.prefix + "§cVocê não esta registrado no Plugin para dar /fake!");
                return true;
            }
        }

        return false;
    }

}
