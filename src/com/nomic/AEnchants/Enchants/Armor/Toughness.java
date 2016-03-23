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

public class Toughness implements Listener {

	String one = "&bToughness I";
	String two = "&eToughness II";
	String three = "&cToughness III";

	String tOne = ChatColor.translateAlternateColorCodes('&', one);
	String tTwo = ChatColor.translateAlternateColorCodes('&', two);
	String tThree = ChatColor.translateAlternateColorCodes('&', three);

	@EventHandler(priority = EventPriority.HIGH)
	public void onPlayerHit(EntityDamageByEntityEvent e) {
		if (!(e.getEntity() instanceof Player && e.getDamager() instanceof Player))
			return;
		Player p = (Player) e.getEntity();
		PlayerInventory inv = p.getInventory();
		List<String> hlore = inv.getHelmet().getItemMeta().getLore();
		List<String> clore = inv.getChestplate().getItemMeta().getLore();
		List<String> llore = inv.getLeggings().getItemMeta().getLore();
		List<String> blore = inv.getBoots().getItemMeta().getLore();
		int hdur = inv.getHelmet().getDurability() + 1;
		int cdur = inv.getChestplate().getDurability() + 1;
		int ldur = inv.getLeggings().getDurability() + 1;
		int bdur = inv.getBoots().getDurability() + 1;
		if (inv.getChestplate() != null) {
			if (clore.contains(tOne)) {
				int chance = (1 + new Random().nextInt(19));
				if (chance == 1) {
					inv.getChestplate().setDurability((short) cdur);
					if (inv.getLeggings() != null) {
						inv.getLeggings().setDurability((short) ldur);
					}
					if (inv.getBoots() != null) {
						inv.getBoots().setDurability((short) bdur);
					}
					if (inv.getHelmet() != null) {
						inv.getHelmet().setDurability((short) hdur);
					}
					return;
				}
			} else if (clore.contains(tTwo)) {
				int chance = (1 + new Random().nextInt(14));
				if (chance == 1) {
					inv.getChestplate().setDurability((short) cdur);
					if (inv.getLeggings() != null) {
						inv.getLeggings().setDurability((short) ldur);
					}
					if (inv.getBoots() != null) {
						inv.getBoots().setDurability((short) bdur);
					}
					if (inv.getHelmet() != null) {
						inv.getHelmet().setDurability((short) hdur);
					}
					return;
				}
			} else if (clore.contains(tThree)) {
				int chance = (1 + new Random().nextInt(9));
				if (chance == 1) {
					inv.getChestplate().setDurability((short) cdur);
					if (inv.getLeggings() != null) {
						inv.getLeggings().setDurability((short) ldur);
					}
					if (inv.getBoots() != null) {
						inv.getBoots().setDurability((short) bdur);
					}
					if (inv.getHelmet() != null) {
						inv.getHelmet().setDurability((short) hdur);
					}
					return;
				}
			}
		}
		if (inv.getLeggings() != null) {
			if (llore.contains(tOne)) {
				int chance = (1 + new Random().nextInt(19));
				if (chance == 1) {
					inv.getLeggings().setDurability((short) ldur);
					if (inv.getChestplate() != null) {
						inv.getChestplate().setDurability((short) cdur);
					}
					if (inv.getBoots() != null) {
						inv.getBoots().setDurability((short) bdur);
					}
					if (inv.getHelmet() != null) {
						inv.getHelmet().setDurability((short) hdur);
					}
					return;
				}
			} else if (llore.contains(tTwo)) {
				int chance = (1 + new Random().nextInt(14));
				if (chance == 1) {
					inv.getLeggings().setDurability((short) ldur);
					if (inv.getChestplate() != null) {
						inv.getChestplate().setDurability((short) cdur);
					}
					if (inv.getBoots() != null) {
						inv.getBoots().setDurability((short) bdur);
					}
					if (inv.getHelmet() != null) {
						inv.getHelmet().setDurability((short) hdur);
					}
					return;
				}
			} else if (llore.contains(tThree)) {
				int chance = (1 + new Random().nextInt(9));
				if (chance == 1) {
					inv.getLeggings().setDurability((short) ldur);
					if (inv.getChestplate() != null) {
						inv.getChestplate().setDurability((short) cdur);
					}
					if (inv.getBoots() != null) {
						inv.getBoots().setDurability((short) bdur);
					}
					if (inv.getHelmet() != null) {
						inv.getHelmet().setDurability((short) hdur);
					}
					return;
				}
			}
		}
		if (inv.getBoots() != null) {
			if (blore.contains(tOne)) {
				int chance = (1 + new Random().nextInt(19));
				if (chance == 1) {
					inv.getBoots().setDurability((short) bdur);
					if (inv.getChestplate() != null) {
						inv.getChestplate().setDurability((short) cdur);
					}
					if (inv.getLeggings() != null) {
						inv.getLeggings().setDurability((short) ldur);
					}
					if (inv.getHelmet() != null) {
						inv.getHelmet().setDurability((short) hdur);
					}
					return;
				}
			} else if (blore.contains(tTwo)) {
				int chance = (1 + new Random().nextInt(14));
				if (chance == 1) {
					inv.getBoots().setDurability((short) bdur);
					if (inv.getChestplate() != null) {
						inv.getChestplate().setDurability((short) cdur);
					}
					if (inv.getLeggings() != null) {
						inv.getLeggings().setDurability((short) ldur);
					}
					if (inv.getHelmet() != null) {
						inv.getHelmet().setDurability((short) hdur);
					}
					return;
				}
			} else if (blore.contains(tThree)) {
				int chance = (1 + new Random().nextInt(9));
				if (chance == 1) {
					inv.getBoots().setDurability((short) bdur);
					if (inv.getChestplate() != null) {
						inv.getChestplate().setDurability((short) cdur);
					}
					if (inv.getLeggings() != null) {
						inv.getLeggings().setDurability((short) ldur);
					}
					if (inv.getHelmet() != null) {
						inv.getHelmet().setDurability((short) hdur);
					}
					return;
				}
			}
		}
		if (inv.getHelmet() != null) {
			if (hlore.contains(tOne)) {
				int chance = (1 + new Random().nextInt(19));
				if (chance == 1) {
					inv.getHelmet().setDurability((short) hdur);
					if (inv.getChestplate() != null) {
						inv.getChestplate().setDurability((short) cdur);
					}
					if (inv.getLeggings() != null) {
						inv.getLeggings().setDurability((short) ldur);
					}
					if (inv.getBoots() != null) {
						inv.getBoots().setDurability((short) bdur);
					}
					return;
				}
			} else if (hlore.contains(tTwo)) {
				int chance = (1 + new Random().nextInt(14));
				if (chance == 1) {
					inv.getHelmet().setDurability((short) hdur);
					if (inv.getChestplate() != null) {
						inv.getChestplate().setDurability((short) cdur);
					}
					if (inv.getLeggings() != null) {
						inv.getLeggings().setDurability((short) ldur);
					}
					if (inv.getBoots() != null) {
						inv.getBoots().setDurability((short) bdur);
					}
					return;
				}
			} else if (hlore.contains(tThree)) {
				int chance = (1 + new Random().nextInt(9));
				if (chance == 1) {
					inv.getHelmet().setDurability((short) hdur);
					if (inv.getChestplate() != null) {
						inv.getChestplate().setDurability((short) cdur);
					}
					if (inv.getLeggings() != null) {
						inv.getLeggings().setDurability((short) ldur);
					}
					if (inv.getBoots() != null) {
						inv.getBoots().setDurability((short) bdur);
					}
					return;
				}
			}
		}
	}
}
