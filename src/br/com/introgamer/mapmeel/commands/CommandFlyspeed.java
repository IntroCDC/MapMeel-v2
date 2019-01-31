package br.com.introgamer.mapmeel.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import br.com.introgamer.mapmeel.variables.Jogadores;
import br.com.introgamer.mapmeel.variables.Strings;
import br.com.introgamer.mapmeel.variables.Variables;

public class CommandFlyspeed implements CommandExecutor {

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
        if (!(sender instanceof Player)) {
            sender.sendMessage(Strings.prefix + Strings.inGame);
            return true;
        }

        if (args.length == 0) {
            sender.sendMessage(Strings.prefix + "§bUse: /flyspeed [velocidade/reset]");
            sender.sendMessage(Strings.prefix + "§6Velocidade Padrão do Minecraft: 0.1");
            return true;
        }

        if (args[0].equalsIgnoreCase("reset")) {
            String normal = "0.1";
            float numero = (float) Double.parseDouble(normal);
            ((Player) sender).setFlySpeed(numero);

            sender.sendMessage(Strings.prefix + "§bVelocidade de Voo resetada para: " + numero);
            return true;
        }

        try {
            float numero = (float) Double.parseDouble(args[0]);

            if (numero > 1.0) {
                sender.sendMessage(Strings.prefix + "§cVelocidade Máxima: 1.0");
                return true;
            }
            if (numero < 0.0) {
                sender.sendMessage(Strings.prefix + "§cVelocidade Minima: 0.0");
                return true;
            }
            ((Player) sender).setFlySpeed(numero);

            sender.sendMessage(Strings.prefix + "§bVelocidade de Voo alterada para: " + numero);
            return true;
        } catch (Exception e) {
            sender.sendMessage(Strings.prefix + "§cUse apenas números e pontos!");
            return true;
        }

    }

}
