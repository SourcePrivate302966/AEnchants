package com.nomic.AEnchants.AnvilUse;

import java.util.Arrays;
import java.util.List;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.inventory.AnvilInventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import com.nomic.AEnchants.Main;
import com.nomic.AEnchants.Events.AnvilCombine;

public class Combine implements Listener {
	
	private Main plugin;

	public Combine(Main pl) {
		plugin = pl;
	}
	
	String usedarc = "&bArc I";
	String arcE = ChatColor.translateAlternateColorCodes('&', usedarc);

	String usedbeast = "&bBeast I";
	String beastE = ChatColor.translateAlternateColorCodes('&', usedbeast);
	String usedbeast2 = "&eBeast II";
	String beastE2 = ChatColor.translateAlternateColorCodes('&', usedbeast2);
	String usedbeast3 = "&cBeast III";
	String beastE3 = ChatColor.translateAlternateColorCodes('&', usedbeast3);

	String usedblaze = "&bBlaze I";
	String blazeE = ChatColor.translateAlternateColorCodes('&', usedblaze);

	String usedbump = "&bBump I";
	String bumpE = ChatColor.translateAlternateColorCodes('&', usedbump);
	String usedbump2 = "&eBump II";
	String bumpE2 = ChatColor.translateAlternateColorCodes('&', usedbump2);
	String usedbump3 = "&cBump III";
	String bumpE3 = ChatColor.translateAlternateColorCodes('&', usedbump3);

	String usedfeast = "&bFeast I";
	String feastE = ChatColor.translateAlternateColorCodes('&', usedfeast);

	String usedfish = "&bFish I";
	String fishE = ChatColor.translateAlternateColorCodes('&', usedfish);

	String usedhealthboost = "&bHealth Boost I";
	String healthboostE = ChatColor.translateAlternateColorCodes('&', usedhealthboost);
	String usedhealthboost2 = "&eHealth Boost II";
	String healthboostE2 = ChatColor.translateAlternateColorCodes('&', usedhealthboost2);

	String usedimplode = "&bImplode I";
	String implodeE = ChatColor.translateAlternateColorCodes('&', usedimplode);
	String usedimplode2 = "&eImplode II";
	String implodeE2 = ChatColor.translateAlternateColorCodes('&', usedimplode2);
	String usedimplode3 = "&cImplode III";
	String implodeE3 = ChatColor.translateAlternateColorCodes('&', usedimplode3);

	String usedleaps = "&bLeaps I";
	String leapsE = ChatColor.translateAlternateColorCodes('&', usedleaps);
	String usedleaps2 = "&eLeaps II";
	String leapsE2 = ChatColor.translateAlternateColorCodes('&', usedleaps2);
	String usedleaps3 = "&cLeaps III";
	String leapsE3 = ChatColor.translateAlternateColorCodes('&', usedleaps3);

	String usedreborn = "&bReborn I";
	String rebornE = ChatColor.translateAlternateColorCodes('&', usedreborn);
	String usedreborn2 = "&eReborn II";
	String rebornE2 = ChatColor.translateAlternateColorCodes('&', usedreborn2);
	String usedreborn3 = "&cReborn III";
	String rebornE3 = ChatColor.translateAlternateColorCodes('&', usedreborn3);

	String usedreplenish = "&bReplenish I";
	String replenishE = ChatColor.translateAlternateColorCodes('&', usedreplenish);
	String usedreplenish2 = "&eReplenish II";
	String replenishE2 = ChatColor.translateAlternateColorCodes('&', usedreplenish2);
	String usedreplenish3 = "&cReplenish III";
	String replenishE3 = ChatColor.translateAlternateColorCodes('&', usedreplenish3);

	String usedretreat = "&bRetreat I";
	String retreatE = ChatColor.translateAlternateColorCodes('&', usedretreat);
	String usedretreat2 = "&eRetreat II";
	String retreatE2 = ChatColor.translateAlternateColorCodes('&', usedretreat2);
	String usedretreat3 = "&cRetreat III";
	String retreatE3 = ChatColor.translateAlternateColorCodes('&', usedretreat3);

	String usedscoot = "&bScoot I";
	String scootE = ChatColor.translateAlternateColorCodes('&', usedscoot);
	String usedscoot2 = "&eScoot II";
	String scootE2 = ChatColor.translateAlternateColorCodes('&', usedscoot2);
	String usedscoot3 = "&cScoot III";
	String scootE3 = ChatColor.translateAlternateColorCodes('&', usedscoot3);

	String usedsunlight = "&bSunlight I";
	String sunlightE = ChatColor.translateAlternateColorCodes('&', usedsunlight);

	String usedtipsy = "&bTipsy I";
	String tipsyE = ChatColor.translateAlternateColorCodes('&', usedtipsy);
	String usedtipsy2 = "&eTipsy II";
	String tipsyE2 = ChatColor.translateAlternateColorCodes('&', usedtipsy2);
	String usedtipsy3 = "&cTipsy III";
	String tipsyE3 = ChatColor.translateAlternateColorCodes('&', usedtipsy3);

	String usedvanish = "&bVanish I";
	String vanishE = ChatColor.translateAlternateColorCodes('&', usedvanish);
	String usedvanish2 = "&eVanish II";
	String vanishE2 = ChatColor.translateAlternateColorCodes('&', usedvanish2);
	String usedvanish3 = "&cVanish III";
	String vanishE3 = ChatColor.translateAlternateColorCodes('&', usedvanish3);

	String usedweary = "&bWeary I";
	String wearyE = ChatColor.translateAlternateColorCodes('&', usedweary);
	String usedweary2 = "&eWeary II";
	String wearyE2 = ChatColor.translateAlternateColorCodes('&', usedweary2);
	String usedweary3 = "&cWeary III";
	String wearyE3 = ChatColor.translateAlternateColorCodes('&', usedweary3);

	String usedarchery = "&bArchery I";
	String archeryE = ChatColor.translateAlternateColorCodes('&', usedarchery);
	String usedarchery2 = "&eArchery II";
	String archeryE2 = ChatColor.translateAlternateColorCodes('&', usedarchery2);

	String usedconfusion = "&bConfusion I";
	String confusionE = ChatColor.translateAlternateColorCodes('&', usedconfusion);
	String usedconfusion2 = "&eConfusion II";
	String confusionE2 = ChatColor.translateAlternateColorCodes('&', usedconfusion2);

	String usedlife = "&bLife I";
	String lifeE = ChatColor.translateAlternateColorCodes('&', usedlife);
	String usedlife2 = "&eLife II";
	String lifeE2 = ChatColor.translateAlternateColorCodes('&', usedlife2);

	String usedlightning = "&bLightning I";
	String lightningE = ChatColor.translateAlternateColorCodes('&', usedlightning);
	String usedlightning2 = "&eLightning II";
	String lightningE2 = ChatColor.translateAlternateColorCodes('&', usedlightning2);
	String usedlightning3 = "&cLightning III";
	String lightningE3 = ChatColor.translateAlternateColorCodes('&', usedlightning3);

	String usedlightsout = "&bLights Out I";
	String lightsoutE = ChatColor.translateAlternateColorCodes('&', usedlightsout);
	String usedlightsout2 = "&eLights Out II";
	String lightsoutE2 = ChatColor.translateAlternateColorCodes('&', usedlightsout2);

	String usedsoul = "&bSoul I";
	String soulE = ChatColor.translateAlternateColorCodes('&', usedsoul);
	String usedsoul2 = "&eSoul II";
	String soulE2 = ChatColor.translateAlternateColorCodes('&', usedsoul2);

	String usedswordblock = "&bSword Block I";
	String swordblockE = ChatColor.translateAlternateColorCodes('&', usedswordblock);

	String usedthunderous = "&bThunderous I";
	String thunderousE = ChatColor.translateAlternateColorCodes('&', usedthunderous);
	String usedthunderous2 = "&eThunderous II";
	String thunderousE2 = ChatColor.translateAlternateColorCodes('&', usedthunderous2);
	String usedthunderous3 = "&cThunderous III";
	String thunderousE3 = ChatColor.translateAlternateColorCodes('&', usedthunderous3);

	String usedblast = "&bBlast I";
	String blastE = ChatColor.translateAlternateColorCodes('&', usedblast);
	String usedblast2 = "&eBlast II";
	String blastE2 = ChatColor.translateAlternateColorCodes('&', usedblast2);

	String usedexperience = "&bExperience I";
	String experienceE = ChatColor.translateAlternateColorCodes('&', usedexperience);
	String usedexperience2 = "&eExperience II";
	String experienceE2 = ChatColor.translateAlternateColorCodes('&', usedexperience2);
	String usedexperience3 = "&cExperience III";
	String experienceE3 = ChatColor.translateAlternateColorCodes('&', usedexperience3);

	String usedhaste = "&bHaste I";
	String hasteE = ChatColor.translateAlternateColorCodes('&', usedhaste);
	String usedhaste2 = "&eHaste II";
	String hasteE2 = ChatColor.translateAlternateColorCodes('&', usedhaste2);
	String usedhaste3 = "&cHaste III";
	String hasteE3 = ChatColor.translateAlternateColorCodes('&', usedhaste3);

	String usedobsidiandestroyer = "&bObsidian Destroyer I";
	String obsidiandestroyerE = ChatColor.translateAlternateColorCodes('&', usedobsidiandestroyer);
	String usedobsidiandestroyer2 = "&eObsidian Destroyer II";
	String obsidiandestroyerE2 = ChatColor.translateAlternateColorCodes('&', usedobsidiandestroyer2);
	String usedobsidiandestroyer3 = "&cObsidian Destroyer III";
	String obsidiandestroyerE3 = ChatColor.translateAlternateColorCodes('&', usedobsidiandestroyer3);

	String usedthief = "&bThief I";
	String thiefE = ChatColor.translateAlternateColorCodes('&', usedthief);
	String usedthief2 = "&eThief II";
	String thiefE2 = ChatColor.translateAlternateColorCodes('&', usedthief2);
	String usedthief3 = "&cThief III";
	String thiefE3 = ChatColor.translateAlternateColorCodes('&', usedthief3);

	String usedtoughness = "&bToughness I";
	String toughnessE = ChatColor.translateAlternateColorCodes('&', usedtoughness);
	String usedtoughness2 = "&eToughness II";
	String toughnessE2 = ChatColor.translateAlternateColorCodes('&', usedtoughness2);
	String usedtoughness3 = "&cToughness III";
	String toughnessE3 = ChatColor.translateAlternateColorCodes('&', usedtoughness3);

	String usedantifog = "&bAnti Fog I";
	String antifogE = ChatColor.translateAlternateColorCodes('&', usedantifog);
	
	@EventHandler
	public void onCombine(AnvilCombine e) {
		Player p = e.getPlayer();
		List<String> lore1 = e.getAnvilLore();
		List<String> lore = e.getItemLore();
		AnvilInventory anvil = e.getAnvil();
		String msg = plugin.getConfig().getString("combineBookMessage");
		String sendmsg = ChatColor.translateAlternateColorCodes('&', msg);
		ItemMeta meta = e.getMeta();
		ItemStack result = e.getResultItem();
		ItemStack clear = e.getClearItem();
		int bookCost = e.getCost();
		int plevel = e.getPlayerLevel();
		if (lore1.contains(beastE) && lore.contains(beastE)) {
			anvil.clear();
			p.setItemOnCursor(clear);
			p.closeInventory();
			meta.setLore(Arrays.asList(beastE2));
			result.setItemMeta(meta);
			p.getInventory().addItem(result);
			p.setLevel(plevel - bookCost);
			p.sendMessage(sendmsg.replace("{book}", usedbeast2.replace("&e", "")));
		} else if (lore1.contains(bumpE) && lore.contains(bumpE)) {
			anvil.clear();
			p.setItemOnCursor(clear);
			p.closeInventory();
			meta.setLore(Arrays.asList(bumpE2));
			result.setItemMeta(meta);
			p.getInventory().addItem(result);
			p.setLevel(plevel - bookCost);
			p.sendMessage(sendmsg.replace("{book}", usedbump2.replace("&e", "")));
		} else if (lore1.contains(healthboostE) && lore.contains(healthboostE)) {
			anvil.clear();
			p.setItemOnCursor(clear);
			p.closeInventory();
			meta.setLore(Arrays.asList(healthboostE2));
			result.setItemMeta(meta);
			p.getInventory().addItem(result);
			p.setLevel(plevel - bookCost);
			p.sendMessage(sendmsg.replace("{book}", usedhealthboost2.replace("&e", "")));
		} else if (lore1.contains(implodeE) && lore.contains(implodeE)) {
			anvil.clear();
			p.setItemOnCursor(clear);
			p.closeInventory();
			meta.setLore(Arrays.asList(implodeE2));
			result.setItemMeta(meta);
			p.getInventory().addItem(result);
			p.setLevel(plevel - bookCost);
			p.sendMessage(sendmsg.replace("{book}", usedimplode2.replace("&e", "")));
		} else if (lore1.contains(leapsE) && lore.contains(leapsE)) {
			anvil.clear();
			p.setItemOnCursor(clear);
			p.closeInventory();
			meta.setLore(Arrays.asList(leapsE2));
			result.setItemMeta(meta);
			p.getInventory().addItem(result);
			p.setLevel(plevel - bookCost);
			p.sendMessage(sendmsg.replace("{book}", usedleaps2.replace("&e", "")));
		} else if (lore1.contains(rebornE) && lore.contains(rebornE)) {
			anvil.clear();
			p.setItemOnCursor(clear);
			p.closeInventory();
			meta.setLore(Arrays.asList(rebornE2));
			result.setItemMeta(meta);
			p.getInventory().addItem(result);
			p.setLevel(plevel - bookCost);
			p.sendMessage(sendmsg.replace("{book}", usedreborn2.replace("&e", "")));
		} else if (lore1.contains(replenishE) && lore.contains(replenishE)) {
			anvil.clear();
			p.setItemOnCursor(clear);
			p.closeInventory();
			meta.setLore(Arrays.asList(replenishE2));
			result.setItemMeta(meta);
			p.getInventory().addItem(result);
			p.setLevel(plevel - bookCost);
			p.sendMessage(sendmsg.replace("{book}", usedreplenish2.replace("&e", "")));
		} else if (lore1.contains(retreatE) && lore.contains(retreatE)) {
			anvil.clear();
			p.setItemOnCursor(clear);
			p.closeInventory();
			meta.setLore(Arrays.asList(retreatE2));
			result.setItemMeta(meta);
			p.getInventory().addItem(result);
			p.setLevel(plevel - bookCost);
			p.sendMessage(sendmsg.replace("{book}", usedretreat2.replace("&e", "")));
		} else if (lore1.contains(scootE) && lore.contains(scootE)) {
			anvil.clear();
			p.setItemOnCursor(clear);
			p.closeInventory();
			meta.setLore(Arrays.asList(scootE2));
			result.setItemMeta(meta);
			p.getInventory().addItem(result);
			p.setLevel(plevel - bookCost);
			p.sendMessage(sendmsg.replace("{book}", usedscoot2.replace("&e", "")));
		} else if (lore1.contains(tipsyE) && lore.contains(tipsyE)) {
			anvil.clear();
			p.setItemOnCursor(clear);
			p.closeInventory();
			meta.setLore(Arrays.asList(tipsyE2));
			result.setItemMeta(meta);
			p.getInventory().addItem(result);
			p.setLevel(plevel - bookCost);
			p.sendMessage(sendmsg.replace("{book}", usedtipsy2.replace("&e", "")));
		} else if (lore1.contains(vanishE) && lore.contains(vanishE)) {
			anvil.clear();
			p.setItemOnCursor(clear);
			p.closeInventory();
			meta.setLore(Arrays.asList(vanishE2));
			result.setItemMeta(meta);
			p.getInventory().addItem(result);
			p.setLevel(plevel - bookCost);
			p.sendMessage(sendmsg.replace("{book}", usedvanish2.replace("&e", "")));
		} else if (lore1.contains(wearyE) && lore.contains(wearyE)) {
			anvil.clear();
			p.setItemOnCursor(clear);
			p.closeInventory();
			meta.setLore(Arrays.asList(wearyE2));
			result.setItemMeta(meta);
			p.getInventory().addItem(result);
			p.setLevel(plevel - bookCost);
			p.sendMessage(sendmsg.replace("{book}", usedweary2.replace("&e", "")));
		} else if (lore1.contains(archeryE) && lore.contains(archeryE)) {
			anvil.clear();
			p.setItemOnCursor(clear);
			p.closeInventory();
			meta.setLore(Arrays.asList(archeryE2));
			result.setItemMeta(meta);
			p.getInventory().addItem(result);
			p.setLevel(plevel - bookCost);
			p.sendMessage(sendmsg.replace("{book}", usedarchery2.replace("&e", "")));
		} else if (lore1.contains(confusionE) && lore.contains(confusionE)) {
			anvil.clear();
			p.setItemOnCursor(clear);
			p.closeInventory();
			meta.setLore(Arrays.asList(confusionE2));
			result.setItemMeta(meta);
			p.getInventory().addItem(result);
			p.setLevel(plevel - bookCost);
			p.sendMessage(sendmsg.replace("{book}", usedconfusion2.replace("&e", "")));
		} else if (lore1.contains(lifeE) && lore.contains(lifeE)) {
			anvil.clear();
			p.setItemOnCursor(clear);
			p.closeInventory();
			meta.setLore(Arrays.asList(lifeE2));
			result.setItemMeta(meta);
			p.getInventory().addItem(result);
			p.setLevel(plevel - bookCost);
			p.sendMessage(sendmsg.replace("{book}", usedlife2.replace("&e", "")));
		} else if (lore1.contains(lightningE) && lore.contains(lightningE)) {
			anvil.clear();
			p.setItemOnCursor(clear);
			p.closeInventory();
			meta.setLore(Arrays.asList(lightningE2));
			result.setItemMeta(meta);
			p.getInventory().addItem(result);
			p.setLevel(plevel - bookCost);
			p.sendMessage(sendmsg.replace("{book}", usedlightning2.replace("&e", "")));
		} else if (lore1.contains(lightsoutE) && lore.contains(lightsoutE)) {
			anvil.clear();
			p.setItemOnCursor(clear);
			p.closeInventory();
			meta.setLore(Arrays.asList(lightsoutE2));
			result.setItemMeta(meta);
			p.getInventory().addItem(result);
			p.setLevel(plevel - bookCost);
			p.sendMessage(sendmsg.replace("{book}", usedlightsout2.replace("&e", "")));
		} else if (lore1.contains(soulE) && lore.contains(soulE)) {
			anvil.clear();
			p.setItemOnCursor(clear);
			p.closeInventory();
			meta.setLore(Arrays.asList(soulE2));
			result.setItemMeta(meta);
			p.getInventory().addItem(result);
			p.setLevel(plevel - bookCost);
			p.sendMessage(sendmsg.replace("{book}", usedsoul2.replace("&e", "")));
		} else if (lore1.contains(thunderousE) && lore.contains(thunderousE)) {
			anvil.clear();
			p.setItemOnCursor(clear);
			p.closeInventory();
			meta.setLore(Arrays.asList(thunderousE2));
			result.setItemMeta(meta);
			p.getInventory().addItem(result);
			p.setLevel(plevel - bookCost);
			p.sendMessage(sendmsg.replace("{book}", usedthunderous2.replace("&e", "")));
		} else if (lore1.contains(blastE) && lore.contains(blastE)) {
			anvil.clear();
			p.setItemOnCursor(clear);
			p.closeInventory();
			meta.setLore(Arrays.asList(blastE2));
			result.setItemMeta(meta);
			p.getInventory().addItem(result);
			p.setLevel(plevel - bookCost);
			p.sendMessage(sendmsg.replace("{book}", usedblast2.replace("&e", "")));
		} else if (lore1.contains(experienceE) && lore.contains(experienceE)) {
			anvil.clear();
			p.setItemOnCursor(clear);
			p.closeInventory();
			meta.setLore(Arrays.asList(experienceE2));
			result.setItemMeta(meta);
			p.getInventory().addItem(result);
			p.setLevel(plevel - bookCost);
			p.sendMessage(sendmsg.replace("{book}", usedexperience2.replace("&e", "")));
		} else if (lore1.contains(hasteE) && lore.contains(hasteE)) {
			anvil.clear();
			p.setItemOnCursor(clear);
			p.closeInventory();
			meta.setLore(Arrays.asList(hasteE2));
			result.setItemMeta(meta);
			p.getInventory().addItem(result);
			p.setLevel(plevel - bookCost);
			p.sendMessage(sendmsg.replace("{book}", usedhaste2.replace("&e", "")));
		} else if (lore1.contains(obsidiandestroyerE) && lore.contains(obsidiandestroyerE)) {
			anvil.clear();
			p.setItemOnCursor(clear);
			p.closeInventory();
			meta.setLore(Arrays.asList(obsidiandestroyerE2));
			result.setItemMeta(meta);
			p.getInventory().addItem(result);
			p.setLevel(plevel - bookCost);
			p.sendMessage(sendmsg.replace("{book}", usedobsidiandestroyer2.replace("&e", "")));
		} else if (lore1.contains(thiefE) && lore.contains(thiefE)) {
			anvil.clear();
			p.setItemOnCursor(clear);
			p.closeInventory();
			meta.setLore(Arrays.asList(thiefE2));
			result.setItemMeta(meta);
			p.getInventory().addItem(result);
			p.setLevel(plevel - bookCost);
			p.sendMessage(sendmsg.replace("{book}", usedthief2.replace("&e", "")));
		} else if (lore1.contains(beastE2) && lore.contains(beastE2)) {
			anvil.clear();
			p.setItemOnCursor(clear);
			p.closeInventory();
			meta.setLore(Arrays.asList(beastE3));
			result.setItemMeta(meta);
			p.getInventory().addItem(result);
			p.setLevel(plevel - bookCost);
			p.sendMessage(sendmsg.replace("{book}", usedbeast3.replace("&c", "")));
		} else if (lore1.contains(bumpE2) && lore.contains(bumpE2)) {
			anvil.clear();
			p.setItemOnCursor(clear);
			p.closeInventory();
			meta.setLore(Arrays.asList(bumpE3));
			result.setItemMeta(meta);
			p.getInventory().addItem(result);
			p.setLevel(plevel - bookCost);
			p.sendMessage(sendmsg.replace("{book}", usedbump3.replace("&c", "")));
		} else if (lore1.contains(implodeE2) && lore.contains(implodeE2)) {
			anvil.clear();
			p.setItemOnCursor(clear);
			p.closeInventory();
			meta.setLore(Arrays.asList(implodeE3));
			result.setItemMeta(meta);
			p.getInventory().addItem(result);
			p.setLevel(plevel - bookCost);
			p.sendMessage(sendmsg.replace("{book}", usedimplode3.replace("&c", "")));
		} else if (lore1.contains(leapsE2) && lore.contains(leapsE2)) {
			anvil.clear();
			p.setItemOnCursor(clear);
			p.closeInventory();
			meta.setLore(Arrays.asList(leapsE3));
			result.setItemMeta(meta);
			p.getInventory().addItem(result);
			p.setLevel(plevel - bookCost);
			p.sendMessage(sendmsg.replace("{book}", usedleaps3.replace("&c", "")));
		} else if (lore1.contains(rebornE2) && lore.contains(rebornE2)) {
			anvil.clear();
			p.setItemOnCursor(clear);
			p.closeInventory();
			meta.setLore(Arrays.asList(rebornE3));
			result.setItemMeta(meta);
			p.getInventory().addItem(result);
			p.setLevel(plevel - bookCost);
			p.sendMessage(sendmsg.replace("{book}", usedreborn3.replace("&c", "")));
		} else if (lore1.contains(replenishE2) && lore.contains(replenishE2)) {
			anvil.clear();
			p.setItemOnCursor(clear);
			p.closeInventory();
			meta.setLore(Arrays.asList(replenishE3));
			result.setItemMeta(meta);
			p.getInventory().addItem(result);
			p.setLevel(plevel - bookCost);
			p.sendMessage(sendmsg.replace("{book}", usedreplenish3.replace("&c", "")));
		} else if (lore1.contains(retreatE2) && lore.contains(retreatE2)) {
			anvil.clear();
			p.setItemOnCursor(clear);
			p.closeInventory();
			meta.setLore(Arrays.asList(retreatE3));
			result.setItemMeta(meta);
			p.getInventory().addItem(result);
			p.setLevel(plevel - bookCost);
			p.sendMessage(sendmsg.replace("{book}", usedretreat3.replace("&c", "")));
		} else if (lore1.contains(scootE2) && lore.contains(scootE2)) {
			anvil.clear();
			p.setItemOnCursor(clear);
			p.closeInventory();
			meta.setLore(Arrays.asList(scootE3));
			result.setItemMeta(meta);
			p.getInventory().addItem(result);
			p.setLevel(plevel - bookCost);
			p.sendMessage(sendmsg.replace("{book}", usedscoot3.replace("&c", "")));
		} else if (lore1.contains(tipsyE2) && lore.contains(tipsyE2)) {
			anvil.clear();
			p.setItemOnCursor(clear);
			p.closeInventory();
			meta.setLore(Arrays.asList(tipsyE3));
			result.setItemMeta(meta);
			p.getInventory().addItem(result);
			p.setLevel(plevel - bookCost);
			p.sendMessage(sendmsg.replace("{book}", usedtipsy3.replace("&c", "")));
		} else if (lore1.contains(vanishE2) && lore.contains(vanishE2)) {
			anvil.clear();
			p.setItemOnCursor(clear);
			p.closeInventory();
			meta.setLore(Arrays.asList(vanishE3));
			result.setItemMeta(meta);
			p.getInventory().addItem(result);
			p.setLevel(plevel - bookCost);
			p.sendMessage(sendmsg.replace("{book}", usedvanish3.replace("&c", "")));
		} else if (lore1.contains(wearyE2) && lore.contains(wearyE2)) {
			anvil.clear();
			p.setItemOnCursor(clear);
			p.closeInventory();
			meta.setLore(Arrays.asList(wearyE3));
			result.setItemMeta(meta);
			p.getInventory().addItem(result);
			p.setLevel(plevel - bookCost);
			p.sendMessage(sendmsg.replace("{book}", usedweary3.replace("&c", "")));
		} else if (lore1.contains(lightningE2) && lore.contains(lightningE2)) {
			anvil.clear();
			p.setItemOnCursor(clear);
			p.closeInventory();
			meta.setLore(Arrays.asList(lightningE3));
			result.setItemMeta(meta);
			p.getInventory().addItem(result);
			p.setLevel(plevel - bookCost);
			p.sendMessage(sendmsg.replace("{book}", usedlightning3.replace("&c", "")));
		} else if (lore1.contains(thunderousE2) && lore.contains(thunderousE2)) {
			anvil.clear();
			p.setItemOnCursor(clear);
			p.closeInventory();
			meta.setLore(Arrays.asList(thunderousE3));
			result.setItemMeta(meta);
			p.getInventory().addItem(result);
			p.setLevel(plevel - bookCost);
			p.sendMessage(sendmsg.replace("{book}", usedthunderous3.replace("&c", "")));
		} else if (lore1.contains(experienceE2) && lore.contains(experienceE2)) {
			anvil.clear();
			p.setItemOnCursor(clear);
			p.closeInventory();
			meta.setLore(Arrays.asList(experienceE3));
			result.setItemMeta(meta);
			p.getInventory().addItem(result);
			p.setLevel(plevel - bookCost);
			p.sendMessage(sendmsg.replace("{book}", usedexperience3.replace("&c", "")));
		} else if (lore1.contains(hasteE2) && lore.contains(hasteE2)) {
			anvil.clear();
			p.setItemOnCursor(clear);
			p.closeInventory();
			meta.setLore(Arrays.asList(hasteE3));
			result.setItemMeta(meta);
			p.getInventory().addItem(result);
			p.setLevel(plevel - bookCost);
			p.sendMessage(sendmsg.replace("{book}", usedhaste3.replace("&c", "")));
		} else if (lore1.contains(obsidiandestroyerE2) && lore.contains(obsidiandestroyerE2)) {
			anvil.clear();
			p.setItemOnCursor(clear);
			p.closeInventory();
			meta.setLore(Arrays.asList(obsidiandestroyerE3));
			result.setItemMeta(meta);
			p.getInventory().addItem(result);
			p.setLevel(plevel - bookCost);
			p.sendMessage(sendmsg.replace("{book}", usedobsidiandestroyer3.replace("&c", "")));
		} else if (lore1.contains(thiefE2) && lore.contains(thiefE2)) {
			anvil.clear();
			p.setItemOnCursor(clear);
			p.closeInventory();
			meta.setLore(Arrays.asList(thiefE3));
			result.setItemMeta(meta);
			p.getInventory().addItem(result);
			p.setLevel(plevel - bookCost);
			p.sendMessage(sendmsg.replace("{book}", usedthief3.replace("&c", "")));
		} else if (lore1.contains(toughnessE) && lore.contains(toughnessE)) {
			anvil.clear();
			p.setItemOnCursor(clear);
			p.closeInventory();
			meta.setLore(Arrays.asList(toughnessE2));
			result.setItemMeta(meta);
			p.getInventory().addItem(result);
			p.setLevel(plevel - bookCost);
			p.sendMessage(sendmsg.replace("{book}", usedtoughness2.replace("&e", "")));
		} else if (lore1.contains(toughnessE2) && lore.contains(toughnessE2)) {
			anvil.clear();
			p.setItemOnCursor(clear);
			p.closeInventory();
			meta.setLore(Arrays.asList(toughnessE3));
			result.setItemMeta(meta);
			p.getInventory().addItem(result);
			p.setLevel(plevel - bookCost);
			p.sendMessage(sendmsg.replace("{book}", usedtoughness3.replace("&c", "")));
		}
	}
}
