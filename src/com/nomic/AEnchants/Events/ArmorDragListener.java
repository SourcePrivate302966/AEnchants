package com.nomic.AEnchants.Events;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.ClickType;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryType.SlotType;
import org.bukkit.inventory.ItemStack;

public class ArmorDragListener implements Listener {
	
	@EventHandler
	public void hotbar(InventoryClickEvent e) {
		if (!(e.getWhoClicked() instanceof Player))
			return;
		Player p = (Player) e.getWhoClicked();
		ItemStack item = e.getCursor();
		ItemStack citem = e.getCurrentItem();
		ClickType click = e.getClick();
		SlotType stype = e.getSlotType();
		if (!(click == ClickType.LEFT || click == ClickType.RIGHT))
			return;
		if (e.getCurrentItem() == null)
			return;
		Bukkit.getServer().getPluginManager().callEvent(new ArmorDrag(p, item, citem, stype));
	}
}