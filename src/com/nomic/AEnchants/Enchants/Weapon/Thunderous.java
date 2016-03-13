package com.nomic.AEnchants.Enchants.Weapon;

import java.util.List;
import java.util.Random;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;

public class Thunderous implements Listener {

	@EventHandler(priority = EventPriority.HIGH)
	public void onPlayerHit(EntityDamageByEntityEvent e) {
		if (!(e.getEntity() instanceof Player && e.getDamager() instanceof Player))
			return;
		Player p = (Player) e.getDamager();
		Player enemy = (Player) e.getEntity();
		Location l = enemy.getLocation();
		if (p.getItemInHand() == null)
			return;
		List<String> lore = p.getItemInHand().getItemMeta().getLore();
		String one = "&bThunderous I";
		String two = "&eThunderous II";
		String three = "&cThunderous III";
		if (lore == null)
			return;
		double health = enemy.getHealth();
		if (lore.contains(ChatColor.translateAlternateColorCodes('&', one))) {
			int chance = (1 + new Random().nextInt(19));
			if (chance == 1) {
				l.getWorld().strikeLightning(l);
			}
		} else if (lore.contains(ChatColor.translateAlternateColorCodes('&', two))) {
			int chance = (1 + new Random().nextInt(9));
			if (chance == 1) {
				l.getWorld().strikeLightning(l);
				enemy.setHealth(health - 2);
			}
		} else if (lore.contains(ChatColor.translateAlternateColorCodes('&', three))) {
			int chance = (1 + new Random().nextInt(6));
			if (chance == 1) {
				l.getWorld().strikeLightning(l);
				enemy.setHealth(health - 4);
			}
		}
	}
}
