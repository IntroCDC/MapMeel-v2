package br.com.introgamer.mapmeel.teatro;
/*
 * Written by IntroCDC, Bruno Coêlho at 31/01/2019 - 10:56
 */

import br.com.introgamer.mapmeel.variables.Variables;
import org.bukkit.scheduler.BukkitRunnable;

import java.util.Timer;
import java.util.TimerTask;

public class CustomDelay {

    private Runnable runnable;
    private Thread thread;
    private Timer timer;

    public CustomDelay(Runnable runnable, long minutes, long seconds, long milliseconds) {
        if (runnable == null) {
            return;
        }
        this.runnable = runnable;
        this.timer = new Timer();
        long totaltime;
        totaltime = seconds * 1000;
        totaltime = totaltime + minutes * 60000;
        totaltime = totaltime + milliseconds * 3;
        this.timer.schedule(new TimerTask() {
            @Override
            public void run() {
                CustomDelay.this.thread = new Thread(() -> new BukkitRunnable() {
                    @Override
                    public void run() {
                        runnable.run();
                    }
                }.runTask(Variables.plugin));
                CustomDelay.this.thread.start();
            }
        }, totaltime);
    }

    public Runnable getRunnable() {
        return this.runnable;
    }

    public Thread getThread() {
        return this.thread;
    }

    public Timer getTimer() {
        return this.timer;
    }

}
