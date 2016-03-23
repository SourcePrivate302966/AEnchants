package com.nomic.AEnchants;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CmdReload implements CommandExecutor {

	private Main plugin;
	
	public CmdReload(Main pl) {
		plugin = pl;
	}

	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		if (args.length == 0) {
			sender.sendMessage(ChatColor.RED + "Correct Usage: /aenchants reload");
		} else if (args.length == 1) {
			if (args[0].equals("reload")) {
				if ((sender.hasPermission("aenchants.reload")) || (!(sender instanceof Player)) || (sender.isOp())) {
					plugin.reloadConfig();
					sender.sendMessage(ChatColor.GREEN + "AEnchants Reloaded.");
				} else {
					sender.sendMessage(ChatColor.DARK_RED + "You dont have permission to perform this command!");
				}
			} else {
				sender.sendMessage(ChatColor.RED + "Correct Usage: /aenchants reload");
			}
		}
		return true;
	}
}
