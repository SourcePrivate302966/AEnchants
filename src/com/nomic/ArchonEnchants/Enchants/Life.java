package com.nomic.ArchonEnchants.Enchants;

import java.util.Random;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.inventory.meta.ItemMeta;

public class Life implements Listener {

	@EventHandler(priority = EventPriority.HIGH)
	public void onPlayerHit(EntityDamageByEntityEvent e) {
		if (!(e.getEntity() instanceof Player && e.getDamager() instanceof Player))
			return;
		Player p = (Player) e.getDamager();
		ItemMeta meta = p.getItemInHand().getItemMeta();
		String tierOne = "&bLife I";
		String tierTwo = "&eLife II";
		if (!(meta.getLore().contains(ChatColor.translateAlternateColorCodes('&', tierOne))
				|| meta.getLore().contains(ChatColor.translateAlternateColorCodes('&', tierTwo))))
			return;
		double health = p.getHealth();
		int chance = (1 + new Random().nextInt(9));
		if (meta.getLore().contains(ChatColor.translateAlternateColorCodes('&', tierOne))) {
			if (chance == 1) {
				p.setHealth(health + 1);
			}
		}
		if (meta.getLore().contains(ChatColor.translateAlternateColorCodes('&', tierTwo))) {
			if (chance == 1) {
				p.setHealth(health + 2);
			}
		}
	}
}
