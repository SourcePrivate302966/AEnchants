package com.nomic.AEnchants;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.SignChangeEvent;

public class CreateSign implements Listener {
	
	private Main plugin;

	public CreateSign(Main pl) {
		plugin = pl;
	}

	@EventHandler
	public void Signit(SignChangeEvent e) {
		Player p = e.getPlayer();
		String title = plugin.getConfig().getString("signTitle");
		String aenchants = ChatColor.translateAlternateColorCodes('&', title);
		if (e.getLine(0).equals(aenchants)) {
			if (!(p.hasPermission("aenchants.createsign") || p.isOp())) {
				p.sendMessage(ChatColor.RED + "" + ChatColor.BOLD + "Hey! " + ChatColor.YELLOW + "Sorry, but you can't create this sign.");
				e.setCancelled(true);
			}
		}
	}
}
