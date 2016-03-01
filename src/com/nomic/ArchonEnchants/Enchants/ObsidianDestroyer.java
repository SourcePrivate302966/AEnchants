package com.nomic.ArchonEnchants.Enchants;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockDamageEvent;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class ObsidianDestroyer implements Listener {

	@EventHandler(priority = EventPriority.HIGH)
	public void onMine(BlockDamageEvent e) {
		Player p = e.getPlayer();
		ItemMeta meta = p.getItemInHand().getItemMeta();
		if (e.getBlock().getType() != Material.OBSIDIAN)
			return;
		String tierOne = "&bObsidian Destroyer I";
		String tierTwo = "&eObsidian Destroyer II";
		String tierThree = "&cObsidian Destroyer III";
		if (!(meta.getLore().contains(ChatColor.translateAlternateColorCodes('&', tierOne))
				|| meta.getLore().contains(ChatColor.translateAlternateColorCodes('&', tierTwo))
				|| meta.getLore().contains(ChatColor.translateAlternateColorCodes('&',tierThree))))
			return;
		if (meta.getLore().contains(ChatColor.translateAlternateColorCodes('&',tierOne))) {
			p.addPotionEffect(new PotionEffect(PotionEffectType.FAST_DIGGING, (1 * 20), 1));
		}
		if (meta.getLore().contains(ChatColor.translateAlternateColorCodes('&',tierTwo))) {
			p.addPotionEffect(new PotionEffect(PotionEffectType.FAST_DIGGING, (1 * 20), 2));
		}
		if (meta.getLore().contains(ChatColor.translateAlternateColorCodes('&',tierThree))) {
			e.setInstaBreak(true);
		}
	}
}
