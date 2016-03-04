package com.nomic.ArchonEnchants.Enchants;

import java.util.List;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.ClickType;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryDragEvent;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class Feast implements Listener {

	@EventHandler(priority = EventPriority.NORMAL)
	public void shift(InventoryClickEvent e) {
		if (!(e.getWhoClicked() instanceof Player))
			return;
		Player p = (Player) e.getWhoClicked();
		if ((e.getSlotType() != InventoryType.SlotType.ARMOR) && (e.getSlotType() != InventoryType.SlotType.QUICKBAR)
				&& (!e.getInventory().getName().equalsIgnoreCase("container.crafting")))
			return;
		if (e.getClick() == ClickType.CREATIVE)
			return;
		String one = "&bFeast I";
		int slot = e.getSlot();
		if (p.getInventory().getItem(slot) == null) //ERROR
			return;
		List<String> lore = p.getInventory().getItem(slot).getItemMeta().getLore();
		if (lore == null)
			return;
		if ((e.getClick() == ClickType.SHIFT_LEFT) || e.getClick() == ClickType.SHIFT_RIGHT) {
			if (p.getInventory().getHelmet() == null) {
				if (lore.contains(ChatColor.translateAlternateColorCodes('&', one))) {
					p.addPotionEffect(new PotionEffect(PotionEffectType.SATURATION, (1000000 * 20), 0));
				}
			} else if (p.getInventory().getHelmet() != null) {
				p.removePotionEffect(PotionEffectType.SATURATION);
			}
		} 
	}
	
	@EventHandler
	public void drag(InventoryDragEvent e) {
		if (!(e.getWhoClicked() instanceof Player))
			return;
		Player p = (Player) e.getWhoClicked();
		p.sendMessage("" + e.getCursor().getType());
		p.sendMessage("old " + e.getOldCursor().getType());
		if (e.getCursor() == null)
			return;
		ItemStack item = e.getCursor();
		//String one = "&bFeast I";
		List<String> lore = item.getItemMeta().getLore();
		if (lore == null)
			return;
		p.sendMessage("" + e.getCursor().getType());
		p.sendMessage("old " + e.getOldCursor().getType());
	}
}
