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

public class AnvilApply1Listener implements Listener {

	private Main plugin;

	public AnvilApply1Listener(Main pl) {
		plugin = pl;
	}

	String usedarc = "&bArc I";
	String arcE = ChatColor.translateAlternateColorCodes('&', usedarc);

	String usedbeast = "&bBeast I";
	String beastE = ChatColor.translateAlternateColorCodes('&', usedbeast);

	String usedblaze = "&bBlaze I";
	String blazeE = ChatColor.translateAlternateColorCodes('&', usedblaze);

	String usedbump = "&bBump I";
	String bumpE = ChatColor.translateAlternateColorCodes('&', usedbump);

	String usedfeast = "&bFeast I";
	String feastE = ChatColor.translateAlternateColorCodes('&', usedfeast);

	String usedfish = "&bFish I";
	String fishE = ChatColor.translateAlternateColorCodes('&', usedfish);

	String usedhealthboost = "&bHealth Boost I";
	String healthboostE = ChatColor.translateAlternateColorCodes('&', usedhealthboost);

	String usedimplode = "&bImplode I";
	String implodeE = ChatColor.translateAlternateColorCodes('&', usedimplode);

	String usedleaps = "&bLeaps I";
	String leapsE = ChatColor.translateAlternateColorCodes('&', usedleaps);

	String usedreborn = "&bReborn I";
	String rebornE = ChatColor.translateAlternateColorCodes('&', usedreborn);

	String usedreplenish = "&bReplenish I";
	String replenishE = ChatColor.translateAlternateColorCodes('&', usedreplenish);

	String usedretreat = "&bRetreat I";
	String retreatE = ChatColor.translateAlternateColorCodes('&', usedretreat);

	String usedscoot = "&bScoot I";
	String scootE = ChatColor.translateAlternateColorCodes('&', usedscoot);

	String usedsunlight = "&bSunlight I";
	String sunlightE = ChatColor.translateAlternateColorCodes('&', usedsunlight);

	String usedtipsy = "&bTipsy I";
	String tipsyE = ChatColor.translateAlternateColorCodes('&', usedtipsy);

	String usedvanish = "&bVanish I";
	String vanishE = ChatColor.translateAlternateColorCodes('&', usedvanish);

	String usedweary = "&bWeary I";
	String wearyE = ChatColor.translateAlternateColorCodes('&', usedweary);

	String usedarchery = "&bArchery I";
	String archeryE = ChatColor.translateAlternateColorCodes('&', usedarchery);

	String usedconfusion = "&bConfusion I";
	String confusionE = ChatColor.translateAlternateColorCodes('&', usedconfusion);

	String usedlife = "&bLife I";
	String lifeE = ChatColor.translateAlternateColorCodes('&', usedlife);

	String usedlightning = "&bLightning I";
	String lightningE = ChatColor.translateAlternateColorCodes('&', usedlightning);

	String usedlightsout = "&bLights Out I";
	String lightsoutE = ChatColor.translateAlternateColorCodes('&', usedlightsout);

	String usedsoul = "&bSoul I";
	String soulE = ChatColor.translateAlternateColorCodes('&', usedsoul);

	String usedswordblock = "&bSword Block I";
	String swordblockE = ChatColor.translateAlternateColorCodes('&', usedswordblock);

	String usedthunderous = "&bThunderous I";
	String thunderousE = ChatColor.translateAlternateColorCodes('&', usedthunderous);

	String usedblast = "&bBlast I";
	String blastE = ChatColor.translateAlternateColorCodes('&', usedblast);

	String usedexperience = "&bExperience I";
	String experienceE = ChatColor.translateAlternateColorCodes('&', usedexperience);

	String usedhaste = "&bHaste I";
	String hasteE = ChatColor.translateAlternateColorCodes('&', usedhaste);

	String usedobsidiandestroyer = "&bObsidian Destroyer I";
	String obsidiandestroyerE = ChatColor.translateAlternateColorCodes('&', usedobsidiandestroyer);

	String usedthief = "&bThief I";
	String thiefE = ChatColor.translateAlternateColorCodes('&', usedthief);

	String usedtoughness = "&bToughness I";
	String toughnessE = ChatColor.translateAlternateColorCodes('&', usedtoughness);

	String usedantifog = "&bAnti Fog I";
	String antifogE = ChatColor.translateAlternateColorCodes('&', usedantifog);

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
		int oneCost = plugin.getConfig().getInt("tierOneApplyCost");
		String cost1 = String.valueOf(oneCost);
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
					if (lore.contains(beastE) || lore.contains(bumpE) || lore.contains(healthboostE)
							|| lore.contains(implodeE) || lore.contains(leapsE) || lore.contains(rebornE)
							|| lore.contains(replenishE) || lore.contains(retreatE) || lore.contains(scootE)
							|| lore.contains(tipsyE) || lore.contains(vanishE) || lore.contains(wearyE)
							|| lore.contains(archeryE) || lore.contains(confusionE) || lore.contains(lifeE)
							|| lore.contains(lightningE) || lore.contains(lightsoutE) || lore.contains(soulE)
							|| lore.contains(thunderousE) || lore.contains(blastE) || lore.contains(experienceE)
							|| lore.contains(hasteE) || lore.contains(obsidiandestroyerE) || lore.contains(thiefE)
							|| lore.contains(arcE) || lore.contains(blazeE) || lore.contains(feastE)
							|| lore.contains(fishE) || lore.contains(swordblockE) || lore.contains(sunlightE)
							|| lore.contains(antifogE) || lore.contains(toughnessE)) {
						if (plevel < oneCost) {
							p.sendMessage(reqmsg.replace("{levels}", cost1));
							return;
						} else if (plevel >= oneCost) {
							Bukkit.getServer().getPluginManager().callEvent(
									new AnvilApply(p, anvil, lore, clear, oneCost, plevel, item, oldmeta, newmeta, m));
						}
					}
				}
			}
		}
	}
}
