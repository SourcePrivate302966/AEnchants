package com.nomic.AEnchants.Enchants.Weapon;

import java.util.List;
import java.util.Random;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;

public class Soul implements Listener {

	String one = "&bSoul I";
	String two = "&eSoul II";

	String tOne = ChatColor.translateAlternateColorCodes('&', one);
	String tTwo = ChatColor.translateAlternateColorCodes('&', two);

	@EventHandler(priority = EventPriority.HIGH)
	public void onPlayerHit(EntityDamageByEntityEvent e) {
		if (!(e.getEntity() instanceof Player && e.getDamager() instanceof Player))
			return;
		Player p = (Player) e.getDamager();
		if (!(p instanceof Player))
			return;
		Player enemy = (Player) e.getEntity();
		if (p.getItemInHand().getType() == Material.AIR)
			return;
		List<String> lore = p.getItemInHand().getItemMeta().getLore();
		if (lore == null)
			return;
		double health = p.getHealth();
		double maxhealth = p.getMaxHealth();
		double ehealth = enemy.getHealth();
		int chance = (1 + new Random().nextInt(9));
		if (lore.contains(tOne)) {
			if (chance == 1) {
				enemy.setHealth(ehealth - 1);
				if (health == maxhealth)
					return;
				if (health <= maxhealth - 1) {
					p.setHealth(health + 1);
				}
			}
		} else if (lore.contains(tTwo)) {
			if (chance == 1) {
				enemy.setHealth(ehealth - 2);
				if (health == maxhealth)
					return;
				if (health == maxhealth - 1) {
					p.setHealth(health + 1);
				} else if (health <= maxhealth - 2) {
					p.setHealth(health + 2);
				}
			}
		}
	}
}
