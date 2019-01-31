package br.com.introgamer.mapmeel.listeners;

import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.block.Sign;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.block.SignChangeEvent;
import org.bukkit.event.player.PlayerInteractEvent;

import br.com.introgamer.mapmeel.variables.ItemStacks;
import br.com.introgamer.mapmeel.variables.Jogadores;
import br.com.introgamer.mapmeel.variables.Strings;
import br.com.introgamer.mapmeel.variables.Variables;

public class SignEventsListener implements Listener {

    @EventHandler
    public void onPlayerClickSign(PlayerInteractEvent e) {
        try {
            if (e.getAction() == Action.RIGHT_CLICK_BLOCK && e.getClickedBlock() != null) {
                if (e.getPlayer().getItemInHand().getType() == Material.MUSHROOM_SOUP) {
                    if (e.getPlayer().getGameMode() == GameMode.CREATIVE || e.getPlayer().getGameMode() == GameMode.SPECTATOR) {
                        return;
                    }
                    if (e.getAction() == Action.PHYSICAL) {
                        return;
                    }

                    ItemStacks.PoteMeta.setDisplayName(Strings.RecraftNome);

                    if (e.getPlayer().getHealth() == 20) {
                        e.setCancelled(true);
                        return;
                    } else if (e.getPlayer().getHealth() < 14) {
                        e.getPlayer().setHealth(e.getPlayer().getHealth() + 7);
                        e.setCancelled(true);
                        e.getPlayer().getItemInHand().setItemMeta(ItemStacks.PoteMeta);
                        e.getPlayer().getItemInHand().setType(Material.BOWL);
                    } else {
                        e.getPlayer().setHealth(20);
                        e.setCancelled(true);
                        e.getPlayer().getItemInHand().setType(Material.BOWL);
                    }

                    e.getPlayer().setFoodLevel(20);
                }

                if (e.getClickedBlock().getType() == Material.WALL_SIGN || e.getClickedBlock().getType() == Material.SIGN_POST) {
                    Sign s = (Sign) e.getClickedBlock().getState();

                    String[] lines = s.getLines();
                    if (lines[0].equalsIgnoreCase(Strings.Mapa)) {
                        if (lines[1].equalsIgnoreCase("§aCompra")) {
                            if (lines[2].isEmpty()) {
                                e.getPlayer().sendMessage(Strings.prefix + "§cNão há nenhum item registrado nessa placa!");
                                return;
                            }
                            if (lines[3].isEmpty()) {
                                e.getPlayer().sendMessage(Strings.prefix + "§cNão há nenhum preço registrado nessa placa!");
                                return;
                            }
                            double preco = Double.parseDouble(lines[3]);
                            if (Variables.Dinheiro < preco) {
                                e.getPlayer().sendMessage(Strings.prefix + "§cVocê não tem Money suficiente para isso!");
                                return;
                            }

                            Variables.Dinheiro = Variables.Dinheiro - preco;

                            ArrayList<String> Lore = new ArrayList<>();
                            Lore.add("§7Guarde este item em um local seguro!");
                            Lore.add("§7Você pode usar isto para");
                            Lore.add("§7Desbloquear algo depois...");
                            Lore.add(" ");

                            if (lines[2].equalsIgnoreCase("§lItemSecreto1")) {
                                ItemStacks.ItemSecretoMeta.setDisplayName("§f§lItem Secreto #1");
                                Lore.add("§7Código: 'TP 20'");
                                Lore.add(" ");
                                Lore.add("§7Item Secretos Encontrados: 1/3");
                                ItemStacks.ItemSecretoMeta.setLore(Lore);
                                ItemStacks.ItemSecreto.setItemMeta(ItemStacks.ItemSecretoMeta);

                                e.getPlayer().getInventory().addItem(ItemStacks.ItemSecreto);

                                e.getPlayer().sendMessage(Strings.prefix + "§f§l§oITEM SECRETO COMPRADO! §a" + preco + " de Money foi removido da sua conta com Sucesso!");
                                Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "playsound random.levelup @a -1662 50 639 50000 1");
                            } else if (lines[2].equalsIgnoreCase("§lItemSecreto2")) {
                                ItemStacks.ItemSecretoMeta.setDisplayName("§f§lItem Secreto #2");
                                Lore.add("§7Código: ' 11 '");
                                Lore.add(" ");
                                Lore.add("§7Item Secretos Encontrados: 2/3");
                                ItemStacks.ItemSecretoMeta.setLore(Lore);
                                ItemStacks.ItemSecreto.setItemMeta(ItemStacks.ItemSecretoMeta);

                                e.getPlayer().getInventory().addItem(ItemStacks.ItemSecreto);

                                e.getPlayer().sendMessage(Strings.prefix + "§f§l§oITEM SECRETO COMPRADO! §a" + preco + " de Money foi removido da sua conta com Sucesso!");
                                Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "playsound random.levelup @a -1662 50 639 50000 1");
                            } else if (lines[2].equalsIgnoreCase("§lItemSecreto3")) {
                                ItemStacks.ItemSecretoMeta.setDisplayName("§f§lItem Secreto #3");
                                Lore.add("§7Código: ' 2014'");
                                Lore.add(" ");
                                Lore.add("§7Item Secretos Encontrados: 3/3");
                                ItemStacks.ItemSecretoMeta.setLore(Lore);
                                ItemStacks.ItemSecreto.setItemMeta(ItemStacks.ItemSecretoMeta);

                                e.getPlayer().getInventory().addItem(ItemStacks.ItemSecreto);

                                e.getPlayer().sendMessage(Strings.prefix + "§f§l§oITEM SECRETO COMPRADO! §a" + preco + " de Money foi removido da sua conta com Sucesso!");
                                Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "playsound random.levelup @a -1662 50 639 50000 1");
                            } else {
                                e.getPlayer().sendMessage(Strings.prefix + "§2Item comprado com Sucesso! §a" + preco + " de Money foi removido da sua conta com Sucesso!");
                                Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "give " + e.getPlayer().getName() + " " + lines[2]);
                                Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "playsound random.levelup @a -1662 50 639 50000 1");
                            }

                            return;
                        } else if (lines[1].equalsIgnoreCase("§aVenda")) {
                            double precoCada = 10.0;

                            if (e.getPlayer().getInventory().getItemInHand().getType() == Material.AIR) {
                                e.getPlayer().sendMessage(Strings.prefix + "§cSegure um Item para vender!");
                                return;
                            }

                            double precoPorItem = precoCada * e.getPlayer().getInventory().getItemInHand().getAmount();

                            e.getPlayer().sendMessage(Strings.prefix + "§2§lItem vendido com Sucesso! §aItem: " + e.getPlayer().getItemInHand().getType() + " Quantidade Ganha: " + precoPorItem);
                            Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "give " + e.getPlayer().getName() + " " + lines[2]);

                            e.getPlayer().getInventory().getItemInHand().setType(Material.AIR);

                            Variables.Dinheiro = Variables.Dinheiro + precoPorItem;

                            return;
                        } else if (lines[1].equalsIgnoreCase("§bWarp")) {
                            if (lines[2].isEmpty()) {
                                e.getPlayer().sendMessage(Strings.prefix + "§cNão há nenhuma warp registrada nessa placa!");
                                return;
                            }

                            Bukkit.getServer().dispatchCommand(e.getPlayer(), "warp " + lines[2]);
                            return;
                        } else if (lines[1].equalsIgnoreCase("§bÁudio")) {
                            if (lines[2].isEmpty()) {
                                e.getPlayer().sendMessage(Strings.prefix + "§cNão há nenhum áudio registrada nessa placa!");
                                return;
                            }

                            Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "audio " + lines[2]);
                            e.getPlayer().sendMessage(Strings.prefix + "§6Tocando Áudio: §e" + lines[2]);
                            return;
                        } else {
                            e.getPlayer().sendMessage(Strings.prefix + "§cComando de Placa desconhecido...");
                            return;
                        }

                    }
                }
                return;
            }

            if (e.getAction() == Action.RIGHT_CLICK_AIR) {
                if (e.getPlayer().getItemInHand().getType() == Material.MUSHROOM_SOUP) {
                    if (e.getPlayer().getGameMode() == GameMode.CREATIVE || e.getPlayer().getGameMode() == GameMode.SPECTATOR) {
                        return;
                    }

                    ItemStacks.PoteMeta.setDisplayName(Strings.RecraftNome);

                    if (e.getPlayer().getHealth() == 20) {
                        e.setCancelled(true);
                        return;
                    } else if (e.getPlayer().getHealth() < 14) {
                        e.getPlayer().setHealth(e.getPlayer().getHealth() + 7);
                        e.setCancelled(true);
                        e.getPlayer().getItemInHand().setItemMeta(ItemStacks.PoteMeta);
                        e.getPlayer().getItemInHand().setType(Material.BOWL);
                    } else {
                        e.getPlayer().setHealth(20);
                        e.setCancelled(true);
                        e.getPlayer().getItemInHand().setType(Material.BOWL);
                    }

                    e.getPlayer().setFoodLevel(20);
                }
            }

        } catch (Exception ignored) {
        }
    }

    @EventHandler
    public void onSignEdit(SignChangeEvent e) {
        if (!Variables.Permitidos.contains(e.getPlayer().getName()) && !Variables.Jogadores.contains(e.getPlayer().getName()) && !e.getPlayer().getName().equalsIgnoreCase(Jogadores.Meel)) {
            e.getPlayer().sendMessage(Strings.prefix + Strings.semPerm);
            e.setCancelled(true);
            return;
        }

        String[] lines = e.getLines();

        if (lines.length > 1 && lines[0].equalsIgnoreCase("[MapMeel]")) {
            if (e.getPlayer().getName().equalsIgnoreCase(Jogadores.Meel)) {
                e.getPlayer().sendMessage(Strings.prefix + Strings.semPerm);
                return;
            }

            if (lines[1].isEmpty()) {
                e.getPlayer().sendMessage(Strings.prefix + "§cSem comando na Placa!");
                e.getPlayer().sendMessage(Strings.prefix + "§6Comandos: §eCompra§6, §eVenda§6, §eWarp");
                return;
            }

            if (lines[1].equalsIgnoreCase("compra")) {
                if (lines[2].isEmpty()) {
                    e.getPlayer().sendMessage(Strings.prefix + "§aEscolha uma Item!");
                    e.getPlayer().sendMessage(Strings.prefix + "§6Item Editados: §fNenhum registrado até agora...");
                    return;
                }
                if (lines[3].isEmpty()) {
                    e.getPlayer().sendMessage(Strings.prefix + "§aColoque um Preço para o Item!");
                    return;
                } else {
                    try {
                        double teste = Double.parseDouble(lines[3]);
                        Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "tell " + e.getPlayer().getName() + "§a§lPLACA CRIADA! §ePreço: " + teste);
                    } catch (Exception erro) {
                        e.getPlayer().sendMessage(Strings.prefix + "§cDigite um Preço Válido! (Apenas Números e Pontos)");
                        return;
                    }
                }

                if (lines[2].equalsIgnoreCase("is1")) {
                    e.setLine(2, "§lItemSecreto1");
                } else if (lines[2].equalsIgnoreCase("is2")) {
                    e.setLine(2, "§lItemSecreto2");
                } else if (lines[2].equalsIgnoreCase("is3")) {
                    e.setLine(2, "§lItemSecreto3");
                }

                e.setLine(0, Strings.Mapa);
                e.setLine(1, "§aCompra");
            } else

            if (lines[1].equalsIgnoreCase("venda")) {
                e.setLine(0, Strings.Mapa);
                e.setLine(1, "§aVenda");
                e.setLine(2, "Vender o Item");
                e.setLine(3, "Na sua Mão.");
            } else

            if (lines[1].equalsIgnoreCase("warp")) {
                if (lines[2].isEmpty()) {
                    e.getPlayer().sendMessage(Strings.prefix + "§aEscolha uma Warp!");
                    return;
                }

                if (!Variables.WarpsEx.contains(lines[2])) {
                    e.getPlayer().sendMessage(Strings.prefix + "§cWarp Inexistente!");

                    StringBuilder s = new StringBuilder();
                    for (int i = 0; i < Variables.WarpsEx.size(); i++) {
                        if (i != 0) {
                            s.append("§6, ").append(Variables.WarpsEx.get(i));
                        } else {
                            s.append(Variables.WarpsEx.get(i));
                        }
                    }

                    e.getPlayer().sendMessage(Strings.prefix + "§6Warps: §e" + s.toString());
                    return;
                }

                e.setLine(0, Strings.Mapa);
                e.setLine(1, "§bWarp");
                e.setLine(3, "§o(Teleportar)");
            } else

            if (lines[1].equalsIgnoreCase("audio")) {
                if (lines[2].isEmpty()) {
                    e.getPlayer().sendMessage(Strings.prefix + "§aEscolha um Áudio!");
                    return;
                }

                e.setLine(0, Strings.Mapa);
                e.setLine(1, "§bÁudio");
                e.setLine(3, "§o(Tocar Áudio)");
            } else {
                e.getPlayer().sendMessage(Strings.prefix + "§cComando de Placa inexistente!");
                e.getPlayer().sendMessage(Strings.prefix + "§6Comandos: §eCompra§6, §eVenda§6, §eWarp§6, §eAudio");
                return;
            }
        }

        if (lines[0].contains("&")) {
            e.setLine(0, lines[0].replace("&1", "§1").replace("&2", "§2").replace("&3", "§3").replace("&4", "§4").replace("&5", "§5").replace("&6", "§6").replace("&7", "§7").replace("&8", "§8").replace("&9", "§9").replace("&0", "§0").replace("&a", "§a").replace("&b", "§b").replace("&c", "§c").replace("&d", "§d").replace("&e", "§e").replace("&f", "§f").replace("&l", "§l").replace("&o", "§o").replace("&k", "§k").replace("&m", "§m").replace("&n", "§n").replace("&r", "§r"));
        }
        if (lines[1].contains("&")) {
            e.setLine(1, lines[1].replace("&1", "§1").replace("&2", "§2").replace("&3", "§3").replace("&4", "§4").replace("&5", "§5").replace("&6", "§6").replace("&7", "§7").replace("&8", "§8").replace("&9", "§9").replace("&0", "§0").replace("&a", "§a").replace("&b", "§b").replace("&c", "§c").replace("&d", "§d").replace("&e", "§e").replace("&f", "§f").replace("&l", "§l").replace("&o", "§o").replace("&k", "§k").replace("&m", "§m").replace("&n", "§n").replace("&r", "§r"));
        }
        if (lines[2].contains("&")) {
            e.setLine(2, lines[2].replace("&1", "§1").replace("&2", "§2").replace("&3", "§3").replace("&4", "§4").replace("&5", "§5").replace("&6", "§6").replace("&7", "§7").replace("&8", "§8").replace("&9", "§9").replace("&0", "§0").replace("&a", "§a").replace("&b", "§b").replace("&c", "§c").replace("&d", "§d").replace("&e", "§e").replace("&f", "§f").replace("&l", "§l").replace("&o", "§o").replace("&k", "§k").replace("&m", "§m").replace("&n", "§n").replace("&r", "§r"));
        }
        if (lines[3].contains("&")) {
            e.setLine(3, lines[3].replace("&1", "§1").replace("&2", "§2").replace("&3", "§3").replace("&4", "§4").replace("&5", "§5").replace("&6", "§6").replace("&7", "§7").replace("&8", "§8").replace("&9", "§9").replace("&0", "§0").replace("&a", "§a").replace("&b", "§b").replace("&c", "§c").replace("&d", "§d").replace("&e", "§e").replace("&f", "§f").replace("&l", "§l").replace("&o", "§o").replace("&k", "§k").replace("&m", "§m").replace("&n", "§n").replace("&r", "§r"));
        }

    }

}
