package br.com.introgamer.mapmeel.commands;

import br.com.introgamer.mapmeel.teatro.HistoriaV2;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import br.com.introgamer.mapmeel.variables.Jogadores;
import br.com.introgamer.mapmeel.variables.Strings;
import br.com.introgamer.mapmeel.variables.Variables;

public class CommandHistoria implements CommandExecutor {

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
            Bukkit.broadcastMessage(Strings.prefix + "�aExecutando hist�ria em modo �2�lENSAIO!");
        }

        Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "playsound mapmeel.historia @a -1662 50 639 50000 1");
        HistoriaV2.startAll();

        return false;
    }

}
