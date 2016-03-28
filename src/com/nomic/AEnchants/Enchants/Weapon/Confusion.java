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
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import com.nomic.AEnchants.Main;

public class Confusion implements Listener {
	
	private Main plugin;

	public Confusion(Main pl) {
		plugin = pl;
	}
	
	@EventHandler(priority = EventPriority.HIGH)
	public void onPlayerHit(EntityDamageByEntityEvent e) {
		
		ConfigurationSection names = plugin.getConfig().getConfigurationSection("enchantNames");
		String one = names.getConfigurationSection("Confusion").getString("one");
		String two = names.getConfigurationSection("Confusion").getString("two");
		String tOne = ChatColor.translateAlternateColorCodes('&', one);
		String tTwo = ChatColor.translateAlternateColorCodes('&', two);
		
		if (!(e.getEntity() instanceof Player && e.getDamager() instanceof Player))
			return;
		Player p = (Player) e.getDamager();
		Player enemy = (Player) e.getEntity();
		if (p.getItemInHand().getType() == Material.AIR)
			return;
		List<String> lore = p.getItemInHand().getItemMeta().getLore();
		if (lore == null)
			return;
		if (lore.contains(tOne)) {
			int chance = (1 + new Random().nextInt(19));
			if (chance == 1) {
				enemy.addPotionEffect(new PotionEffect(PotionEffectType.CONFUSION, (8 * 20), 8));
			}
		} else if (lore.contains(tTwo)) {
			int chance = (1 + new Random().nextInt(9));
			if (chance == 1) {
				enemy.addPotionEffect(new PotionEffect(PotionEffectType.CONFUSION, (10 * 20), 8));
			}
		}
	}
}
