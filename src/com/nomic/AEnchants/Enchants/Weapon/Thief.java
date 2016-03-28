package com.nomic.AEnchants.Enchants.Weapon;

import java.util.List;
import java.util.Random;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.configuration.ConfigurationSection;
import org.bukkit.entity.Arrow;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;

import com.nomic.AEnchants.Main;

public class Thief implements Listener {
	
	private Main plugin;

	public Thief(Main pl) {
		plugin = pl;
	}

	@EventHandler(priority = EventPriority.HIGH)
	public void onHit(EntityDamageByEntityEvent e) {
		
		ConfigurationSection names = plugin.getConfig().getConfigurationSection("enchantNames");
		String one = names.getConfigurationSection("Thief").getString("one");
		String two = names.getConfigurationSection("Thief").getString("two");
		String three = names.getConfigurationSection("Thief").getString("three");
		String tOne = ChatColor.translateAlternateColorCodes('&', one);
		String tTwo = ChatColor.translateAlternateColorCodes('&', two);
		String tThree = ChatColor.translateAlternateColorCodes('&', three);
		
		if (!(e.getEntity() instanceof Player && e.getDamager() instanceof Arrow))
			return;
		Arrow arrow = (Arrow) e.getDamager();
		Player p = (Player) arrow.getShooter();
		Player hit = (Player) e.getEntity();
		if (p.getItemInHand().getType() == Material.AIR)
			return;
		List<String> lore = p.getItemInHand().getItemMeta().getLore();
		if (lore == null)
			return;
		double health = hit.getHealth();
		double phealth = p.getHealth();
		if (lore.contains(tOne)) {
			int chance = (1 + new Random().nextInt(32));
			if (chance == 1) {
				hit.setHealth(health - 2);
				p.setHealth(phealth + 2);
			}
		} else if (lore.contains(tTwo)) {
			int chance = (1 + new Random().nextInt(19));
			if (chance == 1) {
				hit.setHealth(health - 2);
				p.setHealth(phealth + 2);
			}
		} else if (lore.contains(tThree)) {
			int chance = (1 + new Random().nextInt(9));
			if (chance == 1) {
				hit.setHealth(health - 2);
				p.setHealth(phealth + 2);
			}
		}
	}
}
