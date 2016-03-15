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
		if (inv.getLeggings() == null)
			return;
		List<String> llore = inv.getLeggings().getItemMeta().getLore();
		if (llore == null)
			return;
		double health = p.getHealth();
		if (health <= 6) {
			if (llore.contains(tOne)) {
				int chance = (1 + new Random().nextInt(19));
				if (chance == 1) {
					e.setCancelled(true);
					p.setVelocity(new Vector(0, 1.4, 0));
					p.setFallDistance(-9.5F);
				}
			} else if (llore.contains(tTwo)) {
				int chance = (1 + new Random().nextInt(9));
				if (chance == 1) {
					e.setCancelled(true);
					p.setVelocity(new Vector(0, 1.7, 0));
					p.setFallDistance(-14F);
				}
			} else if (llore.contains(tThree)) {
				int chance = (1 + new Random().nextInt(6));
				if (chance == 1) {
					e.setCancelled(true);
					p.setVelocity(new Vector(0, 2, 0));
					p.setFallDistance(-18.0F);
				}
			}
		}
	}
}
