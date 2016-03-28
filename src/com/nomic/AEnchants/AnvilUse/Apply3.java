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

public class Apply3 implements Listener {
	
	private Main plugin;

	public Apply3(Main pl) {
		plugin = pl;
	}
	
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

		String usedlightning = names.getConfigurationSection("Lightning").getString("one");
		String lightningE = ChatColor.translateAlternateColorCodes('&', usedlightning);
		String usedlightning2 = names.getConfigurationSection("Lightning").getString("two");
		String lightningE2 = ChatColor.translateAlternateColorCodes('&', usedlightning2);
		String usedlightning3 = names.getConfigurationSection("Lightning").getString("three");
		String lightningE3 = ChatColor.translateAlternateColorCodes('&', usedlightning3);

		String usedthunderous = names.getConfigurationSection("Thunderous").getString("one");
		String thunderousE = ChatColor.translateAlternateColorCodes('&', usedthunderous);
		String usedthunderous2 = names.getConfigurationSection("Thunderous").getString("two");
		String thunderousE2 = ChatColor.translateAlternateColorCodes('&', usedthunderous2);
		String usedthunderous3 = names.getConfigurationSection("Thunderous").getString("three");
		String thunderousE3 = ChatColor.translateAlternateColorCodes('&', usedthunderous3);

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
		ConfigurationSection app = plugin.getConfig().getConfigurationSection("appliablePieces");
		String toomanyenchants = plugin.getConfig().getString("tooManyEnchantsMessage");
		String toomanyenchantsmsg = ChatColor.translateAlternateColorCodes('&', toomanyenchants);
		int enchantLimit = plugin.getConfig().getInt("enchantLimit");
		String msg = plugin.getConfig().getString("addEnchantMessage");
		String sendmsg = ChatColor.translateAlternateColorCodes('&', msg);
		List<String> lore = e.getItemLore();
		AnvilInventory anvil = e.getAnvil();
		ItemStack clear = e.getClearItem();
		int threeCost = e.getCost();
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
		if (lore.contains(beastE3)) {
			if (oldmeta.hasLore()) {
				if (oldlore.contains(beastE3)) {
					return;
				} else if (oldlore.contains(beastE2)) {
					if (m == diamondh || m == ironh || m == chainh || m == leatherh || m == diamondc
							|| m == ironc || m == chainc || m == leatherc || m == diamondl || m == ironl
							|| m == chainl || m == leatherl || m == diamondb || m == ironb || m == chainb
							|| m == leatherb) {
						oldlore.remove(beastE2);
						oldlore.add(beastE3);
						newmeta.setLore(oldlore);
						item.setItemMeta(newmeta);
						p.getInventory().addItem(item);
						p.setLevel(plevel - threeCost);
						anvil.clear();
						p.setItemOnCursor(clear);
						p.closeInventory();
						if (!(sendmsg.equals("none")))
						p.sendMessage(sendmsg.replace("{enchant}", usedbeast3.replace("&c", "")));
						return;
					}
				} else if (oldlore.contains(beastE)) {
					if (m == diamondh || m == ironh || m == chainh || m == leatherh || m == diamondc
							|| m == ironc || m == chainc || m == leatherc || m == diamondl || m == ironl
							|| m == chainl || m == leatherl || m == diamondb || m == ironb || m == chainb
							|| m == leatherb) {
						oldlore.remove(beastE);
						oldlore.add(beastE3);
						newmeta.setLore(oldlore);
						item.setItemMeta(newmeta);
						p.getInventory().addItem(item);
						p.setLevel(plevel - threeCost);
						anvil.clear();
						p.setItemOnCursor(clear);
						p.closeInventory();
						if (!(sendmsg.equals("none")))
						p.sendMessage(sendmsg.replace("{enchant}", usedbeast3.replace("&c", "")));
						return;
					}
				}
			}
			if (enchants + loreLines >= enchantLimit) {
				if (!(toomanyenchantsmsg.equals("none")))
				p.sendMessage(toomanyenchantsmsg);
				return;
			}
			if (m == diamondh || m == ironh || m == chainh || m == leatherh || m == diamondc
					|| m == ironc || m == chainc || m == leatherc || m == diamondl || m == ironl
					|| m == chainl || m == leatherl || m == diamondb || m == ironb || m == chainb
					|| m == leatherb) {
				if (!(oldmeta.hasLore())) {
					newmeta.setLore(Arrays.asList(beastE3));
				} else if (oldmeta.hasLore()) {
					oldlore.add(beastE3);
					newmeta.setLore(oldlore);
				}
				item.setItemMeta(newmeta);
				p.getInventory().addItem(item);
				p.setLevel(plevel - threeCost);
				anvil.clear();
				p.setItemOnCursor(clear);
				p.closeInventory();
				if (!(sendmsg.equals("none")))
				p.sendMessage(sendmsg.replace("{enchant}", usedbeast3.replace("&c", "")));
			}
		} else if (lore.contains(bumpE3)) {
			if (oldmeta.hasLore()) {
				if (oldlore.contains(bumpE3)) {
					return;
				} else if (oldlore.contains(bumpE2)) {
					if (m == diamondh || m == ironh || m == chainh || m == leatherh) {
						if (app.getStringList("Bump").contains("Helmet")) {
							oldlore.remove(bumpE2);
							oldlore.add(bumpE3);
							newmeta.setLore(oldlore);
							item.setItemMeta(newmeta);
							p.getInventory().addItem(item);
							p.setLevel(plevel - threeCost);
							anvil.clear();
							p.setItemOnCursor(clear);
							p.closeInventory();
							if (!(sendmsg.equals("none")))
							p.sendMessage(sendmsg.replace("{enchant}", usedbump3.replace("&c", "")));
						}
					} else if (m == diamondc || m == ironc || m == chainc || m == leatherc) {
						if (app.getStringList("Bump").contains("Chestplate")) {
							oldlore.remove(bumpE2);
							oldlore.add(bumpE3);
							newmeta.setLore(oldlore);
							item.setItemMeta(newmeta);
							p.getInventory().addItem(item);
							p.setLevel(plevel - threeCost);
							anvil.clear();
							p.setItemOnCursor(clear);
							p.closeInventory();
							if (!(sendmsg.equals("none")))
							p.sendMessage(sendmsg.replace("{enchant}", usedbump3.replace("&c", "")));
						}
					} else if (m == diamondl || m == ironl || m == chainl || m == leatherl) {
						if (app.getStringList("Bump").contains("Leggings")) {
							oldlore.remove(bumpE2);
							oldlore.add(bumpE3);
							newmeta.setLore(oldlore);
							item.setItemMeta(newmeta);
							p.getInventory().addItem(item);
							p.setLevel(plevel - threeCost);
							anvil.clear();
							p.setItemOnCursor(clear);
							p.closeInventory();
							if (!(sendmsg.equals("none")))
							p.sendMessage(sendmsg.replace("{enchant}", usedbump3.replace("&c", "")));
						}
					} else if (m == diamondb || m == ironb || m == chainb || m == leatherb) {
						if (app.getStringList("Bump").contains("Boots")) {
							oldlore.remove(bumpE2);
							oldlore.add(bumpE3);
							newmeta.setLore(oldlore);
							item.setItemMeta(newmeta);
							p.getInventory().addItem(item);
							p.setLevel(plevel - threeCost);
							anvil.clear();
							p.setItemOnCursor(clear);
							p.closeInventory();
							if (!(sendmsg.equals("none")))
							p.sendMessage(sendmsg.replace("{enchant}", usedbump3.replace("&c", "")));
						}
					}
					return;
				} else if (oldlore.contains(bumpE)) {
					if (m == diamondh || m == ironh || m == chainh || m == leatherh) {
						if (app.getStringList("Bump").contains("Helmet")) {
							oldlore.remove(bumpE);
							oldlore.add(bumpE3);
							newmeta.setLore(oldlore);
							item.setItemMeta(newmeta);
							p.getInventory().addItem(item);
							p.setLevel(plevel - threeCost);
							anvil.clear();
							p.setItemOnCursor(clear);
							p.closeInventory();
							if (!(sendmsg.equals("none")))
							p.sendMessage(sendmsg.replace("{enchant}", usedbump3.replace("&c", "")));
						}
					} else if (m == diamondc || m == ironc || m == chainc || m == leatherc) {
						if (app.getStringList("Bump").contains("Chestplate")) {
							oldlore.remove(bumpE);
							oldlore.add(bumpE3);
							newmeta.setLore(oldlore);
							item.setItemMeta(newmeta);
							p.getInventory().addItem(item);
							p.setLevel(plevel - threeCost);
							anvil.clear();
							p.setItemOnCursor(clear);
							p.closeInventory();
							if (!(sendmsg.equals("none")))
							p.sendMessage(sendmsg.replace("{enchant}", usedbump3.replace("&c", "")));
						}
					} else if (m == diamondl || m == ironl || m == chainl || m == leatherl) {
						if (app.getStringList("Bump").contains("Leggings")) {
							oldlore.remove(bumpE);
							oldlore.add(bumpE3);
							newmeta.setLore(oldlore);
							item.setItemMeta(newmeta);
							p.getInventory().addItem(item);
							p.setLevel(plevel - threeCost);
							anvil.clear();
							p.setItemOnCursor(clear);
							p.closeInventory();
							if (!(sendmsg.equals("none")))
							p.sendMessage(sendmsg.replace("{enchant}", usedbump3.replace("&c", "")));
						}
					} else if (m == diamondb || m == ironb || m == chainb || m == leatherb) {
						if (app.getStringList("Bump").contains("Boots")) {
							oldlore.remove(bumpE);
							oldlore.add(bumpE3);
							newmeta.setLore(oldlore);
							item.setItemMeta(newmeta);
							p.getInventory().addItem(item);
							p.setLevel(plevel - threeCost);
							anvil.clear();
							p.setItemOnCursor(clear);
							p.closeInventory();
							if (!(sendmsg.equals("none")))
							p.sendMessage(sendmsg.replace("{enchant}", usedbump3.replace("&c", "")));
						}
					}
					return;
				}
			}
			if (enchants + loreLines >= enchantLimit) {
				if (!(toomanyenchantsmsg.equals("none")))
				p.sendMessage(toomanyenchantsmsg);
				return;
			}
			if (m == diamondh || m == ironh || m == chainh || m == leatherh) {
				if (app.getStringList("Bump").contains("Helmet")) {
					if (!(oldmeta.hasLore())) {
						newmeta.setLore(Arrays.asList(bumpE3));
					} else if (oldmeta.hasLore()) {
						oldlore.add(bumpE3);
						newmeta.setLore(oldlore);
					}
					item.setItemMeta(newmeta);
					p.getInventory().addItem(item);
					p.setLevel(plevel - threeCost);
					anvil.clear();
					p.setItemOnCursor(clear);
					p.closeInventory();
					if (!(sendmsg.equals("none")))
					p.sendMessage(sendmsg.replace("{enchant}", usedbump3.replace("&c", "")));
				}
			} else if (m == diamondc || m == ironc || m == chainc || m == leatherc) {
				if (app.getStringList("Bump").contains("Chestplate")) {
					if (!(oldmeta.hasLore())) {
						newmeta.setLore(Arrays.asList(bumpE3));
					} else if (oldmeta.hasLore()) {
						oldlore.add(bumpE3);
						newmeta.setLore(oldlore);
					}
					item.setItemMeta(newmeta);
					p.getInventory().addItem(item);
					p.setLevel(plevel - threeCost);
					anvil.clear();
					p.setItemOnCursor(clear);
					p.closeInventory();
					if (!(sendmsg.equals("none")))
					p.sendMessage(sendmsg.replace("{enchant}", usedbump3.replace("&c", "")));
				}
			} else if (m == diamondl || m == ironl || m == chainl || m == leatherl) {
				if (app.getStringList("Bump").contains("Leggings")) {
					if (!(oldmeta.hasLore())) {
						newmeta.setLore(Arrays.asList(bumpE3));
					} else if (oldmeta.hasLore()) {
						oldlore.add(bumpE3);
						newmeta.setLore(oldlore);
					}
					item.setItemMeta(newmeta);
					p.getInventory().addItem(item);
					p.setLevel(plevel - threeCost);
					anvil.clear();
					p.setItemOnCursor(clear);
					p.closeInventory();
					if (!(sendmsg.equals("none")))
					p.sendMessage(sendmsg.replace("{enchant}", usedbump3.replace("&c", "")));
				}
			} else if (m == diamondb || m == ironb || m == chainb || m == leatherb) {
				if (app.getStringList("Bump").contains("Boots")) {
					if (!(oldmeta.hasLore())) {
						newmeta.setLore(Arrays.asList(bumpE3));
					} else if (oldmeta.hasLore()) {
						oldlore.add(bumpE3);
						newmeta.setLore(oldlore);
					}
					item.setItemMeta(newmeta);
					p.getInventory().addItem(item);
					p.setLevel(plevel - threeCost);
					anvil.clear();
					p.setItemOnCursor(clear);
					p.closeInventory();
					if (!(sendmsg.equals("none")))
					p.sendMessage(sendmsg.replace("{enchant}", usedbump3.replace("&c", "")));
				}
			}
		} else if (lore.contains(implodeE3)) {
			if (oldmeta.hasLore()) {
				if (oldlore.contains(implodeE3)) {
					return;
				} else if (oldlore.contains(implodeE2)) {
					if (m == diamondh || m == ironh || m == chainh || m == leatherh) {
						if (app.getStringList("Implode").contains("Helmet")) {
							oldlore.remove(implodeE2);
							oldlore.add(implodeE3);
							newmeta.setLore(oldlore);
							item.setItemMeta(newmeta);
							p.getInventory().addItem(item);
							p.setLevel(plevel - threeCost);
							anvil.clear();
							p.setItemOnCursor(clear);
							p.closeInventory();
							if (!(sendmsg.equals("none")))
							p.sendMessage(sendmsg.replace("{enchant}", usedimplode3.replace("&c", "")));
						}
					} else if (m == diamondc || m == ironc || m == chainc || m == leatherc) {
						if (app.getStringList("Implode").contains("Chestplate")) {
							oldlore.remove(implodeE2);
							oldlore.add(implodeE3);
							newmeta.setLore(oldlore);
							item.setItemMeta(newmeta);
							p.getInventory().addItem(item);
							p.setLevel(plevel - threeCost);
							anvil.clear();
							p.setItemOnCursor(clear);
							p.closeInventory();
							if (!(sendmsg.equals("none")))
							p.sendMessage(sendmsg.replace("{enchant}", usedimplode3.replace("&c", "")));
						}
					} else if (m == diamondl || m == ironl || m == chainl || m == leatherl) {
						if (app.getStringList("Implode").contains("Leggings")) {
							oldlore.remove(implodeE2);
							oldlore.add(implodeE3);
							newmeta.setLore(oldlore);
							item.setItemMeta(newmeta);
							p.getInventory().addItem(item);
							p.setLevel(plevel - threeCost);
							anvil.clear();
							p.setItemOnCursor(clear);
							p.closeInventory();
							if (!(sendmsg.equals("none")))
							p.sendMessage(sendmsg.replace("{enchant}", usedimplode3.replace("&c", "")));
						}
					} else if (m == diamondb || m == ironb || m == chainb || m == leatherb) {
						if (app.getStringList("Implode").contains("Boots")) {
							oldlore.remove(implodeE2);
							oldlore.add(implodeE3);
							newmeta.setLore(oldlore);
							item.setItemMeta(newmeta);
							p.getInventory().addItem(item);
							p.setLevel(plevel - threeCost);
							anvil.clear();
							p.setItemOnCursor(clear);
							p.closeInventory();
							if (!(sendmsg.equals("none")))
							p.sendMessage(sendmsg.replace("{enchant}", usedimplode3.replace("&c", "")));
						}
					}
					return;
				} else if (oldlore.contains(implodeE)) {
					if (m == diamondh || m == ironh || m == chainh || m == leatherh) {
						if (app.getStringList("Implode").contains("Helmet")) {
							oldlore.remove(implodeE);
							oldlore.add(implodeE3);
							newmeta.setLore(oldlore);
							item.setItemMeta(newmeta);
							p.getInventory().addItem(item);
							p.setLevel(plevel - threeCost);
							anvil.clear();
							p.setItemOnCursor(clear);
							p.closeInventory();
							if (!(sendmsg.equals("none")))
							p.sendMessage(sendmsg.replace("{enchant}", usedimplode3.replace("&c", "")));
						}
					} else if (m == diamondc || m == ironc || m == chainc || m == leatherc) {
						if (app.getStringList("Implode").contains("Chestplate")) {
							oldlore.remove(implodeE);
							oldlore.add(implodeE3);
							newmeta.setLore(oldlore);
							item.setItemMeta(newmeta);
							p.getInventory().addItem(item);
							p.setLevel(plevel - threeCost);
							anvil.clear();
							p.setItemOnCursor(clear);
							p.closeInventory();
							if (!(sendmsg.equals("none")))
							p.sendMessage(sendmsg.replace("{enchant}", usedimplode3.replace("&c", "")));
						}
					} else if (m == diamondl || m == ironl || m == chainl || m == leatherl) {
						if (app.getStringList("Implode").contains("Leggings")) {
							oldlore.remove(implodeE);
							oldlore.add(implodeE3);
							newmeta.setLore(oldlore);
							item.setItemMeta(newmeta);
							p.getInventory().addItem(item);
							p.setLevel(plevel - threeCost);
							anvil.clear();
							p.setItemOnCursor(clear);
							p.closeInventory();
							if (!(sendmsg.equals("none")))
							p.sendMessage(sendmsg.replace("{enchant}", usedimplode3.replace("&c", "")));
						}
					} else if (m == diamondb || m == ironb || m == chainb || m == leatherb) {
						if (app.getStringList("Implode").contains("Boots")) {
							oldlore.remove(implodeE);
							oldlore.add(implodeE3);
							newmeta.setLore(oldlore);
							item.setItemMeta(newmeta);
							p.getInventory().addItem(item);
							p.setLevel(plevel - threeCost);
							anvil.clear();
							p.setItemOnCursor(clear);
							p.closeInventory();
							if (!(sendmsg.equals("none")))
							p.sendMessage(sendmsg.replace("{enchant}", usedimplode3.replace("&c", "")));
						}
					}
					return;
				}
			}
			if (enchants + loreLines >= enchantLimit) {
				if (!(toomanyenchantsmsg.equals("none")))
				p.sendMessage(toomanyenchantsmsg);
				return;
			}
			if (m == diamondh || m == ironh || m == chainh || m == leatherh) {
				if (app.getStringList("Implode").contains("Helmet")) {
					if (!(oldmeta.hasLore())) {
						newmeta.setLore(Arrays.asList(implodeE3));
					} else if (oldmeta.hasLore()) {
						oldlore.add(implodeE3);
						newmeta.setLore(oldlore);
					}
					item.setItemMeta(newmeta);
					p.getInventory().addItem(item);
					p.setLevel(plevel - threeCost);
					anvil.clear();
					p.setItemOnCursor(clear);
					p.closeInventory();
					if (!(sendmsg.equals("none")))
					p.sendMessage(sendmsg.replace("{enchant}", usedimplode3.replace("&c", "")));
				}
			} else if (m == diamondc || m == ironc || m == chainc || m == leatherc) {
				if (app.getStringList("Implode").contains("Chestplate")) {
					if (!(oldmeta.hasLore())) {
						newmeta.setLore(Arrays.asList(implodeE3));
					} else if (oldmeta.hasLore()) {
						oldlore.add(implodeE3);
						newmeta.setLore(oldlore);
					}
					item.setItemMeta(newmeta);
					p.getInventory().addItem(item);
					p.setLevel(plevel - threeCost);
					anvil.clear();
					p.setItemOnCursor(clear);
					p.closeInventory();
					if (!(sendmsg.equals("none")))
					p.sendMessage(sendmsg.replace("{enchant}", usedimplode3.replace("&c", "")));
				}
			} else if (m == diamondl || m == ironl || m == chainl || m == leatherl) {
				if (app.getStringList("Implode").contains("Leggings")) {
					if (!(oldmeta.hasLore())) {
						newmeta.setLore(Arrays.asList(implodeE3));
					} else if (oldmeta.hasLore()) {
						oldlore.add(implodeE3);
						newmeta.setLore(oldlore);
					}
					item.setItemMeta(newmeta);
					p.getInventory().addItem(item);
					p.setLevel(plevel - threeCost);
					anvil.clear();
					p.setItemOnCursor(clear);
					p.closeInventory();
					if (!(sendmsg.equals("none")))
					p.sendMessage(sendmsg.replace("{enchant}", usedimplode3.replace("&c", "")));
				}
			} else if (m == diamondb || m == ironb || m == chainb || m == leatherb) {
				if (app.getStringList("Implode").contains("Boots")) {
					if (!(oldmeta.hasLore())) {
						newmeta.setLore(Arrays.asList(implodeE3));
					} else if (oldmeta.hasLore()) {
						oldlore.add(implodeE3);
						newmeta.setLore(oldlore);
					}
					item.setItemMeta(newmeta);
					p.getInventory().addItem(item);
					p.setLevel(plevel - threeCost);
					anvil.clear();
					p.setItemOnCursor(clear);
					p.closeInventory();
					if (!(sendmsg.equals("none")))
					p.sendMessage(sendmsg.replace("{enchant}", usedimplode3.replace("&c", "")));
				}
			}
		} else if (lore.contains(leapsE3)) {
			if (oldmeta.hasLore()) {
				if (oldlore.contains(leapsE3)) {
					return;
				} else if (oldlore.contains(leapsE2)) {
					if (m == diamondh || m == ironh || m == chainh || m == leatherh) {
						if (app.getStringList("Leaps").contains("Helmet")) {
							oldlore.remove(leapsE2);
							oldlore.add(leapsE3);
							newmeta.setLore(oldlore);
							item.setItemMeta(newmeta);
							p.getInventory().addItem(item);
							p.setLevel(plevel - threeCost);
							anvil.clear();
							p.setItemOnCursor(clear);
							p.closeInventory();
							if (!(sendmsg.equals("none")))
							p.sendMessage(sendmsg.replace("{enchant}", usedleaps3.replace("&c", "")));
						}
					} else if (m == diamondc || m == ironc || m == chainc || m == leatherc) {
						if (app.getStringList("Leaps").contains("Chestplate")) {
							oldlore.remove(leapsE2);
							oldlore.add(leapsE3);
							newmeta.setLore(oldlore);
							item.setItemMeta(newmeta);
							p.getInventory().addItem(item);
							p.setLevel(plevel - threeCost);
							anvil.clear();
							p.setItemOnCursor(clear);
							p.closeInventory();
							if (!(sendmsg.equals("none")))
							p.sendMessage(sendmsg.replace("{enchant}", usedleaps3.replace("&c", "")));
						}
					} else if (m == diamondl || m == ironl || m == chainl || m == leatherl) {
						if (app.getStringList("Leaps").contains("Leggings")) {
							oldlore.remove(leapsE2);
							oldlore.add(leapsE3);
							newmeta.setLore(oldlore);
							item.setItemMeta(newmeta);
							p.getInventory().addItem(item);
							p.setLevel(plevel - threeCost);
							anvil.clear();
							p.setItemOnCursor(clear);
							p.closeInventory();
							if (!(sendmsg.equals("none")))
							p.sendMessage(sendmsg.replace("{enchant}", usedleaps3.replace("&c", "")));
						}
					} else if (m == diamondb || m == ironb || m == chainb || m == leatherb) {
						if (app.getStringList("Leaps").contains("Boots")) {
							oldlore.remove(leapsE2);
							oldlore.add(leapsE3);
							newmeta.setLore(oldlore);
							item.setItemMeta(newmeta);
							p.getInventory().addItem(item);
							p.setLevel(plevel - threeCost);
							anvil.clear();
							p.setItemOnCursor(clear);
							p.closeInventory();
							if (!(sendmsg.equals("none")))
							p.sendMessage(sendmsg.replace("{enchant}", usedleaps3.replace("&c", "")));
						}
					}
					return;
				} else if (oldlore.contains(leapsE)) {
					if (m == diamondh || m == ironh || m == chainh || m == leatherh) {
						if (app.getStringList("Leaps").contains("Helmet")) {
							oldlore.remove(leapsE);
							oldlore.add(leapsE3);
							newmeta.setLore(oldlore);
							item.setItemMeta(newmeta);
							p.getInventory().addItem(item);
							p.setLevel(plevel - threeCost);
							anvil.clear();
							p.setItemOnCursor(clear);
							p.closeInventory();
							if (!(sendmsg.equals("none")))
							p.sendMessage(sendmsg.replace("{enchant}", usedleaps3.replace("&c", "")));
						}
					} else if (m == diamondc || m == ironc || m == chainc || m == leatherc) {
						if (app.getStringList("Leaps").contains("Chestplate")) {
							oldlore.remove(leapsE);
							oldlore.add(leapsE3);
							newmeta.setLore(oldlore);
							item.setItemMeta(newmeta);
							p.getInventory().addItem(item);
							p.setLevel(plevel - threeCost);
							anvil.clear();
							p.setItemOnCursor(clear);
							p.closeInventory();
							if (!(sendmsg.equals("none")))
							p.sendMessage(sendmsg.replace("{enchant}", usedleaps3.replace("&c", "")));
						}
					} else if (m == diamondl || m == ironl || m == chainl || m == leatherl) {
						if (app.getStringList("Leaps").contains("Leggings")) {
							oldlore.remove(leapsE);
							oldlore.add(leapsE3);
							newmeta.setLore(oldlore);
							item.setItemMeta(newmeta);
							p.getInventory().addItem(item);
							p.setLevel(plevel - threeCost);
							anvil.clear();
							p.setItemOnCursor(clear);
							p.closeInventory();
							if (!(sendmsg.equals("none")))
							p.sendMessage(sendmsg.replace("{enchant}", usedleaps3.replace("&c", "")));
						}
					} else if (m == diamondb || m == ironb || m == chainb || m == leatherb) {
						if (app.getStringList("Leaps").contains("Boots")) {
							oldlore.remove(leapsE);
							oldlore.add(leapsE3);
							newmeta.setLore(oldlore);
							item.setItemMeta(newmeta);
							p.getInventory().addItem(item);
							p.setLevel(plevel - threeCost);
							anvil.clear();
							p.setItemOnCursor(clear);
							p.closeInventory();
							if (!(sendmsg.equals("none")))
							p.sendMessage(sendmsg.replace("{enchant}", usedleaps3.replace("&c", "")));
						}
					}
					return;
				}
			}
			if (enchants + loreLines >= enchantLimit) {
				if (!(toomanyenchantsmsg.equals("none")))
				p.sendMessage(toomanyenchantsmsg);
				return;
			}
			if (m == diamondh || m == ironh || m == chainh || m == leatherh) {
				if (app.getStringList("Leaps").contains("Helmet")) {
					if (!(oldmeta.hasLore())) {
						newmeta.setLore(Arrays.asList(leapsE3));
					} else if (oldmeta.hasLore()) {
						oldlore.add(leapsE3);
						newmeta.setLore(oldlore);
					}
					item.setItemMeta(newmeta);
					p.getInventory().addItem(item);
					p.setLevel(plevel - threeCost);
					anvil.clear();
					p.setItemOnCursor(clear);
					p.closeInventory();
					if (!(sendmsg.equals("none")))
					p.sendMessage(sendmsg.replace("{enchant}", usedleaps3.replace("&c", "")));
				}
			} else if (m == diamondc || m == ironc || m == chainc || m == leatherc) {
				if (app.getStringList("Leaps").contains("Chestplate")) {
					if (!(oldmeta.hasLore())) {
						newmeta.setLore(Arrays.asList(leapsE3));
					} else if (oldmeta.hasLore()) {
						oldlore.add(leapsE3);
						newmeta.setLore(oldlore);
					}
					item.setItemMeta(newmeta);
					p.getInventory().addItem(item);
					p.setLevel(plevel - threeCost);
					anvil.clear();
					p.setItemOnCursor(clear);
					p.closeInventory();
					if (!(sendmsg.equals("none")))
					p.sendMessage(sendmsg.replace("{enchant}", usedleaps3.replace("&c", "")));
				}
			} else if (m == diamondl || m == ironl || m == chainl || m == leatherl) {
				if (app.getStringList("Leaps").contains("Leggings")) {
					if (!(oldmeta.hasLore())) {
						newmeta.setLore(Arrays.asList(leapsE3));
					} else if (oldmeta.hasLore()) {
						oldlore.add(leapsE3);
						newmeta.setLore(oldlore);
					}
					item.setItemMeta(newmeta);
					p.getInventory().addItem(item);
					p.setLevel(plevel - threeCost);
					anvil.clear();
					p.setItemOnCursor(clear);
					p.closeInventory();
					if (!(sendmsg.equals("none")))
					p.sendMessage(sendmsg.replace("{enchant}", usedleaps3.replace("&c", "")));
				}
			} else if (m == diamondb || m == ironb || m == chainb || m == leatherb) {
				if (app.getStringList("Leaps").contains("Boots")) {
					if (!(oldmeta.hasLore())) {
						newmeta.setLore(Arrays.asList(leapsE3));
					} else if (oldmeta.hasLore()) {
						oldlore.add(leapsE3);
						newmeta.setLore(oldlore);
					}
					item.setItemMeta(newmeta);
					p.getInventory().addItem(item);
					p.setLevel(plevel - threeCost);
					anvil.clear();
					p.setItemOnCursor(clear);
					p.closeInventory();
					if (!(sendmsg.equals("none")))
					p.sendMessage(sendmsg.replace("{enchant}", usedleaps3.replace("&c", "")));
				}
			}
		} else if (lore.contains(rebornE3)) {
			if (oldmeta.hasLore()) {
				if (oldlore.contains(rebornE3)) {
					return;
				} else if (oldlore.contains(rebornE2)) {
					if (m == diamondh || m == ironh || m == chainh || m == leatherh) {
						if (app.getStringList("Reborn").contains("Helmet")) {
							oldlore.remove(rebornE2);
							oldlore.add(rebornE3);
							newmeta.setLore(oldlore);
							item.setItemMeta(newmeta);
							p.getInventory().addItem(item);
							p.setLevel(plevel - threeCost);
							anvil.clear();
							p.setItemOnCursor(clear);
							p.closeInventory();
							if (!(sendmsg.equals("none")))
							p.sendMessage(sendmsg.replace("{enchant}", usedreborn3.replace("&c", "")));
						}
					} else if (m == diamondc || m == ironc || m == chainc || m == leatherc) {
						if (app.getStringList("Reborn").contains("Chestplate")) {
							oldlore.remove(rebornE2);
							oldlore.add(rebornE3);
							newmeta.setLore(oldlore);
							item.setItemMeta(newmeta);
							p.getInventory().addItem(item);
							p.setLevel(plevel - threeCost);
							anvil.clear();
							p.setItemOnCursor(clear);
							p.closeInventory();
							if (!(sendmsg.equals("none")))
							p.sendMessage(sendmsg.replace("{enchant}", usedreborn3.replace("&c", "")));
						}
					} else if (m == diamondl || m == ironl || m == chainl || m == leatherl) {
						if (app.getStringList("Reborn").contains("Leggings")) {
							oldlore.remove(rebornE2);
							oldlore.add(rebornE3);
							newmeta.setLore(oldlore);
							item.setItemMeta(newmeta);
							p.getInventory().addItem(item);
							p.setLevel(plevel - threeCost);
							anvil.clear();
							p.setItemOnCursor(clear);
							p.closeInventory();
							if (!(sendmsg.equals("none")))
							p.sendMessage(sendmsg.replace("{enchant}", usedreborn3.replace("&c", "")));
						}
					} else if (m == diamondb || m == ironb || m == chainb || m == leatherb) {
						if (app.getStringList("Reborn").contains("Boots")) {
							oldlore.remove(rebornE2);
							oldlore.add(rebornE3);
							newmeta.setLore(oldlore);
							item.setItemMeta(newmeta);
							p.getInventory().addItem(item);
							p.setLevel(plevel - threeCost);
							anvil.clear();
							p.setItemOnCursor(clear);
							p.closeInventory();
							if (!(sendmsg.equals("none")))
							p.sendMessage(sendmsg.replace("{enchant}", usedreborn3.replace("&c", "")));
						}
					}
					return;
				} else if (oldlore.contains(rebornE)) {
					if (m == diamondh || m == ironh || m == chainh || m == leatherh) {
						if (app.getStringList("Reborn").contains("Helmet")) {
							oldlore.remove(rebornE);
							oldlore.add(rebornE3);
							newmeta.setLore(oldlore);
							item.setItemMeta(newmeta);
							p.getInventory().addItem(item);
							p.setLevel(plevel - threeCost);
							anvil.clear();
							p.setItemOnCursor(clear);
							p.closeInventory();
							if (!(sendmsg.equals("none")))
							p.sendMessage(sendmsg.replace("{enchant}", usedreborn3.replace("&c", "")));
						}
					} else if (m == diamondc || m == ironc || m == chainc || m == leatherc) {
						if (app.getStringList("Reborn").contains("Chestplate")) {
							oldlore.remove(rebornE);
							oldlore.add(rebornE3);
							newmeta.setLore(oldlore);
							item.setItemMeta(newmeta);
							p.getInventory().addItem(item);
							p.setLevel(plevel - threeCost);
							anvil.clear();
							p.setItemOnCursor(clear);
							p.closeInventory();
							if (!(sendmsg.equals("none")))
							p.sendMessage(sendmsg.replace("{enchant}", usedreborn3.replace("&c", "")));
						}
					} else if (m == diamondl || m == ironl || m == chainl || m == leatherl) {
						if (app.getStringList("Reborn").contains("Leggings")) {
							oldlore.remove(rebornE);
							oldlore.add(rebornE3);
							newmeta.setLore(oldlore);
							item.setItemMeta(newmeta);
							p.getInventory().addItem(item);
							p.setLevel(plevel - threeCost);
							anvil.clear();
							p.setItemOnCursor(clear);
							p.closeInventory();
							if (!(sendmsg.equals("none")))
							p.sendMessage(sendmsg.replace("{enchant}", usedreborn3.replace("&c", "")));
						}
					} else if (m == diamondb || m == ironb || m == chainb || m == leatherb) {
						if (app.getStringList("Reborn").contains("Boots")) {
							oldlore.remove(rebornE);
							oldlore.add(rebornE3);
							newmeta.setLore(oldlore);
							item.setItemMeta(newmeta);
							p.getInventory().addItem(item);
							p.setLevel(plevel - threeCost);
							anvil.clear();
							p.setItemOnCursor(clear);
							p.closeInventory();
							if (!(sendmsg.equals("none")))
							p.sendMessage(sendmsg.replace("{enchant}", usedreborn3.replace("&c", "")));
						}
					}
					return;
				}
			}
			if (enchants + loreLines >= enchantLimit) {
				if (!(toomanyenchantsmsg.equals("none")))
				p.sendMessage(toomanyenchantsmsg);
				return;
			}
			if (m == diamondh || m == ironh || m == chainh || m == leatherh) {
				if (app.getStringList("Reborn").contains("Helmet")) {
					if (!(oldmeta.hasLore())) {
						newmeta.setLore(Arrays.asList(rebornE3));
					} else if (oldmeta.hasLore()) {
						oldlore.add(rebornE3);
						newmeta.setLore(oldlore);
					}
					item.setItemMeta(newmeta);
					p.getInventory().addItem(item);
					p.setLevel(plevel - threeCost);
					anvil.clear();
					p.setItemOnCursor(clear);
					p.closeInventory();
					p.sendMessage(sendmsg.replace("{enchant}", usedreborn3.replace("&c", "")));
				}
			} else if (m == diamondc || m == ironc || m == chainc || m == leatherc) {
				if (app.getStringList("Reborn").contains("Chestplate")) {
					if (!(oldmeta.hasLore())) {
						newmeta.setLore(Arrays.asList(rebornE3));
					} else if (oldmeta.hasLore()) {
						oldlore.add(rebornE3);
						newmeta.setLore(oldlore);
					}
					item.setItemMeta(newmeta);
					p.getInventory().addItem(item);
					p.setLevel(plevel - threeCost);
					anvil.clear();
					p.setItemOnCursor(clear);
					p.closeInventory();
					if (!(sendmsg.equals("none")))
					p.sendMessage(sendmsg.replace("{enchant}", usedreborn3.replace("&c", "")));
				}
			} else if (m == diamondl || m == ironl || m == chainl || m == leatherl) {
				if (app.getStringList("Reborn").contains("Leggings")) {
					if (!(oldmeta.hasLore())) {
						newmeta.setLore(Arrays.asList(rebornE3));
					} else if (oldmeta.hasLore()) {
						oldlore.add(rebornE3);
						newmeta.setLore(oldlore);
					}
					item.setItemMeta(newmeta);
					p.getInventory().addItem(item);
					p.setLevel(plevel - threeCost);
					anvil.clear();
					p.setItemOnCursor(clear);
					p.closeInventory();
					if (!(sendmsg.equals("none")))
					p.sendMessage(sendmsg.replace("{enchant}", usedreborn3.replace("&c", "")));
				}
			} else if (m == diamondb || m == ironb || m == chainb || m == leatherb) {
				if (app.getStringList("Reborn").contains("Boots")) {
					if (!(oldmeta.hasLore())) {
						newmeta.setLore(Arrays.asList(rebornE3));
					} else if (oldmeta.hasLore()) {
						oldlore.add(rebornE3);
						newmeta.setLore(oldlore);
					}
					item.setItemMeta(newmeta);
					p.getInventory().addItem(item);
					p.setLevel(plevel - threeCost);
					anvil.clear();
					p.setItemOnCursor(clear);
					p.closeInventory();
					if (!(sendmsg.equals("none")))
					p.sendMessage(sendmsg.replace("{enchant}", usedreborn3.replace("&c", "")));
				}
			}
		} else if (lore.contains(replenishE3)) {
			if (oldmeta.hasLore()) {
				if (oldlore.contains(replenishE3)) {
					return;
				} else if (oldlore.contains(replenishE2)) {
					if (m == diamondh || m == ironh || m == chainh || m == leatherh) {
						if (app.getStringList("Replenish").contains("Helmet")) {
							oldlore.remove(replenishE2);
							oldlore.add(replenishE3);
							newmeta.setLore(oldlore);
							item.setItemMeta(newmeta);
							p.getInventory().addItem(item);
							p.setLevel(plevel - threeCost);
							anvil.clear();
							p.setItemOnCursor(clear);
							p.closeInventory();
							if (!(sendmsg.equals("none")))
							p.sendMessage(sendmsg.replace("{enchant}", usedreplenish3.replace("&c", "")));
						}
					} else if (m == diamondc || m == ironc || m == chainc || m == leatherc) {
						if (app.getStringList("Replenish").contains("Chestplate")) {
							oldlore.remove(replenishE2);
							oldlore.add(replenishE3);
							newmeta.setLore(oldlore);
							item.setItemMeta(newmeta);
							p.getInventory().addItem(item);
							p.setLevel(plevel - threeCost);
							anvil.clear();
							p.setItemOnCursor(clear);
							p.closeInventory();
							if (!(sendmsg.equals("none")))
							p.sendMessage(sendmsg.replace("{enchant}", usedreplenish3.replace("&c", "")));
						}
					} else if (m == diamondl || m == ironl || m == chainl || m == leatherl) {
						if (app.getStringList("Replenish").contains("Leggings")) {
							oldlore.remove(replenishE2);
							oldlore.add(replenishE3);
							newmeta.setLore(oldlore);
							item.setItemMeta(newmeta);
							p.getInventory().addItem(item);
							p.setLevel(plevel - threeCost);
							anvil.clear();
							p.setItemOnCursor(clear);
							p.closeInventory();
							if (!(sendmsg.equals("none")))
							p.sendMessage(sendmsg.replace("{enchant}", usedreplenish3.replace("&c", "")));
						}
					} else if (m == diamondb || m == ironb || m == chainb || m == leatherb) {
						if (app.getStringList("Replenish").contains("Boots")) {
							oldlore.remove(replenishE2);
							oldlore.add(replenishE3);
							newmeta.setLore(oldlore);
							item.setItemMeta(newmeta);
							p.getInventory().addItem(item);
							p.setLevel(plevel - threeCost);
							anvil.clear();
							p.setItemOnCursor(clear);
							p.closeInventory();
							if (!(sendmsg.equals("none")))
							p.sendMessage(sendmsg.replace("{enchant}", usedreplenish3.replace("&c", "")));
						}
					}
					return;
				} else if (oldlore.contains(replenishE)) {
					if (m == diamondh || m == ironh || m == chainh || m == leatherh) {
						if (app.getStringList("Replenish").contains("Helmet")) {
							oldlore.remove(replenishE);
							oldlore.add(replenishE3);
							newmeta.setLore(oldlore);
							item.setItemMeta(newmeta);
							p.getInventory().addItem(item);
							p.setLevel(plevel - threeCost);
							anvil.clear();
							p.setItemOnCursor(clear);
							p.closeInventory();
							if (!(sendmsg.equals("none")))
							p.sendMessage(sendmsg.replace("{enchant}", usedreplenish3.replace("&c", "")));
						}
					} else if (m == diamondc || m == ironc || m == chainc || m == leatherc) {
						if (app.getStringList("Replenish").contains("Chestplate")) {
							oldlore.remove(replenishE);
							oldlore.add(replenishE3);
							newmeta.setLore(oldlore);
							item.setItemMeta(newmeta);
							p.getInventory().addItem(item);
							p.setLevel(plevel - threeCost);
							anvil.clear();
							p.setItemOnCursor(clear);
							p.closeInventory();
							if (!(sendmsg.equals("none")))
							p.sendMessage(sendmsg.replace("{enchant}", usedreplenish3.replace("&c", "")));
						}
					} else if (m == diamondl || m == ironl || m == chainl || m == leatherl) {
						if (app.getStringList("Replenish").contains("Leggings")) {
							oldlore.remove(replenishE);
							oldlore.add(replenishE3);
							newmeta.setLore(oldlore);
							item.setItemMeta(newmeta);
							p.getInventory().addItem(item);
							p.setLevel(plevel - threeCost);
							anvil.clear();
							p.setItemOnCursor(clear);
							p.closeInventory();
							if (!(sendmsg.equals("none")))
							p.sendMessage(sendmsg.replace("{enchant}", usedreplenish3.replace("&c", "")));
						}
					} else if (m == diamondb || m == ironb || m == chainb || m == leatherb) {
						if (app.getStringList("Replenish").contains("Boots")) {
							oldlore.remove(replenishE);
							oldlore.add(replenishE3);
							newmeta.setLore(oldlore);
							item.setItemMeta(newmeta);
							p.getInventory().addItem(item);
							p.setLevel(plevel - threeCost);
							anvil.clear();
							p.setItemOnCursor(clear);
							p.closeInventory();
							if (!(sendmsg.equals("none")))
							p.sendMessage(sendmsg.replace("{enchant}", usedreplenish3.replace("&c", "")));
						}
					}
					return;
				}
			}
			if (enchants + loreLines >= enchantLimit) {
				if (!(toomanyenchantsmsg.equals("none")))
				p.sendMessage(toomanyenchantsmsg);
				return;
			}
			if (m == diamondh || m == ironh || m == chainh || m == leatherh) {
				if (app.getStringList("Replenish").contains("Helmet")) {
					if (!(oldmeta.hasLore())) {
						newmeta.setLore(Arrays.asList(replenishE3));
					} else if (oldmeta.hasLore()) {
						oldlore.add(replenishE3);
						newmeta.setLore(oldlore);
					}
					item.setItemMeta(newmeta);
					p.getInventory().addItem(item);
					p.setLevel(plevel - threeCost);
					anvil.clear();
					p.setItemOnCursor(clear);
					p.closeInventory();
					if (!(sendmsg.equals("none")))
					p.sendMessage(sendmsg.replace("{enchant}", usedreplenish3.replace("&c", "")));
				}
			} else if (m == diamondc || m == ironc || m == chainc || m == leatherc) {
				if (app.getStringList("Replenish").contains("Chestplate")) {
					if (!(oldmeta.hasLore())) {
						newmeta.setLore(Arrays.asList(replenishE3));
					} else if (oldmeta.hasLore()) {
						oldlore.add(replenishE3);
						newmeta.setLore(oldlore);
					}
					item.setItemMeta(newmeta);
					p.getInventory().addItem(item);
					p.setLevel(plevel - threeCost);
					anvil.clear();
					p.setItemOnCursor(clear);
					p.closeInventory();
					if (!(sendmsg.equals("none")))
					p.sendMessage(sendmsg.replace("{enchant}", usedreplenish3.replace("&c", "")));
				}
			} else if (m == diamondl || m == ironl || m == chainl || m == leatherl) {
				if (app.getStringList("Replenish").contains("Leggings")) {
					if (!(oldmeta.hasLore())) {
						newmeta.setLore(Arrays.asList(replenishE3));
					} else if (oldmeta.hasLore()) {
						oldlore.add(replenishE3);
						newmeta.setLore(oldlore);
					}
					item.setItemMeta(newmeta);
					p.getInventory().addItem(item);
					p.setLevel(plevel - threeCost);
					anvil.clear();
					p.setItemOnCursor(clear);
					p.closeInventory();
					if (!(sendmsg.equals("none")))
					p.sendMessage(sendmsg.replace("{enchant}", usedreplenish3.replace("&c", "")));
				}
			} else if (m == diamondb || m == ironb || m == chainb || m == leatherb) {
				if (app.getStringList("Replenish").contains("Boots")) {
					if (!(oldmeta.hasLore())) {
						newmeta.setLore(Arrays.asList(replenishE3));
					} else if (oldmeta.hasLore()) {
						oldlore.add(replenishE3);
						newmeta.setLore(oldlore);
					}
					item.setItemMeta(newmeta);
					p.getInventory().addItem(item);
					p.setLevel(plevel - threeCost);
					anvil.clear();
					p.setItemOnCursor(clear);
					p.closeInventory();
					if (!(sendmsg.equals("none")))
					p.sendMessage(sendmsg.replace("{enchant}", usedreplenish3.replace("&c", "")));
				}
			}
		} else if (lore.contains(retreatE3)) {
			if (oldmeta.hasLore()) {
				if (oldlore.contains(retreatE3)) {
					return;
				} else if (oldlore.contains(retreatE2)) {
					if (m == diamondh || m == ironh || m == chainh || m == leatherh) {
						if (app.getStringList("Retreat").contains("Helmet")) {
							oldlore.remove(retreatE2);
							oldlore.add(retreatE3);
							newmeta.setLore(oldlore);
							item.setItemMeta(newmeta);
							p.getInventory().addItem(item);
							p.setLevel(plevel - threeCost);
							anvil.clear();
							p.setItemOnCursor(clear);
							p.closeInventory();
							if (!(sendmsg.equals("none")))
							p.sendMessage(sendmsg.replace("{enchant}", usedretreat3.replace("&c", "")));
						}
					} else if (m == diamondc || m == ironc || m == chainc || m == leatherc) {
						if (app.getStringList("Retreat").contains("Chestplate")) {
							oldlore.remove(retreatE2);
							oldlore.add(retreatE3);
							newmeta.setLore(oldlore);
							item.setItemMeta(newmeta);
							p.getInventory().addItem(item);
							p.setLevel(plevel - threeCost);
							anvil.clear();
							p.setItemOnCursor(clear);
							p.closeInventory();
							if (!(sendmsg.equals("none")))
							p.sendMessage(sendmsg.replace("{enchant}", usedretreat3.replace("&c", "")));
						}
					} else if (m == diamondl || m == ironl || m == chainl || m == leatherl) {
						if (app.getStringList("Retreat").contains("Leggings")) {
							oldlore.remove(retreatE2);
							oldlore.add(retreatE3);
							newmeta.setLore(oldlore);
							item.setItemMeta(newmeta);
							p.getInventory().addItem(item);
							p.setLevel(plevel - threeCost);
							anvil.clear();
							p.setItemOnCursor(clear);
							p.closeInventory();
							if (!(sendmsg.equals("none")))
							p.sendMessage(sendmsg.replace("{enchant}", usedretreat3.replace("&c", "")));
						}
					} else if (m == diamondb || m == ironb || m == chainb || m == leatherb) {
						if (app.getStringList("Retreat").contains("Boots")) {
							oldlore.remove(retreatE2);
							oldlore.add(retreatE3);
							newmeta.setLore(oldlore);
							item.setItemMeta(newmeta);
							p.getInventory().addItem(item);
							p.setLevel(plevel - threeCost);
							anvil.clear();
							p.setItemOnCursor(clear);
							p.closeInventory();
							if (!(sendmsg.equals("none")))
							p.sendMessage(sendmsg.replace("{enchant}", usedretreat3.replace("&c", "")));
						}
					}
					return;
				} else if (oldlore.contains(retreatE)) {
					if (m == diamondh || m == ironh || m == chainh || m == leatherh) {
						if (app.getStringList("Retreat").contains("Helmet")) {
							oldlore.remove(retreatE);
							oldlore.add(retreatE3);
							newmeta.setLore(oldlore);
							item.setItemMeta(newmeta);
							p.getInventory().addItem(item);
							p.setLevel(plevel - threeCost);
							anvil.clear();
							p.setItemOnCursor(clear);
							p.closeInventory();
							if (!(sendmsg.equals("none")))
							p.sendMessage(sendmsg.replace("{enchant}", usedretreat3.replace("&c", "")));
						}
					} else if (m == diamondc || m == ironc || m == chainc || m == leatherc) {
						if (app.getStringList("Retreat").contains("Chestplate")) {
							oldlore.remove(retreatE);
							oldlore.add(retreatE3);
							newmeta.setLore(oldlore);
							item.setItemMeta(newmeta);
							p.getInventory().addItem(item);
							p.setLevel(plevel - threeCost);
							anvil.clear();
							p.setItemOnCursor(clear);
							p.closeInventory();
							if (!(sendmsg.equals("none")))
							p.sendMessage(sendmsg.replace("{enchant}", usedretreat3.replace("&c", "")));
						}
					} else if (m == diamondl || m == ironl || m == chainl || m == leatherl) {
						if (app.getStringList("Retreat").contains("Leggings")) {
							oldlore.remove(retreatE);
							oldlore.add(retreatE3);
							newmeta.setLore(oldlore);
							item.setItemMeta(newmeta);
							p.getInventory().addItem(item);
							p.setLevel(plevel - threeCost);
							anvil.clear();
							p.setItemOnCursor(clear);
							p.closeInventory();
							if (!(sendmsg.equals("none")))
							p.sendMessage(sendmsg.replace("{enchant}", usedretreat3.replace("&c", "")));
						}
					} else if (m == diamondb || m == ironb || m == chainb || m == leatherb) {
						if (app.getStringList("Retreat").contains("Boots")) {
							oldlore.remove(retreatE);
							oldlore.add(retreatE3);
							newmeta.setLore(oldlore);
							item.setItemMeta(newmeta);
							p.getInventory().addItem(item);
							p.setLevel(plevel - threeCost);
							anvil.clear();
							p.setItemOnCursor(clear);
							p.closeInventory();
							if (!(sendmsg.equals("none")))
							p.sendMessage(sendmsg.replace("{enchant}", usedretreat3.replace("&c", "")));
						}
					}
					return;
				}
			}
			if (enchants + loreLines >= enchantLimit) {
				if (!(toomanyenchantsmsg.equals("none")))
				p.sendMessage(toomanyenchantsmsg);
				return;
			}
			if (m == diamondh || m == ironh || m == chainh || m == leatherh) {
				if (app.getStringList("Retreat").contains("Helmet")) {
					if (!(oldmeta.hasLore())) {
						newmeta.setLore(Arrays.asList(retreatE3));
					} else if (oldmeta.hasLore()) {
						oldlore.add(retreatE3);
						newmeta.setLore(oldlore);
					}
					item.setItemMeta(newmeta);
					p.getInventory().addItem(item);
					p.setLevel(plevel - threeCost);
					anvil.clear();
					p.setItemOnCursor(clear);
					p.closeInventory();
					if (!(sendmsg.equals("none")))
					p.sendMessage(sendmsg.replace("{enchant}", usedretreat3.replace("&c", "")));
				}
			} else if (m == diamondc || m == ironc || m == chainc || m == leatherc) {
				if (app.getStringList("Retreat").contains("Chestplate")) {
					if (!(oldmeta.hasLore())) {
						newmeta.setLore(Arrays.asList(retreatE3));
					} else if (oldmeta.hasLore()) {
						oldlore.add(retreatE3);
						newmeta.setLore(oldlore);
					}
					item.setItemMeta(newmeta);
					p.getInventory().addItem(item);
					p.setLevel(plevel - threeCost);
					anvil.clear();
					p.setItemOnCursor(clear);
					p.closeInventory();
					if (!(sendmsg.equals("none")))
					p.sendMessage(sendmsg.replace("{enchant}", usedretreat3.replace("&c", "")));
				}
			} else if (m == diamondl || m == ironl || m == chainl || m == leatherl) {
				if (app.getStringList("Retreat").contains("Leggings")) {
					if (!(oldmeta.hasLore())) {
						newmeta.setLore(Arrays.asList(retreatE3));
					} else if (oldmeta.hasLore()) {
						oldlore.add(retreatE3);
						newmeta.setLore(oldlore);
					}
					item.setItemMeta(newmeta);
					p.getInventory().addItem(item);
					p.setLevel(plevel - threeCost);
					anvil.clear();
					p.setItemOnCursor(clear);
					p.closeInventory();
					if (!(sendmsg.equals("none")))
					p.sendMessage(sendmsg.replace("{enchant}", usedretreat3.replace("&c", "")));
				}
			} else if (m == diamondb || m == ironb || m == chainb || m == leatherb) {
				if (app.getStringList("Retreat").contains("Boots")) {
					if (!(oldmeta.hasLore())) {
						newmeta.setLore(Arrays.asList(retreatE3));
					} else if (oldmeta.hasLore()) {
						oldlore.add(retreatE3);
						newmeta.setLore(oldlore);
					}
					item.setItemMeta(newmeta);
					p.getInventory().addItem(item);
					p.setLevel(plevel - threeCost);
					anvil.clear();
					p.setItemOnCursor(clear);
					p.closeInventory();
					if (!(sendmsg.equals("none")))
					p.sendMessage(sendmsg.replace("{enchant}", usedretreat3.replace("&c", "")));
				}
			}
		} else if (lore.contains(scootE3)) {
			if (oldmeta.hasLore()) {
				if (oldlore.contains(scootE3)) {
					return;
				} else if (oldlore.contains(scootE2)) {
					if (m == diamondh || m == ironh || m == chainh || m == leatherh) {
						if (app.getStringList("Scoot").contains("Helmet")) {
							oldlore.remove(scootE2);
							oldlore.add(scootE3);
							newmeta.setLore(oldlore);
							item.setItemMeta(newmeta);
							p.getInventory().addItem(item);
							p.setLevel(plevel - threeCost);
							anvil.clear();
							p.setItemOnCursor(clear);
							p.closeInventory();
							if (!(sendmsg.equals("none")))
							p.sendMessage(sendmsg.replace("{enchant}", usedscoot3.replace("&c", "")));
						}
					} else if (m == diamondc || m == ironc || m == chainc || m == leatherc) {
						if (app.getStringList("Scoot").contains("Chestplate")) {
							oldlore.remove(scootE2);
							oldlore.add(scootE3);
							newmeta.setLore(oldlore);
							item.setItemMeta(newmeta);
							p.getInventory().addItem(item);
							p.setLevel(plevel - threeCost);
							anvil.clear();
							p.setItemOnCursor(clear);
							p.closeInventory();
							if (!(sendmsg.equals("none")))
							p.sendMessage(sendmsg.replace("{enchant}", usedscoot3.replace("&c", "")));
						}
					} else if (m == diamondl || m == ironl || m == chainl || m == leatherl) {
						if (app.getStringList("Scoot").contains("Leggings")) {
							oldlore.remove(scootE2);
							oldlore.add(scootE3);
							newmeta.setLore(oldlore);
							item.setItemMeta(newmeta);
							p.getInventory().addItem(item);
							p.setLevel(plevel - threeCost);
							anvil.clear();
							p.setItemOnCursor(clear);
							p.closeInventory();
							if (!(sendmsg.equals("none")))
							p.sendMessage(sendmsg.replace("{enchant}", usedscoot3.replace("&c", "")));
						}
					} else if (m == diamondb || m == ironb || m == chainb || m == leatherb) {
						if (app.getStringList("Scoot").contains("Boots")) {
							oldlore.remove(scootE2);
							oldlore.add(scootE3);
							newmeta.setLore(oldlore);
							item.setItemMeta(newmeta);
							p.getInventory().addItem(item);
							p.setLevel(plevel - threeCost);
							anvil.clear();
							p.setItemOnCursor(clear);
							p.closeInventory();
							if (!(sendmsg.equals("none")))
							p.sendMessage(sendmsg.replace("{enchant}", usedscoot3.replace("&c", "")));
						}
					}
					return;
				} else if (oldlore.contains(scootE)) {
					if (m == diamondh || m == ironh || m == chainh || m == leatherh) {
						if (app.getStringList("Scoot").contains("Helmet")) {
							oldlore.remove(scootE);
							oldlore.add(scootE3);
							newmeta.setLore(oldlore);
							item.setItemMeta(newmeta);
							p.getInventory().addItem(item);
							p.setLevel(plevel - threeCost);
							anvil.clear();
							p.setItemOnCursor(clear);
							p.closeInventory();
							if (!(sendmsg.equals("none")))
							p.sendMessage(sendmsg.replace("{enchant}", usedscoot3.replace("&c", "")));
						}
					} else if (m == diamondc || m == ironc || m == chainc || m == leatherc) {
						if (app.getStringList("Scoot").contains("Chestplate")) {
							oldlore.remove(scootE);
							oldlore.add(scootE3);
							newmeta.setLore(oldlore);
							item.setItemMeta(newmeta);
							p.getInventory().addItem(item);
							p.setLevel(plevel - threeCost);
							anvil.clear();
							p.setItemOnCursor(clear);
							p.closeInventory();
							if (!(sendmsg.equals("none")))
							p.sendMessage(sendmsg.replace("{enchant}", usedscoot3.replace("&c", "")));
						}
					} else if (m == diamondl || m == ironl || m == chainl || m == leatherl) {
						if (app.getStringList("Scoot").contains("Leggings")) {
							oldlore.remove(scootE);
							oldlore.add(scootE3);
							newmeta.setLore(oldlore);
							item.setItemMeta(newmeta);
							p.getInventory().addItem(item);
							p.setLevel(plevel - threeCost);
							anvil.clear();
							p.setItemOnCursor(clear);
							p.closeInventory();
							if (!(sendmsg.equals("none")))
							p.sendMessage(sendmsg.replace("{enchant}", usedscoot3.replace("&c", "")));
						}
					} else if (m == diamondb || m == ironb || m == chainb || m == leatherb) {
						if (app.getStringList("Scoot").contains("Boots")) {
							oldlore.remove(scootE);
							oldlore.add(scootE3);
							newmeta.setLore(oldlore);
							item.setItemMeta(newmeta);
							p.getInventory().addItem(item);
							p.setLevel(plevel - threeCost);
							anvil.clear();
							p.setItemOnCursor(clear);
							p.closeInventory();
							if (!(sendmsg.equals("none")))
							p.sendMessage(sendmsg.replace("{enchant}", usedscoot3.replace("&c", "")));
						}
					}
					return;
				}
			}
			if (enchants + loreLines >= enchantLimit) {
				if (!(toomanyenchantsmsg.equals("none")))
				p.sendMessage(toomanyenchantsmsg);
				return;
			}
			if (m == diamondh || m == ironh || m == chainh || m == leatherh) {
				if (app.getStringList("Scoot").contains("Helmet")) {
					if (!(oldmeta.hasLore())) {
						newmeta.setLore(Arrays.asList(scootE3));
					} else if (oldmeta.hasLore()) {
						oldlore.add(scootE3);
						newmeta.setLore(oldlore);
					}
					item.setItemMeta(newmeta);
					p.getInventory().addItem(item);
					p.setLevel(plevel - threeCost);
					anvil.clear();
					p.setItemOnCursor(clear);
					p.closeInventory();
					if (!(sendmsg.equals("none")))
					p.sendMessage(sendmsg.replace("{enchant}", usedscoot3.replace("&c", "")));
				}
			} else if (m == diamondc || m == ironc || m == chainc || m == leatherc) {
				if (app.getStringList("Scoot").contains("Chestplate")) {
					if (!(oldmeta.hasLore())) {
						newmeta.setLore(Arrays.asList(scootE3));
					} else if (oldmeta.hasLore()) {
						oldlore.add(scootE3);
						newmeta.setLore(oldlore);
					}
					item.setItemMeta(newmeta);
					p.getInventory().addItem(item);
					p.setLevel(plevel - threeCost);
					anvil.clear();
					p.setItemOnCursor(clear);
					p.closeInventory();
					if (!(sendmsg.equals("none")))
					p.sendMessage(sendmsg.replace("{enchant}", usedscoot3.replace("&c", "")));
				}
			} else if (m == diamondl || m == ironl || m == chainl || m == leatherl) {
				if (app.getStringList("Scoot").contains("Leggings")) {
					if (!(oldmeta.hasLore())) {
						newmeta.setLore(Arrays.asList(scootE3));
					} else if (oldmeta.hasLore()) {
						oldlore.add(scootE3);
						newmeta.setLore(oldlore);
					}
					item.setItemMeta(newmeta);
					p.getInventory().addItem(item);
					p.setLevel(plevel - threeCost);
					anvil.clear();
					p.setItemOnCursor(clear);
					p.closeInventory();
					if (!(sendmsg.equals("none")))
					p.sendMessage(sendmsg.replace("{enchant}", usedscoot3.replace("&c", "")));
				}
			} else if (m == diamondb || m == ironb || m == chainb || m == leatherb) {
				if (app.getStringList("Scoot").contains("Boots")) {
					if (!(oldmeta.hasLore())) {
						newmeta.setLore(Arrays.asList(scootE3));
					} else if (oldmeta.hasLore()) {
						oldlore.add(scootE3);
						newmeta.setLore(oldlore);
					}
					item.setItemMeta(newmeta);
					p.getInventory().addItem(item);
					p.setLevel(plevel - threeCost);
					anvil.clear();
					p.setItemOnCursor(clear);
					p.closeInventory();
					if (!(sendmsg.equals("none")))
					p.sendMessage(sendmsg.replace("{enchant}", usedscoot3.replace("&c", "")));
				}
			}
		} else if (lore.contains(tipsyE3)) {
			if (oldmeta.hasLore()) {
				if (oldlore.contains(tipsyE3)) {
					return;
				} else if (oldlore.contains(tipsyE2)) {
					if (m == diamondh || m == ironh || m == chainh || m == leatherh) {
						if (app.getStringList("Tipsy").contains("Helmet")) {
							oldlore.remove(tipsyE2);
							oldlore.add(tipsyE3);
							newmeta.setLore(oldlore);
							item.setItemMeta(newmeta);
							p.getInventory().addItem(item);
							p.setLevel(plevel - threeCost);
							anvil.clear();
							p.setItemOnCursor(clear);
							p.closeInventory();
							if (!(sendmsg.equals("none")))
							p.sendMessage(sendmsg.replace("{enchant}", usedtipsy3.replace("&c", "")));
						}
					} else if (m == diamondc || m == ironc || m == chainc || m == leatherc) {
						if (app.getStringList("Tipsy").contains("Chestplate")) {
							oldlore.remove(tipsyE2);
							oldlore.add(tipsyE3);
							newmeta.setLore(oldlore);
							item.setItemMeta(newmeta);
							p.getInventory().addItem(item);
							p.setLevel(plevel - threeCost);
							anvil.clear();
							p.setItemOnCursor(clear);
							p.closeInventory();
							if (!(sendmsg.equals("none")))
							p.sendMessage(sendmsg.replace("{enchant}", usedtipsy3.replace("&c", "")));
						}
					} else if (m == diamondl || m == ironl || m == chainl || m == leatherl) {
						if (app.getStringList("Tipsy").contains("Leggings")) {
							oldlore.remove(tipsyE2);
							oldlore.add(tipsyE3);
							newmeta.setLore(oldlore);
							item.setItemMeta(newmeta);
							p.getInventory().addItem(item);
							p.setLevel(plevel - threeCost);
							anvil.clear();
							p.setItemOnCursor(clear);
							p.closeInventory();
							if (!(sendmsg.equals("none")))
							p.sendMessage(sendmsg.replace("{enchant}", usedtipsy3.replace("&c", "")));
						}
					} else if (m == diamondb || m == ironb || m == chainb || m == leatherb) {
						if (app.getStringList("Tipsy").contains("Boots")) {
							oldlore.remove(tipsyE2);
							oldlore.add(tipsyE3);
							newmeta.setLore(oldlore);
							item.setItemMeta(newmeta);
							p.getInventory().addItem(item);
							p.setLevel(plevel - threeCost);
							anvil.clear();
							p.setItemOnCursor(clear);
							p.closeInventory();
							if (!(sendmsg.equals("none")))
							p.sendMessage(sendmsg.replace("{enchant}", usedtipsy3.replace("&c", "")));
						}
					}
					return;
				} else if (oldlore.contains(tipsyE)) {
					if (m == diamondh || m == ironh || m == chainh || m == leatherh) {
						if (app.getStringList("Tipsy").contains("Helmet")) {
							oldlore.remove(tipsyE);
							oldlore.add(tipsyE3);
							newmeta.setLore(oldlore);
							item.setItemMeta(newmeta);
							p.getInventory().addItem(item);
							p.setLevel(plevel - threeCost);
							anvil.clear();
							p.setItemOnCursor(clear);
							p.closeInventory();
							if (!(sendmsg.equals("none")))
							p.sendMessage(sendmsg.replace("{enchant}", usedtipsy3.replace("&c", "")));
						}
					} else if (m == diamondc || m == ironc || m == chainc || m == leatherc) {
						if (app.getStringList("Tipsy").contains("Chestplate")) {
							oldlore.remove(tipsyE);
							oldlore.add(tipsyE3);
							newmeta.setLore(oldlore);
							item.setItemMeta(newmeta);
							p.getInventory().addItem(item);
							p.setLevel(plevel - threeCost);
							anvil.clear();
							p.setItemOnCursor(clear);
							p.closeInventory();
							if (!(sendmsg.equals("none")))
							p.sendMessage(sendmsg.replace("{enchant}", usedtipsy3.replace("&c", "")));
						}
					} else if (m == diamondl || m == ironl || m == chainl || m == leatherl) {
						if (app.getStringList("Tipsy").contains("Leggings")) {
							oldlore.remove(tipsyE);
							oldlore.add(tipsyE3);
							newmeta.setLore(oldlore);
							item.setItemMeta(newmeta);
							p.getInventory().addItem(item);
							p.setLevel(plevel - threeCost);
							anvil.clear();
							p.setItemOnCursor(clear);
							p.closeInventory();
							if (!(sendmsg.equals("none")))
							p.sendMessage(sendmsg.replace("{enchant}", usedtipsy3.replace("&c", "")));
						}
					} else if (m == diamondb || m == ironb || m == chainb || m == leatherb) {
						if (app.getStringList("Tipsy").contains("Boots")) {
							oldlore.remove(tipsyE);
							oldlore.add(tipsyE3);
							newmeta.setLore(oldlore);
							item.setItemMeta(newmeta);
							p.getInventory().addItem(item);
							p.setLevel(plevel - threeCost);
							anvil.clear();
							p.setItemOnCursor(clear);
							p.closeInventory();
							if (!(sendmsg.equals("none")))
							p.sendMessage(sendmsg.replace("{enchant}", usedtipsy3.replace("&c", "")));
						}
					}
					return;
				}
			}
			if (enchants + loreLines >= enchantLimit) {
				if (!(toomanyenchantsmsg.equals("none")))
				p.sendMessage(toomanyenchantsmsg);
				return;
			}
			if (m == diamondh || m == ironh || m == chainh || m == leatherh) {
				if (app.getStringList("Tipsy").contains("Helmet")) {
					if (!(oldmeta.hasLore())) {
						newmeta.setLore(Arrays.asList(tipsyE3));
					} else if (oldmeta.hasLore()) {
						oldlore.add(tipsyE3);
						newmeta.setLore(oldlore);
					}
					item.setItemMeta(newmeta);
					p.getInventory().addItem(item);
					p.setLevel(plevel - threeCost);
					anvil.clear();
					p.setItemOnCursor(clear);
					p.closeInventory();
					p.sendMessage(sendmsg.replace("{enchant}", usedtipsy3.replace("&c", "")));
				}
			} else if (m == diamondc || m == ironc || m == chainc || m == leatherc) {
				if (app.getStringList("Tipsy").contains("Chestplate")) {
					if (!(oldmeta.hasLore())) {
						newmeta.setLore(Arrays.asList(tipsyE3));
					} else if (oldmeta.hasLore()) {
						oldlore.add(tipsyE3);
						newmeta.setLore(oldlore);
					}
					item.setItemMeta(newmeta);
					p.getInventory().addItem(item);
					p.setLevel(plevel - threeCost);
					anvil.clear();
					p.setItemOnCursor(clear);
					p.closeInventory();
					if (!(sendmsg.equals("none")))
					p.sendMessage(sendmsg.replace("{enchant}", usedtipsy3.replace("&c", "")));
				}
			} else if (m == diamondl || m == ironl || m == chainl || m == leatherl) {
				if (app.getStringList("Tipsy").contains("Leggings")) {
					if (!(oldmeta.hasLore())) {
						newmeta.setLore(Arrays.asList(tipsyE3));
					} else if (oldmeta.hasLore()) {
						oldlore.add(tipsyE3);
						newmeta.setLore(oldlore);
					}
					item.setItemMeta(newmeta);
					p.getInventory().addItem(item);
					p.setLevel(plevel - threeCost);
					anvil.clear();
					p.setItemOnCursor(clear);
					p.closeInventory();
					if (!(sendmsg.equals("none")))
					p.sendMessage(sendmsg.replace("{enchant}", usedtipsy3.replace("&c", "")));
				}
			} else if (m == diamondb || m == ironb || m == chainb || m == leatherb) {
				if (app.getStringList("Tipsy").contains("Boots")) {
					if (!(oldmeta.hasLore())) {
						newmeta.setLore(Arrays.asList(tipsyE3));
					} else if (oldmeta.hasLore()) {
						oldlore.add(tipsyE3);
						newmeta.setLore(oldlore);
					}
					item.setItemMeta(newmeta);
					p.getInventory().addItem(item);
					p.setLevel(plevel - threeCost);
					anvil.clear();
					p.setItemOnCursor(clear);
					p.closeInventory();
					if (!(sendmsg.equals("none")))
					p.sendMessage(sendmsg.replace("{enchant}", usedtipsy3.replace("&c", "")));
				}
			}
		} else if (lore.contains(vanishE3)) {
			if (oldmeta.hasLore()) {
				if (oldlore.contains(vanishE3)) {
					return;
				} else if (oldlore.contains(vanishE2)) {
					if (m == diamondh || m == ironh || m == chainh || m == leatherh) {
						if (app.getStringList("Vanish").contains("Helmet")) {
							oldlore.remove(vanishE2);
							oldlore.add(vanishE3);
							newmeta.setLore(oldlore);
							item.setItemMeta(newmeta);
							p.getInventory().addItem(item);
							p.setLevel(plevel - threeCost);
							anvil.clear();
							p.setItemOnCursor(clear);
							p.closeInventory();
							if (!(sendmsg.equals("none")))
							p.sendMessage(sendmsg.replace("{enchant}", usedvanish3.replace("&c", "")));
						}
					} else if (m == diamondc || m == ironc || m == chainc || m == leatherc) {
						if (app.getStringList("Vanish").contains("Chestplate")) {
							oldlore.remove(vanishE2);
							oldlore.add(vanishE3);
							newmeta.setLore(oldlore);
							item.setItemMeta(newmeta);
							p.getInventory().addItem(item);
							p.setLevel(plevel - threeCost);
							anvil.clear();
							p.setItemOnCursor(clear);
							p.closeInventory();
							if (!(sendmsg.equals("none")))
							p.sendMessage(sendmsg.replace("{enchant}", usedvanish3.replace("&c", "")));
						}
					} else if (m == diamondl || m == ironl || m == chainl || m == leatherl) {
						if (app.getStringList("Vanish").contains("Leggings")) {
							oldlore.remove(vanishE2);
							oldlore.add(vanishE3);
							newmeta.setLore(oldlore);
							item.setItemMeta(newmeta);
							p.getInventory().addItem(item);
							p.setLevel(plevel - threeCost);
							anvil.clear();
							p.setItemOnCursor(clear);
							p.closeInventory();
							if (!(sendmsg.equals("none")))
							p.sendMessage(sendmsg.replace("{enchant}", usedvanish3.replace("&c", "")));
						}
					} else if (m == diamondb || m == ironb || m == chainb || m == leatherb) {
						if (app.getStringList("Vanish").contains("Boots")) {
							oldlore.remove(vanishE2);
							oldlore.add(vanishE3);
							newmeta.setLore(oldlore);
							item.setItemMeta(newmeta);
							p.getInventory().addItem(item);
							p.setLevel(plevel - threeCost);
							anvil.clear();
							p.setItemOnCursor(clear);
							p.closeInventory();
							if (!(sendmsg.equals("none")))
							p.sendMessage(sendmsg.replace("{enchant}", usedvanish3.replace("&c", "")));
						}
					}
					return;
				} else if (oldlore.contains(vanishE)) {
					if (m == diamondh || m == ironh || m == chainh || m == leatherh) {
						if (app.getStringList("Vanish").contains("Helmet")) {
							oldlore.remove(vanishE);
							oldlore.add(vanishE3);
							newmeta.setLore(oldlore);
							item.setItemMeta(newmeta);
							p.getInventory().addItem(item);
							p.setLevel(plevel - threeCost);
							anvil.clear();
							p.setItemOnCursor(clear);
							p.closeInventory();
							if (!(sendmsg.equals("none")))
							p.sendMessage(sendmsg.replace("{enchant}", usedvanish3.replace("&c", "")));
						}
					} else if (m == diamondc || m == ironc || m == chainc || m == leatherc) {
						if (app.getStringList("Vanish").contains("Chestplate")) {
							oldlore.remove(vanishE);
							oldlore.add(vanishE3);
							newmeta.setLore(oldlore);
							item.setItemMeta(newmeta);
							p.getInventory().addItem(item);
							p.setLevel(plevel - threeCost);
							anvil.clear();
							p.setItemOnCursor(clear);
							p.closeInventory();
							if (!(sendmsg.equals("none")))
							p.sendMessage(sendmsg.replace("{enchant}", usedvanish3.replace("&c", "")));
						}
					} else if (m == diamondl || m == ironl || m == chainl || m == leatherl) {
						if (app.getStringList("Vanish").contains("Leggings")) {
							oldlore.remove(vanishE);
							oldlore.add(vanishE3);
							newmeta.setLore(oldlore);
							item.setItemMeta(newmeta);
							p.getInventory().addItem(item);
							p.setLevel(plevel - threeCost);
							anvil.clear();
							p.setItemOnCursor(clear);
							p.closeInventory();
							if (!(sendmsg.equals("none")))
							p.sendMessage(sendmsg.replace("{enchant}", usedvanish3.replace("&c", "")));
						}
					} else if (m == diamondb || m == ironb || m == chainb || m == leatherb) {
						if (app.getStringList("Vanish").contains("Boots")) {
							oldlore.remove(vanishE);
							oldlore.add(vanishE3);
							newmeta.setLore(oldlore);
							item.setItemMeta(newmeta);
							p.getInventory().addItem(item);
							p.setLevel(plevel - threeCost);
							anvil.clear();
							p.setItemOnCursor(clear);
							p.closeInventory();
							if (!(sendmsg.equals("none")))
							p.sendMessage(sendmsg.replace("{enchant}", usedvanish3.replace("&c", "")));
						}
					}
					return;
				}
			}
			if (enchants + loreLines >= enchantLimit) {
				if (!(toomanyenchantsmsg.equals("none")))
				p.sendMessage(toomanyenchantsmsg);
				return;
			}
			if (m == diamondh || m == ironh || m == chainh || m == leatherh) {
				if (app.getStringList("Vanish").contains("Helmet")) {
					if (!(oldmeta.hasLore())) {
						newmeta.setLore(Arrays.asList(vanishE3));
					} else if (oldmeta.hasLore()) {
						oldlore.add(vanishE3);
						newmeta.setLore(oldlore);
					}
					item.setItemMeta(newmeta);
					p.getInventory().addItem(item);
					p.setLevel(plevel - threeCost);
					anvil.clear();
					p.setItemOnCursor(clear);
					p.closeInventory();
					if (!(sendmsg.equals("none")))
					p.sendMessage(sendmsg.replace("{enchant}", usedvanish3.replace("&c", "")));
				}
			} else if (m == diamondc || m == ironc || m == chainc || m == leatherc) {
				if (app.getStringList("Vanish").contains("Chestplate")) {
					if (!(oldmeta.hasLore())) {
						newmeta.setLore(Arrays.asList(vanishE3));
					} else if (oldmeta.hasLore()) {
						oldlore.add(vanishE3);
						newmeta.setLore(oldlore);
					}
					item.setItemMeta(newmeta);
					p.getInventory().addItem(item);
					p.setLevel(plevel - threeCost);
					anvil.clear();
					p.setItemOnCursor(clear);
					p.closeInventory();
					if (!(sendmsg.equals("none")))
					p.sendMessage(sendmsg.replace("{enchant}", usedvanish3.replace("&c", "")));
				}
			} else if (m == diamondl || m == ironl || m == chainl || m == leatherl) {
				if (app.getStringList("Vanish").contains("Leggings")) {
					if (!(oldmeta.hasLore())) {
						newmeta.setLore(Arrays.asList(vanishE3));
					} else if (oldmeta.hasLore()) {
						oldlore.add(vanishE3);
						newmeta.setLore(oldlore);
					}
					item.setItemMeta(newmeta);
					p.getInventory().addItem(item);
					p.setLevel(plevel - threeCost);
					anvil.clear();
					p.setItemOnCursor(clear);
					p.closeInventory();
					if (!(sendmsg.equals("none")))
					p.sendMessage(sendmsg.replace("{enchant}", usedvanish3.replace("&c", "")));
				}
			} else if (m == diamondb || m == ironb || m == chainb || m == leatherb) {
				if (app.getStringList("Vanish").contains("Boots")) {
					if (!(oldmeta.hasLore())) {
						newmeta.setLore(Arrays.asList(vanishE3));
					} else if (oldmeta.hasLore()) {
						oldlore.add(vanishE3);
						newmeta.setLore(oldlore);
					}
					item.setItemMeta(newmeta);
					p.getInventory().addItem(item);
					p.setLevel(plevel - threeCost);
					anvil.clear();
					p.setItemOnCursor(clear);
					p.closeInventory();
					if (!(sendmsg.equals("none")))
					p.sendMessage(sendmsg.replace("{enchant}", usedvanish3.replace("&c", "")));
				}
			}
		} else if (lore.contains(wearyE3)) {
			if (oldmeta.hasLore()) {
				if (oldlore.contains(wearyE3)) {
					return;
				} else if (oldlore.contains(wearyE2)) {
					if (m == diamondh || m == ironh || m == chainh || m == leatherh) {
						if (app.getStringList("Weary").contains("Helmet")) {
							oldlore.remove(wearyE2);
							oldlore.add(wearyE3);
							newmeta.setLore(oldlore);
							item.setItemMeta(newmeta);
							p.getInventory().addItem(item);
							p.setLevel(plevel - threeCost);
							anvil.clear();
							p.setItemOnCursor(clear);
							p.closeInventory();
							if (!(sendmsg.equals("none")))
							p.sendMessage(sendmsg.replace("{enchant}", usedweary3.replace("&c", "")));
						}
					} else if (m == diamondc || m == ironc || m == chainc || m == leatherc) {
						if (app.getStringList("Weary").contains("Chestplate")) {
							oldlore.remove(wearyE2);
							oldlore.add(wearyE3);
							newmeta.setLore(oldlore);
							item.setItemMeta(newmeta);
							p.getInventory().addItem(item);
							p.setLevel(plevel - threeCost);
							anvil.clear();
							p.setItemOnCursor(clear);
							p.closeInventory();
							if (!(sendmsg.equals("none")))
							p.sendMessage(sendmsg.replace("{enchant}", usedweary3.replace("&c", "")));
						}
					} else if (m == diamondl || m == ironl || m == chainl || m == leatherl) {
						if (app.getStringList("Weary").contains("Leggings")) {
							oldlore.remove(wearyE2);
							oldlore.add(wearyE3);
							newmeta.setLore(oldlore);
							item.setItemMeta(newmeta);
							p.getInventory().addItem(item);
							p.setLevel(plevel - threeCost);
							anvil.clear();
							p.setItemOnCursor(clear);
							p.closeInventory();
							if (!(sendmsg.equals("none")))
							p.sendMessage(sendmsg.replace("{enchant}", usedweary3.replace("&c", "")));
						}
					} else if (m == diamondb || m == ironb || m == chainb || m == leatherb) {
						if (app.getStringList("Weary").contains("Boots")) {
							oldlore.remove(wearyE2);
							oldlore.add(wearyE3);
							newmeta.setLore(oldlore);
							item.setItemMeta(newmeta);
							p.getInventory().addItem(item);
							p.setLevel(plevel - threeCost);
							anvil.clear();
							p.setItemOnCursor(clear);
							p.closeInventory();
							if (!(sendmsg.equals("none")))
							p.sendMessage(sendmsg.replace("{enchant}", usedweary3.replace("&c", "")));
						}
					}
					return;
				} else if (oldlore.contains(wearyE)) {
					if (m == diamondh || m == ironh || m == chainh || m == leatherh) {
						if (app.getStringList("Weary").contains("Helmet")) {
							oldlore.remove(wearyE);
							oldlore.add(wearyE3);
							newmeta.setLore(oldlore);
							item.setItemMeta(newmeta);
							p.getInventory().addItem(item);
							p.setLevel(plevel - threeCost);
							anvil.clear();
							p.setItemOnCursor(clear);
							p.closeInventory();
							if (!(sendmsg.equals("none")))
							p.sendMessage(sendmsg.replace("{enchant}", usedweary3.replace("&c", "")));
						}
					} else if (m == diamondc || m == ironc || m == chainc || m == leatherc) {
						if (app.getStringList("Weary").contains("Chestplate")) {
							oldlore.remove(wearyE);
							oldlore.add(wearyE3);
							newmeta.setLore(oldlore);
							item.setItemMeta(newmeta);
							p.getInventory().addItem(item);
							p.setLevel(plevel - threeCost);
							anvil.clear();
							p.setItemOnCursor(clear);
							p.closeInventory();
							if (!(sendmsg.equals("none")))
							p.sendMessage(sendmsg.replace("{enchant}", usedweary3.replace("&c", "")));
						}
					} else if (m == diamondl || m == ironl || m == chainl || m == leatherl) {
						if (app.getStringList("Weary").contains("Leggings")) {
							oldlore.remove(wearyE);
							oldlore.add(wearyE3);
							newmeta.setLore(oldlore);
							item.setItemMeta(newmeta);
							p.getInventory().addItem(item);
							p.setLevel(plevel - threeCost);
							anvil.clear();
							p.setItemOnCursor(clear);
							p.closeInventory();
							if (!(sendmsg.equals("none")))
							p.sendMessage(sendmsg.replace("{enchant}", usedweary3.replace("&c", "")));
						}
					} else if (m == diamondb || m == ironb || m == chainb || m == leatherb) {
						if (app.getStringList("Weary").contains("Boots")) {
							oldlore.remove(wearyE);
							oldlore.add(wearyE3);
							newmeta.setLore(oldlore);
							item.setItemMeta(newmeta);
							p.getInventory().addItem(item);
							p.setLevel(plevel - threeCost);
							anvil.clear();
							p.setItemOnCursor(clear);
							p.closeInventory();
							if (!(sendmsg.equals("none")))
							p.sendMessage(sendmsg.replace("{enchant}", usedweary3.replace("&c", "")));
						}
					}
					return;
				}
			}
			if (enchants + loreLines >= enchantLimit) {
				if (!(toomanyenchantsmsg.equals("none")))
				p.sendMessage(toomanyenchantsmsg);
				return;
			}
			if (m == diamondh || m == ironh || m == chainh || m == leatherh) {
				if (app.getStringList("Weary").contains("Helmet")) {
					if (!(oldmeta.hasLore())) {
						newmeta.setLore(Arrays.asList(wearyE3));
					} else if (oldmeta.hasLore()) {
						oldlore.add(wearyE3);
						newmeta.setLore(oldlore);
					}
					item.setItemMeta(newmeta);
					p.getInventory().addItem(item);
					p.setLevel(plevel - threeCost);
					anvil.clear();
					p.setItemOnCursor(clear);
					p.closeInventory();
					if (!(sendmsg.equals("none")))
					p.sendMessage(sendmsg.replace("{enchant}", usedweary3.replace("&c", "")));
				}
			} else if (m == diamondc || m == ironc || m == chainc || m == leatherc) {
				if (app.getStringList("Weary").contains("Chestplate")) {
					if (!(oldmeta.hasLore())) {
						newmeta.setLore(Arrays.asList(wearyE3));
					} else if (oldmeta.hasLore()) {
						oldlore.add(wearyE3);
						newmeta.setLore(oldlore);
					}
					item.setItemMeta(newmeta);
					p.getInventory().addItem(item);
					p.setLevel(plevel - threeCost);
					anvil.clear();
					p.setItemOnCursor(clear);
					p.closeInventory();
					if (!(sendmsg.equals("none")))
					p.sendMessage(sendmsg.replace("{enchant}", usedweary3.replace("&c", "")));
				}
			} else if (m == diamondl || m == ironl || m == chainl || m == leatherl) {
				if (app.getStringList("Weary").contains("Leggings")) {
					if (!(oldmeta.hasLore())) {
						newmeta.setLore(Arrays.asList(wearyE3));
					} else if (oldmeta.hasLore()) {
						oldlore.add(wearyE3);
						newmeta.setLore(oldlore);
					}
					item.setItemMeta(newmeta);
					p.getInventory().addItem(item);
					p.setLevel(plevel - threeCost);
					anvil.clear();
					p.setItemOnCursor(clear);
					p.closeInventory();
					if (!(sendmsg.equals("none")))
					p.sendMessage(sendmsg.replace("{enchant}", usedweary3.replace("&c", "")));
				}
			} else if (m == diamondb || m == ironb || m == chainb || m == leatherb) {
				if (app.getStringList("Weary").contains("Boots")) {
					if (!(oldmeta.hasLore())) {
						newmeta.setLore(Arrays.asList(wearyE3));
					} else if (oldmeta.hasLore()) {
						oldlore.add(wearyE3);
						newmeta.setLore(oldlore);
					}
					item.setItemMeta(newmeta);
					p.getInventory().addItem(item);
					p.setLevel(plevel - threeCost);
					anvil.clear();
					p.setItemOnCursor(clear);
					p.closeInventory();
					if (!(sendmsg.equals("none")))
					p.sendMessage(sendmsg.replace("{enchant}", usedweary3.replace("&c", "")));
				}
			}
		} else if (lore.contains(lightningE3)) {
			if (oldmeta.hasLore()) {
				if (oldlore.contains(lightningE3)) {
					return;
				} else if (oldlore.contains(lightningE2)) {
					if (m == Material.BOW) {
						oldlore.remove(lightningE2);
						oldlore.add(lightningE3);
						newmeta.setLore(oldlore);
						item.setItemMeta(newmeta);
						p.getInventory().addItem(item);
						p.setLevel(plevel - threeCost);
						anvil.clear();
						p.setItemOnCursor(clear);
						p.closeInventory();
						if (!(sendmsg.equals("none")))
						p.sendMessage(sendmsg.replace("{enchant}", usedlightning3.replace("&c", "")));
						return;
					}
				} else if (oldlore.contains(lightningE)) {
					if (m == Material.BOW) {
						oldlore.remove(lightningE);
						oldlore.add(lightningE3);
						newmeta.setLore(oldlore);
						item.setItemMeta(newmeta);
						p.getInventory().addItem(item);
						p.setLevel(plevel - threeCost);
						anvil.clear();
						p.setItemOnCursor(clear);
						p.closeInventory();
						if (!(sendmsg.equals("none")))
						p.sendMessage(sendmsg.replace("{enchant}", usedlightning3.replace("&c", "")));
						return;
					}
				}
			}
			if (enchants + loreLines >= enchantLimit) {
				if (!(toomanyenchantsmsg.equals("none")))
				p.sendMessage(toomanyenchantsmsg);
				return;
			}
			if (m == Material.BOW) {
				if (!(oldmeta.hasLore())) {
					newmeta.setLore(Arrays.asList(lightningE3));
				} else if (oldmeta.hasLore()) {
					oldlore.add(lightningE3);
					newmeta.setLore(oldlore);
				}
				item.setItemMeta(newmeta);
				p.getInventory().addItem(item);
				p.setLevel(plevel - threeCost);
				anvil.clear();
				p.setItemOnCursor(clear);
				p.closeInventory();
				if (!(sendmsg.equals("none")))
				p.sendMessage(sendmsg.replace("{enchant}", usedlightning3.replace("&c", "")));
			}
		} else if (lore.contains(thunderousE3)) {
			if (oldmeta.hasLore()) {
				if (oldlore.contains(thunderousE3)) {
					return;
				} else if (oldlore.contains(thunderousE2)) {
					if (m == diamonds || m == irons || m == golds || m == stones || m == woods) {
						if (app.getStringList("Thunderous").contains("Sword")) {
							oldlore.remove(thunderousE2);
							oldlore.add(thunderousE3);
							newmeta.setLore(oldlore);
							item.setItemMeta(newmeta);
							p.getInventory().addItem(item);
							p.setLevel(plevel - threeCost);
							anvil.clear();
							p.setItemOnCursor(clear);
							p.closeInventory();
							if (!(sendmsg.equals("none")))
							p.sendMessage(sendmsg.replace("{enchant}", usedthunderous3.replace("&c", "")));
						}
					} else if (m == diamonda || m == irona || m == golda || m == stonea || m == wooda) {
						if (app.getStringList("Thunderous").contains("Axe")) {
							oldlore.remove(thunderousE2);
							oldlore.add(thunderousE3);
							newmeta.setLore(oldlore);
							item.setItemMeta(newmeta);
							p.getInventory().addItem(item);
							p.setLevel(plevel - threeCost);
							anvil.clear();
							p.setItemOnCursor(clear);
							p.closeInventory();
							if (!(sendmsg.equals("none")))
							p.sendMessage(sendmsg.replace("{enchant}", usedthunderous3.replace("&c", "")));
						}
					}
					return;
				} else if (oldlore.contains(thunderousE)) {
					if (m == diamonds || m == irons || m == golds || m == stones || m == woods) {
						if (app.getStringList("Thunderous").contains("Sword")) {
							oldlore.remove(thunderousE);
							oldlore.add(thunderousE3);
							newmeta.setLore(oldlore);
							item.setItemMeta(newmeta);
							p.getInventory().addItem(item);
							p.setLevel(plevel - threeCost);
							anvil.clear();
							p.setItemOnCursor(clear);
							p.closeInventory();
							if (!(sendmsg.equals("none")))
							p.sendMessage(sendmsg.replace("{enchant}", usedthunderous3.replace("&c", "")));
						}
					} else if (m == diamonda || m == irona || m == golda || m == stonea || m == wooda) {
						if (app.getStringList("Thunderous").contains("Axe")) {
							oldlore.remove(thunderousE);
							oldlore.add(thunderousE3);
							newmeta.setLore(oldlore);
							item.setItemMeta(newmeta);
							p.getInventory().addItem(item);
							p.setLevel(plevel - threeCost);
							anvil.clear();
							p.setItemOnCursor(clear);
							p.closeInventory();
							if (!(sendmsg.equals("none")))
							p.sendMessage(sendmsg.replace("{enchant}", usedthunderous3.replace("&c", "")));
						}
					}
					return;
				}
			}
			if (enchants + loreLines >= enchantLimit) {
				if (!(toomanyenchantsmsg.equals("none")))
				p.sendMessage(toomanyenchantsmsg);
				return;
			}
			if (m == diamonds || m == irons || m == golds || m == stones || m == woods) {
				if (app.getStringList("Thunderous").contains("Sword")) {
					if (!(oldmeta.hasLore())) {
						newmeta.setLore(Arrays.asList(thunderousE3));
					} else if (oldmeta.hasLore()) {
						oldlore.add(thunderousE3);
						newmeta.setLore(oldlore);
					}
					item.setItemMeta(newmeta);
					p.getInventory().addItem(item);
					p.setLevel(plevel - threeCost);
					anvil.clear();
					p.setItemOnCursor(clear);
					p.closeInventory();
					if (!(sendmsg.equals("none")))
					p.sendMessage(sendmsg.replace("{enchant}", usedthunderous3.replace("&c", "")));
				}
			} else if (m == diamonda || m == irona || m == golda || m == stonea || m == wooda) {
				if (app.getStringList("Thunderous").contains("Axe")) {
					if (!(oldmeta.hasLore())) {
						newmeta.setLore(Arrays.asList(thunderousE3));
					} else if (oldmeta.hasLore()) {
						oldlore.add(thunderousE3);
						newmeta.setLore(oldlore);
					}
					item.setItemMeta(newmeta);
					p.getInventory().addItem(item);
					p.setLevel(plevel - threeCost);
					anvil.clear();
					p.setItemOnCursor(clear);
					p.closeInventory();
					if (!(sendmsg.equals("none")))
					p.sendMessage(sendmsg.replace("{enchant}", usedthunderous3.replace("&c", "")));
				}
			}
		} else if (lore.contains(hasteE3)) {
			if (oldmeta.hasLore()) {
				if (oldlore.contains(hasteE3)) {
					return;
				} else if (oldlore.contains(hasteE2)) {
					if (m == diamondp || m == ironp || m == goldp || m == stonep || m == woodp) {
						if (app.getStringList("Haste").contains("Pickaxe")) {
							oldlore.remove(hasteE2);
							oldlore.add(hasteE3);
							newmeta.setLore(oldlore);
							item.setItemMeta(newmeta);
							p.getInventory().addItem(item);
							p.setLevel(plevel - threeCost);
							anvil.clear();
							p.setItemOnCursor(clear);
							p.closeInventory();
							if (!(sendmsg.equals("none")))
							p.sendMessage(sendmsg.replace("{enchant}", usedhaste3.replace("&c", "")));
						}
					} else if (m == diamondsh || m == ironsh || m == goldsh || m == stonesh
							|| m == woodsh) {
						if (app.getStringList("Haste").contains("Shovel")) {
							oldlore.remove(hasteE2);
							oldlore.add(hasteE3);
							newmeta.setLore(oldlore);
							item.setItemMeta(newmeta);
							p.getInventory().addItem(item);
							p.setLevel(plevel - threeCost);
							anvil.clear();
							p.setItemOnCursor(clear);
							p.closeInventory();
							if (!(sendmsg.equals("none")))
							p.sendMessage(sendmsg.replace("{enchant}", usedhaste3.replace("&c", "")));
						}
					}
					return;
				} else if (oldlore.contains(hasteE)) {
					if (m == diamondp || m == ironp || m == goldp || m == stonep || m == woodp) {
						if (app.getStringList("Haste").contains("Pickaxe")) {
							oldlore.remove(hasteE);
							oldlore.add(hasteE3);
							newmeta.setLore(oldlore);
							item.setItemMeta(newmeta);
							p.getInventory().addItem(item);
							p.setLevel(plevel - threeCost);
							anvil.clear();
							p.setItemOnCursor(clear);
							p.closeInventory();
							if (!(sendmsg.equals("none")))
							p.sendMessage(sendmsg.replace("{enchant}", usedhaste3.replace("&c", "")));
						}
					} else if (m == diamondsh || m == ironsh || m == goldsh || m == stonesh
							|| m == woodsh) {
						if (app.getStringList("Haste").contains("Shovel")) {
							oldlore.remove(hasteE);
							oldlore.add(hasteE3);
							newmeta.setLore(oldlore);
							item.setItemMeta(newmeta);
							p.getInventory().addItem(item);
							p.setLevel(plevel - threeCost);
							anvil.clear();
							p.setItemOnCursor(clear);
							p.closeInventory();
							if (!(sendmsg.equals("none")))
							p.sendMessage(sendmsg.replace("{enchant}", usedhaste3.replace("&c", "")));
						}
					}
					return;
				}
			}
			if (enchants + loreLines >= enchantLimit) {
				if (!(toomanyenchantsmsg.equals("none")))
				p.sendMessage(toomanyenchantsmsg);
				return;
			}
			if (m == diamondp || m == ironp || m == goldp || m == stonep || m == woodp) {
				if (app.getStringList("Haste").contains("Pickaxe")) {
					if (!(oldmeta.hasLore())) {
						newmeta.setLore(Arrays.asList(hasteE3));
					} else if (oldmeta.hasLore()) {
						oldlore.add(hasteE3);
						newmeta.setLore(oldlore);
					}
					item.setItemMeta(newmeta);
					p.getInventory().addItem(item);
					p.setLevel(plevel - threeCost);
					anvil.clear();
					p.setItemOnCursor(clear);
					p.closeInventory();
					if (!(sendmsg.equals("none")))
					p.sendMessage(sendmsg.replace("{enchant}", usedhaste3.replace("&c", "")));
				}
			} else if (m == diamondsh || m == ironsh || m == goldsh || m == stonesh
					|| m == woodsh) {
				if (app.getStringList("Haste").contains("Shovel")) {
					if (!(oldmeta.hasLore())) {
						newmeta.setLore(Arrays.asList(hasteE3));
					} else if (oldmeta.hasLore()) {
						oldlore.add(hasteE3);
						newmeta.setLore(oldlore);
					}
					item.setItemMeta(newmeta);
					p.getInventory().addItem(item);
					p.setLevel(plevel - threeCost);
					anvil.clear();
					p.setItemOnCursor(clear);
					p.closeInventory();
					if (!(sendmsg.equals("none")))
					p.sendMessage(sendmsg.replace("{enchant}", usedhaste3.replace("&c", "")));
				}
			}
		} else if (lore.contains(experienceE3)) {
			if (oldmeta.hasLore()) {
				if (oldlore.contains(experienceE3)) {
					return;
				} else if (oldlore.contains(experienceE2)) {
					if (m == diamondp || m == ironp || m == goldp || m == stonep || m == woodp) {
						oldlore.remove(experienceE2);
						oldlore.add(experienceE3);
						newmeta.setLore(oldlore);
						item.setItemMeta(newmeta);
						p.getInventory().addItem(item);
						p.setLevel(plevel - threeCost);
						anvil.clear();
						p.setItemOnCursor(clear);
						p.closeInventory();
						if (!(sendmsg.equals("none")))
						p.sendMessage(sendmsg.replace("{enchant}", usedexperience3.replace("&c", "")));
						return;
					}
				} else if (oldlore.contains(experienceE)) {
					if (m == diamondp || m == ironp || m == goldp || m == stonep || m == woodp) {
						oldlore.remove(experienceE);
						oldlore.add(experienceE3);
						newmeta.setLore(oldlore);
						item.setItemMeta(newmeta);
						p.getInventory().addItem(item);
						p.setLevel(plevel - threeCost);
						anvil.clear();
						p.setItemOnCursor(clear);
						p.closeInventory();
						if (!(sendmsg.equals("none")))
						p.sendMessage(sendmsg.replace("{enchant}", usedexperience3.replace("&c", "")));
						return;
					}
				}
			}
			if (m == diamondp || m == ironp || m == goldp || m == stonep || m == woodp) {
				if (!(oldmeta.hasLore())) {
					newmeta.setLore(Arrays.asList(experienceE3));
				} else if (oldmeta.hasLore()) {
					oldlore.add(experienceE3);
					newmeta.setLore(oldlore);
				}
				item.setItemMeta(newmeta);
				p.getInventory().addItem(item);
				p.setLevel(plevel - threeCost);
				anvil.clear();
				p.setItemOnCursor(clear);
				p.closeInventory();
				if (!(sendmsg.equals("none")))
				p.sendMessage(sendmsg.replace("{enchant}", usedexperience3.replace("&c", "")));
			}
		} else if (lore.contains(obsidiandestroyerE3)) {
			if (oldmeta.hasLore()) {
				if (oldlore.contains(obsidiandestroyerE3)) {
					return;
				} else if (oldlore.contains(obsidiandestroyerE2)) {
					if (m == diamondp || m == ironp || m == goldp || m == stonep || m == woodp) {
						oldlore.remove(obsidiandestroyerE2);
						oldlore.add(obsidiandestroyerE3);
						newmeta.setLore(oldlore);
						item.setItemMeta(newmeta);
						p.getInventory().addItem(item);
						p.setLevel(plevel - threeCost);
						anvil.clear();
						p.setItemOnCursor(clear);
						p.closeInventory();
						if (!(sendmsg.equals("none")))
						p.sendMessage(sendmsg.replace("{enchant}", usedobsidiandestroyer3.replace("&c", "")));
						return;
					}
				} else if (oldlore.contains(obsidiandestroyerE)) {
					if (m == diamondp || m == ironp || m == goldp || m == stonep || m == woodp) {
						oldlore.remove(obsidiandestroyerE);
						oldlore.add(obsidiandestroyerE3);
						newmeta.setLore(oldlore);
						item.setItemMeta(newmeta);
						p.getInventory().addItem(item);
						p.setLevel(plevel - threeCost);
						anvil.clear();
						p.setItemOnCursor(clear);
						p.closeInventory();
						if (!(sendmsg.equals("none")))
						p.sendMessage(sendmsg.replace("{enchant}", usedobsidiandestroyer3.replace("&c", "")));
						return;
					}
				}
			}
			if (enchants + loreLines >= enchantLimit) {
				if (!(toomanyenchantsmsg.equals("none")))
				p.sendMessage(toomanyenchantsmsg);
				return;
			}
			if (m == diamondp || m == ironp || m == goldp || m == stonep || m == woodp) {
				if (!(oldmeta.hasLore())) {
					newmeta.setLore(Arrays.asList(obsidiandestroyerE3));
				} else if (oldmeta.hasLore()) {
					oldlore.add(obsidiandestroyerE3);
					newmeta.setLore(oldlore);
				}
				item.setItemMeta(newmeta);
				p.getInventory().addItem(item);
				p.setLevel(plevel - threeCost);
				anvil.clear();
				p.setItemOnCursor(clear);
				p.closeInventory();
				if (!(sendmsg.equals("none")))
				p.sendMessage(sendmsg.replace("{enchant}", usedobsidiandestroyer3.replace("&c", "")));
			}
		} else if (lore.contains(thiefE3)) {
			if (oldmeta.hasLore()) {
				if (oldlore.contains(thiefE3)) {
					return;
				} else if (oldlore.contains(thiefE2)) {
					if (m == Material.BOW) {
						oldlore.remove(thiefE2);
						oldlore.add(thiefE3);
						newmeta.setLore(oldlore);
						item.setItemMeta(newmeta);
						p.getInventory().addItem(item);
						p.setLevel(plevel - threeCost);
						anvil.clear();
						p.setItemOnCursor(clear);
						p.closeInventory();
						if (!(sendmsg.equals("none")))
						p.sendMessage(sendmsg.replace("{enchant}", usedthief3.replace("&c", "")));
						return;
					}
				} else if (oldlore.contains(thiefE)) {
					if (m == Material.BOW) {
						oldlore.remove(thiefE);
						oldlore.add(thiefE3);
						newmeta.setLore(oldlore);
						item.setItemMeta(newmeta);
						p.getInventory().addItem(item);
						p.setLevel(plevel - threeCost);
						anvil.clear();
						p.setItemOnCursor(clear);
						p.closeInventory();
						if (!(sendmsg.equals("none")))
						p.sendMessage(sendmsg.replace("{enchant}", usedthief3.replace("&c", "")));
						return;
					}
				}
			}
			if (enchants + loreLines >= enchantLimit) {
				if (!(toomanyenchantsmsg.equals("none")))
				p.sendMessage(toomanyenchantsmsg);
				return;
			}
			if (m == Material.BOW) {
				if (!(oldmeta.hasLore())) {
					newmeta.setLore(Arrays.asList(thiefE3));
				} else if (oldmeta.hasLore()) {
					oldlore.add(thiefE3);
					newmeta.setLore(oldlore);
				}
				item.setItemMeta(newmeta);
				p.getInventory().addItem(item);
				p.setLevel(plevel - threeCost);
				anvil.clear();
				p.setItemOnCursor(clear);
				p.closeInventory();
				if (!(sendmsg.equals("none")))
				p.sendMessage(sendmsg.replace("{enchant}", usedthief3.replace("&c", "")));
			}
		} else if (lore.contains(toughnessE3)) {
			if (oldmeta.hasLore()) {
				if (oldlore.contains(toughnessE3)) {
					return;
				} else if (oldlore.contains(toughnessE2)) {
					if (m == diamondh || m == ironh || m == chainh || m == leatherh) {
						if (app.getStringList("Toughness").contains("Helmet")) {
							oldlore.remove(toughnessE2);
							oldlore.add(toughnessE3);
							newmeta.setLore(oldlore);
							item.setItemMeta(newmeta);
							p.getInventory().addItem(item);
							p.setLevel(plevel - threeCost);
							anvil.clear();
							p.setItemOnCursor(clear);
							p.closeInventory();
							if (!(sendmsg.equals("none")))
							p.sendMessage(sendmsg.replace("{enchant}", usedtoughness3.replace("&c", "")));
						}
					} else if (m == diamondc || m == ironc || m == chainc || m == leatherc) {
						if (app.getStringList("Toughness").contains("Chestplate")) {
							oldlore.remove(toughnessE2);
							oldlore.add(toughnessE3);
							newmeta.setLore(oldlore);
							item.setItemMeta(newmeta);
							p.getInventory().addItem(item);
							p.setLevel(plevel - threeCost);
							anvil.clear();
							p.setItemOnCursor(clear);
							p.closeInventory();
							if (!(sendmsg.equals("none")))
							p.sendMessage(sendmsg.replace("{enchant}", usedtoughness3.replace("&c", "")));
						}
					} else if (m == diamondl || m == ironl || m == chainl || m == leatherl) {
						if (app.getStringList("Toughness").contains("Leggings")) {
							oldlore.remove(toughnessE2);
							oldlore.add(toughnessE3);
							newmeta.setLore(oldlore);
							item.setItemMeta(newmeta);
							p.getInventory().addItem(item);
							p.setLevel(plevel - threeCost);
							anvil.clear();
							p.setItemOnCursor(clear);
							p.closeInventory();
							if (!(sendmsg.equals("none")))
							p.sendMessage(sendmsg.replace("{enchant}", usedtoughness3.replace("&c", "")));
						}
					} else if (m == diamondb || m == ironb || m == chainb || m == leatherb) {
						if (app.getStringList("Toughness").contains("Boots")) {
							oldlore.remove(toughnessE2);
							oldlore.add(toughnessE3);
							newmeta.setLore(oldlore);
							item.setItemMeta(newmeta);
							p.getInventory().addItem(item);
							p.setLevel(plevel - threeCost);
							anvil.clear();
							p.setItemOnCursor(clear);
							p.closeInventory();
							if (!(sendmsg.equals("none")))
							p.sendMessage(sendmsg.replace("{enchant}", usedtoughness3.replace("&c", "")));
						}
					}
					return;
				} else if (oldlore.contains(toughnessE)) {
					if (m == diamondh || m == ironh || m == chainh || m == leatherh) {
						if (app.getStringList("Toughness").contains("Helmet")) {
							oldlore.remove(toughnessE);
							oldlore.add(toughnessE3);
							newmeta.setLore(oldlore);
							item.setItemMeta(newmeta);
							p.getInventory().addItem(item);
							p.setLevel(plevel - threeCost);
							anvil.clear();
							p.setItemOnCursor(clear);
							p.closeInventory();
							if (!(sendmsg.equals("none")))
							p.sendMessage(sendmsg.replace("{enchant}", usedtoughness3.replace("&c", "")));
						}
					} else if (m == diamondc || m == ironc || m == chainc || m == leatherc) {
						if (app.getStringList("Toughness").contains("Chestplate")) {
							oldlore.remove(toughnessE);
							oldlore.add(toughnessE3);
							newmeta.setLore(oldlore);
							item.setItemMeta(newmeta);
							p.getInventory().addItem(item);
							p.setLevel(plevel - threeCost);
							anvil.clear();
							p.setItemOnCursor(clear);
							p.closeInventory();
							if (!(sendmsg.equals("none")))
							p.sendMessage(sendmsg.replace("{enchant}", usedtoughness3.replace("&c", "")));
						}
					} else if (m == diamondl || m == ironl || m == chainl || m == leatherl) {
						if (app.getStringList("Toughness").contains("Leggings")) {
							oldlore.remove(toughnessE);
							oldlore.add(toughnessE3);
							newmeta.setLore(oldlore);
							item.setItemMeta(newmeta);
							p.getInventory().addItem(item);
							p.setLevel(plevel - threeCost);
							anvil.clear();
							p.setItemOnCursor(clear);
							p.closeInventory();
							if (!(sendmsg.equals("none")))
							p.sendMessage(sendmsg.replace("{enchant}", usedtoughness3.replace("&c", "")));
						}
					} else if (m == diamondb || m == ironb || m == chainb || m == leatherb) {
						if (app.getStringList("Toughness").contains("Boots")) {
							oldlore.remove(toughnessE);
							oldlore.add(toughnessE3);
							newmeta.setLore(oldlore);
							item.setItemMeta(newmeta);
							p.getInventory().addItem(item);
							p.setLevel(plevel - threeCost);
							anvil.clear();
							p.setItemOnCursor(clear);
							p.closeInventory();
							if (!(sendmsg.equals("none")))
							p.sendMessage(sendmsg.replace("{enchant}", usedtoughness3.replace("&c", "")));
						}
					}
					return;
				}
			}
			if (enchants + loreLines >= enchantLimit) {
				if (!(toomanyenchantsmsg.equals("none")))
				p.sendMessage(toomanyenchantsmsg);
				return;
			}
			if (m == diamondh || m == ironh || m == chainh || m == leatherh) {
				if (app.getStringList("Toughness").contains("Helmet")) {
					if (!(oldmeta.hasLore())) {
						newmeta.setLore(Arrays.asList(toughnessE3));
					} else if (oldmeta.hasLore()) {
						oldlore.add(toughnessE3);
						newmeta.setLore(oldlore);
					}
					item.setItemMeta(newmeta);
					p.getInventory().addItem(item);
					p.setLevel(plevel - threeCost);
					anvil.clear();
					p.setItemOnCursor(clear);
					p.closeInventory();
					if (!(sendmsg.equals("none")))
					p.sendMessage(sendmsg.replace("{enchant}", usedtoughness3.replace("&c", "")));
				}
			} else if (m == diamondc || m == ironc || m == chainc || m == leatherc) {
				if (app.getStringList("Toughness").contains("Chestplate")) {
					if (!(oldmeta.hasLore())) {
						newmeta.setLore(Arrays.asList(toughnessE3));
					} else if (oldmeta.hasLore()) {
						oldlore.add(toughnessE3);
						newmeta.setLore(oldlore);
					}
					item.setItemMeta(newmeta);
					p.getInventory().addItem(item);
					p.setLevel(plevel - threeCost);
					anvil.clear();
					p.setItemOnCursor(clear);
					p.closeInventory();
					if (!(sendmsg.equals("none")))
					p.sendMessage(sendmsg.replace("{enchant}", usedtoughness3.replace("&c", "")));
				}
			} else if (m == diamondl || m == ironl || m == chainl || m == leatherl) {
				if (app.getStringList("Toughness").contains("Leggings")) {
					if (!(oldmeta.hasLore())) {
						newmeta.setLore(Arrays.asList(toughnessE3));
					} else if (oldmeta.hasLore()) {
						oldlore.add(toughnessE3);
						newmeta.setLore(oldlore);
					}
					item.setItemMeta(newmeta);
					p.getInventory().addItem(item);
					p.setLevel(plevel - threeCost);
					anvil.clear();
					p.setItemOnCursor(clear);
					p.closeInventory();
					if (!(sendmsg.equals("none")))
					p.sendMessage(sendmsg.replace("{enchant}", usedtoughness3.replace("&c", "")));
				}
			} else if (m == diamondb || m == ironb || m == chainb || m == leatherb) {
				if (app.getStringList("Toughness").contains("Boots")) {
					if (!(oldmeta.hasLore())) {
						newmeta.setLore(Arrays.asList(toughnessE3));
					} else if (oldmeta.hasLore()) {
						oldlore.add(toughnessE3);
						newmeta.setLore(oldlore);
					}
					item.setItemMeta(newmeta);
					p.getInventory().addItem(item);
					p.setLevel(plevel - threeCost);
					anvil.clear();
					p.setItemOnCursor(clear);
					p.closeInventory();
					if (!(sendmsg.equals("none")))
					p.sendMessage(sendmsg.replace("{enchant}", usedtoughness3.replace("&c", "")));
				}
			}
		}
	}
}
