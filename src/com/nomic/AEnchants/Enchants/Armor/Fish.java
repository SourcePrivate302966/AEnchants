package com.nomic.AEnchants.Enchants.Armor;

import java.util.List;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryType.SlotType;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import com.nomic.AEnchants.Events.ArmorDrag;
import com.nomic.AEnchants.Events.ArmorHotbar;
import com.nomic.AEnchants.Events.ArmorShift;

public class Fish implements Listener {
	
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
	
	String one = "&bFish I";
	
	String tOne = ChatColor.translateAlternateColorCodes('&', one);
	
	@EventHandler
	public void shift(ArmorShift e) {
		Player p = e.getPlayer();
		List<String> lore = e.getLore();
		SlotType stype = e.getSlotType();
		PlayerInventory inv = p.getInventory();
		if (!(lore.contains(tOne)))
			return;
		if (stype == SlotType.ARMOR && inv.getHelmet() != null) {
			if (lore.contains(tOne)) {
				p.removePotionEffect(PotionEffectType.WATER_BREATHING);
			}
		} else if (stype != SlotType.ARMOR && inv.getHelmet() == null) {
			if (lore.contains(tOne)) {
				p.addPotionEffect(new PotionEffect(PotionEffectType.WATER_BREATHING, 1000000 * 20, 0));
			} 
		}
	}
	
	@EventHandler
	public void hotbar(ArmorHotbar e) {
		Player p = e.getPlayer();
		List<String> lore = e.getLore();
		Material m = e.getItem().getType();
		PlayerInventory inv = p.getInventory();
		if (!(lore.contains(tOne)))
			return;
		if (m == diamondh || m == ironh || m == chainh || m == leatherh) {
			if (inv.getHelmet() == null) {
				if (lore.contains(tOne)) {
					p.addPotionEffect(new PotionEffect(PotionEffectType.WATER_BREATHING, 1000000 * 20, 0));
				} 
			}
		}
	}
	
	@EventHandler
	public void drag(ArmorDrag e) {
		Player p = e.getPlayer();
		PlayerInventory inv = p.getInventory();
		Material cm = e.getCItem().getType();
		Material m = e.getItem().getType();
		SlotType stype = e.getSlotType();
		if (stype == SlotType.ARMOR) {
			if (e.getCItem() != null && cm == diamondh || cm == ironh || cm == chainh || cm == leatherh) {
				if (inv.getHelmet() != null && m != null) {
					List<String> lore = e.getCItem().getItemMeta().getLore();
					if (lore == null)
						return;
					if (lore.contains(tOne)) {
						p.removePotionEffect(PotionEffectType.WATER_BREATHING);
					}
				} 
			} else if (m == diamondh || m == ironh || m == chainh || m == leatherh) {
				if (e.getItem() != null) {
					List<String> lore = e.getItem().getItemMeta().getLore();
					if (lore == null)
						return;
					if (lore.contains(tOne)) {
						p.addPotionEffect(new PotionEffect(PotionEffectType.WATER_BREATHING, 1000000 * 20, 0));
					}  
				}
			}
		} 
	}
}
