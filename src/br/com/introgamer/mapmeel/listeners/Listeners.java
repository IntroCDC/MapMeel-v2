package br.com.introgamer.mapmeel.listeners;

import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBurnEvent;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.event.player.PlayerPickupItemEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.scheduler.BukkitRunnable;

import br.com.introgamer.mapmeel.Methods;
import br.com.introgamer.mapmeel.variables.Jogadores;
import br.com.introgamer.mapmeel.variables.Strings;
import br.com.introgamer.mapmeel.variables.Variables;
import br.com.introgamer.mapmeel.variables.scoreManager;

public class Listeners implements Listener {

    @EventHandler
    public void onBlockBurn(final BlockBurnEvent e) {
        Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "avisoconsole §4§lFOGO!!!!! §cESTÁ ESPALHANDO FOGO NAS COORDENADAS: X: " + e.getBlock().getX() + ", Y: " + e.getBlock().getY() + ", Z: " + e.getBlock().getZ() + "!!!!!!!!");
        e.setCancelled(true);
    }

    @EventHandler
    public void onPlayerDeath(final PlayerDeathEvent e) {
        Methods.Errou();
    }

    @EventHandler
    public void onPlayerMove(final PlayerMoveEvent e) {
        if (Bukkit.getWorld("world").isThundering()) {
            Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "toggledownfall");
        }

        if (Bukkit.getWorld("world").getBlockAt(e.getPlayer().getLocation()).getType() == Material.TRIPWIRE) {
            if (scoreManager.tipo.equalsIgnoreCase("1A") || scoreManager.tipo.equalsIgnoreCase("1B") || scoreManager.tipo.equalsIgnoreCase("1C")) {
                new BukkitRunnable() {
                    @Override
                    public void run() {
                        Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "warp " + scoreManager.tipo + " " + e.getPlayer().getName());
                    }
                }.runTaskLater(Variables.plugin, 3L);
            } else if (scoreManager.tipo.equalsIgnoreCase("1D")) {
                if (e.getPlayer().getLocation().getX() < -2144 && e.getPlayer().getLocation().getY() < 73) {
                    new BukkitRunnable() {
                        @Override
                        public void run() {
                            e.getPlayer().teleport(new Location(Bukkit.getWorld("world"), -2146.5, 79.0, 1522.0));
                        }
                    }.runTaskLater(Variables.plugin, 3L);
                }

                if (e.getPlayer().getLocation().getX() > -2144 && e.getPlayer().getLocation().getY() < 73) {
                    new BukkitRunnable() {
                        @Override
                        public void run() {
                            Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "warp " + scoreManager.tipo + " " + e.getPlayer().getName());
                        }
                    }.runTaskLater(Variables.plugin, 3L);
                }
            } else if (scoreManager.tipo.equalsIgnoreCase("4C")) {
                new BukkitRunnable() {
                    @Override
                    public void run() {
                        e.getPlayer().teleport(new Location(Bukkit.getWorld("world"), -2546.5, 86.0, 659.5));
                    }
                }.runTaskLater(Variables.plugin, 3L);
            }
        }

        if (e.getPlayer().getLocation().getY() <= -1.0) {
            if (!Variables.Jogo) {
                Variables.mlg = 1;
                e.getPlayer().teleport(new Location(e.getPlayer().getWorld(), e.getPlayer().getLocation().getX(), 200.0, e.getPlayer().getLocation().getZ()));
                e.getPlayer().sendMessage(Strings.prefix + "§9Será que você consegue fazer §1§lMLG?");

                if (!e.getPlayer().getInventory().contains(new ItemStack(Material.WATER_BUCKET))) {
                    e.getPlayer().getInventory().addItem(new ItemStack(Material.WATER_BUCKET));
                }

                Variables.ModoEditor = true;
                Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "avisoconsole §c" + e.getPlayer().getName() + " §4Pulou no void para fazer MLG");

                e.getPlayer().setGameMode(GameMode.SURVIVAL);

                new BukkitRunnable() {
                    @Override
                    public void run() {
                        e.getPlayer().setGameMode(GameMode.ADVENTURE);
                        Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "clear @a water_bucket");
                        Variables.ModoEditor = false;

                        if (Variables.mlg == 0) {
                            Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "avisoconsole §c" + e.getPlayer().getName() + " §aacabou o mlg <MLG=BUG>");
                            Variables.mlg = 0;
                        } else if (Variables.mlg == 2) {
                            Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "avisoconsole §c" + e.getPlayer().getName() + " §aacabou o mlg <MLG=Errou>");
                            Variables.mlg = 0;
                        } else if (Variables.mlg == 1) {
                            e.getPlayer().sendTitle("§2§lAEEEE, ACERTOOO!", Strings.prefix + "§aParabéns! §7Você acertou o MLG!");
                            Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "avisoconsole §c" + e.getPlayer().getName() + " §aacabou o mlg <MLG=Acertou!>");
                            Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "playsound mapmeel.turndown @a " + e.getPlayer().getLocation().getX() + " " + e.getPlayer().getLocation().getY() + " " + e.getPlayer().getLocation().getZ() + " 50000 1");
                            Variables.mlg = 0;
                        }
                    }
                }.runTaskLater(Variables.plugin, 100L);
            } else {
                if (e.getPlayer().getLocation().getY() < -1) {
                    e.getPlayer().damage(1000000000);
                }
            }
        }

        if (Variables.ModoEditor) {
            return;
        }

        if (Variables.MLGCommand) {
            return;
        }

        if (Jogadores.admins.contains(e.getPlayer().getName())) {
            return;
        }

        if (Variables.GmIntro && Variables.Jogadores.contains(e.getPlayer().getName())) {
            return;
        }

        if (e.getPlayer().getGameMode() != GameMode.ADVENTURE) {
            if (e.getPlayer().getName().equalsIgnoreCase(Jogadores.Meel)) {
                e.getPlayer().setGameMode(GameMode.ADVENTURE);
                e.getPlayer().sendTitle("§2§lOPA >.>", "§7Parece que tem uma " + e.getPlayer().getName() + " entrando em gamemode neh >.>");
                Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "avisoconsole " + e.getPlayer().getName() + " tentou entrar em outro GameMode");
            } else {
                e.getPlayer().setGameMode(GameMode.ADVENTURE);
                e.getPlayer().sendTitle("§2§lOPA >.>", "§7Parece que tem um " + e.getPlayer().getName() + " entrando em gamemode neh >.>");
                Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "avisoconsole " + e.getPlayer().getName() + " tentou entrar em outro GameMode");
            }
        }
    }

    @EventHandler
    public void onPlayrPickupItem(final PlayerPickupItemEvent e) {
        if (Jogadores.admins.contains(e.getPlayer().getName())) {
            e.setCancelled(true);
        }
    }

}
