package br.com.introgamer.mapmeel.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.scheduler.BukkitRunnable;

import br.com.introgamer.mapmeel.variables.Jogadores;
import br.com.introgamer.mapmeel.variables.Strings;
import br.com.introgamer.mapmeel.variables.Variables;

public class CommandCavernaultima implements CommandExecutor {

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

        if (Bukkit.getPlayer(Jogadores.Meel) == null) {
            Bukkit.broadcastMessage(Strings.prefix + "§aExecutando Caverna...");
        }

        Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "playsound mapmeel.heartofcourage @a -1662 50 639 50000 1");

        new BukkitRunnable() {
            @Override
            public void run() {
                Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "sfirework -470 34 911");
                Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "sfirework -447 34 911");
            }
        }.runTaskLater(Variables.plugin, 1398L);

        new BukkitRunnable() {
            @Override
            public void run() {
                Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "sfirework -470 34 922");
                Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "sfirework -447 34 922");
            }
        }.runTaskLater(Variables.plugin, 1436L);

        new BukkitRunnable() {
            @Override
            public void run() {
                Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "sfirework -470 34 939");
                Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "sfirework -447 34 939");
            }
        }.runTaskLater(Variables.plugin, 1470L);

        new BukkitRunnable() {
            @Override
            public void run() {
                Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "sfirework -470 34 963");
            }
        }.runTaskLater(Variables.plugin, 1506L);

        new BukkitRunnable() {
            @Override
            public void run() {
                Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "sfirework -447 34 963");
            }
        }.runTaskLater(Variables.plugin, 1524L);

        new BukkitRunnable() {
            @Override
            public void run() {
                Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "sfirework -470 34 981");
                Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "sfirework -447 34 981");
            }
        }.runTaskLater(Variables.plugin, 1542L);

        new BukkitRunnable() {
            @Override
            public void run() {
                Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "sfirework -470 34 981");
                Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "sfirework -447 34 981");
            }
        }.runTaskLater(Variables.plugin, 1574L);

        new BukkitRunnable() {
            @Override
            public void run() {
                Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "sfirework -470 34 994");
                Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "sfirework -447 34 994");
            }
        }.runTaskLater(Variables.plugin, 1610L);

        new BukkitRunnable() {
            @Override
            public void run() {
                Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "sfirework -470 34 1006");
                Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "sfirework -447 34 1006");
            }
        }.runTaskLater(Variables.plugin, 1646L);

        new BukkitRunnable() {
            @Override
            public void run() {
                Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "sfirework -470 34 1016");
                Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "sfirework -447 34 1016");
            }
        }.runTaskLater(Variables.plugin, 1662L);

        new BukkitRunnable() {
            @Override
            public void run() {
                Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "sfirework -470 34 1016");
                Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "sfirework -447 34 1016");
            }
        }.runTaskLater(Variables.plugin, 1670L);

        new BukkitRunnable() {
            @Override
            public void run() {
                Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "sfirework -470 34 1036");
                Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "sfirework -447 34 1036");
            }
        }.runTaskLater(Variables.plugin, 1682L);

        new BukkitRunnable() {
            @Override
            public void run() {
                Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "sfirework -470 34 1036");
                Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "sfirework -447 34 1036");
            }
        }.runTaskLater(Variables.plugin, 1720L);

        new BukkitRunnable() {
            @Override
            public void run() {
                Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "sfirework -470 34 1054");
                Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "sfirework -447 34 1054");
            }
        }.runTaskLater(Variables.plugin, 1754L);

        new BukkitRunnable() {
            @Override
            public void run() {
                Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "sfirework -470 34 1073");
                Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "sfirework -447 34 1073");
            }
        }.runTaskLater(Variables.plugin, 1788L);

        new BukkitRunnable() {
            @Override
            public void run() {
                Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "sfirework -470 34 1073");
                Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "sfirework -447 34 1073");
            }
        }.runTaskLater(Variables.plugin, 1808L);

        new BukkitRunnable() {
            @Override
            public void run() {
                Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "sfirework -470 34 1073");
                Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "sfirework -447 34 1073");
            }
        }.runTaskLater(Variables.plugin, 1816L);

        new BukkitRunnable() {
            @Override
            public void run() {
                Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "sfirework -470 34 1073");
                Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "sfirework -447 34 1073");
            }
        }.runTaskLater(Variables.plugin, 1824L);

        new BukkitRunnable() {
            @Override
            public void run() {
                Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "sfirework -470 34 1073");
                Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "sfirework -447 34 1073");
            }
        }.runTaskLater(Variables.plugin, 1860L);

        new BukkitRunnable() {
            @Override
            public void run() {
                Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "sfirework -470 34 1096");
                Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "sfirework -447 34 1096");
            }
        }.runTaskLater(Variables.plugin, 1894L);

        new BukkitRunnable() {
            @Override
            public void run() {
                Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "sfirework -470 34 1127");
                Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "sfirework -447 34 1127");
            }
        }.runTaskLater(Variables.plugin, 1904L);

        new BukkitRunnable() {
            @Override
            public void run() {
                Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "sfirework -470 34 1127");
                Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "sfirework -447 34 1127");
            }
        }.runTaskLater(Variables.plugin, 1932L);

        new BukkitRunnable() {
            @Override
            public void run() {
                Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "sfirework -470 34 1127");
                Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "sfirework -447 34 1127");
            }
        }.runTaskLater(Variables.plugin, 1942L);

        new BukkitRunnable() {
            @Override
            public void run() {
                Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "sfirework -470 34 1127");
                Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "sfirework -447 34 1127");
            }
        }.runTaskLater(Variables.plugin, 1950L);

        new BukkitRunnable() {
            @Override
            public void run() {
                Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "sfirework -470 34 1127");
                Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "sfirework -447 34 1127");
            }
        }.runTaskLater(Variables.plugin, 1958L);

        return false;
    }

}
