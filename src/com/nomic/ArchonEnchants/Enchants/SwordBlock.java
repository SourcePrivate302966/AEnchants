package com.nomic.ArchonEnchants.Enchants;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.inventory.meta.ItemMeta;

public class SwordBlock implements Listener {
	
	@EventHandler(priority = EventPriority.HIGH)
	public void onAttack(EntityDamageByEntityEvent e) {
		if (!(e.getEntity() instanceof Player && e.getDamager() instanceof Player))
			return;
		Player p = (Player) e.getEntity();
		if (!(p.isBlocking()))
			return;
		ItemMeta meta = p.getItemInHand().getItemMeta();
		String tierOne = "&bSword Block I";
		if (!(meta.getLore().contains(ChatColor.translateAlternateColorCodes('&', tierOne))))
			return;
		double damage = e.getDamage();
		p.setLastDamage(damage * 0.95);
	}
}
