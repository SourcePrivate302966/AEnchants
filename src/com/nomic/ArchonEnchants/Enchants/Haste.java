package com.nomic.ArchonEnchants.Enchants;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockDamageEvent;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class Haste implements Listener {

	@EventHandler(priority = EventPriority.NORMAL)
	public void onMine(BlockDamageEvent e) {
		Player p = e.getPlayer();
		ItemMeta meta = p.getItemInHand().getItemMeta();
		String tierOne = "&bHaste I";
		String tierTwo = "&eHaste II";
		String tierThree = "&cHaste III";
		if (!(meta.getLore().contains(ChatColor.translateAlternateColorCodes('&', tierOne))
				|| meta.getLore().contains(ChatColor.translateAlternateColorCodes('&', tierTwo))
				|| meta.getLore().contains(ChatColor.translateAlternateColorCodes('&', tierThree))))
			return;
		if (meta.getLore().contains(ChatColor.translateAlternateColorCodes('&', tierOne))) {
			p.addPotionEffect(new PotionEffect(PotionEffectType.FAST_DIGGING, (4 * 20), 0));
		}
		if (meta.getLore().contains(ChatColor.translateAlternateColorCodes('&', tierTwo))) {
			p.addPotionEffect(new PotionEffect(PotionEffectType.FAST_DIGGING, (4 * 20), 0));
		}
		if (meta.getLore().contains(ChatColor.translateAlternateColorCodes('&', tierThree))) {
			p.addPotionEffect(new PotionEffect(PotionEffectType.FAST_DIGGING, (4 * 20), 1));
		}
	}
}
