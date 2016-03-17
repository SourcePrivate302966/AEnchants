package com.nomic.AEnchants.Enchants.Armor;

import java.util.List;
import java.util.Random;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class Tipsy implements Listener {
	
	String one = "&bTipsy I";
	String two = "&eTipsy II";
	String three = "&cTipsy III";
	
	String tOne = ChatColor.translateAlternateColorCodes('&', one);
	String tTwo = ChatColor.translateAlternateColorCodes('&', two);
	String tThree = ChatColor.translateAlternateColorCodes('&', three);

	@EventHandler(priority = EventPriority.HIGH)
	public void onPlayerHit(EntityDamageByEntityEvent e) {
		if (!(e.getEntity() instanceof Player && e.getDamager() instanceof Player))
			return;
		Player p = (Player) e.getEntity();
		Player enemy = (Player) e.getDamager();
		PlayerInventory inv = p.getInventory();
		List<String> clore = inv.getChestplate().getItemMeta().getLore();
		List<String> llore = inv.getLeggings().getItemMeta().getLore();
		List<String> blore = inv.getBoots().getItemMeta().getLore();
		if (inv.getChestplate() != null && clore != null) {
			if (clore.contains(tOne)) {
				int chance = (1 + new Random().nextInt(19));
				if (chance == 1) {
					enemy.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 2 * 20, 0));
					enemy.addPotionEffect(new PotionEffect(PotionEffectType.SLOW_DIGGING, 2 * 20, 0));
					int newchance = (1 + new Random().nextInt(9));
					if (newchance == 1) {
						enemy.addPotionEffect(new PotionEffect(PotionEffectType.CONFUSION, (2 * 20), 0));
					}
				}
			} else if (clore.contains(tTwo)) {
				int chance = (1 + new Random().nextInt(9));
				if (chance == 1) {
					enemy.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 3 * 20, 0));
					enemy.addPotionEffect(new PotionEffect(PotionEffectType.SLOW_DIGGING, 3 * 20, 0));
					int newchance = (1 + new Random().nextInt(9));
					if (newchance == 1) {
						enemy.addPotionEffect(new PotionEffect(PotionEffectType.CONFUSION, (3 * 20), 0));
					}
				}
			} else if (clore.contains(tThree)) {
				int chance = (1 + new Random().nextInt(6));
				if (chance == 1) {
					enemy.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 6 * 20, 0));
					enemy.addPotionEffect(new PotionEffect(PotionEffectType.SLOW_DIGGING, 6 * 20, 0));
					int newchance = (1 + new Random().nextInt(9));
					if (newchance == 1) {
						enemy.addPotionEffect(new PotionEffect(PotionEffectType.CONFUSION, (6 * 20), 0));
					}
				}
			}
		} else if (inv.getLeggings() != null && llore != null) {
			if (llore.contains(tOne)) {
				int chance = (1 + new Random().nextInt(19));
				if (chance == 1) {
					enemy.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 2 * 20, 0));
					enemy.addPotionEffect(new PotionEffect(PotionEffectType.SLOW_DIGGING, 2 * 20, 0));
					int newchance = (1 + new Random().nextInt(9));
					if (newchance == 1) {
						enemy.addPotionEffect(new PotionEffect(PotionEffectType.CONFUSION, (2 * 20), 0));
					}
				}
			} else if (llore.contains(tTwo)) {
				int chance = (1 + new Random().nextInt(9));
				if (chance == 1) {
					enemy.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 3 * 20, 0));
					enemy.addPotionEffect(new PotionEffect(PotionEffectType.SLOW_DIGGING, 3 * 20, 0));
					int newchance = (1 + new Random().nextInt(9));
					if (newchance == 1) {
						enemy.addPotionEffect(new PotionEffect(PotionEffectType.CONFUSION, (3 * 20), 0));
					}
				}
			} else if (llore.contains(tThree)) {
				int chance = (1 + new Random().nextInt(6));
				if (chance == 1) {
					enemy.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 6 * 20, 0));
					enemy.addPotionEffect(new PotionEffect(PotionEffectType.SLOW_DIGGING, 6 * 20, 0));
					int newchance = (1 + new Random().nextInt(9));
					if (newchance == 1) {
						enemy.addPotionEffect(new PotionEffect(PotionEffectType.CONFUSION, (6 * 20), 0));
					}
				}
			}
		} else if (inv.getBoots() != null && blore != null) {
			if (blore.contains(tOne)) {
				int chance = (1 + new Random().nextInt(19));
				if (chance == 1) {
					enemy.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 2 * 20, 0));
					enemy.addPotionEffect(new PotionEffect(PotionEffectType.SLOW_DIGGING, 2 * 20, 0));
					int newchance = (1 + new Random().nextInt(9));
					if (newchance == 1) {
						enemy.addPotionEffect(new PotionEffect(PotionEffectType.CONFUSION, (2 * 20), 0));
					}
				}
			} else if (blore.contains(tTwo)) {
				int chance = (1 + new Random().nextInt(9));
				if (chance == 1) {
					enemy.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 3 * 20, 0));
					enemy.addPotionEffect(new PotionEffect(PotionEffectType.SLOW_DIGGING, 3 * 20, 0));
					int newchance = (1 + new Random().nextInt(9));
					if (newchance == 1) {
						enemy.addPotionEffect(new PotionEffect(PotionEffectType.CONFUSION, (3 * 20), 0));
					}
				}
			} else if (blore.contains(tThree)) {
				int chance = (1 + new Random().nextInt(6));
				if (chance == 1) {
					enemy.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 6 * 20, 0));
					enemy.addPotionEffect(new PotionEffect(PotionEffectType.SLOW_DIGGING, 6 * 20, 0));
					int newchance = (1 + new Random().nextInt(9));
					if (newchance == 1) {
						enemy.addPotionEffect(new PotionEffect(PotionEffectType.CONFUSION, (3 * 20), 0));
					}
				}
			}
		}
	}
}
