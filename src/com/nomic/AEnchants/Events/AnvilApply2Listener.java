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

public class AnvilApply2Listener implements Listener {

	private Main plugin;

	public AnvilApply2Listener(Main pl) {
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
		
		String usedbeast2 = names.getConfigurationSection("Beast").getString("two");
		String beastE2 = ChatColor.translateAlternateColorCodes('&', usedbeast2);

		String usedbump2 = names.getConfigurationSection("Bump").getString("two");
		String bumpE2 = ChatColor.translateAlternateColorCodes('&', usedbump2);

		String usedhealthboost2 = names.getConfigurationSection("HealthBoost").getString("two");
		String healthboostE2 = ChatColor.translateAlternateColorCodes('&', usedhealthboost2);

		String usedimplode2 = names.getConfigurationSection("Implode").getString("two");
		String implodeE2 = ChatColor.translateAlternateColorCodes('&', usedimplode2);

		String usedleaps2 = names.getConfigurationSection("Leaps").getString("two");
		String leapsE2 = ChatColor.translateAlternateColorCodes('&', usedleaps2);

		String usedreborn2 = names.getConfigurationSection("Reborn").getString("two");
		String rebornE2 = ChatColor.translateAlternateColorCodes('&', usedreborn2);

		String usedreplenish2 = names.getConfigurationSection("Replenish").getString("two");
		String replenishE2 = ChatColor.translateAlternateColorCodes('&', usedreplenish2);

		String usedretreat2 = names.getConfigurationSection("Retreat").getString("two");
		String retreatE2 = ChatColor.translateAlternateColorCodes('&', usedretreat2);

		String usedscoot2 = names.getConfigurationSection("Scoot").getString("two");
		String scootE2 = ChatColor.translateAlternateColorCodes('&', usedscoot2);

		String usedtipsy2 = names.getConfigurationSection("Tipsy").getString("two");
		String tipsyE2 = ChatColor.translateAlternateColorCodes('&', usedtipsy2);

		String usedvanish2 = names.getConfigurationSection("Vanish").getString("two");
		String vanishE2 = ChatColor.translateAlternateColorCodes('&', usedvanish2);

		String usedweary2 = names.getConfigurationSection("Weary").getString("two");
		String wearyE2 = ChatColor.translateAlternateColorCodes('&', usedweary2);

		String usedarchery2 = names.getConfigurationSection("Archery").getString("two");
		String archeryE2 = ChatColor.translateAlternateColorCodes('&', usedarchery2);

		String usedconfusion2 = names.getConfigurationSection("Confusion").getString("two");
		String confusionE2 = ChatColor.translateAlternateColorCodes('&', usedconfusion2);

		String usedlife2 = names.getConfigurationSection("Life").getString("two");
		String lifeE2 = ChatColor.translateAlternateColorCodes('&', usedlife2);

		String usedlightning2 = names.getConfigurationSection("Lightning").getString("two");
		String lightningE2 = ChatColor.translateAlternateColorCodes('&', usedlightning2);

		String usedlightsout2 = names.getConfigurationSection("LightsOut").getString("two");
		String lightsoutE2 = ChatColor.translateAlternateColorCodes('&', usedlightsout2);

		String usedsoul2 = names.getConfigurationSection("Soul").getString("two");
		String soulE2 = ChatColor.translateAlternateColorCodes('&', usedsoul2);

		String usedthunderous2 = names.getConfigurationSection("Thunderous").getString("two");
		String thunderousE2 = ChatColor.translateAlternateColorCodes('&', usedthunderous2);

		String usedblast2 = names.getConfigurationSection("Blast").getString("two");
		String blastE2 = ChatColor.translateAlternateColorCodes('&', usedblast2);

		String usedexperience2 = names.getConfigurationSection("Experience").getString("two");
		String experienceE2 = ChatColor.translateAlternateColorCodes('&', usedexperience2);

		String usedhaste2 = names.getConfigurationSection("Haste").getString("two");
		String hasteE2 = ChatColor.translateAlternateColorCodes('&', usedhaste2);

		String usedobsidiandestroyer2 = names.getConfigurationSection("ObsidianDestroyer").getString("two");
		String obsidiandestroyerE2 = ChatColor.translateAlternateColorCodes('&', usedobsidiandestroyer2);

		String usedthief2 = names.getConfigurationSection("Thief").getString("two");
		String thiefE2 = ChatColor.translateAlternateColorCodes('&', usedthief2);
		
		String usedtoughness2 = names.getConfigurationSection("Toughness").getString("two");
		String toughnessE2 = ChatColor.translateAlternateColorCodes('&', usedtoughness2);
		
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
							if (!(reqmsg.equals("none")))
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
