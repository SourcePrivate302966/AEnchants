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

	@EventHandler(priority = EventPriority.HIGH)
	public void onMine(BlockDamageEvent e) {
		Player p = e.getPlayer();
		if (p.getItemInHand() == null)
			return;
		List<String> lore = p.getItemInHand().getItemMeta().getLore();
		if (e.getBlock().getType() != Material.OBSIDIAN)
			return;
		String one = "&bObsidian Destroyer I";
		String two = "&eObsidian Destroyer II";
		String three = "&cObsidian Destroyer III";
		if (lore == null)
			return;
		if (lore.contains(ChatColor.translateAlternateColorCodes('&',one))) {
			p.addPotionEffect(new PotionEffect(PotionEffectType.FAST_DIGGING, (1 * 20), 1));
		} else if (lore.contains(ChatColor.translateAlternateColorCodes('&',two))) {
			p.addPotionEffect(new PotionEffect(PotionEffectType.FAST_DIGGING, (1 * 20), 2));
		} else if (lore.contains(ChatColor.translateAlternateColorCodes('&',three))) {
			e.setInstaBreak(true);
		}
	}
}
