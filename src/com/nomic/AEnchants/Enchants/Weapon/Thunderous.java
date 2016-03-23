package com.nomic.AEnchants.Enchants.Weapon;

import java.util.List;
import java.util.Random;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;

public class Thunderous implements Listener {
	
	String one = "&bThunderous I";
	String two = "&eThunderous II";
	String three = "&cThunderous III";
	
	String tOne = ChatColor.translateAlternateColorCodes('&', one);
	String tTwo = ChatColor.translateAlternateColorCodes('&', two);
	String tThree = ChatColor.translateAlternateColorCodes('&', three);

	@EventHandler(priority = EventPriority.HIGH)
	public void onPlayerHit(EntityDamageByEntityEvent e) {
		if (!(e.getEntity() instanceof Player && e.getDamager() instanceof Player))
			return;
		Player p = (Player) e.getDamager();
		Player enemy = (Player) e.getEntity();
		Location l = enemy.getLocation();
		if (p.getItemInHand().getType() == Material.AIR)
			return;
		List<String> lore = p.getItemInHand().getItemMeta().getLore();
		if (lore == null)
			return;
		double health = enemy.getHealth();
		if (lore.contains(tOne)) {
			int chance = (1 + new Random().nextInt(65));
			if (chance == 1) {
				l.getWorld().strikeLightning(l);
			}
		} else if (lore.contains(tTwo)) {
			int chance = (1 + new Random().nextInt(32));
			if (chance == 1) {
				l.getWorld().strikeLightning(l);
				enemy.setHealth(health - 1);
			}
		} else if (lore.contains(tThree)) {
			int chance = (1 + new Random().nextInt(19));
			if (chance == 1) {
				l.getWorld().strikeLightning(l);
				enemy.setHealth(health - 2);
			}
		}
	}
}
