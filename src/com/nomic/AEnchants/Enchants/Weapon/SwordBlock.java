package com.nomic.AEnchants.Enchants.Weapon;

import java.util.List;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;

public class SwordBlock implements Listener {
	
	@EventHandler(priority = EventPriority.HIGH)
	public void onAttack(EntityDamageByEntityEvent e) {
		if (!(e.getEntity() instanceof Player && e.getDamager() instanceof Player))
			return;
		Player p = (Player) e.getEntity();
		if (!(p.isBlocking()))
			return;
		List<String> lore = p.getItemInHand().getItemMeta().getLore();
		
		String one = "&bSword Block I";
		if (!(lore.contains(ChatColor.translateAlternateColorCodes('&', one))))
			return;
		double damage = e.getDamage();
		p.setLastDamage(damage * 0.95);
	}
}
