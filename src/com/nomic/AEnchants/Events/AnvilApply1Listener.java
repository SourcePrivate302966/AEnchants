package com.nomic.AEnchants.Events;

import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.configuration.ConfigurationSection;
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
		
        ConfigurationSection names = plugin.getConfig().getConfigurationSection("enchantNames");
		
		String usedarc = names.getConfigurationSection("Arc").getString("one");
		String arcE = ChatColor.translateAlternateColorCodes('&', usedarc);

		String usedbeast = names.getConfigurationSection("Beast").getString("one");
		String beastE = ChatColor.translateAlternateColorCodes('&', usedbeast);

		String usedblaze = names.getConfigurationSection("Blaze").getString("one");
		String blazeE = ChatColor.translateAlternateColorCodes('&', usedblaze);

		String usedbump = names.getConfigurationSection("Bump").getString("one");
		String bumpE = ChatColor.translateAlternateColorCodes('&', usedbump);

		String usedfeast = names.getConfigurationSection("Feast").getString("one");
		String feastE = ChatColor.translateAlternateColorCodes('&', usedfeast);

		String usedfish = names.getConfigurationSection("Fish").getString("one");
		String fishE = ChatColor.translateAlternateColorCodes('&', usedfish);

		String usedhealthboost = names.getConfigurationSection("HealthBoost").getString("one");
		String healthboostE = ChatColor.translateAlternateColorCodes('&', usedhealthboost);

		String usedimplode = names.getConfigurationSection("Implode").getString("one");
		String implodeE = ChatColor.translateAlternateColorCodes('&', usedimplode);

		String usedleaps = names.getConfigurationSection("Leaps").getString("one");
		String leapsE = ChatColor.translateAlternateColorCodes('&', usedleaps);

		String usedreborn = names.getConfigurationSection("Reborn").getString("one");
		String rebornE = ChatColor.translateAlternateColorCodes('&', usedreborn);

		String usedreplenish = names.getConfigurationSection("Replenish").getString("one");
		String replenishE = ChatColor.translateAlternateColorCodes('&', usedreplenish);

		String usedretreat = names.getConfigurationSection("Retreat").getString("one");
		String retreatE = ChatColor.translateAlternateColorCodes('&', usedretreat);

		String usedscoot = names.getConfigurationSection("Scoot").getString("one");
		String scootE = ChatColor.translateAlternateColorCodes('&', usedscoot);

		String usedsunlight = names.getConfigurationSection("Sunlight").getString("one");
		String sunlightE = ChatColor.translateAlternateColorCodes('&', usedsunlight);

		String usedtipsy = names.getConfigurationSection("Tipsy").getString("one");
		String tipsyE = ChatColor.translateAlternateColorCodes('&', usedtipsy);

		String usedvanish = names.getConfigurationSection("Vanish").getString("one");
		String vanishE = ChatColor.translateAlternateColorCodes('&', usedvanish);

		String usedweary = names.getConfigurationSection("Weary").getString("one");
		String wearyE = ChatColor.translateAlternateColorCodes('&', usedweary);

		String usedarchery = names.getConfigurationSection("Archery").getString("one");
		String archeryE = ChatColor.translateAlternateColorCodes('&', usedarchery);

		String usedconfusion = names.getConfigurationSection("Confusion").getString("one");
		String confusionE = ChatColor.translateAlternateColorCodes('&', usedconfusion);

		String usedlife = names.getConfigurationSection("Life").getString("one");
		String lifeE = ChatColor.translateAlternateColorCodes('&', usedlife);

		String usedlightning = names.getConfigurationSection("Lightning").getString("one");
		String lightningE = ChatColor.translateAlternateColorCodes('&', usedlightning);

		String usedlightsout = names.getConfigurationSection("LightsOut").getString("one");
		String lightsoutE = ChatColor.translateAlternateColorCodes('&', usedlightsout);

		String usedsoul = names.getConfigurationSection("Soul").getString("one");
		String soulE = ChatColor.translateAlternateColorCodes('&', usedsoul);

		String usedswordblock = names.getConfigurationSection("SwordBlock").getString("one");
		String swordblockE = ChatColor.translateAlternateColorCodes('&', usedswordblock);

		String usedthunderous = names.getConfigurationSection("Thunderous").getString("one");
		String thunderousE = ChatColor.translateAlternateColorCodes('&', usedthunderous);

		String usedblast = names.getConfigurationSection("Blast").getString("one");
		String blastE = ChatColor.translateAlternateColorCodes('&', usedblast);

		String usedexperience = names.getConfigurationSection("Experience").getString("one");
		String experienceE = ChatColor.translateAlternateColorCodes('&', usedexperience);

		String usedhaste = names.getConfigurationSection("Haste").getString("one");
		String hasteE = ChatColor.translateAlternateColorCodes('&', usedhaste);

		String usedobsidiandestroyer = names.getConfigurationSection("ObsidianDestroyer").getString("one");
		String obsidiandestroyerE = ChatColor.translateAlternateColorCodes('&', usedobsidiandestroyer);

		String usedthief = names.getConfigurationSection("Thief").getString("one");
		String thiefE = ChatColor.translateAlternateColorCodes('&', usedthief);

		String usedtoughness = names.getConfigurationSection("Toughness").getString("one");
		String toughnessE = ChatColor.translateAlternateColorCodes('&', usedtoughness);

		String usedantifog = names.getConfigurationSection("AntiFog").getString("one");
		String antifogE = ChatColor.translateAlternateColorCodes('&', usedantifog);
		
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
				if (!(fullinvmsg.equals("none")))
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
							if (!(reqmsg.equals("none")))
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
