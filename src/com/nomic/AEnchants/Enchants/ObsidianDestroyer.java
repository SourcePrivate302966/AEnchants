package com.nomic.AEnchants.Enchants;

import java.util.List;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockDamageEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class ObsidianDestroyer implements Listener {
	
	String one = "&bObsidian Destroyer I";
	String two = "&eObsidian Destroyer II";
	String three = "&cObsidian Destroyer III";
	
	String tOne = ChatColor.translateAlternateColorCodes('&', one);
	String tTwo = ChatColor.translateAlternateColorCodes('&', two);
	String tThree = ChatColor.translateAlternateColorCodes('&', three);

	@EventHandler(priority = EventPriority.HIGH)
	public void onMine(BlockDamageEvent e) {
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
