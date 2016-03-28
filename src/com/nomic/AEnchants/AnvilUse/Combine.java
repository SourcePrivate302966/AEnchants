package com.nomic.AEnchants.AnvilUse;

import java.util.Arrays;
import java.util.List;

import org.bukkit.ChatColor;
import org.bukkit.configuration.ConfigurationSection;
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

	@EventHandler
	public void onCombine(AnvilCombine e) {
		
        ConfigurationSection names = plugin.getConfig().getConfigurationSection("enchantNames");

		String usedbeast = names.getConfigurationSection("Beast").getString("one");
		String beastE = ChatColor.translateAlternateColorCodes('&', usedbeast);
		String usedbeast2 = names.getConfigurationSection("Beast").getString("two");
		String beastE2 = ChatColor.translateAlternateColorCodes('&', usedbeast2);
		String usedbeast3 = names.getConfigurationSection("Beast").getString("three");
		String beastE3 = ChatColor.translateAlternateColorCodes('&', usedbeast3);

		String usedbump = names.getConfigurationSection("Bump").getString("one");
		String bumpE = ChatColor.translateAlternateColorCodes('&', usedbump);
		String usedbump2 = names.getConfigurationSection("Bump").getString("two");
		String bumpE2 = ChatColor.translateAlternateColorCodes('&', usedbump2);
		String usedbump3 = names.getConfigurationSection("Bump").getString("three");
		String bumpE3 = ChatColor.translateAlternateColorCodes('&', usedbump3);

		String usedhealthboost = names.getConfigurationSection("HealthBoost").getString("one");
		String healthboostE = ChatColor.translateAlternateColorCodes('&', usedhealthboost);
		String usedhealthboost2 = names.getConfigurationSection("HealthBoost").getString("two");
		String healthboostE2 = ChatColor.translateAlternateColorCodes('&', usedhealthboost2);

		String usedimplode = names.getConfigurationSection("Implode").getString("one");
		String implodeE = ChatColor.translateAlternateColorCodes('&', usedimplode);
		String usedimplode2 = names.getConfigurationSection("Implode").getString("two");
		String implodeE2 = ChatColor.translateAlternateColorCodes('&', usedimplode2);
		String usedimplode3 = names.getConfigurationSection("Implode").getString("three");
		String implodeE3 = ChatColor.translateAlternateColorCodes('&', usedimplode3);

		String usedleaps = names.getConfigurationSection("Leaps").getString("one");
		String leapsE = ChatColor.translateAlternateColorCodes('&', usedleaps);
		String usedleaps2 = names.getConfigurationSection("Leaps").getString("two");
		String leapsE2 = ChatColor.translateAlternateColorCodes('&', usedleaps2);
		String usedleaps3 = names.getConfigurationSection("Leaps").getString("three");
		String leapsE3 = ChatColor.translateAlternateColorCodes('&', usedleaps3);

		String usedreborn = names.getConfigurationSection("Reborn").getString("one");
		String rebornE = ChatColor.translateAlternateColorCodes('&', usedreborn);
		String usedreborn2 = names.getConfigurationSection("Reborn").getString("two");
		String rebornE2 = ChatColor.translateAlternateColorCodes('&', usedreborn2);
		String usedreborn3 = names.getConfigurationSection("Reborn").getString("three");
		String rebornE3 = ChatColor.translateAlternateColorCodes('&', usedreborn3);

		String usedreplenish = names.getConfigurationSection("Replenish").getString("one");
		String replenishE = ChatColor.translateAlternateColorCodes('&', usedreplenish);
		String usedreplenish2 = names.getConfigurationSection("Replenish").getString("two");
		String replenishE2 = ChatColor.translateAlternateColorCodes('&', usedreplenish2);
		String usedreplenish3 = names.getConfigurationSection("Replenish").getString("three");
		String replenishE3 = ChatColor.translateAlternateColorCodes('&', usedreplenish3);

		String usedretreat = names.getConfigurationSection("Retreat").getString("one");
		String retreatE = ChatColor.translateAlternateColorCodes('&', usedretreat);
		String usedretreat2 = names.getConfigurationSection("Retreat").getString("two");
		String retreatE2 = ChatColor.translateAlternateColorCodes('&', usedretreat2);
		String usedretreat3 = names.getConfigurationSection("Retreat").getString("three");
		String retreatE3 = ChatColor.translateAlternateColorCodes('&', usedretreat3);

		String usedscoot = names.getConfigurationSection("Scoot").getString("one");
		String scootE = ChatColor.translateAlternateColorCodes('&', usedscoot);
		String usedscoot2 = names.getConfigurationSection("Scoot").getString("two");
		String scootE2 = ChatColor.translateAlternateColorCodes('&', usedscoot2);
		String usedscoot3 = names.getConfigurationSection("Scoot").getString("three");
		String scootE3 = ChatColor.translateAlternateColorCodes('&', usedscoot3);

		String usedtipsy = names.getConfigurationSection("Tipsy").getString("one");
		String tipsyE = ChatColor.translateAlternateColorCodes('&', usedtipsy);
		String usedtipsy2 = names.getConfigurationSection("Tipsy").getString("two");
		String tipsyE2 = ChatColor.translateAlternateColorCodes('&', usedtipsy2);
		String usedtipsy3 = names.getConfigurationSection("Tipsy").getString("three");
		String tipsyE3 = ChatColor.translateAlternateColorCodes('&', usedtipsy3);

		String usedvanish = names.getConfigurationSection("Vanish").getString("one");
		String vanishE = ChatColor.translateAlternateColorCodes('&', usedvanish);
		String usedvanish2 = names.getConfigurationSection("Vanish").getString("two");
		String vanishE2 = ChatColor.translateAlternateColorCodes('&', usedvanish2);
		String usedvanish3 = names.getConfigurationSection("Vanish").getString("three");
		String vanishE3 = ChatColor.translateAlternateColorCodes('&', usedvanish3);

		String usedweary = names.getConfigurationSection("Weary").getString("one");
		String wearyE = ChatColor.translateAlternateColorCodes('&', usedweary);
		String usedweary2 = names.getConfigurationSection("Weary").getString("two");
		String wearyE2 = ChatColor.translateAlternateColorCodes('&', usedweary2);
		String usedweary3 = names.getConfigurationSection("Weary").getString("three");
		String wearyE3 = ChatColor.translateAlternateColorCodes('&', usedweary3);

		String usedarchery = names.getConfigurationSection("Archery").getString("one");
		String archeryE = ChatColor.translateAlternateColorCodes('&', usedarchery);
		String usedarchery2 = names.getConfigurationSection("Archery").getString("two");
		String archeryE2 = ChatColor.translateAlternateColorCodes('&', usedarchery2);

		String usedconfusion = names.getConfigurationSection("Confusion").getString("one");
		String confusionE = ChatColor.translateAlternateColorCodes('&', usedconfusion);
		String usedconfusion2 = names.getConfigurationSection("Confusion").getString("two");
		String confusionE2 = ChatColor.translateAlternateColorCodes('&', usedconfusion2);

		String usedlife = names.getConfigurationSection("Life").getString("one");
		String lifeE = ChatColor.translateAlternateColorCodes('&', usedlife);
		String usedlife2 = names.getConfigurationSection("Life").getString("two");
		String lifeE2 = ChatColor.translateAlternateColorCodes('&', usedlife2);

		String usedlightning = names.getConfigurationSection("Lightning").getString("one");
		String lightningE = ChatColor.translateAlternateColorCodes('&', usedlightning);
		String usedlightning2 = names.getConfigurationSection("Lightning").getString("two");
		String lightningE2 = ChatColor.translateAlternateColorCodes('&', usedlightning2);
		String usedlightning3 = names.getConfigurationSection("Lightning").getString("three");
		String lightningE3 = ChatColor.translateAlternateColorCodes('&', usedlightning3);

		String usedlightsout = names.getConfigurationSection("LightsOut").getString("one");
		String lightsoutE = ChatColor.translateAlternateColorCodes('&', usedlightsout);
		String usedlightsout2 = names.getConfigurationSection("LightsOut").getString("two");
		String lightsoutE2 = ChatColor.translateAlternateColorCodes('&', usedlightsout2);

		String usedsoul = names.getConfigurationSection("Soul").getString("one");
		String soulE = ChatColor.translateAlternateColorCodes('&', usedsoul);
		String usedsoul2 = names.getConfigurationSection("Soul").getString("two");
		String soulE2 = ChatColor.translateAlternateColorCodes('&', usedsoul2);

		String usedthunderous = names.getConfigurationSection("Thunderous").getString("one");
		String thunderousE = ChatColor.translateAlternateColorCodes('&', usedthunderous);
		String usedthunderous2 = names.getConfigurationSection("Thunderous").getString("two");
		String thunderousE2 = ChatColor.translateAlternateColorCodes('&', usedthunderous2);
		String usedthunderous3 = names.getConfigurationSection("Thunderous").getString("three");
		String thunderousE3 = ChatColor.translateAlternateColorCodes('&', usedthunderous3);

		String usedblast = names.getConfigurationSection("Blast").getString("one");
		String blastE = ChatColor.translateAlternateColorCodes('&', usedblast);
		String usedblast2 = names.getConfigurationSection("Blast").getString("two");
		String blastE2 = ChatColor.translateAlternateColorCodes('&', usedblast2);

		String usedexperience = names.getConfigurationSection("Experience").getString("one");
		String experienceE = ChatColor.translateAlternateColorCodes('&', usedexperience);
		String usedexperience2 = names.getConfigurationSection("Experience").getString("two");
		String experienceE2 = ChatColor.translateAlternateColorCodes('&', usedexperience2);
		String usedexperience3 = names.getConfigurationSection("Experience").getString("three");
		String experienceE3 = ChatColor.translateAlternateColorCodes('&', usedexperience3);

		String usedhaste = names.getConfigurationSection("Haste").getString("one");
		String hasteE = ChatColor.translateAlternateColorCodes('&', usedhaste);
		String usedhaste2 = names.getConfigurationSection("Haste").getString("two");
		String hasteE2 = ChatColor.translateAlternateColorCodes('&', usedhaste2);
		String usedhaste3 = names.getConfigurationSection("Haste").getString("three");
		String hasteE3 = ChatColor.translateAlternateColorCodes('&', usedhaste3);

		String usedobsidiandestroyer = names.getConfigurationSection("ObsidianDestroyer").getString("one");
		String obsidiandestroyerE = ChatColor.translateAlternateColorCodes('&', usedobsidiandestroyer);
		String usedobsidiandestroyer2 = names.getConfigurationSection("ObsidianDestroyer").getString("two");
		String obsidiandestroyerE2 = ChatColor.translateAlternateColorCodes('&', usedobsidiandestroyer2);
		String usedobsidiandestroyer3 = names.getConfigurationSection("ObsidianDestroyer").getString("three");
		String obsidiandestroyerE3 = ChatColor.translateAlternateColorCodes('&', usedobsidiandestroyer3);

		String usedthief = names.getConfigurationSection("Thief").getString("one");
		String thiefE = ChatColor.translateAlternateColorCodes('&', usedthief);
		String usedthief2 = names.getConfigurationSection("Thief").getString("two");
		String thiefE2 = ChatColor.translateAlternateColorCodes('&', usedthief2);
		String usedthief3 = names.getConfigurationSection("Thief").getString("three");
		String thiefE3 = ChatColor.translateAlternateColorCodes('&', usedthief3);

		String usedtoughness = names.getConfigurationSection("Toughness").getString("one");
		String toughnessE = ChatColor.translateAlternateColorCodes('&', usedtoughness);
		String usedtoughness2 = names.getConfigurationSection("Toughness").getString("two");
		String toughnessE2 = ChatColor.translateAlternateColorCodes('&', usedtoughness2);
		String usedtoughness3 = names.getConfigurationSection("Toughness").getString("three");
		String toughnessE3 = ChatColor.translateAlternateColorCodes('&', usedtoughness3);
		
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
			if (!(sendmsg.equals("none")))
				p.sendMessage(sendmsg.replace("{book}", usedbeast2.replace("&e", "")));
		} else if (lore1.contains(bumpE) && lore.contains(bumpE)) {
			anvil.clear();
			p.setItemOnCursor(clear);
			p.closeInventory();
			meta.setLore(Arrays.asList(bumpE2));
			result.setItemMeta(meta);
			p.getInventory().addItem(result);
			p.setLevel(plevel - bookCost);
			if (!(sendmsg.equals("none")))
				p.sendMessage(sendmsg.replace("{book}", usedbump2.replace("&e", "")));
		} else if (lore1.contains(healthboostE) && lore.contains(healthboostE)) {
			anvil.clear();
			p.setItemOnCursor(clear);
			p.closeInventory();
			meta.setLore(Arrays.asList(healthboostE2));
			result.setItemMeta(meta);
			p.getInventory().addItem(result);
			p.setLevel(plevel - bookCost);
			if (!(sendmsg.equals("none")))
				p.sendMessage(sendmsg.replace("{book}", usedhealthboost2.replace("&e", "")));
		} else if (lore1.contains(implodeE) && lore.contains(implodeE)) {
			anvil.clear();
			p.setItemOnCursor(clear);
			p.closeInventory();
			meta.setLore(Arrays.asList(implodeE2));
			result.setItemMeta(meta);
			p.getInventory().addItem(result);
			p.setLevel(plevel - bookCost);
			if (!(sendmsg.equals("none")))
				p.sendMessage(sendmsg.replace("{book}", usedimplode2.replace("&e", "")));
		} else if (lore1.contains(leapsE) && lore.contains(leapsE)) {
			anvil.clear();
			p.setItemOnCursor(clear);
			p.closeInventory();
			meta.setLore(Arrays.asList(leapsE2));
			result.setItemMeta(meta);
			p.getInventory().addItem(result);
			p.setLevel(plevel - bookCost);
			if (!(sendmsg.equals("none")))
				p.sendMessage(sendmsg.replace("{book}", usedleaps2.replace("&e", "")));
		} else if (lore1.contains(rebornE) && lore.contains(rebornE)) {
			anvil.clear();
			p.setItemOnCursor(clear);
			p.closeInventory();
			meta.setLore(Arrays.asList(rebornE2));
			result.setItemMeta(meta);
			p.getInventory().addItem(result);
			p.setLevel(plevel - bookCost);
			if (!(sendmsg.equals("none")))
				p.sendMessage(sendmsg.replace("{book}", usedreborn2.replace("&e", "")));
		} else if (lore1.contains(replenishE) && lore.contains(replenishE)) {
			anvil.clear();
			p.setItemOnCursor(clear);
			p.closeInventory();
			meta.setLore(Arrays.asList(replenishE2));
			result.setItemMeta(meta);
			p.getInventory().addItem(result);
			p.setLevel(plevel - bookCost);
			if (!(sendmsg.equals("none")))
				p.sendMessage(sendmsg.replace("{book}", usedreplenish2.replace("&e", "")));
		} else if (lore1.contains(retreatE) && lore.contains(retreatE)) {
			anvil.clear();
			p.setItemOnCursor(clear);
			p.closeInventory();
			meta.setLore(Arrays.asList(retreatE2));
			result.setItemMeta(meta);
			p.getInventory().addItem(result);
			p.setLevel(plevel - bookCost);
			if (!(sendmsg.equals("none")))
				p.sendMessage(sendmsg.replace("{book}", usedretreat2.replace("&e", "")));
		} else if (lore1.contains(scootE) && lore.contains(scootE)) {
			anvil.clear();
			p.setItemOnCursor(clear);
			p.closeInventory();
			meta.setLore(Arrays.asList(scootE2));
			result.setItemMeta(meta);
			p.getInventory().addItem(result);
			p.setLevel(plevel - bookCost);
			if (!(sendmsg.equals("none")))
				p.sendMessage(sendmsg.replace("{book}", usedscoot2.replace("&e", "")));
		} else if (lore1.contains(tipsyE) && lore.contains(tipsyE)) {
			anvil.clear();
			p.setItemOnCursor(clear);
			p.closeInventory();
			meta.setLore(Arrays.asList(tipsyE2));
			result.setItemMeta(meta);
			p.getInventory().addItem(result);
			p.setLevel(plevel - bookCost);
			if (!(sendmsg.equals("none")))
				p.sendMessage(sendmsg.replace("{book}", usedtipsy2.replace("&e", "")));
		} else if (lore1.contains(vanishE) && lore.contains(vanishE)) {
			anvil.clear();
			p.setItemOnCursor(clear);
			p.closeInventory();
			meta.setLore(Arrays.asList(vanishE2));
			result.setItemMeta(meta);
			p.getInventory().addItem(result);
			p.setLevel(plevel - bookCost);
			if (!(sendmsg.equals("none")))
				p.sendMessage(sendmsg.replace("{book}", usedvanish2.replace("&e", "")));
		} else if (lore1.contains(wearyE) && lore.contains(wearyE)) {
			anvil.clear();
			p.setItemOnCursor(clear);
			p.closeInventory();
			meta.setLore(Arrays.asList(wearyE2));
			result.setItemMeta(meta);
			p.getInventory().addItem(result);
			p.setLevel(plevel - bookCost);
			if (!(sendmsg.equals("none")))
				p.sendMessage(sendmsg.replace("{book}", usedweary2.replace("&e", "")));
		} else if (lore1.contains(archeryE) && lore.contains(archeryE)) {
			anvil.clear();
			p.setItemOnCursor(clear);
			p.closeInventory();
			meta.setLore(Arrays.asList(archeryE2));
			result.setItemMeta(meta);
			p.getInventory().addItem(result);
			p.setLevel(plevel - bookCost);
			if (!(sendmsg.equals("none")))
				p.sendMessage(sendmsg.replace("{book}", usedarchery2.replace("&e", "")));
		} else if (lore1.contains(confusionE) && lore.contains(confusionE)) {
			anvil.clear();
			p.setItemOnCursor(clear);
			p.closeInventory();
			meta.setLore(Arrays.asList(confusionE2));
			result.setItemMeta(meta);
			p.getInventory().addItem(result);
			p.setLevel(plevel - bookCost);
			if (!(sendmsg.equals("none")))
				p.sendMessage(sendmsg.replace("{book}", usedconfusion2.replace("&e", "")));
		} else if (lore1.contains(lifeE) && lore.contains(lifeE)) {
			anvil.clear();
			p.setItemOnCursor(clear);
			p.closeInventory();
			meta.setLore(Arrays.asList(lifeE2));
			result.setItemMeta(meta);
			p.getInventory().addItem(result);
			p.setLevel(plevel - bookCost);
			if (!(sendmsg.equals("none")))
				p.sendMessage(sendmsg.replace("{book}", usedlife2.replace("&e", "")));
		} else if (lore1.contains(lightningE) && lore.contains(lightningE)) {
			anvil.clear();
			p.setItemOnCursor(clear);
			p.closeInventory();
			meta.setLore(Arrays.asList(lightningE2));
			result.setItemMeta(meta);
			p.getInventory().addItem(result);
			p.setLevel(plevel - bookCost);
			if (!(sendmsg.equals("none")))
				p.sendMessage(sendmsg.replace("{book}", usedlightning2.replace("&e", "")));
		} else if (lore1.contains(lightsoutE) && lore.contains(lightsoutE)) {
			anvil.clear();
			p.setItemOnCursor(clear);
			p.closeInventory();
			meta.setLore(Arrays.asList(lightsoutE2));
			result.setItemMeta(meta);
			p.getInventory().addItem(result);
			p.setLevel(plevel - bookCost);
			if (!(sendmsg.equals("none")))
				p.sendMessage(sendmsg.replace("{book}", usedlightsout2.replace("&e", "")));
		} else if (lore1.contains(soulE) && lore.contains(soulE)) {
			anvil.clear();
			p.setItemOnCursor(clear);
			p.closeInventory();
			meta.setLore(Arrays.asList(soulE2));
			result.setItemMeta(meta);
			p.getInventory().addItem(result);
			p.setLevel(plevel - bookCost);
			if (!(sendmsg.equals("none")))
				p.sendMessage(sendmsg.replace("{book}", usedsoul2.replace("&e", "")));
		} else if (lore1.contains(thunderousE) && lore.contains(thunderousE)) {
			anvil.clear();
			p.setItemOnCursor(clear);
			p.closeInventory();
			meta.setLore(Arrays.asList(thunderousE2));
			result.setItemMeta(meta);
			p.getInventory().addItem(result);
			p.setLevel(plevel - bookCost);
			if (!(sendmsg.equals("none")))
				p.sendMessage(sendmsg.replace("{book}", usedthunderous2.replace("&e", "")));
		} else if (lore1.contains(blastE) && lore.contains(blastE)) {
			anvil.clear();
			p.setItemOnCursor(clear);
			p.closeInventory();
			meta.setLore(Arrays.asList(blastE2));
			result.setItemMeta(meta);
			p.getInventory().addItem(result);
			p.setLevel(plevel - bookCost);
			if (!(sendmsg.equals("none")))
				p.sendMessage(sendmsg.replace("{book}", usedblast2.replace("&e", "")));
		} else if (lore1.contains(experienceE) && lore.contains(experienceE)) {
			anvil.clear();
			p.setItemOnCursor(clear);
			p.closeInventory();
			meta.setLore(Arrays.asList(experienceE2));
			result.setItemMeta(meta);
			p.getInventory().addItem(result);
			p.setLevel(plevel - bookCost);
			if (!(sendmsg.equals("none")))
				p.sendMessage(sendmsg.replace("{book}", usedexperience2.replace("&e", "")));
		} else if (lore1.contains(hasteE) && lore.contains(hasteE)) {
			anvil.clear();
			p.setItemOnCursor(clear);
			p.closeInventory();
			meta.setLore(Arrays.asList(hasteE2));
			result.setItemMeta(meta);
			p.getInventory().addItem(result);
			p.setLevel(plevel - bookCost);
			if (!(sendmsg.equals("none")))
				p.sendMessage(sendmsg.replace("{book}", usedhaste2.replace("&e", "")));
		} else if (lore1.contains(obsidiandestroyerE) && lore.contains(obsidiandestroyerE)) {
			anvil.clear();
			p.setItemOnCursor(clear);
			p.closeInventory();
			meta.setLore(Arrays.asList(obsidiandestroyerE2));
			result.setItemMeta(meta);
			p.getInventory().addItem(result);
			p.setLevel(plevel - bookCost);
			if (!(sendmsg.equals("none")))
				p.sendMessage(sendmsg.replace("{book}", usedobsidiandestroyer2.replace("&e", "")));
		} else if (lore1.contains(thiefE) && lore.contains(thiefE)) {
			anvil.clear();
			p.setItemOnCursor(clear);
			p.closeInventory();
			meta.setLore(Arrays.asList(thiefE2));
			result.setItemMeta(meta);
			p.getInventory().addItem(result);
			p.setLevel(plevel - bookCost);
			if (!(sendmsg.equals("none")))
				p.sendMessage(sendmsg.replace("{book}", usedthief2.replace("&e", "")));
		} else if (lore1.contains(beastE2) && lore.contains(beastE2)) {
			anvil.clear();
			p.setItemOnCursor(clear);
			p.closeInventory();
			meta.setLore(Arrays.asList(beastE3));
			result.setItemMeta(meta);
			p.getInventory().addItem(result);
			p.setLevel(plevel - bookCost);
			if (!(sendmsg.equals("none")))
				p.sendMessage(sendmsg.replace("{book}", usedbeast3.replace("&c", "")));
		} else if (lore1.contains(bumpE2) && lore.contains(bumpE2)) {
			anvil.clear();
			p.setItemOnCursor(clear);
			p.closeInventory();
			meta.setLore(Arrays.asList(bumpE3));
			result.setItemMeta(meta);
			p.getInventory().addItem(result);
			p.setLevel(plevel - bookCost);
			if (!(sendmsg.equals("none")))
				p.sendMessage(sendmsg.replace("{book}", usedbump3.replace("&c", "")));
		} else if (lore1.contains(implodeE2) && lore.contains(implodeE2)) {
			anvil.clear();
			p.setItemOnCursor(clear);
			p.closeInventory();
			meta.setLore(Arrays.asList(implodeE3));
			result.setItemMeta(meta);
			p.getInventory().addItem(result);
			p.setLevel(plevel - bookCost);
			if (!(sendmsg.equals("none")))
				p.sendMessage(sendmsg.replace("{book}", usedimplode3.replace("&c", "")));
		} else if (lore1.contains(leapsE2) && lore.contains(leapsE2)) {
			anvil.clear();
			p.setItemOnCursor(clear);
			p.closeInventory();
			meta.setLore(Arrays.asList(leapsE3));
			result.setItemMeta(meta);
			p.getInventory().addItem(result);
			p.setLevel(plevel - bookCost);
			if (!(sendmsg.equals("none")))
				p.sendMessage(sendmsg.replace("{book}", usedleaps3.replace("&c", "")));
		} else if (lore1.contains(rebornE2) && lore.contains(rebornE2)) {
			anvil.clear();
			p.setItemOnCursor(clear);
			p.closeInventory();
			meta.setLore(Arrays.asList(rebornE3));
			result.setItemMeta(meta);
			p.getInventory().addItem(result);
			p.setLevel(plevel - bookCost);
			if (!(sendmsg.equals("none")))
				p.sendMessage(sendmsg.replace("{book}", usedreborn3.replace("&c", "")));
		} else if (lore1.contains(replenishE2) && lore.contains(replenishE2)) {
			anvil.clear();
			p.setItemOnCursor(clear);
			p.closeInventory();
			meta.setLore(Arrays.asList(replenishE3));
			result.setItemMeta(meta);
			p.getInventory().addItem(result);
			p.setLevel(plevel - bookCost);
			if (!(sendmsg.equals("none")))
				p.sendMessage(sendmsg.replace("{book}", usedreplenish3.replace("&c", "")));
		} else if (lore1.contains(retreatE2) && lore.contains(retreatE2)) {
			anvil.clear();
			p.setItemOnCursor(clear);
			p.closeInventory();
			meta.setLore(Arrays.asList(retreatE3));
			result.setItemMeta(meta);
			p.getInventory().addItem(result);
			p.setLevel(plevel - bookCost);
			if (!(sendmsg.equals("none")))
				p.sendMessage(sendmsg.replace("{book}", usedretreat3.replace("&c", "")));
		} else if (lore1.contains(scootE2) && lore.contains(scootE2)) {
			anvil.clear();
			p.setItemOnCursor(clear);
			p.closeInventory();
			meta.setLore(Arrays.asList(scootE3));
			result.setItemMeta(meta);
			p.getInventory().addItem(result);
			p.setLevel(plevel - bookCost);
			if (!(sendmsg.equals("none")))
				p.sendMessage(sendmsg.replace("{book}", usedscoot3.replace("&c", "")));
		} else if (lore1.contains(tipsyE2) && lore.contains(tipsyE2)) {
			anvil.clear();
			p.setItemOnCursor(clear);
			p.closeInventory();
			meta.setLore(Arrays.asList(tipsyE3));
			result.setItemMeta(meta);
			p.getInventory().addItem(result);
			p.setLevel(plevel - bookCost);
			if (!(sendmsg.equals("none")))
				p.sendMessage(sendmsg.replace("{book}", usedtipsy3.replace("&c", "")));
		} else if (lore1.contains(vanishE2) && lore.contains(vanishE2)) {
			anvil.clear();
			p.setItemOnCursor(clear);
			p.closeInventory();
			meta.setLore(Arrays.asList(vanishE3));
			result.setItemMeta(meta);
			p.getInventory().addItem(result);
			p.setLevel(plevel - bookCost);
			if (!(sendmsg.equals("none")))
				p.sendMessage(sendmsg.replace("{book}", usedvanish3.replace("&c", "")));
		} else if (lore1.contains(wearyE2) && lore.contains(wearyE2)) {
			anvil.clear();
			p.setItemOnCursor(clear);
			p.closeInventory();
			meta.setLore(Arrays.asList(wearyE3));
			result.setItemMeta(meta);
			p.getInventory().addItem(result);
			p.setLevel(plevel - bookCost);
			if (!(sendmsg.equals("none")))
				p.sendMessage(sendmsg.replace("{book}", usedweary3.replace("&c", "")));
		} else if (lore1.contains(lightningE2) && lore.contains(lightningE2)) {
			anvil.clear();
			p.setItemOnCursor(clear);
			p.closeInventory();
			meta.setLore(Arrays.asList(lightningE3));
			result.setItemMeta(meta);
			p.getInventory().addItem(result);
			p.setLevel(plevel - bookCost);
			if (!(sendmsg.equals("none")))
				p.sendMessage(sendmsg.replace("{book}", usedlightning3.replace("&c", "")));
		} else if (lore1.contains(thunderousE2) && lore.contains(thunderousE2)) {
			anvil.clear();
			p.setItemOnCursor(clear);
			p.closeInventory();
			meta.setLore(Arrays.asList(thunderousE3));
			result.setItemMeta(meta);
			p.getInventory().addItem(result);
			p.setLevel(plevel - bookCost);
			if (!(sendmsg.equals("none")))
				p.sendMessage(sendmsg.replace("{book}", usedthunderous3.replace("&c", "")));
		} else if (lore1.contains(experienceE2) && lore.contains(experienceE2)) {
			anvil.clear();
			p.setItemOnCursor(clear);
			p.closeInventory();
			meta.setLore(Arrays.asList(experienceE3));
			result.setItemMeta(meta);
			p.getInventory().addItem(result);
			p.setLevel(plevel - bookCost);
			if (!(sendmsg.equals("none")))
				p.sendMessage(sendmsg.replace("{book}", usedexperience3.replace("&c", "")));
		} else if (lore1.contains(hasteE2) && lore.contains(hasteE2)) {
			anvil.clear();
			p.setItemOnCursor(clear);
			p.closeInventory();
			meta.setLore(Arrays.asList(hasteE3));
			result.setItemMeta(meta);
			p.getInventory().addItem(result);
			p.setLevel(plevel - bookCost);
			if (!(sendmsg.equals("none")))
				p.sendMessage(sendmsg.replace("{book}", usedhaste3.replace("&c", "")));
		} else if (lore1.contains(obsidiandestroyerE2) && lore.contains(obsidiandestroyerE2)) {
			anvil.clear();
			p.setItemOnCursor(clear);
			p.closeInventory();
			meta.setLore(Arrays.asList(obsidiandestroyerE3));
			result.setItemMeta(meta);
			p.getInventory().addItem(result);
			p.setLevel(plevel - bookCost);
			if (!(sendmsg.equals("none")))
				p.sendMessage(sendmsg.replace("{book}", usedobsidiandestroyer3.replace("&c", "")));
		} else if (lore1.contains(thiefE2) && lore.contains(thiefE2)) {
			anvil.clear();
			p.setItemOnCursor(clear);
			p.closeInventory();
			meta.setLore(Arrays.asList(thiefE3));
			result.setItemMeta(meta);
			p.getInventory().addItem(result);
			p.setLevel(plevel - bookCost);
			if (!(sendmsg.equals("none")))
				p.sendMessage(sendmsg.replace("{book}", usedthief3.replace("&c", "")));
		} else if (lore1.contains(toughnessE) && lore.contains(toughnessE)) {
			anvil.clear();
			p.setItemOnCursor(clear);
			p.closeInventory();
			meta.setLore(Arrays.asList(toughnessE2));
			result.setItemMeta(meta);
			p.getInventory().addItem(result);
			p.setLevel(plevel - bookCost);
			if (!(sendmsg.equals("none")))
				p.sendMessage(sendmsg.replace("{book}", usedtoughness2.replace("&e", "")));
		} else if (lore1.contains(toughnessE2) && lore.contains(toughnessE2)) {
			anvil.clear();
			p.setItemOnCursor(clear);
			p.closeInventory();
			meta.setLore(Arrays.asList(toughnessE3));
			result.setItemMeta(meta);
			p.getInventory().addItem(result);
			p.setLevel(plevel - bookCost);
			if (!(sendmsg.equals("none")))
				p.sendMessage(sendmsg.replace("{book}", usedtoughness3.replace("&c", "")));
		}
	}
}
