package br.com.introgamer.mapmeel.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import br.com.introgamer.mapmeel.variables.Jogadores;
import br.com.introgamer.mapmeel.variables.Strings;
import br.com.introgamer.mapmeel.variables.Variables;

public class CommandFirework implements CommandExecutor {

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
            Bukkit.getServer().getConsoleSender().sendMessage(Strings.prefix + Strings.inGame);
            return true;
        }

        Bukkit.getServer().dispatchCommand(
            sender,
            "summon FireworksRocketEntity " + ((Player) sender).getLocation().getX() + " " + ((Player) sender).getLocation().getY() + " " + ((Player) sender)
                    .getLocation()
                    .getZ() + " {LifeTime:10,Motion:[NaN,NaN,NaN],FireworksItem:{id:401,Count:1,tag:{Fireworks:{Explosions:[{Type:1,Flicker:1,Trail:1,Colors:[16712451],FadeColors:[2228479]},{Type:1,Flicker:1,Trail:1,Colors:[7667829],FadeColors:[8913059]},{Type:3,Flicker:1,Trail:1,Colors:[4521728],FadeColors:[16755200]},{Type:1,Flicker:1,Trail:1,Colors:[6488160],FadeColors:[1114367]}]}}}}");
        Bukkit.getServer().dispatchCommand(
            sender,
            "summon FireworksRocketEntity " + ((Player) sender).getLocation().getX() + " " + ((Player) sender).getLocation().getY() + " " + ((Player) sender)
                    .getLocation()
                    .getZ() + " {LifeTime:20,Motion:[NaN,NaN,NaN],FireworksItem:{id:401,Count:1,tag:{Fireworks:{Explosions:[{Type:1,Flicker:1,Trail:1,Colors:[16712451],FadeColors:[2228479]},{Type:1,Flicker:1,Trail:1,Colors:[7667829],FadeColors:[8913059]},{Type:3,Flicker:1,Trail:1,Colors:[4521728],FadeColors:[16755200]},{Type:1,Flicker:1,Trail:1,Colors:[6488160],FadeColors:[1114367]}]}}}}");
        Bukkit.getServer().dispatchCommand(
            sender,
            "summon FireworksRocketEntity " + ((Player) sender).getLocation().getX() + " " + ((Player) sender).getLocation().getY() + " " + ((Player) sender)
                    .getLocation()
                    .getZ() + " {LifeTime:30,Motion:[NaN,NaN,NaN],FireworksItem:{id:401,Count:1,tag:{Fireworks:{Explosions:[{Type:1,Flicker:1,Trail:1,Colors:[16712451],FadeColors:[2228479]},{Type:1,Flicker:1,Trail:1,Colors:[7667829],FadeColors:[8913059]},{Type:3,Flicker:1,Trail:1,Colors:[4521728],FadeColors:[16755200]},{Type:1,Flicker:1,Trail:1,Colors:[6488160],FadeColors:[1114367]}]}}}}");
        Bukkit.getServer().dispatchCommand(
            sender,
            "summon FireworksRocketEntity " + ((Player) sender).getLocation().getX() + " " + ((Player) sender).getLocation().getY() + " " + ((Player) sender)
                    .getLocation()
                    .getZ() + " {LifeTime:40,Motion:[NaN,NaN,NaN],FireworksItem:{id:401,Count:1,tag:{Fireworks:{Explosions:[{Type:1,Flicker:1,Trail:1,Colors:[16712451],FadeColors:[2228479]},{Type:1,Flicker:1,Trail:1,Colors:[7667829],FadeColors:[8913059]},{Type:3,Flicker:1,Trail:1,Colors:[4521728],FadeColors:[16755200]},{Type:1,Flicker:1,Trail:1,Colors:[6488160],FadeColors:[1114367]}]}}}}");
        Bukkit.getServer().dispatchCommand(
            sender,
            "summon FireworksRocketEntity " + ((Player) sender).getLocation().getX() + " " + ((Player) sender).getLocation().getY() + " " + ((Player) sender)
                    .getLocation()
                    .getZ() + " {LifeTime:15,Motion:[NaN,NaN,NaN],FireworksItem:{id:401,Count:1,tag:{Fireworks:{Explosions:[{Type:1,Flicker:1,Trail:1,Colors:[16712451],FadeColors:[2228479]},{Type:1,Flicker:1,Trail:1,Colors:[7667829],FadeColors:[8913059]},{Type:3,Flicker:1,Trail:1,Colors:[4521728],FadeColors:[16755200]},{Type:1,Flicker:1,Trail:1,Colors:[6488160],FadeColors:[1114367]}]}}}}");
        Bukkit.getServer().dispatchCommand(
            sender,
            "summon FireworksRocketEntity " + ((Player) sender).getLocation().getX() + " " + ((Player) sender).getLocation().getY() + " " + ((Player) sender)
                    .getLocation()
                    .getZ() + " {LifeTime:25,Motion:[NaN,NaN,NaN],FireworksItem:{id:401,Count:1,tag:{Fireworks:{Explosions:[{Type:1,Flicker:1,Trail:1,Colors:[16712451],FadeColors:[2228479]},{Type:1,Flicker:1,Trail:1,Colors:[7667829],FadeColors:[8913059]},{Type:3,Flicker:1,Trail:1,Colors:[4521728],FadeColors:[16755200]},{Type:1,Flicker:1,Trail:1,Colors:[6488160],FadeColors:[1114367]}]}}}}");
        Bukkit.getServer().dispatchCommand(
            sender,
            "summon FireworksRocketEntity " + ((Player) sender).getLocation().getX() + " " + ((Player) sender).getLocation().getY() + " " + ((Player) sender)
                    .getLocation()
                    .getZ() + " {LifeTime:35,Motion:[NaN,NaN,NaN],FireworksItem:{id:401,Count:1,tag:{Fireworks:{Explosions:[{Type:1,Flicker:1,Trail:1,Colors:[16712451],FadeColors:[2228479]},{Type:1,Flicker:1,Trail:1,Colors:[7667829],FadeColors:[8913059]},{Type:3,Flicker:1,Trail:1,Colors:[4521728],FadeColors:[16755200]},{Type:1,Flicker:1,Trail:1,Colors:[6488160],FadeColors:[1114367]}]}}}}");
        Bukkit.getServer().dispatchCommand(
            sender,
            "summon FireworksRocketEntity " + ((Player) sender).getLocation().getX() + " " + ((Player) sender).getLocation().getY() + " " + ((Player) sender)
                    .getLocation()
                    .getZ() + " {LifeTime:18,Motion:[NaN,NaN,NaN],FireworksItem:{id:401,Count:1,tag:{Fireworks:{Explosions:[{Type:1,Flicker:1,Trail:1,Colors:[16712451],FadeColors:[2228479]},{Type:1,Flicker:1,Trail:1,Colors:[7667829],FadeColors:[8913059]},{Type:3,Flicker:1,Trail:1,Colors:[4521728],FadeColors:[16755200]},{Type:1,Flicker:1,Trail:1,Colors:[6488160],FadeColors:[1114367]}]}}}}");
        Bukkit.getServer().dispatchCommand(
            sender,
            "summon FireworksRocketEntity " + ((Player) sender).getLocation().getX() + " " + ((Player) sender).getLocation().getY() + " " + ((Player) sender)
                    .getLocation()
                    .getZ() + " {LifeTime:28,Motion:[NaN,NaN,NaN],FireworksItem:{id:401,Count:1,tag:{Fireworks:{Explosions:[{Type:1,Flicker:1,Trail:1,Colors:[16712451],FadeColors:[2228479]},{Type:1,Flicker:1,Trail:1,Colors:[7667829],FadeColors:[8913059]},{Type:3,Flicker:1,Trail:1,Colors:[4521728],FadeColors:[16755200]},{Type:1,Flicker:1,Trail:1,Colors:[6488160],FadeColors:[1114367]}]}}}}");
        Bukkit.getServer().dispatchCommand(
            sender,
            "summon FireworksRocketEntity " + ((Player) sender).getLocation().getX() + " " + ((Player) sender).getLocation().getY() + " " + ((Player) sender)
                    .getLocation()
                    .getZ() + " {LifeTime:22,Motion:[NaN,NaN,NaN],FireworksItem:{id:401,Count:1,tag:{Fireworks:{Explosions:[{Type:1,Flicker:1,Trail:1,Colors:[16712451],FadeColors:[2228479]},{Type:1,Flicker:1,Trail:1,Colors:[7667829],FadeColors:[8913059]},{Type:3,Flicker:1,Trail:1,Colors:[4521728],FadeColors:[16755200]},{Type:1,Flicker:1,Trail:1,Colors:[6488160],FadeColors:[1114367]}]}}}}");
        Bukkit.getServer().dispatchCommand(
            sender,
            "summon FireworksRocketEntity " + ((Player) sender).getLocation().getX() + " " + ((Player) sender).getLocation().getY() + " " + ((Player) sender)
                    .getLocation()
                    .getZ() + " {LifeTime:31,Motion:[NaN,NaN,NaN],FireworksItem:{id:401,Count:1,tag:{Fireworks:{Explosions:[{Type:1,Flicker:1,Trail:1,Colors:[16712451],FadeColors:[2228479]},{Type:1,Flicker:1,Trail:1,Colors:[7667829],FadeColors:[8913059]},{Type:3,Flicker:1,Trail:1,Colors:[4521728],FadeColors:[16755200]},{Type:1,Flicker:1,Trail:1,Colors:[6488160],FadeColors:[1114367]}]}}}}");
        Bukkit.getServer().dispatchCommand(
            sender,
            "summon FireworksRocketEntity " + ((Player) sender).getLocation().getX() + " " + ((Player) sender).getLocation().getY() + " " + ((Player) sender)
                    .getLocation()
                    .getZ() + " {LifeTime:27,Motion:[NaN,NaN,NaN],FireworksItem:{id:401,Count:1,tag:{Fireworks:{Explosions:[{Type:1,Flicker:1,Trail:1,Colors:[16712451],FadeColors:[2228479]},{Type:1,Flicker:1,Trail:1,Colors:[7667829],FadeColors:[8913059]},{Type:3,Flicker:1,Trail:1,Colors:[4521728],FadeColors:[16755200]},{Type:1,Flicker:1,Trail:1,Colors:[6488160],FadeColors:[1114367]}]}}}}");
        Bukkit.getServer().dispatchCommand(
            sender,
            "summon FireworksRocketEntity " + ((Player) sender).getLocation().getX() + " " + ((Player) sender).getLocation().getY() + " " + ((Player) sender)
                    .getLocation()
                    .getZ() + " {LifeTime:37,Motion:[NaN,NaN,NaN],FireworksItem:{id:401,Count:1,tag:{Fireworks:{Explosions:[{Type:1,Flicker:1,Trail:1,Colors:[16712451],FadeColors:[2228479]},{Type:1,Flicker:1,Trail:1,Colors:[7667829],FadeColors:[8913059]},{Type:3,Flicker:1,Trail:1,Colors:[4521728],FadeColors:[16755200]},{Type:1,Flicker:1,Trail:1,Colors:[6488160],FadeColors:[1114367]}]}}}}");

        return false;
    }

}
