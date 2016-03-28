package com.nomic.AEnchants.Enchants.Armor;

import java.util.List;
import java.util.Random;

import org.bukkit.ChatColor;
import org.bukkit.configuration.ConfigurationSection;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import com.nomic.AEnchants.Main;

public class Tipsy implements Listener {
	
	private Main plugin;

	public Tipsy(Main pl) {
		plugin = pl;
	}

	@EventHandler(priority = EventPriority.HIGH)
	public void onPlayerHit(EntityDamageByEntityEvent e) {
		
		ConfigurationSection names = plugin.getConfig().getConfigurationSection("enchantNames");
		String one = names.getConfigurationSection("Tipsy").getString("one");
		String two = names.getConfigurationSection("Tipsy").getString("two");
		String three = names.getConfigurationSection("Tipsy").getString("three");
		String tOne = ChatColor.translateAlternateColorCodes('&', one);
		String tTwo = ChatColor.translateAlternateColorCodes('&', two);
		String tThree = ChatColor.translateAlternateColorCodes('&', three);
		
		if (!(e.getEntity() instanceof Player && e.getDamager() instanceof Player))
			return;
		Player p = (Player) e.getEntity();
		Player enemy = (Player) e.getDamager();
		PlayerInventory inv = p.getInventory();
		List<String> hlore = inv.getHelmet().getItemMeta().getLore();
		List<String> clore = inv.getChestplate().getItemMeta().getLore();
		List<String> llore = inv.getLeggings().getItemMeta().getLore();
		List<String> blore = inv.getBoots().getItemMeta().getLore();
		if (inv.getChestplate() != null) {
			if (clore.contains(tOne)) {
				int chance = (1 + new Random().nextInt(24));
				if (chance == 1) {
					enemy.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 2 * 20, 0));
					enemy.addPotionEffect(new PotionEffect(PotionEffectType.SLOW_DIGGING, 2 * 20, 0));
					int newchance = (1 + new Random().nextInt(3));
					if (newchance == 1) {
						enemy.addPotionEffect(new PotionEffect(PotionEffectType.CONFUSION, (6 * 20), 6));
						return;
					}
				}
			} else if (clore.contains(tTwo)) {
				int chance = (1 + new Random().nextInt(19));
				if (chance == 1) {
					enemy.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 3 * 20, 0));
					enemy.addPotionEffect(new PotionEffect(PotionEffectType.SLOW_DIGGING, 3 * 20, 0));
					int newchance = (1 + new Random().nextInt(3));
					if (newchance == 1) {
						enemy.addPotionEffect(new PotionEffect(PotionEffectType.CONFUSION, (8 * 20), 6));
						return;
					}
				}
			} else if (clore.contains(tThree)) {
				int chance = (1 + new Random().nextInt(14));
				if (chance == 1) {
					enemy.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 6 * 20, 0));
					enemy.addPotionEffect(new PotionEffect(PotionEffectType.SLOW_DIGGING, 6 * 20, 0));
					int newchance = (1 + new Random().nextInt(3));
					if (newchance == 1) {
						enemy.addPotionEffect(new PotionEffect(PotionEffectType.CONFUSION, (10 * 20), 6));
						return;
					}
				}
			}
		}
		if (inv.getLeggings() != null) {
			if (llore.contains(tOne)) {
				int chance = (1 + new Random().nextInt(24));
				if (chance == 1) {
					enemy.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 2 * 20, 0));
					enemy.addPotionEffect(new PotionEffect(PotionEffectType.SLOW_DIGGING, 2 * 20, 0));
					int newchance = (1 + new Random().nextInt(3));
					if (newchance == 1) {
						enemy.addPotionEffect(new PotionEffect(PotionEffectType.CONFUSION, (6 * 20), 6));
						return;
					}
				}
			} else if (llore.contains(tTwo)) {
				int chance = (1 + new Random().nextInt(19));
				if (chance == 1) {
					enemy.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 3 * 20, 0));
					enemy.addPotionEffect(new PotionEffect(PotionEffectType.SLOW_DIGGING, 3 * 20, 0));
					int newchance = (1 + new Random().nextInt(3));
					if (newchance == 1) {
						enemy.addPotionEffect(new PotionEffect(PotionEffectType.CONFUSION, (8 * 20), 6));
						return;
					}
				}
			} else if (llore.contains(tThree)) {
				int chance = (1 + new Random().nextInt(14));
				if (chance == 1) {
					enemy.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 6 * 20, 0));
					enemy.addPotionEffect(new PotionEffect(PotionEffectType.SLOW_DIGGING, 6 * 20, 0));
					int newchance = (1 + new Random().nextInt(3));
					if (newchance == 1) {
						enemy.addPotionEffect(new PotionEffect(PotionEffectType.CONFUSION, (10 * 20), 6));
						return;
					}
				}
			}
		}
		if (inv.getBoots() != null) {
			if (blore.contains(tOne)) {
				int chance = (1 + new Random().nextInt(24));
				if (chance == 1) {
					enemy.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 2 * 20, 0));
					enemy.addPotionEffect(new PotionEffect(PotionEffectType.SLOW_DIGGING, 2 * 20, 0));
					int newchance = (1 + new Random().nextInt(3));
					if (newchance == 1) {
						enemy.addPotionEffect(new PotionEffect(PotionEffectType.CONFUSION, (6 * 20), 6));
						return;
					}
				}
			} else if (blore.contains(tTwo)) {
				int chance = (1 + new Random().nextInt(19));
				if (chance == 1) {
					enemy.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 3 * 20, 0));
					enemy.addPotionEffect(new PotionEffect(PotionEffectType.SLOW_DIGGING, 3 * 20, 0));
					int newchance = (1 + new Random().nextInt(3));
					if (newchance == 1) {
						enemy.addPotionEffect(new PotionEffect(PotionEffectType.CONFUSION, (8 * 20), 6));
						return;
					}
				}
			} else if (blore.contains(tThree)) {
				int chance = (1 + new Random().nextInt(14));
				if (chance == 1) {
					enemy.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 6 * 20, 0));
					enemy.addPotionEffect(new PotionEffect(PotionEffectType.SLOW_DIGGING, 6 * 20, 0));
					int newchance = (1 + new Random().nextInt(3));
					if (newchance == 1) {
						enemy.addPotionEffect(new PotionEffect(PotionEffectType.CONFUSION, (10 * 20), 6));
						return;
					}
				}
			}
		}
		if (inv.getHelmet() != null) {
			if (hlore.contains(tOne)) {
				int chance = (1 + new Random().nextInt(24));
				if (chance == 1) {
					enemy.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 2 * 20, 0));
					enemy.addPotionEffect(new PotionEffect(PotionEffectType.SLOW_DIGGING, 2 * 20, 0));
					int newchance = (1 + new Random().nextInt(3));
					if (newchance == 1) {
						enemy.addPotionEffect(new PotionEffect(PotionEffectType.CONFUSION, (6 * 20), 6));
						return;
					}
				}
			} else if (hlore.contains(tTwo)) {
				int chance = (1 + new Random().nextInt(19));
				if (chance == 1) {
					enemy.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 3 * 20, 0));
					enemy.addPotionEffect(new PotionEffect(PotionEffectType.SLOW_DIGGING, 3 * 20, 0));
					int newchance = (1 + new Random().nextInt(3));
					if (newchance == 1) {
						enemy.addPotionEffect(new PotionEffect(PotionEffectType.CONFUSION, (8 * 20), 6));
						return;
					}
				}
			} else if (hlore.contains(tThree)) {
				int chance = (1 + new Random().nextInt(14));
				if (chance == 1) {
					enemy.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 6 * 20, 0));
					enemy.addPotionEffect(new PotionEffect(PotionEffectType.SLOW_DIGGING, 6 * 20, 0));
					int newchance = (1 + new Random().nextInt(3));
					if (newchance == 1) {
						enemy.addPotionEffect(new PotionEffect(PotionEffectType.CONFUSION, (10 * 20), 6));
						return;
					}
				}
			}
		}
	}
}
