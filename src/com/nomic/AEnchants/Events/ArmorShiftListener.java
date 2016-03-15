package com.nomic.AEnchants.Events;

import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.ClickType;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryType.SlotType;
import org.bukkit.inventory.ItemStack;

public class ArmorShiftListener implements Listener {
	
	@EventHandler
	public void shift(InventoryClickEvent e) {
		if (!(e.getWhoClicked() instanceof Player))
			return;
		Player p = (Player) e.getWhoClicked();
		ItemStack item = e.getCurrentItem();
		ClickType click = e.getClick();
		SlotType stype = e.getSlotType();
		if (item.getType() == Material.AIR)
			return;
		if (!(click == ClickType.SHIFT_LEFT || click == ClickType.SHIFT_RIGHT))
			return;
		List<String> lore = item.getItemMeta().getLore();
		if (lore == null)
			return;
		Bukkit.getServer().getPluginManager().callEvent(new ArmorShift(p, item, lore, stype));
	}
}
