package com.nomic.AEnchants.Events;

import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.ClickType;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.event.inventory.InventoryType.SlotType;
import org.bukkit.inventory.AnvilInventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import com.nomic.AEnchants.Main;

public class AnvilApply3Listener implements Listener {

	private Main plugin;

	public AnvilApply3Listener(Main pl) {
		plugin = pl;
	}

	String usedbeast3 = "&cBeast III";
	String beastE3 = ChatColor.translateAlternateColorCodes('&', usedbeast3);

	String usedbump3 = "&cBump III";
	String bumpE3 = ChatColor.translateAlternateColorCodes('&', usedbump3);

	String usedimplode3 = "&cImplode III";
	String implodeE3 = ChatColor.translateAlternateColorCodes('&', usedimplode3);

	String usedleaps3 = "&cLeaps III";
	String leapsE3 = ChatColor.translateAlternateColorCodes('&', usedleaps3);

	String usedreborn3 = "&cReborn III";
	String rebornE3 = ChatColor.translateAlternateColorCodes('&', usedreborn3);

	String usedreplenish3 = "&cReplenish III";
	String replenishE3 = ChatColor.translateAlternateColorCodes('&', usedreplenish3);

	String usedretreat3 = "&cRetreat III";
	String retreatE3 = ChatColor.translateAlternateColorCodes('&', usedretreat3);

	String usedscoot3 = "&cScoot III";
	String scootE3 = ChatColor.translateAlternateColorCodes('&', usedscoot3);

	String usedtipsy3 = "&cTipsy III";
	String tipsyE3 = ChatColor.translateAlternateColorCodes('&', usedtipsy3);

	String usedvanish3 = "&cVanish III";
	String vanishE3 = ChatColor.translateAlternateColorCodes('&', usedvanish3);

	String usedweary3 = "&cWeary III";
	String wearyE3 = ChatColor.translateAlternateColorCodes('&', usedweary3);

	String usedlightning3 = "&cLightning III";
	String lightningE3 = ChatColor.translateAlternateColorCodes('&', usedlightning3);

	String usedthunderous3 = "&cThunderous III";
	String thunderousE3 = ChatColor.translateAlternateColorCodes('&', usedthunderous3);

	String usedexperience3 = "&cExperience III";
	String experienceE3 = ChatColor.translateAlternateColorCodes('&', usedexperience3);

	String usedhaste3 = "&cHaste III";
	String hasteE3 = ChatColor.translateAlternateColorCodes('&', usedhaste3);

	String usedobsidiandestroyer3 = "&cObsidian Destroyer III";
	String obsidiandestroyerE3 = ChatColor.translateAlternateColorCodes('&', usedobsidiandestroyer3);
	
	String usedthief3 = "&cThief III";
	String thiefE3 = ChatColor.translateAlternateColorCodes('&', usedthief3);

	String usedtoughness3 = "&cToughness III";
	String toughnessE3 = ChatColor.translateAlternateColorCodes('&', usedtoughness3);

	@EventHandler
	public void onCombine(InventoryClickEvent e) {
		if (!(e.getWhoClicked() instanceof Player))
			return;
		Player p = (Player) e.getWhoClicked();
		ClickType click = e.getClick();
		int slot = e.getSlot();
		SlotType stype = e.getSlotType();
		InventoryType inv = e.getInventory().getType();
		ItemStack cursor = e.getCursor();
		String req = plugin.getConfig().getString("notEnoughLevelsMessage");
		String reqmsg = ChatColor.translateAlternateColorCodes('&', req);
		int threeCost = plugin.getConfig().getInt("tierTwoApplyCost");
		String cost3 = String.valueOf(threeCost);
		if (click == ClickType.LEFT || click == ClickType.RIGHT) {
			if (!(stype == SlotType.CRAFTING && inv == InventoryType.ANVIL))
				return;
			AnvilInventory anvil = (AnvilInventory) e.getInventory();
			ItemStack[] items = anvil.getContents();
			ItemStack item1 = items[0];
			ItemStack clear = new ItemStack(Material.AIR);
			int plevel = p.getLevel();
			Material book = Material.ENCHANTED_BOOK;
			String fullinv = plugin.getConfig().getString("fullInvMessage");
			String fullinvmsg = ChatColor.translateAlternateColorCodes('&', fullinv);
			if (p.getInventory().firstEmpty() == -1) {
				p.sendMessage(fullinvmsg);
				return;
			}
			if (slot == 1 && item1 != null) {
				if (e.getCursor().getType() == book && item1.getType() != book) {
					Material m = item1.getType();
					ItemStack item = item1.clone();
					ItemMeta newmeta = item.getItemMeta();
					ItemMeta oldmeta = item1.getItemMeta();
					if (cursor.getType() == Material.AIR)
						return;
					List<String> lore = cursor.getItemMeta().getLore();
					if (lore.contains(beastE3) || lore.contains(bumpE3) || lore.contains(implodeE3)
							|| lore.contains(leapsE3) || lore.contains(rebornE3) || lore.contains(replenishE3)
							|| lore.contains(retreatE3) || lore.contains(scootE3) || lore.contains(tipsyE3)
							|| lore.contains(vanishE3) || lore.contains(wearyE3) || lore.contains(lightningE3)
							|| lore.contains(thunderousE3) || lore.contains(experienceE3) || lore.contains(hasteE3)
							|| lore.contains(obsidiandestroyerE3) || lore.contains(thiefE3)
							|| lore.contains(toughnessE3)) {
						if (plevel < threeCost) {
							p.sendMessage(reqmsg.replace("{levels}", cost3));
							return;
						} else if (plevel >= threeCost) {
							Bukkit.getServer().getPluginManager().callEvent(
									new AnvilApply(p, anvil, lore, clear, threeCost, plevel, item, oldmeta, newmeta, m));
						}
					}
				}
			}
		}
	}
}
