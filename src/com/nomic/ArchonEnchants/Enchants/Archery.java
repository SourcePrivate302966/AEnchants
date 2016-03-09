package com.nomic.ArchonEnchants.Enchants;

import java.util.List;
import java.util.Random;

import org.bukkit.ChatColor;
import org.bukkit.entity.Arrow;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;

public class Archery implements Listener {

	@EventHandler(priority = EventPriority.HIGH)
	public void onPlayerHit(EntityDamageByEntityEvent e) {
		if (!(e.getEntity() instanceof Player && e.getDamager() instanceof Arrow))
			return;
		Arrow a = (Arrow) e.getDamager();
		if (!(a.getShooter() instanceof Player))
			return;
		Player p = (Player) a.getShooter();
		if (p.getItemInHand() == null)
			return;
		List<String> lore = p.getItemInHand().getItemMeta().getLore();
		String one = "&bArchery I";
		String two = "&eArchery II";
		if (lore == null)
			return;
		int chance = (1 + new Random().nextInt(9));
		if (lore.contains(ChatColor.translateAlternateColorCodes('&', one))) {
			if (chance == 1) {
				e.setDamage(e.getDamage() * 1.05);
			}
		} else if (lore.contains(ChatColor.translateAlternateColorCodes('&', two))) {
			if (chance == 1) {
				e.setDamage(e.getDamage() * 1.1);
			}
		}
	}
}
