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

public class Beast implements Listener {

	Material diamondb = Material.DIAMOND_BOOTS;
	Material ironb = Material.IRON_BOOTS;
	Material chainb = Material.CHAINMAIL_BOOTS;
	Material leatherb = Material.LEATHER_BOOTS;

	Material diamondl = Material.DIAMOND_LEGGINGS;
	Material ironl = Material.IRON_LEGGINGS;
	Material chainl = Material.CHAINMAIL_LEGGINGS;
	Material leatherl = Material.LEATHER_LEGGINGS;

	Material diamondc = Material.DIAMOND_CHESTPLATE;
	Material ironc = Material.IRON_CHESTPLATE;
	Material chainc = Material.CHAINMAIL_CHESTPLATE;
	Material leatherc = Material.LEATHER_CHESTPLATE;

	Material diamondh = Material.DIAMOND_HELMET;
	Material ironh = Material.IRON_HELMET;
	Material chainh = Material.CHAINMAIL_HELMET;
	Material leatherh = Material.LEATHER_HELMET;

	String one = "&bBeast I";
	String two = "&eBeast II";
	String three = "&cBeast III";

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
			if ((m == diamondb || m == ironb || m == chainb || m == leatherb)
					|| (m == diamondl || m == ironl || m == chainl || m == leatherl)
					|| (m == diamondc || m == ironc || m == chainc || m == leatherc)
					|| (m == diamondh || m == ironh || m == chainh || m == leatherh)
					|| e.getSlotType() == SlotType.ARMOR) {
				if (p.getInventory().getBoots() == null || p.getInventory().getLeggings() == null
						|| p.getInventory().getChestplate() == null || p.getInventory().getHelmet() == null) {
					p.removePotionEffect(PotionEffectType.INCREASE_DAMAGE);
				}
			}
			return;
		}
		if (!((m == diamondb || m == ironb || m == chainb || m == leatherb)
				|| (m == diamondl || m == ironl || m == chainl || m == leatherl)
				|| (m == diamondc || m == ironc || m == chainc || m == leatherc)
				|| (m == diamondh || m == ironh || m == chainh || m == leatherh)))
			return;
		List<String> lore = e.getCurrentItem().getItemMeta().getLore();
		if (lore == null)
			return;
		if (e.getSlotType() != SlotType.ARMOR) {
			if (p.getInventory().getBoots() == null && p.getInventory().getLeggings() != null
					&& p.getInventory().getChestplate() != null && p.getInventory().getHelmet() != null
					&& (m == diamondb || m == ironb || m == chainb || m == leatherb)) {
				if (lore.contains(ChatColor.translateAlternateColorCodes('&', one))) {
					p.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, (1000000 * 20), 0));
				} else if (lore.contains(ChatColor.translateAlternateColorCodes('&', two))) {
					p.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, (1000000 * 20), 0));
				} else if (lore.contains(ChatColor.translateAlternateColorCodes('&', three))) {
					p.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, (1000000 * 20), 1));
				}
			} else if (p.getInventory().getBoots() != null && p.getInventory().getLeggings() == null
					&& p.getInventory().getChestplate() != null && p.getInventory().getHelmet() != null
					&& (m == diamondl || m == ironl || m == chainl || m == leatherl)) {
				if (lore.contains(ChatColor.translateAlternateColorCodes('&', one))) {
					p.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, (1000000 * 20), 0));
				} else if (lore.contains(ChatColor.translateAlternateColorCodes('&', two))) {
					p.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, (1000000 * 20), 0));
				} else if (lore.contains(ChatColor.translateAlternateColorCodes('&', three))) {
					p.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, (1000000 * 20), 1));
				}
			} else if (p.getInventory().getBoots() != null && p.getInventory().getLeggings() != null
					&& p.getInventory().getChestplate() == null && p.getInventory().getHelmet() != null
					&& (m == diamondc || m == ironc || m == chainc || m == leatherc)) {
				if (lore.contains(ChatColor.translateAlternateColorCodes('&', one))) {
					p.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, (1000000 * 20), 0));
				} else if (lore.contains(ChatColor.translateAlternateColorCodes('&', two))) {
					p.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, (1000000 * 20), 0));
				} else if (lore.contains(ChatColor.translateAlternateColorCodes('&', three))) {
					p.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, (1000000 * 20), 1));
				}
			} else if (p.getInventory().getBoots() != null && p.getInventory().getLeggings() != null
					&& p.getInventory().getChestplate() != null && p.getInventory().getHelmet() == null
					&& (m == diamondh || m == ironh || m == chainh || m == leatherh)) {
				if (lore.contains(ChatColor.translateAlternateColorCodes('&', one))) {
					p.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, (1000000 * 20), 0));
				} else if (lore.contains(ChatColor.translateAlternateColorCodes('&', two))) {
					p.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, (1000000 * 20), 0));
				} else if (lore.contains(ChatColor.translateAlternateColorCodes('&', three))) {
					p.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, (1000000 * 20), 1));
				}
			}
		} else if (e.getSlotType() == SlotType.ARMOR) {
			p.removePotionEffect(PotionEffectType.INCREASE_DAMAGE);
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
		if (!((m == diamondb || m == ironb || m == chainb || m == leatherb)
				|| (m == diamondl || m == ironl || m == chainl || m == leatherl)
				|| (m == diamondc || m == ironc || m == chainc || m == leatherc)
				|| (m == diamondh || m == ironh || m == chainh || m == leatherh)))
			return;
		if (e.getAction().equals(Action.RIGHT_CLICK_AIR) || e.getAction().equals(Action.RIGHT_CLICK_BLOCK)) {
			if (p.getInventory().getBoots() == null && p.getInventory().getLeggings() != null
					&& p.getInventory().getChestplate() != null && p.getInventory().getHelmet() != null
					&& (m == diamondb || m == ironb || m == chainb || m == leatherb)) {
				if (lore.contains(ChatColor.translateAlternateColorCodes('&', one))) {
					p.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, (1000000 * 20), 0));
				} else if (lore.contains(ChatColor.translateAlternateColorCodes('&', two))) {
					p.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, (1000000 * 20), 0));
				} else if (lore.contains(ChatColor.translateAlternateColorCodes('&', three))) {
					p.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, (1000000 * 20), 1));
				}
			} else if (p.getInventory().getBoots() != null && p.getInventory().getLeggings() == null
					&& p.getInventory().getChestplate() != null && p.getInventory().getHelmet() != null
					&& (m == diamondl || m == ironl || m == chainl || m == leatherl)) {
				if (lore.contains(ChatColor.translateAlternateColorCodes('&', one))) {
					p.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, (1000000 * 20), 0));
				} else if (lore.contains(ChatColor.translateAlternateColorCodes('&', two))) {
					p.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, (1000000 * 20), 0));
				} else if (lore.contains(ChatColor.translateAlternateColorCodes('&', three))) {
					p.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, (1000000 * 20), 1));
				}
			} else if (p.getInventory().getBoots() != null && p.getInventory().getLeggings() != null
					&& p.getInventory().getChestplate() == null && p.getInventory().getHelmet() != null
					&& (m == diamondc || m == ironc || m == chainc || m == leatherc)) {
				if (lore.contains(ChatColor.translateAlternateColorCodes('&', one))) {
					p.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, (1000000 * 20), 0));
				} else if (lore.contains(ChatColor.translateAlternateColorCodes('&', two))) {
					p.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, (1000000 * 20), 0));
				} else if (lore.contains(ChatColor.translateAlternateColorCodes('&', three))) {
					p.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, (1000000 * 20), 1));
				}
			} else if (p.getInventory().getBoots() != null && p.getInventory().getLeggings() != null
					&& p.getInventory().getChestplate() != null && p.getInventory().getHelmet() == null
					&& (m == diamondh || m == ironh || m == chainh || m == leatherh)) {
				if (lore.contains(ChatColor.translateAlternateColorCodes('&', one))) {
					p.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, (1000000 * 20), 0));
				} else if (lore.contains(ChatColor.translateAlternateColorCodes('&', two))) {
					p.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, (1000000 * 20), 0));
				} else if (lore.contains(ChatColor.translateAlternateColorCodes('&', three))) {
					p.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, (1000000 * 20), 1));
				}
			}
		}
	}
}
