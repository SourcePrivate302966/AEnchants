package com.nomic.AEnchants.Enchants;

import java.util.List;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockDamageEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class Haste implements Listener {
	
	String one = "&bHaste I";
	String two = "&eHaste II";
	String three = "&cHaste III";
	
	String tOne = ChatColor.translateAlternateColorCodes('&', one);
	String tTwo = ChatColor.translateAlternateColorCodes('&', two);
	String tThree = ChatColor.translateAlternateColorCodes('&', three);

	@EventHandler
	public void onMine(BlockDamageEvent e) {
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
