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

public class Archery implements Listener {
	
	private Main plugin;

	public Archery(Main pl) {
		plugin = pl;
	}

	@EventHandler(priority = EventPriority.HIGH)
	public void onPlayerHit(EntityDamageByEntityEvent e) {
		
		ConfigurationSection names = plugin.getConfig().getConfigurationSection("enchantNames");
		String one = names.getConfigurationSection("Archery").getString("one");
		String two = names.getConfigurationSection("Archery").getString("two");
		String tOne = ChatColor.translateAlternateColorCodes('&', one);
		String tTwo = ChatColor.translateAlternateColorCodes('&', two);
		
		if (!(e.getEntity() instanceof Player && e.getDamager() instanceof Arrow))
			return;
		Arrow a = (Arrow) e.getDamager();
		if (!(a.getShooter() instanceof Player))
			return;
		Player p = (Player) a.getShooter();
		if (p.getItemInHand().getType() == Material.AIR)
			return;
		List<String> lore = p.getItemInHand().getItemMeta().getLore();
		if (lore == null)
			return;
		int chance = (1 + new Random().nextInt(9));
		if (lore.contains(tOne)) {
			if (chance == 1) {
				e.setDamage(e.getDamage() * 1.05);
			}
		} else if (lore.contains(tTwo)) {
			if (chance == 1) {
				e.setDamage(e.getDamage() * 1.1);
			}
		}
	}
}