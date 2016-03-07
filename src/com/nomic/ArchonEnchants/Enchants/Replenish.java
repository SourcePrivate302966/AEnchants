package com.nomic.ArchonEnchants.Enchants;

import java.util.List;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.inventory.ClickType;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.event.inventory.InventoryType.SlotType;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class Replenish implements Listener {

	Material diamondc = Material.DIAMOND_CHESTPLATE;
	Material ironc = Material.IRON_CHESTPLATE;
	Material chainc = Material.CHAINMAIL_CHESTPLATE;
	Material leatherc = Material.LEATHER_CHESTPLATE;
	
	String one = "&bReplenish I";
	String two = "&eReplenish II";
	String three = "&cReplenish III";

	@EventHandler(priority = EventPriority.NORMAL)
	public void shift(InventoryClickEvent e) {
		if (e.getInventory().getType() != InventoryType.CRAFTING)
			return;
		if (!(e.getWhoClicked() instanceof Player))
			return;
		Player p = (Player) e.getWhoClicked();
		if (e.getCurrentItem() == null)
			return;
		Material m = e.getCurrentItem().getType();
		if (e.getClick() == ClickType.DROP || e.getClick() == ClickType.CONTROL_DROP
				|| e.getClick() == ClickType.DOUBLE_CLICK || e.getClick() == ClickType.MIDDLE
				|| e.getClick() == ClickType.NUMBER_KEY || e.getClick() == ClickType.UNKNOWN)
			return;
		if (!(e.getClick() == ClickType.SHIFT_LEFT || e.getClick() == ClickType.SHIFT_RIGHT)) {
			if (m == diamondc || m == ironc || m == chainc || m == leatherc && e.getSlotType() == SlotType.ARMOR) {
				if (p.getInventory().getChestplate() == null) {
					p.removePotionEffect(PotionEffectType.REGENERATION);
				}
			}
			return;
		}
		if (!(m == diamondc || m == ironc || m == chainc || m == leatherc))
			return;
		List<String> lore = e.getCurrentItem().getItemMeta().getLore();
		if (lore == null)
			return;
		if (p.getInventory().getChestplate() == null && e.getSlotType() != SlotType.ARMOR) {
			if (lore.contains(ChatColor.translateAlternateColorCodes('&', one))) {
				p.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, (1000000 * 20), 0));
			} else if (lore.contains(ChatColor.translateAlternateColorCodes('&', two))) {
				p.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, (1000000 * 20), 0));
			} else if (lore.contains(ChatColor.translateAlternateColorCodes('&', three))) {
				p.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, (1000000 * 20), 1));
			}
		} else if (p.getInventory().getChestplate() != null && e.getSlotType() == SlotType.ARMOR) {
			p.removePotionEffect(PotionEffectType.REGENERATION);
		}
	}

	@EventHandler(priority = EventPriority.NORMAL)
	public void hotbar(PlayerInteractEvent e) {
		Player p = e.getPlayer();
		if (e.getItem() == null)
			return;
		List<String> lore = e.getItem().getItemMeta().getLore();
		if (lore == null)
			return;
		Material m = e.getItem().getType();
		if (!(m == diamondc || m == ironc || m == chainc || m == leatherc))
			return;
		if (e.getAction().equals(Action.RIGHT_CLICK_AIR) || e.getAction().equals(Action.RIGHT_CLICK_BLOCK)) {
			if (p.getInventory().getChestplate() == null) {
				if (lore.contains(ChatColor.translateAlternateColorCodes('&', one))) {
					p.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, (1000000 * 20), 0));
				} else if (lore.contains(ChatColor.translateAlternateColorCodes('&', two))) {
					p.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, (1000000 * 20), 0));
				} else if (lore.contains(ChatColor.translateAlternateColorCodes('&', three))) {
					p.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, (1000000 * 20), 1));
				}
			}
		}
	}
}
