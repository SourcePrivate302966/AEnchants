package com.nomic.ArchonEnchants.Enchants;

import java.util.List;

import org.bukkit.ChatColor;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;

public class Blast implements Listener {

	@EventHandler(priority = EventPriority.NORMAL)
	public void blockBreak(BlockBreakEvent e) {
		Player p = e.getPlayer();
		List<String> lore = p.getItemInHand().getItemMeta().getLore();
		Block b = e.getBlock();
		if (lore == null)
			return;
		String one = "&bBlast I";
		String two = "&eBlast II";
		float yaw = p.getLocation().getYaw();
		float pitch = p.getLocation().getPitch();
		double rot = (yaw - 90) % 360;
		if (rot < 0) {
			rot += 360.0;
		}
		if (lore.contains(ChatColor.translateAlternateColorCodes('&', one))) {
			if (pitch < 30 && pitch > -30) {
				if (0 <= rot && rot < 45 || 135 <= rot && rot < 225) {
					b.getRelative(BlockFace.DOWN).breakNaturally();
					b.getRelative(BlockFace.NORTH).breakNaturally();
					b.getRelative(BlockFace.SOUTH).breakNaturally();
					b.getRelative(BlockFace.NORTH).getRelative(BlockFace.DOWN).breakNaturally();
					b.getRelative(BlockFace.SOUTH).getRelative(BlockFace.DOWN).breakNaturally();
				} else if (45 <= rot && rot < 135 || 225 <= rot && rot < 315) {
					b.getRelative(BlockFace.DOWN).breakNaturally();
					b.getRelative(BlockFace.EAST).breakNaturally();
					b.getRelative(BlockFace.WEST).breakNaturally();
					b.getRelative(BlockFace.EAST).getRelative(BlockFace.DOWN).breakNaturally();
					b.getRelative(BlockFace.WEST).getRelative(BlockFace.DOWN).breakNaturally();
				}
			} else if (0 <= rot && rot < 45 || 315 <= rot && rot < 360) {
				b.getRelative(BlockFace.WEST).breakNaturally();
				b.getRelative(BlockFace.SOUTH_WEST).breakNaturally();
				b.getRelative(BlockFace.NORTH_WEST).breakNaturally();
				b.getRelative(BlockFace.SOUTH).breakNaturally();
				b.getRelative(BlockFace.NORTH).breakNaturally();
			} else if (45 <= rot && rot < 135) {
				b.getRelative(BlockFace.NORTH).breakNaturally();
				b.getRelative(BlockFace.NORTH_EAST).breakNaturally();
				b.getRelative(BlockFace.NORTH_WEST).breakNaturally();
				b.getRelative(BlockFace.EAST).breakNaturally();
				b.getRelative(BlockFace.WEST).breakNaturally();
			} else if (135 <= rot && rot < 225) {
				b.getRelative(BlockFace.EAST).breakNaturally();
				b.getRelative(BlockFace.SOUTH_EAST).breakNaturally();
				b.getRelative(BlockFace.NORTH_EAST).breakNaturally();
				b.getRelative(BlockFace.SOUTH).breakNaturally();
				b.getRelative(BlockFace.NORTH).breakNaturally();
			} else if (225 <= rot && rot < 315) {
				b.getRelative(BlockFace.SOUTH).breakNaturally();
				b.getRelative(BlockFace.SOUTH_EAST).breakNaturally();
				b.getRelative(BlockFace.SOUTH_WEST).breakNaturally();
				b.getRelative(BlockFace.EAST).breakNaturally();
				b.getRelative(BlockFace.WEST).breakNaturally();
				}
			}
		if (lore.contains(ChatColor.translateAlternateColorCodes('&', two))) {
			if (pitch < 30 && pitch > -30) {
				if (0 <= rot && rot < 45 || 135 <= rot && rot < 225) {
					b.getRelative(BlockFace.DOWN).breakNaturally();
					b.getRelative(BlockFace.NORTH).breakNaturally();
					b.getRelative(BlockFace.SOUTH).breakNaturally();
					b.getRelative(BlockFace.NORTH).getRelative(BlockFace.DOWN).breakNaturally();
					b.getRelative(BlockFace.SOUTH).getRelative(BlockFace.DOWN).breakNaturally();
					b.getRelative(BlockFace.UP).breakNaturally();
					b.getRelative(BlockFace.NORTH).getRelative(BlockFace.UP).breakNaturally();
					b.getRelative(BlockFace.SOUTH).getRelative(BlockFace.UP).breakNaturally();
				} else if (45 <= rot && rot < 135 || 225 <= rot && rot < 315) {
					b.getRelative(BlockFace.DOWN).breakNaturally();
					b.getRelative(BlockFace.EAST).breakNaturally();
					b.getRelative(BlockFace.WEST).breakNaturally();
					b.getRelative(BlockFace.EAST).getRelative(BlockFace.DOWN).breakNaturally();
					b.getRelative(BlockFace.WEST).getRelative(BlockFace.DOWN).breakNaturally();
					b.getRelative(BlockFace.UP).breakNaturally();
					b.getRelative(BlockFace.EAST).getRelative(BlockFace.UP).breakNaturally();
					b.getRelative(BlockFace.WEST).getRelative(BlockFace.UP).breakNaturally();
				}
			} else {
				b.getRelative(BlockFace.EAST).breakNaturally();
				b.getRelative(BlockFace.WEST).breakNaturally();
				b.getRelative(BlockFace.SOUTH_WEST).breakNaturally();
				b.getRelative(BlockFace.NORTH_WEST).breakNaturally();
				b.getRelative(BlockFace.SOUTH).breakNaturally();
				b.getRelative(BlockFace.NORTH).breakNaturally();
				b.getRelative(BlockFace.SOUTH_EAST).breakNaturally();
				b.getRelative(BlockFace.NORTH_EAST).breakNaturally();
			}
		}
	}
}
