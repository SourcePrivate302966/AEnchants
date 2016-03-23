package com.nomic.AEnchants.AnvilUse;

import java.util.Arrays;
import java.util.List;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.configuration.ConfigurationSection;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.inventory.AnvilInventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import com.nomic.AEnchants.Main;
import com.nomic.AEnchants.Events.AnvilApply;

public class Apply2 implements Listener {
	
	private Main plugin;

	public Apply2(Main pl) {
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

	Material diamonds = Material.DIAMOND_SWORD;
	Material irons = Material.IRON_SWORD;
	Material golds = Material.GOLD_SWORD;
	Material stones = Material.STONE_SWORD;
	Material woods = Material.WOOD_SWORD;

	Material diamonda = Material.DIAMOND_AXE;
	Material irona = Material.IRON_AXE;
	Material golda = Material.GOLD_AXE;
	Material stonea = Material.STONE_AXE;
	Material wooda = Material.WOOD_AXE;

	Material diamondp = Material.DIAMOND_PICKAXE;
	Material ironp = Material.IRON_PICKAXE;
	Material goldp = Material.GOLD_PICKAXE;
	Material stonep = Material.STONE_PICKAXE;
	Material woodp = Material.WOOD_PICKAXE;

	Material diamondsh = Material.DIAMOND_SPADE;
	Material ironsh = Material.IRON_SPADE;
	Material goldsh = Material.GOLD_SPADE;
	Material stonesh = Material.STONE_SPADE;
	Material woodsh = Material.WOOD_SPADE;
	
	@EventHandler
	public void onCombine(AnvilApply e) {
		Player p = e.getPlayer();
		ConfigurationSection app = plugin.getConfig().getConfigurationSection("appliablePieces");
		String toomanyenchants = plugin.getConfig().getString("tooManyEnchantsMessage");
		String toomanyenchantsmsg = ChatColor.translateAlternateColorCodes('&', toomanyenchants);
		int enchantLimit = plugin.getConfig().getInt("enchantLimit");
		String msg = plugin.getConfig().getString("addEnchantMessage");
		String sendmsg = ChatColor.translateAlternateColorCodes('&', msg);
		List<String> lore = e.getItemLore();
		AnvilInventory anvil = e.getAnvil();
		ItemStack clear = e.getClearItem();
		int twoCost = e.getCost();
		int plevel = e.getPlayerLevel();
		Material m = e.getMaterial();
		ItemStack item = e.getItem();
		ItemMeta oldmeta = e.getOldMeta();
		ItemMeta newmeta = e.getNewMeta();
		List<String> oldlore = oldmeta.getLore();
		int enchants = oldmeta.getEnchants().size();
		int loreLines = 0;
		if (oldmeta.getLore() != null) {
			loreLines = oldlore.size();
		}
		if (lore.contains(beastE2)) {
			if (oldmeta.hasLore()) {
				if (oldlore.contains(beastE2)) {
					if (m == diamondh || m == ironh || m == chainh || m == leatherh || m == diamondc
							|| m == ironc || m == chainc || m == leatherc || m == diamondl || m == ironl
							|| m == chainl || m == leatherl || m == diamondb || m == ironb || m == chainb
							|| m == leatherb) {
						oldlore.remove(beastE2);
						oldlore.add(beastE3);
						newmeta.setLore(oldlore);
						item.setItemMeta(newmeta);
						p.getInventory().addItem(item);
						p.setLevel(plevel - twoCost);
						anvil.clear();
						p.setItemOnCursor(clear);
						p.closeInventory();
						p.sendMessage(sendmsg.replace("{enchant}", usedbeast2.replace("&e", "")));
						return;
					}
				} else if (oldlore.contains(beastE)) {
					if (m == diamondh || m == ironh || m == chainh || m == leatherh || m == diamondc
							|| m == ironc || m == chainc || m == leatherc || m == diamondl || m == ironl
							|| m == chainl || m == leatherl || m == diamondb || m == ironb || m == chainb
							|| m == leatherb) {
						oldlore.remove(beastE);
						oldlore.add(beastE2);
						newmeta.setLore(oldlore);
						item.setItemMeta(newmeta);
						p.getInventory().addItem(item);
						p.setLevel(plevel - twoCost);
						anvil.clear();
						p.setItemOnCursor(clear);
						p.closeInventory();
						p.sendMessage(sendmsg.replace("{enchant}", usedbeast2.replace("&e", "")));
						return;
					}
				} else if (oldlore.contains(beastE3)) {
					return;
				}
			}
			if (enchants + loreLines >= enchantLimit) {
				p.sendMessage(toomanyenchantsmsg);
				return;
			}
			if (m == diamondh || m == ironh || m == chainh || m == leatherh || m == diamondc
					|| m == ironc || m == chainc || m == leatherc || m == diamondl || m == ironl
					|| m == chainl || m == leatherl || m == diamondb || m == ironb || m == chainb
					|| m == leatherb) {
				if (!(oldmeta.hasLore())) {
					newmeta.setLore(Arrays.asList(beastE2));
				} else if (oldmeta.hasLore()) {
					oldlore.add(beastE2);
					newmeta.setLore(oldlore);
				}
				item.setItemMeta(newmeta);
				p.getInventory().addItem(item);
				p.setLevel(plevel - twoCost);
				anvil.clear();
				p.setItemOnCursor(clear);
				p.closeInventory();
				p.sendMessage(sendmsg.replace("{enchant}", usedbeast2.replace("&e", "")));
			}
		} else if (lore.contains(bumpE2)) {
			if (oldmeta.hasLore()) {
				if (oldlore.contains(bumpE2)) {
					if (m == diamondh || m == ironh || m == chainh || m == leatherh) {
						if (app.getStringList("Bump").contains("Helmet")) {
							oldlore.remove(bumpE2);
							oldlore.add(bumpE3);
							newmeta.setLore(oldlore);
							item.setItemMeta(newmeta);
							p.getInventory().addItem(item);
							p.setLevel(plevel - twoCost);
							anvil.clear();
							p.setItemOnCursor(clear);
							p.closeInventory();
							p.sendMessage(sendmsg.replace("{enchant}", usedbump2.replace("&e", "")));
						}
					} else if (m == diamondc || m == ironc || m == chainc || m == leatherc) {
						if (app.getStringList("Bump").contains("Chestplate")) {
							oldlore.remove(bumpE2);
							oldlore.add(bumpE3);
							newmeta.setLore(oldlore);
							item.setItemMeta(newmeta);
							p.getInventory().addItem(item);
							p.setLevel(plevel - twoCost);
							anvil.clear();
							p.setItemOnCursor(clear);
							p.closeInventory();
							p.sendMessage(sendmsg.replace("{enchant}", usedbump2.replace("&e", "")));
						}
					} else if (m == diamondl || m == ironl || m == chainl || m == leatherl) {
						if (app.getStringList("Bump").contains("Leggings")) {
							oldlore.remove(bumpE2);
							oldlore.add(bumpE3);
							newmeta.setLore(oldlore);
							item.setItemMeta(newmeta);
							p.getInventory().addItem(item);
							p.setLevel(plevel - twoCost);
							anvil.clear();
							p.setItemOnCursor(clear);
							p.closeInventory();
							p.sendMessage(sendmsg.replace("{enchant}", usedbump2.replace("&e", "")));
						}
					} else if (m == diamondb || m == ironb || m == chainb || m == leatherb) {
						if (app.getStringList("Bump").contains("Boots")) {
							oldlore.remove(bumpE2);
							oldlore.add(bumpE3);
							newmeta.setLore(oldlore);
							item.setItemMeta(newmeta);
							p.getInventory().addItem(item);
							p.setLevel(plevel - twoCost);
							anvil.clear();
							p.setItemOnCursor(clear);
							p.closeInventory();
							p.sendMessage(sendmsg.replace("{enchant}", usedbump2.replace("&e", "")));
						}
					}
					return;
				} else if (oldlore.contains(bumpE)) {
					if (m == diamondh || m == ironh || m == chainh || m == leatherh) {
						if (app.getStringList("Bump").contains("Helmet")) {
							oldlore.remove(bumpE);
							oldlore.add(bumpE2);
							newmeta.setLore(oldlore);
							item.setItemMeta(newmeta);
							p.getInventory().addItem(item);
							p.setLevel(plevel - twoCost);
							anvil.clear();
							p.setItemOnCursor(clear);
							p.closeInventory();
							p.sendMessage(sendmsg.replace("{enchant}", usedbump2.replace("&e", "")));
						}
					} else if (m == diamondc || m == ironc || m == chainc || m == leatherc) {
						if (app.getStringList("Bump").contains("Chestplate")) {
							oldlore.remove(bumpE);
							oldlore.add(bumpE2);
							newmeta.setLore(oldlore);
							item.setItemMeta(newmeta);
							p.getInventory().addItem(item);
							p.setLevel(plevel - twoCost);
							anvil.clear();
							p.setItemOnCursor(clear);
							p.closeInventory();
							p.sendMessage(sendmsg.replace("{enchant}", usedbump2.replace("&e", "")));
						}
					} else if (m == diamondl || m == ironl || m == chainl || m == leatherl) {
						if (app.getStringList("Bump").contains("Leggings")) {
							oldlore.remove(bumpE);
							oldlore.add(bumpE2);
							newmeta.setLore(oldlore);
							item.setItemMeta(newmeta);
							p.getInventory().addItem(item);
							p.setLevel(plevel - twoCost);
							anvil.clear();
							p.setItemOnCursor(clear);
							p.closeInventory();
							p.sendMessage(sendmsg.replace("{enchant}", usedbump2.replace("&e", "")));
						}
					} else if (m == diamondb || m == ironb || m == chainb || m == leatherb) {
						if (app.getStringList("Bump").contains("Boots")) {
							oldlore.remove(bumpE);
							oldlore.add(bumpE2);
							newmeta.setLore(oldlore);
							item.setItemMeta(newmeta);
							p.getInventory().addItem(item);
							p.setLevel(plevel - twoCost);
							anvil.clear();
							p.setItemOnCursor(clear);
							p.closeInventory();
							p.sendMessage(sendmsg.replace("{enchant}", usedbump2.replace("&e", "")));
						}
					}
					return;
				} else if (oldlore.contains(bumpE3)) {
					return;
				}
			}
			if (enchants + loreLines >= enchantLimit) {
				p.sendMessage(toomanyenchantsmsg);
				return;
			}
			if (m == diamondh || m == ironh || m == chainh || m == leatherh) {
				if (app.getStringList("Bump").contains("Helmet")) {
					if (!(oldmeta.hasLore())) {
						newmeta.setLore(Arrays.asList(bumpE2));
					} else if (oldmeta.hasLore()) {
						oldlore.add(bumpE2);
						newmeta.setLore(oldlore);
					}
					item.setItemMeta(newmeta);
					p.getInventory().addItem(item);
					p.setLevel(plevel - twoCost);
					anvil.clear();
					p.setItemOnCursor(clear);
					p.closeInventory();
					p.sendMessage(sendmsg.replace("{enchant}", usedbump2.replace("&e", "")));
				}
			} else if (m == diamondc || m == ironc || m == chainc || m == leatherc) {
				if (app.getStringList("Bump").contains("Chestplate")) {
					if (!(oldmeta.hasLore())) {
						newmeta.setLore(Arrays.asList(bumpE2));
					} else if (oldmeta.hasLore()) {
						oldlore.add(bumpE2);
						newmeta.setLore(oldlore);
					}
					item.setItemMeta(newmeta);
					p.getInventory().addItem(item);
					p.setLevel(plevel - twoCost);
					anvil.clear();
					p.setItemOnCursor(clear);
					p.closeInventory();
					p.sendMessage(sendmsg.replace("{enchant}", usedbump2.replace("&e", "")));
				}
			} else if (m == diamondl || m == ironl || m == chainl || m == leatherl) {
				if (app.getStringList("Bump").contains("Leggings")) {
					if (!(oldmeta.hasLore())) {
						newmeta.setLore(Arrays.asList(bumpE2));
					} else if (oldmeta.hasLore()) {
						oldlore.add(bumpE2);
						newmeta.setLore(oldlore);
					}
					item.setItemMeta(newmeta);
					p.getInventory().addItem(item);
					p.setLevel(plevel - twoCost);
					anvil.clear();
					p.setItemOnCursor(clear);
					p.closeInventory();
					p.sendMessage(sendmsg.replace("{enchant}", usedbump2.replace("&e", "")));
				}
			} else if (m == diamondb || m == ironb || m == chainb || m == leatherb) {
				if (app.getStringList("Bump").contains("Boots")) {
					if (!(oldmeta.hasLore())) {
						newmeta.setLore(Arrays.asList(bumpE2));
					} else if (oldmeta.hasLore()) {
						oldlore.add(bumpE2);
						newmeta.setLore(oldlore);
					}
					item.setItemMeta(newmeta);
					p.getInventory().addItem(item);
					p.setLevel(plevel - twoCost);
					anvil.clear();
					p.setItemOnCursor(clear);
					p.closeInventory();
					p.sendMessage(sendmsg.replace("{enchant}", usedbump2.replace("&e", "")));
				}
			}
		} else if (lore.contains(healthboostE2)) {
			if (oldmeta.hasLore()) {
				if (oldlore.contains(healthboostE)) {
					if (m == diamondh || m == ironh || m == chainh || m == leatherh) {
						if (app.getStringList("HealthBoost").contains("Helmet")) {
							oldlore.remove(healthboostE);
							oldlore.add(healthboostE2);
							newmeta.setLore(oldlore);
							item.setItemMeta(newmeta);
							p.getInventory().addItem(item);
							p.setLevel(plevel - twoCost);
							anvil.clear();
							p.setItemOnCursor(clear);
							p.closeInventory();
							p.sendMessage(sendmsg.replace("{enchant}", usedhealthboost2.replace("&e", "")));
						}
					} else if (m == diamondc || m == ironc || m == chainc || m == leatherc) {
						if (app.getStringList("HealthBoost").contains("Chestplate")) {
							oldlore.remove(healthboostE);
							oldlore.add(healthboostE2);
							newmeta.setLore(oldlore);
							item.setItemMeta(newmeta);
							p.getInventory().addItem(item);
							p.setLevel(plevel - twoCost);
							anvil.clear();
							p.setItemOnCursor(clear);
							p.closeInventory();
							p.sendMessage(sendmsg.replace("{enchant}", usedhealthboost2.replace("&e", "")));
						}
					} else if (m == diamondl || m == ironl || m == chainl || m == leatherl) {
						if (app.getStringList("HealthBoost").contains("Leggings")) {
							oldlore.remove(healthboostE);
							oldlore.add(healthboostE2);
							newmeta.setLore(oldlore);
							item.setItemMeta(newmeta);
							p.getInventory().addItem(item);
							p.setLevel(plevel - twoCost);
							anvil.clear();
							p.setItemOnCursor(clear);
							p.closeInventory();
							p.sendMessage(sendmsg.replace("{enchant}", usedhealthboost2.replace("&e", "")));
						}
					} else if (m == diamondb || m == ironb || m == chainb || m == leatherb) {
						if (app.getStringList("HealthBoost").contains("Boots")) {
							oldlore.remove(healthboostE);
							oldlore.add(healthboostE2);
							newmeta.setLore(oldlore);
							item.setItemMeta(newmeta);
							p.getInventory().addItem(item);
							p.setLevel(plevel - twoCost);
							anvil.clear();
							p.setItemOnCursor(clear);
							p.closeInventory();
							p.sendMessage(sendmsg.replace("{enchant}", usedhealthboost2.replace("&e", "")));
						}
					}
					return;
				} else if (oldlore.contains(healthboostE2)) {
					return;
				}
			}
			if (enchants + loreLines >= enchantLimit) {
				p.sendMessage(toomanyenchantsmsg);
				return;
			}
			if (m == diamondh || m == ironh || m == chainh || m == leatherh) {
				if (app.getStringList("HealthBoost").contains("Helmet")) {
					if (!(oldmeta.hasLore())) {
						newmeta.setLore(Arrays.asList(healthboostE2));
					} else if (oldmeta.hasLore()) {
						oldlore.add(healthboostE2);
						newmeta.setLore(oldlore);
					}
					item.setItemMeta(newmeta);
					p.getInventory().addItem(item);
					p.setLevel(plevel - twoCost);
					anvil.clear();
					p.setItemOnCursor(clear);
					p.closeInventory();
					p.sendMessage(sendmsg.replace("{enchant}", usedhealthboost2.replace("&e", "")));
				}
			} else if (m == diamondc || m == ironc || m == chainc || m == leatherc) {
				if (app.getStringList("HealthBoost").contains("Chestplate")) {
					if (!(oldmeta.hasLore())) {
						newmeta.setLore(Arrays.asList(healthboostE2));
					} else if (oldmeta.hasLore()) {
						oldlore.add(healthboostE2);
						newmeta.setLore(oldlore);
					}
					item.setItemMeta(newmeta);
					p.getInventory().addItem(item);
					p.setLevel(plevel - twoCost);
					anvil.clear();
					p.setItemOnCursor(clear);
					p.closeInventory();
					p.sendMessage(sendmsg.replace("{enchant}", usedhealthboost2.replace("&e", "")));
				}
			} else if (m == diamondl || m == ironl || m == chainl || m == leatherl) {
				if (app.getStringList("HealthBoost").contains("Leggings")) {
					if (!(oldmeta.hasLore())) {
						newmeta.setLore(Arrays.asList(healthboostE2));
					} else if (oldmeta.hasLore()) {
						oldlore.add(healthboostE2);
						newmeta.setLore(oldlore);
					}
					item.setItemMeta(newmeta);
					p.getInventory().addItem(item);
					p.setLevel(plevel - twoCost);
					anvil.clear();
					p.setItemOnCursor(clear);
					p.closeInventory();
					p.sendMessage(sendmsg.replace("{enchant}", usedhealthboost2.replace("&e", "")));
				}
			} else if (m == diamondb || m == ironb || m == chainb || m == leatherb) {
				if (app.getStringList("HealthBoost").contains("Boots")) {
					if (!(oldmeta.hasLore())) {
						newmeta.setLore(Arrays.asList(healthboostE2));
					} else if (oldmeta.hasLore()) {
						oldlore.add(healthboostE2);
						newmeta.setLore(oldlore);
					}
					item.setItemMeta(newmeta);
					p.getInventory().addItem(item);
					p.setLevel(plevel - twoCost);
					anvil.clear();
					p.setItemOnCursor(clear);
					p.closeInventory();
					p.sendMessage(sendmsg.replace("{enchant}", usedhealthboost2.replace("&e", "")));
				}
			}
		} else if (lore.contains(implodeE2)) {
			if (oldmeta.hasLore()) {
				if (oldlore.contains(implodeE2)) {
					if (m == diamondh || m == ironh || m == chainh || m == leatherh) {
						if (app.getStringList("Implode").contains("Helmet")) {
							oldlore.remove(implodeE2);
							oldlore.add(implodeE3);
							newmeta.setLore(oldlore);
							item.setItemMeta(newmeta);
							p.getInventory().addItem(item);
							p.setLevel(plevel - twoCost);
							anvil.clear();
							p.setItemOnCursor(clear);
							p.closeInventory();
							p.sendMessage(sendmsg.replace("{enchant}", usedimplode2.replace("&e", "")));
						}
					} else if (m == diamondc || m == ironc || m == chainc || m == leatherc) {
						if (app.getStringList("Implode").contains("Chestplate")) {
							oldlore.remove(implodeE2);
							oldlore.add(implodeE3);
							newmeta.setLore(oldlore);
							item.setItemMeta(newmeta);
							p.getInventory().addItem(item);
							p.setLevel(plevel - twoCost);
							anvil.clear();
							p.setItemOnCursor(clear);
							p.closeInventory();
							p.sendMessage(sendmsg.replace("{enchant}", usedimplode2.replace("&e", "")));
						}
					} else if (m == diamondl || m == ironl || m == chainl || m == leatherl) {
						if (app.getStringList("Implode").contains("Leggings")) {
							oldlore.remove(implodeE2);
							oldlore.add(implodeE3);
							newmeta.setLore(oldlore);
							item.setItemMeta(newmeta);
							p.getInventory().addItem(item);
							p.setLevel(plevel - twoCost);
							anvil.clear();
							p.setItemOnCursor(clear);
							p.closeInventory();
							p.sendMessage(sendmsg.replace("{enchant}", usedimplode2.replace("&e", "")));
						}
					} else if (m == diamondb || m == ironb || m == chainb || m == leatherb) {
						if (app.getStringList("Implode").contains("Boots")) {
							oldlore.remove(implodeE2);
							oldlore.add(implodeE3);
							newmeta.setLore(oldlore);
							item.setItemMeta(newmeta);
							p.getInventory().addItem(item);
							p.setLevel(plevel - twoCost);
							anvil.clear();
							p.setItemOnCursor(clear);
							p.closeInventory();
							p.sendMessage(sendmsg.replace("{enchant}", usedimplode2.replace("&e", "")));
						}
					}
					return;
				} else if (oldlore.contains(implodeE)) {
					if (m == diamondh || m == ironh || m == chainh || m == leatherh) {
						if (app.getStringList("Implode").contains("Helmet")) {
							oldlore.remove(implodeE);
							oldlore.add(implodeE2);
							newmeta.setLore(oldlore);
							item.setItemMeta(newmeta);
							p.getInventory().addItem(item);
							p.setLevel(plevel - twoCost);
							anvil.clear();
							p.setItemOnCursor(clear);
							p.closeInventory();
							p.sendMessage(sendmsg.replace("{enchant}", usedimplode2.replace("&e", "")));
						}
					} else if (m == diamondc || m == ironc || m == chainc || m == leatherc) {
						if (app.getStringList("Implode").contains("Chestplate")) {
							oldlore.remove(implodeE);
							oldlore.add(implodeE2);
							newmeta.setLore(oldlore);
							item.setItemMeta(newmeta);
							p.getInventory().addItem(item);
							p.setLevel(plevel - twoCost);
							anvil.clear();
							p.setItemOnCursor(clear);
							p.closeInventory();
							p.sendMessage(sendmsg.replace("{enchant}", usedimplode2.replace("&e", "")));
						}
					} else if (m == diamondl || m == ironl || m == chainl || m == leatherl) {
						if (app.getStringList("Implode").contains("Leggings")) {
							oldlore.remove(implodeE);
							oldlore.add(implodeE2);
							newmeta.setLore(oldlore);
							item.setItemMeta(newmeta);
							p.getInventory().addItem(item);
							p.setLevel(plevel - twoCost);
							anvil.clear();
							p.setItemOnCursor(clear);
							p.closeInventory();
							p.sendMessage(sendmsg.replace("{enchant}", usedimplode2.replace("&e", "")));
						}
					} else if (m == diamondb || m == ironb || m == chainb || m == leatherb) {
						if (app.getStringList("Implode").contains("Boots")) {
							oldlore.remove(implodeE);
							oldlore.add(implodeE2);
							newmeta.setLore(oldlore);
							item.setItemMeta(newmeta);
							p.getInventory().addItem(item);
							p.setLevel(plevel - twoCost);
							anvil.clear();
							p.setItemOnCursor(clear);
							p.closeInventory();
							p.sendMessage(sendmsg.replace("{enchant}", usedimplode2.replace("&e", "")));
						}
					}
					return;
				} else if (oldlore.contains(implodeE3)) {
					return;
				}
			}
			if (enchants + loreLines >= enchantLimit) {
				p.sendMessage(toomanyenchantsmsg);
				return;
			}
			if (m == diamondh || m == ironh || m == chainh || m == leatherh) {
				if (app.getStringList("Implode").contains("Helmet")) {
					if (!(oldmeta.hasLore())) {
						newmeta.setLore(Arrays.asList(implodeE2));
					} else if (oldmeta.hasLore()) {
						oldlore.add(implodeE2);
						newmeta.setLore(oldlore);
					}
					item.setItemMeta(newmeta);
					p.getInventory().addItem(item);
					p.setLevel(plevel - twoCost);
					anvil.clear();
					p.setItemOnCursor(clear);
					p.closeInventory();
					p.sendMessage(sendmsg.replace("{enchant}", usedimplode2.replace("&e", "")));
				}
			} else if (m == diamondc || m == ironc || m == chainc || m == leatherc) {
				if (app.getStringList("Implode").contains("Chestplate")) {
					if (!(oldmeta.hasLore())) {
						newmeta.setLore(Arrays.asList(implodeE2));
					} else if (oldmeta.hasLore()) {
						oldlore.add(implodeE2);
						newmeta.setLore(oldlore);
					}
					item.setItemMeta(newmeta);
					p.getInventory().addItem(item);
					p.setLevel(plevel - twoCost);
					anvil.clear();
					p.setItemOnCursor(clear);
					p.closeInventory();
					p.sendMessage(sendmsg.replace("{enchant}", usedimplode2.replace("&e", "")));
				}
			} else if (m == diamondl || m == ironl || m == chainl || m == leatherl) {
				if (app.getStringList("Implode").contains("Leggings")) {
					if (!(oldmeta.hasLore())) {
						newmeta.setLore(Arrays.asList(implodeE2));
					} else if (oldmeta.hasLore()) {
						oldlore.add(implodeE2);
						newmeta.setLore(oldlore);
					}
					item.setItemMeta(newmeta);
					p.getInventory().addItem(item);
					p.setLevel(plevel - twoCost);
					anvil.clear();
					p.setItemOnCursor(clear);
					p.closeInventory();
					p.sendMessage(sendmsg.replace("{enchant}", usedimplode2.replace("&e", "")));
				}
			} else if (m == diamondb || m == ironb || m == chainb || m == leatherb) {
				if (app.getStringList("Implode").contains("Boots")) {
					if (!(oldmeta.hasLore())) {
						newmeta.setLore(Arrays.asList(implodeE2));
					} else if (oldmeta.hasLore()) {
						oldlore.add(implodeE2);
						newmeta.setLore(oldlore);
					}
					item.setItemMeta(newmeta);
					p.getInventory().addItem(item);
					p.setLevel(plevel - twoCost);
					anvil.clear();
					p.setItemOnCursor(clear);
					p.closeInventory();
					p.sendMessage(sendmsg.replace("{enchant}", usedimplode2.replace("&e", "")));
				}
			}
		} else if (lore.contains(leapsE2)) {
			if (oldmeta.hasLore()) {
				if (oldlore.contains(leapsE2)) {
					if (m == diamondh || m == ironh || m == chainh || m == leatherh) {
						if (app.getStringList("Leaps").contains("Helmet")) {
							oldlore.remove(leapsE2);
							oldlore.add(leapsE3);
							newmeta.setLore(oldlore);
							item.setItemMeta(newmeta);
							p.getInventory().addItem(item);
							p.setLevel(plevel - twoCost);
							anvil.clear();
							p.setItemOnCursor(clear);
							p.closeInventory();
							p.sendMessage(sendmsg.replace("{enchant}", usedleaps2.replace("&e", "")));
						}
					} else if (m == diamondc || m == ironc || m == chainc || m == leatherc) {
						if (app.getStringList("Leaps").contains("Chestplate")) {
							oldlore.remove(leapsE2);
							oldlore.add(leapsE3);
							newmeta.setLore(oldlore);
							item.setItemMeta(newmeta);
							p.getInventory().addItem(item);
							p.setLevel(plevel - twoCost);
							anvil.clear();
							p.setItemOnCursor(clear);
							p.closeInventory();
							p.sendMessage(sendmsg.replace("{enchant}", usedleaps2.replace("&e", "")));
						}
					} else if (m == diamondl || m == ironl || m == chainl || m == leatherl) {
						if (app.getStringList("Leaps").contains("Leggings")) {
							oldlore.remove(leapsE2);
							oldlore.add(leapsE3);
							newmeta.setLore(oldlore);
							item.setItemMeta(newmeta);
							p.getInventory().addItem(item);
							p.setLevel(plevel - twoCost);
							anvil.clear();
							p.setItemOnCursor(clear);
							p.closeInventory();
							p.sendMessage(sendmsg.replace("{enchant}", usedleaps2.replace("&e", "")));
						}
					} else if (m == diamondb || m == ironb || m == chainb || m == leatherb) {
						if (app.getStringList("Leaps").contains("Boots")) {
							oldlore.remove(leapsE2);
							oldlore.add(leapsE3);
							newmeta.setLore(oldlore);
							item.setItemMeta(newmeta);
							p.getInventory().addItem(item);
							p.setLevel(plevel - twoCost);
							anvil.clear();
							p.setItemOnCursor(clear);
							p.closeInventory();
							p.sendMessage(sendmsg.replace("{enchant}", usedleaps2.replace("&e", "")));
						}
					}
					return;
				} else if (oldlore.contains(leapsE)) {
					if (m == diamondh || m == ironh || m == chainh || m == leatherh) {
						if (app.getStringList("Leaps").contains("Helmet")) {
							oldlore.remove(leapsE);
							oldlore.add(leapsE2);
							newmeta.setLore(oldlore);
							item.setItemMeta(newmeta);
							p.getInventory().addItem(item);
							p.setLevel(plevel - twoCost);
							anvil.clear();
							p.setItemOnCursor(clear);
							p.closeInventory();
							p.sendMessage(sendmsg.replace("{enchant}", usedleaps2.replace("&e", "")));
						}
					} else if (m == diamondc || m == ironc || m == chainc || m == leatherc) {
						if (app.getStringList("Leaps").contains("Chestplate")) {
							oldlore.remove(leapsE);
							oldlore.add(leapsE2);
							newmeta.setLore(oldlore);
							item.setItemMeta(newmeta);
							p.getInventory().addItem(item);
							p.setLevel(plevel - twoCost);
							anvil.clear();
							p.setItemOnCursor(clear);
							p.closeInventory();
							p.sendMessage(sendmsg.replace("{enchant}", usedleaps2.replace("&e", "")));
						}
					} else if (m == diamondl || m == ironl || m == chainl || m == leatherl) {
						if (app.getStringList("Leaps").contains("Leggings")) {
							oldlore.remove(leapsE);
							oldlore.add(leapsE2);
							newmeta.setLore(oldlore);
							item.setItemMeta(newmeta);
							p.getInventory().addItem(item);
							p.setLevel(plevel - twoCost);
							anvil.clear();
							p.setItemOnCursor(clear);
							p.closeInventory();
							p.sendMessage(sendmsg.replace("{enchant}", usedleaps2.replace("&e", "")));
						}
					} else if (m == diamondb || m == ironb || m == chainb || m == leatherb) {
						if (app.getStringList("Leaps").contains("Boots")) {
							oldlore.remove(leapsE);
							oldlore.add(leapsE2);
							newmeta.setLore(oldlore);
							item.setItemMeta(newmeta);
							p.getInventory().addItem(item);
							p.setLevel(plevel - twoCost);
							anvil.clear();
							p.setItemOnCursor(clear);
							p.closeInventory();
							p.sendMessage(sendmsg.replace("{enchant}", usedleaps2.replace("&e", "")));
						}
					}
					return;
				} else if (oldlore.contains(leapsE3)) {
					return;
				}
			}
			if (enchants + loreLines >= enchantLimit) {
				p.sendMessage(toomanyenchantsmsg);
				return;
			}
			if (m == diamondh || m == ironh || m == chainh || m == leatherh) {
				if (app.getStringList("Leaps").contains("Helmet")) {
					if (!(oldmeta.hasLore())) {
						newmeta.setLore(Arrays.asList(leapsE2));
					} else if (oldmeta.hasLore()) {
						oldlore.add(leapsE2);
						newmeta.setLore(oldlore);
					}
					item.setItemMeta(newmeta);
					p.getInventory().addItem(item);
					p.setLevel(plevel - twoCost);
					anvil.clear();
					p.setItemOnCursor(clear);
					p.closeInventory();
					p.sendMessage(sendmsg.replace("{enchant}", usedleaps2.replace("&e", "")));
				}
			} else if (m == diamondc || m == ironc || m == chainc || m == leatherc) {
				if (app.getStringList("Leaps").contains("Chestplate")) {
					if (!(oldmeta.hasLore())) {
						newmeta.setLore(Arrays.asList(leapsE2));
					} else if (oldmeta.hasLore()) {
						oldlore.add(leapsE2);
						newmeta.setLore(oldlore);
					}
					item.setItemMeta(newmeta);
					p.getInventory().addItem(item);
					p.setLevel(plevel - twoCost);
					anvil.clear();
					p.setItemOnCursor(clear);
					p.closeInventory();
					p.sendMessage(sendmsg.replace("{enchant}", usedleaps2.replace("&e", "")));
				}
			} else if (m == diamondl || m == ironl || m == chainl || m == leatherl) {
				if (app.getStringList("Leaps").contains("Leggings")) {
					if (!(oldmeta.hasLore())) {
						newmeta.setLore(Arrays.asList(leapsE2));
					} else if (oldmeta.hasLore()) {
						oldlore.add(leapsE2);
						newmeta.setLore(oldlore);
					}
					item.setItemMeta(newmeta);
					p.getInventory().addItem(item);
					p.setLevel(plevel - twoCost);
					anvil.clear();
					p.setItemOnCursor(clear);
					p.closeInventory();
					p.sendMessage(sendmsg.replace("{enchant}", usedleaps2.replace("&e", "")));
				}
			} else if (m == diamondb || m == ironb || m == chainb || m == leatherb) {
				if (app.getStringList("Leaps").contains("Boots")) {
					if (!(oldmeta.hasLore())) {
						newmeta.setLore(Arrays.asList(leapsE2));
					} else if (oldmeta.hasLore()) {
						oldlore.add(leapsE2);
						newmeta.setLore(oldlore);
					}
					item.setItemMeta(newmeta);
					p.getInventory().addItem(item);
					p.setLevel(plevel - twoCost);
					anvil.clear();
					p.setItemOnCursor(clear);
					p.closeInventory();
					p.sendMessage(sendmsg.replace("{enchant}", usedleaps2.replace("&e", "")));
				}
			}
		} else if (lore.contains(rebornE2)) {
			if (oldmeta.hasLore()) {
				if (oldlore.contains(rebornE2)) {
					if (m == diamondh || m == ironh || m == chainh || m == leatherh) {
						if (app.getStringList("Reborn").contains("Helmet")) {
							oldlore.remove(rebornE2);
							oldlore.add(rebornE3);
							newmeta.setLore(oldlore);
							item.setItemMeta(newmeta);
							p.getInventory().addItem(item);
							p.setLevel(plevel - twoCost);
							anvil.clear();
							p.setItemOnCursor(clear);
							p.closeInventory();
							p.sendMessage(sendmsg.replace("{enchant}", usedreborn2.replace("&e", "")));
						}
					} else if (m == diamondc || m == ironc || m == chainc || m == leatherc) {
						if (app.getStringList("Reborn").contains("Chestplate")) {
							oldlore.remove(rebornE2);
							oldlore.add(rebornE3);
							newmeta.setLore(oldlore);
							item.setItemMeta(newmeta);
							p.getInventory().addItem(item);
							p.setLevel(plevel - twoCost);
							anvil.clear();
							p.setItemOnCursor(clear);
							p.closeInventory();
							p.sendMessage(sendmsg.replace("{enchant}", usedreborn2.replace("&e", "")));
						}
					} else if (m == diamondl || m == ironl || m == chainl || m == leatherl) {
						if (app.getStringList("Reborn").contains("Leggings")) {
							oldlore.remove(rebornE2);
							oldlore.add(rebornE3);
							newmeta.setLore(oldlore);
							item.setItemMeta(newmeta);
							p.getInventory().addItem(item);
							p.setLevel(plevel - twoCost);
							anvil.clear();
							p.setItemOnCursor(clear);
							p.closeInventory();
							p.sendMessage(sendmsg.replace("{enchant}", usedreborn2.replace("&e", "")));
						}
					} else if (m == diamondb || m == ironb || m == chainb || m == leatherb) {
						if (app.getStringList("Reborn").contains("Boots")) {
							oldlore.remove(rebornE2);
							oldlore.add(rebornE3);
							newmeta.setLore(oldlore);
							item.setItemMeta(newmeta);
							p.getInventory().addItem(item);
							p.setLevel(plevel - twoCost);
							anvil.clear();
							p.setItemOnCursor(clear);
							p.closeInventory();
							p.sendMessage(sendmsg.replace("{enchant}", usedreborn2.replace("&e", "")));
						}
					}
					return;
				} else if (oldlore.contains(rebornE)) {
					if (m == diamondh || m == ironh || m == chainh || m == leatherh) {
						if (app.getStringList("Reborn").contains("Helmet")) {
							oldlore.remove(rebornE);
							oldlore.add(rebornE2);
							newmeta.setLore(oldlore);
							item.setItemMeta(newmeta);
							p.getInventory().addItem(item);
							p.setLevel(plevel - twoCost);
							anvil.clear();
							p.setItemOnCursor(clear);
							p.closeInventory();
							p.sendMessage(sendmsg.replace("{enchant}", usedreborn2.replace("&e", "")));
						}
					} else if (m == diamondc || m == ironc || m == chainc || m == leatherc) {
						if (app.getStringList("Reborn").contains("Chestplate")) {
							oldlore.remove(rebornE);
							oldlore.add(rebornE2);
							newmeta.setLore(oldlore);
							item.setItemMeta(newmeta);
							p.getInventory().addItem(item);
							p.setLevel(plevel - twoCost);
							anvil.clear();
							p.setItemOnCursor(clear);
							p.closeInventory();
							p.sendMessage(sendmsg.replace("{enchant}", usedreborn2.replace("&e", "")));
						}
					} else if (m == diamondl || m == ironl || m == chainl || m == leatherl) {
						if (app.getStringList("Reborn").contains("Leggings")) {
							oldlore.remove(rebornE);
							oldlore.add(rebornE2);
							newmeta.setLore(oldlore);
							item.setItemMeta(newmeta);
							p.getInventory().addItem(item);
							p.setLevel(plevel - twoCost);
							anvil.clear();
							p.setItemOnCursor(clear);
							p.closeInventory();
							p.sendMessage(sendmsg.replace("{enchant}", usedreborn2.replace("&e", "")));
						}
					} else if (m == diamondb || m == ironb || m == chainb || m == leatherb) {
						if (app.getStringList("Reborn").contains("Boots")) {
							oldlore.remove(rebornE);
							oldlore.add(rebornE2);
							newmeta.setLore(oldlore);
							item.setItemMeta(newmeta);
							p.getInventory().addItem(item);
							p.setLevel(plevel - twoCost);
							anvil.clear();
							p.setItemOnCursor(clear);
							p.closeInventory();
							p.sendMessage(sendmsg.replace("{enchant}", usedreborn2.replace("&e", "")));
						}
					}
					return;
				} else if (oldlore.contains(rebornE3)) {
					return;
				}
			}
			if (enchants + loreLines >= enchantLimit) {
				p.sendMessage(toomanyenchantsmsg);
				return;
			}
			if (m == diamondh || m == ironh || m == chainh || m == leatherh) {
				if (app.getStringList("Reborn").contains("Helmet")) {
					if (!(oldmeta.hasLore())) {
						newmeta.setLore(Arrays.asList(rebornE2));
					} else if (oldmeta.hasLore()) {
						oldlore.add(rebornE2);
						newmeta.setLore(oldlore);
					}
					item.setItemMeta(newmeta);
					p.getInventory().addItem(item);
					p.setLevel(plevel - twoCost);
					anvil.clear();
					p.setItemOnCursor(clear);
					p.closeInventory();
					p.sendMessage(sendmsg.replace("{enchant}", usedreborn2.replace("&e", "")));
				}
			} else if (m == diamondc || m == ironc || m == chainc || m == leatherc) {
				if (app.getStringList("Reborn").contains("Chestplate")) {
					if (!(oldmeta.hasLore())) {
						newmeta.setLore(Arrays.asList(rebornE2));
					} else if (oldmeta.hasLore()) {
						oldlore.add(rebornE2);
						newmeta.setLore(oldlore);
					}
					item.setItemMeta(newmeta);
					p.getInventory().addItem(item);
					p.setLevel(plevel - twoCost);
					anvil.clear();
					p.setItemOnCursor(clear);
					p.closeInventory();
					p.sendMessage(sendmsg.replace("{enchant}", usedreborn2.replace("&e", "")));
				}
			} else if (m == diamondl || m == ironl || m == chainl || m == leatherl) {
				if (app.getStringList("Reborn").contains("Leggings")) {
					if (!(oldmeta.hasLore())) {
						newmeta.setLore(Arrays.asList(rebornE2));
					} else if (oldmeta.hasLore()) {
						oldlore.add(rebornE2);
						newmeta.setLore(oldlore);
					}
					item.setItemMeta(newmeta);
					p.getInventory().addItem(item);
					p.setLevel(plevel - twoCost);
					anvil.clear();
					p.setItemOnCursor(clear);
					p.closeInventory();
					p.sendMessage(sendmsg.replace("{enchant}", usedreborn2.replace("&e", "")));
				}
			} else if (m == diamondb || m == ironb || m == chainb || m == leatherb) {
				if (app.getStringList("Reborn").contains("Boots")) {
					if (!(oldmeta.hasLore())) {
						newmeta.setLore(Arrays.asList(rebornE2));
					} else if (oldmeta.hasLore()) {
						oldlore.add(rebornE2);
						newmeta.setLore(oldlore);
					}
					item.setItemMeta(newmeta);
					p.getInventory().addItem(item);
					p.setLevel(plevel - twoCost);
					anvil.clear();
					p.setItemOnCursor(clear);
					p.closeInventory();
					p.sendMessage(sendmsg.replace("{enchant}", usedreborn2.replace("&e", "")));
				}
			}
		} else if (lore.contains(replenishE2)) {
			if (oldmeta.hasLore()) {
				if (oldlore.contains(replenishE2)) {
					if (m == diamondh || m == ironh || m == chainh || m == leatherh) {
						if (app.getStringList("Replenish").contains("Helmet")) {
							oldlore.remove(replenishE2);
							oldlore.add(replenishE3);
							newmeta.setLore(oldlore);
							item.setItemMeta(newmeta);
							p.getInventory().addItem(item);
							p.setLevel(plevel - twoCost);
							anvil.clear();
							p.setItemOnCursor(clear);
							p.closeInventory();
							p.sendMessage(sendmsg.replace("{enchant}", usedreplenish2.replace("&e", "")));
						}
					} else if (m == diamondc || m == ironc || m == chainc || m == leatherc) {
						if (app.getStringList("Replenish").contains("Chestplate")) {
							oldlore.remove(replenishE2);
							oldlore.add(replenishE3);
							newmeta.setLore(oldlore);
							item.setItemMeta(newmeta);
							p.getInventory().addItem(item);
							p.setLevel(plevel - twoCost);
							anvil.clear();
							p.setItemOnCursor(clear);
							p.closeInventory();
							p.sendMessage(sendmsg.replace("{enchant}", usedreplenish2.replace("&e", "")));
						}
					} else if (m == diamondl || m == ironl || m == chainl || m == leatherl) {
						if (app.getStringList("Replenish").contains("Leggings")) {
							oldlore.remove(replenishE2);
							oldlore.add(replenishE3);
							newmeta.setLore(oldlore);
							item.setItemMeta(newmeta);
							p.getInventory().addItem(item);
							p.setLevel(plevel - twoCost);
							anvil.clear();
							p.setItemOnCursor(clear);
							p.closeInventory();
							p.sendMessage(sendmsg.replace("{enchant}", usedreplenish2.replace("&e", "")));
						}
					} else if (m == diamondb || m == ironb || m == chainb || m == leatherb) {
						if (app.getStringList("Replenish").contains("Boots")) {
							oldlore.remove(replenishE2);
							oldlore.add(replenishE3);
							newmeta.setLore(oldlore);
							item.setItemMeta(newmeta);
							p.getInventory().addItem(item);
							p.setLevel(plevel - twoCost);
							anvil.clear();
							p.setItemOnCursor(clear);
							p.closeInventory();
							p.sendMessage(sendmsg.replace("{enchant}", usedreplenish2.replace("&e", "")));
						}
					}
					return;
				} else if (oldlore.contains(replenishE)) {
					if (m == diamondh || m == ironh || m == chainh || m == leatherh) {
						if (app.getStringList("Replenish").contains("Helmet")) {
							oldlore.remove(replenishE);
							oldlore.add(replenishE2);
							newmeta.setLore(oldlore);
							item.setItemMeta(newmeta);
							p.getInventory().addItem(item);
							p.setLevel(plevel - twoCost);
							anvil.clear();
							p.setItemOnCursor(clear);
							p.closeInventory();
							p.sendMessage(sendmsg.replace("{enchant}", usedreplenish2.replace("&e", "")));
						}
					} else if (m == diamondc || m == ironc || m == chainc || m == leatherc) {
						if (app.getStringList("Replenish").contains("Chestplate")) {
							oldlore.remove(replenishE);
							oldlore.add(replenishE2);
							newmeta.setLore(oldlore);
							item.setItemMeta(newmeta);
							p.getInventory().addItem(item);
							p.setLevel(plevel - twoCost);
							anvil.clear();
							p.setItemOnCursor(clear);
							p.closeInventory();
							p.sendMessage(sendmsg.replace("{enchant}", usedreplenish2.replace("&e", "")));
						}
					} else if (m == diamondl || m == ironl || m == chainl || m == leatherl) {
						if (app.getStringList("Replenish").contains("Leggings")) {
							oldlore.remove(replenishE);
							oldlore.add(replenishE2);
							newmeta.setLore(oldlore);
							item.setItemMeta(newmeta);
							p.getInventory().addItem(item);
							p.setLevel(plevel - twoCost);
							anvil.clear();
							p.setItemOnCursor(clear);
							p.closeInventory();
							p.sendMessage(sendmsg.replace("{enchant}", usedreplenish2.replace("&e", "")));
						}
					} else if (m == diamondb || m == ironb || m == chainb || m == leatherb) {
						if (app.getStringList("Replenish").contains("Boots")) {
							oldlore.remove(replenishE);
							oldlore.add(replenishE2);
							newmeta.setLore(oldlore);
							item.setItemMeta(newmeta);
							p.getInventory().addItem(item);
							p.setLevel(plevel - twoCost);
							anvil.clear();
							p.setItemOnCursor(clear);
							p.closeInventory();
							p.sendMessage(sendmsg.replace("{enchant}", usedreplenish2.replace("&e", "")));
						}
					}
					return;
				} else if (oldlore.contains(replenishE3)) {
					return;
				}
			}
			if (enchants + loreLines >= enchantLimit) {
				p.sendMessage(toomanyenchantsmsg);
				return;
			}
			if (m == diamondh || m == ironh || m == chainh || m == leatherh) {
				if (app.getStringList("Replenish").contains("Helmet")) {
					if (!(oldmeta.hasLore())) {
						newmeta.setLore(Arrays.asList(replenishE2));
					} else if (oldmeta.hasLore()) {
						oldlore.add(replenishE2);
						newmeta.setLore(oldlore);
					}
					item.setItemMeta(newmeta);
					p.getInventory().addItem(item);
					p.setLevel(plevel - twoCost);
					anvil.clear();
					p.setItemOnCursor(clear);
					p.closeInventory();
					p.sendMessage(sendmsg.replace("{enchant}", usedreplenish2.replace("&e", "")));
				}
			} else if (m == diamondc || m == ironc || m == chainc || m == leatherc) {
				if (app.getStringList("Replenish").contains("Chestplate")) {
					if (!(oldmeta.hasLore())) {
						newmeta.setLore(Arrays.asList(replenishE2));
					} else if (oldmeta.hasLore()) {
						oldlore.add(replenishE2);
						newmeta.setLore(oldlore);
					}
					item.setItemMeta(newmeta);
					p.getInventory().addItem(item);
					p.setLevel(plevel - twoCost);
					anvil.clear();
					p.setItemOnCursor(clear);
					p.closeInventory();
					p.sendMessage(sendmsg.replace("{enchant}", usedreplenish2.replace("&e", "")));
				}
			} else if (m == diamondl || m == ironl || m == chainl || m == leatherl) {
				if (app.getStringList("Replenish").contains("Leggings")) {
					if (!(oldmeta.hasLore())) {
						newmeta.setLore(Arrays.asList(replenishE2));
					} else if (oldmeta.hasLore()) {
						oldlore.add(replenishE2);
						newmeta.setLore(oldlore);
					}
					item.setItemMeta(newmeta);
					p.getInventory().addItem(item);
					p.setLevel(plevel - twoCost);
					anvil.clear();
					p.setItemOnCursor(clear);
					p.closeInventory();
					p.sendMessage(sendmsg.replace("{enchant}", usedreplenish2.replace("&e", "")));
				}
			} else if (m == diamondb || m == ironb || m == chainb || m == leatherb) {
				if (app.getStringList("Replenish").contains("Boots")) {
					if (!(oldmeta.hasLore())) {
						newmeta.setLore(Arrays.asList(replenishE2));
					} else if (oldmeta.hasLore()) {
						oldlore.add(replenishE2);
						newmeta.setLore(oldlore);
					}
					item.setItemMeta(newmeta);
					p.getInventory().addItem(item);
					p.setLevel(plevel - twoCost);
					anvil.clear();
					p.setItemOnCursor(clear);
					p.closeInventory();
					p.sendMessage(sendmsg.replace("{enchant}", usedreplenish2.replace("&e", "")));
				}
			}
		} else if (lore.contains(retreatE2)) {
			if (oldmeta.hasLore()) {
				if (oldlore.contains(retreatE2)) {
					if (m == diamondh || m == ironh || m == chainh || m == leatherh) {
						if (app.getStringList("Retreat").contains("Helmet")) {
							oldlore.remove(retreatE2);
							oldlore.add(retreatE3);
							newmeta.setLore(oldlore);
							item.setItemMeta(newmeta);
							p.getInventory().addItem(item);
							p.setLevel(plevel - twoCost);
							anvil.clear();
							p.setItemOnCursor(clear);
							p.closeInventory();
							p.sendMessage(sendmsg.replace("{enchant}", usedretreat2.replace("&e", "")));
						}
					} else if (m == diamondc || m == ironc || m == chainc || m == leatherc) {
						if (app.getStringList("Retreat").contains("Chestplate")) {
							oldlore.remove(retreatE2);
							oldlore.add(retreatE3);
							newmeta.setLore(oldlore);
							item.setItemMeta(newmeta);
							p.getInventory().addItem(item);
							p.setLevel(plevel - twoCost);
							anvil.clear();
							p.setItemOnCursor(clear);
							p.closeInventory();
							p.sendMessage(sendmsg.replace("{enchant}", usedretreat2.replace("&e", "")));
						}
					} else if (m == diamondl || m == ironl || m == chainl || m == leatherl) {
						if (app.getStringList("Retreat").contains("Leggings")) {
							oldlore.remove(retreatE2);
							oldlore.add(retreatE3);
							newmeta.setLore(oldlore);
							item.setItemMeta(newmeta);
							p.getInventory().addItem(item);
							p.setLevel(plevel - twoCost);
							anvil.clear();
							p.setItemOnCursor(clear);
							p.closeInventory();
							p.sendMessage(sendmsg.replace("{enchant}", usedretreat2.replace("&e", "")));
						}
					} else if (m == diamondb || m == ironb || m == chainb || m == leatherb) {
						if (app.getStringList("Retreat").contains("Boots")) {
							oldlore.remove(retreatE2);
							oldlore.add(retreatE3);
							newmeta.setLore(oldlore);
							item.setItemMeta(newmeta);
							p.getInventory().addItem(item);
							p.setLevel(plevel - twoCost);
							anvil.clear();
							p.setItemOnCursor(clear);
							p.closeInventory();
							p.sendMessage(sendmsg.replace("{enchant}", usedretreat2.replace("&e", "")));
						}
					}
					return;
				} else if (oldlore.contains(retreatE)) {
					if (m == diamondh || m == ironh || m == chainh || m == leatherh) {
						if (app.getStringList("Retreat").contains("Helmet")) {
							oldlore.remove(retreatE);
							oldlore.add(retreatE2);
							newmeta.setLore(oldlore);
							item.setItemMeta(newmeta);
							p.getInventory().addItem(item);
							p.setLevel(plevel - twoCost);
							anvil.clear();
							p.setItemOnCursor(clear);
							p.closeInventory();
							p.sendMessage(sendmsg.replace("{enchant}", usedretreat2.replace("&e", "")));
						}
					} else if (m == diamondc || m == ironc || m == chainc || m == leatherc) {
						if (app.getStringList("Retreat").contains("Chestplate")) {
							oldlore.remove(retreatE);
							oldlore.add(retreatE2);
							newmeta.setLore(oldlore);
							item.setItemMeta(newmeta);
							p.getInventory().addItem(item);
							p.setLevel(plevel - twoCost);
							anvil.clear();
							p.setItemOnCursor(clear);
							p.closeInventory();
							p.sendMessage(sendmsg.replace("{enchant}", usedretreat2.replace("&e", "")));
						}
					} else if (m == diamondl || m == ironl || m == chainl || m == leatherl) {
						if (app.getStringList("Retreat").contains("Leggings")) {
							oldlore.remove(retreatE);
							oldlore.add(retreatE2);
							newmeta.setLore(oldlore);
							item.setItemMeta(newmeta);
							p.getInventory().addItem(item);
							p.setLevel(plevel - twoCost);
							anvil.clear();
							p.setItemOnCursor(clear);
							p.closeInventory();
							p.sendMessage(sendmsg.replace("{enchant}", usedretreat2.replace("&e", "")));
						}
					} else if (m == diamondb || m == ironb || m == chainb || m == leatherb) {
						if (app.getStringList("Retreat").contains("Boots")) {
							oldlore.remove(retreatE);
							oldlore.add(retreatE2);
							newmeta.setLore(oldlore);
							item.setItemMeta(newmeta);
							p.getInventory().addItem(item);
							p.setLevel(plevel - twoCost);
							anvil.clear();
							p.setItemOnCursor(clear);
							p.closeInventory();
							p.sendMessage(sendmsg.replace("{enchant}", usedretreat2.replace("&e", "")));
						}
					}
					return;
				} else if (oldlore.contains(retreatE3)) {
					return;
				}
			}
			if (enchants + loreLines >= enchantLimit) {
				p.sendMessage(toomanyenchantsmsg);
				return;
			}
			if (m == diamondh || m == ironh || m == chainh || m == leatherh) {
				if (app.getStringList("Retreat").contains("Helmet")) {
					if (!(oldmeta.hasLore())) {
						newmeta.setLore(Arrays.asList(retreatE2));
					} else if (oldmeta.hasLore()) {
						oldlore.add(retreatE2);
						newmeta.setLore(oldlore);
					}
					item.setItemMeta(newmeta);
					p.getInventory().addItem(item);
					p.setLevel(plevel - twoCost);
					anvil.clear();
					p.setItemOnCursor(clear);
					p.closeInventory();
					p.sendMessage(sendmsg.replace("{enchant}", usedretreat2.replace("&e", "")));
				}
			} else if (m == diamondc || m == ironc || m == chainc || m == leatherc) {
				if (app.getStringList("Retreat").contains("Chestplate")) {
					if (!(oldmeta.hasLore())) {
						newmeta.setLore(Arrays.asList(retreatE2));
					} else if (oldmeta.hasLore()) {
						oldlore.add(retreatE2);
						newmeta.setLore(oldlore);
					}
					item.setItemMeta(newmeta);
					p.getInventory().addItem(item);
					p.setLevel(plevel - twoCost);
					anvil.clear();
					p.setItemOnCursor(clear);
					p.closeInventory();
					p.sendMessage(sendmsg.replace("{enchant}", usedretreat2.replace("&e", "")));
				}
			} else if (m == diamondl || m == ironl || m == chainl || m == leatherl) {
				if (app.getStringList("Retreat").contains("Leggings")) {
					if (!(oldmeta.hasLore())) {
						newmeta.setLore(Arrays.asList(retreatE2));
					} else if (oldmeta.hasLore()) {
						oldlore.add(retreatE2);
						newmeta.setLore(oldlore);
					}
					item.setItemMeta(newmeta);
					p.getInventory().addItem(item);
					p.setLevel(plevel - twoCost);
					anvil.clear();
					p.setItemOnCursor(clear);
					p.closeInventory();
					p.sendMessage(sendmsg.replace("{enchant}", usedretreat2.replace("&e", "")));
				}
			} else if (m == diamondb || m == ironb || m == chainb || m == leatherb) {
				if (app.getStringList("Retreat").contains("Boots")) {
					if (!(oldmeta.hasLore())) {
						newmeta.setLore(Arrays.asList(retreatE2));
					} else if (oldmeta.hasLore()) {
						oldlore.add(retreatE2);
						newmeta.setLore(oldlore);
					}
					item.setItemMeta(newmeta);
					p.getInventory().addItem(item);
					p.setLevel(plevel - twoCost);
					anvil.clear();
					p.setItemOnCursor(clear);
					p.closeInventory();
					p.sendMessage(sendmsg.replace("{enchant}", usedretreat2.replace("&e", "")));
				}
			}
		} else if (lore.contains(scootE2)) {
			if (oldmeta.hasLore()) {
				if (oldlore.contains(scootE2)) {
					if (m == diamondh || m == ironh || m == chainh || m == leatherh) {
						if (app.getStringList("Scoot").contains("Helmet")) {
							oldlore.remove(scootE2);
							oldlore.add(scootE3);
							newmeta.setLore(oldlore);
							item.setItemMeta(newmeta);
							p.getInventory().addItem(item);
							p.setLevel(plevel - twoCost);
							anvil.clear();
							p.setItemOnCursor(clear);
							p.closeInventory();
							p.sendMessage(sendmsg.replace("{enchant}", usedscoot2.replace("&e", "")));
						}
					} else if (m == diamondc || m == ironc || m == chainc || m == leatherc) {
						if (app.getStringList("Scoot").contains("Chestplate")) {
							oldlore.remove(scootE2);
							oldlore.add(scootE3);
							newmeta.setLore(oldlore);
							item.setItemMeta(newmeta);
							p.getInventory().addItem(item);
							p.setLevel(plevel - twoCost);
							anvil.clear();
							p.setItemOnCursor(clear);
							p.closeInventory();
							p.sendMessage(sendmsg.replace("{enchant}", usedscoot2.replace("&e", "")));
						}
					} else if (m == diamondl || m == ironl || m == chainl || m == leatherl) {
						if (app.getStringList("Scoot").contains("Leggings")) {
							oldlore.remove(scootE2);
							oldlore.add(scootE3);
							newmeta.setLore(oldlore);
							item.setItemMeta(newmeta);
							p.getInventory().addItem(item);
							p.setLevel(plevel - twoCost);
							anvil.clear();
							p.setItemOnCursor(clear);
							p.closeInventory();
							p.sendMessage(sendmsg.replace("{enchant}", usedscoot2.replace("&e", "")));
						}
					} else if (m == diamondb || m == ironb || m == chainb || m == leatherb) {
						if (app.getStringList("Scoot").contains("Boots")) {
							oldlore.remove(scootE2);
							oldlore.add(scootE3);
							newmeta.setLore(oldlore);
							item.setItemMeta(newmeta);
							p.getInventory().addItem(item);
							p.setLevel(plevel - twoCost);
							anvil.clear();
							p.setItemOnCursor(clear);
							p.closeInventory();
							p.sendMessage(sendmsg.replace("{enchant}", usedscoot2.replace("&e", "")));
						}
					}
					return;
				} else if (oldlore.contains(scootE)) {
					if (m == diamondh || m == ironh || m == chainh || m == leatherh) {
						if (app.getStringList("Scoot").contains("Helmet")) {
							oldlore.remove(scootE);
							oldlore.add(scootE2);
							newmeta.setLore(oldlore);
							item.setItemMeta(newmeta);
							p.getInventory().addItem(item);
							p.setLevel(plevel - twoCost);
							anvil.clear();
							p.setItemOnCursor(clear);
							p.closeInventory();
							p.sendMessage(sendmsg.replace("{enchant}", usedscoot2.replace("&e", "")));
						}
					} else if (m == diamondc || m == ironc || m == chainc || m == leatherc) {
						if (app.getStringList("Scoot").contains("Chestplate")) {
							oldlore.remove(scootE);
							oldlore.add(scootE2);
							newmeta.setLore(oldlore);
							item.setItemMeta(newmeta);
							p.getInventory().addItem(item);
							p.setLevel(plevel - twoCost);
							anvil.clear();
							p.setItemOnCursor(clear);
							p.closeInventory();
							p.sendMessage(sendmsg.replace("{enchant}", usedscoot2.replace("&e", "")));
						}
					} else if (m == diamondl || m == ironl || m == chainl || m == leatherl) {
						if (app.getStringList("Scoot").contains("Leggings")) {
							oldlore.remove(scootE);
							oldlore.add(scootE2);
							newmeta.setLore(oldlore);
							item.setItemMeta(newmeta);
							p.getInventory().addItem(item);
							p.setLevel(plevel - twoCost);
							anvil.clear();
							p.setItemOnCursor(clear);
							p.closeInventory();
							p.sendMessage(sendmsg.replace("{enchant}", usedscoot2.replace("&e", "")));
						}
					} else if (m == diamondb || m == ironb || m == chainb || m == leatherb) {
						if (app.getStringList("Scoot").contains("Boots")) {
							oldlore.remove(scootE);
							oldlore.add(scootE2);
							newmeta.setLore(oldlore);
							item.setItemMeta(newmeta);
							p.getInventory().addItem(item);
							p.setLevel(plevel - twoCost);
							anvil.clear();
							p.setItemOnCursor(clear);
							p.closeInventory();
							p.sendMessage(sendmsg.replace("{enchant}", usedscoot2.replace("&e", "")));
						}
					}
					return;
				} else if (oldlore.contains(scootE3)) {
					return;
				}
			}
			if (enchants + loreLines >= enchantLimit) {
				p.sendMessage(toomanyenchantsmsg);
				return;
			}
			if (m == diamondh || m == ironh || m == chainh || m == leatherh) {
				if (app.getStringList("Scoot").contains("Helmet")) {
					if (!(oldmeta.hasLore())) {
						newmeta.setLore(Arrays.asList(scootE2));
					} else if (oldmeta.hasLore()) {
						oldlore.add(scootE2);
						newmeta.setLore(oldlore);
					}
					item.setItemMeta(newmeta);
					p.getInventory().addItem(item);
					p.setLevel(plevel - twoCost);
					anvil.clear();
					p.setItemOnCursor(clear);
					p.closeInventory();
					p.sendMessage(sendmsg.replace("{enchant}", usedscoot2.replace("&e", "")));
				}
			} else if (m == diamondc || m == ironc || m == chainc || m == leatherc) {
				if (app.getStringList("Scoot").contains("Chestplate")) {
					if (!(oldmeta.hasLore())) {
						newmeta.setLore(Arrays.asList(scootE2));
					} else if (oldmeta.hasLore()) {
						oldlore.add(scootE2);
						newmeta.setLore(oldlore);
					}
					item.setItemMeta(newmeta);
					p.getInventory().addItem(item);
					p.setLevel(plevel - twoCost);
					anvil.clear();
					p.setItemOnCursor(clear);
					p.closeInventory();
					p.sendMessage(sendmsg.replace("{enchant}", usedscoot2.replace("&e", "")));
				}
			} else if (m == diamondl || m == ironl || m == chainl || m == leatherl) {
				if (app.getStringList("Scoot").contains("Leggings")) {
					if (!(oldmeta.hasLore())) {
						newmeta.setLore(Arrays.asList(scootE2));
					} else if (oldmeta.hasLore()) {
						oldlore.add(scootE2);
						newmeta.setLore(oldlore);
					}
					item.setItemMeta(newmeta);
					p.getInventory().addItem(item);
					p.setLevel(plevel - twoCost);
					anvil.clear();
					p.setItemOnCursor(clear);
					p.closeInventory();
					p.sendMessage(sendmsg.replace("{enchant}", usedscoot2.replace("&e", "")));
				}
			} else if (m == diamondb || m == ironb || m == chainb || m == leatherb) {
				if (app.getStringList("Scoot").contains("Boots")) {
					if (!(oldmeta.hasLore())) {
						newmeta.setLore(Arrays.asList(scootE2));
					} else if (oldmeta.hasLore()) {
						oldlore.add(scootE2);
						newmeta.setLore(oldlore);
					}
					item.setItemMeta(newmeta);
					p.getInventory().addItem(item);
					p.setLevel(plevel - twoCost);
					anvil.clear();
					p.setItemOnCursor(clear);
					p.closeInventory();
					p.sendMessage(sendmsg.replace("{enchant}", usedscoot2.replace("&e", "")));
				}
			}
		} else if (lore.contains(tipsyE2)) {
			if (oldmeta.hasLore()) {
				if (oldlore.contains(tipsyE2)) {
					if (m == diamondh || m == ironh || m == chainh || m == leatherh) {
						if (app.getStringList("Tipsy").contains("Helmet")) {
							oldlore.remove(tipsyE2);
							oldlore.add(tipsyE3);
							newmeta.setLore(oldlore);
							item.setItemMeta(newmeta);
							p.getInventory().addItem(item);
							p.setLevel(plevel - twoCost);
							anvil.clear();
							p.setItemOnCursor(clear);
							p.closeInventory();
							p.sendMessage(sendmsg.replace("{enchant}", usedtipsy2.replace("&e", "")));
						}
					} else if (m == diamondc || m == ironc || m == chainc || m == leatherc) {
						if (app.getStringList("Tipsy").contains("Chestplate")) {
							oldlore.remove(tipsyE2);
							oldlore.add(tipsyE3);
							newmeta.setLore(oldlore);
							item.setItemMeta(newmeta);
							p.getInventory().addItem(item);
							p.setLevel(plevel - twoCost);
							anvil.clear();
							p.setItemOnCursor(clear);
							p.closeInventory();
							p.sendMessage(sendmsg.replace("{enchant}", usedtipsy2.replace("&e", "")));
						}
					} else if (m == diamondl || m == ironl || m == chainl || m == leatherl) {
						if (app.getStringList("Tipsy").contains("Leggings")) {
							oldlore.remove(tipsyE2);
							oldlore.add(tipsyE3);
							newmeta.setLore(oldlore);
							item.setItemMeta(newmeta);
							p.getInventory().addItem(item);
							p.setLevel(plevel - twoCost);
							anvil.clear();
							p.setItemOnCursor(clear);
							p.closeInventory();
							p.sendMessage(sendmsg.replace("{enchant}", usedtipsy2.replace("&e", "")));
						}
					} else if (m == diamondb || m == ironb || m == chainb || m == leatherb) {
						if (app.getStringList("Tipsy").contains("Boots")) {
							oldlore.remove(tipsyE2);
							oldlore.add(tipsyE3);
							newmeta.setLore(oldlore);
							item.setItemMeta(newmeta);
							p.getInventory().addItem(item);
							p.setLevel(plevel - twoCost);
							anvil.clear();
							p.setItemOnCursor(clear);
							p.closeInventory();
							p.sendMessage(sendmsg.replace("{enchant}", usedtipsy2.replace("&e", "")));
						}
					}
					return;
				} else if (oldlore.contains(tipsyE)) {
					if (m == diamondh || m == ironh || m == chainh || m == leatherh) {
						if (app.getStringList("Tipsy").contains("Helmet")) {
							oldlore.remove(tipsyE);
							oldlore.add(tipsyE2);
							newmeta.setLore(oldlore);
							item.setItemMeta(newmeta);
							p.getInventory().addItem(item);
							p.setLevel(plevel - twoCost);
							anvil.clear();
							p.setItemOnCursor(clear);
							p.closeInventory();
							p.sendMessage(sendmsg.replace("{enchant}", usedtipsy2.replace("&e", "")));
						}
					} else if (m == diamondc || m == ironc || m == chainc || m == leatherc) {
						if (app.getStringList("Tipsy").contains("Chestplate")) {
							oldlore.remove(tipsyE);
							oldlore.add(tipsyE2);
							newmeta.setLore(oldlore);
							item.setItemMeta(newmeta);
							p.getInventory().addItem(item);
							p.setLevel(plevel - twoCost);
							anvil.clear();
							p.setItemOnCursor(clear);
							p.closeInventory();
							p.sendMessage(sendmsg.replace("{enchant}", usedtipsy2.replace("&e", "")));
						}
					} else if (m == diamondl || m == ironl || m == chainl || m == leatherl) {
						if (app.getStringList("Tipsy").contains("Leggings")) {
							oldlore.remove(tipsyE);
							oldlore.add(tipsyE2);
							newmeta.setLore(oldlore);
							item.setItemMeta(newmeta);
							p.getInventory().addItem(item);
							p.setLevel(plevel - twoCost);
							anvil.clear();
							p.setItemOnCursor(clear);
							p.closeInventory();
							p.sendMessage(sendmsg.replace("{enchant}", usedtipsy2.replace("&e", "")));
						}
					} else if (m == diamondb || m == ironb || m == chainb || m == leatherb) {
						if (app.getStringList("Tipsy").contains("Boots")) {
							oldlore.remove(tipsyE);
							oldlore.add(tipsyE2);
							newmeta.setLore(oldlore);
							item.setItemMeta(newmeta);
							p.getInventory().addItem(item);
							p.setLevel(plevel - twoCost);
							anvil.clear();
							p.setItemOnCursor(clear);
							p.closeInventory();
							p.sendMessage(sendmsg.replace("{enchant}", usedtipsy2.replace("&e", "")));
						}
					}
					return;
				} else if (oldlore.contains(tipsyE3)) {
					return;
				}
			}
			if (enchants + loreLines >= enchantLimit) {
				p.sendMessage(toomanyenchantsmsg);
				return;
			}
			if (m == diamondh || m == ironh || m == chainh || m == leatherh) {
				if (app.getStringList("Tipsy").contains("Helmet")) {
					if (!(oldmeta.hasLore())) {
						newmeta.setLore(Arrays.asList(tipsyE2));
					} else if (oldmeta.hasLore()) {
						oldlore.add(tipsyE2);
						newmeta.setLore(oldlore);
					}
					item.setItemMeta(newmeta);
					p.getInventory().addItem(item);
					p.setLevel(plevel - twoCost);
					anvil.clear();
					p.setItemOnCursor(clear);
					p.closeInventory();
					p.sendMessage(sendmsg.replace("{enchant}", usedtipsy2.replace("&e", "")));
				}
			} else if (m == diamondc || m == ironc || m == chainc || m == leatherc) {
				if (app.getStringList("Tipsy").contains("Chestplate")) {
					if (!(oldmeta.hasLore())) {
						newmeta.setLore(Arrays.asList(tipsyE2));
					} else if (oldmeta.hasLore()) {
						oldlore.add(tipsyE2);
						newmeta.setLore(oldlore);
					}
					item.setItemMeta(newmeta);
					p.getInventory().addItem(item);
					p.setLevel(plevel - twoCost);
					anvil.clear();
					p.setItemOnCursor(clear);
					p.closeInventory();
					p.sendMessage(sendmsg.replace("{enchant}", usedtipsy2.replace("&e", "")));
				}
			} else if (m == diamondl || m == ironl || m == chainl || m == leatherl) {
				if (app.getStringList("Tipsy").contains("Leggings")) {
					if (!(oldmeta.hasLore())) {
						newmeta.setLore(Arrays.asList(tipsyE2));
					} else if (oldmeta.hasLore()) {
						oldlore.add(tipsyE2);
						newmeta.setLore(oldlore);
					}
					item.setItemMeta(newmeta);
					p.getInventory().addItem(item);
					p.setLevel(plevel - twoCost);
					anvil.clear();
					p.setItemOnCursor(clear);
					p.closeInventory();
					p.sendMessage(sendmsg.replace("{enchant}", usedtipsy2.replace("&e", "")));
				}
			} else if (m == diamondb || m == ironb || m == chainb || m == leatherb) {
				if (app.getStringList("Tipsy").contains("Boots")) {
					if (!(oldmeta.hasLore())) {
						newmeta.setLore(Arrays.asList(tipsyE2));
					} else if (oldmeta.hasLore()) {
						oldlore.add(tipsyE2);
						newmeta.setLore(oldlore);
					}
					item.setItemMeta(newmeta);
					p.getInventory().addItem(item);
					p.setLevel(plevel - twoCost);
					anvil.clear();
					p.setItemOnCursor(clear);
					p.closeInventory();
					p.sendMessage(sendmsg.replace("{enchant}", usedtipsy2.replace("&e", "")));
				}
			}
		} else if (lore.contains(vanishE2)) {
			if (oldmeta.hasLore()) {
				if (oldlore.contains(vanishE2)) {
					if (m == diamondh || m == ironh || m == chainh || m == leatherh) {
						if (app.getStringList("Vanish").contains("Helmet")) {
							oldlore.remove(vanishE2);
							oldlore.add(vanishE3);
							newmeta.setLore(oldlore);
							item.setItemMeta(newmeta);
							p.getInventory().addItem(item);
							p.setLevel(plevel - twoCost);
							anvil.clear();
							p.setItemOnCursor(clear);
							p.closeInventory();
							p.sendMessage(sendmsg.replace("{enchant}", usedvanish2.replace("&e", "")));
						}
					} else if (m == diamondc || m == ironc || m == chainc || m == leatherc) {
						if (app.getStringList("Vanish").contains("Chestplate")) {
							oldlore.remove(vanishE2);
							oldlore.add(vanishE3);
							newmeta.setLore(oldlore);
							item.setItemMeta(newmeta);
							p.getInventory().addItem(item);
							p.setLevel(plevel - twoCost);
							anvil.clear();
							p.setItemOnCursor(clear);
							p.closeInventory();
							p.sendMessage(sendmsg.replace("{enchant}", usedvanish2.replace("&e", "")));
						}
					} else if (m == diamondl || m == ironl || m == chainl || m == leatherl) {
						if (app.getStringList("Vanish").contains("Leggings")) {
							oldlore.remove(vanishE2);
							oldlore.add(vanishE3);
							newmeta.setLore(oldlore);
							item.setItemMeta(newmeta);
							p.getInventory().addItem(item);
							p.setLevel(plevel - twoCost);
							anvil.clear();
							p.setItemOnCursor(clear);
							p.closeInventory();
							p.sendMessage(sendmsg.replace("{enchant}", usedvanish2.replace("&e", "")));
						}
					} else if (m == diamondb || m == ironb || m == chainb || m == leatherb) {
						if (app.getStringList("Vanish").contains("Boots")) {
							oldlore.remove(vanishE2);
							oldlore.add(vanishE3);
							newmeta.setLore(oldlore);
							item.setItemMeta(newmeta);
							p.getInventory().addItem(item);
							p.setLevel(plevel - twoCost);
							anvil.clear();
							p.setItemOnCursor(clear);
							p.closeInventory();
							p.sendMessage(sendmsg.replace("{enchant}", usedvanish2.replace("&e", "")));
						}
					}
					return;
				} else if (oldlore.contains(vanishE)) {
					if (m == diamondh || m == ironh || m == chainh || m == leatherh) {
						if (app.getStringList("Vanish").contains("Helmet")) {
							oldlore.remove(vanishE);
							oldlore.add(vanishE2);
							newmeta.setLore(oldlore);
							item.setItemMeta(newmeta);
							p.getInventory().addItem(item);
							p.setLevel(plevel - twoCost);
							anvil.clear();
							p.setItemOnCursor(clear);
							p.closeInventory();
							p.sendMessage(sendmsg.replace("{enchant}", usedvanish2.replace("&e", "")));
						}
					} else if (m == diamondc || m == ironc || m == chainc || m == leatherc) {
						if (app.getStringList("Vanish").contains("Chestplate")) {
							oldlore.remove(vanishE);
							oldlore.add(vanishE2);
							newmeta.setLore(oldlore);
							item.setItemMeta(newmeta);
							p.getInventory().addItem(item);
							p.setLevel(plevel - twoCost);
							anvil.clear();
							p.setItemOnCursor(clear);
							p.closeInventory();
							p.sendMessage(sendmsg.replace("{enchant}", usedvanish2.replace("&e", "")));
						}
					} else if (m == diamondl || m == ironl || m == chainl || m == leatherl) {
						if (app.getStringList("Vanish").contains("Leggings")) {
							oldlore.remove(vanishE);
							oldlore.add(vanishE2);
							newmeta.setLore(oldlore);
							item.setItemMeta(newmeta);
							p.getInventory().addItem(item);
							p.setLevel(plevel - twoCost);
							anvil.clear();
							p.setItemOnCursor(clear);
							p.closeInventory();
							p.sendMessage(sendmsg.replace("{enchant}", usedvanish2.replace("&e", "")));
						}
					} else if (m == diamondb || m == ironb || m == chainb || m == leatherb) {
						if (app.getStringList("Vanish").contains("Boots")) {
							oldlore.remove(vanishE);
							oldlore.add(vanishE2);
							newmeta.setLore(oldlore);
							item.setItemMeta(newmeta);
							p.getInventory().addItem(item);
							p.setLevel(plevel - twoCost);
							anvil.clear();
							p.setItemOnCursor(clear);
							p.closeInventory();
							p.sendMessage(sendmsg.replace("{enchant}", usedvanish2.replace("&e", "")));
						}
					}
					return;
				} else if (oldlore.contains(vanishE3)) {
					return;
				}
			}
			if (enchants + loreLines >= enchantLimit) {
				p.sendMessage(toomanyenchantsmsg);
				return;
			}
			if (m == diamondh || m == ironh || m == chainh || m == leatherh) {
				if (app.getStringList("Vanish").contains("Helmet")) {
					if (!(oldmeta.hasLore())) {
						newmeta.setLore(Arrays.asList(vanishE2));
					} else if (oldmeta.hasLore()) {
						oldlore.add(vanishE2);
						newmeta.setLore(oldlore);
					}
					item.setItemMeta(newmeta);
					p.getInventory().addItem(item);
					p.setLevel(plevel - twoCost);
					anvil.clear();
					p.setItemOnCursor(clear);
					p.closeInventory();
					p.sendMessage(sendmsg.replace("{enchant}", usedvanish2.replace("&e", "")));
				}
			} else if (m == diamondc || m == ironc || m == chainc || m == leatherc) {
				if (app.getStringList("Vanish").contains("Chestplate")) {
					if (!(oldmeta.hasLore())) {
						newmeta.setLore(Arrays.asList(vanishE2));
					} else if (oldmeta.hasLore()) {
						oldlore.add(vanishE2);
						newmeta.setLore(oldlore);
					}
					item.setItemMeta(newmeta);
					p.getInventory().addItem(item);
					p.setLevel(plevel - twoCost);
					anvil.clear();
					p.setItemOnCursor(clear);
					p.closeInventory();
					p.sendMessage(sendmsg.replace("{enchant}", usedvanish2.replace("&e", "")));
				}
			} else if (m == diamondl || m == ironl || m == chainl || m == leatherl) {
				if (app.getStringList("Vanish").contains("Leggings")) {
					if (!(oldmeta.hasLore())) {
						newmeta.setLore(Arrays.asList(vanishE2));
					} else if (oldmeta.hasLore()) {
						oldlore.add(vanishE2);
						newmeta.setLore(oldlore);
					}
					item.setItemMeta(newmeta);
					p.getInventory().addItem(item);
					p.setLevel(plevel - twoCost);
					anvil.clear();
					p.setItemOnCursor(clear);
					p.closeInventory();
					p.sendMessage(sendmsg.replace("{enchant}", usedvanish2.replace("&e", "")));
				}
			} else if (m == diamondb || m == ironb || m == chainb || m == leatherb) {
				if (app.getStringList("Vanish").contains("Boots")) {
					if (!(oldmeta.hasLore())) {
						newmeta.setLore(Arrays.asList(vanishE2));
					} else if (oldmeta.hasLore()) {
						oldlore.add(vanishE2);
						newmeta.setLore(oldlore);
					}
					item.setItemMeta(newmeta);
					p.getInventory().addItem(item);
					p.setLevel(plevel - twoCost);
					anvil.clear();
					p.setItemOnCursor(clear);
					p.closeInventory();
					p.sendMessage(sendmsg.replace("{enchant}", usedvanish2.replace("&e", "")));
				}
			}
		} else if (lore.contains(wearyE2)) {
			if (oldmeta.hasLore()) {
				if (oldlore.contains(wearyE2)) {
					if (m == diamondh || m == ironh || m == chainh || m == leatherh) {
						if (app.getStringList("Weary").contains("Helmet")) {
							oldlore.remove(wearyE2);
							oldlore.add(wearyE3);
							newmeta.setLore(oldlore);
							item.setItemMeta(newmeta);
							p.getInventory().addItem(item);
							p.setLevel(plevel - twoCost);
							anvil.clear();
							p.setItemOnCursor(clear);
							p.closeInventory();
							p.sendMessage(sendmsg.replace("{enchant}", usedweary2.replace("&e", "")));
						}
					} else if (m == diamondc || m == ironc || m == chainc || m == leatherc) {
						if (app.getStringList("Weary").contains("Chestplate")) {
							oldlore.remove(wearyE2);
							oldlore.add(wearyE3);
							newmeta.setLore(oldlore);
							item.setItemMeta(newmeta);
							p.getInventory().addItem(item);
							p.setLevel(plevel - twoCost);
							anvil.clear();
							p.setItemOnCursor(clear);
							p.closeInventory();
							p.sendMessage(sendmsg.replace("{enchant}", usedweary2.replace("&e", "")));
						}
					} else if (m == diamondl || m == ironl || m == chainl || m == leatherl) {
						if (app.getStringList("Weary").contains("Leggings")) {
							oldlore.remove(wearyE2);
							oldlore.add(wearyE3);
							newmeta.setLore(oldlore);
							item.setItemMeta(newmeta);
							p.getInventory().addItem(item);
							p.setLevel(plevel - twoCost);
							anvil.clear();
							p.setItemOnCursor(clear);
							p.closeInventory();
							p.sendMessage(sendmsg.replace("{enchant}", usedweary2.replace("&e", "")));
						}
					} else if (m == diamondb || m == ironb || m == chainb || m == leatherb) {
						if (app.getStringList("Weary").contains("Boots")) {
							oldlore.remove(wearyE2);
							oldlore.add(wearyE3);
							newmeta.setLore(oldlore);
							item.setItemMeta(newmeta);
							p.getInventory().addItem(item);
							p.setLevel(plevel - twoCost);
							anvil.clear();
							p.setItemOnCursor(clear);
							p.closeInventory();
							p.sendMessage(sendmsg.replace("{enchant}", usedweary2.replace("&e", "")));
						}
					}
					return;
				} else if (oldlore.contains(wearyE)) {
					if (m == diamondh || m == ironh || m == chainh || m == leatherh) {
						if (app.getStringList("Weary").contains("Helmet")) {
							oldlore.remove(wearyE);
							oldlore.add(wearyE2);
							newmeta.setLore(oldlore);
							item.setItemMeta(newmeta);
							p.getInventory().addItem(item);
							p.setLevel(plevel - twoCost);
							anvil.clear();
							p.setItemOnCursor(clear);
							p.closeInventory();
							p.sendMessage(sendmsg.replace("{enchant}", usedweary2.replace("&e", "")));
						}
					} else if (m == diamondc || m == ironc || m == chainc || m == leatherc) {
						if (app.getStringList("Weary").contains("Chestplate")) {
							oldlore.remove(wearyE);
							oldlore.add(wearyE2);
							newmeta.setLore(oldlore);
							item.setItemMeta(newmeta);
							p.getInventory().addItem(item);
							p.setLevel(plevel - twoCost);
							anvil.clear();
							p.setItemOnCursor(clear);
							p.closeInventory();
							p.sendMessage(sendmsg.replace("{enchant}", usedweary2.replace("&e", "")));
						}
					} else if (m == diamondl || m == ironl || m == chainl || m == leatherl) {
						if (app.getStringList("Weary").contains("Leggings")) {
							oldlore.remove(wearyE);
							oldlore.add(wearyE2);
							newmeta.setLore(oldlore);
							item.setItemMeta(newmeta);
							p.getInventory().addItem(item);
							p.setLevel(plevel - twoCost);
							anvil.clear();
							p.setItemOnCursor(clear);
							p.closeInventory();
							p.sendMessage(sendmsg.replace("{enchant}", usedweary2.replace("&e", "")));
						}
					} else if (m == diamondb || m == ironb || m == chainb || m == leatherb) {
						if (app.getStringList("Weary").contains("Boots")) {
							oldlore.remove(wearyE);
							oldlore.add(wearyE2);
							newmeta.setLore(oldlore);
							item.setItemMeta(newmeta);
							p.getInventory().addItem(item);
							p.setLevel(plevel - twoCost);
							anvil.clear();
							p.setItemOnCursor(clear);
							p.closeInventory();
							p.sendMessage(sendmsg.replace("{enchant}", usedweary2.replace("&e", "")));
						}
					}
					return;
				} else if (oldlore.contains(wearyE3)) {
					return;
				}
			}
			if (enchants + loreLines >= enchantLimit) {
				p.sendMessage(toomanyenchantsmsg);
				return;
			}
			if (m == diamondh || m == ironh || m == chainh || m == leatherh) {
				if (app.getStringList("Weary").contains("Helmet")) {
					if (!(oldmeta.hasLore())) {
						newmeta.setLore(Arrays.asList(wearyE2));
					} else if (oldmeta.hasLore()) {
						oldlore.add(wearyE2);
						newmeta.setLore(oldlore);
					}
					item.setItemMeta(newmeta);
					p.getInventory().addItem(item);
					p.setLevel(plevel - twoCost);
					anvil.clear();
					p.setItemOnCursor(clear);
					p.closeInventory();
					p.sendMessage(sendmsg.replace("{enchant}", usedweary2.replace("&e", "")));
				}
			} else if (m == diamondc || m == ironc || m == chainc || m == leatherc) {
				if (app.getStringList("Weary").contains("Chestplate")) {
					if (!(oldmeta.hasLore())) {
						newmeta.setLore(Arrays.asList(wearyE2));
					} else if (oldmeta.hasLore()) {
						oldlore.add(wearyE2);
						newmeta.setLore(oldlore);
					}
					item.setItemMeta(newmeta);
					p.getInventory().addItem(item);
					p.setLevel(plevel - twoCost);
					anvil.clear();
					p.setItemOnCursor(clear);
					p.closeInventory();
					p.sendMessage(sendmsg.replace("{enchant}", usedweary2.replace("&e", "")));
				}
			} else if (m == diamondl || m == ironl || m == chainl || m == leatherl) {
				if (app.getStringList("Weary").contains("Leggings")) {
					if (!(oldmeta.hasLore())) {
						newmeta.setLore(Arrays.asList(wearyE2));
					} else if (oldmeta.hasLore()) {
						oldlore.add(wearyE2);
						newmeta.setLore(oldlore);
					}
					item.setItemMeta(newmeta);
					p.getInventory().addItem(item);
					p.setLevel(plevel - twoCost);
					anvil.clear();
					p.setItemOnCursor(clear);
					p.closeInventory();
					p.sendMessage(sendmsg.replace("{enchant}", usedweary2.replace("&e", "")));
				}
			} else if (m == diamondb || m == ironb || m == chainb || m == leatherb) {
				if (app.getStringList("Weary").contains("Boots")) {
					if (!(oldmeta.hasLore())) {
						newmeta.setLore(Arrays.asList(wearyE2));
					} else if (oldmeta.hasLore()) {
						oldlore.add(wearyE2);
						newmeta.setLore(oldlore);
					}
					item.setItemMeta(newmeta);
					p.getInventory().addItem(item);
					p.setLevel(plevel - twoCost);
					anvil.clear();
					p.setItemOnCursor(clear);
					p.closeInventory();
					p.sendMessage(sendmsg.replace("{enchant}", usedweary2.replace("&e", "")));
				}
			}
		} else if (lore.contains(archeryE2)) {
			if (oldmeta.hasLore()) {
				if (oldlore.contains(archeryE2)) {
					return;
				} else if (oldlore.contains(archeryE)) {
					if (m == Material.BOW) {
						oldlore.remove(archeryE);
						oldlore.add(archeryE2);
						newmeta.setLore(oldlore);
						item.setItemMeta(newmeta);
						p.getInventory().addItem(item);
						p.setLevel(plevel - twoCost);
						anvil.clear();
						p.setItemOnCursor(clear);
						p.closeInventory();
						p.sendMessage(sendmsg.replace("{enchant}", usedarchery2.replace("&e", "")));
						return;
					}
				}
			}
			if (m == Material.BOW) {
				if (!(oldmeta.hasLore())) {
					newmeta.setLore(Arrays.asList(archeryE2));
				} else if (oldmeta.hasLore()) {
					oldlore.add(archeryE2);
					newmeta.setLore(oldlore);
				}
				item.setItemMeta(newmeta);
				p.getInventory().addItem(item);
				p.setLevel(plevel - twoCost);
				anvil.clear();
				p.setItemOnCursor(clear);
				p.closeInventory();
				p.sendMessage(sendmsg.replace("{enchant}", usedarchery2.replace("&e", "")));
			}
		} else if (lore.contains(confusionE2)) {
			if (oldmeta.hasLore()) {
				if (oldlore.contains(confusionE2)) {
					return;
				} else if (oldlore.contains(confusionE)) {
					if (m == diamonds || m == irons || m == golds || m == stones || m == woods) {
						if (app.getStringList("Confusion").contains("Sword")) {
							oldlore.remove(confusionE);
							oldlore.add(confusionE2);
							newmeta.setLore(oldlore);
							item.setItemMeta(newmeta);
							p.getInventory().addItem(item);
							p.setLevel(plevel - twoCost);
							anvil.clear();
							p.setItemOnCursor(clear);
							p.closeInventory();
							p.sendMessage(sendmsg.replace("{enchant}", usedconfusion2.replace("&e", "")));
						}
					} else if (m == diamonda || m == irona || m == golda || m == stonea || m == wooda) {
						if (app.getStringList("Confusion").contains("Axe")) {
							oldlore.remove(confusionE);
							oldlore.add(confusionE2);
							newmeta.setLore(oldlore);
							item.setItemMeta(newmeta);
							p.getInventory().addItem(item);
							p.setLevel(plevel - twoCost);
							anvil.clear();
							p.setItemOnCursor(clear);
							p.closeInventory();
							p.sendMessage(sendmsg.replace("{enchant}", usedconfusion2.replace("&e", "")));
						}
					}
					return;
				}
			}
			if (enchants + loreLines >= enchantLimit) {
				p.sendMessage(toomanyenchantsmsg);
				return;
			}
			if (m == diamonds || m == irons || m == golds || m == stones || m == woods) {
				if (app.getStringList("Confusion").contains("Sword")) {
					if (!(oldmeta.hasLore())) {
						newmeta.setLore(Arrays.asList(confusionE2));
					} else if (oldmeta.hasLore()) {
						oldlore.add(confusionE2);
						newmeta.setLore(oldlore);
					}
					item.setItemMeta(newmeta);
					p.getInventory().addItem(item);
					p.setLevel(plevel - twoCost);
					anvil.clear();
					p.setItemOnCursor(clear);
					p.closeInventory();
					p.sendMessage(sendmsg.replace("{enchant}", usedconfusion2.replace("&e", "")));
				}
			} else if (m == diamonda || m == irona || m == golda || m == stonea || m == wooda) {
				if (app.getStringList("Confusion").contains("Axe")) {
					if (!(oldmeta.hasLore())) {
						newmeta.setLore(Arrays.asList(confusionE2));
					} else if (oldmeta.hasLore()) {
						oldlore.add(confusionE2);
						newmeta.setLore(oldlore);
					}
					item.setItemMeta(newmeta);
					p.getInventory().addItem(item);
					p.setLevel(plevel - twoCost);
					anvil.clear();
					p.setItemOnCursor(clear);
					p.closeInventory();
					p.sendMessage(sendmsg.replace("{enchant}", usedconfusion2.replace("&e", "")));
				}
			}
		} else if (lore.contains(lifeE2)) {
			if (oldmeta.hasLore()) {
				if (oldlore.contains(lifeE2)) {
					return;
				} else if (oldlore.contains(lifeE)) {
					if (m == diamonds || m == irons || m == golds || m == stones || m == woods) {
						if (app.getStringList("Life").contains("Sword")) {
							oldlore.remove(lifeE);
							oldlore.add(lifeE2);
							newmeta.setLore(oldlore);
							item.setItemMeta(newmeta);
							p.getInventory().addItem(item);
							p.setLevel(plevel - twoCost);
							anvil.clear();
							p.setItemOnCursor(clear);
							p.closeInventory();
							p.sendMessage(sendmsg.replace("{enchant}", usedlife2.replace("&e", "")));
						}
					} else if (m == diamonda || m == irona || m == golda || m == stonea || m == wooda) {
						if (app.getStringList("Life").contains("Axe")) {
							oldlore.remove(lifeE);
							oldlore.add(lifeE2);
							newmeta.setLore(oldlore);
							item.setItemMeta(newmeta);
							p.getInventory().addItem(item);
							p.setLevel(plevel - twoCost);
							anvil.clear();
							p.setItemOnCursor(clear);
							p.closeInventory();
							p.sendMessage(sendmsg.replace("{enchant}", usedlife2.replace("&e", "")));
						}
					}
					return;
				}
			}
			if (enchants + loreLines >= enchantLimit) {
				p.sendMessage(toomanyenchantsmsg);
				return;
			}
			if (m == diamonds || m == irons || m == golds || m == stones || m == woods) {
				if (app.getStringList("Life").contains("Sword")) {
					if (!(oldmeta.hasLore())) {
						newmeta.setLore(Arrays.asList(lifeE2));
					} else if (oldmeta.hasLore()) {
						oldlore.add(lifeE2);
						newmeta.setLore(oldlore);
					}
					item.setItemMeta(newmeta);
					p.getInventory().addItem(item);
					p.setLevel(plevel - twoCost);
					anvil.clear();
					p.setItemOnCursor(clear);
					p.closeInventory();
					p.sendMessage(sendmsg.replace("{enchant}", usedlife2.replace("&e", "")));
				}
			} else if (m == diamonda || m == irona || m == golda || m == stonea || m == wooda) {
				if (app.getStringList("Life").contains("Axe")) {
					if (!(oldmeta.hasLore())) {
						newmeta.setLore(Arrays.asList(lifeE2));
					} else if (oldmeta.hasLore()) {
						oldlore.add(lifeE2);
						newmeta.setLore(oldlore);
					}
					item.setItemMeta(newmeta);
					p.getInventory().addItem(item);
					p.setLevel(plevel - twoCost);
					anvil.clear();
					p.setItemOnCursor(clear);
					p.closeInventory();
					p.sendMessage(sendmsg.replace("{enchant}", usedlife2.replace("&e", "")));
				}
			}
		} else if (lore.contains(lightningE2)) {
			if (oldmeta.hasLore()) {
				if (oldlore.contains(lightningE2)) {
					if (m == Material.BOW) {
						oldlore.remove(lightningE2);
						oldlore.add(lightningE3);
						newmeta.setLore(oldlore);
						item.setItemMeta(newmeta);
						p.getInventory().addItem(item);
						p.setLevel(plevel - twoCost);
						anvil.clear();
						p.setItemOnCursor(clear);
						p.closeInventory();
						p.sendMessage(sendmsg.replace("{enchant}", usedlightning2.replace("&e", "")));
						return;
					}
				} else if (oldlore.contains(lightningE)) {
					if (m == Material.BOW) {
						oldlore.remove(lightningE);
						oldlore.add(lightningE2);
						newmeta.setLore(oldlore);
						item.setItemMeta(newmeta);
						p.getInventory().addItem(item);
						p.setLevel(plevel - twoCost);
						anvil.clear();
						p.setItemOnCursor(clear);
						p.closeInventory();
						p.sendMessage(sendmsg.replace("{enchant}", usedlightning2.replace("&e", "")));
						return;
					}
				} else if (oldlore.contains(lightningE3)) {
					return;
				}
			}
			if (enchants + loreLines >= enchantLimit) {
				p.sendMessage(toomanyenchantsmsg);
				return;
			}
			if (m == Material.BOW) {
				if (!(oldmeta.hasLore())) {
					newmeta.setLore(Arrays.asList(lightningE2));
				} else if (oldmeta.hasLore()) {
					oldlore.add(lightningE2);
					newmeta.setLore(oldlore);
				}
				item.setItemMeta(newmeta);
				p.getInventory().addItem(item);
				p.setLevel(plevel - twoCost);
				anvil.clear();
				p.setItemOnCursor(clear);
				p.closeInventory();
				p.sendMessage(sendmsg.replace("{enchant}", usedlightning2.replace("&e", "")));
			}
		} else if (lore.contains(lightsoutE2)) {
			if (oldmeta.hasLore()) {
				if (oldlore.contains(lightsoutE2)) {
					return;
				} else if (oldlore.contains(lightsoutE)) {
					if (m == diamonds || m == irons || m == golds || m == stones || m == woods) {
						if (app.getStringList("LightsOut").contains("Sword")) {
							oldlore.remove(lightsoutE);
							oldlore.add(lightsoutE2);
							newmeta.setLore(oldlore);
							item.setItemMeta(newmeta);
							p.getInventory().addItem(item);
							p.setLevel(plevel - twoCost);
							anvil.clear();
							p.setItemOnCursor(clear);
							p.closeInventory();
							p.sendMessage(sendmsg.replace("{enchant}", usedlightsout2.replace("&e", "")));
						}
					} else if (m == diamonda || m == irona || m == golda || m == stonea || m == wooda) {
						if (app.getStringList("LightsOut").contains("Axe")) {
							oldlore.remove(lightsoutE);
							oldlore.add(lightsoutE2);
							newmeta.setLore(oldlore);
							item.setItemMeta(newmeta);
							p.getInventory().addItem(item);
							p.setLevel(plevel - twoCost);
							anvil.clear();
							p.setItemOnCursor(clear);
							p.closeInventory();
							p.sendMessage(sendmsg.replace("{enchant}", usedlightsout2.replace("&e", "")));
						}
					}
					return;
				}
			}
			if (enchants + loreLines >= enchantLimit) {
				p.sendMessage(toomanyenchantsmsg);
				return;
			}
			if (m == diamonds || m == irons || m == golds || m == stones || m == woods) {
				if (app.getStringList("LightsOut").contains("Sword")) {
					if (!(oldmeta.hasLore())) {
						newmeta.setLore(Arrays.asList(lightsoutE2));
					} else if (oldmeta.hasLore()) {
						oldlore.add(lightsoutE2);
						newmeta.setLore(oldlore);
					}
					item.setItemMeta(newmeta);
					p.getInventory().addItem(item);
					p.setLevel(plevel - twoCost);
					anvil.clear();
					p.setItemOnCursor(clear);
					p.closeInventory();
					p.sendMessage(sendmsg.replace("{enchant}", usedlightsout2.replace("&e", "")));
				}
			} else if (m == diamonda || m == irona || m == golda || m == stonea || m == wooda) {
				if (app.getStringList("LightsOut").contains("Axe")) {
					if (!(oldmeta.hasLore())) {
						newmeta.setLore(Arrays.asList(lightsoutE2));
					} else if (oldmeta.hasLore()) {
						oldlore.add(lightsoutE2);
						newmeta.setLore(oldlore);
					}
					item.setItemMeta(newmeta);
					p.getInventory().addItem(item);
					p.setLevel(plevel - twoCost);
					anvil.clear();
					p.setItemOnCursor(clear);
					p.closeInventory();
					p.sendMessage(sendmsg.replace("{enchant}", usedlightsout2.replace("&e", "")));
				}
			}
		} else if (lore.contains(soulE2)) {
			if (oldmeta.hasLore()) {
				if (oldlore.contains(soulE2)) {
					return;
				} else if (oldlore.contains(soulE)) {
					if (m == diamonds || m == irons || m == golds || m == stones || m == woods) {
						if (app.getStringList("Soul").contains("Sword")) {
							oldlore.remove(soulE);
							oldlore.add(soulE2);
							newmeta.setLore(oldlore);
							item.setItemMeta(newmeta);
							p.getInventory().addItem(item);
							p.setLevel(plevel - twoCost);
							anvil.clear();
							p.setItemOnCursor(clear);
							p.closeInventory();
							p.sendMessage(sendmsg.replace("{enchant}", usedsoul2.replace("&e", "")));
						}
					} else if (m == diamonda || m == irona || m == golda || m == stonea || m == wooda) {
						if (app.getStringList("Soul").contains("Axe")) {
							oldlore.remove(soulE);
							oldlore.add(soulE2);
							newmeta.setLore(oldlore);
							item.setItemMeta(newmeta);
							p.getInventory().addItem(item);
							p.setLevel(plevel - twoCost);
							anvil.clear();
							p.setItemOnCursor(clear);
							p.closeInventory();
							p.sendMessage(sendmsg.replace("{enchant}", usedsoul2.replace("&e", "")));
						}
					}
					return;
				}
			}
			if (enchants + loreLines >= enchantLimit) {
				p.sendMessage(toomanyenchantsmsg);
				return;
			}
			if (m == diamonds || m == irons || m == golds || m == stones || m == woods) {
				if (app.getStringList("Soul").contains("Sword")) {
					if (!(oldmeta.hasLore())) {
						newmeta.setLore(Arrays.asList(soulE2));
					} else if (oldmeta.hasLore()) {
						oldlore.add(soulE2);
						newmeta.setLore(oldlore);
					}
					item.setItemMeta(newmeta);
					p.getInventory().addItem(item);
					p.setLevel(plevel - twoCost);
					anvil.clear();
					p.setItemOnCursor(clear);
					p.closeInventory();
					p.sendMessage(sendmsg.replace("{enchant}", usedsoul2.replace("&e", "")));
				}
			} else if (m == diamonda || m == irona || m == golda || m == stonea || m == wooda) {
				if (app.getStringList("Soul").contains("Axe")) {
					if (!(oldmeta.hasLore())) {
						newmeta.setLore(Arrays.asList(soulE2));
					} else if (oldmeta.hasLore()) {
						oldlore.add(soulE2);
						newmeta.setLore(oldlore);
					}
					item.setItemMeta(newmeta);
					p.getInventory().addItem(item);
					p.setLevel(plevel - twoCost);
					anvil.clear();
					p.setItemOnCursor(clear);
					p.closeInventory();
					p.sendMessage(sendmsg.replace("{enchant}", usedsoul2.replace("&e", "")));
				}
			}
		} else if (lore.contains(thunderousE2)) {
			if (oldmeta.hasLore()) {
				if (oldlore.contains(thunderousE2)) {
					if (m == diamonds || m == irons || m == golds || m == stones || m == woods) {
						if (app.getStringList("Thunderous").contains("Sword")) {
							oldlore.remove(thunderousE2);
							oldlore.add(thunderousE3);
							newmeta.setLore(oldlore);
							item.setItemMeta(newmeta);
							p.getInventory().addItem(item);
							p.setLevel(plevel - twoCost);
							anvil.clear();
							p.setItemOnCursor(clear);
							p.closeInventory();
							p.sendMessage(sendmsg.replace("{enchant}", usedthunderous2.replace("&e", "")));
						}
					} else if (m == diamonda || m == irona || m == golda || m == stonea || m == wooda) {
						if (app.getStringList("Thunderous").contains("Axe")) {
							oldlore.remove(thunderousE2);
							oldlore.add(thunderousE3);
							newmeta.setLore(oldlore);
							item.setItemMeta(newmeta);
							p.getInventory().addItem(item);
							p.setLevel(plevel - twoCost);
							anvil.clear();
							p.setItemOnCursor(clear);
							p.closeInventory();
							p.sendMessage(sendmsg.replace("{enchant}", usedthunderous2.replace("&e", "")));
						}
					}
					return;
				} else if (oldlore.contains(thunderousE)) {
					if (m == diamonds || m == irons || m == golds || m == stones || m == woods) {
						if (app.getStringList("Thunderous").contains("Sword")) {
							oldlore.remove(thunderousE);
							oldlore.add(thunderousE2);
							newmeta.setLore(oldlore);
							item.setItemMeta(newmeta);
							p.getInventory().addItem(item);
							p.setLevel(plevel - twoCost);
							anvil.clear();
							p.setItemOnCursor(clear);
							p.closeInventory();
							p.sendMessage(sendmsg.replace("{enchant}", usedthunderous2.replace("&e", "")));
						}
					} else if (m == diamonda || m == irona || m == golda || m == stonea || m == wooda) {
						if (app.getStringList("Thunderous").contains("Axe")) {
							oldlore.remove(thunderousE);
							oldlore.add(thunderousE2);
							newmeta.setLore(oldlore);
							item.setItemMeta(newmeta);
							p.getInventory().addItem(item);
							p.setLevel(plevel - twoCost);
							anvil.clear();
							p.setItemOnCursor(clear);
							p.closeInventory();
							p.sendMessage(sendmsg.replace("{enchant}", usedthunderous2.replace("&e", "")));
						}
					}
					return;
				} else if (oldlore.contains(thunderousE3)){
					return;
				}
			}
			if (enchants + loreLines >= enchantLimit) {
				p.sendMessage(toomanyenchantsmsg);
				return;
			}
			if (m == diamonds || m == irons || m == golds || m == stones || m == woods) {
				if (app.getStringList("Thunderous").contains("Sword")) {
					if (!(oldmeta.hasLore())) {
						newmeta.setLore(Arrays.asList(thunderousE2));
					} else if (oldmeta.hasLore()) {
						oldlore.add(thunderousE2);
						newmeta.setLore(oldlore);
					}
					item.setItemMeta(newmeta);
					p.getInventory().addItem(item);
					p.setLevel(plevel - twoCost);
					anvil.clear();
					p.setItemOnCursor(clear);
					p.closeInventory();
					p.sendMessage(sendmsg.replace("{enchant}", usedthunderous2.replace("&e", "")));
				}
			} else if (m == diamonda || m == irona || m == golda || m == stonea || m == wooda) {
				if (app.getStringList("Thunderous").contains("Axe")) {
					if (!(oldmeta.hasLore())) {
						newmeta.setLore(Arrays.asList(thunderousE2));
					} else if (oldmeta.hasLore()) {
						oldlore.add(thunderousE2);
						newmeta.setLore(oldlore);
					}
					item.setItemMeta(newmeta);
					p.getInventory().addItem(item);
					p.setLevel(plevel - twoCost);
					anvil.clear();
					p.setItemOnCursor(clear);
					p.closeInventory();
					p.sendMessage(sendmsg.replace("{enchant}", usedthunderous2.replace("&e", "")));
				}
			}
		} else if (lore.contains(blastE2)) {
			if (oldmeta.hasLore()) {
				if (oldlore.contains(blastE2)) {
					return;
				} else if (oldlore.contains(blastE)) {
					if (m == diamondp || m == ironp || m == goldp || m == stonep || m == woodp) {
						oldlore.remove(blastE);
						oldlore.add(blastE2);
						newmeta.setLore(oldlore);
						item.setItemMeta(newmeta);
						p.getInventory().addItem(item);
						p.setLevel(plevel - twoCost);
						anvil.clear();
						p.setItemOnCursor(clear);
						p.closeInventory();
						p.sendMessage(sendmsg.replace("{enchant}", usedblast2.replace("&e", "")));
						return;
					}
				}
			}
			if (m == diamondp || m == ironp || m == goldp || m == stonep || m == woodp) {
				if (!(oldmeta.hasLore())) {
					newmeta.setLore(Arrays.asList(blastE2));
				} else if (oldmeta.hasLore()) {
					oldlore.add(blastE2);
					newmeta.setLore(oldlore);
				}
				item.setItemMeta(newmeta);
				p.getInventory().addItem(item);
				p.setLevel(plevel - twoCost);
				anvil.clear();
				p.setItemOnCursor(clear);
				p.closeInventory();
				p.sendMessage(sendmsg.replace("{enchant}", usedblast2.replace("&e", "")));
			}
		} else if (lore.contains(hasteE2)) {
			if (oldmeta.hasLore()) {
				if (oldlore.contains(hasteE2)) {
					if (m == diamondp || m == ironp || m == goldp || m == stonep || m == woodp) {
						if (app.getStringList("Haste").contains("Pickaxe")) {
							oldlore.remove(hasteE2);
							oldlore.add(hasteE3);
							newmeta.setLore(oldlore);
							item.setItemMeta(newmeta);
							p.getInventory().addItem(item);
							p.setLevel(plevel - twoCost);
							anvil.clear();
							p.setItemOnCursor(clear);
							p.closeInventory();
							p.sendMessage(sendmsg.replace("{enchant}", usedhaste2.replace("&e", "")));
						}
					} else if (m == diamondsh || m == ironsh || m == goldsh || m == stonesh
							|| m == woodsh) {
						if (app.getStringList("Haste").contains("Shovel")) {
							oldlore.remove(hasteE2);
							oldlore.add(hasteE3);
							newmeta.setLore(oldlore);
							item.setItemMeta(newmeta);
							p.getInventory().addItem(item);
							p.setLevel(plevel - twoCost);
							anvil.clear();
							p.setItemOnCursor(clear);
							p.closeInventory();
							p.sendMessage(sendmsg.replace("{enchant}", usedhaste2.replace("&e", "")));
						}
					}
					return;
				} else if (oldlore.contains(hasteE)) {
					if (m == diamondp || m == ironp || m == goldp || m == stonep || m == woodp) {
						if (app.getStringList("Haste").contains("Pickaxe")) {
							oldlore.remove(hasteE);
							oldlore.add(hasteE2);
							newmeta.setLore(oldlore);
							item.setItemMeta(newmeta);
							p.getInventory().addItem(item);
							p.setLevel(plevel - twoCost);
							anvil.clear();
							p.setItemOnCursor(clear);
							p.closeInventory();
							p.sendMessage(sendmsg.replace("{enchant}", usedhaste2.replace("&e", "")));
						}
					} else if (m == diamondsh || m == ironsh || m == goldsh || m == stonesh
							|| m == woodsh) {
						if (app.getStringList("Haste").contains("Shovel")) {
							oldlore.remove(hasteE);
							oldlore.add(hasteE2);
							newmeta.setLore(oldlore);
							item.setItemMeta(newmeta);
							p.getInventory().addItem(item);
							p.setLevel(plevel - twoCost);
							anvil.clear();
							p.setItemOnCursor(clear);
							p.closeInventory();
							p.sendMessage(sendmsg.replace("{enchant}", usedhaste2.replace("&e", "")));
						}
					}
					return;
				} else if (oldlore.contains(hasteE3)) {
					return;
				}
			}
			if (enchants + loreLines >= enchantLimit) {
				p.sendMessage(toomanyenchantsmsg);
				return;
			}
			if (m == diamondp || m == ironp || m == goldp || m == stonep || m == woodp) {
				if (app.getStringList("Haste").contains("Pickaxe")) {
					if (!(oldmeta.hasLore())) {
						newmeta.setLore(Arrays.asList(hasteE2));
					} else if (oldmeta.hasLore()) {
						oldlore.add(hasteE2);
						newmeta.setLore(oldlore);
					}
					item.setItemMeta(newmeta);
					p.getInventory().addItem(item);
					p.setLevel(plevel - twoCost);
					anvil.clear();
					p.setItemOnCursor(clear);
					p.closeInventory();
					p.sendMessage(sendmsg.replace("{enchant}", usedhaste2.replace("&e", "")));
				}
			} else if (m == diamondsh || m == ironsh || m == goldsh || m == stonesh
					|| m == woodsh) {
				if (app.getStringList("Haste").contains("Shovel")) {
					if (!(oldmeta.hasLore())) {
						newmeta.setLore(Arrays.asList(hasteE2));
					} else if (oldmeta.hasLore()) {
						oldlore.add(hasteE2);
						newmeta.setLore(oldlore);
					}
					item.setItemMeta(newmeta);
					p.getInventory().addItem(item);
					p.setLevel(plevel - twoCost);
					anvil.clear();
					p.setItemOnCursor(clear);
					p.closeInventory();
					p.sendMessage(sendmsg.replace("{enchant}", usedhaste2.replace("&e", "")));
				}
			}
		} else if (lore.contains(experienceE2)) {
			if (oldmeta.hasLore()) {
				if (oldlore.contains(experienceE2)) {
					if (m == diamondp || m == ironp || m == goldp || m == stonep || m == woodp) {
						oldlore.remove(experienceE2);
						oldlore.add(experienceE3);
						newmeta.setLore(oldlore);
						item.setItemMeta(newmeta);
						p.getInventory().addItem(item);
						p.setLevel(plevel - twoCost);
						anvil.clear();
						p.setItemOnCursor(clear);
						p.closeInventory();
						p.sendMessage(sendmsg.replace("{enchant}", usedexperience2.replace("&e", "")));
						return;
					}
				} else if (oldlore.contains(experienceE)) {
					if (m == diamondp || m == ironp || m == goldp || m == stonep || m == woodp) {
						oldlore.remove(experienceE);
						oldlore.add(experienceE2);
						newmeta.setLore(oldlore);
						item.setItemMeta(newmeta);
						p.getInventory().addItem(item);
						p.setLevel(plevel - twoCost);
						anvil.clear();
						p.setItemOnCursor(clear);
						p.closeInventory();
						p.sendMessage(sendmsg.replace("{enchant}", usedexperience2.replace("&e", "")));
						return;
					}
				} else if (oldlore.contains(experienceE3)) {
					return;
				}
			}
			if (enchants + loreLines >= enchantLimit) {
				p.sendMessage(toomanyenchantsmsg);
				return;
			}
			if (m == diamondp || m == ironp || m == goldp || m == stonep || m == woodp) {
				if (!(oldmeta.hasLore())) {
					newmeta.setLore(Arrays.asList(experienceE2));
				} else if (oldmeta.hasLore()) {
					oldlore.add(experienceE2);
					newmeta.setLore(oldlore);
				}
				item.setItemMeta(newmeta);
				p.getInventory().addItem(item);
				p.setLevel(plevel - twoCost);
				anvil.clear();
				p.setItemOnCursor(clear);
				p.closeInventory();
				p.sendMessage(sendmsg.replace("{enchant}", usedexperience2.replace("&e", "")));
			}
		} else if (lore.contains(obsidiandestroyerE2)) {
			if (oldmeta.hasLore()) {
				if (oldlore.contains(obsidiandestroyerE2)) {
					if (m == diamondp || m == ironp || m == goldp || m == stonep || m == woodp) {
						oldlore.remove(obsidiandestroyerE2);
						oldlore.add(obsidiandestroyerE3);
						newmeta.setLore(oldlore);
						item.setItemMeta(newmeta);
						p.getInventory().addItem(item);
						p.setLevel(plevel - twoCost);
						anvil.clear();
						p.setItemOnCursor(clear);
						p.closeInventory();
						p.sendMessage(sendmsg.replace("{enchant}", usedobsidiandestroyer2.replace("&e", "")));
						return;
					}
				} else if (oldlore.contains(obsidiandestroyerE)) {
					if (m == diamondp || m == ironp || m == goldp || m == stonep || m == woodp) {
						oldlore.remove(obsidiandestroyerE);
						oldlore.add(obsidiandestroyerE2);
						newmeta.setLore(oldlore);
						item.setItemMeta(newmeta);
						p.getInventory().addItem(item);
						p.setLevel(plevel - twoCost);
						anvil.clear();
						p.setItemOnCursor(clear);
						p.closeInventory();
						p.sendMessage(sendmsg.replace("{enchant}", usedobsidiandestroyer2.replace("&e", "")));
						return;
					}
				} else if (oldlore.contains(obsidiandestroyerE3)) {
					return;
				}
			}
			if (enchants + loreLines >= enchantLimit) {
				p.sendMessage(toomanyenchantsmsg);
				return;
			}
			if (m == diamondp || m == ironp || m == goldp || m == stonep || m == woodp) {
				if (!(oldmeta.hasLore())) {
					newmeta.setLore(Arrays.asList(obsidiandestroyerE2));
				} else if (oldmeta.hasLore()) {
					oldlore.add(obsidiandestroyerE2);
					newmeta.setLore(oldlore);
				}
				item.setItemMeta(newmeta);
				p.getInventory().addItem(item);
				p.setLevel(plevel - twoCost);
				anvil.clear();
				p.setItemOnCursor(clear);
				p.closeInventory();
				p.sendMessage(sendmsg.replace("{enchant}", usedobsidiandestroyer2.replace("&e", "")));
			}
		} else if (lore.contains(thiefE2)) {
			if (oldmeta.hasLore()) {
				if (oldlore.contains(thiefE2)) {
					if (m == Material.BOW) {
						oldlore.remove(thiefE2);
						oldlore.add(thiefE3);
						newmeta.setLore(oldlore);
						item.setItemMeta(newmeta);
						p.getInventory().addItem(item);
						p.setLevel(plevel - twoCost);
						anvil.clear();
						p.setItemOnCursor(clear);
						p.closeInventory();
						p.sendMessage(sendmsg.replace("{enchant}", usedthief2.replace("&e", "")));
						return;
					}
				} else if (oldlore.contains(thiefE)) {
					if (m == Material.BOW) {
						oldlore.remove(thiefE);
						oldlore.add(thiefE2);
						newmeta.setLore(oldlore);
						item.setItemMeta(newmeta);
						p.getInventory().addItem(item);
						p.setLevel(plevel - twoCost);
						anvil.clear();
						p.setItemOnCursor(clear);
						p.closeInventory();
						p.sendMessage(sendmsg.replace("{enchant}", usedthief2.replace("&e", "")));
						return;
					}
				} else if (oldlore.contains(thiefE3)) {
					return;
				}
			}
			if (enchants + loreLines >= enchantLimit) {
				p.sendMessage(toomanyenchantsmsg);
				return;
			}
			if (m == Material.BOW) {
				if (!(oldmeta.hasLore())) {
					newmeta.setLore(Arrays.asList(thiefE2));
				} else if (oldmeta.hasLore()) {
					oldlore.add(thiefE2);
					newmeta.setLore(oldlore);
				}
				item.setItemMeta(newmeta);
				p.getInventory().addItem(item);
				p.setLevel(plevel - twoCost);
				anvil.clear();
				p.setItemOnCursor(clear);
				p.closeInventory();
				p.sendMessage(sendmsg.replace("{enchant}", usedthief2.replace("&e", "")));
			}
		} else if (lore.contains(toughnessE2)) {
			if (oldmeta.hasLore()) {
				if (oldlore.contains(toughnessE2)) {
					if (m == diamondh || m == ironh || m == chainh || m == leatherh) {
						if (app.getStringList("Toughness").contains("Helmet")) {
							oldlore.remove(toughnessE2);
							oldlore.add(toughnessE3);
							newmeta.setLore(oldlore);
							item.setItemMeta(newmeta);
							p.getInventory().addItem(item);
							p.setLevel(plevel - twoCost);
							anvil.clear();
							p.setItemOnCursor(clear);
							p.closeInventory();
							p.sendMessage(sendmsg.replace("{enchant}", usedtoughness2.replace("&e", "")));
						}
					} else if (m == diamondc || m == ironc || m == chainc || m == leatherc) {
						if (app.getStringList("Toughness").contains("Chestplate")) {
							oldlore.remove(toughnessE2);
							oldlore.add(toughnessE3);
							newmeta.setLore(oldlore);
							item.setItemMeta(newmeta);
							p.getInventory().addItem(item);
							p.setLevel(plevel - twoCost);
							anvil.clear();
							p.setItemOnCursor(clear);
							p.closeInventory();
							p.sendMessage(sendmsg.replace("{enchant}", usedtoughness2.replace("&e", "")));
						}
					} else if (m == diamondl || m == ironl || m == chainl || m == leatherl) {
						if (app.getStringList("Toughness").contains("Leggings")) {
							oldlore.remove(toughnessE2);
							oldlore.add(toughnessE3);
							newmeta.setLore(oldlore);
							item.setItemMeta(newmeta);
							p.getInventory().addItem(item);
							p.setLevel(plevel - twoCost);
							anvil.clear();
							p.setItemOnCursor(clear);
							p.closeInventory();
							p.sendMessage(sendmsg.replace("{enchant}", usedtoughness2.replace("&e", "")));
						}
					} else if (m == diamondb || m == ironb || m == chainb || m == leatherb) {
						if (app.getStringList("Toughness").contains("Boots")) {
							oldlore.remove(toughnessE2);
							oldlore.add(toughnessE3);
							newmeta.setLore(oldlore);
							item.setItemMeta(newmeta);
							p.getInventory().addItem(item);
							p.setLevel(plevel - twoCost);
							anvil.clear();
							p.setItemOnCursor(clear);
							p.closeInventory();
							p.sendMessage(sendmsg.replace("{enchant}", usedtoughness2.replace("&e", "")));
						}
					}
					return;
				} else if (oldlore.contains(toughnessE)){
					if (m == diamondh || m == ironh || m == chainh || m == leatherh) {
						if (app.getStringList("Toughness").contains("Helmet")) {
							oldlore.remove(toughnessE);
							oldlore.add(toughnessE2);
							newmeta.setLore(oldlore);
							item.setItemMeta(newmeta);
							p.getInventory().addItem(item);
							p.setLevel(plevel - twoCost);
							anvil.clear();
							p.setItemOnCursor(clear);
							p.closeInventory();
							p.sendMessage(sendmsg.replace("{enchant}", usedtoughness2.replace("&e", "")));
						}
					} else if (m == diamondc || m == ironc || m == chainc || m == leatherc) {
						if (app.getStringList("Toughness").contains("Chestplate")) {
							oldlore.remove(toughnessE);
							oldlore.add(toughnessE2);
							newmeta.setLore(oldlore);
							item.setItemMeta(newmeta);
							p.getInventory().addItem(item);
							p.setLevel(plevel - twoCost);
							anvil.clear();
							p.setItemOnCursor(clear);
							p.closeInventory();
							p.sendMessage(sendmsg.replace("{enchant}", usedtoughness2.replace("&e", "")));
						}
					} else if (m == diamondl || m == ironl || m == chainl || m == leatherl) {
						if (app.getStringList("Toughness").contains("Leggings")) {
							oldlore.remove(toughnessE);
							oldlore.add(toughnessE2);
							newmeta.setLore(oldlore);
							item.setItemMeta(newmeta);
							p.getInventory().addItem(item);
							p.setLevel(plevel - twoCost);
							anvil.clear();
							p.setItemOnCursor(clear);
							p.closeInventory();
							p.sendMessage(sendmsg.replace("{enchant}", usedtoughness2.replace("&e", "")));
						}
					} else if (m == diamondb || m == ironb || m == chainb || m == leatherb) {
						if (app.getStringList("Toughness").contains("Boots")) {
							oldlore.remove(toughnessE);
							oldlore.add(toughnessE2);
							newmeta.setLore(oldlore);
							item.setItemMeta(newmeta);
							p.getInventory().addItem(item);
							p.setLevel(plevel - twoCost);
							anvil.clear();
							p.setItemOnCursor(clear);
							p.closeInventory();
							p.sendMessage(sendmsg.replace("{enchant}", usedtoughness2.replace("&e", "")));
						}
					}
					return;
				} else if (oldlore.contains(toughnessE3)) {
					return;
				}
			}
			if (enchants + loreLines >= enchantLimit) {
				p.sendMessage(toomanyenchantsmsg);
				return;
			}
			if (m == diamondh || m == ironh || m == chainh || m == leatherh) {
				if (app.getStringList("Toughness").contains("Helmet")) {
					if (!(oldmeta.hasLore())) {
						newmeta.setLore(Arrays.asList(toughnessE2));
					} else if (oldmeta.hasLore()) {
						oldlore.add(toughnessE2);
						newmeta.setLore(oldlore);
					}
					item.setItemMeta(newmeta);
					p.getInventory().addItem(item);
					p.setLevel(plevel - twoCost);
					anvil.clear();
					p.setItemOnCursor(clear);
					p.closeInventory();
					p.sendMessage(sendmsg.replace("{enchant}", usedtoughness2.replace("&e", "")));
				}
			} else if (m == diamondc || m == ironc || m == chainc || m == leatherc) {
				if (app.getStringList("Toughness").contains("Chestplate")) {
					if (!(oldmeta.hasLore())) {
						newmeta.setLore(Arrays.asList(toughnessE2));
					} else if (oldmeta.hasLore()) {
						oldlore.add(toughnessE2);
						newmeta.setLore(oldlore);
					}
					item.setItemMeta(newmeta);
					p.getInventory().addItem(item);
					p.setLevel(plevel - twoCost);
					anvil.clear();
					p.setItemOnCursor(clear);
					p.closeInventory();
					p.sendMessage(sendmsg.replace("{enchant}", usedtoughness2.replace("&e", "")));
				}
			} else if (m == diamondl || m == ironl || m == chainl || m == leatherl) {
				if (app.getStringList("Toughness").contains("Leggings")) {
					if (!(oldmeta.hasLore())) {
						newmeta.setLore(Arrays.asList(toughnessE2));
					} else if (oldmeta.hasLore()) {
						oldlore.add(toughnessE2);
						newmeta.setLore(oldlore);
					}
					item.setItemMeta(newmeta);
					p.getInventory().addItem(item);
					p.setLevel(plevel - twoCost);
					anvil.clear();
					p.setItemOnCursor(clear);
					p.closeInventory();
					p.sendMessage(sendmsg.replace("{enchant}", usedtoughness2.replace("&e", "")));
				}
			} else if (m == diamondb || m == ironb || m == chainb || m == leatherb) {
				if (app.getStringList("Toughness").contains("Boots")) {
					if (!(oldmeta.hasLore())) {
						newmeta.setLore(Arrays.asList(toughnessE2));
					} else if (oldmeta.hasLore()) {
						oldlore.add(toughnessE2);
						newmeta.setLore(oldlore);
					}
					item.setItemMeta(newmeta);
					p.getInventory().addItem(item);
					p.setLevel(plevel - twoCost);
					anvil.clear();
					p.setItemOnCursor(clear);
					p.closeInventory();
					p.sendMessage(sendmsg.replace("{enchant}", usedtoughness2.replace("&e", "")));
				}
			}
		}
	}
}
