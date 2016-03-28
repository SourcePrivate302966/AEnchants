package com.nomic.AEnchants.Enchants;

import java.util.List;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.configuration.ConfigurationSection;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;

import com.nomic.AEnchants.Main;

public class Experience implements Listener {
	
	private Main plugin;
	
	public Experience(Main pl) {
		plugin = pl;
	}
	
	FileConfiguration config = plugin.getConfig();

	@EventHandler(priority = EventPriority.HIGH)
	public void onMine(BlockBreakEvent e) {
		
		ConfigurationSection names = plugin.getConfig().getConfigurationSection("enchantNames");
		String one = names.getConfigurationSection("Experience").getString("one");
		String two = names.getConfigurationSection("Experience").getString("two");
		String three = names.getConfigurationSection("Experience").getString("three");
		String tOne = ChatColor.translateAlternateColorCodes('&', one);
		String tTwo = ChatColor.translateAlternateColorCodes('&', two);
		String tThree = ChatColor.translateAlternateColorCodes('&', three);
		
		Player p = e.getPlayer();
		int exp = e.getExpToDrop();
		if (p.getItemInHand().getType() == Material.AIR)
			return;
		List<String> lore = p.getItemInHand().getItemMeta().getLore();
		if (config.getBoolean("enableExperienceEnchant", false)) {
			return;
		}
		if (lore == null)
			return;
		if (lore.contains(tOne)) {
			e.setExpToDrop(exp/3);
		} else if (lore.contains(tTwo)) {
			e.setExpToDrop(exp/2);
		} else if (lore.contains(tThree)) {
			e.setExpToDrop(exp);
		} 
	}
}