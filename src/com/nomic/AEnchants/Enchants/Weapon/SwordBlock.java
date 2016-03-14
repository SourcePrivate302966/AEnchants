package com.nomic.AEnchants.Enchants.Weapon;

import java.util.List;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;

public class SwordBlock implements Listener {
	
	String one = "&bSword Block I";
	
	String tOne = ChatColor.translateAlternateColorCodes('&', one);
	
	@EventHandler(priority = EventPriority.HIGH)
	public void onAttack(EntityDamageByEntityEvent e) {
		if (!(e.getEntity() instanceof Player && e.getDamager() instanceof Player))
			return;
		Player p = (Player) e.getEntity();
		if (!(p.isBlocking()))
			return;
		if (p.getItemInHand().getType() == Material.AIR)
			return;
		List<String> lore = p.getItemInHand().getItemMeta().getLore();
		if (!(lore.contains(tOne)))
			return;
		double damage = e.getDamage();
		p.setLastDamage(damage * 0.95);
	}
}
