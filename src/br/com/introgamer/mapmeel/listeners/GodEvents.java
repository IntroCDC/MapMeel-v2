package br.com.introgamer.mapmeel.listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByBlockEvent;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.EntityDamageEvent;

import br.com.introgamer.mapmeel.variables.Variables;

public class GodEvents implements Listener {

    @EventHandler
    public void onEntityDamage(EntityDamageEvent e) {
        if (Variables.inGod.contains(e.getEntity().getName())) {
            e.setCancelled(true);
        }
    }

    @EventHandler
    public void onEntityDamageByBlock(EntityDamageByBlockEvent e) {
        if (Variables.inGod.contains(e.getEntity().getName())) {
            e.setCancelled(true);
        }
    }

    @EventHandler
    public void onEntityDamageByEntity(EntityDamageByEntityEvent e) {
        if (Variables.inGod.contains(e.getEntity().getName())) {
            e.setCancelled(true);
        }
    }

}
