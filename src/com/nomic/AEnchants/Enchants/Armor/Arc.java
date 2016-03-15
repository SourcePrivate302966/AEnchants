package com.nomic.AEnchants.Enchants.Armor;

import java.util.List;
import java.util.Random;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.inventory.PlayerInventory;

public class Arc implements Listener {

	String one = "&bArc I";

	String tOne = ChatColor.translateAlternateColorCodes('&', one);

	@EventHandler(priority = EventPriority.HIGH)
	public void onPlayerHit(EntityDamageByEntityEvent e) {
		if (!(e.getEntity() instanceof Player && e.getDamager() instanceof Player))
			return;
		Player p = (Player) e.getEntity();
		Player enemy = (Player) e.getDamager();
		PlayerInventory inv = p.getInventory();
		Location l = enemy.getLocation();
		List<String> clore = inv.getChestplate().getItemMeta().getLore();
		List<String> llore = inv.getLeggings().getItemMeta().getLore();
		List<String> blore = inv.getBoots().getItemMeta().getLore();
		double health = enemy.getHealth();
		if (inv.getChestplate() != null && clore != null) {
			if (clore.contains(tOne)) {
				int chance = (1 + new Random().nextInt(19));
				if (chance == 1) {
					l.getWorld().strikeLightning(l);
					enemy.setHealth(health - 1);
				}
			} 
		} else if (inv.getLeggings() != null && llore != null) {
			if (llore.contains(tOne)) {
				int chance = (1 + new Random().nextInt(19));
				if (chance == 1) {
					l.getWorld().strikeLightning(l);
					enemy.setHealth(health - 2);
				}
			} 
		} else if (inv.getBoots() != null && blore != null) {
			if (blore.contains(tOne)) {
				int chance = (1 + new Random().nextInt(19));
				if (chance == 1) {
					l.getWorld().strikeLightning(l);
					enemy.setHealth(health - 4);
				}
			}
		} 
	}
}
