package com.nomic.AEnchants.Enchants.Armor;

import java.util.List;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryAction;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.event.inventory.InventoryType.SlotType;
import org.bukkit.event.player.PlayerItemBreakEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import com.nomic.AEnchants.Events.ArmorDrag;
import com.nomic.AEnchants.Events.ArmorHotbar;
import com.nomic.AEnchants.Events.ArmorShift;

public class HealthBoost implements Listener {
	
	Material diamondb = Material.DIAMOND_BOOTS;
	Material ironb = Material.IRON_BOOTS;
	Material chainb = Material.CHAINMAIL_BOOTS;
	Material leatherb = Material.LEATHER_BOOTS;

	Material diamondl = Material.DIAMOND_LEGGINGS;
	Material ironl = Material.IRON_LEGGINGS;
	Material chainl = Material.CHAINMAIL_LEGGINGS;
	Material leatherl = Material.LEATHER_LEGGINGS;

	Material diamondc = Material.DIAMOND_CHESTPLATE;
	Material ironc = Material.IRON_CHESTPLATE;
	Material chainc = Material.CHAINMAIL_CHESTPLATE;
	Material leatherc = Material.LEATHER_CHESTPLATE;

	Material diamondh = Material.DIAMOND_HELMET;
	Material ironh = Material.IRON_HELMET;
	Material chainh = Material.CHAINMAIL_HELMET;
	Material leatherh = Material.LEATHER_HELMET;
	
	String one = "&bHealth Boost I";
	String two = "&eHealth Boost II";
	
	String tOne = ChatColor.translateAlternateColorCodes('&', one);
	String tTwo = ChatColor.translateAlternateColorCodes('&', two);
	
	@EventHandler
	public void shift(ArmorShift e) {
		Player p = e.getPlayer();
		List<String> lore = e.getLore();
		SlotType stype = e.getSlotType();
		Material m = e.getItem().getType();
		if (m == Material.ENCHANTED_BOOK)
			return;
		PlayerInventory inv = p.getInventory();
		if (!(lore.contains(tOne) || lore.contains(tTwo)))
			return;
		InventoryType invt = e.getInventory().getType();
		if (!(invt == InventoryType.PLAYER || invt == InventoryType.CRAFTING))
			return;
		if (m == diamondc || m == ironc || m == chainc || m == leatherc) {
			if (stype == SlotType.ARMOR && inv.getChestplate() != null) {
				if (lore.contains(tOne) || lore.contains(tTwo)) {
					p.removePotionEffect(PotionEffectType.HEALTH_BOOST);
				}
			} else if (stype != SlotType.ARMOR && inv.getChestplate() == null) {
				if (lore.contains(tOne)) {
					p.addPotionEffect(new PotionEffect(PotionEffectType.HEALTH_BOOST, 1000000 * 20, 0));
				} else if (lore.contains(tTwo)) {
					p.addPotionEffect(new PotionEffect(PotionEffectType.HEALTH_BOOST, 1000000 * 20, 1));
				}
			}
		} else if (m == diamondl || m == ironl || m == chainl || m == leatherl) {
			if (stype == SlotType.ARMOR && inv.getLeggings() != null) {
				if (lore.contains(tOne) || lore.contains(tTwo)) {
					p.removePotionEffect(PotionEffectType.HEALTH_BOOST);
				}
			} else if (stype != SlotType.ARMOR && inv.getLeggings() == null) {
				if (lore.contains(tOne)) {
					p.addPotionEffect(new PotionEffect(PotionEffectType.HEALTH_BOOST, 1000000 * 20, 0));
				} else if (lore.contains(tTwo)) {
					p.addPotionEffect(new PotionEffect(PotionEffectType.HEALTH_BOOST, 1000000 * 20, 1));
				}
			}
		} else if (m == diamondb || m == ironb || m == chainb || m == leatherb) {
			if (stype == SlotType.ARMOR && inv.getBoots() != null) {
				if (lore.contains(tOne) || lore.contains(tTwo)) {
					p.removePotionEffect(PotionEffectType.HEALTH_BOOST);
				}
			} else if (stype != SlotType.ARMOR && inv.getBoots() == null) {
				if (lore.contains(tOne)) {
					p.addPotionEffect(new PotionEffect(PotionEffectType.HEALTH_BOOST, 1000000 * 20, 0));
				} else if (lore.contains(tTwo)) {
					p.addPotionEffect(new PotionEffect(PotionEffectType.HEALTH_BOOST, 1000000 * 20, 1));
				}
			}
		} else if (m == diamondh || m == ironh || m == chainh || m == leatherh) {
			if (stype == SlotType.ARMOR && inv.getHelmet() != null) {
				if (lore.contains(tOne) || lore.contains(tTwo)) {
					p.removePotionEffect(PotionEffectType.HEALTH_BOOST);
				}
			} else if (stype != SlotType.ARMOR && inv.getHelmet() == null) {
				if (lore.contains(tOne)) {
					p.addPotionEffect(new PotionEffect(PotionEffectType.HEALTH_BOOST, 1000000 * 20, 0));
				} else if (lore.contains(tTwo)) {
					p.addPotionEffect(new PotionEffect(PotionEffectType.HEALTH_BOOST, 1000000 * 20, 1));
				}
			}
		}
	}
	
	@EventHandler
	public void hotbar(ArmorHotbar e) {
		Player p = e.getPlayer();
		List<String> lore = e.getLore();
		Material m = e.getItem().getType();
		if (m == Material.ENCHANTED_BOOK)
			return;
		PlayerInventory inv = p.getInventory();
		if (!(lore.contains(tOne) || lore.contains(tTwo)))
			return;
		if (m == diamondh || m == ironh || m == chainh || m == leatherh) {
			if (inv.getHelmet() == null) {
				if (lore.contains(tOne)) {
					p.addPotionEffect(new PotionEffect(PotionEffectType.HEALTH_BOOST, 1000000 * 20, 0));
				} else if (lore.contains(tTwo)) {
					p.addPotionEffect(new PotionEffect(PotionEffectType.HEALTH_BOOST, 1000000 * 20, 1));
				}
			}
		} else if (m == diamondc || m == ironc || m == chainc || m == leatherc) {
			if (inv.getChestplate() == null) {
				if (lore.contains(tOne)) {
					p.addPotionEffect(new PotionEffect(PotionEffectType.HEALTH_BOOST, 1000000 * 20, 0));
				} else if (lore.contains(tTwo)) {
					p.addPotionEffect(new PotionEffect(PotionEffectType.HEALTH_BOOST, 1000000 * 20, 1));
				}
			}
		} else if (m == diamondl || m == ironl || m == chainl || m == leatherl) {
			if (inv.getLeggings() == null) {
				if (lore.contains(tOne)) {
					p.addPotionEffect(new PotionEffect(PotionEffectType.HEALTH_BOOST, 1000000 * 20, 0));
				} else if (lore.contains(tTwo)) {
					p.addPotionEffect(new PotionEffect(PotionEffectType.HEALTH_BOOST, 1000000 * 20, 1));
				}
			}
		} else if (m == diamondb || m == ironb || m == chainb || m == leatherb) {
			if (inv.getBoots() == null) {
				if (lore.contains(tOne)) {
					p.addPotionEffect(new PotionEffect(PotionEffectType.HEALTH_BOOST, 1000000 * 20, 0));
				} else if (lore.contains(tTwo)) {
					p.addPotionEffect(new PotionEffect(PotionEffectType.HEALTH_BOOST, 1000000 * 20, 1));
				}
			}
		}
	}
	
	@EventHandler
	public void drag(ArmorDrag e) {
		Player p = e.getPlayer();
		PlayerInventory inv = p.getInventory();
		Material cm = e.getCItem().getType();
		Material m = e.getItem().getType();
		if (m == Material.ENCHANTED_BOOK)
			return;
		SlotType stype = e.getSlotType();
		if (stype == SlotType.ARMOR) {
			if (e.getCItem() != null && cm == diamondh || cm == ironh || cm == chainh || cm == leatherh) {
				if (inv.getHelmet() != null && m != null) {
					List<String> lore = e.getCItem().getItemMeta().getLore();
					if (lore == null)
						return;
					if (lore.contains(tOne) || lore.contains(tTwo)) {
						p.removePotionEffect(PotionEffectType.HEALTH_BOOST);
					}
				} 
			} else if (m == diamondh || m == ironh || m == chainh || m == leatherh) {
				if (e.getItem() != null) {
					List<String> lore = e.getItem().getItemMeta().getLore();
					if (lore == null)
						return;
					if (lore.contains(tOne)) {
						p.addPotionEffect(new PotionEffect(PotionEffectType.HEALTH_BOOST, 1000000 * 20, 0));
					} else if (lore.contains(tTwo)) {
						p.addPotionEffect(new PotionEffect(PotionEffectType.HEALTH_BOOST, 1000000 * 20, 1));
					} 
				}
			} else if (e.getCItem() != null && cm == diamondc || cm == ironc || cm == chainc || cm == leatherc) {
				if (inv.getChestplate() != null && m != null) {
					List<String> lore = e.getCItem().getItemMeta().getLore();
					if (lore == null)
						return;
					if (lore.contains(tOne) || lore.contains(tTwo)) {
						p.removePotionEffect(PotionEffectType.HEALTH_BOOST);
					}
				} 
			} else if (m == diamondc || m == ironc || m == chainc || m == leatherc) {
				if (e.getItem() != null) {
					List<String> lore = e.getItem().getItemMeta().getLore();
					if (lore == null)
						return;
					if (lore.contains(tOne)) {
						p.addPotionEffect(new PotionEffect(PotionEffectType.HEALTH_BOOST, 1000000 * 20, 0));
					} else if (lore.contains(tTwo)) {
						p.addPotionEffect(new PotionEffect(PotionEffectType.HEALTH_BOOST, 1000000 * 20, 1));
					} 
				}
			} else if (e.getCItem() != null && cm == diamondl || cm == ironl || cm == chainl || cm == leatherl) {
				if (inv.getLeggings() != null && m != null) {
					List<String> lore = e.getCItem().getItemMeta().getLore();
					if (lore == null)
						return;
					if (lore.contains(tOne) || lore.contains(tTwo)) {
						p.removePotionEffect(PotionEffectType.HEALTH_BOOST);
					}
				} 
			} else if (m == diamondl || m == ironl || m == chainl || m == leatherl) {
				if (e.getItem() != null) {
					List<String> lore = e.getItem().getItemMeta().getLore();
					if (lore == null)
						return;
					if (lore.contains(tOne)) {
						p.addPotionEffect(new PotionEffect(PotionEffectType.HEALTH_BOOST, 1000000 * 20, 0));
					} else if (lore.contains(tTwo)) {
						p.addPotionEffect(new PotionEffect(PotionEffectType.HEALTH_BOOST, 1000000 * 20, 1));
					} 
				}
			} else if (e.getCItem() != null && cm == diamondb || cm == ironb || cm == chainb || cm == leatherb) {
				if (inv.getBoots() != null && m != null) {
					List<String> lore = e.getCItem().getItemMeta().getLore();
					if (lore == null)
						return;
					if (lore.contains(tOne) || lore.contains(tTwo)) {
						p.removePotionEffect(PotionEffectType.HEALTH_BOOST);
					}
				} 
			} else if (m == diamondb || m == ironb || m == chainb || m == leatherb) {
				if (e.getItem() != null) {
					List<String> lore = e.getItem().getItemMeta().getLore();
					if (lore == null)
						return;
					if (lore.contains(tOne)) {
						p.addPotionEffect(new PotionEffect(PotionEffectType.HEALTH_BOOST, 1000000 * 20, 0));
					} else if (lore.contains(tTwo)) {
						p.addPotionEffect(new PotionEffect(PotionEffectType.HEALTH_BOOST, 1000000 * 20, 1));
					} 
				}
			}
		} 
	}
	
	@EventHandler(priority = EventPriority.HIGHEST)
	public void onbreak(PlayerItemBreakEvent e) {
		Player p = e.getPlayer();
		ItemStack item = e.getBrokenItem();
		List<String> lore = item.getItemMeta().getLore();
		if (!(lore.contains(tOne) || lore.contains(tTwo)))
			return;
		p.removePotionEffect(PotionEffectType.HEALTH_BOOST);
	}
	
	@EventHandler(priority = EventPriority.HIGH)
	public void drop(InventoryClickEvent e) {
		if (!(e.getWhoClicked() instanceof Player))
			return;
		Player p = (Player) e.getWhoClicked();
		ItemStack item = e.getCurrentItem();
		InventoryAction a = e.getAction();
		if (e.getCurrentItem() == null || e.getCurrentItem().getType() == Material.AIR)
			return;
		if (e.getSlotType() != SlotType.ARMOR)
			return;
		List<String> lore = item.getItemMeta().getLore();
		if (lore == null)
			return;
		if (!(lore.contains(tOne) || lore.contains(tTwo)))
			return;
		if (a == InventoryAction.DROP_ALL_SLOT || a == InventoryAction.DROP_ONE_SLOT) {
			p.removePotionEffect(PotionEffectType.HEALTH_BOOST);
		}
	}
}
