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

public class Beast implements Listener {
	
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
	
	String one = "&bBeast I";
	String two = "&eBeast II";
	String three = "&cBeast III";
	
	String tOne = ChatColor.translateAlternateColorCodes('&', one);
	String tTwo = ChatColor.translateAlternateColorCodes('&', two);
	String tThree = ChatColor.translateAlternateColorCodes('&', three);
	
	@EventHandler
	public void shift(ArmorShift e) {
		Player p = e.getPlayer();
		List<String> lore = e.getLore();
		SlotType stype = e.getSlotType();
		Material m = e.getItem().getType();
		if (m == Material.ENCHANTED_BOOK)
			return;
		InventoryType invt = e.getInventory().getType();
		if (!(invt == InventoryType.PLAYER || invt == InventoryType.CRAFTING))
			return;
		PlayerInventory inv = p.getInventory();
		if (!(lore.contains(tOne) || lore.contains(tTwo) || lore.contains(tThree)))
			return;
		if (m == diamondh || m == ironh || m == chainh || m == leatherh) {
			if (stype == SlotType.ARMOR && inv.getHelmet() != null) {
				if (lore.contains(tOne) || lore.contains(tTwo) || lore.contains(tThree)) {
					p.removePotionEffect(PotionEffectType.INCREASE_DAMAGE);
					return;
				}
			} else if (stype != SlotType.ARMOR && inv.getHelmet() == null) {
				List<String> clore = inv.getChestplate().getItemMeta().getLore();
				List<String> llore = inv.getLeggings().getItemMeta().getLore();
				List<String> blore = inv.getBoots().getItemMeta().getLore();
				if (lore.contains(tOne)) {
					if (clore.contains(tOne) && llore.contains(tOne) && blore.contains(tOne)) {
						p.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 1000000 * 20, 0));
						return;
					}
				} else if (lore.contains(tTwo)) {
					if (clore.contains(tTwo) && llore.contains(tTwo) && blore.contains(tTwo)) {
						p.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 1000000 * 20, 0));
						return;
					}
				} else if (lore.contains(tThree)) {
					if (clore.contains(tThree) && llore.contains(tThree) && blore.contains(tThree)) {
						p.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 1000000 * 20, 0));
						return;
					}
				}
			}
		} else if (m == diamondc || m == ironc || m == chainc || m == leatherc) {
			if (stype == SlotType.ARMOR && inv.getChestplate() != null) {
				if (lore.contains(tOne) || lore.contains(tTwo) || lore.contains(tThree)) {
					p.removePotionEffect(PotionEffectType.INCREASE_DAMAGE);
					return;
				}
			} else if (stype != SlotType.ARMOR && inv.getChestplate() == null) {
				List<String> hlore = inv.getHelmet().getItemMeta().getLore();
				List<String> llore = inv.getLeggings().getItemMeta().getLore();
				List<String> blore = inv.getBoots().getItemMeta().getLore();
				if (lore.contains(tOne)) {
					if (hlore.contains(tOne) && llore.contains(tOne) && blore.contains(tOne)) {
						p.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 1000000 * 20, 0));
						return;
					}
				} else if (lore.contains(tTwo)) {
					if (hlore.contains(tTwo) && llore.contains(tTwo) && blore.contains(tTwo)) {
						p.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 1000000 * 20, 0));
						return;
					}
				} else if (lore.contains(tThree)) {
					if (hlore.contains(tThree) && llore.contains(tThree) && blore.contains(tThree)) {
						p.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 1000000 * 20, 0));
						return;
					}
				}
			}
		} else if (m == diamondl || m == ironl || m == chainl || m == leatherl) {
			if (stype == SlotType.ARMOR && inv.getLeggings() != null) {
				if (lore.contains(tOne) || lore.contains(tTwo) || lore.contains(tThree)) {
					p.removePotionEffect(PotionEffectType.INCREASE_DAMAGE);
					return;
				}
			} else if (stype != SlotType.ARMOR && inv.getLeggings() == null) {
				List<String> hlore = inv.getHelmet().getItemMeta().getLore();
				List<String> clore = inv.getChestplate().getItemMeta().getLore();
				List<String> blore = inv.getBoots().getItemMeta().getLore();
				if (lore.contains(tOne)) {
					if (hlore.contains(tOne) && clore.contains(tOne) && blore.contains(tOne)) {
						p.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 1000000 * 20, 0));
						return;
					}
				} else if (lore.contains(tTwo)) {
					if (hlore.contains(tTwo) && clore.contains(tTwo) && blore.contains(tTwo)) {
						p.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 1000000 * 20, 0));
						return;
					}
				} else if (lore.contains(tThree)) {
					if (hlore.contains(tThree) && clore.contains(tThree) && blore.contains(tThree)) {
						p.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 1000000 * 20, 0));
						return;
					}
				}
			}
		} else if (m == diamondb || m == ironb || m == chainb || m == leatherb) {
			if (stype == SlotType.ARMOR && inv.getBoots() != null) {
				if (lore.contains(tOne) || lore.contains(tTwo) || lore.contains(tThree)) {
					p.removePotionEffect(PotionEffectType.INCREASE_DAMAGE);
					return;
				}
			} else if (stype != SlotType.ARMOR && inv.getBoots() == null) {
				List<String> hlore = inv.getHelmet().getItemMeta().getLore();
				List<String> clore = inv.getChestplate().getItemMeta().getLore();
				List<String> llore = inv.getLeggings().getItemMeta().getLore();
				if (lore.contains(tOne)) {
					if (hlore.contains(tOne) && clore.contains(tOne) && llore.contains(tOne)) {
						p.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 1000000 * 20, 0));
						return;
					}
				} else if (lore.contains(tTwo)) {
					if (hlore.contains(tTwo) && clore.contains(tTwo) && llore.contains(tTwo)) {
						p.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 1000000 * 20, 0));
						return;
					}
				} else if (lore.contains(tThree)) {
					if (hlore.contains(tThree) && clore.contains(tThree) && llore.contains(tThree)) {
						p.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 1000000 * 20, 0));
						return;
					}
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
		if (!(lore.contains(tOne)))
			return;
		if (m == diamondh || m == ironh || m == chainh || m == leatherh) {
			if (inv.getHelmet() == null) {
				List<String> clore = inv.getChestplate().getItemMeta().getLore();
				List<String> llore = inv.getLeggings().getItemMeta().getLore();
				List<String> blore = inv.getBoots().getItemMeta().getLore();
				if (lore.contains(tOne)) {
					if (clore.contains(tOne) && llore.contains(tOne) && blore.contains(tOne)) {
						p.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 1000000 * 20, 0));
						return;
					}
				} else if (lore.contains(tTwo)) {
					if (clore.contains(tTwo) && llore.contains(tTwo) && blore.contains(tTwo)) {
						p.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 1000000 * 20, 0));
						return;
					}
				} else if (lore.contains(tThree)) {
					if (clore.contains(tThree) && llore.contains(tThree) && blore.contains(tThree)) {
						p.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 1000000 * 20, 0));
						return;
					}
				}
			}
		} else if (m == diamondc || m == ironc || m == chainc || m == leatherc) {
			if (inv.getChestplate() == null) {
				List<String> hlore = inv.getHelmet().getItemMeta().getLore();
				List<String> llore = inv.getLeggings().getItemMeta().getLore();
				List<String> blore = inv.getBoots().getItemMeta().getLore();
				if (lore.contains(tOne)) {
					if (hlore.contains(tOne) && llore.contains(tOne) && blore.contains(tOne)) {
						p.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 1000000 * 20, 0));
						return;
					}
				} else if (lore.contains(tTwo)) {
					if (hlore.contains(tTwo) && llore.contains(tTwo) && blore.contains(tTwo)) {
						p.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 1000000 * 20, 0));
						return;
					}
				} else if (lore.contains(tThree)) {
					if (hlore.contains(tThree) && llore.contains(tThree) && blore.contains(tThree)) {
						p.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 1000000 * 20, 0));
						return;
					}
				}
			}
		} else if (m == diamondl || m == ironl || m == chainl || m == leatherl) {
			if (inv.getLeggings() == null) {
				List<String> hlore = inv.getHelmet().getItemMeta().getLore();
				List<String> clore = inv.getChestplate().getItemMeta().getLore();
				List<String> blore = inv.getBoots().getItemMeta().getLore();
				if (lore.contains(tOne)) {
					if (hlore.contains(tOne) && clore.contains(tOne) && blore.contains(tOne)) {
						p.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 1000000 * 20, 0));
						return;
					}
				} else if (lore.contains(tTwo)) {
					if (hlore.contains(tTwo) && clore.contains(tTwo) && blore.contains(tTwo)) {
						p.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 1000000 * 20, 0));
						return;
					}
				} else if (lore.contains(tThree)) {
					if (hlore.contains(tThree) && clore.contains(tThree) && blore.contains(tThree)) {
						p.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 1000000 * 20, 0));
						return;
					}
				}
			}
		} else if (m == diamondb || m == ironb || m == chainb || m == leatherb) {
			if (inv.getBoots() == null) {
				List<String> hlore = inv.getHelmet().getItemMeta().getLore();
				List<String> clore = inv.getChestplate().getItemMeta().getLore();
				List<String> llore = inv.getLeggings().getItemMeta().getLore();
				if (lore.contains(tOne)) {
					if (hlore.contains(tOne) && clore.contains(tOne) && llore.contains(tOne)) {
						p.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 1000000 * 20, 0));
						return;
					}
				} else if (lore.contains(tTwo)) {
					if (hlore.contains(tTwo) && clore.contains(tTwo) && llore.contains(tTwo)) {
						p.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 1000000 * 20, 0));
						return;
					}
				} else if (lore.contains(tThree)) {
					if (hlore.contains(tThree) && clore.contains(tThree) && llore.contains(tThree)) {
						p.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 1000000 * 20, 0));
						return;
					}
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
					if (lore.contains(tOne) || lore.contains(tTwo) || lore.contains(tThree)) {
						p.removePotionEffect(PotionEffectType.INCREASE_DAMAGE);
						return;
					}
				} 
			} else if (m == diamondh || m == ironh || m == chainh || m == leatherh) {
				if (e.getItem() != null) {
					List<String> lore = e.getItem().getItemMeta().getLore();
					List<String> clore = inv.getChestplate().getItemMeta().getLore();
					List<String> llore = inv.getLeggings().getItemMeta().getLore();
					List<String> blore = inv.getBoots().getItemMeta().getLore();
					if (lore.contains(tOne)) {
						if (clore.contains(tOne) && llore.contains(tOne) && blore.contains(tOne)) {
							p.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 1000000 * 20, 0));
							return;
						}
					} else if (lore.contains(tTwo)) {
						if (clore.contains(tTwo) && llore.contains(tTwo) && blore.contains(tTwo)) {
							p.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 1000000 * 20, 0));
							return;
						}
					} else if (lore.contains(tThree)) {
						if (clore.contains(tThree) && llore.contains(tThree) && blore.contains(tThree)) {
							p.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 1000000 * 20, 0));
							return;
						}
					}
				}
			} else if (e.getCItem() != null && cm == diamondc || cm == ironc || cm == chainc || cm == leatherc) {
				if (inv.getChestplate() != null && m != null) {
					List<String> lore = e.getCItem().getItemMeta().getLore();
					if (lore.contains(tOne) || lore.contains(tTwo) || lore.contains(tThree)) {
						p.removePotionEffect(PotionEffectType.INCREASE_DAMAGE);
						return;
					}
				} 
			} else if (m == diamondc || m == ironc || m == chainc || m == leatherc) {
				if (e.getItem() != null) {
					List<String> lore = e.getItem().getItemMeta().getLore();
					List<String> hlore = inv.getHelmet().getItemMeta().getLore();
					List<String> llore = inv.getLeggings().getItemMeta().getLore();
					List<String> blore = inv.getBoots().getItemMeta().getLore();
					if (lore.contains(tOne)) {
						if (hlore.contains(tOne) && llore.contains(tOne) && blore.contains(tOne)) {
							p.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 1000000 * 20, 0));
							return;
						}
					} else if (lore.contains(tTwo)) {
						if (hlore.contains(tTwo) && llore.contains(tTwo) && blore.contains(tTwo)) {
							p.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 1000000 * 20, 0));
							return;
						}
					} else if (lore.contains(tThree)) {
						if (hlore.contains(tThree) && llore.contains(tThree) && blore.contains(tThree)) {
							p.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 1000000 * 20, 0));
							return;
						}
					}
				}
			} else if (e.getCItem() != null && cm == diamondl || cm == ironl || cm == chainl || cm == leatherl) {
				if (inv.getLeggings() != null && m != null) {
					List<String> lore = e.getCItem().getItemMeta().getLore();
					if (lore.contains(tOne) || lore.contains(tTwo) || lore.contains(tThree)) {
						p.removePotionEffect(PotionEffectType.INCREASE_DAMAGE);
						return;
					}
				} 
			} else if (m == diamondl || m == ironl || m == chainl || m == leatherl) {
				if (e.getItem() != null) {
					List<String> lore = e.getItem().getItemMeta().getLore();
					List<String> hlore = inv.getHelmet().getItemMeta().getLore();
					List<String> clore = inv.getChestplate().getItemMeta().getLore();
					List<String> blore = inv.getBoots().getItemMeta().getLore();
					if (lore.contains(tOne)) {
						if (hlore.contains(tOne) && clore.contains(tOne) && blore.contains(tOne)) {
							p.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 1000000 * 20, 0));
							return;
						}
					} else if (lore.contains(tTwo)) {
						if (hlore.contains(tTwo) && clore.contains(tTwo) && blore.contains(tTwo)) {
							p.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 1000000 * 20, 0));
							return;
						}
					} else if (lore.contains(tThree)) {
						if (hlore.contains(tThree) && clore.contains(tThree) && blore.contains(tThree)) {
							p.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 1000000 * 20, 0));
							return;
						}
					}
				}
			} else if (e.getCItem() != null && cm == diamondb || cm == ironb || cm == chainb || cm == leatherb) {
				if (inv.getBoots() != null && m != null) {
					List<String> lore = e.getCItem().getItemMeta().getLore();
					if (lore.contains(tOne) || lore.contains(tTwo) || lore.contains(tThree)) {
						p.removePotionEffect(PotionEffectType.INCREASE_DAMAGE);
						return;
					}
				} 
			} else if (m == diamondb || m == ironb || m == chainb || m == leatherb) {
				if (e.getItem() != null) {
					List<String> lore = e.getItem().getItemMeta().getLore();
					List<String> hlore = inv.getHelmet().getItemMeta().getLore();
					List<String> clore = inv.getChestplate().getItemMeta().getLore();
					List<String> llore = inv.getLeggings().getItemMeta().getLore();
					if (lore.contains(tOne)) {
						if (hlore.contains(tOne) && clore.contains(tOne) && llore.contains(tOne)) {
							p.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 1000000 * 20, 0));
							return;
						}
					} else if (lore.contains(tTwo)) {
						if (hlore.contains(tTwo) && clore.contains(tTwo) && llore.contains(tTwo)) {
							p.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 1000000 * 20, 0));
							return;
						}
					} else if (lore.contains(tThree)) {
						if (hlore.contains(tThree) && clore.contains(tThree) && llore.contains(tThree)) {
							p.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 1000000 * 20, 0));
							return;
						}
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
		if (!(lore.contains(tOne) || lore.contains(tTwo) || lore.contains(tThree)))
			return;
		p.removePotionEffect(PotionEffectType.INCREASE_DAMAGE);
	}
	
	@EventHandler(priority = EventPriority.HIGH)
	public void drop(InventoryClickEvent e) {
		if (!(e.getWhoClicked() instanceof Player))
			return;
		Player p = (Player) e.getWhoClicked();
		ItemStack item = e.getCurrentItem();
		InventoryAction a = e.getAction();
		if (item.getType() == Material.AIR)
			return;
		List<String> lore = item.getItemMeta().getLore();
		if (!(lore.contains(tOne) || lore.contains(tTwo) || lore.contains(tThree)))
			return;
		if (a == InventoryAction.DROP_ALL_SLOT || a == InventoryAction.DROP_ONE_SLOT) {
			p.removePotionEffect(PotionEffectType.INCREASE_DAMAGE);
		}
	}
}
