package com.nomic.ArchonEnchants.Enchants;

import java.util.Random;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.entity.Arrow;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.inventory.meta.ItemMeta;

public class Lightning implements Listener {

	@EventHandler(priority = EventPriority.HIGH)
	public void onHit(EntityDamageByEntityEvent e) {
		if (!(e.getEntity() instanceof Player && e.getDamager() instanceof Arrow))
			return;
		Arrow arrow = (Arrow) e.getDamager();
		Player p = (Player) arrow.getShooter();
		Player hit = (Player) e.getEntity();
		Location l = e.getEntity().getLocation();
		ItemMeta meta = p.getItemInHand().getItemMeta();
		String tierOne = "&bLightning I";
		String tierTwo = "&eLightning II";
		String tierThree = "&cLightning III";
		if (!(meta.getLore().contains(ChatColor.translateAlternateColorCodes('&', tierOne))
				|| meta.getLore().contains(ChatColor.translateAlternateColorCodes('&', tierTwo))
				|| meta.getLore().contains(ChatColor.translateAlternateColorCodes('&',tierThree))))
			return;
		double health = hit.getHealth();
		if (meta.getLore().contains(ChatColor.translateAlternateColorCodes('&', tierOne))) {
			int chance = (1 + new Random().nextInt(32));
			if (chance == 1) {
				l.getWorld().strikeLightning(l);
			}
		}
		if (meta.getLore().contains(ChatColor.translateAlternateColorCodes('&', tierTwo))) {
			int chance = (1 + new Random().nextInt(19));
			if (chance == 1) {
				l.getWorld().strikeLightning(l);
				hit.setHealth(health - 2);
			}
		}
		if (meta.getLore().contains(ChatColor.translateAlternateColorCodes('&',tierThree))) {
			int chance = (1 + new Random().nextInt(9));
			if (chance == 1) {
				l.getWorld().strikeLightning(l);
				hit.setHealth(health - 4);
			}
		}
	}
}
