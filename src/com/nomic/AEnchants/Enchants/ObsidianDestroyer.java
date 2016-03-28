package com.nomic.AEnchants.Enchants;

import java.util.List;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.configuration.ConfigurationSection;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockDamageEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import com.nomic.AEnchants.Main;

public class ObsidianDestroyer implements Listener {
	
	private Main plugin;

	public ObsidianDestroyer(Main pl) {
		plugin = pl;
	}

	@EventHandler(priority = EventPriority.HIGH)
	public void onMine(BlockDamageEvent e) {
		
		ConfigurationSection names = plugin.getConfig().getConfigurationSection("enchantNames");
		String one = names.getConfigurationSection("ObsidianDestroyer").getString("one");
		String two = names.getConfigurationSection("ObsidianDestroyer").getString("two");
		String three = names.getConfigurationSection("ObsidianDestroyer").getString("three");
		String tOne = ChatColor.translateAlternateColorCodes('&', one);
		String tTwo = ChatColor.translateAlternateColorCodes('&', two);
		String tThree = ChatColor.translateAlternateColorCodes('&', three);
		
		Player p = e.getPlayer();
		if (p.getItemInHand().getType() == Material.AIR)
			return;
		List<String> lore = p.getItemInHand().getItemMeta().getLore();
		if (e.getBlock().getType() != Material.OBSIDIAN)
			return;
		if (lore == null)
			return;
		if (lore.contains(tOne)) {
			p.addPotionEffect(new PotionEffect(PotionEffectType.FAST_DIGGING, (1 * 20), 1));
		} else if (lore.contains(tTwo)) {
			p.addPotionEffect(new PotionEffect(PotionEffectType.FAST_DIGGING, (1 * 20), 2));
		} else if (lore.contains(tThree)) {
			e.setInstaBreak(true);
		}
	}
}