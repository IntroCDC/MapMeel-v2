package br.com.introgamer.mapmeel.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.scheduler.BukkitRunnable;

import br.com.introgamer.mapmeel.Methods;
import br.com.introgamer.mapmeel.variables.Jogadores;
import br.com.introgamer.mapmeel.variables.Strings;
import br.com.introgamer.mapmeel.variables.Variables;

public class CommandAudio implements CommandExecutor {

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

        if (args.length == 0) {
            sender.sendMessage(Strings.prefix + "§bUse: /" + command.getName() + " [audio] [delayParaInicio<20 = 1 Segundo>]");
            StringBuilder s = new StringBuilder();
            for (int i = 0; i < Variables.Musics.size(); i++) {
                if (i != 0) {
                    s.append("§6, §e").append(Variables.Musics.get(i));
                } else {
                    s.append(Variables.Musics.get(i));
                }
            }
            sender.sendMessage(Strings.prefix + "§6Audios: §e" + s.toString());
            return true;
        } else if (args.length == 1) {
            if (args[0].equalsIgnoreCase("stop") || args[0].equalsIgnoreCase("parar")) {
                Methods.PararAudio();
                Variables.Audio = 0;
                Strings.Jogador = sender.getName();
                sender.sendMessage(Strings.prefix + "§6Parando Áudio...");
                return true;
            }
            if (args[0].equalsIgnoreCase("fnaf")) {
                sender.sendMessage(Strings.prefix + "§bUse: /" + command.getName() + " [audio]");
                sender.sendMessage(Strings.prefix + "§6Áudios FNAF: §efnafjump(1 ao 4)<4f, 4n, gf>§6, §efnafnfr<1 ao 5>§6, §efnafr<1 ao 5>");
                return true;
            }
            Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "playsound mapmeel." + args[0] + " @a -1662 50 639 50000 1");
            sender.sendMessage(Strings.prefix + "§6Tocando Áudio: '" + args[0] + "'! §7§o(mapmeel." + args[0] + ")");
            return true;
        } else {
            try {
                int tempo = (int) Double.parseDouble(args[1]);
                if (args[0].equalsIgnoreCase("stop") || args[0].equalsIgnoreCase("parar")) {
                    sender.sendMessage(Strings.prefix + "§6Parada do Áudio com delay setada com Sucesso! Delay: §e" + tempo);
                } else {
                    sender.sendMessage(Strings.prefix + "§6O Áudio '" + args[0] + "' §7§o(mapmeel." + args[0] + ")§6 executado com Delay com Sucesso! Delay: §e" + tempo);
                }
                new BukkitRunnable() {
                    @Override
                    public void run() {
                        if (args[0].equalsIgnoreCase("stop") || args[0].equalsIgnoreCase("parar")) {
                            Methods.PararAudio();
                            Variables.Audio = 0;
                            Strings.Jogador = sender.getName();
                            sender.sendMessage(Strings.prefix + "§6Parando Áudio...");
                            return;
                        }
                        if (args[0].equalsIgnoreCase("fnaf")) {
                            sender.sendMessage(Strings.prefix + "§bUse: /" + command.getName() + " [audio]");
                            sender.sendMessage(Strings.prefix + "§6Áudios FNAF: §efnafjump(1 ao 4)<4f, 4n, gf>§6, §efnafnfr<1 ao 5>§6, §efnafr<1 ao 5>");
                            return;
                        }
                        Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "playsound mapmeel." + args[0] + " @a -1662 50 639 50000 1");
                        sender.sendMessage(Strings.prefix + "§6Tocando Áudio: '" + args[0] + "'! §7§o(mapmeel." + args[0] + ")");

                    }
                }.runTaskLater(Variables.plugin, tempo);
            } catch (Exception erro) {
                sender.sendMessage(Strings.prefix + "§cUse como delay apenas Números e Pontos!");
                return true;
            }
        }

        return false;
    }

}
