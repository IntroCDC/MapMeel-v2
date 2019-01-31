package br.com.introgamer.mapmeel;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;

import br.com.introgamer.mapmeel.variables.Jogadores;
import br.com.introgamer.mapmeel.variables.Variables;
import br.com.introgamer.mapmeel.variables.scoreManager;

public class Updaters {

    public static void Loop1() {
        Updaters.Loop2();
    }

    public static void Loop2() {

        for (Player p : Bukkit.getOnlinePlayers()) {
            scoreManager.getManager().Scoreboard(p);
        }

        for (Player p : Bukkit.getOnlinePlayers()) {
            if (Jogadores.admins.contains(p.getName())) {
                for (Player player : Bukkit.getOnlinePlayers()) {
                    if (!Variables.Jogadores.contains(player.getName()) && !Variables.Permitidos.contains(player.getName())) {
                        player.hidePlayer(p);
                    }
                }
            }
        }

        new BukkitRunnable() {
            @Override
            public void run() {
                Updaters.Loop1();
            }
        }.runTaskLater(Variables.plugin, 5L);
    }

}
