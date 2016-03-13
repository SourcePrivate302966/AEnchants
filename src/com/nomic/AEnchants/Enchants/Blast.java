package com.nomic.AEnchants.Enchants;

import java.util.List;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;

public class Blast implements Listener {

	Material ma = Material.STONE;
	Material mb = Material.COBBLESTONE;
	Material mc = Material.MOSSY_COBBLESTONE;
	Material md = Material.ENDER_STONE;
	Material me = Material.OBSIDIAN;
	Material mf = Material.COAL_ORE;
	Material mg = Material.IRON_ORE;
	Material mh = Material.GOLD_ORE;
	Material mi = Material.REDSTONE_ORE;
	Material mj = Material.LAPIS_ORE;
	Material mk = Material.DIAMOND_ORE;
	Material ml = Material.EMERALD_ORE;
	Material mm = Material.BRICK;
	Material mn = Material.HARD_CLAY;
	Material mo = Material.PRISMARINE;
	Material mp = Material.NETHER_BRICK;
	Material mq = Material.SMOOTH_BRICK;
	Material mr = Material.QUARTZ_BLOCK;
	Material ms = Material.SANDSTONE;
	Material mt = Material.STAINED_CLAY;
	
	String one = "&bBlast I";
	String two = "&eBlast II";
	
	String tOne = ChatColor.translateAlternateColorCodes('&', one);
	String tTwo = ChatColor.translateAlternateColorCodes('&', two);

	@EventHandler(priority = EventPriority.HIGHEST)
	public void blockBreak(BlockBreakEvent e) {
		Player p = e.getPlayer();
		if (p.getItemInHand() == null)
			return;
		List<String> lore = p.getItemInHand().getItemMeta().getLore();
		Block b = e.getBlock();
		if (lore == null)
			return;
		float yaw = p.getLocation().getYaw();
		float pitch = p.getLocation().getPitch();
		double rot = (yaw - 90) % 360;
		if (rot < 0) {
			rot += 360.0;
		}
		Material north = b.getRelative(BlockFace.NORTH).getType();
		Material south = b.getRelative(BlockFace.SOUTH).getType();
		Material east = b.getRelative(BlockFace.EAST).getType();
		Material west = b.getRelative(BlockFace.WEST).getType();
		Material down = b.getRelative(BlockFace.DOWN).getType();
		Material up = b.getRelative(BlockFace.UP).getType();
		Material northd = b.getRelative(BlockFace.NORTH).getRelative(BlockFace.DOWN).getType();
		Material southd = b.getRelative(BlockFace.SOUTH).getRelative(BlockFace.DOWN).getType();
		Material eastd = b.getRelative(BlockFace.EAST).getRelative(BlockFace.DOWN).getType();
		Material westd = b.getRelative(BlockFace.WEST).getRelative(BlockFace.DOWN).getType();
		Material northu = b.getRelative(BlockFace.NORTH).getRelative(BlockFace.UP).getType();
		Material southu = b.getRelative(BlockFace.SOUTH).getRelative(BlockFace.UP).getType();
		Material eastu = b.getRelative(BlockFace.EAST).getRelative(BlockFace.UP).getType();
		Material westu = b.getRelative(BlockFace.WEST).getRelative(BlockFace.UP).getType();
		Material northe = b.getRelative(BlockFace.NORTH_EAST).getType();
		Material southe = b.getRelative(BlockFace.SOUTH_EAST).getType();
		Material northw = b.getRelative(BlockFace.NORTH_WEST).getType();
		Material southw = b.getRelative(BlockFace.SOUTH_WEST).getType();
		if (lore.contains(tOne)) {
			if (pitch < 30 && pitch > -30) {
				if (0 <= rot && rot < 45 || 135 <= rot && rot < 225) {
					if (down == ma || down == mb || down == mc || down == md || down == me || down == mf || down == mg
							|| down == mh || down == mi || down == mj || down == mk || down == ml || down == mm
							|| down == mn || down == mo || down == mp || down == mq || down == mr || down == ms
							|| down == mt) {
						b.getRelative(BlockFace.DOWN).breakNaturally();
					}
					if (north == ma || north == mb || north == mc || north == md || north == me || north == mf
							|| north == mg || north == mh || north == mi || north == mj || north == mk || north == ml
							|| north == mm || north == mn || north == mo || north == mp || north == mq || north == mr
							|| north == ms || north == mt) {
						b.getRelative(BlockFace.NORTH).breakNaturally();
					}
					if (south == ma || south == mb || south == mc || south == md || south == me || south == mf
							|| south == mg || south == mh || south == mi || south == mj || south == mk || south == ml
							|| south == mm || south == mn || south == mo || south == mp || south == mq || south == mr
							|| south == ms || south == mt) {
						b.getRelative(BlockFace.SOUTH).breakNaturally();
					}
					if (northd == ma || northd == mb || northd == mc || northd == md || northd == me || northd == mf
							|| northd == mg || northd == mh || northd == mi || northd == mj || northd == mk
							|| northd == ml || northd == mm || northd == mn || northd == mo || northd == mp
							|| northd == mq || northd == mr || northd == ms || northd == mt) {
						b.getRelative(BlockFace.NORTH).getRelative(BlockFace.DOWN).breakNaturally();
					}
					if (northd == ma || northd == mb || northd == mc || northd == md || northd == me || northd == mf
							|| southd == mg || southd == mh || southd == mi || southd == mj || southd == mk
							|| southd == ml || southd == mm || southd == mn || southd == mo || southd == mp
							|| southd == mq || southd == mr || southd == ms || southd == mt) {
						b.getRelative(BlockFace.SOUTH).getRelative(BlockFace.DOWN).breakNaturally();
					}
				} else if (45 <= rot && rot < 135 || 225 <= rot && rot < 315) {
					if (down == ma || down == mb || down == mc || down == md || down == me || down == mf || down == mg
							|| down == mh || down == mi || down == mj || down == mk || down == ml || down == mm
							|| down == mn || down == mo || down == mp || down == mq || down == mr || down == ms
							|| down == mt) {
						b.getRelative(BlockFace.DOWN).breakNaturally();
					}
					if (east == ma || east == mb || east == mc || east == md || east == me || east == mf || east == mg
							|| east == mh || east == mi || east == mj || east == mk || east == ml || east == mm
							|| east == mn || east == mo || east == mp || east == mq || east == mr || east == ms
							|| east == mt) {
						b.getRelative(BlockFace.EAST).breakNaturally();
					}
					if (west == ma || west == mb || west == mc || west == md || west == me || west == mf || west == mg
							|| west == mh || west == mi || west == mj || west == mk || west == ml || west == mm
							|| west == mn || west == mo || west == mp || west == mq || west == mr || west == ms
							|| west == mt) {
						b.getRelative(BlockFace.WEST).breakNaturally();
					}
					if (eastd == ma || eastd == mb || eastd == mc || eastd == md || eastd == me || eastd == mf
							|| eastd == mg || eastd == mh || eastd == mi || eastd == mj || eastd == mk || eastd == ml
							|| eastd == mm || eastd == mn || eastd == mo || eastd == mp || eastd == mq || eastd == mr
							|| eastd == ms || eastd == mt) {
						b.getRelative(BlockFace.EAST).getRelative(BlockFace.DOWN).breakNaturally();
					}
					if (westd == ma || westd == mb || westd == mc || westd == md || westd == me || westd == mf
							|| westd == mg || westd == mh || westd == mi || westd == mj || westd == mk || westd == ml
							|| westd == mm || westd == mn || westd == mo || westd == mp || westd == mq || westd == mr
							|| westd == ms || westd == mt) {
						b.getRelative(BlockFace.WEST).getRelative(BlockFace.DOWN).breakNaturally();
					}
				}
			} else if (0 <= rot && rot < 45 || 315 <= rot && rot < 360) {
				if (west == ma || west == mb || west == mc || west == md || west == me || west == mf || west == mg
						|| west == mh || west == mi || west == mj || west == mk || west == ml || west == mm
						|| west == mn || west == mo || west == mp || west == mq || west == mr || west == ms
						|| west == mt) {
					b.getRelative(BlockFace.WEST).breakNaturally();
				}
				if (southw == ma || southw == mb || southw == mc || southw == md || southw == me || southw == mf
						|| southw == mg || southw == mh || southw == mi || southw == mj || southw == mk || southw == ml
						|| southw == mm || southw == mn || southw == mo || southw == mp || southw == mq || southw == mr
						|| southw == ms || southw == mt) {
					b.getRelative(BlockFace.SOUTH_WEST).breakNaturally();
				}
				if (northw == ma || northw == mb || northw == mc || northw == md || northw == me || northw == mf
						|| northw == mg || northw == mh || northw == mi || northw == mj || northw == mk || northw == ml
						|| northw == mm || northw == mn || northw == mo || northw == mp || northw == mq || northw == mr
						|| northw == ms || northw == mt) {
					b.getRelative(BlockFace.NORTH_WEST).breakNaturally();
				}
				if (south == ma || south == mb || south == mc || south == md || south == me || south == mf
						|| south == mg || south == mh || south == mi || south == mj || south == mk || south == ml
						|| south == mm || south == mn || south == mo || south == mp || south == mq || south == mr
						|| south == ms || south == mt) {
					b.getRelative(BlockFace.SOUTH).breakNaturally();
				}
				if (north == ma || north == mb || north == mc || north == md || north == me || north == mf
						|| north == mg || north == mh || north == mi || north == mj || north == mk || north == ml
						|| north == mm || north == mn || north == mo || north == mp || north == mq || north == mr
						|| north == ms || north == mt) {
					b.getRelative(BlockFace.NORTH).breakNaturally();
				}
			} else if (45 <= rot && rot < 135) {
				if (north == ma || north == mb || north == mc || north == md || north == me || north == mf
						|| north == mg || north == mh || north == mi || north == mj || north == mk || north == ml
						|| north == mm || north == mn || north == mo || north == mp || north == mq || north == mr
						|| north == ms || north == mt) {
					b.getRelative(BlockFace.NORTH).breakNaturally();
				}
				if (northe == ma || northe == mb || northe == mc || northe == md || northe == me || northe == mf
						|| northe == mg || northe == mh || northe == mi || northe == mj || northe == mk || northe == ml
						|| northe == mm || northe == mn || northe == mo || northe == mp || northe == mq || northe == mr
						|| northe == ms || northe == mt) {
					b.getRelative(BlockFace.NORTH_EAST).breakNaturally();
				}
				if (northw == ma || northw == mb || northw == mc || northw == md || northw == me || northw == mf
						|| northw == mg || northw == mh || northw == mi || northw == mj || northw == mk || northw == ml
						|| northw == mm || northw == mn || northw == mo || northw == mp || northw == mq || northw == mr
						|| northw == ms || northw == mt) {
					b.getRelative(BlockFace.NORTH_WEST).breakNaturally();
				}
				if (east == ma || east == mb || east == mc || east == md || east == me || east == mf || east == mg
						|| east == mh || east == mi || east == mj || east == mk || east == ml || east == mm
						|| east == mn || east == mo || east == mp || east == mq || east == mr || east == ms
						|| east == mt) {
					b.getRelative(BlockFace.EAST).breakNaturally();
				}
				if (west == ma || west == mb || west == mc || west == md || west == me || west == mf || west == mg
						|| west == mh || west == mi || west == mj || west == mk || west == ml || west == mm
						|| west == mn || west == mo || west == mp || west == mq || west == mr || west == ms
						|| west == mt) {
					b.getRelative(BlockFace.WEST).breakNaturally();
				}
			} else if (135 <= rot && rot < 225) {
				if (east == ma || east == mb || east == mc || east == md || east == me || east == mf || east == mg
						|| east == mh || east == mi || east == mj || east == mk || east == ml || east == mm
						|| east == mn || east == mo || east == mp || east == mq || east == mr || east == ms
						|| east == mt) {
					b.getRelative(BlockFace.EAST).breakNaturally();
				}
				if (southe == ma || southe == mb || southe == mc || southe == md || southe == me || southe == mf
						|| southe == mg || southe == mh || southe == mi || southe == mj || southe == mk || southe == ml
						|| southe == mm || southe == mn || southe == mo || southe == mp || southe == mq || southe == mr
						|| southe == ms || southe == mt) {
					b.getRelative(BlockFace.SOUTH_EAST).breakNaturally();
				}
				if (northe == ma || northe == mb || northe == mc || northe == md || northe == me || northe == mf
						|| northe == mg || northe == mh || northe == mi || northe == mj || northe == mk || northe == ml
						|| northe == mm || northe == mn || northe == mo || northe == mp || northe == mq || northe == mr
						|| northe == ms || northe == mt) {
					b.getRelative(BlockFace.NORTH_EAST).breakNaturally();
				}
				if (south == ma || south == mb || south == mc || south == md || south == me || south == mf
						|| south == mg || south == mh || south == mi || south == mj || south == mk || south == ml
						|| south == mm || south == mn || south == mo || south == mp || south == mq || south == mr
						|| south == ms || south == mt) {
					b.getRelative(BlockFace.SOUTH).breakNaturally();
				}
				if (north == ma || north == mb || north == mc || north == md || north == me || north == mf
						|| north == mg || north == mh || north == mi || north == mj || north == mk || north == ml
						|| north == mm || north == mn || north == mo || north == mp || north == mq || north == mr
						|| north == ms || north == mt) {
					b.getRelative(BlockFace.NORTH).breakNaturally();
				}
			} else if (225 <= rot && rot < 315) {
				if (south == ma || south == mb || south == mc || south == md || south == me || south == mf
						|| south == mg || south == mh || south == mi || south == mj || south == mk || south == ml
						|| south == mm || south == mn || south == mo || south == mp || south == mq || south == mr
						|| south == ms || south == mt) {
					b.getRelative(BlockFace.SOUTH).breakNaturally();
				}
				if (southe == ma || southe == mb || southe == mc || southe == md || southe == me || southe == mf
						|| southe == mg || southe == mh || southe == mi || southe == mj || southe == mk || southe == ml
						|| southe == mm || southe == mn || southe == mo || southe == mp || southe == mq || southe == mr
						|| southe == ms || southe == mt) {
					b.getRelative(BlockFace.SOUTH_EAST).breakNaturally();
				}
				if (southw == ma || southw == mb || southw == mc || southw == md || southw == me || southw == mf
						|| southw == mg || southw == mh || southw == mi || southw == mj || southw == mk || southw == ml
						|| southw == mm || southw == mn || southw == mo || southw == mp || southw == mq || southw == mr
						|| southw == ms || southw == mt) {
					b.getRelative(BlockFace.SOUTH_WEST).breakNaturally();
				}
				if (east == ma || east == mb || east == mc || east == md || east == me || east == mf || east == mg
						|| east == mh || east == mi || east == mj || east == mk || east == ml || east == mm
						|| east == mn || east == mo || east == mp || east == mq || east == mr || east == ms
						|| east == mt) {
					b.getRelative(BlockFace.EAST).breakNaturally();
				}
				if (west == ma || west == mb || west == mc || west == md || west == me || west == mf || west == mg
						|| west == mh || west == mi || west == mj || west == mk || west == ml || west == mm
						|| west == mn || west == mo || west == mp || west == mq || west == mr || west == ms
						|| west == mt) {
					b.getRelative(BlockFace.WEST).breakNaturally();
				}
			}
		} else if (lore.contains(tTwo)) {
			if (pitch < 30 && pitch > -30) {
				if (0 <= rot && rot < 45 || 135 <= rot && rot < 225) {
					if (down == ma || down == mb || down == mc || down == md || down == me || down == mf || down == mg
							|| down == mh || down == mi || down == mj || down == mk || down == ml || down == mm
							|| down == mn || down == mo || down == mp || down == mq || down == mr || down == ms
							|| down == mt) {
						b.getRelative(BlockFace.DOWN).breakNaturally();
					}
					if (north == ma || north == mb || north == mc || north == md || north == me || north == mf
							|| north == mg || north == mh || north == mi || north == mj || north == mk || north == ml
							|| north == mm || north == mn || north == mo || north == mp || north == mq || north == mr
							|| north == ms || north == mt) {
						b.getRelative(BlockFace.NORTH).breakNaturally();
					}
					if (south == ma || south == mb || south == mc || south == md || south == me || south == mf
							|| south == mg || south == mh || south == mi || south == mj || south == mk || south == ml
							|| south == mm || south == mn || south == mo || south == mp || south == mq || south == mr
							|| south == ms || south == mt) {
						b.getRelative(BlockFace.SOUTH).breakNaturally();
					}
					if (northd == ma || northd == mb || northd == mc || northd == md || northd == me || northd == mf
							|| northd == mg || northd == mh || northd == mi || northd == mj || northd == mk
							|| northd == ml || northd == mm || northd == mn || northd == mo || northd == mp
							|| northd == mq || northd == mr || northd == ms || northd == mt) {
						b.getRelative(BlockFace.NORTH).getRelative(BlockFace.DOWN).breakNaturally();
					}
					if (northd == ma || northd == mb || northd == mc || northd == md || northd == me || northd == mf
							|| southd == mg || southd == mh || southd == mi || southd == mj || southd == mk
							|| southd == ml || southd == mm || southd == mn || southd == mo || southd == mp
							|| southd == mq || southd == mr || southd == ms || southd == mt) {
						b.getRelative(BlockFace.SOUTH).getRelative(BlockFace.DOWN).breakNaturally();
					}
					if (up == ma || up == mb || up == mc || up == md || up == me || up == mf || up == mg || up == mh
							|| up == mi || up == mj || up == mk || up == ml || up == mm || up == mn || up == mo
							|| up == mp || up == mq || up == mr || up == ms || up == mt) {
						b.getRelative(BlockFace.UP).breakNaturally();
					}
					if (northu == ma || northu == mb || northu == mc || northu == md || northu == me || northu == mf
							|| northu == mg || northu == mh || northu == mi || northu == mj || northu == mk
							|| northu == ml || northu == mm || northu == mn || northu == mo || northu == mp
							|| northu == mq || northu == mr || northu == ms || northu == mt) {
						b.getRelative(BlockFace.NORTH).getRelative(BlockFace.UP).breakNaturally();
					}
					if (southu == ma || southu == mb || southu == mc || southu == md || southu == me || southu == mf
							|| southu == mg || southu == mh || southu == mi || southu == mj || southu == mk
							|| southu == ml || southu == mm || southu == mn || southu == mo || southu == mp
							|| southu == mq || southu == mr || southu == ms || southu == mt) {
						b.getRelative(BlockFace.SOUTH).getRelative(BlockFace.UP).breakNaturally();
					}
				} else if (45 <= rot && rot < 135 || 225 <= rot && rot < 315) {
					if (down == ma || down == mb || down == mc || down == md || down == me || down == mf || down == mg
							|| down == mh || down == mi || down == mj || down == mk || down == ml || down == mm
							|| down == mn || down == mo || down == mp || down == mq || down == mr || down == ms
							|| down == mt) {
						b.getRelative(BlockFace.DOWN).breakNaturally();
					}
					if (east == ma || east == mb || east == mc || east == md || east == me || east == mf || east == mg
							|| east == mh || east == mi || east == mj || east == mk || east == ml || east == mm
							|| east == mn || east == mo || east == mp || east == mq || east == mr || east == ms
							|| east == mt) {
						b.getRelative(BlockFace.EAST).breakNaturally();
					}
					if (west == ma || west == mb || west == mc || west == md || west == me || west == mf || west == mg
							|| west == mh || west == mi || west == mj || west == mk || west == ml || west == mm
							|| west == mn || west == mo || west == mp || west == mq || west == mr || west == ms
							|| west == mt) {
						b.getRelative(BlockFace.WEST).breakNaturally();
					}
					if (eastd == ma || eastd == mb || eastd == mc || eastd == md || eastd == me || eastd == mf
							|| eastd == mg || eastd == mh || eastd == mi || eastd == mj || eastd == mk || eastd == ml
							|| eastd == mm || eastd == mn || eastd == mo || eastd == mp || eastd == mq || eastd == mr
							|| eastd == ms || eastd == mt) {
						b.getRelative(BlockFace.EAST).getRelative(BlockFace.DOWN).breakNaturally();
					}
					if (westd == ma || westd == mb || westd == mc || westd == md || westd == me || westd == mf
							|| westd == mg || westd == mh || westd == mi || westd == mj || westd == mk || westd == ml
							|| westd == mm || westd == mn || westd == mo || westd == mp || westd == mq || westd == mr
							|| westd == ms || westd == mt) {
						b.getRelative(BlockFace.WEST).getRelative(BlockFace.DOWN).breakNaturally();
					}
					if (up == ma || up == mb || up == mc || up == md || up == me || up == mf || up == mg || up == mh
							|| up == mi || up == mj || up == mk || up == ml || up == mm || up == mn || up == mo
							|| up == mp || up == mq || up == mr || up == ms || up == mt) {
						b.getRelative(BlockFace.UP).breakNaturally();
					}
					if (eastu == ma || eastu == mb || eastu == mc || eastu == md || eastu == me || eastu == mf
							|| eastu == mg || eastu == mh || eastu == mi || eastu == mj || eastu == mk || eastu == ml
							|| eastu == mm || eastu == mn || eastu == mo || eastu == mp || eastu == mq || eastu == mr
							|| eastu == ms || eastu == mt) {
						b.getRelative(BlockFace.EAST).getRelative(BlockFace.UP).breakNaturally();
					}
					if (westu == ma || westu == mb || westu == mc || westu == md || westu == me || westu == mf
							|| westu == mg || westu == mh || westu == mi || westu == mj || westu == mk || westu == ml
							|| westu == mm || westu == mn || westu == mo || westu == mp || westu == mq || westu == mr
							|| westu == ms || westu == mt) {
						b.getRelative(BlockFace.WEST).getRelative(BlockFace.UP).breakNaturally();
					}
				}
			} else {
				if (east == ma || east == mb || east == mc || east == md || east == me || east == mf || east == mg
						|| east == mh || east == mi || east == mj || east == mk || east == ml || east == mm
						|| east == mn || east == mo || east == mp || east == mq || east == mr || east == ms
						|| east == mt) {
					b.getRelative(BlockFace.EAST).breakNaturally();
				}
				if (west == ma || west == mb || west == mc || west == md || west == me || west == mf || west == mg
						|| west == mh || west == mi || west == mj || west == mk || west == ml || west == mm
						|| west == mn || west == mo || west == mp || west == mq || west == mr || west == ms
						|| west == mt) {
					b.getRelative(BlockFace.WEST).breakNaturally();
				}
				if (southw == ma || southw == mb || southw == mc || southw == md || southw == me || southw == mf
						|| southw == mg || southw == mh || southw == mi || southw == mj || southw == mk || southw == ml
						|| southw == mm || southw == mn || southw == mo || southw == mp || southw == mq || southw == mr
						|| southw == ms || southw == mt) {
					b.getRelative(BlockFace.SOUTH_WEST).breakNaturally();
				}
				if (northw == ma || northw == mb || northw == mc || northw == md || northw == me || northw == mf
						|| northw == mg || northw == mh || northw == mi || northw == mj || northw == mk || northw == ml
						|| northw == mm || northw == mn || northw == mo || northw == mp || northw == mq || northw == mr
						|| northw == ms || northw == mt) {
					b.getRelative(BlockFace.NORTH_WEST).breakNaturally();
				}
				if (south == ma || south == mb || south == mc || south == md || south == me || south == mf
						|| south == mg || south == mh || south == mi || south == mj || south == mk || south == ml
						|| south == mm || south == mn || south == mo || south == mp || south == mq || south == mr
						|| south == ms || south == mt) {
					b.getRelative(BlockFace.SOUTH).breakNaturally();
				}
				if (north == ma || north == mb || north == mc || north == md || north == me || north == mf
						|| north == mg || north == mh || north == mi || north == mj || north == mk || north == ml
						|| north == mm || north == mn || north == mo || north == mp || north == mq || north == mr
						|| north == ms || north == mt) {
					b.getRelative(BlockFace.NORTH).breakNaturally();
				}
				if (southe == ma || southe == mb || southe == mc || southe == md || southe == me || southe == mf
						|| southe == mg || southe == mh || southe == mi || southe == mj || southe == mk || southe == ml
						|| southe == mm || southe == mn || southe == mo || southe == mp || southe == mq || southe == mr
						|| southe == ms || southe == mt) {
					b.getRelative(BlockFace.SOUTH_EAST).breakNaturally();
				}
				if (northe == ma || northe == mb || northe == mc || northe == md || northe == me || northe == mf
						|| northe == mg || northe == mh || northe == mi || northe == mj || northe == mk || northe == ml
						|| northe == mm || northe == mn || northe == mo || northe == mp || northe == mq || northe == mr
						|| northe == ms || northe == mt) {
					b.getRelative(BlockFace.NORTH_EAST).breakNaturally();
				}
			}
		}
	}
}
