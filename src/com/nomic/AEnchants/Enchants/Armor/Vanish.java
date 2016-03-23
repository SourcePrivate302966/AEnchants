package com.nomic.AEnchants.Enchants.Armor;

import java.util.List;
import java.util.Random;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class Vanish implements Listener {

	String one = "&bVanish I";
	String two = "&eVanish II";
	String three = "&cVanish III";

	String tOne = ChatColor.translateAlternateColorCodes('&', one);
	String tTwo = ChatColor.translateAlternateColorCodes('&', two);
	String tThree = ChatColor.translateAlternateColorCodes('&', three);

	String anti = "&bAnti Fog I";
	String tAnti = ChatColor.translateAlternateColorCodes('&', anti);

	@EventHandler(priority = EventPriority.HIGH)
	public void onPlayerHit(EntityDamageByEntityEvent e) {
		if (!(e.getEntity() instanceof Player && e.getDamager() instanceof Player))
			return;
		Player p = (Player) e.getEntity();
		Player enemy = (Player) e.getDamager();
		PlayerInventory inv = p.getInventory();
		PlayerInventory einv = enemy.getInventory();
		List<String> ehlore = einv.getHelmet().getItemMeta().getLore();
		List<String> eclore = einv.getChestplate().getItemMeta().getLore();
		List<String> ellore = einv.getLeggings().getItemMeta().getLore();
		List<String> eblore = einv.getBoots().getItemMeta().getLore();
		List<String> hlore = inv.getHelmet().getItemMeta().getLore();
		List<String> clore = inv.getChestplate().getItemMeta().getLore();
		List<String> llore = inv.getLeggings().getItemMeta().getLore();
		List<String> blore = inv.getBoots().getItemMeta().getLore();
		double health = p.getHealth();
		if (!(health <= 6))
			return;
		if (inv.getChestplate() != null) {
			if (clore.contains(tOne)) {
				int chance = (1 + new Random().nextInt(24));
				if (chance == 1) {
					enemy.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 2 * 20, 0));
					if (einv.getHelmet() != null) {
						if (ehlore.contains(tAnti)) {
							return;
						}
					} 
					if (einv.getChestplate() != null) {
						if (eclore.contains(tAnti)) {
							return;
						}
					} 
					if (einv.getLeggings() != null) {
						if (ellore.contains(tAnti)) {
							return;
						}
					} 
					if (einv.getBoots() != null) {
						if (eblore.contains(tAnti)) {
							return;
						}
					}
					enemy.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, 2 * 20, 0));
					return;
				}
			} else if (clore.contains(tTwo)) {
				int chance = (1 + new Random().nextInt(19));
				if (chance == 1) {
					enemy.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 3 * 20, 0));
					if (einv.getHelmet() != null) {
						if (ehlore.contains(tAnti)) {
							return;
						}
					} 
					if (einv.getChestplate() != null) {
						if (eclore.contains(tAnti)) {
							return;
						}
					} 
					if (einv.getLeggings() != null) {
						if (ellore.contains(tAnti)) {
							return;
						}
					} 
					if (einv.getBoots() != null) {
						if (eblore.contains(tAnti)) {
							return;
						}
					}
					enemy.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, 3 * 20, 0));
					return;
				}
			} else if (clore.contains(tThree)) {
				int chance = (1 + new Random().nextInt(14));
				if (chance == 1) {
					enemy.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 6 * 20, 0));
					if (einv.getHelmet() != null) {
						if (ehlore.contains(tAnti)) {
							return;
						}
					} 
					if (einv.getChestplate() != null) {
						if (eclore.contains(tAnti)) {
							return;
						}
					} 
					if (einv.getLeggings() != null) {
						if (ellore.contains(tAnti)) {
							return;
						}
					} 
					if (einv.getBoots() != null) {
						if (eblore.contains(tAnti)) {
							return;
						}
					}
					enemy.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, 6 * 20, 0));
					return;
				}
			}
		}
		if (inv.getLeggings() != null) {
			if (llore.contains(tOne)) {
				int chance = (1 + new Random().nextInt(24));
				if (chance == 1) {
					enemy.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 2 * 20, 0));
					if (einv.getHelmet() != null) {
						if (ehlore.contains(tAnti)) {
							return;
						}
					} 
					if (einv.getChestplate() != null) {
						if (eclore.contains(tAnti)) {
							return;
						}
					} 
					if (einv.getLeggings() != null) {
						if (ellore.contains(tAnti)) {
							return;
						}
					} 
					if (einv.getBoots() != null) {
						if (eblore.contains(tAnti)) {
							return;
						}
					}
					enemy.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, 2 * 20, 0));
					return;
				}
			} else if (llore.contains(tTwo)) {
				int chance = (1 + new Random().nextInt(19));
				if (chance == 1) {
					enemy.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 3 * 20, 0));
					if (einv.getHelmet() != null) {
						if (ehlore.contains(tAnti)) {
							return;
						}
					} 
					if (einv.getChestplate() != null) {
						if (eclore.contains(tAnti)) {
							return;
						}
					} 
					if (einv.getLeggings() != null) {
						if (ellore.contains(tAnti)) {
							return;
						}
					} 
					if (einv.getBoots() != null) {
						if (eblore.contains(tAnti)) {
							return;
						}
					}
					enemy.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, 3 * 20, 0));
					return;
				}
			} else if (llore.contains(tThree)) {
				int chance = (1 + new Random().nextInt(14));
				if (chance == 1) {
					enemy.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 6 * 20, 0));
					if (einv.getHelmet() != null) {
						if (ehlore.contains(tAnti)) {
							return;
						}
					} 
					if (einv.getChestplate() != null) {
						if (eclore.contains(tAnti)) {
							return;
						}
					} 
					if (einv.getLeggings() != null) {
						if (ellore.contains(tAnti)) {
							return;
						}
					} 
					if (einv.getBoots() != null) {
						if (eblore.contains(tAnti)) {
							return;
						}
					}
					enemy.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, 6 * 20, 0));
					return;
				}
			}
		}
		if (inv.getBoots() != null) {
			if (blore.contains(tOne)) {
				int chance = (1 + new Random().nextInt(24));
				if (chance == 1) {
					enemy.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 2 * 20, 0));
					if (einv.getHelmet() != null) {
						if (ehlore.contains(tAnti)) {
							return;
						}
					} 
					if (einv.getChestplate() != null) {
						if (eclore.contains(tAnti)) {
							return;
						}
					} 
					if (einv.getLeggings() != null) {
						if (ellore.contains(tAnti)) {
							return;
						}
					} 
					if (einv.getBoots() != null) {
						if (eblore.contains(tAnti)) {
							return;
						}
					}
					enemy.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, 2 * 20, 0));
					return;
				}
			} else if (blore.contains(tTwo)) {
				int chance = (1 + new Random().nextInt(19));
				if (chance == 1) {
					enemy.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 3 * 20, 0));
					if (einv.getHelmet() != null) {
						if (ehlore.contains(tAnti)) {
							return;
						}
					} 
					if (einv.getChestplate() != null) {
						if (eclore.contains(tAnti)) {
							return;
						}
					} 
					if (einv.getLeggings() != null) {
						if (ellore.contains(tAnti)) {
							return;
						}
					} 
					if (einv.getBoots() != null) {
						if (eblore.contains(tAnti)) {
							return;
						}
					}
					enemy.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, 3 * 20, 0));
					return;
				}
			} else if (blore.contains(tThree)) {
				int chance = (1 + new Random().nextInt(14));
				if (chance == 1) {
					enemy.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 6 * 20, 0));
					if (einv.getHelmet() != null) {
						if (ehlore.contains(tAnti)) {
							return;
						}
					} 
					if (einv.getChestplate() != null) {
						if (eclore.contains(tAnti)) {
							return;
						}
					} 
					if (einv.getLeggings() != null) {
						if (ellore.contains(tAnti)) {
							return;
						}
					} 
					if (einv.getBoots() != null) {
						if (eblore.contains(tAnti)) {
							return;
						}
					}
					enemy.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, 6 * 20, 0));
					return;
				}
			}
		}
		if (inv.getHelmet() != null) {
			if (hlore.contains(tOne)) {
				int chance = (1 + new Random().nextInt(24));
				if (chance == 1) {
					enemy.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 2 * 20, 0));
					if (einv.getHelmet() != null) {
						if (ehlore.contains(tAnti)) {
							return;
						}
					} 
					if (einv.getChestplate() != null) {
						if (eclore.contains(tAnti)) {
							return;
						}
					} 
					if (einv.getLeggings() != null) {
						if (ellore.contains(tAnti)) {
							return;
						}
					} 
					if (einv.getBoots() != null) {
						if (eblore.contains(tAnti)) {
							return;
						}
					}
					enemy.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, 2 * 20, 0));
					return;
				}
			} else if (hlore.contains(tTwo)) {
				int chance = (1 + new Random().nextInt(19));
				if (chance == 1) {
					enemy.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 3 * 20, 0));
					if (einv.getHelmet() != null) {
						if (ehlore.contains(tAnti)) {
							return;
						}
					} 
					if (einv.getChestplate() != null) {
						if (eclore.contains(tAnti)) {
							return;
						}
					} 
					if (einv.getLeggings() != null) {
						if (ellore.contains(tAnti)) {
							return;
						}
					} 
					if (einv.getBoots() != null) {
						if (eblore.contains(tAnti)) {
							return;
						}
					}
					enemy.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, 3 * 20, 0));
					return;
				}
			} else if (hlore.contains(tThree)) {
				int chance = (1 + new Random().nextInt(14));
				if (chance == 1) {
					enemy.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 6 * 20, 0));
					if (einv.getHelmet() != null) {
						if (ehlore.contains(tAnti)) {
							return;
						}
					} 
					if (einv.getChestplate() != null) {
						if (eclore.contains(tAnti)) {
							return;
						}
					} 
					if (einv.getLeggings() != null) {
						if (ellore.contains(tAnti)) {
							return;
						}
					} 
					if (einv.getBoots() != null) {
						if (eblore.contains(tAnti)) {
							return;
						}
					}
					enemy.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, 6 * 20, 0));
					return;
				}
			}
		}
	}
}
