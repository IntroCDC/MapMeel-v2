package br.com.introgamer.mapmeel.commands;

import java.util.ArrayList;
import java.util.Random;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.EnderDragon;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;
import org.bukkit.util.Vector;

import br.com.introgamer.mapmeel.variables.Jogadores;
import br.com.introgamer.mapmeel.variables.Strings;
import br.com.introgamer.mapmeel.variables.Variables;
import br.com.introgamer.mapmeel.variables.scoreManager;

public class CommandEvento implements CommandExecutor {

    public static int lastX = 0;
    public static int lastZ = 0;

    @Override
    public boolean onCommand(final CommandSender sender, final Command command, final String label, final String[] args) {

        if (Variables.MeelBlock) {
            if (sender.getName().equalsIgnoreCase(Jogadores.Meel)) {
                sender.sendMessage(Strings.prefix + Strings.semPerm);
                return true;
            }
        }

        if (args.length == 0) {
            sender.sendMessage(Strings.prefix + "§bUse: /evento [evento]");
            sender.sendMessage(Strings.prefix + "§6Eventos: §eDragao§6, §eTesteRP§6, §eLimparChat§6, §eRespiro");
            return true;
        }

        if (args[0].equalsIgnoreCase("dragao")) {
            final EnderDragon dragao = (EnderDragon) Bukkit.getWorld("world").spawnEntity(new Location(Bukkit.getWorld("world"), -2623.0, 118.0, 659.0), EntityType.ENDER_DRAGON);

            dragao.setCustomName("§9§lSEU MAIOR PESADELO!!!");
            dragao.setCustomNameVisible(true);
            dragao.teleport(new Location(Bukkit.getWorld("world"), -2623.0, 118.0, 659.0));
            dragao.setVelocity(new Vector(-0.1, 0, 0));

            new BukkitRunnable() {
                @Override
                public void run() {
                    dragao.teleport(new Location(Bukkit.getWorld("world"), -2633.0, 118.0, 659.0));
                }
            }.runTaskLater(Variables.plugin, 20L);

            new BukkitRunnable() {
                @Override
                public void run() {
                    dragao.teleport(new Location(Bukkit.getWorld("world"), -2643.0, 118.0, 659.0));
                }
            }.runTaskLater(Variables.plugin, 40L);

            new BukkitRunnable() {
                @Override
                public void run() {
                    dragao.teleport(new Location(Bukkit.getWorld("world"), -2653.0, 118.0, 659.0));
                }
            }.runTaskLater(Variables.plugin, 60L);

            new BukkitRunnable() {
                @Override
                public void run() {
                    dragao.teleport(new Location(Bukkit.getWorld("world"), -2663.0, 118.0, 659.0));
                }
            }.runTaskLater(Variables.plugin, 80L);

            new BukkitRunnable() {
                @Override
                public void run() {
                    dragao.teleport(new Location(Bukkit.getWorld("world"), -2673.0, 118.0, 659.0));
                }
            }.runTaskLater(Variables.plugin, 100L);

            new BukkitRunnable() {
                @Override
                public void run() {
                    dragao.remove();
                }
            }.runTaskLater(Variables.plugin, 110L);
        }

        if (args[0].equalsIgnoreCase("testerp")) {
            Variables.NaoPassouDoTeste.clear();

            for (final Player p : Bukkit.getOnlinePlayers()) {
                Variables.NaoPassouDoTeste.add(p.getName());
            }

            Variables.PassouDoTesteActive = true;

            Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "playsound mapmeel.testando @a 0 50 0 50000 1");

            new BukkitRunnable() {
                @Override
                public void run() {

                    for (final Player p : Bukkit.getOnlinePlayers()) {
                        if (Variables.NaoPassouDoTeste.contains(p.getName())) {
                            p.kickPlayer(Strings.prefix + "§4§lVocê é obrigado(a) a usar a textura no MapMeel!");
                        }
                    }

                    Variables.PassouDoTesteActive = false;
                    Bukkit.broadcastMessage(Strings.prefix + "§aQuem não falou Oi no chat foi kickado com Sucesso!");

                }
            }.runTaskLater(Variables.plugin, 200L);
        } else if (args[0].equalsIgnoreCase("limparchat")) {

            for (final Player p : Bukkit.getOnlinePlayers()) {
                p.sendMessage(" ");
                p.sendMessage(" ");
                p.sendMessage(" ");
                p.sendMessage(" ");
                p.sendMessage(" ");
                p.sendMessage(" ");
                p.sendMessage(" ");
                p.sendMessage(" ");
                p.sendMessage(" ");
                p.sendMessage(" ");
                p.sendMessage(" ");
                p.sendMessage(" ");
                p.sendMessage(" ");
                p.sendMessage(" ");
                p.sendMessage(" ");
                p.sendMessage(" ");
                p.sendMessage(" ");
                p.sendMessage(" ");
                p.sendMessage(" ");
                p.sendMessage(" ");
                p.sendMessage(" ");
                p.sendMessage(" ");
                p.sendMessage(" ");
                p.sendMessage(" ");
                p.sendMessage(" ");
                p.sendMessage(" ");
                p.sendMessage(" ");
                p.sendMessage(" ");
                p.sendMessage(" ");
                p.sendMessage(" ");
                p.sendMessage(" ");
                p.sendMessage(" ");
                p.sendMessage(" ");
                p.sendMessage(" ");
                p.sendMessage(" ");
                p.sendMessage(" ");
                p.sendMessage(" ");
                p.sendMessage(" ");
                p.sendMessage(" ");
                p.sendMessage(" ");
                p.sendMessage(" ");
                p.sendMessage(" ");
                p.sendMessage(" ");
                p.sendMessage(" ");
                p.sendMessage(" ");
                p.sendMessage(" ");
                p.sendMessage(" ");
                p.sendMessage(" ");
                p.sendMessage(" ");
                p.sendMessage(" ");
                p.sendMessage(" ");
                p.sendMessage(" ");
                p.sendMessage(" ");
                p.sendMessage(" ");
                p.sendMessage(" ");
                p.sendMessage(" ");
                p.sendMessage(" ");
                p.sendMessage(" ");
                p.sendMessage(" ");
                p.sendMessage(" ");
                p.sendMessage(" ");
                p.sendMessage(" ");
                p.sendMessage(" ");
                p.sendMessage(" ");
                p.sendMessage(" ");
                p.sendMessage(" ");
                p.sendMessage(" ");
                p.sendMessage(" ");
                p.sendMessage(" ");
                p.sendMessage(" ");
                p.sendMessage(" ");
                p.sendMessage(" ");
                p.sendMessage(" ");
                p.sendMessage(" ");
                p.sendMessage(" ");
                p.sendMessage(" ");
                p.sendMessage(" ");
                p.sendMessage(" ");
                p.sendMessage(" ");
                p.sendMessage(" ");
                p.sendMessage(" ");
                p.sendMessage(" ");
                p.sendMessage(" ");
                p.sendMessage(" ");
                p.sendMessage(" ");
                p.sendMessage(" ");
                p.sendMessage(" ");
                p.sendMessage(" ");
                p.sendMessage(" ");
                p.sendMessage(" ");
                p.sendMessage(" ");
                p.sendMessage(" ");
                p.sendMessage(" ");
                p.sendMessage(" ");
                p.sendMessage(" ");
                p.sendMessage(" ");
                p.sendMessage(" ");
                p.sendMessage(" ");
                p.sendMessage(" ");
                p.sendMessage(" ");
                p.sendMessage(" ");
                p.sendMessage(" ");
                p.sendMessage(" ");
                p.sendMessage(" ");
                p.sendMessage(" ");
                p.sendMessage(" ");
                p.sendMessage(" ");
                p.sendMessage(" ");
                p.sendMessage(" ");
                p.sendMessage(" ");
                p.sendMessage(" ");
                p.sendMessage(" ");
                p.sendMessage(" ");
                p.sendMessage(" ");
                p.sendMessage(" ");
                p.sendMessage(" ");
                p.sendMessage(" ");
                p.sendMessage(" ");
                p.sendMessage(" ");
                p.sendMessage(" ");
                p.sendMessage(" ");
                p.sendMessage(" ");
                p.sendMessage(" ");
                p.sendMessage(" ");
                p.sendMessage(" ");
                p.sendMessage(" ");
                p.sendMessage(" ");
                p.sendMessage(" ");
            }

            Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "avisoconsole §b§lChat Limpo por " + sender.getName());
        } else if (args[0].equalsIgnoreCase("respiro")) {

            if (args.length != 2) {
                sender.sendMessage(Strings.prefix + "§bUse /evento respiro [nick]");
                return true;
            }

            if (!scoreManager.tipo.equalsIgnoreCase("3D")) {
                sender.sendMessage(Strings.prefix + "§cO Respiro só pode ser efetuado no level 3D!");
                return true;
            }

            if (Bukkit.getPlayer(args[1]) == null) {
                sender.sendMessage(Strings.prefix + "§c" + args[1] + Strings.naoOnline);
                return true;
            }

            sender.sendMessage(Strings.prefix + "§4§lRESPIRO ATIVADO PARA O JOGADOR " + Bukkit.getPlayer(args[1]).getName() + "!");

            final ArrayList<String> Respiro = new ArrayList<>();
            final ArrayList<String> Jumpscare = new ArrayList<>();

            Respiro.add("fnafr1");
            Respiro.add("fnafr2");
            Respiro.add("fnafr3");
            Respiro.add("fnafr4");
            Respiro.add("fnafr5");

            Jumpscare.add("fnafjump1");
            Jumpscare.add("fnafjump2");
            Jumpscare.add("fnafjump3");
            Jumpscare.add("fnafjump4");
            Jumpscare.add("fnafjumpgf");
            Jumpscare.add("fnafjump4f");

            final Random RRandom = new Random();
            final String REscolhido = Respiro.get(RRandom.nextInt(Respiro.size()));

            final Random JRandom = new Random();
            final String JEscolhido = Jumpscare.get(JRandom.nextInt(Jumpscare.size()));

            Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "audio " + REscolhido);
            Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "avisoconsole §4§l" + sender.getName() + " ATIVOU O EVENTO RESPIRO PARA " + Bukkit.getPlayer(args[1]).getName() + "!!!!!");

            new BukkitRunnable() {
                @Override
                public void run() {
                    CommandEvento.lastX = (int) Bukkit.getPlayer(args[1]).getLocation().getX();
                    CommandEvento.lastZ = (int) Bukkit.getPlayer(args[1]).getLocation().getZ();
                }
            }.runTaskLater(Variables.plugin, 20L);

            new BukkitRunnable() {
                @Override
                public void run() {
                    if (Bukkit.getPlayer(args[1]) != null) {
                        if ((int) Bukkit.getPlayer(args[1]).getLocation().getX() != CommandEvento.lastX || (int) Bukkit.getPlayer(args[1]).getLocation().getZ() != CommandEvento.lastZ) {
                            Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "audio " + JEscolhido);

                            Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "avisoconsole §c§l" + Bukkit.getPlayer(args[1]).getName() + " LEVOU O JUMPSCARE!");
                        } else {
                            Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "avisoconsole §2§l" + Bukkit.getPlayer(args[1]).getName() + " SE SALVOU DO JUMPSCARE!");
                        }
                    } else {
                        Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "avisoconsole §e§l" + Bukkit.getPlayer(args[1]).getName() + " ARRUGOU E SAIU DO SERVIDOR!");
                    }
                }
            }.runTaskLater(Variables.plugin, 100L);

        } else {
            sender.sendMessage(Strings.prefix + "§cEvento desconhecido!");
            sender.sendMessage(Strings.prefix + "§bUse: /evento [evento]");
            sender.sendMessage(Strings.prefix + "§6Eventos: §eDragao§6, §eTesteRP§6, §eLimparChat§6, §eRespiro");
            return true;
        }

        return false;
    }

}
