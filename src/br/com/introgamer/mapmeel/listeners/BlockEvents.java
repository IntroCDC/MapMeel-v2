package br.com.introgamer.mapmeel.listeners;

import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;

import br.com.introgamer.mapmeel.variables.ItemStacks;
import br.com.introgamer.mapmeel.variables.Jogadores;
import br.com.introgamer.mapmeel.variables.Strings;
import br.com.introgamer.mapmeel.variables.Variables;

public class BlockEvents implements Listener {

    @EventHandler
    public void onPlayerBreakBlock(BlockBreakEvent e) {
        if (!Variables.Permitidos.contains(e.getPlayer().getName()) && !Variables.Jogadores.contains(e.getPlayer().getName()) && !e.getPlayer().getName().equalsIgnoreCase(Jogadores.Meel)) {
            e.getPlayer().sendMessage(Strings.prefix + Strings.semPerm);
            e.setCancelled(true);
            return;
        }

        if (e.getPlayer().getGameMode() != GameMode.CREATIVE) {
            if (e.getBlock().getType() != Material.TORCH && e.getBlock().getType() != Material.REDSTONE_TORCH_OFF && e.getBlock().getType() != Material.REDSTONE_TORCH_ON) {
                e.setCancelled(true);
                return;
            }
            if (e.getBlock().getType() == Material.TORCH) {
                ItemStacks.TorchMeta.setDisplayName(Strings.TorchNome);
                ItemStacks.Torch.setItemMeta(ItemStacks.TorchMeta);

                e.getPlayer().getInventory().addItem(ItemStacks.Torch);
                return;
            }
            if (e.getBlock().getType() == Material.REDSTONE_TORCH_ON) {
                ItemStacks.RedstoneTorchMeta.setDisplayName(Strings.TorchNome);
                ItemStacks.RedstoneTorch.setItemMeta(ItemStacks.RedstoneTorchMeta);

                e.getPlayer().getInventory().addItem(ItemStacks.RedstoneTorch);
                return;
            }
            if (e.getBlock().getType() == Material.REDSTONE_TORCH_OFF) {
                ItemStacks.RedstoneTorchMeta.setDisplayName(Strings.TorchNome);
                ItemStacks.RedstoneTorch.setItemMeta(ItemStacks.RedstoneTorchMeta);

                e.getPlayer().getInventory().addItem(ItemStacks.RedstoneTorch);
            }
        }
    }

    @EventHandler
    public void onPlayerPlaceBlock(BlockPlaceEvent e) {
        if (!Variables.Jogadores.contains(e.getPlayer().getName()) && !Variables.Permitidos.contains(e.getPlayer().getName()) && !e.getPlayer().getName().equalsIgnoreCase(Jogadores.Meel)) {
            e.getPlayer().sendMessage(Strings.prefix + Strings.semPerm);
            e.setCancelled(true);
            return;
        }

        if (e.getPlayer().getGameMode() != GameMode.CREATIVE) {
            if (e.getPlayer().getItemInHand().getType() != Material.TORCH && e.getPlayer().getItemInHand().getType() != Material.REDSTONE_TORCH_ON) {
                e.getPlayer().sendMessage(Strings.prefix + "§cVocê só pode colocar Tochas e Tochas de Redstone!");
                e.setCancelled(true);
            }
        }
    }

}
