package com.nomic.ArchonEnchants.Enchants;

import java.util.List;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryAction;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryType.SlotType;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class Scoot implements Listener {

	@EventHandler(priority = EventPriority.NORMAL)
	public void equipClick(InventoryClickEvent e) {
		if (!(e.getWhoClicked() instanceof Player))
			return;
		Player p = (Player) e.getWhoClicked();
		if (p.getItemOnCursor() == null || e.getCurrentItem() == null)
			return;
		List<String> lore = p.getItemOnCursor().getItemMeta().getLore(); //ERROR HERE! NULL POINT EXCEPTION!
		if (lore == null || e.getSlotType() != SlotType.ARMOR)
			return;
		String one = "&bScoot I";
		String two = "&eScoot II";
		String three = "&cScoot III";
		if (e.getAction() == InventoryAction.PLACE_ALL) {
			if (lore.contains(ChatColor.translateAlternateColorCodes('&', one))) {
				p.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, (1000000 * 20), 0));
			} else if (lore.contains(ChatColor.translateAlternateColorCodes('&', two))) {
				p.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, (1000000 * 20), 0));
			} else if (lore.contains(ChatColor.translateAlternateColorCodes('&', three))) {
				p.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, (1000000 * 20), 1));
			}
		} else if (e.getAction() == InventoryAction.PICKUP_ALL) {
			if (lore.contains(ChatColor.translateAlternateColorCodes('&', one))) {
				p.removePotionEffect(PotionEffectType.SPEED);
			} else if (lore.contains(ChatColor.translateAlternateColorCodes('&', two))) {
				p.removePotionEffect(PotionEffectType.SPEED);
			} else if (lore.contains(ChatColor.translateAlternateColorCodes('&', three))) {
				p.removePotionEffect(PotionEffectType.SPEED);
			}
		}
	}
}
