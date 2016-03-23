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

public class AnvilCombineListener implements Listener {

	private Main plugin;

	public AnvilCombineListener(Main pl) {
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
		String req = plugin.getConfig().getString("notEnoughLevelsMessage");
		String reqmsg = ChatColor.translateAlternateColorCodes('&', req);
		int bookCost = plugin.getConfig().getInt("bookCombineCost");
		String bcost = String.valueOf(bookCost);
		if (click == ClickType.LEFT || click == ClickType.RIGHT) {
			if (!(stype == SlotType.CRAFTING && inv == InventoryType.ANVIL))
				return;
			AnvilInventory anvil = (AnvilInventory) e.getInventory();
			ItemStack[] items = anvil.getContents();
			ItemStack item1 = items[0];
			ItemStack clear = new ItemStack(Material.AIR);
			int plevel = p.getLevel();
			Material book = Material.ENCHANTED_BOOK;
			ItemStack result = new ItemStack(Material.ENCHANTED_BOOK);
			ItemMeta meta = result.getItemMeta();
			String fullinv = plugin.getConfig().getString("fullInvMessage");
			String fullinvmsg = ChatColor.translateAlternateColorCodes('&', fullinv);
			if (p.getInventory().firstEmpty() == -1) {
				p.sendMessage(fullinvmsg);
				return;
			}
			if (slot == 1 && item1 != null) {
				List<String> lore1 = item1.getItemMeta().getLore();
				if (cursor.getType() == book && item1.getType() == book) {
					List<String> lore = cursor.getItemMeta().getLore();
					if (plevel < bookCost) {
						p.sendMessage(reqmsg.replace("{levels}", bcost));
						return;
					} else if (plevel >= bookCost) {
						Bukkit.getServer().getPluginManager()
								.callEvent(new AnvilCombine(p, result, meta, anvil, lore1, lore, clear, bookCost, plevel));
					}
				}
			}
		}
	}
}
