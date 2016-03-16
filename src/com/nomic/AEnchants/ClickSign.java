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

	String arc = "Arc";
	String usedarc = "&bArc I";
	String arcE = ChatColor.translateAlternateColorCodes('&', usedarc);
	String usedarc2 = "&eArc II";
	String arcE2 = ChatColor.translateAlternateColorCodes('&', usedarc2);
	String usedarc3 = "&cArc III";
	String arcE3 = ChatColor.translateAlternateColorCodes('&', usedarc3);

	String beast = "Beast";
	String usedbeast = "&bBeast I";
	String beastE = ChatColor.translateAlternateColorCodes('&', usedbeast);
	String usedbeast2 = "&eBeast II";
	String beastE2 = ChatColor.translateAlternateColorCodes('&', usedbeast2);
	String usedbeast3 = "&cBeast III";
	String beastE3 = ChatColor.translateAlternateColorCodes('&', usedbeast3);

	String blaze = "Blaze";
	String usedblaze = "&bBlaze I";
	String blazeE = ChatColor.translateAlternateColorCodes('&', usedblaze);
	String usedblaze2 = "&eBlaze II";
	String blazeE2 = ChatColor.translateAlternateColorCodes('&', usedblaze2);
	String usedblaze3 = "&cBlaze III";
	String blazeE3 = ChatColor.translateAlternateColorCodes('&', usedblaze3);

	String bump = "Bump";
	String usedbump = "&bBump I";
	String bumpE = ChatColor.translateAlternateColorCodes('&', usedbump);
	String usedbump2 = "&eBump II";
	String bumpE2 = ChatColor.translateAlternateColorCodes('&', usedbump2);
	String usedbump3 = "&cBump III";
	String bumpE3 = ChatColor.translateAlternateColorCodes('&', usedbump3);

	String feast = "Feast";
	String usedfeast = "&bFeast I";
	String feastE = ChatColor.translateAlternateColorCodes('&', usedfeast);
	String usedfeast2 = "&eFeast II";
	String feastE2 = ChatColor.translateAlternateColorCodes('&', usedfeast2);
	String usedfeast3 = "&cFeast III";
	String feastE3 = ChatColor.translateAlternateColorCodes('&', usedfeast3);

	String fish = "Fish";
	String usedfish = "&bFish I";
	String fishE = ChatColor.translateAlternateColorCodes('&', usedfish);
	String usedfish2 = "&eFish II";
	String fishE2 = ChatColor.translateAlternateColorCodes('&', usedfish2);
	String usedfish3 = "&cFish III";
	String fishE3 = ChatColor.translateAlternateColorCodes('&', usedfish3);

	String healthboost = "Health Boost";
	String usedhealthboost = "&bHealth Boost I";
	String healthboostE = ChatColor.translateAlternateColorCodes('&', usedhealthboost);
	String usedhealthboost2 = "&eHealth Boost II";
	String healthboostE2 = ChatColor.translateAlternateColorCodes('&', usedhealthboost2);
	String usedhealthboost3 = "&cHealth Boost III";
	String healthboostE3 = ChatColor.translateAlternateColorCodes('&', usedhealthboost3);

	String implode = "Implode";
	String usedimplode = "&bImplode I";
	String implodeE = ChatColor.translateAlternateColorCodes('&', usedimplode);
	String usedimplode2 = "&eImplode II";
	String implodeE2 = ChatColor.translateAlternateColorCodes('&', usedimplode2);
	String usedimplode3 = "&cImplode III";
	String implodeE3 = ChatColor.translateAlternateColorCodes('&', usedimplode3);

	String leaps = "Leaps";
	String usedleaps = "&bLeaps I";
	String leapsE = ChatColor.translateAlternateColorCodes('&', usedleaps);
	String usedleaps2 = "&eLeaps II";
	String leapsE2 = ChatColor.translateAlternateColorCodes('&', usedleaps2);
	String usedleaps3 = "&cLeaps III";
	String leapsE3 = ChatColor.translateAlternateColorCodes('&', usedleaps3);

	String reborn = "Reborn";
	String usedreborn = "&bReborn I";
	String rebornE = ChatColor.translateAlternateColorCodes('&', usedreborn);
	String usedreborn2 = "&eReborn II";
	String rebornE2 = ChatColor.translateAlternateColorCodes('&', usedreborn2);
	String usedreborn3 = "&cReborn III";
	String rebornE3 = ChatColor.translateAlternateColorCodes('&', usedreborn3);

	String replenish = "Replenish";
	String usedreplenish = "&bReplenish I";
	String replenishE = ChatColor.translateAlternateColorCodes('&', usedreplenish);
	String usedreplenish2 = "&eReplenish II";
	String replenishE2 = ChatColor.translateAlternateColorCodes('&', usedreplenish2);
	String usedreplenish3 = "&cReplenish III";
	String replenishE3 = ChatColor.translateAlternateColorCodes('&', usedreplenish3);

	String retreat = "Arc";
	String usedretreat = "&bRetreat I";
	String retreatE = ChatColor.translateAlternateColorCodes('&', usedretreat);
	String usedretreat2 = "&eRetreat II";
	String retreatE2 = ChatColor.translateAlternateColorCodes('&', usedretreat2);
	String usedretreat3 = "&cRetreat III";
	String retreatE3 = ChatColor.translateAlternateColorCodes('&', usedretreat3);

	String scoot = "Scoot";
	String usedscoot = "&bScoot I";
	String scootE = ChatColor.translateAlternateColorCodes('&', usedscoot);
	String usedscoot2 = "&eScoot II";
	String scootE2 = ChatColor.translateAlternateColorCodes('&', usedscoot2);
	String usedscoot3 = "&cScoot III";
	String scootE3 = ChatColor.translateAlternateColorCodes('&', usedscoot3);

	String sunlight = "Sunlight";
	String usedsunlight = "&bSunlight I";
	String sunlightE = ChatColor.translateAlternateColorCodes('&', usedsunlight);
	String usedsunlight2 = "&eSunlight II";
	String sunlightE2 = ChatColor.translateAlternateColorCodes('&', usedsunlight2);
	String usedsunlight3 = "&cSunlight III";
	String sunlightE3 = ChatColor.translateAlternateColorCodes('&', usedsunlight3);

	String tipsy = "Tipsy";
	String usedtipsy = "&bTipsy I";
	String tipsyE = ChatColor.translateAlternateColorCodes('&', usedtipsy);
	String usedtipsy2 = "&eTipsy II";
	String tipsyE2 = ChatColor.translateAlternateColorCodes('&', usedtipsy2);
	String usedtipsy3 = "&cTipsy III";
	String tipsyE3 = ChatColor.translateAlternateColorCodes('&', usedtipsy3);

	String vanish = "Vanish";
	String usedvanish = "&bVanish I";
	String vanishE = ChatColor.translateAlternateColorCodes('&', usedvanish);
	String usedvanish2 = "&eVanish II";
	String vanishE2 = ChatColor.translateAlternateColorCodes('&', usedvanish2);
	String usedvanish3 = "&cVanish III";
	String vanishE3 = ChatColor.translateAlternateColorCodes('&', usedvanish3);

	String weary = "Weary";
	String usedweary = "&bWeary I";
	String wearyE = ChatColor.translateAlternateColorCodes('&', usedweary);
	String usedweary2 = "&eWeary II";
	String wearyE2 = ChatColor.translateAlternateColorCodes('&', usedweary2);
	String usedweary3 = "&cWeary III";
	String wearyE3 = ChatColor.translateAlternateColorCodes('&', usedweary3);

	String archery = "Archery";
	String usedarchery = "&bArchery I";
	String archeryE = ChatColor.translateAlternateColorCodes('&', usedarchery);
	String usedarchery2 = "&eArchery II";
	String archeryE2 = ChatColor.translateAlternateColorCodes('&', usedarchery2);
	String usedarchery3 = "&cArchery III";
	String archeryE3 = ChatColor.translateAlternateColorCodes('&', usedarchery3);

	String confusion = "Confusion";
	String usedconfusion = "&bConfusion I";
	String confusionE = ChatColor.translateAlternateColorCodes('&', usedconfusion);
	String usedconfusion2 = "&eConfusion II";
	String confusionE2 = ChatColor.translateAlternateColorCodes('&', usedconfusion2);
	String usedconfusion3 = "&cConfusion III";
	String confusionE3 = ChatColor.translateAlternateColorCodes('&', usedconfusion3);

	String life = "Life";
	String usedlife = "&bLife I";
	String lifeE = ChatColor.translateAlternateColorCodes('&', usedlife);
	String usedlife2 = "&eLife II";
	String lifeE2 = ChatColor.translateAlternateColorCodes('&', usedlife2);
	String usedlife3 = "&cLife III";
	String lifeE3 = ChatColor.translateAlternateColorCodes('&', usedlife3);

	String lightning = "Lightning";
	String usedlightning = "&bLightning I";
	String lightningE = ChatColor.translateAlternateColorCodes('&', usedlightning);
	String usedlightning2 = "&eLightning II";
	String lightningE2 = ChatColor.translateAlternateColorCodes('&', usedlightning2);
	String usedlightning3 = "&cLightning III";
	String lightningE3 = ChatColor.translateAlternateColorCodes('&', usedlightning3);

	String lightsout = "Lights Out";
	String usedlightsout = "&bLights Out I";
	String lightsoutE = ChatColor.translateAlternateColorCodes('&', usedlightsout);
	String usedlightsout2 = "&eLights Out II";
	String lightsoutE2 = ChatColor.translateAlternateColorCodes('&', usedlightsout2);
	String usedlightsout3 = "&cLights Out III";
	String lightsoutE3 = ChatColor.translateAlternateColorCodes('&', usedlightsout3);

	String soul = "Soul";
	String usedsoul = "&bSoul I";
	String soulE = ChatColor.translateAlternateColorCodes('&', usedsoul);
	String usedsoul2 = "&eSoul II";
	String soulE2 = ChatColor.translateAlternateColorCodes('&', usedsoul2);
	String usedsoul3 = "&cSoul III";
	String soulE3 = ChatColor.translateAlternateColorCodes('&', usedsoul3);

	String swordblock = "Sword Block";
	String usedswordblock = "&bSword Block I";
	String swordblockE = ChatColor.translateAlternateColorCodes('&', usedswordblock);
	String usedswordblock2 = "&eSword Block II";
	String swordblockE2 = ChatColor.translateAlternateColorCodes('&', usedswordblock2);
	String usedswordblock3 = "&cSword Block III";
	String swordblockE3 = ChatColor.translateAlternateColorCodes('&', usedswordblock3);

	String thunderous = "Thunderous";
	String usedthunderous = "&bThunderous I";
	String thunderousE = ChatColor.translateAlternateColorCodes('&', usedthunderous);
	String usedthunderous2 = "&eThunderous II";
	String thunderousE2 = ChatColor.translateAlternateColorCodes('&', usedthunderous2);
	String usedthunderous3 = "&cThunderous III";
	String thunderousE3 = ChatColor.translateAlternateColorCodes('&', usedthunderous3);

	String blast = "Blast";
	String usedblast = "&bBlast I";
	String blastE = ChatColor.translateAlternateColorCodes('&', usedblast);
	String usedblast2 = "&eBlast II";
	String blastE2 = ChatColor.translateAlternateColorCodes('&', usedblast2);
	String usedblast3 = "&cBlast III";
	String blastE3 = ChatColor.translateAlternateColorCodes('&', usedblast3);

	String experience = "Experience";
	String usedexperience = "&bExperience I";
	String experienceE = ChatColor.translateAlternateColorCodes('&', usedexperience);
	String usedexperience2 = "&eExperience II";
	String experienceE2 = ChatColor.translateAlternateColorCodes('&', usedexperience2);
	String usedexperience3 = "&cExperience III";
	String experienceE3 = ChatColor.translateAlternateColorCodes('&', usedexperience3);

	String haste = "Haste";
	String usedhaste = "&bHaste I";
	String hasteE = ChatColor.translateAlternateColorCodes('&', usedhaste);
	String usedhaste2 = "&eHaste II";
	String hasteE2 = ChatColor.translateAlternateColorCodes('&', usedhaste2);
	String usedhaste3 = "&cHaste III";
	String hasteE3 = ChatColor.translateAlternateColorCodes('&', usedhaste3);

	String obsidiandestroyer = "Obsidian Destroyer";
	String usedobsidiandestroyer = "&bObsidian Destroyer I";
	String obsidiandestroyerE = ChatColor.translateAlternateColorCodes('&', usedobsidiandestroyer);
	String usedobsidiandestroyer2 = "&eObsidian Destroyer II";
	String obsidiandestroyerE2 = ChatColor.translateAlternateColorCodes('&', usedobsidiandestroyer2);
	String usedobsidiandestroyer3 = "&cObsidian Destroyer III";
	String obsidiandestroyerE3 = ChatColor.translateAlternateColorCodes('&', usedobsidiandestroyer3);

	@EventHandler
	public void onClick(PlayerInteractEvent e) {
		if (e.getClickedBlock() == null)
			return;
		if (!(e.getClickedBlock().getState() instanceof Sign))
			return;
		String title = plugin.getConfig().getString("signTitle");
		String aenchants = ChatColor.translateAlternateColorCodes('&', title);
		Player p = e.getPlayer();
		PlayerInventory inv = p.getInventory();
		Sign sign = (Sign) e.getClickedBlock().getState();
		ConfigurationSection config = plugin.getConfig().getConfigurationSection("enabledBooks");
		String msg = plugin.getConfig().getString("signUseMessage");
		String sendmsg = ChatColor.translateAlternateColorCodes('&', msg);
		if (!(sign.getLine(0).contains(aenchants)))
			return;
		ItemStack book = new ItemStack(Material.ENCHANTED_BOOK);
		ItemMeta meta = book.getItemMeta();
		int levels = Integer.parseInt(sign.getLine(2).replaceAll(" Levels", ""));
		int pLevel = p.getLevel();
		if (pLevel < levels) {
			p.sendMessage(ChatColor.RED + "You don't have enough levels.");
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
				p.sendMessage(sendmsg.replace("{tier}", one).replace("{enchant}", usedarc.replace("&b", "")));
			} else if (enchants.get(i).equals(beast)) {
				meta.setLore(Arrays.asList(beastE));
				book.setItemMeta(meta);
				inv.addItem(book);
				p.sendMessage(sendmsg.replace("{tier}", one).replace("{enchant}", usedbeast.replace("&b", "")));
			} else if (enchants.get(i).equals(blaze)) {
				meta.setLore(Arrays.asList(blazeE));
				book.setItemMeta(meta);
				inv.addItem(book);
				p.sendMessage(sendmsg.replace("{tier}", one).replace("{enchant}", usedblaze.replace("&b", "")));
			} else if (enchants.get(i).equals(bump)) {
				meta.setLore(Arrays.asList(bumpE));
				book.setItemMeta(meta);
				inv.addItem(book);
				p.sendMessage(sendmsg.replace("{tier}", one).replace("{enchant}", usedbump.replace("&b", "")));
			} else if (enchants.get(i).equals(feast)) {
				meta.setLore(Arrays.asList(feastE));
				book.setItemMeta(meta);
				inv.addItem(book);
				p.sendMessage(sendmsg.replace("{tier}", one).replace("{enchant}", usedfeast.replace("&b", "")));
			} else if (enchants.get(i).equals(fish)) {
				meta.setLore(Arrays.asList(fishE));
				book.setItemMeta(meta);
				inv.addItem(book);
				p.sendMessage(sendmsg.replace("{tier}", one).replace("{enchant}", usedfish.replace("&b", "")));
			} else if (enchants.get(i).equals(healthboost)) {
				meta.setLore(Arrays.asList(healthboostE));
				book.setItemMeta(meta);
				inv.addItem(book);
				p.sendMessage(sendmsg.replace("{tier}", one).replace("{enchant}", usedhealthboost.replace("&b", "")));
			} else if (enchants.get(i).equals(implode)) {
				meta.setLore(Arrays.asList(implodeE));
				book.setItemMeta(meta);
				inv.addItem(book);
				p.sendMessage(sendmsg.replace("{tier}", one).replace("{enchant}", usedimplode.replace("&b", "")));
			} else if (enchants.get(i).equals(leaps)) {
				meta.setLore(Arrays.asList(leapsE));
				book.setItemMeta(meta);
				inv.addItem(book);
				p.sendMessage(sendmsg.replace("{tier}", one).replace("{enchant}", usedleaps.replace("&b", "")));
			} else if (enchants.get(i).equals(reborn)) {
				meta.setLore(Arrays.asList(rebornE));
				book.setItemMeta(meta);
				inv.addItem(book);
				p.sendMessage(sendmsg.replace("{tier}", one).replace("{enchant}", usedreborn.replace("&b", "")));
			} else if (enchants.get(i).equals(replenish)) {
				meta.setLore(Arrays.asList(replenishE));
				book.setItemMeta(meta);
				inv.addItem(book);
				p.sendMessage(sendmsg.replace("{tier}", one).replace("{enchant}", usedreplenish.replace("&b", "")));
			} else if (enchants.get(i).equals(retreat)) {
				meta.setLore(Arrays.asList(retreatE));
				book.setItemMeta(meta);
				inv.addItem(book);
				p.sendMessage(sendmsg.replace("{tier}", one).replace("{enchant}", usedretreat.replace("&b", "")));
			} else if (enchants.get(i).equals(scoot)) {
				meta.setLore(Arrays.asList(scootE));
				book.setItemMeta(meta);
				inv.addItem(book);
				p.sendMessage(sendmsg.replace("{tier}", one).replace("{enchant}", usedscoot.replace("&b", "")));
			} else if (enchants.get(i).equals(sunlight)) {
				meta.setLore(Arrays.asList(sunlightE));
				book.setItemMeta(meta);
				inv.addItem(book);
				p.sendMessage(sendmsg.replace("{tier}", one).replace("{enchant}", usedsunlight.replace("&b", "")));
			} else if (enchants.get(i).equals(tipsy)) {
				meta.setLore(Arrays.asList(tipsyE));
				book.setItemMeta(meta);
				inv.addItem(book);
				p.sendMessage(sendmsg.replace("{tier}", one).replace("{enchant}", usedtipsy.replace("&b", "")));
			} else if (enchants.get(i).equals(vanish)) {
				meta.setLore(Arrays.asList(vanishE));
				book.setItemMeta(meta);
				inv.addItem(book);
				p.sendMessage(sendmsg.replace("{tier}", one).replace("{enchant}", usedvanish.replace("&b", "")));
			} else if (enchants.get(i).equals(weary)) {
				meta.setLore(Arrays.asList(wearyE));
				book.setItemMeta(meta);
				inv.addItem(book);
				p.sendMessage(sendmsg.replace("{tier}", one).replace("{enchant}", usedweary.replace("&b", "")));
			} else if (enchants.get(i).equals(archery)) {
				meta.setLore(Arrays.asList(archeryE));
				book.setItemMeta(meta);
				inv.addItem(book);
				p.sendMessage(sendmsg.replace("{tier}", one).replace("{enchant}", usedarchery.replace("&b", "")));
			} else if (enchants.get(i).equals(confusion)) {
				meta.setLore(Arrays.asList(confusionE));
				book.setItemMeta(meta);
				inv.addItem(book);
				p.sendMessage(sendmsg.replace("{tier}", one).replace("{enchant}", usedconfusion.replace("&b", "")));
			} else if (enchants.get(i).equals(life)) {
				meta.setLore(Arrays.asList(lifeE));
				book.setItemMeta(meta);
				inv.addItem(book);
				p.sendMessage(sendmsg.replace("{tier}", one).replace("{enchant}", usedlife.replace("&b", "")));
			} else if (enchants.get(i).equals(lightning)) {
				meta.setLore(Arrays.asList(lightningE));
				book.setItemMeta(meta);
				inv.addItem(book);
				p.sendMessage(sendmsg.replace("{tier}", one).replace("{enchant}", usedlightning.replace("&b", "")));
			} else if (enchants.get(i).equals(lightsout)) {
				meta.setLore(Arrays.asList(lightsoutE));
				book.setItemMeta(meta);
				inv.addItem(book);
				p.sendMessage(sendmsg.replace("{tier}", one).replace("{enchant}", usedlightsout.replace("&b", "")));
			} else if (enchants.get(i).equals(soul)) {
				meta.setLore(Arrays.asList(soulE));
				book.setItemMeta(meta);
				inv.addItem(book);
				p.sendMessage(sendmsg.replace("{tier}", one).replace("{enchant}", usedsoul.replace("&b", "")));
			} else if (enchants.get(i).equals(swordblock)) {
				meta.setLore(Arrays.asList(swordblockE));
				book.setItemMeta(meta);
				inv.addItem(book);
				p.sendMessage(sendmsg.replace("{tier}", one).replace("{enchant}", usedswordblock.replace("&b", "")));
			} else if (enchants.get(i).equals(thunderous)) {
				meta.setLore(Arrays.asList(thunderousE));
				book.setItemMeta(meta);
				inv.addItem(book);
				p.sendMessage(sendmsg.replace("{tier}", one).replace("{enchant}", usedthunderous.replace("&b", "")));
			} else if (enchants.get(i).equals(blast)) {
				meta.setLore(Arrays.asList(blastE));
				book.setItemMeta(meta);
				inv.addItem(book);
				p.sendMessage(sendmsg.replace("{tier}", one).replace("{enchant}", usedblast.replace("&b", "")));
			} else if (enchants.get(i).equals(experience)) {
				meta.setLore(Arrays.asList(experienceE));
				book.setItemMeta(meta);
				inv.addItem(book);
				p.sendMessage(sendmsg.replace("{tier}", one).replace("{enchant}", usedexperience.replace("&b", "")));
			} else if (enchants.get(i).equals(haste)) {
				meta.setLore(Arrays.asList(hasteE));
				book.setItemMeta(meta);
				inv.addItem(book);
				p.sendMessage(sendmsg.replace("{tier}", one).replace("{enchant}", usedhaste.replace("&b", "")));
			} else if (enchants.get(i).equals(obsidiandestroyer)) {
				meta.setLore(Arrays.asList(obsidiandestroyerE));
				book.setItemMeta(meta);
				inv.addItem(book);
				p.sendMessage(
						sendmsg.replace("{tier}", one).replace("{enchant}", usedobsidiandestroyer.replace("&b", "")));
			}
		} else if (sign.getLine(1).contains(two)) {
			p.setLevel(pLevel - levels);
			Random random = new Random();
			int i = random.nextInt(config.getStringList("enabledTierTwos").size());
			ArrayList<String> enchants = (ArrayList<String>) config.getStringList("enabledTierTwos");
			if (enchants.get(i).equals(arc)) {
				meta.setLore(Arrays.asList(arcE2));
				book.setItemMeta(meta);
				inv.addItem(book);
			} else if (enchants.get(i).equals(beast)) {
				meta.setLore(Arrays.asList(beastE2));
				book.setItemMeta(meta);
				inv.addItem(book);
			} else if (enchants.get(i).equals(blaze)) {
				meta.setLore(Arrays.asList(blazeE2));
				book.setItemMeta(meta);
				inv.addItem(book);
			} else if (enchants.get(i).equals(bump)) {
				meta.setLore(Arrays.asList(bumpE2));
				book.setItemMeta(meta);
				inv.addItem(book);
			} else if (enchants.get(i).equals(feast)) {
				meta.setLore(Arrays.asList(feastE2));
				book.setItemMeta(meta);
				inv.addItem(book);
			} else if (enchants.get(i).equals(fish)) {
				meta.setLore(Arrays.asList(fishE2));
				book.setItemMeta(meta);
				inv.addItem(book);
			} else if (enchants.get(i).equals(healthboost)) {
				meta.setLore(Arrays.asList(healthboostE2));
				book.setItemMeta(meta);
				inv.addItem(book);
			} else if (enchants.get(i).equals(implode)) {
				meta.setLore(Arrays.asList(implodeE2));
				book.setItemMeta(meta);
				inv.addItem(book);
			} else if (enchants.get(i).equals(leaps)) {
				meta.setLore(Arrays.asList(leapsE2));
				book.setItemMeta(meta);
				inv.addItem(book);
			} else if (enchants.get(i).equals(reborn)) {
				meta.setLore(Arrays.asList(rebornE2));
				book.setItemMeta(meta);
				inv.addItem(book);
			} else if (enchants.get(i).equals(replenish)) {
				meta.setLore(Arrays.asList(replenishE2));
				book.setItemMeta(meta);
				inv.addItem(book);
			} else if (enchants.get(i).equals(retreat)) {
				meta.setLore(Arrays.asList(retreatE2));
				book.setItemMeta(meta);
				inv.addItem(book);
			} else if (enchants.get(i).equals(scoot)) {
				meta.setLore(Arrays.asList(scootE2));
				book.setItemMeta(meta);
				inv.addItem(book);
			} else if (enchants.get(i).equals(sunlight)) {
				meta.setLore(Arrays.asList(sunlightE2));
				book.setItemMeta(meta);
				inv.addItem(book);
			} else if (enchants.get(i).equals(tipsy)) {
				meta.setLore(Arrays.asList(tipsyE2));
				book.setItemMeta(meta);
				inv.addItem(book);
			} else if (enchants.get(i).equals(vanish)) {
				meta.setLore(Arrays.asList(vanishE2));
				book.setItemMeta(meta);
				inv.addItem(book);
			} else if (enchants.get(i).equals(weary)) {
				meta.setLore(Arrays.asList(wearyE2));
				book.setItemMeta(meta);
				inv.addItem(book);
			} else if (enchants.get(i).equals(archery)) {
				meta.setLore(Arrays.asList(archeryE2));
				book.setItemMeta(meta);
				inv.addItem(book);
			} else if (enchants.get(i).equals(confusion)) {
				meta.setLore(Arrays.asList(confusionE2));
				book.setItemMeta(meta);
				inv.addItem(book);
			} else if (enchants.get(i).equals(life)) {
				meta.setLore(Arrays.asList(lifeE2));
				book.setItemMeta(meta);
				inv.addItem(book);
			} else if (enchants.get(i).equals(lightning)) {
				meta.setLore(Arrays.asList(lightningE2));
				book.setItemMeta(meta);
				inv.addItem(book);
			} else if (enchants.get(i).equals(lightsout)) {
				meta.setLore(Arrays.asList(lightsoutE2));
				book.setItemMeta(meta);
				inv.addItem(book);
			} else if (enchants.get(i).equals(soul)) {
				meta.setLore(Arrays.asList(soulE2));
				book.setItemMeta(meta);
				inv.addItem(book);
			} else if (enchants.get(i).equals(swordblock)) {
				meta.setLore(Arrays.asList(swordblockE2));
				book.setItemMeta(meta);
				inv.addItem(book);
			} else if (enchants.get(i).equals(thunderous)) {
				meta.setLore(Arrays.asList(thunderousE2));
				book.setItemMeta(meta);
				inv.addItem(book);
			} else if (enchants.get(i).equals(blast)) {
				meta.setLore(Arrays.asList(blastE2));
				book.setItemMeta(meta);
				inv.addItem(book);
			} else if (enchants.get(i).equals(experience)) {
				meta.setLore(Arrays.asList(experienceE2));
				book.setItemMeta(meta);
				inv.addItem(book);
			} else if (enchants.get(i).equals(haste)) {
				meta.setLore(Arrays.asList(hasteE2));
				book.setItemMeta(meta);
				inv.addItem(book);
			} else if (enchants.get(i).equals(obsidiandestroyer)) {
				meta.setLore(Arrays.asList(obsidiandestroyerE2));
				book.setItemMeta(meta);
				inv.addItem(book);
			}
		} else if (sign.getLine(1).contains(three)) {
			p.setLevel(pLevel - levels);
			Random random = new Random();
			int i = random.nextInt(config.getStringList("enabledTierThrees").size());
			ArrayList<String> enchants = (ArrayList<String>) config.getStringList("enabledTierThrees");
			if (enchants.get(i).equals(arc)) {
				meta.setLore(Arrays.asList(arcE3));
				book.setItemMeta(meta);
				inv.addItem(book);
			} else if (enchants.get(i).equals(beast)) {
				meta.setLore(Arrays.asList(beastE3));
				book.setItemMeta(meta);
				inv.addItem(book);
			} else if (enchants.get(i).equals(blaze)) {
				meta.setLore(Arrays.asList(blazeE3));
				book.setItemMeta(meta);
				inv.addItem(book);
			} else if (enchants.get(i).equals(bump)) {
				meta.setLore(Arrays.asList(bumpE3));
				book.setItemMeta(meta);
				inv.addItem(book);
			} else if (enchants.get(i).equals(feast)) {
				meta.setLore(Arrays.asList(feastE3));
				book.setItemMeta(meta);
				inv.addItem(book);
			} else if (enchants.get(i).equals(fish)) {
				meta.setLore(Arrays.asList(fishE3));
				book.setItemMeta(meta);
				inv.addItem(book);
			} else if (enchants.get(i).equals(healthboost)) {
				meta.setLore(Arrays.asList(healthboostE3));
				book.setItemMeta(meta);
				inv.addItem(book);
			} else if (enchants.get(i).equals(implode)) {
				meta.setLore(Arrays.asList(implodeE3));
				book.setItemMeta(meta);
				inv.addItem(book);
			} else if (enchants.get(i).equals(leaps)) {
				meta.setLore(Arrays.asList(leapsE3));
				book.setItemMeta(meta);
				inv.addItem(book);
			} else if (enchants.get(i).equals(reborn)) {
				meta.setLore(Arrays.asList(rebornE3));
				book.setItemMeta(meta);
				inv.addItem(book);
			} else if (enchants.get(i).equals(replenish)) {
				meta.setLore(Arrays.asList(replenishE3));
				book.setItemMeta(meta);
				inv.addItem(book);
			} else if (enchants.get(i).equals(retreat)) {
				meta.setLore(Arrays.asList(retreatE3));
				book.setItemMeta(meta);
				inv.addItem(book);
			} else if (enchants.get(i).equals(scoot)) {
				meta.setLore(Arrays.asList(scootE3));
				book.setItemMeta(meta);
				inv.addItem(book);
			} else if (enchants.get(i).equals(sunlight)) {
				meta.setLore(Arrays.asList(sunlightE3));
				book.setItemMeta(meta);
				inv.addItem(book);
			} else if (enchants.get(i).equals(tipsy)) {
				meta.setLore(Arrays.asList(tipsyE3));
				book.setItemMeta(meta);
				inv.addItem(book);
			} else if (enchants.get(i).equals(vanish)) {
				meta.setLore(Arrays.asList(vanishE3));
				book.setItemMeta(meta);
				inv.addItem(book);
			} else if (enchants.get(i).equals(weary)) {
				meta.setLore(Arrays.asList(wearyE3));
				book.setItemMeta(meta);
				inv.addItem(book);
			} else if (enchants.get(i).equals(archery)) {
				meta.setLore(Arrays.asList(archeryE3));
				book.setItemMeta(meta);
				inv.addItem(book);
			} else if (enchants.get(i).equals(confusion)) {
				meta.setLore(Arrays.asList(confusionE3));
				book.setItemMeta(meta);
				inv.addItem(book);
			} else if (enchants.get(i).equals(life)) {
				meta.setLore(Arrays.asList(lifeE3));
				book.setItemMeta(meta);
				inv.addItem(book);
			} else if (enchants.get(i).equals(lightning)) {
				meta.setLore(Arrays.asList(lightningE3));
				book.setItemMeta(meta);
				inv.addItem(book);
			} else if (enchants.get(i).equals(lightsout)) {
				meta.setLore(Arrays.asList(lightsoutE3));
				book.setItemMeta(meta);
				inv.addItem(book);
			} else if (enchants.get(i).equals(soul)) {
				meta.setLore(Arrays.asList(soulE3));
				book.setItemMeta(meta);
				inv.addItem(book);
			} else if (enchants.get(i).equals(swordblock)) {
				meta.setLore(Arrays.asList(swordblockE3));
				book.setItemMeta(meta);
				inv.addItem(book);
			} else if (enchants.get(i).equals(thunderous)) {
				meta.setLore(Arrays.asList(thunderousE3));
				book.setItemMeta(meta);
				inv.addItem(book);
			} else if (enchants.get(i).equals(blast)) {
				meta.setLore(Arrays.asList(blastE3));
				book.setItemMeta(meta);
				inv.addItem(book);
			} else if (enchants.get(i).equals(experience)) {
				meta.setLore(Arrays.asList(experienceE3));
				book.setItemMeta(meta);
				inv.addItem(book);
			} else if (enchants.get(i).equals(haste)) {
				meta.setLore(Arrays.asList(hasteE3));
				book.setItemMeta(meta);
				inv.addItem(book);
			} else if (enchants.get(i).equals(obsidiandestroyer)) {
				meta.setLore(Arrays.asList(obsidiandestroyerE3));
				book.setItemMeta(meta);
				inv.addItem(book);
			}
		}
	}
}
