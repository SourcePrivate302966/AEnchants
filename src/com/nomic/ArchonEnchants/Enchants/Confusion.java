package com.nomic.ArchonEnchants.Enchants;

import java.util.Random;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class Confusion implements Listener {
	
	@EventHandler(priority = EventPriority.HIGH)
	public void onPlayerHit(EntityDamageByEntityEvent e) {
		if (!(e.getEntity() instanceof Player && e.getDamager() instanceof Player))
			return;
		Player p = (Player) e.getDamager();
		Player enemy = (Player) e.getEntity();
		ItemMeta meta = p.getItemInHand().getItemMeta();
		String tierOne = "&bConfusion I";
		String tierTwo = "&eConfusion II";
		if (!(meta.getLore().contains(ChatColor.translateAlternateColorCodes('&', tierOne))
				|| meta.getLore().contains(ChatColor.translateAlternateColorCodes('&',tierTwo))))
			return;
		if (meta.getLore().contains(ChatColor.translateAlternateColorCodes('&',tierOne))) {
			int chance = (1 + new Random().nextInt(19));
			if (chance == 1) {
				enemy.addPotionEffect(new PotionEffect(PotionEffectType.CONFUSION, (3 * 20), 0));
			}
		}
		if (meta.getLore().contains(ChatColor.translateAlternateColorCodes('&',tierTwo))) {
			int chance = (1 + new Random().nextInt(9));
			if (chance == 1) {
				enemy.addPotionEffect(new PotionEffect(PotionEffectType.CONFUSION, (6 * 20), 0));
			}
		}
	}
}
