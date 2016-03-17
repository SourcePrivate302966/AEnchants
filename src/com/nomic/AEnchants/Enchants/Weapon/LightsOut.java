package com.nomic.AEnchants.Enchants.Weapon;

import java.util.List;
import java.util.Random;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class LightsOut implements Listener {
	
	String one = "&bLights Out I";
	String two = "&eLights Out II";
	
	String tOne = ChatColor.translateAlternateColorCodes('&', one);
	String tTwo = ChatColor.translateAlternateColorCodes('&', two);
	
	String anti = "&bAnti Fog I";
	String tAnti = ChatColor.translateAlternateColorCodes('&', anti);

	@EventHandler(priority = EventPriority.HIGH)
	public void onPlayerHit(EntityDamageByEntityEvent e) {
		if (!(e.getEntity() instanceof Player && e.getDamager() instanceof Player))
			return;
		Player p = (Player) e.getDamager();
		Player enemy = (Player) e.getEntity();
		if (p.getItemInHand().getType() == Material.AIR)
			return;
		List<String> lore = p.getItemInHand().getItemMeta().getLore();
		if (lore == null)
			return;
		PlayerInventory inv = enemy.getInventory();
		List<String> hlore = inv.getHelmet().getItemMeta().getLore();
		List<String> clore = inv.getChestplate().getItemMeta().getLore();
		List<String> llore = inv.getLeggings().getItemMeta().getLore();
		List<String> blore = inv.getBoots().getItemMeta().getLore();
		if (hlore.contains(tAnti) || clore.contains(tAnti) || llore.contains(tAnti)
				|| blore.contains(tAnti))
			return;
		if (lore.contains(tOne)) {
			int chance = (1 + new Random().nextInt(19));
			if (chance == 1) {
				enemy.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, (3 * 20), 0));
			}
		} else if (lore.contains(tTwo)) {
			int chance = (1 + new Random().nextInt(9));
			if (chance == 1) {
				enemy.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, (6 * 20), 0));
			}
		}
	}
}
