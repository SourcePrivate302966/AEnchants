package com.nomic.AEnchants.Enchants;

import java.util.List;

import org.bukkit.ChatColor;
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
	
	String one = "&bExperience I";
	String two = "&eExperience II";
	String three = "&cExperience III";
	
	String tOne = ChatColor.translateAlternateColorCodes('&', one);
	String tTwo = ChatColor.translateAlternateColorCodes('&', two);
	String tThree = ChatColor.translateAlternateColorCodes('&', three);
	
	FileConfiguration config = plugin.getConfig();

	@EventHandler(priority = EventPriority.HIGH)
	public void onMine(BlockBreakEvent e) {
		Player p = e.getPlayer();
		int exp = e.getExpToDrop();
		if (p.getItemInHand() == null)
			return;
		List<String> lore = p.getItemInHand().getItemMeta().getLore();
		if (lore == null)
			return;
		if (lore.contains(tOne)) {
			e.setExpToDrop(exp/3);
		} else if (lore.contains(tTwo)) {
			e.setExpToDrop(exp/2);
		} else if (lore.contains(tThree)) {
			e.setExpToDrop(exp);
		} else if (config.getBoolean("enableExperienceEnchant", true)) {
			e.setExpToDrop(0);
		}
	}
}
