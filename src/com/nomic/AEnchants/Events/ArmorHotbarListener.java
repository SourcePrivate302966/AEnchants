package com.nomic.AEnchants.Events;

import java.util.List;

import org.bukkit.Bukkit;
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
		List<String> lore = item.getItemMeta().getLore();
		if (lore == null)
			return;
		Bukkit.getServer().getPluginManager().callEvent(new ArmorHotbar(p, item, lore));
	}
}
