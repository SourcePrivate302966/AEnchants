package com.nomic.AEnchants;

import java.util.Arrays;
import java.util.List;

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

public class Anvil implements Listener {

	String one = ChatColor.translateAlternateColorCodes('&', "&bSwift I");
	String two = ChatColor.translateAlternateColorCodes('&', "&eSwift II");

	@EventHandler
	public void onCombine(InventoryClickEvent e) {
		if (!(e.getWhoClicked() instanceof Player))
			return;
		ClickType click = e.getClick();
		int slot = e.getSlot();
		SlotType stype = e.getSlotType();
		InventoryType inv = e.getInventory().getType();
		ItemStack current = e.getCurrentItem();
		ItemStack cursor = e.getCursor();
		if (click == ClickType.LEFT || click == ClickType.RIGHT) {
			if (current.getType() == Material.AIR && cursor.getType() != Material.AIR) {
				if (!(stype == SlotType.CRAFTING && inv == InventoryType.ANVIL))
					return;
				AnvilInventory anvil = (AnvilInventory) e.getInventory();
				ItemStack[] items = anvil.getContents();
				ItemStack item1 = items[0];
				ItemStack item2 = items[1];
				List<String> lore = cursor.getItemMeta().getLore();
				Material book = Material.ENCHANTED_BOOK;
				ItemStack result = new ItemStack(Material.ENCHANTED_BOOK);
				ItemMeta meta = result.getItemMeta();
				if (slot == 1 && item1 != null) {
					if (!(cursor.getType() == book && item1.getType() == book))
						return;
					List<String> lore1 = item1.getItemMeta().getLore();
					if (lore1.contains(one) && lore.contains(one)) {
						meta.setLore(Arrays.asList(two));
						result.setItemMeta(meta);
						anvil.setItem(2, result);
					}
				} else if (item1 == null && item2 != null) {
					if (!(cursor.getType() == book && item2.getType() == book))
						return;
					List<String> lore2 = item2.getItemMeta().getLore();
					if (lore2.contains(one) && lore.contains(one)) {
						meta.setLore(Arrays.asList(two));
						result.setItemMeta(meta);
						anvil.setItem(2, result);
					}
				}
			}
		}
	}
}
