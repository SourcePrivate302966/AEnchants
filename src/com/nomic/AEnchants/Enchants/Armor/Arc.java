package com.nomic.AEnchants.Enchants.Armor;

import java.util.List;
import java.util.Random;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.configuration.ConfigurationSection;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.inventory.PlayerInventory;

import com.nomic.AEnchants.Main;

public class Arc implements Listener {
	
	private Main plugin;

	public Arc(Main pl) {
		plugin = pl;
	}

	@EventHandler(priority = EventPriority.HIGH)
	public void onPlayerHit(EntityDamageByEntityEvent e) {
		
		ConfigurationSection names = plugin.getConfig().getConfigurationSection("enchantNames");
		String one = names.getConfigurationSection("Arc").getString("one");
		String tOne = ChatColor.translateAlternateColorCodes('&', one);
		
		if (!(e.getEntity() instanceof Player && e.getDamager() instanceof Player))
			return;
		Player p = (Player) e.getEntity();
		Player enemy = (Player) e.getDamager();
		PlayerInventory inv = p.getInventory();
		List<String> hlore = inv.getHelmet().getItemMeta().getLore();
		List<String> clore = inv.getChestplate().getItemMeta().getLore();
		List<String> llore = inv.getLeggings().getItemMeta().getLore();
		List<String> blore = inv.getBoots().getItemMeta().getLore();
		Location l = enemy.getLocation();
		double health = enemy.getHealth();
		if (inv.getChestplate() != null) {
			if (clore.contains(tOne)) {
				int chance = (1 + new Random().nextInt(19));
				if (chance == 1) {
					l.getWorld().strikeLightning(l);
					enemy.setHealth(health - 1);
					return;
				}
			}
		}
		if (inv.getLeggings() != null) {
			if (llore.contains(tOne)) {
				int chance = (1 + new Random().nextInt(19));
				if (chance == 1) {
					l.getWorld().strikeLightning(l);
					enemy.setHealth(health - 1);
					return;
				}
			}
		}
		if (inv.getBoots() != null) {
			if (blore.contains(tOne)) {
				int chance = (1 + new Random().nextInt(19));
				if (chance == 1) {
					l.getWorld().strikeLightning(l);
					enemy.setHealth(health - 1);
					return;
				}
			}
		}
		if (inv.getHelmet() != null) {
			if (hlore.contains(tOne)) {
				int chance = (1 + new Random().nextInt(19));
				if (chance == 1) {
					l.getWorld().strikeLightning(l);
					enemy.setHealth(health - 1);
					return;
				}
			}
		}
	}
}
