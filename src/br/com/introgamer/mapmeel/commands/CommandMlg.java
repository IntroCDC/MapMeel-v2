package br.com.introgamer.mapmeel.commands;

import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.scheduler.BukkitRunnable;

import br.com.introgamer.mapmeel.variables.ItemStacks;
import br.com.introgamer.mapmeel.variables.Jogadores;
import br.com.introgamer.mapmeel.variables.Strings;
import br.com.introgamer.mapmeel.variables.Variables;

public class CommandMlg implements CommandExecutor {

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
            sender.sendMessage(Strings.prefix + "§bUse: /" + command.getName() + " [NICK]");
            return true;
        }

        if (Bukkit.getPlayer(args[0]) == null) {
            sender.sendMessage(Strings.prefix + "§c" + args[0] + " está offline...");
            return true;
        }

        if (Variables.MLGCommand) {
            sender.sendMessage(Strings.prefix + "§cJá possui um MLG por comando em andamento!");
            return true;
        }

        Variables.MLGCommand = true;

        sender.sendMessage(Strings.prefix + "§9MLG ATIVADO!");

        Bukkit.broadcastMessage(Strings.prefix + "§2§l" + args[0] + " PREPARE-SE PARA FAZER MLG! §a§lVocê tem 3 segundos!");

        ItemStacks.BaldeMLGMeta.setDisplayName(Strings.BaldeMLGNome);
        ItemStacks.BaldeMLG.setItemMeta(ItemStacks.BaldeMLGMeta);

        Bukkit.getPlayer(args[0]).getInventory().addItem(ItemStacks.BaldeMLG);
        Bukkit.getPlayer(args[0]).setGameMode(GameMode.SURVIVAL);

        Variables.MLGYJogador = Bukkit.getPlayer(args[0]).getLocation().getY();
        Strings.BaldeMLGJogador = Bukkit.getPlayer(args[0]).getName();

        new BukkitRunnable() {
            @Override
            public void run() {
                if (Bukkit.getPlayer(args[0]) == null) {
                    Variables.MLGYJogador = 0.0;
                    Strings.BaldeMLGJogador = null;
                    Variables.MLGMorreu = false;
                    Variables.MLGCommand = false;
                    return;
                }
                if (Variables.MLGMorreu) {
                    Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "clear " + Bukkit.getPlayer(args[0]).getName() + " water_bucket");
                    Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "clear " + Bukkit.getPlayer(args[0]).getName() + " bucket");
                    Bukkit.getPlayer(args[0]).setGameMode(GameMode.ADVENTURE);
                    Variables.MLGYJogador = 0.0;
                    Strings.BaldeMLGJogador = null;
                    Variables.MLGMorreu = false;
                    Variables.MLGCommand = false;
                    return;
                }
                if (!Variables.MLGCommand) {
                    Bukkit.getPlayer(args[0]).setGameMode(GameMode.ADVENTURE);
                    Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "clear " + Bukkit.getPlayer(args[0]).getName() + " water_bucket");
                    Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "clear " + Bukkit.getPlayer(args[0]).getName() + " bucket");
                    Variables.MLGYJogador = 0.0;
                    Strings.BaldeMLGJogador = null;
                    Variables.MLGMorreu = false;
                    Variables.MLGCommand = false;
                    return;
                }
                if (Bukkit.getPlayer(args[0]).getLocation().getY() >= Variables.MLGYJogador - 2.0) {
                    Bukkit.getPlayer(args[0]).sendMessage(Strings.prefix + "§bVai ficar ai mesmo? '-'");
                    Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "clear " + Bukkit.getPlayer(args[0]).getName() + " water_bucket");
                    Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "clear " + Bukkit.getPlayer(args[0]).getName() + " bucket");
                    Bukkit.getPlayer(args[0]).setGameMode(GameMode.ADVENTURE);
                    Variables.MLGYJogador = 0.0;
                    Strings.BaldeMLGJogador = null;
                    Variables.MLGMorreu = false;
                    Variables.MLGCommand = false;
                    return;
                }

                Bukkit.getPlayer(args[0]).sendTitle("§2§lAEEEE, ACERTOOO!", Strings.prefix + "§aParabéns! §7Você acertou o MLG!");
                Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "avisoconsole §c" + Bukkit.getPlayer(args[0]).getName() + " Fez o MLG! §7§o(Via Comando!)");
                Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "playsound mapmeel.turndown @a " + Bukkit.getPlayer(args[0]).getLocation().getX() + " " + Bukkit.getPlayer(args[0]).getLocation().getY() + " " + Bukkit.getPlayer(args[0]).getLocation().getZ() + " 50000 1");

                Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "clear " + Bukkit.getPlayer(args[0]).getName() + " water_bucket");
                Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "clear " + Bukkit.getPlayer(args[0]).getName() + " bucket");
                Bukkit.getPlayer(args[0]).setGameMode(GameMode.ADVENTURE);
                Variables.MLGCommand = false;
            }
        }.runTaskLater(Variables.plugin, 90L);

        return false;
    }

}
