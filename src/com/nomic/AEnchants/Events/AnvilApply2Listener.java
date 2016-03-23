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

public class AnvilApply2Listener implements Listener {

	private Main plugin;

	public AnvilApply2Listener(Main pl) {
		plugin = pl;
	}

	String usedbeast2 = "&eBeast II";
	String beastE2 = ChatColor.translateAlternateColorCodes('&', usedbeast2);

	String usedbump2 = "&eBump II";
	String bumpE2 = ChatColor.translateAlternateColorCodes('&', usedbump2);

	String usedhealthboost2 = "&eHealth Boost II";
	String healthboostE2 = ChatColor.translateAlternateColorCodes('&', usedhealthboost2);

	String usedimplode2 = "&eImplode II";
	String implodeE2 = ChatColor.translateAlternateColorCodes('&', usedimplode2);

	String usedleaps2 = "&eLeaps II";
	String leapsE2 = ChatColor.translateAlternateColorCodes('&', usedleaps2);

	String usedreborn2 = "&eReborn II";
	String rebornE2 = ChatColor.translateAlternateColorCodes('&', usedreborn2);

	String usedreplenish2 = "&eReplenish II";
	String replenishE2 = ChatColor.translateAlternateColorCodes('&', usedreplenish2);

	String usedretreat2 = "&eRetreat II";
	String retreatE2 = ChatColor.translateAlternateColorCodes('&', usedretreat2);

	String usedscoot2 = "&eScoot II";
	String scootE2 = ChatColor.translateAlternateColorCodes('&', usedscoot2);

	String usedtipsy2 = "&eTipsy II";
	String tipsyE2 = ChatColor.translateAlternateColorCodes('&', usedtipsy2);

	String usedvanish2 = "&eVanish II";
	String vanishE2 = ChatColor.translateAlternateColorCodes('&', usedvanish2);

	String usedweary2 = "&eWeary II";
	String wearyE2 = ChatColor.translateAlternateColorCodes('&', usedweary2);

	String usedarchery2 = "&eArchery II";
	String archeryE2 = ChatColor.translateAlternateColorCodes('&', usedarchery2);

	String usedconfusion2 = "&eConfusion II";
	String confusionE2 = ChatColor.translateAlternateColorCodes('&', usedconfusion2);

	String usedlife2 = "&eLife II";
	String lifeE2 = ChatColor.translateAlternateColorCodes('&', usedlife2);

	String usedlightning2 = "&eLightning II";
	String lightningE2 = ChatColor.translateAlternateColorCodes('&', usedlightning2);

	String usedlightsout2 = "&eLights Out II";
	String lightsoutE2 = ChatColor.translateAlternateColorCodes('&', usedlightsout2);

	String usedsoul2 = "&eSoul II";
	String soulE2 = ChatColor.translateAlternateColorCodes('&', usedsoul2);

	String usedthunderous2 = "&eThunderous II";
	String thunderousE2 = ChatColor.translateAlternateColorCodes('&', usedthunderous2);

	String usedblast2 = "&eBlast II";
	String blastE2 = ChatColor.translateAlternateColorCodes('&', usedblast2);

	String usedexperience2 = "&eExperience II";
	String experienceE2 = ChatColor.translateAlternateColorCodes('&', usedexperience2);

	String usedhaste2 = "&eHaste II";
	String hasteE2 = ChatColor.translateAlternateColorCodes('&', usedhaste2);

	String usedobsidiandestroyer2 = "&eObsidian Destroyer II";
	String obsidiandestroyerE2 = ChatColor.translateAlternateColorCodes('&', usedobsidiandestroyer2);

	String usedthief2 = "&eThief II";
	String thiefE2 = ChatColor.translateAlternateColorCodes('&', usedthief2);

	String usedtoughness2 = "&eToughness II";
	String toughnessE2 = ChatColor.translateAlternateColorCodes('&', usedtoughness2);

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
		int twoCost = plugin.getConfig().getInt("tierTwoApplyCost");
		String cost2 = String.valueOf(twoCost);
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
					if (lore.contains(beastE2) || lore.contains(bumpE2) || lore.contains(healthboostE2)
							|| lore.contains(implodeE2) || lore.contains(leapsE2) || lore.contains(rebornE2)
							|| lore.contains(replenishE2) || lore.contains(retreatE2) || lore.contains(scootE2)
							|| lore.contains(tipsyE2) || lore.contains(vanishE2) || lore.contains(wearyE2)
							|| lore.contains(archeryE2) || lore.contains(confusionE2) || lore.contains(lifeE2)
							|| lore.contains(lightningE2) || lore.contains(lightsoutE2) || lore.contains(soulE2)
							|| lore.contains(thunderousE2) || lore.contains(blastE2) || lore.contains(experienceE2)
							|| lore.contains(hasteE2) || lore.contains(obsidiandestroyerE2) || lore.contains(thiefE2)
							|| lore.contains(toughnessE2)) {
						if (plevel < twoCost) {
							p.sendMessage(reqmsg.replace("{levels}", cost2));
							return;
						} else if (plevel >= twoCost) {
							Bukkit.getServer().getPluginManager().callEvent(
									new AnvilApply(p, anvil, lore, clear, twoCost, plevel, item, oldmeta, newmeta, m));
						}
					}
				}
			}
		}
	}
}
