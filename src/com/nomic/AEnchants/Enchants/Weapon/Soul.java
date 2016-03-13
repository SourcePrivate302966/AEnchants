package com.nomic.AEnchants.Enchants.Weapon;

import java.util.List;
import java.util.Random;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
public class Soul implements Listener {

	@EventHandler(priority = EventPriority.HIGH)
	public void onPlayerHit(EntityDamageByEntityEvent e) {
		if (!(e.getEntity() instanceof Player && e.getDamager() instanceof Player))
			return;
		Player p = (Player) e.getDamager();
		if (!(p instanceof Player))
			return;
		Player enemy = (Player) e.getEntity();
		List<String> lore = p.getItemInHand().getItemMeta().getLore();
		String one = "&bSoul I";
		String two = "&eSoul II";
		if (lore == null)
			return;
		double health = p.getHealth();
		double ehealth = enemy.getHealth();
		int chance = (1 + new Random().nextInt(9));
		if (lore.contains(ChatColor.translateAlternateColorCodes('&', one))) {
			if (chance == 1) {
				p.setHealth(health + 1);
				enemy.setHealth(ehealth - 1);
			}
		} else if (lore.contains(ChatColor.translateAlternateColorCodes('&', two))) {
			if (chance == 1) {
				p.setHealth(health + 2);
				enemy.setHealth(ehealth - 2);
			}
		}
	}
}
