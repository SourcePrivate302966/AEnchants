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

public class Replenish implements Listener {

	Material diamondc = Material.DIAMOND_CHESTPLATE;
	Material ironc = Material.IRON_CHESTPLATE;
	Material chainc = Material.CHAINMAIL_CHESTPLATE;
	Material leatherc = Material.LEATHER_CHESTPLATE;

	Material diamondl = Material.DIAMOND_LEGGINGS;
	Material ironl = Material.IRON_LEGGINGS;
	Material chainl = Material.CHAINMAIL_LEGGINGS;
	Material leatherl = Material.LEATHER_LEGGINGS;

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
		if (e.getClick() == ClickType.RIGHT || e.getClick() == ClickType.LEFT) {
			if (e.getSlotType() == SlotType.ARMOR) {
				Material c = e.getCursor().getType();
				if (m == diamondc || m == ironc || m == chainc
						|| m == leatherc && p.getInventory().getChestplate() != null) {
					p.removePotionEffect(PotionEffectType.REGENERATION);
				} else if (c == diamondc || c == ironc || c == chainc || c == leatherc && m == null) {
					if (e.getCursor() == null)
						return;
					List<String> clore = e.getCursor().getItemMeta().getLore();
					if (clore == null)
						return;
					if (clore.contains(ChatColor.translateAlternateColorCodes('&', one))) {
						p.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, (1000000 * 20), 0));
					} else if (clore.contains(ChatColor.translateAlternateColorCodes('&', two))) {
						p.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, (1000000 * 20), 0));
					} else if (clore.contains(ChatColor.translateAlternateColorCodes('&', three))) {
						p.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, (1000000 * 20), 1));
					}
				} else if (m == diamondl || m == ironl || m == chainl
						|| m == leatherl && p.getInventory().getLeggings() != null) {
					p.removePotionEffect(PotionEffectType.REGENERATION);
				} else if (c == diamondl || c == ironl || c == chainl || c == leatherl && m == null) {
					if (e.getCursor() == null)
						return;
					List<String> clore = e.getCursor().getItemMeta().getLore();
					if (clore == null)
						return;
					if (clore.contains(ChatColor.translateAlternateColorCodes('&', one))) {
						p.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, (1000000 * 20), 0));
					} else if (clore.contains(ChatColor.translateAlternateColorCodes('&', two))) {
						p.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, (1000000 * 20), 0));
					} else if (clore.contains(ChatColor.translateAlternateColorCodes('&', three))) {
						p.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, (1000000 * 20), 1));
					}
				}
			}
		}
		if (!(e.getClick() == ClickType.SHIFT_LEFT || e.getClick() == ClickType.SHIFT_RIGHT)) {
			if (e.getSlotType() == SlotType.ARMOR) {
				if (m == diamondc || m == ironc || m == chainc
						|| m == leatherc && p.getInventory().getChestplate() == null) {
					p.removePotionEffect(PotionEffectType.REGENERATION);
				} else if (m == diamondl || m == ironl || m == chainl
						|| m == leatherl && p.getInventory().getLeggings() == null) {
					p.removePotionEffect(PotionEffectType.REGENERATION);
				}
			}
			return;
		}
		if (!(m == diamondc || m == ironc || m == chainc || m == leatherc || m == diamondl || m == ironl || m == chainl
				|| m == leatherl))
			return;
		List<String> lore = e.getCurrentItem().getItemMeta().getLore();
		if (lore == null)
			return;
		if (e.getSlotType() != SlotType.ARMOR) {
			if (m == diamondc || m == ironc || m == chainc
					|| m == leatherc && p.getInventory().getChestplate() == null) {
				if (lore.contains(ChatColor.translateAlternateColorCodes('&', one))) {
					p.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, (1000000 * 20), 0));
				} else if (lore.contains(ChatColor.translateAlternateColorCodes('&', two))) {
					p.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, (1000000 * 20), 0));
				} else if (lore.contains(ChatColor.translateAlternateColorCodes('&', three))) {
					p.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, (1000000 * 20), 1));
				}
			} else if (m == diamondl || m == ironl || m == chainl
					|| m == leatherl && p.getInventory().getLeggings() == null) {
				if (lore.contains(ChatColor.translateAlternateColorCodes('&', one))) {
					p.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, (1000000 * 20), 0));
				} else if (lore.contains(ChatColor.translateAlternateColorCodes('&', two))) {
					p.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, (1000000 * 20), 0));
				} else if (lore.contains(ChatColor.translateAlternateColorCodes('&', three))) {
					p.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, (1000000 * 20), 1));
				}
			}
		} else if (e.getSlotType() == SlotType.ARMOR) {
			if (m == diamondc || m == ironc || m == chainc
					|| m == leatherc && p.getInventory().getChestplate() != null) {
				p.removePotionEffect(PotionEffectType.REGENERATION);
			} else if (m == diamondl || m == ironl || m == chainl
					|| m == leatherl && p.getInventory().getLeggings() != null) {
				p.removePotionEffect(PotionEffectType.REGENERATION);
			}
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
		if (!(m == diamondc || m == ironc || m == chainc || m == leatherc || m == diamondl || m == ironl || m == chainl
				|| m == leatherl))
			return;
		if (e.getAction().equals(Action.RIGHT_CLICK_AIR) || e.getAction().equals(Action.RIGHT_CLICK_BLOCK)) {
			if (m == diamondc || m == ironc || m == chainc
					|| m == leatherc && p.getInventory().getChestplate() == null) {
				if (lore.contains(ChatColor.translateAlternateColorCodes('&', one))) {
					p.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, (1000000 * 20), 0));
				} else if (lore.contains(ChatColor.translateAlternateColorCodes('&', two))) {
					p.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, (1000000 * 20), 0));
				} else if (lore.contains(ChatColor.translateAlternateColorCodes('&', three))) {
					p.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, (1000000 * 20), 1));
				}
			} else if (m == diamondl || m == ironl || m == chainl
					|| m == leatherl && p.getInventory().getLeggings() == null) {
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
