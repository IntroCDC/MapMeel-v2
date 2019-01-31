package br.com.introgamer.mapmeel.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.scheduler.BukkitRunnable;

import br.com.introgamer.mapmeel.variables.Jogadores;
import br.com.introgamer.mapmeel.variables.Strings;
import br.com.introgamer.mapmeel.variables.Variables;

public class CommandSfirework implements CommandExecutor {

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

        if (args.length != 3) {
            sender.sendMessage(Strings.prefix + "§aDigite o comando inteiro!");
            sender.sendMessage(Strings.prefix + "§bUse: /sfirework [X] [Y] [Z]");
            return true;
        }

        sender.sendMessage(Strings.prefix + "§aFoguetes e Blocos lançados com Sucesso!");

        Bukkit.getServer().dispatchCommand(sender, "summon FireworksRocketEntity " + args[0] + " " + args[1] + " " + args[2] + " {LifeTime:30,Motion:[0.012,0,0],FireworksItem:{id:401,Count:1,tag:{Fireworks:{Explosions:[{Type:0,Flicker:1,Trail:1,Colors:[15662853],FadeColors:[4325128]},{Type:1,Flicker:1,Trail:1,Colors:[9437439],FadeColors:[16711714]},{Type:3,Flicker:1,Trail:1,Colors:[1114367],FadeColors:[16737981]},{Type:2,Flicker:1,Trail:1,Colors:[5087487],FadeColors:[16748045]}]}}}}");
        Bukkit.getServer().dispatchCommand(sender, "summon FireworksRocketEntity " + args[0] + " " + args[1] + " " + args[2] + " {LifeTime:30,Motion:[0.017,0,0.01],FireworksItem:{id:401,Count:1,tag:{Fireworks:{Explosions:[{Type:0,Flicker:1,Trail:1,Colors:[15662853],FadeColors:[4325128]},{Type:1,Flicker:1,Trail:1,Colors:[9437439],FadeColors:[16711714]},{Type:3,Flicker:1,Trail:1,Colors:[1114367],FadeColors:[16737981]},{Type:2,Flicker:1,Trail:1,Colors:[5087487],FadeColors:[16748045]}]}}}}");
        Bukkit.getServer().dispatchCommand(sender, "summon FireworksRocketEntity " + args[0] + " " + args[1] + " " + args[2] + " {LifeTime:30,Motion:[-0.013,0,0],FireworksItem:{id:401,Count:1,tag:{Fireworks:{Explosions:[{Type:0,Flicker:1,Trail:1,Colors:[15662853],FadeColors:[4325128]},{Type:1,Flicker:1,Trail:1,Colors:[9437439],FadeColors:[16711714]},{Type:3,Flicker:1,Trail:1,Colors:[1114367],FadeColors:[16737981]},{Type:2,Flicker:1,Trail:1,Colors:[5087487],FadeColors:[16748045]}]}}}}");
        Bukkit.getServer().dispatchCommand(sender, "summon FireworksRocketEntity " + args[0] + " " + args[1] + " " + args[2] + " {LifeTime:30,Motion:[0,0,-0.01],FireworksItem:{id:401,Count:1,tag:{Fireworks:{Explosions:[{Type:0,Flicker:1,Trail:1,Colors:[15662853],FadeColors:[4325128]},{Type:1,Flicker:1,Trail:1,Colors:[9437439],FadeColors:[16711714]},{Type:3,Flicker:1,Trail:1,Colors:[1114367],FadeColors:[16737981]},{Type:2,Flicker:1,Trail:1,Colors:[5087487],FadeColors:[16748045]}]}}}}");
        Bukkit.getServer().dispatchCommand(sender, "summon FireworksRocketEntity " + args[0] + " " + args[1] + " " + args[2] + " {LifeTime:30,Motion:[0,0,0],FireworksItem:{id:401,Count:1,tag:{Fireworks:{Explosions:[{Type:0,Flicker:1,Trail:1,Colors:[15662853],FadeColors:[4325128]},{Type:1,Flicker:1,Trail:1,Colors:[9437439],FadeColors:[16711714]},{Type:3,Flicker:1,Trail:1,Colors:[1114367],FadeColors:[16737981]},{Type:2,Flicker:1,Trail:1,Colors:[5087487],FadeColors:[16748045]}]}}}}");
        Bukkit.getServer().dispatchCommand(sender, "summon FireworksRocketEntity " + args[0] + " " + args[1] + " " + args[2] + " {LifeTime:30,Motion:[0,0,0.01],FireworksItem:{id:401,Count:1,tag:{Fireworks:{Explosions:[{Type:0,Flicker:1,Trail:1,Colors:[15662853],FadeColors:[4325128]},{Type:1,Flicker:1,Trail:1,Colors:[9437439],FadeColors:[16711714]},{Type:3,Flicker:1,Trail:1,Colors:[1114367],FadeColors:[16737981]},{Type:2,Flicker:1,Trail:1,Colors:[5087487],FadeColors:[16748045]}]}}}}");
        Bukkit.getServer().dispatchCommand(sender, "summon FireworksRocketEntity " + args[0] + " " + args[1] + " " + args[2] + " {LifeTime:30,Motion:[0.01,0,0],FireworksItem:{id:401,Count:1,tag:{Fireworks:{Explosions:[{Type:0,Flicker:1,Trail:1,Colors:[15662853],FadeColors:[4325128]},{Type:1,Flicker:1,Trail:1,Colors:[9437439],FadeColors:[16711714]},{Type:3,Flicker:1,Trail:1,Colors:[1114367],FadeColors:[16737981]},{Type:2,Flicker:1,Trail:1,Colors:[5087487],FadeColors:[16748045]}]}}}}");
        Bukkit.getServer().dispatchCommand(sender, "summon FireworksRocketEntity " + args[0] + " " + args[1] + " " + args[2] + " {LifeTime:30,Motion:[0,0,0.018],FireworksItem:{id:401,Count:1,tag:{Fireworks:{Explosions:[{Type:0,Flicker:1,Trail:1,Colors:[15662853],FadeColors:[4325128]},{Type:1,Flicker:1,Trail:1,Colors:[9437439],FadeColors:[16711714]},{Type:3,Flicker:1,Trail:1,Colors:[1114367],FadeColors:[16737981]},{Type:2,Flicker:1,Trail:1,Colors:[5087487],FadeColors:[16748045]}]}}}}");
        Bukkit.getServer().dispatchCommand(sender, "summon FireworksRocketEntity " + args[0] + " " + args[1] + " " + args[2] + " {LifeTime:30,Motion:[-0.011,0,0],FireworksItem:{id:401,Count:1,tag:{Fireworks:{Explosions:[{Type:0,Flicker:1,Trail:1,Colors:[15662853],FadeColors:[4325128]},{Type:1,Flicker:1,Trail:1,Colors:[9437439],FadeColors:[16711714]},{Type:3,Flicker:1,Trail:1,Colors:[1114367],FadeColors:[16737981]},{Type:2,Flicker:1,Trail:1,Colors:[5087487],FadeColors:[16748045]}]}}}}");
        Bukkit.getServer().dispatchCommand(sender, "summon FireworksRocketEntity " + args[0] + " " + args[1] + " " + args[2] + " {LifeTime:30,Motion:[0,0,-0.01],FireworksItem:{id:401,Count:1,tag:{Fireworks:{Explosions:[{Type:0,Flicker:1,Trail:1,Colors:[15662853],FadeColors:[4325128]},{Type:1,Flicker:1,Trail:1,Colors:[9437439],FadeColors:[16711714]},{Type:3,Flicker:1,Trail:1,Colors:[1114367],FadeColors:[16737981]},{Type:2,Flicker:1,Trail:1,Colors:[5087487],FadeColors:[16748045]}]}}}}");
        Bukkit.getServer().dispatchCommand(sender, "summon FireworksRocketEntity " + args[0] + " " + args[1] + " " + args[2] + " {LifeTime:30,Motion:[0,0,0],FireworksItem:{id:401,Count:1,tag:{Fireworks:{Explosions:[{Type:0,Flicker:1,Trail:1,Colors:[15662853],FadeColors:[4325128]},{Type:1,Flicker:1,Trail:1,Colors:[9437439],FadeColors:[16711714]},{Type:3,Flicker:1,Trail:1,Colors:[1114367],FadeColors:[16737981]},{Type:2,Flicker:1,Trail:1,Colors:[5087487],FadeColors:[16748045]}]}}}}");
        Bukkit.getServer().dispatchCommand(sender, "summon FireworksRocketEntity " + args[0] + " " + args[1] + " " + args[2] + " {LifeTime:30,Motion:[0.14,0,0.01],FireworksItem:{id:401,Count:1,tag:{Fireworks:{Explosions:[{Type:0,Flicker:1,Trail:1,Colors:[15662853],FadeColors:[4325128]},{Type:1,Flicker:1,Trail:1,Colors:[9437439],FadeColors:[16711714]},{Type:3,Flicker:1,Trail:1,Colors:[1114367],FadeColors:[16737981]},{Type:2,Flicker:1,Trail:1,Colors:[5087487],FadeColors:[16748045]}]}}}}");
        Bukkit.getServer().dispatchCommand(sender, "summon FireworksRocketEntity " + args[0] + " " + args[1] + " " + args[2] + " {LifeTime:30,Motion:[0.013,0,0],FireworksItem:{id:401,Count:1,tag:{Fireworks:{Explosions:[{Type:0,Flicker:1,Trail:1,Colors:[15662853],FadeColors:[4325128]},{Type:1,Flicker:1,Trail:1,Colors:[9437439],FadeColors:[16711714]},{Type:3,Flicker:1,Trail:1,Colors:[1114367],FadeColors:[16737981]},{Type:2,Flicker:1,Trail:1,Colors:[5087487],FadeColors:[16748045]}]}}}}");
        Bukkit.getServer().dispatchCommand(sender, "summon FireworksRocketEntity " + args[0] + " " + args[1] + " " + args[2] + " {LifeTime:30,Motion:[0,0,0.016],FireworksItem:{id:401,Count:1,tag:{Fireworks:{Explosions:[{Type:0,Flicker:1,Trail:1,Colors:[15662853],FadeColors:[4325128]},{Type:1,Flicker:1,Trail:1,Colors:[9437439],FadeColors:[16711714]},{Type:3,Flicker:1,Trail:1,Colors:[1114367],FadeColors:[16737981]},{Type:2,Flicker:1,Trail:1,Colors:[5087487],FadeColors:[16748045]}]}}}}");
        Bukkit.getServer().dispatchCommand(sender, "summon FireworksRocketEntity " + args[0] + " " + args[1] + " " + args[2] + " {LifeTime:30,Motion:[0.012,0,0],FireworksItem:{id:401,Count:1,tag:{Fireworks:{Explosions:[{Type:0,Flicker:1,Trail:1,Colors:[15662853],FadeColors:[4325128]},{Type:1,Flicker:1,Trail:1,Colors:[9437439],FadeColors:[16711714]},{Type:3,Flicker:1,Trail:1,Colors:[1114367],FadeColors:[16737981]},{Type:2,Flicker:1,Trail:1,Colors:[5087487],FadeColors:[16748045]}]}}}}");
        Bukkit.getServer().dispatchCommand(sender, "summon FireworksRocketEntity " + args[0] + " " + args[1] + " " + args[2] + " {LifeTime:30,Motion:[0.017,0,0.01],FireworksItem:{id:401,Count:1,tag:{Fireworks:{Explosions:[{Type:0,Flicker:1,Trail:1,Colors:[15662853],FadeColors:[4325128]},{Type:1,Flicker:1,Trail:1,Colors:[9437439],FadeColors:[16711714]},{Type:3,Flicker:1,Trail:1,Colors:[1114367],FadeColors:[16737981]},{Type:2,Flicker:1,Trail:1,Colors:[5087487],FadeColors:[16748045]}]}}}}");
        Bukkit.getServer().dispatchCommand(sender, "summon FireworksRocketEntity " + args[0] + " " + args[1] + " " + args[2] + " {LifeTime:30,Motion:[-0.013,0,0],FireworksItem:{id:401,Count:1,tag:{Fireworks:{Explosions:[{Type:0,Flicker:1,Trail:1,Colors:[15662853],FadeColors:[4325128]},{Type:1,Flicker:1,Trail:1,Colors:[9437439],FadeColors:[16711714]},{Type:3,Flicker:1,Trail:1,Colors:[1114367],FadeColors:[16737981]},{Type:2,Flicker:1,Trail:1,Colors:[5087487],FadeColors:[16748045]}]}}}}");
        Bukkit.getServer().dispatchCommand(sender, "summon FireworksRocketEntity " + args[0] + " " + args[1] + " " + args[2] + " {LifeTime:30,Motion:[0,0,-0.01],FireworksItem:{id:401,Count:1,tag:{Fireworks:{Explosions:[{Type:0,Flicker:1,Trail:1,Colors:[15662853],FadeColors:[4325128]},{Type:1,Flicker:1,Trail:1,Colors:[9437439],FadeColors:[16711714]},{Type:3,Flicker:1,Trail:1,Colors:[1114367],FadeColors:[16737981]},{Type:2,Flicker:1,Trail:1,Colors:[5087487],FadeColors:[16748045]}]}}}}");
        Bukkit.getServer().dispatchCommand(sender, "summon FireworksRocketEntity " + args[0] + " " + args[1] + " " + args[2] + " {LifeTime:30,Motion:[0,0,0],FireworksItem:{id:401,Count:1,tag:{Fireworks:{Explosions:[{Type:0,Flicker:1,Trail:1,Colors:[15662853],FadeColors:[4325128]},{Type:1,Flicker:1,Trail:1,Colors:[9437439],FadeColors:[16711714]},{Type:3,Flicker:1,Trail:1,Colors:[1114367],FadeColors:[16737981]},{Type:2,Flicker:1,Trail:1,Colors:[5087487],FadeColors:[16748045]}]}}}}");
        Bukkit.getServer().dispatchCommand(sender, "summon FireworksRocketEntity " + args[0] + " " + args[1] + " " + args[2] + " {LifeTime:30,Motion:[0,0,0.01],FireworksItem:{id:401,Count:1,tag:{Fireworks:{Explosions:[{Type:0,Flicker:1,Trail:1,Colors:[15662853],FadeColors:[4325128]},{Type:1,Flicker:1,Trail:1,Colors:[9437439],FadeColors:[16711714]},{Type:3,Flicker:1,Trail:1,Colors:[1114367],FadeColors:[16737981]},{Type:2,Flicker:1,Trail:1,Colors:[5087487],FadeColors:[16748045]}]}}}}");
        Bukkit.getServer().dispatchCommand(sender, "summon FireworksRocketEntity " + args[0] + " " + args[1] + " " + args[2] + " {LifeTime:30,Motion:[0.01,0,0],FireworksItem:{id:401,Count:1,tag:{Fireworks:{Explosions:[{Type:0,Flicker:1,Trail:1,Colors:[15662853],FadeColors:[4325128]},{Type:1,Flicker:1,Trail:1,Colors:[9437439],FadeColors:[16711714]},{Type:3,Flicker:1,Trail:1,Colors:[1114367],FadeColors:[16737981]},{Type:2,Flicker:1,Trail:1,Colors:[5087487],FadeColors:[16748045]}]}}}}");
        Bukkit.getServer().dispatchCommand(sender, "summon FireworksRocketEntity " + args[0] + " " + args[1] + " " + args[2] + " {LifeTime:30,Motion:[0,0,0.018],FireworksItem:{id:401,Count:1,tag:{Fireworks:{Explosions:[{Type:0,Flicker:1,Trail:1,Colors:[15662853],FadeColors:[4325128]},{Type:1,Flicker:1,Trail:1,Colors:[9437439],FadeColors:[16711714]},{Type:3,Flicker:1,Trail:1,Colors:[1114367],FadeColors:[16737981]},{Type:2,Flicker:1,Trail:1,Colors:[5087487],FadeColors:[16748045]}]}}}}");
        Bukkit.getServer().dispatchCommand(sender, "summon FireworksRocketEntity " + args[0] + " " + args[1] + " " + args[2] + " {LifeTime:30,Motion:[-0.011,0,0],FireworksItem:{id:401,Count:1,tag:{Fireworks:{Explosions:[{Type:0,Flicker:1,Trail:1,Colors:[15662853],FadeColors:[4325128]},{Type:1,Flicker:1,Trail:1,Colors:[9437439],FadeColors:[16711714]},{Type:3,Flicker:1,Trail:1,Colors:[1114367],FadeColors:[16737981]},{Type:2,Flicker:1,Trail:1,Colors:[5087487],FadeColors:[16748045]}]}}}}");
        Bukkit.getServer().dispatchCommand(sender, "summon FireworksRocketEntity " + args[0] + " " + args[1] + " " + args[2] + " {LifeTime:30,Motion:[0,0,-0.01],FireworksItem:{id:401,Count:1,tag:{Fireworks:{Explosions:[{Type:0,Flicker:1,Trail:1,Colors:[15662853],FadeColors:[4325128]},{Type:1,Flicker:1,Trail:1,Colors:[9437439],FadeColors:[16711714]},{Type:3,Flicker:1,Trail:1,Colors:[1114367],FadeColors:[16737981]},{Type:2,Flicker:1,Trail:1,Colors:[5087487],FadeColors:[16748045]}]}}}}");
        Bukkit.getServer().dispatchCommand(sender, "summon FireworksRocketEntity " + args[0] + " " + args[1] + " " + args[2] + " {LifeTime:30,Motion:[0,0,0],FireworksItem:{id:401,Count:1,tag:{Fireworks:{Explosions:[{Type:0,Flicker:1,Trail:1,Colors:[15662853],FadeColors:[4325128]},{Type:1,Flicker:1,Trail:1,Colors:[9437439],FadeColors:[16711714]},{Type:3,Flicker:1,Trail:1,Colors:[1114367],FadeColors:[16737981]},{Type:2,Flicker:1,Trail:1,Colors:[5087487],FadeColors:[16748045]}]}}}}");
        Bukkit.getServer().dispatchCommand(sender, "summon FireworksRocketEntity " + args[0] + " " + args[1] + " " + args[2] + " {LifeTime:30,Motion:[0.14,0,0.01],FireworksItem:{id:401,Count:1,tag:{Fireworks:{Explosions:[{Type:0,Flicker:1,Trail:1,Colors:[15662853],FadeColors:[4325128]},{Type:1,Flicker:1,Trail:1,Colors:[9437439],FadeColors:[16711714]},{Type:3,Flicker:1,Trail:1,Colors:[1114367],FadeColors:[16737981]},{Type:2,Flicker:1,Trail:1,Colors:[5087487],FadeColors:[16748045]}]}}}}");
        Bukkit.getServer().dispatchCommand(sender, "summon FireworksRocketEntity " + args[0] + " " + args[1] + " " + args[2] + " {LifeTime:30,Motion:[0.013,0,0],FireworksItem:{id:401,Count:1,tag:{Fireworks:{Explosions:[{Type:0,Flicker:1,Trail:1,Colors:[15662853],FadeColors:[4325128]},{Type:1,Flicker:1,Trail:1,Colors:[9437439],FadeColors:[16711714]},{Type:3,Flicker:1,Trail:1,Colors:[1114367],FadeColors:[16737981]},{Type:2,Flicker:1,Trail:1,Colors:[5087487],FadeColors:[16748045]}]}}}}");
        Bukkit.getServer().dispatchCommand(sender, "summon FireworksRocketEntity " + args[0] + " " + args[1] + " " + args[2] + " {LifeTime:30,Motion:[0,0,0.016],FireworksItem:{id:401,Count:1,tag:{Fireworks:{Explosions:[{Type:0,Flicker:1,Trail:1,Colors:[15662853],FadeColors:[4325128]},{Type:1,Flicker:1,Trail:1,Colors:[9437439],FadeColors:[16711714]},{Type:3,Flicker:1,Trail:1,Colors:[1114367],FadeColors:[16737981]},{Type:2,Flicker:1,Trail:1,Colors:[5087487],FadeColors:[16748045]}]}}}}");

        new BukkitRunnable() {
            @Override
            public void run() {
                Bukkit.getServer().dispatchCommand(sender, "summon FallingSand " + args[0] + " " + args[1] + " " + args[2] + " {Block:stone,Time:1,Motion:[0.08,1.5,0.0]}");
                Bukkit.getServer().dispatchCommand(sender, "summon FallingSand " + args[0] + " " + args[1] + " " + args[2] + " {Block:cobblestone,Time:1,Motion:[0.0,1.5,0.1]}");
                Bukkit.getServer().dispatchCommand(sender, "summon FallingSand " + args[0] + " " + args[1] + " " + args[2] + " {Block:stone,Time:1,Motion:[-0.1,1.8,0.1]}");
                Bukkit.getServer().dispatchCommand(sender, "summon FallingSand " + args[0] + " " + args[1] + " " + args[2] + " {Block:cobblestone,Time:1,Motion:[0.0,1.5,-0.1]}");
                Bukkit.getServer().dispatchCommand(sender, "summon FallingSand " + args[0] + " " + args[1] + " " + args[2] + " {Block:stone,Time:1,Motion:[0.0,1.5,0.04]}");
                Bukkit.getServer().dispatchCommand(sender, "summon FallingSand " + args[0] + " " + args[1] + " " + args[2] + " {Block:cobblestone,Time:1,Motion:[0.05,1.5,0.0]}");
                Bukkit.getServer().dispatchCommand(sender, "summon FallingSand " + args[0] + " " + args[1] + " " + args[2] + " {Block:stone,Time:1,Motion:[0.1,1.5,-0.1]}");
                Bukkit.getServer().dispatchCommand(sender, "summon FallingSand " + args[0] + " " + args[1] + " " + args[2] + " {Block:cobblestone,Time:1,Motion:[0.0,1.5,0.1]}");
                Bukkit.getServer().dispatchCommand(sender, "summon FallingSand " + args[0] + " " + args[1] + " " + args[2] + " {Block:stone,Time:1,Motion:[0.08,1.5,0.0]}");
                Bukkit.getServer().dispatchCommand(sender, "summon FallingSand " + args[0] + " " + args[1] + " " + args[2] + " {Block:cobblestone,Time:1,Motion:[0.0,1.5,0.1]}");
                Bukkit.getServer().dispatchCommand(sender, "summon FallingSand " + args[0] + " " + args[1] + " " + args[2] + " {Block:stone,Time:1,Motion:[-0.1,1.8,0.1]}");
                Bukkit.getServer().dispatchCommand(sender, "summon FallingSand " + args[0] + " " + args[1] + " " + args[2] + " {Block:cobblestone,Time:1,Motion:[0.0,1.5,-0.1]}");
                Bukkit.getServer().dispatchCommand(sender, "summon FallingSand " + args[0] + " " + args[1] + " " + args[2] + " {Block:stone,Time:1,Motion:[0.0,1.5,0.04]}");
                Bukkit.getServer().dispatchCommand(sender, "summon FallingSand " + args[0] + " " + args[1] + " " + args[2] + " {Block:cobblestone,Time:1,Motion:[0.05,1.5,0.0]}");
                Bukkit.getServer().dispatchCommand(sender, "summon FallingSand " + args[0] + " " + args[1] + " " + args[2] + " {Block:stone,Time:1,Motion:[0.1,1.5,-0.1]}");
                Bukkit.getServer().dispatchCommand(sender, "summon FallingSand " + args[0] + " " + args[1] + " " + args[2] + " {Block:cobblestone,Time:1,Motion:[0.0,1.5,0.1]}");
                Bukkit.getServer().dispatchCommand(sender, "summon FallingSand " + args[0] + " " + args[1] + " " + args[2] + " {Block:stone,Time:1,Motion:[0.08,1.5,0.0]}");
                Bukkit.getServer().dispatchCommand(sender, "summon FallingSand " + args[0] + " " + args[1] + " " + args[2] + " {Block:cobblestone,Time:1,Motion:[0.0,1.5,0.1]}");
                Bukkit.getServer().dispatchCommand(sender, "summon FallingSand " + args[0] + " " + args[1] + " " + args[2] + " {Block:stone,Time:1,Motion:[-0.1,1.8,0.1]}");
                Bukkit.getServer().dispatchCommand(sender, "summon FallingSand " + args[0] + " " + args[1] + " " + args[2] + " {Block:cobblestone,Time:1,Motion:[0.0,1.5,-0.1]}");
                Bukkit.getServer().dispatchCommand(sender, "summon FallingSand " + args[0] + " " + args[1] + " " + args[2] + " {Block:stone,Time:1,Motion:[0.0,1.5,0.04]}");
                Bukkit.getServer().dispatchCommand(sender, "summon FallingSand " + args[0] + " " + args[1] + " " + args[2] + " {Block:cobblestone,Time:1,Motion:[0.05,1.5,0.0]}");
                Bukkit.getServer().dispatchCommand(sender, "summon FallingSand " + args[0] + " " + args[1] + " " + args[2] + " {Block:stone,Time:1,Motion:[0.1,1.5,-0.1]}");
                Bukkit.getServer().dispatchCommand(sender, "summon FallingSand " + args[0] + " " + args[1] + " " + args[2] + " {Block:cobblestone,Time:1,Motion:[0.0,1.5,0.1]}");
            }
        }.runTaskLater(Variables.plugin, 30L);

        return false;
    }

}
