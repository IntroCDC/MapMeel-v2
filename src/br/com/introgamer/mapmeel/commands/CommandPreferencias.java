package br.com.introgamer.mapmeel.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import br.com.introgamer.mapmeel.variables.Jogadores;
import br.com.introgamer.mapmeel.variables.Strings;
import br.com.introgamer.mapmeel.variables.Variables;

public class CommandPreferencias implements CommandExecutor {

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

        if (!Variables.Jogadores.contains(sender.getName())) {
            sender.sendMessage(Strings.prefix + "§cVocê não está registrado no plugin!");
            return true;
        }

        if (args.length == 0) {
            sender.sendMessage(Strings.prefix + "§bUse: /preferencias [setcolor] [cor]");
            return true;
        }
        if (args.length == 1) {
            if (args[0].equalsIgnoreCase("setcolor")) {
                sender.sendMessage(Strings.prefix + "§bUse: /preferencias [setcolor] [cor]");
            }
            return true;
        } else {
            if (sender.getName().equalsIgnoreCase(Jogadores.Intro)) {
                if (args[1].equalsIgnoreCase("1")) {
                    Jogadores.CustonNameIntro = "§1§l";
                    Variables.plugin.getConfig().set("Jogadores.Intro.Cor", Jogadores.CustonNameIntro.replace("§", "&"));
                    Variables.plugin.saveConfig();
                    sender.sendMessage(Strings.prefix + "§2Cor alterada com Sucesso! §1COR");
                } else if (args[1].equalsIgnoreCase("2")) {
                    Jogadores.CustonNameIntro = "§2§l";
                    Variables.plugin.getConfig().set("Jogadores.Intro.Cor", Jogadores.CustonNameIntro.replace("§", "&"));
                    Variables.plugin.saveConfig();
                    sender.sendMessage(Strings.prefix + "§2Cor alterada com Sucesso! §1COR");
                } else if (args[1].equalsIgnoreCase("3")) {
                    Jogadores.CustonNameIntro = "§3§l";
                    Variables.plugin.getConfig().set("Jogadores.Intro.Cor", Jogadores.CustonNameIntro.replace("§", "&"));
                    Variables.plugin.saveConfig();
                    sender.sendMessage(Strings.prefix + "§2Cor alterada com Sucesso! §3COR");
                } else if (args[1].equalsIgnoreCase("4")) {
                    Jogadores.CustonNameIntro = "§4§l";
                    Variables.plugin.getConfig().set("Jogadores.Intro.Cor", Jogadores.CustonNameIntro.replace("§", "&"));
                    Variables.plugin.saveConfig();
                    sender.sendMessage(Strings.prefix + "§2Cor alterada com Sucesso! §4COR");
                } else if (args[1].equalsIgnoreCase("5")) {
                    Jogadores.CustonNameIntro = "§5§l";
                    Variables.plugin.getConfig().set("Jogadores.Intro.Cor", Jogadores.CustonNameIntro.replace("§", "&"));
                    Variables.plugin.saveConfig();
                    sender.sendMessage(Strings.prefix + "§2Cor alterada com Sucesso! §5COR");
                } else if (args[1].equalsIgnoreCase("6")) {
                    Jogadores.CustonNameIntro = "§6§l";
                    Variables.plugin.getConfig().set("Jogadores.Intro.Cor", Jogadores.CustonNameIntro.replace("§", "&"));
                    Variables.plugin.saveConfig();
                    sender.sendMessage(Strings.prefix + "§2Cor alterada com Sucesso! §6COR");
                } else if (args[1].equalsIgnoreCase("7")) {
                    Jogadores.CustonNameIntro = "§7§l";
                    Variables.plugin.getConfig().set("Jogadores.Intro.Cor", Jogadores.CustonNameIntro.replace("§", "&"));
                    Variables.plugin.saveConfig();
                    sender.sendMessage(Strings.prefix + "§2Cor alterada com Sucesso! §7COR");
                } else if (args[1].equalsIgnoreCase("8")) {
                    Jogadores.CustonNameIntro = "§8§l";
                    Variables.plugin.getConfig().set("Jogadores.Intro.Cor", Jogadores.CustonNameIntro.replace("§", "&"));
                    Variables.plugin.saveConfig();
                    sender.sendMessage(Strings.prefix + "§2Cor alterada com Sucesso! §8COR");
                } else if (args[1].equalsIgnoreCase("9")) {
                    Jogadores.CustonNameIntro = "§9§l";
                    Variables.plugin.getConfig().set("Jogadores.Intro.Cor", Jogadores.CustonNameIntro.replace("§", "&"));
                    Variables.plugin.saveConfig();
                    sender.sendMessage(Strings.prefix + "§2Cor alterada com Sucesso! §9COR");
                } else if (args[1].equalsIgnoreCase("0")) {
                    Jogadores.CustonNameIntro = "§0§l";
                    Variables.plugin.getConfig().set("Jogadores.Intro.Cor", Jogadores.CustonNameIntro.replace("§", "&"));
                    Variables.plugin.saveConfig();
                    sender.sendMessage(Strings.prefix + "§2Cor alterada com Sucesso! §0COR");
                } else if (args[1].equalsIgnoreCase("a")) {
                    Jogadores.CustonNameIntro = "§a§l";
                    Variables.plugin.getConfig().set("Jogadores.Intro.Cor", Jogadores.CustonNameIntro.replace("§", "&"));
                    Variables.plugin.saveConfig();
                    sender.sendMessage(Strings.prefix + "§2Cor alterada com Sucesso! §aCOR");
                } else if (args[1].equalsIgnoreCase("b")) {
                    Jogadores.CustonNameIntro = "§b§l";
                    Variables.plugin.getConfig().set("Jogadores.Intro.Cor", Jogadores.CustonNameIntro.replace("§", "&"));
                    Variables.plugin.saveConfig();
                    sender.sendMessage(Strings.prefix + "§2Cor alterada com Sucesso! §bCOR");
                } else if (args[1].equalsIgnoreCase("c")) {
                    Jogadores.CustonNameIntro = "§c§l";
                    Variables.plugin.getConfig().set("Jogadores.Intro.Cor", Jogadores.CustonNameIntro.replace("§", "&"));
                    Variables.plugin.saveConfig();
                    sender.sendMessage(Strings.prefix + "§2Cor alterada com Sucesso! §cCOR");
                } else if (args[1].equalsIgnoreCase("d")) {
                    Jogadores.CustonNameIntro = "§d§l";
                    Variables.plugin.getConfig().set("Jogadores.Intro.Cor", Jogadores.CustonNameIntro.replace("§", "&"));
                    Variables.plugin.saveConfig();
                    sender.sendMessage(Strings.prefix + "§2Cor alterada com Sucesso! §dCOR");
                } else if (args[1].equalsIgnoreCase("e")) {
                    Jogadores.CustonNameIntro = "§e§l";
                    Variables.plugin.getConfig().set("Jogadores.Intro.Cor", Jogadores.CustonNameIntro.replace("§", "&"));
                    Variables.plugin.saveConfig();
                    sender.sendMessage(Strings.prefix + "§2Cor alterada com Sucesso! §eCOR");
                } else if (args[1].equalsIgnoreCase("f")) {
                    Jogadores.CustonNameIntro = "§f§l";
                    Variables.plugin.getConfig().set("Jogadores.Intro.Cor", Jogadores.CustonNameIntro.replace("§", "&"));
                    Variables.plugin.saveConfig();
                    sender.sendMessage(Strings.prefix + "§2Cor alterada com Sucesso! §fCOR");
                } else {
                    sender.sendMessage(Strings.prefix + "§cUse uma cor válida!");
                    sender.sendMessage(Strings.prefix + "§6Cores: §aA §bB §cC §dD §eE §fF §11 §22 §33 §44 §55 §66 §77 §88 §99 §00");
                    return true;
                }
            } else if (sender.getName().equalsIgnoreCase(Jogadores.Meel)) {
                if (args[1].equalsIgnoreCase("1")) {
                    Jogadores.CustonNameMeel = "§1§l";
                    Variables.plugin.getConfig().set("Jogadores.Meel.Cor", Jogadores.CustonNameMeel.replace("§", "&"));
                    Variables.plugin.saveConfig();
                    sender.sendMessage(Strings.prefix + "§2Cor alterada com Sucesso! §1COR");
                } else if (args[1].equalsIgnoreCase("2")) {
                    Jogadores.CustonNameMeel = "§2§l";
                    Variables.plugin.getConfig().set("Jogadores.Meel.Cor", Jogadores.CustonNameMeel.replace("§", "&"));
                    Variables.plugin.saveConfig();
                    sender.sendMessage(Strings.prefix + "§2Cor alterada com Sucesso! §1COR");
                } else if (args[1].equalsIgnoreCase("3")) {
                    Jogadores.CustonNameMeel = "§3§l";
                    Variables.plugin.getConfig().set("Jogadores.Meel.Cor", Jogadores.CustonNameMeel.replace("§", "&"));
                    Variables.plugin.saveConfig();
                    sender.sendMessage(Strings.prefix + "§2Cor alterada com Sucesso! §3COR");
                } else if (args[1].equalsIgnoreCase("4")) {
                    Jogadores.CustonNameMeel = "§4§l";
                    Variables.plugin.getConfig().set("Jogadores.Meel.Cor", Jogadores.CustonNameMeel.replace("§", "&"));
                    Variables.plugin.saveConfig();
                    sender.sendMessage(Strings.prefix + "§2Cor alterada com Sucesso! §4COR");
                } else if (args[1].equalsIgnoreCase("5")) {
                    Jogadores.CustonNameMeel = "§5§l";
                    Variables.plugin.getConfig().set("Jogadores.Meel.Cor", Jogadores.CustonNameMeel.replace("§", "&"));
                    Variables.plugin.saveConfig();
                    sender.sendMessage(Strings.prefix + "§2Cor alterada com Sucesso! §5COR");
                } else if (args[1].equalsIgnoreCase("6")) {
                    Jogadores.CustonNameMeel = "§6§l";
                    Variables.plugin.getConfig().set("Jogadores.Meel.Cor", Jogadores.CustonNameMeel.replace("§", "&"));
                    Variables.plugin.saveConfig();
                    sender.sendMessage(Strings.prefix + "§2Cor alterada com Sucesso! §6COR");
                } else if (args[1].equalsIgnoreCase("7")) {
                    Jogadores.CustonNameMeel = "§7§l";
                    Variables.plugin.getConfig().set("Jogadores.Meel.Cor", Jogadores.CustonNameMeel.replace("§", "&"));
                    Variables.plugin.saveConfig();
                    sender.sendMessage(Strings.prefix + "§2Cor alterada com Sucesso! §7COR");
                } else if (args[1].equalsIgnoreCase("8")) {
                    Jogadores.CustonNameMeel = "§8§l";
                    Variables.plugin.getConfig().set("Jogadores.Meel.Cor", Jogadores.CustonNameMeel.replace("§", "&"));
                    Variables.plugin.saveConfig();
                    sender.sendMessage(Strings.prefix + "§2Cor alterada com Sucesso! §8COR");
                } else if (args[1].equalsIgnoreCase("9")) {
                    Jogadores.CustonNameMeel = "§9§l";
                    Variables.plugin.getConfig().set("Jogadores.Meel.Cor", Jogadores.CustonNameMeel.replace("§", "&"));
                    Variables.plugin.saveConfig();
                    sender.sendMessage(Strings.prefix + "§2Cor alterada com Sucesso! §9COR");
                } else if (args[1].equalsIgnoreCase("0")) {
                    Jogadores.CustonNameMeel = "§0§l";
                    Variables.plugin.getConfig().set("Jogadores.Meel.Cor", Jogadores.CustonNameMeel.replace("§", "&"));
                    Variables.plugin.saveConfig();
                    sender.sendMessage(Strings.prefix + "§2Cor alterada com Sucesso! §0COR");
                } else if (args[1].equalsIgnoreCase("a")) {
                    Jogadores.CustonNameMeel = "§a§l";
                    Variables.plugin.getConfig().set("Jogadores.Meel.Cor", Jogadores.CustonNameMeel.replace("§", "&"));
                    Variables.plugin.saveConfig();
                    sender.sendMessage(Strings.prefix + "§2Cor alterada com Sucesso! §aCOR");
                } else if (args[1].equalsIgnoreCase("b")) {
                    Jogadores.CustonNameMeel = "§b§l";
                    Variables.plugin.getConfig().set("Jogadores.Meel.Cor", Jogadores.CustonNameMeel.replace("§", "&"));
                    Variables.plugin.saveConfig();
                    sender.sendMessage(Strings.prefix + "§2Cor alterada com Sucesso! §bCOR");
                } else if (args[1].equalsIgnoreCase("c")) {
                    Jogadores.CustonNameMeel = "§c§l";
                    Variables.plugin.getConfig().set("Jogadores.Meel.Cor", Jogadores.CustonNameMeel.replace("§", "&"));
                    Variables.plugin.saveConfig();
                    sender.sendMessage(Strings.prefix + "§2Cor alterada com Sucesso! §cCOR");
                } else if (args[1].equalsIgnoreCase("d")) {
                    Jogadores.CustonNameMeel = "§d§l";
                    Variables.plugin.getConfig().set("Jogadores.Meel.Cor", Jogadores.CustonNameMeel.replace("§", "&"));
                    Variables.plugin.saveConfig();
                    sender.sendMessage(Strings.prefix + "§2Cor alterada com Sucesso! §dCOR");
                } else if (args[1].equalsIgnoreCase("e")) {
                    Jogadores.CustonNameMeel = "§e§l";
                    Variables.plugin.getConfig().set("Jogadores.Meel.Cor", Jogadores.CustonNameMeel.replace("§", "&"));
                    Variables.plugin.saveConfig();
                    sender.sendMessage(Strings.prefix + "§2Cor alterada com Sucesso! §eCOR");
                } else if (args[1].equalsIgnoreCase("f")) {
                    Jogadores.CustonNameMeel = "§f§l";
                    Variables.plugin.getConfig().set("Jogadores.Meel.Cor", Jogadores.CustonNameMeel.replace("§", "&"));
                    Variables.plugin.saveConfig();
                    sender.sendMessage(Strings.prefix + "§2Cor alterada com Sucesso! §fCOR");
                } else {
                    sender.sendMessage(Strings.prefix + "§cUse uma cor válida!");
                    sender.sendMessage(Strings.prefix + "§6Cores: §aA §bB §cC §dD §eE §fF §11 §22 §33 §44 §55 §66 §77 §88 §99 §00");
                    return true;
                }
            } else if (sender.getName().equalsIgnoreCase(Jogadores.Diego)) {
                if (args[1].equalsIgnoreCase("1")) {
                    Jogadores.CustonNameDiego = "§1§l";
                    Variables.plugin.getConfig().set("Jogadores.Diego.Cor", Jogadores.CustonNameDiego.replace("§", "&"));
                    Variables.plugin.saveConfig();
                    sender.sendMessage(Strings.prefix + "§2Cor alterada com Sucesso! §1COR");
                } else if (args[1].equalsIgnoreCase("2")) {
                    Jogadores.CustonNameDiego = "§2§l";
                    Variables.plugin.getConfig().set("Jogadores.Diego.Cor", Jogadores.CustonNameDiego.replace("§", "&"));
                    Variables.plugin.saveConfig();
                    sender.sendMessage(Strings.prefix + "§2Cor alterada com Sucesso! §1COR");
                } else if (args[1].equalsIgnoreCase("3")) {
                    Jogadores.CustonNameDiego = "§3§l";
                    Variables.plugin.getConfig().set("Jogadores.Diego.Cor", Jogadores.CustonNameDiego.replace("§", "&"));
                    Variables.plugin.saveConfig();
                    sender.sendMessage(Strings.prefix + "§2Cor alterada com Sucesso! §3COR");
                } else if (args[1].equalsIgnoreCase("4")) {
                    Jogadores.CustonNameDiego = "§4§l";
                    Variables.plugin.getConfig().set("Jogadores.Diego.Cor", Jogadores.CustonNameDiego.replace("§", "&"));
                    Variables.plugin.saveConfig();
                    sender.sendMessage(Strings.prefix + "§2Cor alterada com Sucesso! §4COR");
                } else if (args[1].equalsIgnoreCase("5")) {
                    Jogadores.CustonNameDiego = "§5§l";
                    Variables.plugin.getConfig().set("Jogadores.Diego.Cor", Jogadores.CustonNameDiego.replace("§", "&"));
                    Variables.plugin.saveConfig();
                    sender.sendMessage(Strings.prefix + "§2Cor alterada com Sucesso! §5COR");
                } else if (args[1].equalsIgnoreCase("6")) {
                    Jogadores.CustonNameDiego = "§6§l";
                    Variables.plugin.getConfig().set("Jogadores.Diego.Cor", Jogadores.CustonNameDiego.replace("§", "&"));
                    Variables.plugin.saveConfig();
                    sender.sendMessage(Strings.prefix + "§2Cor alterada com Sucesso! §6COR");
                } else if (args[1].equalsIgnoreCase("7")) {
                    Jogadores.CustonNameDiego = "§7§l";
                    Variables.plugin.getConfig().set("Jogadores.Diego.Cor", Jogadores.CustonNameDiego.replace("§", "&"));
                    Variables.plugin.saveConfig();
                    sender.sendMessage(Strings.prefix + "§2Cor alterada com Sucesso! §7COR");
                } else if (args[1].equalsIgnoreCase("8")) {
                    Jogadores.CustonNameDiego = "§8§l";
                    Variables.plugin.getConfig().set("Jogadores.Diego.Cor", Jogadores.CustonNameDiego.replace("§", "&"));
                    Variables.plugin.saveConfig();
                    sender.sendMessage(Strings.prefix + "§2Cor alterada com Sucesso! §8COR");
                } else if (args[1].equalsIgnoreCase("9")) {
                    Jogadores.CustonNameDiego = "§9§l";
                    Variables.plugin.getConfig().set("Jogadores.Diego.Cor", Jogadores.CustonNameDiego.replace("§", "&"));
                    Variables.plugin.saveConfig();
                    sender.sendMessage(Strings.prefix + "§2Cor alterada com Sucesso! §9COR");
                } else if (args[1].equalsIgnoreCase("0")) {
                    Jogadores.CustonNameDiego = "§0§l";
                    Variables.plugin.getConfig().set("Jogadores.Diego.Cor", Jogadores.CustonNameDiego.replace("§", "&"));
                    Variables.plugin.saveConfig();
                    sender.sendMessage(Strings.prefix + "§2Cor alterada com Sucesso! §0COR");
                } else if (args[1].equalsIgnoreCase("a")) {
                    Jogadores.CustonNameDiego = "§a§l";
                    Variables.plugin.getConfig().set("Jogadores.Diego.Cor", Jogadores.CustonNameDiego.replace("§", "&"));
                    Variables.plugin.saveConfig();
                    sender.sendMessage(Strings.prefix + "§2Cor alterada com Sucesso! §aCOR");
                } else if (args[1].equalsIgnoreCase("b")) {
                    Jogadores.CustonNameDiego = "§b§l";
                    Variables.plugin.getConfig().set("Jogadores.Diego.Cor", Jogadores.CustonNameDiego.replace("§", "&"));
                    Variables.plugin.saveConfig();
                    sender.sendMessage(Strings.prefix + "§2Cor alterada com Sucesso! §bCOR");
                } else if (args[1].equalsIgnoreCase("c")) {
                    Jogadores.CustonNameDiego = "§c§l";
                    Variables.plugin.getConfig().set("Jogadores.Diego.Cor", Jogadores.CustonNameDiego.replace("§", "&"));
                    Variables.plugin.saveConfig();
                    sender.sendMessage(Strings.prefix + "§2Cor alterada com Sucesso! §cCOR");
                } else if (args[1].equalsIgnoreCase("d")) {
                    Jogadores.CustonNameDiego = "§d§l";
                    Variables.plugin.getConfig().set("Jogadores.Diego.Cor", Jogadores.CustonNameDiego.replace("§", "&"));
                    Variables.plugin.saveConfig();
                    sender.sendMessage(Strings.prefix + "§2Cor alterada com Sucesso! §dCOR");
                } else if (args[1].equalsIgnoreCase("e")) {
                    Jogadores.CustonNameDiego = "§e§l";
                    Variables.plugin.getConfig().set("Jogadores.Diego.Cor", Jogadores.CustonNameDiego.replace("§", "&"));
                    Variables.plugin.saveConfig();
                    sender.sendMessage(Strings.prefix + "§2Cor alterada com Sucesso! §eCOR");
                } else if (args[1].equalsIgnoreCase("f")) {
                    Jogadores.CustonNameDiego = "§f§l";
                    Variables.plugin.getConfig().set("Jogadores.Diego.Cor", Jogadores.CustonNameDiego.replace("§", "&"));
                    Variables.plugin.saveConfig();
                    sender.sendMessage(Strings.prefix + "§2Cor alterada com Sucesso! §fCOR");
                } else {
                    sender.sendMessage(Strings.prefix + "§cUse uma cor válida!");
                    sender.sendMessage(Strings.prefix + "§6Cores: §aA §bB §cC §dD §eE §fF §11 §22 §33 §44 §55 §66 §77 §88 §99 §00");
                    return true;
                }
            } else if (sender.getName().equalsIgnoreCase(Jogadores.Sombra)) {
                if (args[1].equalsIgnoreCase("1")) {
                    Jogadores.CustonNameSombra = "§1§l";
                    Variables.plugin.getConfig().set("Jogadores.Sombra.Cor", Jogadores.CustonNameSombra.replace("§", "&"));
                    Variables.plugin.saveConfig();
                    sender.sendMessage(Strings.prefix + "§2Cor alterada com Sucesso! §1COR");
                } else if (args[1].equalsIgnoreCase("2")) {
                    Jogadores.CustonNameSombra = "§2§l";
                    Variables.plugin.getConfig().set("Jogadores.Sombra.Cor", Jogadores.CustonNameSombra.replace("§", "&"));
                    Variables.plugin.saveConfig();
                    sender.sendMessage(Strings.prefix + "§2Cor alterada com Sucesso! §1COR");
                } else if (args[1].equalsIgnoreCase("3")) {
                    Jogadores.CustonNameSombra = "§3§l";
                    Variables.plugin.getConfig().set("Jogadores.Sombra.Cor", Jogadores.CustonNameSombra.replace("§", "&"));
                    Variables.plugin.saveConfig();
                    sender.sendMessage(Strings.prefix + "§2Cor alterada com Sucesso! §3COR");
                } else if (args[1].equalsIgnoreCase("4")) {
                    Jogadores.CustonNameSombra = "§4§l";
                    Variables.plugin.getConfig().set("Jogadores.Sombra.Cor", Jogadores.CustonNameSombra.replace("§", "&"));
                    Variables.plugin.saveConfig();
                    sender.sendMessage(Strings.prefix + "§2Cor alterada com Sucesso! §4COR");
                } else if (args[1].equalsIgnoreCase("5")) {
                    Jogadores.CustonNameSombra = "§5§l";
                    Variables.plugin.getConfig().set("Jogadores.Sombra.Cor", Jogadores.CustonNameSombra.replace("§", "&"));
                    Variables.plugin.saveConfig();
                    sender.sendMessage(Strings.prefix + "§2Cor alterada com Sucesso! §5COR");
                } else if (args[1].equalsIgnoreCase("6")) {
                    Jogadores.CustonNameSombra = "§6§l";
                    Variables.plugin.getConfig().set("Jogadores.Sombra.Cor", Jogadores.CustonNameSombra.replace("§", "&"));
                    Variables.plugin.saveConfig();
                    sender.sendMessage(Strings.prefix + "§2Cor alterada com Sucesso! §6COR");
                } else if (args[1].equalsIgnoreCase("7")) {
                    Jogadores.CustonNameSombra = "§7§l";
                    Variables.plugin.getConfig().set("Jogadores.Sombra.Cor", Jogadores.CustonNameSombra.replace("§", "&"));
                    Variables.plugin.saveConfig();
                    sender.sendMessage(Strings.prefix + "§2Cor alterada com Sucesso! §7COR");
                } else if (args[1].equalsIgnoreCase("8")) {
                    Jogadores.CustonNameSombra = "§8§l";
                    Variables.plugin.getConfig().set("Jogadores.Sombra.Cor", Jogadores.CustonNameSombra.replace("§", "&"));
                    Variables.plugin.saveConfig();
                    sender.sendMessage(Strings.prefix + "§2Cor alterada com Sucesso! §8COR");
                } else if (args[1].equalsIgnoreCase("9")) {
                    Jogadores.CustonNameSombra = "§9§l";
                    Variables.plugin.getConfig().set("Jogadores.Sombra.Cor", Jogadores.CustonNameSombra.replace("§", "&"));
                    Variables.plugin.saveConfig();
                    sender.sendMessage(Strings.prefix + "§2Cor alterada com Sucesso! §9COR");
                } else if (args[1].equalsIgnoreCase("0")) {
                    Jogadores.CustonNameSombra = "§0§l";
                    Variables.plugin.getConfig().set("Jogadores.Sombra.Cor", Jogadores.CustonNameSombra.replace("§", "&"));
                    Variables.plugin.saveConfig();
                    sender.sendMessage(Strings.prefix + "§2Cor alterada com Sucesso! §0COR");
                } else if (args[1].equalsIgnoreCase("a")) {
                    Jogadores.CustonNameSombra = "§a§l";
                    Variables.plugin.getConfig().set("Jogadores.Sombra.Cor", Jogadores.CustonNameSombra.replace("§", "&"));
                    Variables.plugin.saveConfig();
                    sender.sendMessage(Strings.prefix + "§2Cor alterada com Sucesso! §aCOR");
                } else if (args[1].equalsIgnoreCase("b")) {
                    Jogadores.CustonNameSombra = "§b§l";
                    Variables.plugin.getConfig().set("Jogadores.Sombra.Cor", Jogadores.CustonNameSombra.replace("§", "&"));
                    Variables.plugin.saveConfig();
                    sender.sendMessage(Strings.prefix + "§2Cor alterada com Sucesso! §bCOR");
                } else if (args[1].equalsIgnoreCase("c")) {
                    Jogadores.CustonNameSombra = "§c§l";
                    Variables.plugin.getConfig().set("Jogadores.Sombra.Cor", Jogadores.CustonNameSombra.replace("§", "&"));
                    Variables.plugin.saveConfig();
                    sender.sendMessage(Strings.prefix + "§2Cor alterada com Sucesso! §cCOR");
                } else if (args[1].equalsIgnoreCase("d")) {
                    Jogadores.CustonNameSombra = "§d§l";
                    Variables.plugin.getConfig().set("Jogadores.Sombra.Cor", Jogadores.CustonNameSombra.replace("§", "&"));
                    Variables.plugin.saveConfig();
                    sender.sendMessage(Strings.prefix + "§2Cor alterada com Sucesso! §dCOR");
                } else if (args[1].equalsIgnoreCase("e")) {
                    Jogadores.CustonNameSombra = "§e§l";
                    Variables.plugin.getConfig().set("Jogadores.Sombra.Cor", Jogadores.CustonNameSombra.replace("§", "&"));
                    Variables.plugin.saveConfig();
                    sender.sendMessage(Strings.prefix + "§2Cor alterada com Sucesso! §eCOR");
                } else if (args[1].equalsIgnoreCase("f")) {
                    Jogadores.CustonNameSombra = "§f§l";
                    Variables.plugin.getConfig().set("Jogadores.Sombra.Cor", Jogadores.CustonNameSombra.replace("§", "&"));
                    Variables.plugin.saveConfig();
                    sender.sendMessage(Strings.prefix + "§2Cor alterada com Sucesso! §fCOR");
                } else {
                    sender.sendMessage(Strings.prefix + "§cUse uma cor válida!");
                    sender.sendMessage(Strings.prefix + "§6Cores: §aA §bB §cC §dD §eE §fF §11 §22 §33 §44 §55 §66 §77 §88 §99 §00");
                    return true;
                }
            } else if (sender.getName().equalsIgnoreCase(Jogadores.Raymeki)) {
                if (args[1].equalsIgnoreCase("1")) {
                    Jogadores.CustonNameRaymeki = "§1§l";
                    Variables.plugin.getConfig().set("Jogadores.Raymeki.Cor", Jogadores.CustonNameRaymeki.replace("§", "&"));
                    Variables.plugin.saveConfig();
                    sender.sendMessage(Strings.prefix + "§2Cor alterada com Sucesso! §1COR");
                } else if (args[1].equalsIgnoreCase("2")) {
                    Jogadores.CustonNameRaymeki = "§2§l";
                    Variables.plugin.getConfig().set("Jogadores.Raymeki.Cor", Jogadores.CustonNameRaymeki.replace("§", "&"));
                    Variables.plugin.saveConfig();
                    sender.sendMessage(Strings.prefix + "§2Cor alterada com Sucesso! §1COR");
                } else if (args[1].equalsIgnoreCase("3")) {
                    Jogadores.CustonNameRaymeki = "§3§l";
                    Variables.plugin.getConfig().set("Jogadores.Raymeki.Cor", Jogadores.CustonNameRaymeki.replace("§", "&"));
                    Variables.plugin.saveConfig();
                    sender.sendMessage(Strings.prefix + "§2Cor alterada com Sucesso! §3COR");
                } else if (args[1].equalsIgnoreCase("4")) {
                    Jogadores.CustonNameRaymeki = "§4§l";
                    Variables.plugin.getConfig().set("Jogadores.Raymeki.Cor", Jogadores.CustonNameRaymeki.replace("§", "&"));
                    Variables.plugin.saveConfig();
                    sender.sendMessage(Strings.prefix + "§2Cor alterada com Sucesso! §4COR");
                } else if (args[1].equalsIgnoreCase("5")) {
                    Jogadores.CustonNameRaymeki = "§5§l";
                    Variables.plugin.getConfig().set("Jogadores.Raymeki.Cor", Jogadores.CustonNameRaymeki.replace("§", "&"));
                    Variables.plugin.saveConfig();
                    sender.sendMessage(Strings.prefix + "§2Cor alterada com Sucesso! §5COR");
                } else if (args[1].equalsIgnoreCase("6")) {
                    Jogadores.CustonNameRaymeki = "§6§l";
                    Variables.plugin.getConfig().set("Jogadores.Raymeki.Cor", Jogadores.CustonNameRaymeki.replace("§", "&"));
                    Variables.plugin.saveConfig();
                    sender.sendMessage(Strings.prefix + "§2Cor alterada com Sucesso! §6COR");
                } else if (args[1].equalsIgnoreCase("7")) {
                    Jogadores.CustonNameRaymeki = "§7§l";
                    Variables.plugin.getConfig().set("Jogadores.Raymeki.Cor", Jogadores.CustonNameRaymeki.replace("§", "&"));
                    Variables.plugin.saveConfig();
                    sender.sendMessage(Strings.prefix + "§2Cor alterada com Sucesso! §7COR");
                } else if (args[1].equalsIgnoreCase("8")) {
                    Jogadores.CustonNameRaymeki = "§8§l";
                    Variables.plugin.getConfig().set("Jogadores.Raymeki.Cor", Jogadores.CustonNameRaymeki.replace("§", "&"));
                    Variables.plugin.saveConfig();
                    sender.sendMessage(Strings.prefix + "§2Cor alterada com Sucesso! §8COR");
                } else if (args[1].equalsIgnoreCase("9")) {
                    Jogadores.CustonNameRaymeki = "§9§l";
                    Variables.plugin.getConfig().set("Jogadores.Raymeki.Cor", Jogadores.CustonNameRaymeki.replace("§", "&"));
                    Variables.plugin.saveConfig();
                    sender.sendMessage(Strings.prefix + "§2Cor alterada com Sucesso! §9COR");
                } else if (args[1].equalsIgnoreCase("0")) {
                    Jogadores.CustonNameRaymeki = "§0§l";
                    Variables.plugin.getConfig().set("Jogadores.Raymeki.Cor", Jogadores.CustonNameRaymeki.replace("§", "&"));
                    Variables.plugin.saveConfig();
                    sender.sendMessage(Strings.prefix + "§2Cor alterada com Sucesso! §0COR");
                } else if (args[1].equalsIgnoreCase("a")) {
                    Jogadores.CustonNameRaymeki = "§a§l";
                    Variables.plugin.getConfig().set("Jogadores.Raymeki.Cor", Jogadores.CustonNameRaymeki.replace("§", "&"));
                    Variables.plugin.saveConfig();
                    sender.sendMessage(Strings.prefix + "§2Cor alterada com Sucesso! §aCOR");
                } else if (args[1].equalsIgnoreCase("b")) {
                    Jogadores.CustonNameRaymeki = "§b§l";
                    Variables.plugin.getConfig().set("Jogadores.Raymeki.Cor", Jogadores.CustonNameRaymeki.replace("§", "&"));
                    Variables.plugin.saveConfig();
                    sender.sendMessage(Strings.prefix + "§2Cor alterada com Sucesso! §bCOR");
                } else if (args[1].equalsIgnoreCase("c")) {
                    Jogadores.CustonNameRaymeki = "§c§l";
                    Variables.plugin.getConfig().set("Jogadores.Raymeki.Cor", Jogadores.CustonNameRaymeki.replace("§", "&"));
                    Variables.plugin.saveConfig();
                    sender.sendMessage(Strings.prefix + "§2Cor alterada com Sucesso! §cCOR");
                } else if (args[1].equalsIgnoreCase("d")) {
                    Jogadores.CustonNameRaymeki = "§d§l";
                    Variables.plugin.getConfig().set("Jogadores.Raymeki.Cor", Jogadores.CustonNameRaymeki.replace("§", "&"));
                    Variables.plugin.saveConfig();
                    sender.sendMessage(Strings.prefix + "§2Cor alterada com Sucesso! §dCOR");
                } else if (args[1].equalsIgnoreCase("e")) {
                    Jogadores.CustonNameRaymeki = "§e§l";
                    Variables.plugin.getConfig().set("Jogadores.Raymeki.Cor", Jogadores.CustonNameRaymeki.replace("§", "&"));
                    Variables.plugin.saveConfig();
                    sender.sendMessage(Strings.prefix + "§2Cor alterada com Sucesso! §eCOR");
                } else if (args[1].equalsIgnoreCase("f")) {
                    Jogadores.CustonNameRaymeki = "§f§l";
                    Variables.plugin.getConfig().set("Jogadores.Raymeki.Cor", Jogadores.CustonNameRaymeki.replace("§", "&"));
                    Variables.plugin.saveConfig();
                    sender.sendMessage(Strings.prefix + "§2Cor alterada com Sucesso! §fCOR");
                } else {
                    sender.sendMessage(Strings.prefix + "§cUse uma cor válida!");
                    sender.sendMessage(Strings.prefix + "§6Cores: §aA §bB §cC §dD §eE §fF §11 §22 §33 §44 §55 §66 §77 §88 §99 §00");
                    return true;
                }
            } else if (sender.getName().equalsIgnoreCase(Jogadores.Edder)) {
                if (args[1].equalsIgnoreCase("1")) {
                    Jogadores.CustonNameEdder = "§1§l";
                    Variables.plugin.getConfig().set("Jogadores.Edder.Cor", Jogadores.CustonNameEdder.replace("§", "&"));
                    Variables.plugin.saveConfig();
                    sender.sendMessage(Strings.prefix + "§2Cor alterada com Sucesso! §1COR");
                } else if (args[1].equalsIgnoreCase("2")) {
                    Jogadores.CustonNameEdder = "§2§l";
                    Variables.plugin.getConfig().set("Jogadores.Edder.Cor", Jogadores.CustonNameEdder.replace("§", "&"));
                    Variables.plugin.saveConfig();
                    sender.sendMessage(Strings.prefix + "§2Cor alterada com Sucesso! §1COR");
                } else if (args[1].equalsIgnoreCase("3")) {
                    Jogadores.CustonNameEdder = "§3§l";
                    Variables.plugin.getConfig().set("Jogadores.Edder.Cor", Jogadores.CustonNameEdder.replace("§", "&"));
                    Variables.plugin.saveConfig();
                    sender.sendMessage(Strings.prefix + "§2Cor alterada com Sucesso! §3COR");
                } else if (args[1].equalsIgnoreCase("4")) {
                    Jogadores.CustonNameEdder = "§4§l";
                    Variables.plugin.getConfig().set("Jogadores.Edder.Cor", Jogadores.CustonNameEdder.replace("§", "&"));
                    Variables.plugin.saveConfig();
                    sender.sendMessage(Strings.prefix + "§2Cor alterada com Sucesso! §4COR");
                } else if (args[1].equalsIgnoreCase("5")) {
                    Jogadores.CustonNameEdder = "§5§l";
                    Variables.plugin.getConfig().set("Jogadores.Edder.Cor", Jogadores.CustonNameEdder.replace("§", "&"));
                    Variables.plugin.saveConfig();
                    sender.sendMessage(Strings.prefix + "§2Cor alterada com Sucesso! §5COR");
                } else if (args[1].equalsIgnoreCase("6")) {
                    Jogadores.CustonNameEdder = "§6§l";
                    Variables.plugin.getConfig().set("Jogadores.Edder.Cor", Jogadores.CustonNameEdder.replace("§", "&"));
                    Variables.plugin.saveConfig();
                    sender.sendMessage(Strings.prefix + "§2Cor alterada com Sucesso! §6COR");
                } else if (args[1].equalsIgnoreCase("7")) {
                    Jogadores.CustonNameEdder = "§7§l";
                    Variables.plugin.getConfig().set("Jogadores.Edder.Cor", Jogadores.CustonNameEdder.replace("§", "&"));
                    Variables.plugin.saveConfig();
                    sender.sendMessage(Strings.prefix + "§2Cor alterada com Sucesso! §7COR");
                } else if (args[1].equalsIgnoreCase("8")) {
                    Jogadores.CustonNameEdder = "§8§l";
                    Variables.plugin.getConfig().set("Jogadores.Edder.Cor", Jogadores.CustonNameEdder.replace("§", "&"));
                    Variables.plugin.saveConfig();
                    sender.sendMessage(Strings.prefix + "§2Cor alterada com Sucesso! §8COR");
                } else if (args[1].equalsIgnoreCase("9")) {
                    Jogadores.CustonNameEdder = "§9§l";
                    Variables.plugin.getConfig().set("Jogadores.Edder.Cor", Jogadores.CustonNameEdder.replace("§", "&"));
                    Variables.plugin.saveConfig();
                    sender.sendMessage(Strings.prefix + "§2Cor alterada com Sucesso! §9COR");
                } else if (args[1].equalsIgnoreCase("0")) {
                    Jogadores.CustonNameEdder = "§0§l";
                    Variables.plugin.getConfig().set("Jogadores.Edder.Cor", Jogadores.CustonNameEdder.replace("§", "&"));
                    Variables.plugin.saveConfig();
                    sender.sendMessage(Strings.prefix + "§2Cor alterada com Sucesso! §0COR");
                } else if (args[1].equalsIgnoreCase("a")) {
                    Jogadores.CustonNameEdder = "§a§l";
                    Variables.plugin.getConfig().set("Jogadores.Edder.Cor", Jogadores.CustonNameEdder.replace("§", "&"));
                    Variables.plugin.saveConfig();
                    sender.sendMessage(Strings.prefix + "§2Cor alterada com Sucesso! §aCOR");
                } else if (args[1].equalsIgnoreCase("b")) {
                    Jogadores.CustonNameEdder = "§b§l";
                    Variables.plugin.getConfig().set("Jogadores.Edder.Cor", Jogadores.CustonNameEdder.replace("§", "&"));
                    Variables.plugin.saveConfig();
                    sender.sendMessage(Strings.prefix + "§2Cor alterada com Sucesso! §bCOR");
                } else if (args[1].equalsIgnoreCase("c")) {
                    Jogadores.CustonNameEdder = "§c§l";
                    Variables.plugin.getConfig().set("Jogadores.Edder.Cor", Jogadores.CustonNameEdder.replace("§", "&"));
                    Variables.plugin.saveConfig();
                    sender.sendMessage(Strings.prefix + "§2Cor alterada com Sucesso! §cCOR");
                } else if (args[1].equalsIgnoreCase("d")) {
                    Jogadores.CustonNameEdder = "§d§l";
                    Variables.plugin.getConfig().set("Jogadores.Edder.Cor", Jogadores.CustonNameEdder.replace("§", "&"));
                    Variables.plugin.saveConfig();
                    sender.sendMessage(Strings.prefix + "§2Cor alterada com Sucesso! §dCOR");
                } else if (args[1].equalsIgnoreCase("e")) {
                    Jogadores.CustonNameEdder = "§e§l";
                    Variables.plugin.getConfig().set("Jogadores.Edder.Cor", Jogadores.CustonNameEdder.replace("§", "&"));
                    Variables.plugin.saveConfig();
                    sender.sendMessage(Strings.prefix + "§2Cor alterada com Sucesso! §eCOR");
                } else if (args[1].equalsIgnoreCase("f")) {
                    Jogadores.CustonNameEdder = "§f§l";
                    Variables.plugin.getConfig().set("Jogadores.Edder.Cor", Jogadores.CustonNameEdder.replace("§", "&"));
                    Variables.plugin.saveConfig();
                    sender.sendMessage(Strings.prefix + "§2Cor alterada com Sucesso! §fCOR");
                } else {
                    sender.sendMessage(Strings.prefix + "§cUse uma cor válida!");
                    sender.sendMessage(Strings.prefix + "§6Cores: §aA §bB §cC §dD §eE §fF §11 §22 §33 §44 §55 §66 §77 §88 §99 §00");
                    return true;
                }
            } else if (sender.getName().equalsIgnoreCase(Jogadores.Crazy)) {
                if (args[1].equalsIgnoreCase("1")) {
                    Jogadores.CustonNameCrazy = "§1§l";
                    Variables.plugin.getConfig().set("Jogadores.Crazy.Cor", Jogadores.CustonNameCrazy.replace("§", "&"));
                    Variables.plugin.saveConfig();
                    sender.sendMessage(Strings.prefix + "§2Cor alterada com Sucesso! §1COR");
                } else if (args[1].equalsIgnoreCase("2")) {
                    Jogadores.CustonNameCrazy = "§2§l";
                    Variables.plugin.getConfig().set("Jogadores.Crazy.Cor", Jogadores.CustonNameCrazy.replace("§", "&"));
                    Variables.plugin.saveConfig();
                    sender.sendMessage(Strings.prefix + "§2Cor alterada com Sucesso! §1COR");
                } else if (args[1].equalsIgnoreCase("3")) {
                    Jogadores.CustonNameCrazy = "§3§l";
                    Variables.plugin.getConfig().set("Jogadores.Crazy.Cor", Jogadores.CustonNameCrazy.replace("§", "&"));
                    Variables.plugin.saveConfig();
                    sender.sendMessage(Strings.prefix + "§2Cor alterada com Sucesso! §3COR");
                } else if (args[1].equalsIgnoreCase("4")) {
                    Jogadores.CustonNameCrazy = "§4§l";
                    Variables.plugin.getConfig().set("Jogadores.Crazy.Cor", Jogadores.CustonNameCrazy.replace("§", "&"));
                    Variables.plugin.saveConfig();
                    sender.sendMessage(Strings.prefix + "§2Cor alterada com Sucesso! §4COR");
                } else if (args[1].equalsIgnoreCase("5")) {
                    Jogadores.CustonNameCrazy = "§5§l";
                    Variables.plugin.getConfig().set("Jogadores.Crazy.Cor", Jogadores.CustonNameCrazy.replace("§", "&"));
                    Variables.plugin.saveConfig();
                    sender.sendMessage(Strings.prefix + "§2Cor alterada com Sucesso! §5COR");
                } else if (args[1].equalsIgnoreCase("6")) {
                    Jogadores.CustonNameCrazy = "§6§l";
                    Variables.plugin.getConfig().set("Jogadores.Crazy.Cor", Jogadores.CustonNameCrazy.replace("§", "&"));
                    Variables.plugin.saveConfig();
                    sender.sendMessage(Strings.prefix + "§2Cor alterada com Sucesso! §6COR");
                } else if (args[1].equalsIgnoreCase("7")) {
                    Jogadores.CustonNameCrazy = "§7§l";
                    Variables.plugin.getConfig().set("Jogadores.Crazy.Cor", Jogadores.CustonNameCrazy.replace("§", "&"));
                    Variables.plugin.saveConfig();
                    sender.sendMessage(Strings.prefix + "§2Cor alterada com Sucesso! §7COR");
                } else if (args[1].equalsIgnoreCase("8")) {
                    Jogadores.CustonNameCrazy = "§8§l";
                    Variables.plugin.getConfig().set("Jogadores.Crazy.Cor", Jogadores.CustonNameCrazy.replace("§", "&"));
                    Variables.plugin.saveConfig();
                    sender.sendMessage(Strings.prefix + "§2Cor alterada com Sucesso! §8COR");
                } else if (args[1].equalsIgnoreCase("9")) {
                    Jogadores.CustonNameCrazy = "§9§l";
                    Variables.plugin.getConfig().set("Jogadores.Crazy.Cor", Jogadores.CustonNameCrazy.replace("§", "&"));
                    Variables.plugin.saveConfig();
                    sender.sendMessage(Strings.prefix + "§2Cor alterada com Sucesso! §9COR");
                } else if (args[1].equalsIgnoreCase("0")) {
                    Jogadores.CustonNameCrazy = "§0§l";
                    Variables.plugin.getConfig().set("Jogadores.Crazy.Cor", Jogadores.CustonNameCrazy.replace("§", "&"));
                    Variables.plugin.saveConfig();
                    sender.sendMessage(Strings.prefix + "§2Cor alterada com Sucesso! §0COR");
                } else if (args[1].equalsIgnoreCase("a")) {
                    Jogadores.CustonNameCrazy = "§a§l";
                    Variables.plugin.getConfig().set("Jogadores.Crazy.Cor", Jogadores.CustonNameCrazy.replace("§", "&"));
                    Variables.plugin.saveConfig();
                    sender.sendMessage(Strings.prefix + "§2Cor alterada com Sucesso! §aCOR");
                } else if (args[1].equalsIgnoreCase("b")) {
                    Jogadores.CustonNameCrazy = "§b§l";
                    Variables.plugin.getConfig().set("Jogadores.Crazy.Cor", Jogadores.CustonNameCrazy.replace("§", "&"));
                    Variables.plugin.saveConfig();
                    sender.sendMessage(Strings.prefix + "§2Cor alterada com Sucesso! §bCOR");
                } else if (args[1].equalsIgnoreCase("c")) {
                    Jogadores.CustonNameCrazy = "§c§l";
                    Variables.plugin.getConfig().set("Jogadores.Crazy.Cor", Jogadores.CustonNameCrazy.replace("§", "&"));
                    Variables.plugin.saveConfig();
                    sender.sendMessage(Strings.prefix + "§2Cor alterada com Sucesso! §cCOR");
                } else if (args[1].equalsIgnoreCase("d")) {
                    Jogadores.CustonNameCrazy = "§d§l";
                    Variables.plugin.getConfig().set("Jogadores.Crazy.Cor", Jogadores.CustonNameCrazy.replace("§", "&"));
                    Variables.plugin.saveConfig();
                    sender.sendMessage(Strings.prefix + "§2Cor alterada com Sucesso! §dCOR");
                } else if (args[1].equalsIgnoreCase("e")) {
                    Jogadores.CustonNameCrazy = "§e§l";
                    Variables.plugin.getConfig().set("Jogadores.Crazy.Cor", Jogadores.CustonNameCrazy.replace("§", "&"));
                    Variables.plugin.saveConfig();
                    sender.sendMessage(Strings.prefix + "§2Cor alterada com Sucesso! §eCOR");
                } else if (args[1].equalsIgnoreCase("f")) {
                    Jogadores.CustonNameCrazy = "§f§l";
                    Variables.plugin.getConfig().set("Jogadores.Crazy.Cor", Jogadores.CustonNameCrazy.replace("§", "&"));
                    Variables.plugin.saveConfig();
                    sender.sendMessage(Strings.prefix + "§2Cor alterada com Sucesso! §fCOR");
                } else {
                    sender.sendMessage(Strings.prefix + "§cUse uma cor válida!");
                    sender.sendMessage(Strings.prefix + "§6Cores: §aA §bB §cC §dD §eE §fF §11 §22 §33 §44 §55 §66 §77 §88 §99 §00");
                    return true;
                }
            } else if (sender.getName().equalsIgnoreCase(Jogadores.Dede)) {
                if (args[1].equalsIgnoreCase("1")) {
                    Jogadores.CustonNameDede = "§1§l";
                    Variables.plugin.getConfig().set("Jogadores.Dede.Cor", Jogadores.CustonNameDede.replace("§", "&"));
                    Variables.plugin.saveConfig();
                    sender.sendMessage(Strings.prefix + "§2Cor alterada com Sucesso! §1COR");
                } else if (args[1].equalsIgnoreCase("2")) {
                    Jogadores.CustonNameDede = "§2§l";
                    Variables.plugin.getConfig().set("Jogadores.Dede.Cor", Jogadores.CustonNameDede.replace("§", "&"));
                    Variables.plugin.saveConfig();
                    sender.sendMessage(Strings.prefix + "§2Cor alterada com Sucesso! §1COR");
                } else if (args[1].equalsIgnoreCase("3")) {
                    Jogadores.CustonNameDede = "§3§l";
                    Variables.plugin.getConfig().set("Jogadores.Dede.Cor", Jogadores.CustonNameDede.replace("§", "&"));
                    Variables.plugin.saveConfig();
                    sender.sendMessage(Strings.prefix + "§2Cor alterada com Sucesso! §3COR");
                } else if (args[1].equalsIgnoreCase("4")) {
                    Jogadores.CustonNameDede = "§4§l";
                    Variables.plugin.getConfig().set("Jogadores.Dede.Cor", Jogadores.CustonNameDede.replace("§", "&"));
                    Variables.plugin.saveConfig();
                    sender.sendMessage(Strings.prefix + "§2Cor alterada com Sucesso! §4COR");
                } else if (args[1].equalsIgnoreCase("5")) {
                    Jogadores.CustonNameDede = "§5§l";
                    Variables.plugin.getConfig().set("Jogadores.Dede.Cor", Jogadores.CustonNameDede.replace("§", "&"));
                    Variables.plugin.saveConfig();
                    sender.sendMessage(Strings.prefix + "§2Cor alterada com Sucesso! §5COR");
                } else if (args[1].equalsIgnoreCase("6")) {
                    Jogadores.CustonNameDede = "§6§l";
                    Variables.plugin.getConfig().set("Jogadores.Dede.Cor", Jogadores.CustonNameDede.replace("§", "&"));
                    Variables.plugin.saveConfig();
                    sender.sendMessage(Strings.prefix + "§2Cor alterada com Sucesso! §6COR");
                } else if (args[1].equalsIgnoreCase("7")) {
                    Jogadores.CustonNameDede = "§7§l";
                    Variables.plugin.getConfig().set("Jogadores.Dede.Cor", Jogadores.CustonNameDede.replace("§", "&"));
                    Variables.plugin.saveConfig();
                    sender.sendMessage(Strings.prefix + "§2Cor alterada com Sucesso! §7COR");
                } else if (args[1].equalsIgnoreCase("8")) {
                    Jogadores.CustonNameDede = "§8§l";
                    Variables.plugin.getConfig().set("Jogadores.Dede.Cor", Jogadores.CustonNameDede.replace("§", "&"));
                    Variables.plugin.saveConfig();
                    sender.sendMessage(Strings.prefix + "§2Cor alterada com Sucesso! §8COR");
                } else if (args[1].equalsIgnoreCase("9")) {
                    Jogadores.CustonNameDede = "§9§l";
                    Variables.plugin.getConfig().set("Jogadores.Dede.Cor", Jogadores.CustonNameDede.replace("§", "&"));
                    Variables.plugin.saveConfig();
                    sender.sendMessage(Strings.prefix + "§2Cor alterada com Sucesso! §9COR");
                } else if (args[1].equalsIgnoreCase("0")) {
                    Jogadores.CustonNameDede = "§0§l";
                    Variables.plugin.getConfig().set("Jogadores.Dede.Cor", Jogadores.CustonNameDede.replace("§", "&"));
                    Variables.plugin.saveConfig();
                    sender.sendMessage(Strings.prefix + "§2Cor alterada com Sucesso! §0COR");
                } else if (args[1].equalsIgnoreCase("a")) {
                    Jogadores.CustonNameDede = "§a§l";
                    Variables.plugin.getConfig().set("Jogadores.Dede.Cor", Jogadores.CustonNameDede.replace("§", "&"));
                    Variables.plugin.saveConfig();
                    sender.sendMessage(Strings.prefix + "§2Cor alterada com Sucesso! §aCOR");
                } else if (args[1].equalsIgnoreCase("b")) {
                    Jogadores.CustonNameDede = "§b§l";
                    Variables.plugin.getConfig().set("Jogadores.Dede.Cor", Jogadores.CustonNameDede.replace("§", "&"));
                    Variables.plugin.saveConfig();
                    sender.sendMessage(Strings.prefix + "§2Cor alterada com Sucesso! §bCOR");
                } else if (args[1].equalsIgnoreCase("c")) {
                    Jogadores.CustonNameDede = "§c§l";
                    Variables.plugin.getConfig().set("Jogadores.Dede.Cor", Jogadores.CustonNameDede.replace("§", "&"));
                    Variables.plugin.saveConfig();
                    sender.sendMessage(Strings.prefix + "§2Cor alterada com Sucesso! §cCOR");
                } else if (args[1].equalsIgnoreCase("d")) {
                    Jogadores.CustonNameDede = "§d§l";
                    Variables.plugin.getConfig().set("Jogadores.Dede.Cor", Jogadores.CustonNameDede.replace("§", "&"));
                    Variables.plugin.saveConfig();
                    sender.sendMessage(Strings.prefix + "§2Cor alterada com Sucesso! §dCOR");
                } else if (args[1].equalsIgnoreCase("e")) {
                    Jogadores.CustonNameDede = "§e§l";
                    Variables.plugin.getConfig().set("Jogadores.Dede.Cor", Jogadores.CustonNameDede.replace("§", "&"));
                    Variables.plugin.saveConfig();
                    sender.sendMessage(Strings.prefix + "§2Cor alterada com Sucesso! §eCOR");
                } else if (args[1].equalsIgnoreCase("f")) {
                    Jogadores.CustonNameDede = "§f§l";
                    Variables.plugin.getConfig().set("Jogadores.Dede.Cor", Jogadores.CustonNameDede.replace("§", "&"));
                    Variables.plugin.saveConfig();
                    sender.sendMessage(Strings.prefix + "§2Cor alterada com Sucesso! §fCOR");
                } else {
                    sender.sendMessage(Strings.prefix + "§cUse uma cor válida!");
                    sender.sendMessage(Strings.prefix + "§6Cores: §aA §bB §cC §dD §eE §fF §11 §22 §33 §44 §55 §66 §77 §88 §99 §00");
                    return true;
                }
            } else if (sender.getName().equalsIgnoreCase(Jogadores.Beaats)) {
                if (args[1].equalsIgnoreCase("1")) {
                    Jogadores.CustonNameBeaats = "§1§l";
                    Variables.plugin.getConfig().set("Jogadores.Beaats.Cor", Jogadores.CustonNameBeaats.replace("§", "&"));
                    Variables.plugin.saveConfig();
                    sender.sendMessage(Strings.prefix + "§2Cor alterada com Sucesso! §1COR");
                } else if (args[1].equalsIgnoreCase("2")) {
                    Jogadores.CustonNameBeaats = "§2§l";
                    Variables.plugin.getConfig().set("Jogadores.Beaats.Cor", Jogadores.CustonNameBeaats.replace("§", "&"));
                    Variables.plugin.saveConfig();
                    sender.sendMessage(Strings.prefix + "§2Cor alterada com Sucesso! §1COR");
                } else if (args[1].equalsIgnoreCase("3")) {
                    Jogadores.CustonNameBeaats = "§3§l";
                    Variables.plugin.getConfig().set("Jogadores.Beaats.Cor", Jogadores.CustonNameBeaats.replace("§", "&"));
                    Variables.plugin.saveConfig();
                    sender.sendMessage(Strings.prefix + "§2Cor alterada com Sucesso! §3COR");
                } else if (args[1].equalsIgnoreCase("4")) {
                    Jogadores.CustonNameBeaats = "§4§l";
                    Variables.plugin.getConfig().set("Jogadores.Beaats.Cor", Jogadores.CustonNameBeaats.replace("§", "&"));
                    Variables.plugin.saveConfig();
                    sender.sendMessage(Strings.prefix + "§2Cor alterada com Sucesso! §4COR");
                } else if (args[1].equalsIgnoreCase("5")) {
                    Jogadores.CustonNameBeaats = "§5§l";
                    Variables.plugin.getConfig().set("Jogadores.Beaats.Cor", Jogadores.CustonNameBeaats.replace("§", "&"));
                    Variables.plugin.saveConfig();
                    sender.sendMessage(Strings.prefix + "§2Cor alterada com Sucesso! §5COR");
                } else if (args[1].equalsIgnoreCase("6")) {
                    Jogadores.CustonNameBeaats = "§6§l";
                    Variables.plugin.getConfig().set("Jogadores.Beaats.Cor", Jogadores.CustonNameBeaats.replace("§", "&"));
                    Variables.plugin.saveConfig();
                    sender.sendMessage(Strings.prefix + "§2Cor alterada com Sucesso! §6COR");
                } else if (args[1].equalsIgnoreCase("7")) {
                    Jogadores.CustonNameBeaats = "§7§l";
                    Variables.plugin.getConfig().set("Jogadores.Beaats.Cor", Jogadores.CustonNameBeaats.replace("§", "&"));
                    Variables.plugin.saveConfig();
                    sender.sendMessage(Strings.prefix + "§2Cor alterada com Sucesso! §7COR");
                } else if (args[1].equalsIgnoreCase("8")) {
                    Jogadores.CustonNameBeaats = "§8§l";
                    Variables.plugin.getConfig().set("Jogadores.Beaats.Cor", Jogadores.CustonNameBeaats.replace("§", "&"));
                    Variables.plugin.saveConfig();
                    sender.sendMessage(Strings.prefix + "§2Cor alterada com Sucesso! §8COR");
                } else if (args[1].equalsIgnoreCase("9")) {
                    Jogadores.CustonNameBeaats = "§9§l";
                    Variables.plugin.getConfig().set("Jogadores.Beaats.Cor", Jogadores.CustonNameBeaats.replace("§", "&"));
                    Variables.plugin.saveConfig();
                    sender.sendMessage(Strings.prefix + "§2Cor alterada com Sucesso! §9COR");
                } else if (args[1].equalsIgnoreCase("0")) {
                    Jogadores.CustonNameBeaats = "§0§l";
                    Variables.plugin.getConfig().set("Jogadores.Beaats.Cor", Jogadores.CustonNameBeaats.replace("§", "&"));
                    Variables.plugin.saveConfig();
                    sender.sendMessage(Strings.prefix + "§2Cor alterada com Sucesso! §0COR");
                } else if (args[1].equalsIgnoreCase("a")) {
                    Jogadores.CustonNameBeaats = "§a§l";
                    Variables.plugin.getConfig().set("Jogadores.Beaats.Cor", Jogadores.CustonNameBeaats.replace("§", "&"));
                    Variables.plugin.saveConfig();
                    sender.sendMessage(Strings.prefix + "§2Cor alterada com Sucesso! §aCOR");
                } else if (args[1].equalsIgnoreCase("b")) {
                    Jogadores.CustonNameBeaats = "§b§l";
                    Variables.plugin.getConfig().set("Jogadores.Beaats.Cor", Jogadores.CustonNameBeaats.replace("§", "&"));
                    Variables.plugin.saveConfig();
                    sender.sendMessage(Strings.prefix + "§2Cor alterada com Sucesso! §bCOR");
                } else if (args[1].equalsIgnoreCase("c")) {
                    Jogadores.CustonNameBeaats = "§c§l";
                    Variables.plugin.getConfig().set("Jogadores.Beaats.Cor", Jogadores.CustonNameBeaats.replace("§", "&"));
                    Variables.plugin.saveConfig();
                    sender.sendMessage(Strings.prefix + "§2Cor alterada com Sucesso! §cCOR");
                } else if (args[1].equalsIgnoreCase("d")) {
                    Jogadores.CustonNameBeaats = "§d§l";
                    Variables.plugin.getConfig().set("Jogadores.Beaats.Cor", Jogadores.CustonNameBeaats.replace("§", "&"));
                    Variables.plugin.saveConfig();
                    sender.sendMessage(Strings.prefix + "§2Cor alterada com Sucesso! §dCOR");
                } else if (args[1].equalsIgnoreCase("e")) {
                    Jogadores.CustonNameBeaats = "§e§l";
                    Variables.plugin.getConfig().set("Jogadores.Beaats.Cor", Jogadores.CustonNameBeaats.replace("§", "&"));
                    Variables.plugin.saveConfig();
                    sender.sendMessage(Strings.prefix + "§2Cor alterada com Sucesso! §eCOR");
                } else if (args[1].equalsIgnoreCase("f")) {
                    Jogadores.CustonNameBeaats = "§f§l";
                    Variables.plugin.getConfig().set("Jogadores.Beaats.Cor", Jogadores.CustonNameBeaats.replace("§", "&"));
                    Variables.plugin.saveConfig();
                    sender.sendMessage(Strings.prefix + "§2Cor alterada com Sucesso! §fCOR");
                } else {
                    sender.sendMessage(Strings.prefix + "§cUse uma cor válida!");
                    sender.sendMessage(Strings.prefix + "§6Cores: §aA §bB §cC §dD §eE §fF §11 §22 §33 §44 §55 §66 §77 §88 §99 §00");
                    return true;
                }
            } else if (sender.getName().equalsIgnoreCase(Jogadores.Biidu)) {
                if (args[1].equalsIgnoreCase("1")) {
                    Jogadores.CustonNameBiidu = "§1§l";
                    Variables.plugin.getConfig().set("Jogadores.Biidu.Cor", Jogadores.CustonNameBiidu.replace("§", "&"));
                    Variables.plugin.saveConfig();
                    sender.sendMessage(Strings.prefix + "§2Cor alterada com Sucesso! §1COR");
                } else if (args[1].equalsIgnoreCase("2")) {
                    Jogadores.CustonNameBiidu = "§2§l";
                    Variables.plugin.getConfig().set("Jogadores.Biidu.Cor", Jogadores.CustonNameBiidu.replace("§", "&"));
                    Variables.plugin.saveConfig();
                    sender.sendMessage(Strings.prefix + "§2Cor alterada com Sucesso! §1COR");
                } else if (args[1].equalsIgnoreCase("3")) {
                    Jogadores.CustonNameBiidu = "§3§l";
                    Variables.plugin.getConfig().set("Jogadores.Biidu.Cor", Jogadores.CustonNameBiidu.replace("§", "&"));
                    Variables.plugin.saveConfig();
                    sender.sendMessage(Strings.prefix + "§2Cor alterada com Sucesso! §3COR");
                } else if (args[1].equalsIgnoreCase("4")) {
                    Jogadores.CustonNameBiidu = "§4§l";
                    Variables.plugin.getConfig().set("Jogadores.Biidu.Cor", Jogadores.CustonNameBiidu.replace("§", "&"));
                    Variables.plugin.saveConfig();
                    sender.sendMessage(Strings.prefix + "§2Cor alterada com Sucesso! §4COR");
                } else if (args[1].equalsIgnoreCase("5")) {
                    Jogadores.CustonNameBiidu = "§5§l";
                    Variables.plugin.getConfig().set("Jogadores.Biidu.Cor", Jogadores.CustonNameBiidu.replace("§", "&"));
                    Variables.plugin.saveConfig();
                    sender.sendMessage(Strings.prefix + "§2Cor alterada com Sucesso! §5COR");
                } else if (args[1].equalsIgnoreCase("6")) {
                    Jogadores.CustonNameBiidu = "§6§l";
                    Variables.plugin.getConfig().set("Jogadores.Biidu.Cor", Jogadores.CustonNameBiidu.replace("§", "&"));
                    Variables.plugin.saveConfig();
                    sender.sendMessage(Strings.prefix + "§2Cor alterada com Sucesso! §6COR");
                } else if (args[1].equalsIgnoreCase("7")) {
                    Jogadores.CustonNameBiidu = "§7§l";
                    Variables.plugin.getConfig().set("Jogadores.Biidu.Cor", Jogadores.CustonNameBiidu.replace("§", "&"));
                    Variables.plugin.saveConfig();
                    sender.sendMessage(Strings.prefix + "§2Cor alterada com Sucesso! §7COR");
                } else if (args[1].equalsIgnoreCase("8")) {
                    Jogadores.CustonNameBiidu = "§8§l";
                    Variables.plugin.getConfig().set("Jogadores.Biidu.Cor", Jogadores.CustonNameBiidu.replace("§", "&"));
                    Variables.plugin.saveConfig();
                    sender.sendMessage(Strings.prefix + "§2Cor alterada com Sucesso! §8COR");
                } else if (args[1].equalsIgnoreCase("9")) {
                    Jogadores.CustonNameBiidu = "§9§l";
                    Variables.plugin.getConfig().set("Jogadores.Biidu.Cor", Jogadores.CustonNameBiidu.replace("§", "&"));
                    Variables.plugin.saveConfig();
                    sender.sendMessage(Strings.prefix + "§2Cor alterada com Sucesso! §9COR");
                } else if (args[1].equalsIgnoreCase("0")) {
                    Jogadores.CustonNameBiidu = "§0§l";
                    Variables.plugin.getConfig().set("Jogadores.Biidu.Cor", Jogadores.CustonNameBiidu.replace("§", "&"));
                    Variables.plugin.saveConfig();
                    sender.sendMessage(Strings.prefix + "§2Cor alterada com Sucesso! §0COR");
                } else if (args[1].equalsIgnoreCase("a")) {
                    Jogadores.CustonNameBiidu = "§a§l";
                    Variables.plugin.getConfig().set("Jogadores.Biidu.Cor", Jogadores.CustonNameBiidu.replace("§", "&"));
                    Variables.plugin.saveConfig();
                    sender.sendMessage(Strings.prefix + "§2Cor alterada com Sucesso! §aCOR");
                } else if (args[1].equalsIgnoreCase("b")) {
                    Jogadores.CustonNameBiidu = "§b§l";
                    Variables.plugin.getConfig().set("Jogadores.Biidu.Cor", Jogadores.CustonNameBiidu.replace("§", "&"));
                    Variables.plugin.saveConfig();
                    sender.sendMessage(Strings.prefix + "§2Cor alterada com Sucesso! §bCOR");
                } else if (args[1].equalsIgnoreCase("c")) {
                    Jogadores.CustonNameBiidu = "§c§l";
                    Variables.plugin.getConfig().set("Jogadores.Biidu.Cor", Jogadores.CustonNameBiidu.replace("§", "&"));
                    Variables.plugin.saveConfig();
                    sender.sendMessage(Strings.prefix + "§2Cor alterada com Sucesso! §cCOR");
                } else if (args[1].equalsIgnoreCase("d")) {
                    Jogadores.CustonNameBiidu = "§d§l";
                    Variables.plugin.getConfig().set("Jogadores.Biidu.Cor", Jogadores.CustonNameBiidu.replace("§", "&"));
                    Variables.plugin.saveConfig();
                    sender.sendMessage(Strings.prefix + "§2Cor alterada com Sucesso! §dCOR");
                } else if (args[1].equalsIgnoreCase("e")) {
                    Jogadores.CustonNameBiidu = "§e§l";
                    Variables.plugin.getConfig().set("Jogadores.Biidu.Cor", Jogadores.CustonNameBiidu.replace("§", "&"));
                    Variables.plugin.saveConfig();
                    sender.sendMessage(Strings.prefix + "§2Cor alterada com Sucesso! §eCOR");
                } else if (args[1].equalsIgnoreCase("f")) {
                    Jogadores.CustonNameBiidu = "§f§l";
                    Variables.plugin.getConfig().set("Jogadores.Biidu.Cor", Jogadores.CustonNameBiidu.replace("§", "&"));
                    Variables.plugin.saveConfig();
                    sender.sendMessage(Strings.prefix + "§2Cor alterada com Sucesso! §fCOR");
                } else {
                    sender.sendMessage(Strings.prefix + "§cUse uma cor válida!");
                    sender.sendMessage(Strings.prefix + "§6Cores: §aA §bB §cC §dD §eE §fF §11 §22 §33 §44 §55 §66 §77 §88 §99 §00");
                    return true;
                }
            } else if (sender.getName().equalsIgnoreCase(Jogadores.Keroch)) {
                if (args[1].equalsIgnoreCase("1")) {
                    Jogadores.CustonNameKeroch = "§1§l";
                    Variables.plugin.getConfig().set("Jogadores.Keroch.Cor", Jogadores.CustonNameKeroch.replace("§", "&"));
                    Variables.plugin.saveConfig();
                    sender.sendMessage(Strings.prefix + "§2Cor alterada com Sucesso! §1COR");
                } else if (args[1].equalsIgnoreCase("2")) {
                    Jogadores.CustonNameKeroch = "§2§l";
                    Variables.plugin.getConfig().set("Jogadores.Keroch.Cor", Jogadores.CustonNameKeroch.replace("§", "&"));
                    Variables.plugin.saveConfig();
                    sender.sendMessage(Strings.prefix + "§2Cor alterada com Sucesso! §1COR");
                } else if (args[1].equalsIgnoreCase("3")) {
                    Jogadores.CustonNameKeroch = "§3§l";
                    Variables.plugin.getConfig().set("Jogadores.Keroch.Cor", Jogadores.CustonNameKeroch.replace("§", "&"));
                    Variables.plugin.saveConfig();
                    sender.sendMessage(Strings.prefix + "§2Cor alterada com Sucesso! §3COR");
                } else if (args[1].equalsIgnoreCase("4")) {
                    Jogadores.CustonNameKeroch = "§4§l";
                    Variables.plugin.getConfig().set("Jogadores.Keroch.Cor", Jogadores.CustonNameKeroch.replace("§", "&"));
                    Variables.plugin.saveConfig();
                    sender.sendMessage(Strings.prefix + "§2Cor alterada com Sucesso! §4COR");
                } else if (args[1].equalsIgnoreCase("5")) {
                    Jogadores.CustonNameKeroch = "§5§l";
                    Variables.plugin.getConfig().set("Jogadores.Keroch.Cor", Jogadores.CustonNameKeroch.replace("§", "&"));
                    Variables.plugin.saveConfig();
                    sender.sendMessage(Strings.prefix + "§2Cor alterada com Sucesso! §5COR");
                } else if (args[1].equalsIgnoreCase("6")) {
                    Jogadores.CustonNameKeroch = "§6§l";
                    Variables.plugin.getConfig().set("Jogadores.Keroch.Cor", Jogadores.CustonNameKeroch.replace("§", "&"));
                    Variables.plugin.saveConfig();
                    sender.sendMessage(Strings.prefix + "§2Cor alterada com Sucesso! §6COR");
                } else if (args[1].equalsIgnoreCase("7")) {
                    Jogadores.CustonNameKeroch = "§7§l";
                    Variables.plugin.getConfig().set("Jogadores.Keroch.Cor", Jogadores.CustonNameKeroch.replace("§", "&"));
                    Variables.plugin.saveConfig();
                    sender.sendMessage(Strings.prefix + "§2Cor alterada com Sucesso! §7COR");
                } else if (args[1].equalsIgnoreCase("8")) {
                    Jogadores.CustonNameKeroch = "§8§l";
                    Variables.plugin.getConfig().set("Jogadores.Keroch.Cor", Jogadores.CustonNameKeroch.replace("§", "&"));
                    Variables.plugin.saveConfig();
                    sender.sendMessage(Strings.prefix + "§2Cor alterada com Sucesso! §8COR");
                } else if (args[1].equalsIgnoreCase("9")) {
                    Jogadores.CustonNameKeroch = "§9§l";
                    Variables.plugin.getConfig().set("Jogadores.Keroch.Cor", Jogadores.CustonNameKeroch.replace("§", "&"));
                    Variables.plugin.saveConfig();
                    sender.sendMessage(Strings.prefix + "§2Cor alterada com Sucesso! §9COR");
                } else if (args[1].equalsIgnoreCase("0")) {
                    Jogadores.CustonNameKeroch = "§0§l";
                    Variables.plugin.getConfig().set("Jogadores.Keroch.Cor", Jogadores.CustonNameKeroch.replace("§", "&"));
                    Variables.plugin.saveConfig();
                    sender.sendMessage(Strings.prefix + "§2Cor alterada com Sucesso! §0COR");
                } else if (args[1].equalsIgnoreCase("a")) {
                    Jogadores.CustonNameKeroch = "§a§l";
                    Variables.plugin.getConfig().set("Jogadores.Keroch.Cor", Jogadores.CustonNameKeroch.replace("§", "&"));
                    Variables.plugin.saveConfig();
                    sender.sendMessage(Strings.prefix + "§2Cor alterada com Sucesso! §aCOR");
                } else if (args[1].equalsIgnoreCase("b")) {
                    Jogadores.CustonNameKeroch = "§b§l";
                    Variables.plugin.getConfig().set("Jogadores.Keroch.Cor", Jogadores.CustonNameKeroch.replace("§", "&"));
                    Variables.plugin.saveConfig();
                    sender.sendMessage(Strings.prefix + "§2Cor alterada com Sucesso! §bCOR");
                } else if (args[1].equalsIgnoreCase("c")) {
                    Jogadores.CustonNameKeroch = "§c§l";
                    Variables.plugin.getConfig().set("Jogadores.Keroch.Cor", Jogadores.CustonNameKeroch.replace("§", "&"));
                    Variables.plugin.saveConfig();
                    sender.sendMessage(Strings.prefix + "§2Cor alterada com Sucesso! §cCOR");
                } else if (args[1].equalsIgnoreCase("d")) {
                    Jogadores.CustonNameKeroch = "§d§l";
                    Variables.plugin.getConfig().set("Jogadores.Keroch.Cor", Jogadores.CustonNameKeroch.replace("§", "&"));
                    Variables.plugin.saveConfig();
                    sender.sendMessage(Strings.prefix + "§2Cor alterada com Sucesso! §dCOR");
                } else if (args[1].equalsIgnoreCase("e")) {
                    Jogadores.CustonNameKeroch = "§e§l";
                    Variables.plugin.getConfig().set("Jogadores.Keroch.Cor", Jogadores.CustonNameKeroch.replace("§", "&"));
                    Variables.plugin.saveConfig();
                    sender.sendMessage(Strings.prefix + "§2Cor alterada com Sucesso! §eCOR");
                } else if (args[1].equalsIgnoreCase("f")) {
                    Jogadores.CustonNameKeroch = "§f§l";
                    Variables.plugin.getConfig().set("Jogadores.Keroch.Cor", Jogadores.CustonNameKeroch.replace("§", "&"));
                    Variables.plugin.saveConfig();
                    sender.sendMessage(Strings.prefix + "§2Cor alterada com Sucesso! §fCOR");
                } else {
                    sender.sendMessage(Strings.prefix + "§cUse uma cor válida!");
                    sender.sendMessage(Strings.prefix + "§6Cores: §aA §bB §cC §dD §eE §fF §11 §22 §33 §44 §55 §66 §77 §88 §99 §00");
                    return true;
                }
            } else if (sender.getName().equalsIgnoreCase(Jogadores.FelipeHeroPlay)) {
                if (args[1].equalsIgnoreCase("1")) {
                    Jogadores.CustonNameFelipeHeroPlay = "§1§l";
                    Variables.plugin.getConfig().set("Jogadores.FelipeHeroPlay.Cor", Jogadores.CustonNameFelipeHeroPlay.replace("§", "&"));
                    Variables.plugin.saveConfig();
                    sender.sendMessage(Strings.prefix + "§2Cor alterada com Sucesso! §1COR");
                } else if (args[1].equalsIgnoreCase("2")) {
                    Jogadores.CustonNameFelipeHeroPlay = "§2§l";
                    Variables.plugin.getConfig().set("Jogadores.FelipeHeroPlay.Cor", Jogadores.CustonNameFelipeHeroPlay.replace("§", "&"));
                    Variables.plugin.saveConfig();
                    sender.sendMessage(Strings.prefix + "§2Cor alterada com Sucesso! §1COR");
                } else if (args[1].equalsIgnoreCase("3")) {
                    Jogadores.CustonNameFelipeHeroPlay = "§3§l";
                    Variables.plugin.getConfig().set("Jogadores.FelipeHeroPlay.Cor", Jogadores.CustonNameFelipeHeroPlay.replace("§", "&"));
                    Variables.plugin.saveConfig();
                    sender.sendMessage(Strings.prefix + "§2Cor alterada com Sucesso! §3COR");
                } else if (args[1].equalsIgnoreCase("4")) {
                    Jogadores.CustonNameFelipeHeroPlay = "§4§l";
                    Variables.plugin.getConfig().set("Jogadores.FelipeHeroPlay.Cor", Jogadores.CustonNameFelipeHeroPlay.replace("§", "&"));
                    Variables.plugin.saveConfig();
                    sender.sendMessage(Strings.prefix + "§2Cor alterada com Sucesso! §4COR");
                } else if (args[1].equalsIgnoreCase("5")) {
                    Jogadores.CustonNameFelipeHeroPlay = "§5§l";
                    Variables.plugin.getConfig().set("Jogadores.FelipeHeroPlay.Cor", Jogadores.CustonNameFelipeHeroPlay.replace("§", "&"));
                    Variables.plugin.saveConfig();
                    sender.sendMessage(Strings.prefix + "§2Cor alterada com Sucesso! §5COR");
                } else if (args[1].equalsIgnoreCase("6")) {
                    Jogadores.CustonNameFelipeHeroPlay = "§6§l";
                    Variables.plugin.getConfig().set("Jogadores.FelipeHeroPlay.Cor", Jogadores.CustonNameFelipeHeroPlay.replace("§", "&"));
                    Variables.plugin.saveConfig();
                    sender.sendMessage(Strings.prefix + "§2Cor alterada com Sucesso! §6COR");
                } else if (args[1].equalsIgnoreCase("7")) {
                    Jogadores.CustonNameFelipeHeroPlay = "§7§l";
                    Variables.plugin.getConfig().set("Jogadores.FelipeHeroPlay.Cor", Jogadores.CustonNameFelipeHeroPlay.replace("§", "&"));
                    Variables.plugin.saveConfig();
                    sender.sendMessage(Strings.prefix + "§2Cor alterada com Sucesso! §7COR");
                } else if (args[1].equalsIgnoreCase("8")) {
                    Jogadores.CustonNameFelipeHeroPlay = "§8§l";
                    Variables.plugin.getConfig().set("Jogadores.FelipeHeroPlay.Cor", Jogadores.CustonNameFelipeHeroPlay.replace("§", "&"));
                    Variables.plugin.saveConfig();
                    sender.sendMessage(Strings.prefix + "§2Cor alterada com Sucesso! §8COR");
                } else if (args[1].equalsIgnoreCase("9")) {
                    Jogadores.CustonNameFelipeHeroPlay = "§9§l";
                    Variables.plugin.getConfig().set("Jogadores.FelipeHeroPlay.Cor", Jogadores.CustonNameFelipeHeroPlay.replace("§", "&"));
                    Variables.plugin.saveConfig();
                    sender.sendMessage(Strings.prefix + "§2Cor alterada com Sucesso! §9COR");
                } else if (args[1].equalsIgnoreCase("0")) {
                    Jogadores.CustonNameFelipeHeroPlay = "§0§l";
                    Variables.plugin.getConfig().set("Jogadores.FelipeHeroPlay.Cor", Jogadores.CustonNameFelipeHeroPlay.replace("§", "&"));
                    Variables.plugin.saveConfig();
                    sender.sendMessage(Strings.prefix + "§2Cor alterada com Sucesso! §0COR");
                } else if (args[1].equalsIgnoreCase("a")) {
                    Jogadores.CustonNameFelipeHeroPlay = "§a§l";
                    Variables.plugin.getConfig().set("Jogadores.FelipeHeroPlay.Cor", Jogadores.CustonNameFelipeHeroPlay.replace("§", "&"));
                    Variables.plugin.saveConfig();
                    sender.sendMessage(Strings.prefix + "§2Cor alterada com Sucesso! §aCOR");
                } else if (args[1].equalsIgnoreCase("b")) {
                    Jogadores.CustonNameFelipeHeroPlay = "§b§l";
                    Variables.plugin.getConfig().set("Jogadores.FelipeHeroPlay.Cor", Jogadores.CustonNameFelipeHeroPlay.replace("§", "&"));
                    Variables.plugin.saveConfig();
                    sender.sendMessage(Strings.prefix + "§2Cor alterada com Sucesso! §bCOR");
                } else if (args[1].equalsIgnoreCase("c")) {
                    Jogadores.CustonNameFelipeHeroPlay = "§c§l";
                    Variables.plugin.getConfig().set("Jogadores.FelipeHeroPlay.Cor", Jogadores.CustonNameFelipeHeroPlay.replace("§", "&"));
                    Variables.plugin.saveConfig();
                    sender.sendMessage(Strings.prefix + "§2Cor alterada com Sucesso! §cCOR");
                } else if (args[1].equalsIgnoreCase("d")) {
                    Jogadores.CustonNameFelipeHeroPlay = "§d§l";
                    Variables.plugin.getConfig().set("Jogadores.FelipeHeroPlay.Cor", Jogadores.CustonNameFelipeHeroPlay.replace("§", "&"));
                    Variables.plugin.saveConfig();
                    sender.sendMessage(Strings.prefix + "§2Cor alterada com Sucesso! §dCOR");
                } else if (args[1].equalsIgnoreCase("e")) {
                    Jogadores.CustonNameFelipeHeroPlay = "§e§l";
                    Variables.plugin.getConfig().set("Jogadores.FelipeHeroPlay.Cor", Jogadores.CustonNameFelipeHeroPlay.replace("§", "&"));
                    Variables.plugin.saveConfig();
                    sender.sendMessage(Strings.prefix + "§2Cor alterada com Sucesso! §eCOR");
                } else if (args[1].equalsIgnoreCase("f")) {
                    Jogadores.CustonNameFelipeHeroPlay = "§f§l";
                    Variables.plugin.getConfig().set("Jogadores.FelipeHeroPlay.Cor", Jogadores.CustonNameFelipeHeroPlay.replace("§", "&"));
                    Variables.plugin.saveConfig();
                    sender.sendMessage(Strings.prefix + "§2Cor alterada com Sucesso! §fCOR");
                } else {
                    sender.sendMessage(Strings.prefix + "§cUse uma cor válida!");
                    sender.sendMessage(Strings.prefix + "§6Cores: §aA §bB §cC §dD §eE §fF §11 §22 §33 §44 §55 §66 §77 §88 §99 §00");
                    return true;
                }
            } else if (sender.getName().equalsIgnoreCase(Jogadores.Mariao)) {
                if (args[1].equalsIgnoreCase("1")) {
                    Jogadores.CustonNameMariao = "§1§l";
                    Variables.plugin.getConfig().set("Jogadores.Mariao.Cor", Jogadores.CustonNameMariao.replace("§", "&"));
                    Variables.plugin.saveConfig();
                    sender.sendMessage(Strings.prefix + "§2Cor alterada com Sucesso! §1COR");
                } else if (args[1].equalsIgnoreCase("2")) {
                    Jogadores.CustonNameMariao = "§2§l";
                    Variables.plugin.getConfig().set("Jogadores.Mariao.Cor", Jogadores.CustonNameMariao.replace("§", "&"));
                    Variables.plugin.saveConfig();
                    sender.sendMessage(Strings.prefix + "§2Cor alterada com Sucesso! §1COR");
                } else if (args[1].equalsIgnoreCase("3")) {
                    Jogadores.CustonNameMariao = "§3§l";
                    Variables.plugin.getConfig().set("Jogadores.Mariao.Cor", Jogadores.CustonNameMariao.replace("§", "&"));
                    Variables.plugin.saveConfig();
                    sender.sendMessage(Strings.prefix + "§2Cor alterada com Sucesso! §3COR");
                } else if (args[1].equalsIgnoreCase("4")) {
                    Jogadores.CustonNameMariao = "§4§l";
                    Variables.plugin.getConfig().set("Jogadores.Mariao.Cor", Jogadores.CustonNameMariao.replace("§", "&"));
                    Variables.plugin.saveConfig();
                    sender.sendMessage(Strings.prefix + "§2Cor alterada com Sucesso! §4COR");
                } else if (args[1].equalsIgnoreCase("5")) {
                    Jogadores.CustonNameMariao = "§5§l";
                    Variables.plugin.getConfig().set("Jogadores.Mariao.Cor", Jogadores.CustonNameMariao.replace("§", "&"));
                    Variables.plugin.saveConfig();
                    sender.sendMessage(Strings.prefix + "§2Cor alterada com Sucesso! §5COR");
                } else if (args[1].equalsIgnoreCase("6")) {
                    Jogadores.CustonNameMariao = "§6§l";
                    Variables.plugin.getConfig().set("Jogadores.Mariao.Cor", Jogadores.CustonNameMariao.replace("§", "&"));
                    Variables.plugin.saveConfig();
                    sender.sendMessage(Strings.prefix + "§2Cor alterada com Sucesso! §6COR");
                } else if (args[1].equalsIgnoreCase("7")) {
                    Jogadores.CustonNameMariao = "§7§l";
                    Variables.plugin.getConfig().set("Jogadores.Mariao.Cor", Jogadores.CustonNameMariao.replace("§", "&"));
                    Variables.plugin.saveConfig();
                    sender.sendMessage(Strings.prefix + "§2Cor alterada com Sucesso! §7COR");
                } else if (args[1].equalsIgnoreCase("8")) {
                    Jogadores.CustonNameMariao = "§8§l";
                    Variables.plugin.getConfig().set("Jogadores.Mariao.Cor", Jogadores.CustonNameMariao.replace("§", "&"));
                    Variables.plugin.saveConfig();
                    sender.sendMessage(Strings.prefix + "§2Cor alterada com Sucesso! §8COR");
                } else if (args[1].equalsIgnoreCase("9")) {
                    Jogadores.CustonNameMariao = "§9§l";
                    Variables.plugin.getConfig().set("Jogadores.Mariao.Cor", Jogadores.CustonNameMariao.replace("§", "&"));
                    Variables.plugin.saveConfig();
                    sender.sendMessage(Strings.prefix + "§2Cor alterada com Sucesso! §9COR");
                } else if (args[1].equalsIgnoreCase("0")) {
                    Jogadores.CustonNameMariao = "§0§l";
                    Variables.plugin.getConfig().set("Jogadores.Mariao.Cor", Jogadores.CustonNameMariao.replace("§", "&"));
                    Variables.plugin.saveConfig();
                    sender.sendMessage(Strings.prefix + "§2Cor alterada com Sucesso! §0COR");
                } else if (args[1].equalsIgnoreCase("a")) {
                    Jogadores.CustonNameMariao = "§a§l";
                    Variables.plugin.getConfig().set("Jogadores.Mariao.Cor", Jogadores.CustonNameMariao.replace("§", "&"));
                    Variables.plugin.saveConfig();
                    sender.sendMessage(Strings.prefix + "§2Cor alterada com Sucesso! §aCOR");
                } else if (args[1].equalsIgnoreCase("b")) {
                    Jogadores.CustonNameMariao = "§b§l";
                    Variables.plugin.getConfig().set("Jogadores.Mariao.Cor", Jogadores.CustonNameMariao.replace("§", "&"));
                    Variables.plugin.saveConfig();
                    sender.sendMessage(Strings.prefix + "§2Cor alterada com Sucesso! §bCOR");
                } else if (args[1].equalsIgnoreCase("c")) {
                    Jogadores.CustonNameMariao = "§c§l";
                    Variables.plugin.getConfig().set("Jogadores.Mariao.Cor", Jogadores.CustonNameMariao.replace("§", "&"));
                    Variables.plugin.saveConfig();
                    sender.sendMessage(Strings.prefix + "§2Cor alterada com Sucesso! §cCOR");
                } else if (args[1].equalsIgnoreCase("d")) {
                    Jogadores.CustonNameMariao = "§d§l";
                    Variables.plugin.getConfig().set("Jogadores.Mariao.Cor", Jogadores.CustonNameMariao.replace("§", "&"));
                    Variables.plugin.saveConfig();
                    sender.sendMessage(Strings.prefix + "§2Cor alterada com Sucesso! §dCOR");
                } else if (args[1].equalsIgnoreCase("e")) {
                    Jogadores.CustonNameMariao = "§e§l";
                    Variables.plugin.getConfig().set("Jogadores.Mariao.Cor", Jogadores.CustonNameMariao.replace("§", "&"));
                    Variables.plugin.saveConfig();
                    sender.sendMessage(Strings.prefix + "§2Cor alterada com Sucesso! §eCOR");
                } else if (args[1].equalsIgnoreCase("f")) {
                    Jogadores.CustonNameMariao = "§f§l";
                    Variables.plugin.getConfig().set("Jogadores.Mariao.Cor", Jogadores.CustonNameMariao.replace("§", "&"));
                    Variables.plugin.saveConfig();
                    sender.sendMessage(Strings.prefix + "§2Cor alterada com Sucesso! §fCOR");
                } else {
                    sender.sendMessage(Strings.prefix + "§cUse uma cor válida!");
                    sender.sendMessage(Strings.prefix + "§6Cores: §aA §bB §cC §dD §eE §fF §11 §22 §33 §44 §55 §66 §77 §88 §99 §00");
                    return true;
                }
            } else {
                sender.sendMessage(Strings.prefix + "§cVocê não está registrado no plugin!");
                return true;
            }
        }

        return false;
    }

}
