package com.nomic.AEnchants;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.block.Sign;
import org.bukkit.configuration.ConfigurationSection;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.inventory.meta.ItemMeta;

public class ClickSign implements Listener {

	private Main plugin;

	public ClickSign(Main pl) {
		plugin = pl;
	}

	String one = "Tier 1";
	String two = "Tier 2";
	String three = "Tier 3";

	@EventHandler
	public void onClick(PlayerInteractEvent e) {
		if (e.getClickedBlock() == null)
			return;
		if (!(e.getClickedBlock().getState() instanceof Sign))
			return;
		
		ConfigurationSection names = plugin.getConfig().getConfigurationSection("enchantNames");
		
	    String arc = "Arc";
		String usedarc = names.getConfigurationSection("Arc").getString("one");
		String arcE = ChatColor.translateAlternateColorCodes('&', usedarc);

		String beast = "Beast";
		String usedbeast = names.getConfigurationSection("Beast").getString("one");
		String beastE = ChatColor.translateAlternateColorCodes('&', usedbeast);
		String usedbeast2 = names.getConfigurationSection("Beast").getString("two");
		String beastE2 = ChatColor.translateAlternateColorCodes('&', usedbeast2);
		String usedbeast3 = names.getConfigurationSection("Beast").getString("three");
		String beastE3 = ChatColor.translateAlternateColorCodes('&', usedbeast3);

		String blaze = "Blaze";
		String usedblaze = names.getConfigurationSection("Blaze").getString("one");
		String blazeE = ChatColor.translateAlternateColorCodes('&', usedblaze);

		String bump = "Bump";
		String usedbump = names.getConfigurationSection("Bump").getString("one");
		String bumpE = ChatColor.translateAlternateColorCodes('&', usedbump);
		String usedbump2 = names.getConfigurationSection("Bump").getString("two");
		String bumpE2 = ChatColor.translateAlternateColorCodes('&', usedbump2);
		String usedbump3 = names.getConfigurationSection("Bump").getString("three");
		String bumpE3 = ChatColor.translateAlternateColorCodes('&', usedbump3);

		String feast = "Feast";
		String usedfeast = names.getConfigurationSection("Feast").getString("one");
		String feastE = ChatColor.translateAlternateColorCodes('&', usedfeast);

		String fish = "Fish";
		String usedfish = names.getConfigurationSection("Fish").getString("one");
		String fishE = ChatColor.translateAlternateColorCodes('&', usedfish);

		String healthboost = "HealthBoost";
		String usedhealthboost = names.getConfigurationSection("HealthBoost").getString("one");
		String healthboostE = ChatColor.translateAlternateColorCodes('&', usedhealthboost);
		String usedhealthboost2 = names.getConfigurationSection("HealthBoost").getString("two");
		String healthboostE2 = ChatColor.translateAlternateColorCodes('&', usedhealthboost2);

		String implode = "Implode";
		String usedimplode = names.getConfigurationSection("Implode").getString("one");
		String implodeE = ChatColor.translateAlternateColorCodes('&', usedimplode);
		String usedimplode2 = names.getConfigurationSection("Implode").getString("two");
		String implodeE2 = ChatColor.translateAlternateColorCodes('&', usedimplode2);
		String usedimplode3 = names.getConfigurationSection("Implode").getString("three");
		String implodeE3 = ChatColor.translateAlternateColorCodes('&', usedimplode3);

		String leaps = "Leaps";
		String usedleaps = names.getConfigurationSection("Leaps").getString("one");
		String leapsE = ChatColor.translateAlternateColorCodes('&', usedleaps);
		String usedleaps2 = names.getConfigurationSection("Leaps").getString("two");
		String leapsE2 = ChatColor.translateAlternateColorCodes('&', usedleaps2);
		String usedleaps3 = names.getConfigurationSection("Leaps").getString("three");
		String leapsE3 = ChatColor.translateAlternateColorCodes('&', usedleaps3);

		String reborn = "Reborn";
		String usedreborn = names.getConfigurationSection("Reborn").getString("one");
		String rebornE = ChatColor.translateAlternateColorCodes('&', usedreborn);
		String usedreborn2 = names.getConfigurationSection("Reborn").getString("two");
		String rebornE2 = ChatColor.translateAlternateColorCodes('&', usedreborn2);
		String usedreborn3 = names.getConfigurationSection("Reborn").getString("three");
		String rebornE3 = ChatColor.translateAlternateColorCodes('&', usedreborn3);

		String replenish = "Replenish";
		String usedreplenish = names.getConfigurationSection("Replenish").getString("one");
		String replenishE = ChatColor.translateAlternateColorCodes('&', usedreplenish);
		String usedreplenish2 = names.getConfigurationSection("Replenish").getString("two");
		String replenishE2 = ChatColor.translateAlternateColorCodes('&', usedreplenish2);
		String usedreplenish3 = names.getConfigurationSection("Replenish").getString("three");
		String replenishE3 = ChatColor.translateAlternateColorCodes('&', usedreplenish3);

		String retreat = "Retreat";
		String usedretreat = names.getConfigurationSection("Retreat").getString("one");
		String retreatE = ChatColor.translateAlternateColorCodes('&', usedretreat);
		String usedretreat2 = names.getConfigurationSection("Retreat").getString("two");
		String retreatE2 = ChatColor.translateAlternateColorCodes('&', usedretreat2);
		String usedretreat3 = names.getConfigurationSection("Retreat").getString("three");
		String retreatE3 = ChatColor.translateAlternateColorCodes('&', usedretreat3);

		String scoot = "Scoot";
		String usedscoot = names.getConfigurationSection("Scoot").getString("one");
		String scootE = ChatColor.translateAlternateColorCodes('&', usedscoot);
		String usedscoot2 = names.getConfigurationSection("Scoot").getString("two");
		String scootE2 = ChatColor.translateAlternateColorCodes('&', usedscoot2);
		String usedscoot3 = names.getConfigurationSection("Scoot").getString("three");
		String scootE3 = ChatColor.translateAlternateColorCodes('&', usedscoot3);

		String sunlight = "Sunlight";
		String usedsunlight = names.getConfigurationSection("Sunlight").getString("one");
		String sunlightE = ChatColor.translateAlternateColorCodes('&', usedsunlight);

		String tipsy = "Tipsy";
		String usedtipsy = names.getConfigurationSection("Tipsy").getString("one");
		String tipsyE = ChatColor.translateAlternateColorCodes('&', usedtipsy);
		String usedtipsy2 = names.getConfigurationSection("Tipsy").getString("two");
		String tipsyE2 = ChatColor.translateAlternateColorCodes('&', usedtipsy2);
		String usedtipsy3 = names.getConfigurationSection("Tipsy").getString("three");
		String tipsyE3 = ChatColor.translateAlternateColorCodes('&', usedtipsy3);

		String vanish = "Vanish";
		String usedvanish = names.getConfigurationSection("Vanish").getString("one");
		String vanishE = ChatColor.translateAlternateColorCodes('&', usedvanish);
		String usedvanish2 = names.getConfigurationSection("Vanish").getString("two");
		String vanishE2 = ChatColor.translateAlternateColorCodes('&', usedvanish2);
		String usedvanish3 = names.getConfigurationSection("Vanish").getString("three");
		String vanishE3 = ChatColor.translateAlternateColorCodes('&', usedvanish3);

		String weary = "Weary";
		String usedweary = names.getConfigurationSection("Weary").getString("one");
		String wearyE = ChatColor.translateAlternateColorCodes('&', usedweary);
		String usedweary2 = names.getConfigurationSection("Weary").getString("two");
		String wearyE2 = ChatColor.translateAlternateColorCodes('&', usedweary2);
		String usedweary3 = names.getConfigurationSection("Weary").getString("three");
		String wearyE3 = ChatColor.translateAlternateColorCodes('&', usedweary3);

		String archery = "Archery";
		String usedarchery = names.getConfigurationSection("Archery").getString("one");
		String archeryE = ChatColor.translateAlternateColorCodes('&', usedarchery);
		String usedarchery2 = names.getConfigurationSection("Archery").getString("two");
		String archeryE2 = ChatColor.translateAlternateColorCodes('&', usedarchery2);

		String confusion = "Confusion";
		String usedconfusion = names.getConfigurationSection("Confusion").getString("one");
		String confusionE = ChatColor.translateAlternateColorCodes('&', usedconfusion);
		String usedconfusion2 = names.getConfigurationSection("Confusion").getString("two");
		String confusionE2 = ChatColor.translateAlternateColorCodes('&', usedconfusion2);

		String life = "Life";
		String usedlife = names.getConfigurationSection("Life").getString("one");
		String lifeE = ChatColor.translateAlternateColorCodes('&', usedlife);
		String usedlife2 = names.getConfigurationSection("Life").getString("two");
		String lifeE2 = ChatColor.translateAlternateColorCodes('&', usedlife2);

		String lightning = "Lightning";
		String usedlightning = names.getConfigurationSection("Lightning").getString("one");
		String lightningE = ChatColor.translateAlternateColorCodes('&', usedlightning);
		String usedlightning2 = names.getConfigurationSection("Lightning").getString("two");
		String lightningE2 = ChatColor.translateAlternateColorCodes('&', usedlightning2);
		String usedlightning3 = names.getConfigurationSection("Lightning").getString("three");
		String lightningE3 = ChatColor.translateAlternateColorCodes('&', usedlightning3);

		String lightsout = "LightsOut";
		String usedlightsout = names.getConfigurationSection("LightsOut").getString("one");
		String lightsoutE = ChatColor.translateAlternateColorCodes('&', usedlightsout);
		String usedlightsout2 = names.getConfigurationSection("LightsOut").getString("two");
		String lightsoutE2 = ChatColor.translateAlternateColorCodes('&', usedlightsout2);

		String soul = "Soul";
		String usedsoul = names.getConfigurationSection("Soul").getString("one");
		String soulE = ChatColor.translateAlternateColorCodes('&', usedsoul);
		String usedsoul2 = names.getConfigurationSection("Soul").getString("two");
		String soulE2 = ChatColor.translateAlternateColorCodes('&', usedsoul2);

		String swordblock = "SwordBlock";
		String usedswordblock = names.getConfigurationSection("SwordBlock").getString("one");
		String swordblockE = ChatColor.translateAlternateColorCodes('&', usedswordblock);
		String usedswordblock2 = names.getConfigurationSection("SwordBlock").getString("two");
		String swordblockE2 = ChatColor.translateAlternateColorCodes('&', usedswordblock2);

		String thunderous = "Thunderous";
		String usedthunderous = names.getConfigurationSection("Thunderous").getString("one");
		String thunderousE = ChatColor.translateAlternateColorCodes('&', usedthunderous);
		String usedthunderous2 = names.getConfigurationSection("Thunderous").getString("two");
		String thunderousE2 = ChatColor.translateAlternateColorCodes('&', usedthunderous2);
		String usedthunderous3 = names.getConfigurationSection("Thunderous").getString("three");
		String thunderousE3 = ChatColor.translateAlternateColorCodes('&', usedthunderous3);

		String blast = "Blast";
		String usedblast = names.getConfigurationSection("Blast").getString("one");
		String blastE = ChatColor.translateAlternateColorCodes('&', usedblast);
		String usedblast2 = names.getConfigurationSection("Blast").getString("two");
		String blastE2 = ChatColor.translateAlternateColorCodes('&', usedblast2);

		String experience = "Experience";
		String usedexperience = names.getConfigurationSection("Experience").getString("one");
		String experienceE = ChatColor.translateAlternateColorCodes('&', usedexperience);
		String usedexperience2 = names.getConfigurationSection("Experience").getString("two");
		String experienceE2 = ChatColor.translateAlternateColorCodes('&', usedexperience2);
		String usedexperience3 = names.getConfigurationSection("Experience").getString("three");
		String experienceE3 = ChatColor.translateAlternateColorCodes('&', usedexperience3);

		String haste = "Haste";
		String usedhaste = names.getConfigurationSection("Haste").getString("one");
		String hasteE = ChatColor.translateAlternateColorCodes('&', usedhaste);
		String usedhaste2 = names.getConfigurationSection("Haste").getString("two");
		String hasteE2 = ChatColor.translateAlternateColorCodes('&', usedhaste2);
		String usedhaste3 = names.getConfigurationSection("Haste").getString("three");
		String hasteE3 = ChatColor.translateAlternateColorCodes('&', usedhaste3);

		String obsidiandestroyer = "ObsidianDestroyer";
		String usedobsidiandestroyer = names.getConfigurationSection("ObsidianDestroyer").getString("one");
		String obsidiandestroyerE = ChatColor.translateAlternateColorCodes('&', usedobsidiandestroyer);
		String usedobsidiandestroyer2 = names.getConfigurationSection("ObsidianDestroyer").getString("two");
		String obsidiandestroyerE2 = ChatColor.translateAlternateColorCodes('&', usedobsidiandestroyer2);
		String usedobsidiandestroyer3 = names.getConfigurationSection("ObsidianDestroyer").getString("three");
		String obsidiandestroyerE3 = ChatColor.translateAlternateColorCodes('&', usedobsidiandestroyer3);

		String thief = "Thief";
		String usedthief = names.getConfigurationSection("Thief").getString("one");
		String thiefE = ChatColor.translateAlternateColorCodes('&', usedthief);
		String usedthief2 = names.getConfigurationSection("Thief").getString("two");
		String thiefE2 = ChatColor.translateAlternateColorCodes('&', usedthief2);
		String usedthief3 = names.getConfigurationSection("Thief").getString("three");
		String thiefE3 = ChatColor.translateAlternateColorCodes('&', usedthief3);

		String toughness = "Toughness";
		String usedtoughness = names.getConfigurationSection("Toughness").getString("one");
		String toughnessE = ChatColor.translateAlternateColorCodes('&', usedtoughness);
		String usedtoughness2 = names.getConfigurationSection("Toughness").getString("two");
		String toughnessE2 = ChatColor.translateAlternateColorCodes('&', usedtoughness2);
		String usedtoughness3 = names.getConfigurationSection("Toughness").getString("three");
		String toughnessE3 = ChatColor.translateAlternateColorCodes('&', usedtoughness3);

		String antifog = "AntiFog";
		String usedantifog = names.getConfigurationSection("AntiFog").getString("one");
		String antifogE = ChatColor.translateAlternateColorCodes('&', usedantifog);
		
		String title = plugin.getConfig().getString("signTitle");
		String aenchants = ChatColor.translateAlternateColorCodes('&', title);
		Player p = e.getPlayer();
		PlayerInventory inv = p.getInventory();
		Sign sign = (Sign) e.getClickedBlock().getState();
		ConfigurationSection config = plugin.getConfig().getConfigurationSection("enabledBooks");
		String msg = plugin.getConfig().getString("signUseMessage");
		String sendmsg = ChatColor.translateAlternateColorCodes('&', msg);
		String notenoughmsg = plugin.getConfig().getString("notEnoughLevelsMessage");
		String notenoughsendmsg = ChatColor.translateAlternateColorCodes('&', notenoughmsg);
		String fullinv = plugin.getConfig().getString("fullInvMessage");
		String fullinvmsg = ChatColor.translateAlternateColorCodes('&', fullinv);
		if (!(sign.getLine(0).contains(aenchants)))
			return;
		if (inv.firstEmpty() == -1) {
			p.sendMessage(fullinvmsg);
			return;
		}
		ItemStack book = new ItemStack(Material.ENCHANTED_BOOK);
		ItemMeta meta = book.getItemMeta();
		String reqlevels = sign.getLine(2).replaceAll(" Levels", "");
		int levels = Integer.parseInt(reqlevels);
		int pLevel = p.getLevel();
		if (pLevel < levels) {
			p.sendMessage(notenoughsendmsg.replace("{levels}", reqlevels));
			return;
		}
		if (sign.getLine(1).contains(one)) {
			p.setLevel(pLevel - levels);
			Random random = new Random();
			int i = random.nextInt(config.getStringList("enabledTierOnes").size());
			ArrayList<String> enchants = (ArrayList<String>) config.getStringList("enabledTierOnes");
			if (enchants.get(i).equals(arc)) {
				meta.setLore(Arrays.asList(arcE));
				book.setItemMeta(meta);
				inv.addItem(book);
				if (!(sendmsg.equals("none")))
					p.sendMessage(sendmsg.replace("{tier}", one).replace("{enchant}", usedarc.replace("&b", "")));
			} else if (enchants.get(i).equals(beast)) {
				meta.setLore(Arrays.asList(beastE));
				book.setItemMeta(meta);
				inv.addItem(book);
				if (!(sendmsg.equals("none")))
					p.sendMessage(sendmsg.replace("{tier}", one).replace("{enchant}", usedbeast.replace("&b", "")));
			} else if (enchants.get(i).equals(blaze)) {
				meta.setLore(Arrays.asList(blazeE));
				book.setItemMeta(meta);
				inv.addItem(book);
				if (!(sendmsg.equals("none")))
					p.sendMessage(sendmsg.replace("{tier}", one).replace("{enchant}", usedblaze.replace("&b", "")));
			} else if (enchants.get(i).equals(bump)) {
				meta.setLore(Arrays.asList(bumpE));
				book.setItemMeta(meta);
				inv.addItem(book);
				if (!(sendmsg.equals("none")))
					p.sendMessage(sendmsg.replace("{tier}", one).replace("{enchant}", usedbump.replace("&b", "")));
			} else if (enchants.get(i).equals(feast)) {
				meta.setLore(Arrays.asList(feastE));
				book.setItemMeta(meta);
				inv.addItem(book);
				if (!(sendmsg.equals("none")))
					p.sendMessage(sendmsg.replace("{tier}", one).replace("{enchant}", usedfeast.replace("&b", "")));
			} else if (enchants.get(i).equals(fish)) {
				meta.setLore(Arrays.asList(fishE));
				book.setItemMeta(meta);
				inv.addItem(book);
				if (!(sendmsg.equals("none")))
					p.sendMessage(sendmsg.replace("{tier}", one).replace("{enchant}", usedfish.replace("&b", "")));
			} else if (enchants.get(i).equals(healthboost)) {
				meta.setLore(Arrays.asList(healthboostE));
				book.setItemMeta(meta);
				inv.addItem(book);
				if (!(sendmsg.equals("none")))
					p.sendMessage(
							sendmsg.replace("{tier}", one).replace("{enchant}", usedhealthboost.replace("&b", "")));
			} else if (enchants.get(i).equals(implode)) {
				meta.setLore(Arrays.asList(implodeE));
				book.setItemMeta(meta);
				inv.addItem(book);
				if (!(sendmsg.equals("none")))
					p.sendMessage(sendmsg.replace("{tier}", one).replace("{enchant}", usedimplode.replace("&b", "")));
			} else if (enchants.get(i).equals(leaps)) {
				meta.setLore(Arrays.asList(leapsE));
				book.setItemMeta(meta);
				inv.addItem(book);
				if (!(sendmsg.equals("none")))
					p.sendMessage(sendmsg.replace("{tier}", one).replace("{enchant}", usedleaps.replace("&b", "")));
			} else if (enchants.get(i).equals(reborn)) {
				meta.setLore(Arrays.asList(rebornE));
				book.setItemMeta(meta);
				inv.addItem(book);
				if (!(sendmsg.equals("none")))
					p.sendMessage(sendmsg.replace("{tier}", one).replace("{enchant}", usedreborn.replace("&b", "")));
			} else if (enchants.get(i).equals(replenish)) {
				meta.setLore(Arrays.asList(replenishE));
				book.setItemMeta(meta);
				inv.addItem(book);
				if (!(sendmsg.equals("none")))
					p.sendMessage(sendmsg.replace("{tier}", one).replace("{enchant}", usedreplenish.replace("&b", "")));
			} else if (enchants.get(i).equals(retreat)) {
				meta.setLore(Arrays.asList(retreatE));
				book.setItemMeta(meta);
				inv.addItem(book);
				if (!(sendmsg.equals("none")))
					p.sendMessage(sendmsg.replace("{tier}", one).replace("{enchant}", usedretreat.replace("&b", "")));
			} else if (enchants.get(i).equals(scoot)) {
				meta.setLore(Arrays.asList(scootE));
				book.setItemMeta(meta);
				inv.addItem(book);
				if (!(sendmsg.equals("none")))
					p.sendMessage(sendmsg.replace("{tier}", one).replace("{enchant}", usedscoot.replace("&b", "")));
			} else if (enchants.get(i).equals(sunlight)) {
				meta.setLore(Arrays.asList(sunlightE));
				book.setItemMeta(meta);
				inv.addItem(book);
				if (!(sendmsg.equals("none")))
					p.sendMessage(sendmsg.replace("{tier}", one).replace("{enchant}", usedsunlight.replace("&b", "")));
			} else if (enchants.get(i).equals(tipsy)) {
				meta.setLore(Arrays.asList(tipsyE));
				book.setItemMeta(meta);
				inv.addItem(book);
				if (!(sendmsg.equals("none")))
					p.sendMessage(sendmsg.replace("{tier}", one).replace("{enchant}", usedtipsy.replace("&b", "")));
			} else if (enchants.get(i).equals(vanish)) {
				meta.setLore(Arrays.asList(vanishE));
				book.setItemMeta(meta);
				inv.addItem(book);
				if (!(sendmsg.equals("none")))
					p.sendMessage(sendmsg.replace("{tier}", one).replace("{enchant}", usedvanish.replace("&b", "")));
			} else if (enchants.get(i).equals(weary)) {
				meta.setLore(Arrays.asList(wearyE));
				book.setItemMeta(meta);
				inv.addItem(book);
				if (!(sendmsg.equals("none")))
					p.sendMessage(sendmsg.replace("{tier}", one).replace("{enchant}", usedweary.replace("&b", "")));
			} else if (enchants.get(i).equals(archery)) {
				meta.setLore(Arrays.asList(archeryE));
				book.setItemMeta(meta);
				inv.addItem(book);
				if (!(sendmsg.equals("none")))
					p.sendMessage(sendmsg.replace("{tier}", one).replace("{enchant}", usedarchery.replace("&b", "")));
			} else if (enchants.get(i).equals(confusion)) {
				meta.setLore(Arrays.asList(confusionE));
				book.setItemMeta(meta);
				inv.addItem(book);
				if (!(sendmsg.equals("none")))
					p.sendMessage(sendmsg.replace("{tier}", one).replace("{enchant}", usedconfusion.replace("&b", "")));
			} else if (enchants.get(i).equals(life)) {
				meta.setLore(Arrays.asList(lifeE));
				book.setItemMeta(meta);
				inv.addItem(book);
				if (!(sendmsg.equals("none")))
					p.sendMessage(sendmsg.replace("{tier}", one).replace("{enchant}", usedlife.replace("&b", "")));
			} else if (enchants.get(i).equals(lightning)) {
				meta.setLore(Arrays.asList(lightningE));
				book.setItemMeta(meta);
				inv.addItem(book);
				if (!(sendmsg.equals("none")))
					p.sendMessage(sendmsg.replace("{tier}", one).replace("{enchant}", usedlightning.replace("&b", "")));
			} else if (enchants.get(i).equals(lightsout)) {
				meta.setLore(Arrays.asList(lightsoutE));
				book.setItemMeta(meta);
				inv.addItem(book);
				if (!(sendmsg.equals("none")))
					p.sendMessage(sendmsg.replace("{tier}", one).replace("{enchant}", usedlightsout.replace("&b", "")));
			} else if (enchants.get(i).equals(soul)) {
				meta.setLore(Arrays.asList(soulE));
				book.setItemMeta(meta);
				inv.addItem(book);
				if (!(sendmsg.equals("none")))
					p.sendMessage(sendmsg.replace("{tier}", one).replace("{enchant}", usedsoul.replace("&b", "")));
			} else if (enchants.get(i).equals(swordblock)) {
				meta.setLore(Arrays.asList(swordblockE));
				book.setItemMeta(meta);
				inv.addItem(book);
				if (!(sendmsg.equals("none")))
					p.sendMessage(
							sendmsg.replace("{tier}", one).replace("{enchant}", usedswordblock.replace("&b", "")));
			} else if (enchants.get(i).equals(thunderous)) {
				meta.setLore(Arrays.asList(thunderousE));
				book.setItemMeta(meta);
				inv.addItem(book);
				if (!(sendmsg.equals("none")))
					p.sendMessage(
							sendmsg.replace("{tier}", one).replace("{enchant}", usedthunderous.replace("&b", "")));
			} else if (enchants.get(i).equals(blast)) {
				meta.setLore(Arrays.asList(blastE));
				book.setItemMeta(meta);
				inv.addItem(book);
				if (!(sendmsg.equals("none")))
					p.sendMessage(sendmsg.replace("{tier}", one).replace("{enchant}", usedblast.replace("&b", "")));
			} else if (enchants.get(i).equals(experience)) {
				meta.setLore(Arrays.asList(experienceE));
				book.setItemMeta(meta);
				inv.addItem(book);
				if (!(sendmsg.equals("none")))
					p.sendMessage(
							sendmsg.replace("{tier}", one).replace("{enchant}", usedexperience.replace("&b", "")));
			} else if (enchants.get(i).equals(haste)) {
				meta.setLore(Arrays.asList(hasteE));
				book.setItemMeta(meta);
				inv.addItem(book);
				if (!(sendmsg.equals("none")))
					p.sendMessage(sendmsg.replace("{tier}", one).replace("{enchant}", usedhaste.replace("&b", "")));
			} else if (enchants.get(i).equals(obsidiandestroyer)) {
				meta.setLore(Arrays.asList(obsidiandestroyerE));
				book.setItemMeta(meta);
				inv.addItem(book);
				if (!(sendmsg.equals("none")))
					p.sendMessage(sendmsg.replace("{tier}", one).replace("{enchant}",
							usedobsidiandestroyer.replace("&b", "")));
			} else if (enchants.get(i).equals(antifog)) {
				meta.setLore(Arrays.asList(antifogE));
				book.setItemMeta(meta);
				inv.addItem(book);
				if (!(sendmsg.equals("none")))
					p.sendMessage(sendmsg.replace("{tier}", one).replace("{enchant}", usedantifog.replace("&b", "")));
			} else if (enchants.get(i).equals(thief)) {
				meta.setLore(Arrays.asList(thiefE));
				book.setItemMeta(meta);
				inv.addItem(book);
				if (!(sendmsg.equals("none")))
					p.sendMessage(sendmsg.replace("{tier}", one).replace("{enchant}", usedthief.replace("&b", "")));
			} else if (enchants.get(i).equals(toughness)) {
				meta.setLore(Arrays.asList(toughnessE));
				book.setItemMeta(meta);
				inv.addItem(book);
				if (!(sendmsg.equals("none")))
					p.sendMessage(sendmsg.replace("{tier}", one).replace("{enchant}", usedtoughness.replace("&b", "")));
			}
		} else if (sign.getLine(1).contains(two)) {
			p.setLevel(pLevel - levels);
			Random random = new Random();
			int i = random.nextInt(config.getStringList("enabledTierTwos").size());
			ArrayList<String> enchants = (ArrayList<String>) config.getStringList("enabledTierTwos");
			if (enchants.get(i).equals(beast)) {
				meta.setLore(Arrays.asList(beastE2));
				book.setItemMeta(meta);
				inv.addItem(book);
				if (!(sendmsg.equals("none")))
					p.sendMessage(sendmsg.replace("{tier}", two).replace("{enchant}", usedbeast2.replace("&e", "")));
			} else if (enchants.get(i).equals(bump)) {
				meta.setLore(Arrays.asList(bumpE2));
				book.setItemMeta(meta);
				inv.addItem(book);
				if (!(sendmsg.equals("none")))
					p.sendMessage(sendmsg.replace("{tier}", two).replace("{enchant}", usedbump2.replace("&e", "")));
			} else if (enchants.get(i).equals(healthboost)) {
				meta.setLore(Arrays.asList(healthboostE2));
				book.setItemMeta(meta);
				inv.addItem(book);
				if (!(sendmsg.equals("none")))
					p.sendMessage(
							sendmsg.replace("{tier}", two).replace("{enchant}", usedhealthboost2.replace("&e", "")));
			} else if (enchants.get(i).equals(implode)) {
				meta.setLore(Arrays.asList(implodeE2));
				book.setItemMeta(meta);
				inv.addItem(book);
				if (!(sendmsg.equals("none")))
					p.sendMessage(sendmsg.replace("{tier}", two).replace("{enchant}", usedimplode2.replace("&e", "")));
			} else if (enchants.get(i).equals(leaps)) {
				meta.setLore(Arrays.asList(leapsE2));
				book.setItemMeta(meta);
				inv.addItem(book);
				if (!(sendmsg.equals("none")))
					p.sendMessage(sendmsg.replace("{tier}", two).replace("{enchant}", usedleaps2.replace("&e", "")));
			} else if (enchants.get(i).equals(reborn)) {
				meta.setLore(Arrays.asList(rebornE2));
				book.setItemMeta(meta);
				inv.addItem(book);
				if (!(sendmsg.equals("none")))
					p.sendMessage(sendmsg.replace("{tier}", two).replace("{enchant}", usedreborn2.replace("&e", "")));
			} else if (enchants.get(i).equals(replenish)) {
				meta.setLore(Arrays.asList(replenishE2));
				book.setItemMeta(meta);
				inv.addItem(book);
				if (!(sendmsg.equals("none")))
					p.sendMessage(
							sendmsg.replace("{tier}", two).replace("{enchant}", usedreplenish2.replace("&e", "")));
			} else if (enchants.get(i).equals(retreat)) {
				meta.setLore(Arrays.asList(retreatE2));
				book.setItemMeta(meta);
				inv.addItem(book);
				if (!(sendmsg.equals("none")))
					p.sendMessage(sendmsg.replace("{tier}", two).replace("{enchant}", usedretreat2.replace("&e", "")));
			} else if (enchants.get(i).equals(scoot)) {
				meta.setLore(Arrays.asList(scootE2));
				book.setItemMeta(meta);
				inv.addItem(book);
				if (!(sendmsg.equals("none")))
					p.sendMessage(sendmsg.replace("{tier}", two).replace("{enchant}", usedscoot2.replace("&e", "")));
			} else if (enchants.get(i).equals(tipsy)) {
				meta.setLore(Arrays.asList(tipsyE2));
				book.setItemMeta(meta);
				inv.addItem(book);
				if (!(sendmsg.equals("none")))
					p.sendMessage(sendmsg.replace("{tier}", two).replace("{enchant}", usedtipsy2.replace("&e", "")));
			} else if (enchants.get(i).equals(vanish)) {
				meta.setLore(Arrays.asList(vanishE2));
				book.setItemMeta(meta);
				inv.addItem(book);
				if (!(sendmsg.equals("none")))
					p.sendMessage(sendmsg.replace("{tier}", two).replace("{enchant}", usedvanish2.replace("&e", "")));
			} else if (enchants.get(i).equals(weary)) {
				meta.setLore(Arrays.asList(wearyE2));
				book.setItemMeta(meta);
				inv.addItem(book);
				if (!(sendmsg.equals("none")))
					p.sendMessage(sendmsg.replace("{tier}", two).replace("{enchant}", usedweary2.replace("&e", "")));
			} else if (enchants.get(i).equals(archery)) {
				meta.setLore(Arrays.asList(archeryE2));
				book.setItemMeta(meta);
				inv.addItem(book);
				if (!(sendmsg.equals("none")))
					p.sendMessage(sendmsg.replace("{tier}", two).replace("{enchant}", usedarchery2.replace("&e", "")));
			} else if (enchants.get(i).equals(confusion)) {
				meta.setLore(Arrays.asList(confusionE2));
				book.setItemMeta(meta);
				inv.addItem(book);
				if (!(sendmsg.equals("none")))
					p.sendMessage(
							sendmsg.replace("{tier}", two).replace("{enchant}", usedconfusion2.replace("&e", "")));
			} else if (enchants.get(i).equals(life)) {
				meta.setLore(Arrays.asList(lifeE2));
				book.setItemMeta(meta);
				inv.addItem(book);
				if (!(sendmsg.equals("none")))
					p.sendMessage(sendmsg.replace("{tier}", two).replace("{enchant}", usedlife2.replace("&e", "")));
			} else if (enchants.get(i).equals(lightning)) {
				meta.setLore(Arrays.asList(lightningE2));
				book.setItemMeta(meta);
				inv.addItem(book);
				if (!(sendmsg.equals("none")))
					p.sendMessage(
							sendmsg.replace("{tier}", two).replace("{enchant}", usedlightning2.replace("&e", "")));
			} else if (enchants.get(i).equals(lightsout)) {
				meta.setLore(Arrays.asList(lightsoutE2));
				book.setItemMeta(meta);
				inv.addItem(book);
				if (!(sendmsg.equals("none")))
					p.sendMessage(
							sendmsg.replace("{tier}", two).replace("{enchant}", usedlightsout2.replace("&e", "")));
			} else if (enchants.get(i).equals(soul)) {
				meta.setLore(Arrays.asList(soulE2));
				book.setItemMeta(meta);
				inv.addItem(book);
				if (!(sendmsg.equals("none")))
					p.sendMessage(sendmsg.replace("{tier}", two).replace("{enchant}", usedsoul2.replace("&e", "")));
			} else if (enchants.get(i).equals(thunderous)) {
				meta.setLore(Arrays.asList(thunderousE2));
				book.setItemMeta(meta);
				inv.addItem(book);
				if (!(sendmsg.equals("none")))
					p.sendMessage(
							sendmsg.replace("{tier}", two).replace("{enchant}", usedthunderous2.replace("&e", "")));
			} else if (enchants.get(i).equals(blast)) {
				meta.setLore(Arrays.asList(blastE2));
				book.setItemMeta(meta);
				inv.addItem(book);
				if (!(sendmsg.equals("none")))
					p.sendMessage(sendmsg.replace("{tier}", two).replace("{enchant}", usedblast2.replace("&e", "")));
			} else if (enchants.get(i).equals(experience)) {
				meta.setLore(Arrays.asList(experienceE2));
				book.setItemMeta(meta);
				inv.addItem(book);
				if (!(sendmsg.equals("none")))
					p.sendMessage(
							sendmsg.replace("{tier}", two).replace("{enchant}", usedexperience2.replace("&e", "")));
			} else if (enchants.get(i).equals(haste)) {
				meta.setLore(Arrays.asList(hasteE2));
				book.setItemMeta(meta);
				inv.addItem(book);
				if (!(sendmsg.equals("none")))
					p.sendMessage(sendmsg.replace("{tier}", two).replace("{enchant}", usedhaste2.replace("&e", "")));
			} else if (enchants.get(i).equals(obsidiandestroyer)) {
				meta.setLore(Arrays.asList(obsidiandestroyerE2));
				book.setItemMeta(meta);
				inv.addItem(book);
				if (!(sendmsg.equals("none")))
					p.sendMessage(sendmsg.replace("{tier}", two).replace("{enchant}",
							usedobsidiandestroyer2.replace("&e", "")));
			} else if (enchants.get(i).equals(thief)) {
				meta.setLore(Arrays.asList(thiefE2));
				book.setItemMeta(meta);
				inv.addItem(book);
				if (!(sendmsg.equals("none")))
					p.sendMessage(sendmsg.replace("{tier}", two).replace("{enchant}", usedthief2.replace("&e", "")));
			} else if (enchants.get(i).equals(toughness)) {
				meta.setLore(Arrays.asList(toughnessE2));
				book.setItemMeta(meta);
				inv.addItem(book);
				if (!(sendmsg.equals("none")))
					p.sendMessage(
							sendmsg.replace("{tier}", two).replace("{enchant}", usedtoughness2.replace("&e", "")));
			} else if (enchants.get(i).equals(swordblock)) {
				meta.setLore(Arrays.asList(swordblockE2));
				book.setItemMeta(meta);
				inv.addItem(book);
				if (!(sendmsg.equals("none")))
					p.sendMessage(
							sendmsg.replace("{tier}", two).replace("{enchant}", usedswordblock2.replace("&e", "")));
			}
		} else if (sign.getLine(1).contains(three)) {
			p.setLevel(pLevel - levels);
			Random random = new Random();
			int i = random.nextInt(config.getStringList("enabledTierThrees").size());
			ArrayList<String> enchants = (ArrayList<String>) config.getStringList("enabledTierThrees");
			if (enchants.get(i).equals(beast)) {
				meta.setLore(Arrays.asList(beastE3));
				book.setItemMeta(meta);
				inv.addItem(book);
				if (!(sendmsg.equals("none")))
					p.sendMessage(sendmsg.replace("{tier}", three).replace("{enchant}", usedbeast3.replace("&c", "")));
			} else if (enchants.get(i).equals(bump)) {
				meta.setLore(Arrays.asList(bumpE3));
				book.setItemMeta(meta);
				inv.addItem(book);
				if (!(sendmsg.equals("none")))
					p.sendMessage(sendmsg.replace("{tier}", three).replace("{enchant}", usedbump3.replace("&c", "")));
			} else if (enchants.get(i).equals(implode)) {
				meta.setLore(Arrays.asList(implodeE3));
				book.setItemMeta(meta);
				inv.addItem(book);
				if (!(sendmsg.equals("none")))
					p.sendMessage(
							sendmsg.replace("{tier}", three).replace("{enchant}", usedimplode3.replace("&c", "")));
			} else if (enchants.get(i).equals(leaps)) {
				meta.setLore(Arrays.asList(leapsE3));
				book.setItemMeta(meta);
				inv.addItem(book);
				if (!(sendmsg.equals("none")))
					p.sendMessage(sendmsg.replace("{tier}", three).replace("{enchant}", usedleaps3.replace("&c", "")));
			} else if (enchants.get(i).equals(reborn)) {
				meta.setLore(Arrays.asList(rebornE3));
				book.setItemMeta(meta);
				inv.addItem(book);
				if (!(sendmsg.equals("none")))
					p.sendMessage(sendmsg.replace("{tier}", three).replace("{enchant}", usedreborn3.replace("&c", "")));
			} else if (enchants.get(i).equals(replenish)) {
				meta.setLore(Arrays.asList(replenishE3));
				book.setItemMeta(meta);
				inv.addItem(book);
				if (!(sendmsg.equals("none")))
					p.sendMessage(
							sendmsg.replace("{tier}", three).replace("{enchant}", usedreplenish3.replace("&c", "")));
			} else if (enchants.get(i).equals(retreat)) {
				meta.setLore(Arrays.asList(retreatE3));
				book.setItemMeta(meta);
				inv.addItem(book);
				if (!(sendmsg.equals("none")))
					p.sendMessage(
							sendmsg.replace("{tier}", three).replace("{enchant}", usedretreat3.replace("&c", "")));
			} else if (enchants.get(i).equals(scoot)) {
				meta.setLore(Arrays.asList(scootE3));
				book.setItemMeta(meta);
				inv.addItem(book);
				if (!(sendmsg.equals("none")))
					p.sendMessage(sendmsg.replace("{tier}", three).replace("{enchant}", usedscoot3.replace("&c", "")));
			} else if (enchants.get(i).equals(tipsy)) {
				meta.setLore(Arrays.asList(tipsyE3));
				book.setItemMeta(meta);
				inv.addItem(book);
				if (!(sendmsg.equals("none")))
					p.sendMessage(sendmsg.replace("{tier}", three).replace("{enchant}", usedtipsy3.replace("&c", "")));
			} else if (enchants.get(i).equals(vanish)) {
				meta.setLore(Arrays.asList(vanishE3));
				book.setItemMeta(meta);
				inv.addItem(book);
				if (!(sendmsg.equals("none")))
					p.sendMessage(sendmsg.replace("{tier}", three).replace("{enchant}", usedvanish3.replace("&c", "")));
			} else if (enchants.get(i).equals(weary)) {
				meta.setLore(Arrays.asList(wearyE3));
				book.setItemMeta(meta);
				inv.addItem(book);
				if (!(sendmsg.equals("none")))
					p.sendMessage(sendmsg.replace("{tier}", three).replace("{enchant}", usedweary3.replace("&c", "")));
			} else if (enchants.get(i).equals(lightning)) {
				meta.setLore(Arrays.asList(lightningE3));
				book.setItemMeta(meta);
				inv.addItem(book);
				if (!(sendmsg.equals("none")))
					p.sendMessage(
							sendmsg.replace("{tier}", three).replace("{enchant}", usedlightning3.replace("&c", "")));
			} else if (enchants.get(i).equals(thunderous)) {
				meta.setLore(Arrays.asList(thunderousE3));
				book.setItemMeta(meta);
				inv.addItem(book);
				if (!(sendmsg.equals("none")))
					p.sendMessage(
							sendmsg.replace("{tier}", three).replace("{enchant}", usedthunderous3.replace("&c", "")));
			} else if (enchants.get(i).equals(experience)) {
				meta.setLore(Arrays.asList(experienceE3));
				book.setItemMeta(meta);
				inv.addItem(book);
				if (!(sendmsg.equals("none")))
					p.sendMessage(
							sendmsg.replace("{tier}", three).replace("{enchant}", usedexperience3.replace("&c", "")));
			} else if (enchants.get(i).equals(haste)) {
				meta.setLore(Arrays.asList(hasteE3));
				book.setItemMeta(meta);
				inv.addItem(book);
				if (!(sendmsg.equals("none")))
					p.sendMessage(sendmsg.replace("{tier}", three).replace("{enchant}", usedhaste3.replace("&c", "")));
			} else if (enchants.get(i).equals(obsidiandestroyer)) {
				meta.setLore(Arrays.asList(obsidiandestroyerE3));
				book.setItemMeta(meta);
				inv.addItem(book);
				if (!(sendmsg.equals("none")))
					p.sendMessage(sendmsg.replace("{tier}", three).replace("{enchant}",
							usedobsidiandestroyer3.replace("&c", "")));
			} else if (enchants.get(i).equals(thief)) {
				meta.setLore(Arrays.asList(thiefE3));
				book.setItemMeta(meta);
				inv.addItem(book);
				if (!(sendmsg.equals("none")))
					p.sendMessage(sendmsg.replace("{tier}", three).replace("{enchant}", usedthief3.replace("&c", "")));
			} else if (enchants.get(i).equals(toughness)) {
				meta.setLore(Arrays.asList(toughnessE3));
				book.setItemMeta(meta);
				inv.addItem(book);
				if (!(sendmsg.equals("none")))
					p.sendMessage(
							sendmsg.replace("{tier}", three).replace("{enchant}", usedtoughness3.replace("&c", "")));
			}
		}
	}
}
