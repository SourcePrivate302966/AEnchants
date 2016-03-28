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
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import com.nomic.AEnchants.Main;

public class LightsOut implements Listener {
	
	private Main plugin;

	public LightsOut(Main pl) {
		plugin = pl;
	}

	@EventHandler(priority = EventPriority.HIGH)
	public void onPlayerHit(EntityDamageByEntityEvent e) {
		
		ConfigurationSection names = plugin.getConfig().getConfigurationSection("enchantNames");
		String one = names.getConfigurationSection("LightsOut").getString("one");
		String two = names.getConfigurationSection("LightsOut").getString("two");
		String tOne = ChatColor.translateAlternateColorCodes('&', one);
		String tTwo = ChatColor.translateAlternateColorCodes('&', two);
		String anti = names.getConfigurationSection("AntiFog").getString("one");
		String tAnti = ChatColor.translateAlternateColorCodes('&', anti);
		
		if (!(e.getEntity() instanceof Player && e.getDamager() instanceof Player))
			return;
		Player p = (Player) e.getDamager();
		Player enemy = (Player) e.getEntity();
		if (p.getItemInHand().getType() == Material.AIR)
			return;
		List<String> lore = p.getItemInHand().getItemMeta().getLore();
		if (lore == null)
			return;
		PlayerInventory einv = enemy.getInventory();
		List<String> ehlore = einv.getHelmet().getItemMeta().getLore();
		List<String> eclore = einv.getChestplate().getItemMeta().getLore();
		List<String> ellore = einv.getLeggings().getItemMeta().getLore();
		List<String> eblore = einv.getBoots().getItemMeta().getLore();
		if (einv.getHelmet() != null) {
			if (ehlore.contains(tAnti)) {
				return;
			}
		} 
		if (einv.getChestplate() != null) {
			if (eclore.contains(tAnti)) {
				return;
			}
		} 
		if (einv.getLeggings() != null) {
			if (ellore.contains(tAnti)) {
				return;
			}
		} 
		if (einv.getBoots() != null) {
			if (eblore.contains(tAnti)) {
				return;
			}
		}
		if (lore.contains(tOne)) {
			int chance = (1 + new Random().nextInt(24));
			if (chance == 1) {
				enemy.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, (3 * 20), 0));
			}
		} else if (lore.contains(tTwo)) {
			int chance = (1 + new Random().nextInt(19));
			if (chance == 1) {
				enemy.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, (6 * 20), 0));
			}
		}
	}
}
