package com.nomic.ArchonEnchants.Enchants;

import java.util.List;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockDamageEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class Haste implements Listener {

	@EventHandler(priority = EventPriority.NORMAL)
	public void onMine(BlockDamageEvent e) {
		Player p = e.getPlayer();
		List<String> lore = p.getItemInHand().getItemMeta().getLore();
		String one = "&bHaste I";
		String two = "&eHaste II";
		String three = "&cHaste III";
		if (lore == null)
			return;
		if (lore.contains(ChatColor.translateAlternateColorCodes('&', one))) {
			p.addPotionEffect(new PotionEffect(PotionEffectType.FAST_DIGGING, (4 * 20), 0));
		} else if (lore.contains(ChatColor.translateAlternateColorCodes('&', two))) {
			p.addPotionEffect(new PotionEffect(PotionEffectType.FAST_DIGGING, (4 * 20), 0));
		} else if (lore.contains(ChatColor.translateAlternateColorCodes('&', three))) {
			p.addPotionEffect(new PotionEffect(PotionEffectType.FAST_DIGGING, (4 * 20), 1));
		}
	}
}
