package br.com.introgamer.mapmeel.teatro;
/*
 * Written by IntroCDC, Bruno Coêlho at 31/01/2019 - 11:04
 */

import net.citizensnpcs.api.CitizensAPI;
import net.citizensnpcs.api.npc.NPC;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.entity.EntityType;
import org.bukkit.material.Lever;

public enum HistoriaV2 {
    INTRO("BrunoCoelho") {
        public void start() {

        }

    },
    MEEL("iMeel") {
        public void start() {

        }

    },
    BIIDU("Biidu") {
        public void start() {

        }

    },
    KEROCH("iKeroch") {
        public void start() {
            new CustomDelay(() -> {
                getNpc().spawn(MEIO.clone().add(0, 0, 1));
                getNpc().faceLocation(SPEC);
            }, 4, 11, 0);
            new CustomDelay(() -> getNpc().getNavigator().setTarget(ILHA.clone().add(0, 0, 1)), 4, 14, 0);
            new CustomDelay(() -> getNpc().faceLocation(SPEC), 4, 24, 0);
            new CustomDelay(() -> getNpc().faceLocation(VICTOR.getNpc().getStoredLocation()), 5, 0, 0);
            new CustomDelay(() -> getNpc().despawn(), 5, 3, 0);
            new CustomDelay(() -> {
                getNpc().spawn(MEIO.clone().add(0, 0, 1));
                getNpc().faceLocation(SPEC);
            }, 5, 32, 0);
            new CustomDelay(() -> getNpc().faceLocation(DIEGO.getNpc().getStoredLocation()), 5, 36, 0);
            new CustomDelay(() -> getNpc().despawn(), 5, 41, 0);
        }

    },
    DIEGO("DiegoSVP") {
        public void start() {
            new CustomDelay(() -> {
                getNpc().spawn(MEIO.clone().add(0, 0, 3));
                getNpc().faceLocation(SPEC);
            }, 5, 25, 0);
            new CustomDelay(() -> getNpc().getNavigator().setTarget(INTRO.getNpc().getStoredLocation().clone().add(0, 0, -2)), 5, 30, 0);
            new CustomDelay(() -> getNpc().getNavigator().setTarget(KEROCH.getNpc().getStoredLocation().clone().add(0, 0, 2)), 5, 34, 0);
            new CustomDelay(() -> getNpc().despawn(), 5, 41, 0);
            new CustomDelay(() -> {
                getNpc().spawn(MEIO.clone().add(0, 0, 3));
                getNpc().getNavigator().setTarget(MEEL.getNpc().getStoredLocation().clone().add(0, 0, 2));
            }, 8, 1, 0);
            new CustomDelay(() -> getNpc().despawn(), 8, 34, 0);
            new CustomDelay(() -> {
                getNpc().spawn(MEIO.clone().add(0, 0, 3));
                getNpc().faceLocation(SPEC);
            }, 12, 30, 0);
            new CustomDelay(() -> getNpc().despawn(), 12, 38, 0);
            new CustomDelay(() -> getNpc().despawn(), 14, 45, 0);
        }

    },
    BASE64("IntroCDC") {
        public void start() {
            new CustomDelay(() -> {
                getNpc().spawn(BASE);
                getNpc().faceLocation(SPEC);
            }, 6, 51, 0);
            new CustomDelay(() -> getNpc().despawn(), 7, 0, 0);
        }

    },
    VICTOR("XxazzipxX_YT") {
        public void start() {
            new CustomDelay(() -> {
                getNpc().spawn(MEIO.clone().add(0, 0, -2));
                getNpc().getNavigator().setTarget(ILHA.clone().add(0, 0, -2));
            }, 4, 37, 0);
            new CustomDelay(() -> getNpc().faceLocation(SPEC), 4, 45, 0);
            new CustomDelay(() -> getNpc().faceLocation(KEROCH.getNpc().getStoredLocation()), 5, 0, 0);
            new CustomDelay(() -> getNpc().despawn(), 5, 8, 0);
            new CustomDelay(() -> {
                getNpc().spawn(MEIO);
                getNpc().getNavigator().setTarget(BASE.clone().add(0, 0, 1));
            }, 7, 35, 0);
            new CustomDelay(() -> getNpc().faceLocation(SPEC), 7, 45, 0);
            new CustomDelay(() -> getNpc().despawn(), 8, 30, 0);
        }

    },
    RECOLOKO("Recoloko") {
        public void start() {
            new CustomDelay(() -> {
                getNpc().spawn(MEIO.clone().add(0, 0, 4));
                getNpc().faceLocation(SPEC);
            }, 2, 3, 0);
            new CustomDelay(() -> {
                ((Lever) Bukkit.getWorld("world").getBlockAt(-360, 67, 622).getState()).setPowered(true);
                getNpc().getNavigator().setTarget(PRISAO.clone().add(0, 0, 1));
            }, 2, 21, 0);
            new CustomDelay(() -> {
                ((Lever) Bukkit.getWorld("world").getBlockAt(-360, 67, 622).getState()).setPowered(false);
                getNpc().faceLocation(SPEC);
            }, 2, 28, 0);
            new CustomDelay(() -> {
                ((Lever) Bukkit.getWorld("world").getBlockAt(-360, 67, 622).getState()).setPowered(true);
                getNpc().getNavigator().setTarget(MEIO.clone().add(0, 0, 4));
            }, 2, 40, 0);
            new CustomDelay(() -> {
                ((Lever) Bukkit.getWorld("world").getBlockAt(-360, 67, 622).getState()).setPowered(false);
                getNpc().despawn();
            }, 2, 45, 0);
        }

    },
    CARNAGEE("_Carnagee") {
        public void start() {
            new CustomDelay(() -> {
                getNpc().spawn(PRISAOFRENTE);
                getNpc().faceLocation(SPEC);
                ((Lever) Bukkit.getWorld("world").getBlockAt(-360, 67, 622).getState()).setPowered(true);
            }, 3, 55, 0);
            new CustomDelay(() -> {
                ((Lever) Bukkit.getWorld("world").getBlockAt(-360, 67, 622).getState()).setPowered(false);
                getNpc().despawn();
            }, 4, 0, 0);
        }

    },
    VOLPE("Volpe") {
        public void start() {
            new CustomDelay(() -> {
                getNpc().spawn(PRISAOFRENTE);
                getNpc().faceLocation(SPEC);
            }, 2, 3, 0);
            new CustomDelay(() -> getNpc().despawn(), 2, 40, 0);
        }

    };

    private String nick;
    private NPC npc;

    HistoriaV2(String nick) {
        this.nick = nick;
        this.npc = CitizensAPI.getNPCRegistry().createNPC(EntityType.PLAYER, nick);
    }

    public void start() {
    }

    public String getNick() {
        return nick;
    }

    public NPC getNpc() {
        return npc;
    }

    public static void startAll() {
        for (HistoriaV2 historiaV2 : HistoriaV2.values()) {
            historiaV2.start();
        }
    }

    public static Location SPEC = new Location(Bukkit.getWorld("world"), -374.5, 66.0, 620.5);

    public static Location MEIO = new Location(Bukkit.getWorld("world"), -362.5, 66.0, 620.5);
    public static Location PRISAO = new Location(Bukkit.getWorld("world"), -355.5, 66.0, 619.5);
    public static Location PRISAOFRENTE = new Location(Bukkit.getWorld("world"), -359.5, 66.0, 623.5);
    public static Location ILHA = new Location(Bukkit.getWorld("world"), -354.5, 67.0, 606.5);
    public static Location BASE = new Location(Bukkit.getWorld("world"), -358.5, 66.0, 634.5);

}
