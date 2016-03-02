package com.nomic.ArchonEnchants.Enchants;

import java.util.List;
import java.util.Random;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class Confusion implements Listener {
	
	@EventHandler(priority = EventPriority.HIGH)
	public void onPlayerHit(EntityDamageByEntityEvent e) {
		if (!(e.getEntity() instanceof Player && e.getDamager() instanceof Player))
			return;
		Player p = (Player) e.getDamager();
		Player enemy = (Player) e.getEntity();
		List<String> lore = p.getItemInHand().getItemMeta().getLore();
		String one = "&bConfusion I";
		String two = "&eConfusion II";
		if (lore == null)
			return;
		if (lore.contains(ChatColor.translateAlternateColorCodes('&',one))) {
			int chance = (1 + new Random().nextInt(19));
			if (chance == 1) {
				enemy.addPotionEffect(new PotionEffect(PotionEffectType.CONFUSION, (3 * 20), 0));
			}
		} else if (lore.contains(ChatColor.translateAlternateColorCodes('&',two))) {
			int chance = (1 + new Random().nextInt(9));
			if (chance == 1) {
				enemy.addPotionEffect(new PotionEffect(PotionEffectType.CONFUSION, (6 * 20), 0));
			}
		}
	}
}
