package com.nomic.AEnchants.Enchants.Weapon;

import java.util.List;
import java.util.Random;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Arrow;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;

public class Thief implements Listener {
	
	String one = "&bThief I";
	String two = "&eThief II";
	String three = "&cThief III";
	
	String tOne = ChatColor.translateAlternateColorCodes('&', one);
	String tTwo = ChatColor.translateAlternateColorCodes('&', two);
	String tThree = ChatColor.translateAlternateColorCodes('&', three);

	@EventHandler(priority = EventPriority.HIGH)
	public void onHit(EntityDamageByEntityEvent e) {
		if (!(e.getEntity() instanceof Player && e.getDamager() instanceof Arrow))
			return;
		Arrow arrow = (Arrow) e.getDamager();
		Player p = (Player) arrow.getShooter();
		Player hit = (Player) e.getEntity();
		if (p.getItemInHand().getType() == Material.AIR)
			return;
		List<String> lore = p.getItemInHand().getItemMeta().getLore();
		if (lore == null)
			return;
		double health = hit.getHealth();
		double phealth = p.getHealth();
		if (lore.contains(tOne)) {
			int chance = (1 + new Random().nextInt(32));
			if (chance == 1) {
				hit.setHealth(health - 2);
				p.setHealth(phealth + 2);
			}
		} else if (lore.contains(tTwo)) {
			int chance = (1 + new Random().nextInt(19));
			if (chance == 1) {
				hit.setHealth(health - 2);
				p.setHealth(phealth + 2);
			}
		} else if (lore.contains(tThree)) {
			int chance = (1 + new Random().nextInt(9));
			if (chance == 1) {
				hit.setHealth(health - 2);
				p.setHealth(phealth + 2);
			}
		}
	}
}
