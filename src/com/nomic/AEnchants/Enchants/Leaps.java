package com.nomic.AEnchants.Enchants;

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

public class Leaps implements Listener {

	Material diamondb = Material.DIAMOND_BOOTS;
	Material ironb = Material.IRON_BOOTS;
	Material chainb = Material.CHAINMAIL_BOOTS;
	Material leatherb = Material.LEATHER_BOOTS;

	String one = "&bLeaps I";
	String two = "&eLeaps II";
	String three = "&cLeaps III";

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
		if (e.getClick() == ClickType.RIGHT || e.getClick() == ClickType.LEFT) {
			if (e.getSlotType() == SlotType.ARMOR) {
				Material c = e.getCursor().getType();
				if (m == diamondb || m == ironb || m == chainb
						|| m == leatherb && p.getInventory().getBoots() != null) {
					p.removePotionEffect(PotionEffectType.JUMP);
				} else if (c == diamondb || c == ironb || c == chainb || c == leatherb && m == null) {
					if (e.getCursor() == null)
						return;
					List<String> clore = e.getCursor().getItemMeta().getLore();
					if (clore == null)
						return;
					if (clore.contains(ChatColor.translateAlternateColorCodes('&', one))) {
						p.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, (1000000 * 20), 0));
					} else if (clore.contains(ChatColor.translateAlternateColorCodes('&', two))) {
						p.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, (1000000 * 20), 0));
					} else if (clore.contains(ChatColor.translateAlternateColorCodes('&', three))) {
						p.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, (1000000 * 20), 1));
					}
				}
			}
		}
		if (!(e.getClick() == ClickType.SHIFT_LEFT || e.getClick() == ClickType.SHIFT_RIGHT)) {
			if (m == diamondb || m == ironb || m == chainb || m == leatherb && e.getSlotType() == SlotType.ARMOR) {
				if (p.getInventory().getBoots() == null) {
					p.removePotionEffect(PotionEffectType.JUMP);
				}
			}
			return;
		}
		if (!(m == diamondb || m == ironb || m == chainb || m == leatherb))
			return;
		List<String> lore = e.getCurrentItem().getItemMeta().getLore();
		if (lore == null)
			return;
		if (p.getInventory().getBoots() == null && e.getSlotType() != SlotType.ARMOR) {
			if (lore.contains(ChatColor.translateAlternateColorCodes('&', one))) {
				p.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, (1000000 * 20), 0));
			} else if (lore.contains(ChatColor.translateAlternateColorCodes('&', two))) {
				p.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, (1000000 * 20), 0));
			} else if (lore.contains(ChatColor.translateAlternateColorCodes('&', three))) {
				p.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, (1000000 * 20), 1));
			}
		} else if (p.getInventory().getBoots() != null && e.getSlotType() == SlotType.ARMOR) {
			p.removePotionEffect(PotionEffectType.JUMP);
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
		if (!(m == diamondb || m == ironb || m == chainb || m == leatherb))
			return;
		if (e.getAction().equals(Action.RIGHT_CLICK_AIR) || e.getAction().equals(Action.RIGHT_CLICK_BLOCK)) {
			if (p.getInventory().getBoots() == null) {
				if (lore.contains(ChatColor.translateAlternateColorCodes('&', one))) {
					p.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, (1000000 * 20), 0));
				} else if (lore.contains(ChatColor.translateAlternateColorCodes('&', two))) {
					p.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, (1000000 * 20), 0));
				} else if (lore.contains(ChatColor.translateAlternateColorCodes('&', three))) {
					p.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, (1000000 * 20), 1));
				}
			}
		}
	}
}
