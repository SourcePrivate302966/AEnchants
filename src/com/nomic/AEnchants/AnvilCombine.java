package com.nomic.AEnchants;

import java.util.Arrays;
import java.util.List;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.inventory.AnvilInventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class AnvilCombine implements Listener {
	
	String one = ChatColor.translateAlternateColorCodes('&', "&bSwift I");
	String two = ChatColor.translateAlternateColorCodes('&', "&eSwift II");

	@EventHandler
	public void onCombine(InventoryClickEvent e) {
		if (e.getInventory().getType() != InventoryType.ANVIL)
			return;
		if (e.getView().getType() != InventoryType.ANVIL)
			return;
		AnvilInventory anvil = (AnvilInventory) e.getInventory();
		ItemStack left = anvil.getItem(0);
		ItemStack right = anvil.getItem(1);
		List<String> llore = left.getItemMeta().getLore();
		List<String> rlore = right.getItemMeta().getLore();
		ItemStack book = new ItemStack(Material.ENCHANTED_BOOK);
		ItemMeta meta = book.getItemMeta();
		if (llore.contains(one) && rlore.contains(two)) {
			List<String> lore = Arrays.asList(new String[] { two });
			meta.setLore(lore);
			anvil.setItem(2, book);
		}
	}
}
