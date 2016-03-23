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
import org.bukkit.util.Vector;

public class Retreat implements Listener {

	String one = "&bRetreat I";
	String two = "&eRetreat II";
	String three = "&cRetreat III";

	String tOne = ChatColor.translateAlternateColorCodes('&', one);
	String tTwo = ChatColor.translateAlternateColorCodes('&', two);
	String tThree = ChatColor.translateAlternateColorCodes('&', three);

	@EventHandler(priority = EventPriority.HIGH)
	public void onPlayerHit(EntityDamageByEntityEvent e) {
		if (!(e.getEntity() instanceof Player && e.getDamager() instanceof Player))
			return;
		Player p = (Player) e.getEntity();
		PlayerInventory inv = p.getInventory();
		List<String> hlore = inv.getHelmet().getItemMeta().getLore();
		List<String> clore = inv.getChestplate().getItemMeta().getLore();
		List<String> llore = inv.getLeggings().getItemMeta().getLore();
		List<String> blore = inv.getBoots().getItemMeta().getLore();
		double health = p.getHealth();
		if (!(health <= 6))
			return;
		if (inv.getChestplate() != null) {
			if (clore.contains(tOne)) {
				int chance = (1 + new Random().nextInt(19));
				if (chance == 1) {
					e.setCancelled(true);
					p.setVelocity(new Vector(0, 1.4, 0));
					p.setFallDistance(-9.5F);
					return;
				}
			} else if (clore.contains(tTwo)) {
				int chance = (1 + new Random().nextInt(9));
				if (chance == 1) {
					e.setCancelled(true);
					p.setVelocity(new Vector(0, 1.7, 0));
					p.setFallDistance(-14F);
					return;
				}
			} else if (clore.contains(tThree)) {
				int chance = (1 + new Random().nextInt(6));
				if (chance == 1) {
					e.setCancelled(true);
					p.setVelocity(new Vector(0, 2, 0));
					p.setFallDistance(-18.0F);
					return;
				}
			}
		}
		if (inv.getLeggings() != null) {
			if (llore.contains(tOne)) {
				int chance = (1 + new Random().nextInt(19));
				if (chance == 1) {
					e.setCancelled(true);
					p.setVelocity(new Vector(0, 1.4, 0));
					p.setFallDistance(-9.5F);
					return;
				}
			} else if (llore.contains(tTwo)) {
				int chance = (1 + new Random().nextInt(9));
				if (chance == 1) {
					e.setCancelled(true);
					p.setVelocity(new Vector(0, 1.7, 0));
					p.setFallDistance(-14F);
					return;
				}
			} else if (llore.contains(tThree)) {
				int chance = (1 + new Random().nextInt(6));
				if (chance == 1) {
					e.setCancelled(true);
					p.setVelocity(new Vector(0, 2, 0));
					p.setFallDistance(-18.0F);
					return;
				}
			}
		}
		if (inv.getBoots() != null) {
			if (blore.contains(tOne)) {
				int chance = (1 + new Random().nextInt(19));
				if (chance == 1) {
					e.setCancelled(true);
					p.setVelocity(new Vector(0, 1.4, 0));
					p.setFallDistance(-9.5F);
					return;
				}
			} else if (blore.contains(tTwo)) {
				int chance = (1 + new Random().nextInt(9));
				if (chance == 1) {
					e.setCancelled(true);
					p.setVelocity(new Vector(0, 1.7, 0));
					p.setFallDistance(-14F);
					return;
				}
			} else if (blore.contains(tThree)) {
				int chance = (1 + new Random().nextInt(6));
				if (chance == 1) {
					e.setCancelled(true);
					p.setVelocity(new Vector(0, 2, 0));
					p.setFallDistance(-18.0F);
					return;
				}
			}
		}
		if (inv.getHelmet() != null) {
			if (hlore.contains(tOne)) {
				int chance = (1 + new Random().nextInt(19));
				if (chance == 1) {
					e.setCancelled(true);
					p.setVelocity(new Vector(0, 1.4, 0));
					p.setFallDistance(-9.5F);
					return;
				}
			} else if (hlore.contains(tTwo)) {
				int chance = (1 + new Random().nextInt(9));
				if (chance == 1) {
					e.setCancelled(true);
					p.setVelocity(new Vector(0, 1.7, 0));
					p.setFallDistance(-14F);
					return;
				}
			} else if (hlore.contains(tThree)) {
				int chance = (1 + new Random().nextInt(6));
				if (chance == 1) {
					e.setCancelled(true);
					p.setVelocity(new Vector(0, 2, 0));
					p.setFallDistance(-18.0F);
					return;
				}
			}
		}
	}
}
