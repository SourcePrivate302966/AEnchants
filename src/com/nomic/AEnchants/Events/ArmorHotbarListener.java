package com.nomic.AEnchants.Events;

import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;

public class ArmorHotbarListener implements Listener {

	@EventHandler
	public void hotbar(PlayerInteractEvent e) {
		Player p = e.getPlayer();
		ItemStack item = e.getItem();
		Action action = e.getAction();
		if (item == null)
			return;
		if (!(action.equals(Action.RIGHT_CLICK_AIR) || action.equals(Action.RIGHT_CLICK_BLOCK)))
			return;
		if (action.equals(Action.RIGHT_CLICK_BLOCK) && e.getClickedBlock() != null) {
			Material m = e.getClickedBlock().getType();
			if (!(m == Material.STONE || m == Material.GRASS || m == Material.LOG || m == Material.WOOD
					|| m == Material.LONG_GRASS || m == Material.SAND || m == Material.SANDSTONE
					|| m == Material.NETHERRACK || m == Material.ENDER_STONE || m == Material.COBBLESTONE
					|| m == Material.WOOL || m == Material.CARPET || m == Material.DIRT || m == Material.OBSIDIAN
					|| m == Material.STAINED_CLAY || m == Material.STAINED_GLASS || m == Material.GLASS
					|| m == Material.GRAVEL || m == Material.WATER || m == Material.LAVA))
				return;
		}
		List<String> lore = item.getItemMeta().getLore();
		if (lore == null)
			return;
		Bukkit.getServer().getPluginManager().callEvent(new ArmorHotbar(p, item, lore));
	}
}
