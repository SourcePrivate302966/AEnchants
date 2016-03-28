package com.nomic.AEnchants.Enchants;

import java.util.List;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.configuration.ConfigurationSection;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockDamageEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import com.nomic.AEnchants.Main;

public class Haste implements Listener {
	
	private Main plugin;

	public Haste(Main pl) {
		plugin = pl;
	}

	@EventHandler
	public void onMine(BlockDamageEvent e) {
		
		ConfigurationSection names = plugin.getConfig().getConfigurationSection("enchantNames");
		String one = names.getConfigurationSection("Haste").getString("one");
		String two = names.getConfigurationSection("Haste").getString("two");
		String three = names.getConfigurationSection("Haste").getString("three");
		String tOne = ChatColor.translateAlternateColorCodes('&', one);
		String tTwo = ChatColor.translateAlternateColorCodes('&', two);
		String tThree = ChatColor.translateAlternateColorCodes('&', three);
		
		Player p = e.getPlayer();
		if (p.getItemInHand().getType() == Material.AIR)
			return;
		List<String> lore = p.getItemInHand().getItemMeta().getLore();
		if (lore == null)
			return;
		if (lore.contains(tOne)) {
			p.addPotionEffect(new PotionEffect(PotionEffectType.FAST_DIGGING, (4 * 20), 0));
		} else if (lore.contains(tTwo)) {
			p.addPotionEffect(new PotionEffect(PotionEffectType.FAST_DIGGING, (4 * 20), 0));
		} else if (lore.contains(tThree)) {
			p.addPotionEffect(new PotionEffect(PotionEffectType.FAST_DIGGING, (4 * 20), 1));
		}
	}
}