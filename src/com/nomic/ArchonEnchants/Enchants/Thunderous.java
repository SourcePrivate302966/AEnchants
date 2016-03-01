package com.nomic.ArchonEnchants.Enchants;

import java.util.Random;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.inventory.meta.ItemMeta;

public class Thunderous implements Listener {

	@EventHandler(priority = EventPriority.HIGH)
	public void onPlayerHit(EntityDamageByEntityEvent e) {
		if (!(e.getEntity() instanceof Player && e.getDamager() instanceof Player))
			return;
		Player p = (Player) e.getDamager();
		Player enemy = (Player) e.getEntity();
		Location l = enemy.getLocation();
		ItemMeta meta = p.getItemInHand().getItemMeta();
		String tierOne = "&bThunderous I";
		String tierTwo = "&eThunderous II";
		String tierThree = "&cThunderous III";
		if (!(meta.getLore().contains(ChatColor.translateAlternateColorCodes('&', tierOne))
				|| meta.getLore().contains(ChatColor.translateAlternateColorCodes('&', tierTwo))
				|| meta.getLore().contains(ChatColor.translateAlternateColorCodes('&', tierThree))))
			return;
		double health = enemy.getHealth();
		if (meta.getLore().contains(ChatColor.translateAlternateColorCodes('&', tierOne))) {
			int chance = (1 + new Random().nextInt(19));
			if (chance == 1) {
				l.getWorld().strikeLightning(l);
			}
		}
		if (meta.getLore().contains(ChatColor.translateAlternateColorCodes('&', tierTwo))) {
			int chance = (1 + new Random().nextInt(9));
			if (chance == 1) {
				l.getWorld().strikeLightning(l);
				enemy.setHealth(health - 2);
			}
		}
		if (meta.getLore().contains(ChatColor.translateAlternateColorCodes('&', tierThree))) {
			int chance = (1 + new Random().nextInt(6));
			if (chance == 1) {
				l.getWorld().strikeLightning(l);
				enemy.setHealth(health - 4);
			}
		}
	}
}
