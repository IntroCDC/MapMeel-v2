package br.com.introgamer.mapmeel.listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;

import br.com.introgamer.mapmeel.variables.Strings;
import br.com.introgamer.mapmeel.variables.Variables;

public class CommandsBlocker implements Listener {

    String msg = "§cComando bloqueado!";

    @EventHandler
    public void onPlayerCommandPreprocess(PlayerCommandPreprocessEvent e) {
        if (!Variables.Jogadores.contains(e.getPlayer().getName())) {
            if (e.getMessage().contains("tell")) {
                e.getPlayer().sendMessage(Strings.prefix + this.msg);
                e.setCancelled(true);
            }
            if (e.getMessage().contains("msg")) {
                e.getPlayer().sendMessage(Strings.prefix + this.msg);
                e.setCancelled(true);
            }
        }
    }

}
