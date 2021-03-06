package com.nomic.AEnchants.Enchants.Weapon;

import java.util.List;
import java.util.Random;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.configuration.ConfigurationSection;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;

import com.nomic.AEnchants.Main;

public class Soul implements Listener {
	
	private Main plugin;

	public Soul(Main pl) {
		plugin = pl;
	}

	@EventHandler(priority = EventPriority.HIGH)
	public void onPlayerHit(EntityDamageByEntityEvent e) {
		
		ConfigurationSection names = plugin.getConfig().getConfigurationSection("enchantNames");
		String one = names.getConfigurationSection("Soul").getString("one");
		String two = names.getConfigurationSection("Soul").getString("two");
		String tOne = ChatColor.translateAlternateColorCodes('&', one);
		String tTwo = ChatColor.translateAlternateColorCodes('&', two);
		
		if (!(e.getEntity() instanceof Player && e.getDamager() instanceof Player))
			return;
		Player p = (Player) e.getDamager();
		if (!(p instanceof Player))
			return;
		Player enemy = (Player) e.getEntity();
		if (p.getItemInHand().getType() == Material.AIR)
			return;
		List<String> lore = p.getItemInHand().getItemMeta().getLore();
		if (lore == null)
			return;
		double health = p.getHealth();
		double maxhealth = p.getMaxHealth();
		double ehealth = enemy.getHealth();
		int chance = (1 + new Random().nextInt(19));
		if (lore.contains(tOne)) {
			if (chance == 1) {
				enemy.setHealth(ehealth - 1);
				if (health == maxhealth)
					return;
				if (health <= maxhealth - 1) {
					p.setHealth(health + 1);
				}
			}
		} else if (lore.contains(tTwo)) {
			if (chance == 1) {
				enemy.setHealth(ehealth - 2);
				if (health == maxhealth)
					return;
				if (health == maxhealth - 1) {
					p.setHealth(health + 1);
				} else if (health <= maxhealth - 2) {
					p.setHealth(health + 2);
				}
			}
		}
	}
}
