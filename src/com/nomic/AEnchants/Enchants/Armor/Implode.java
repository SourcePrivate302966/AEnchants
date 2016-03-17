package com.nomic.AEnchants.Enchants.Armor;

import java.util.List;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.entity.Creeper;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.inventory.PlayerInventory;

public class Implode implements Listener {

	String one = "&bImplode I";
	String two = "&eImplode II";
	String three = "&cImplode III";

	String tOne = ChatColor.translateAlternateColorCodes('&', one);
	String tTwo = ChatColor.translateAlternateColorCodes('&', two);
	String tThree = ChatColor.translateAlternateColorCodes('&', three);

	@EventHandler(priority = EventPriority.HIGH)
	public void onPlayerHit(EntityDeathEvent e) {
		if (!(e.getEntity() instanceof Player))
			return;
		Player p = (Player) e.getEntity();
		PlayerInventory inv = p.getInventory();
		Location l = p.getLocation();
		List<String> clore = inv.getChestplate().getItemMeta().getLore();
		List<String> llore = inv.getLeggings().getItemMeta().getLore();
		List<String> blore = inv.getBoots().getItemMeta().getLore();
		if (inv.getChestplate() != null) {
			if (clore == null)
				return;
			if (clore.contains(tOne)) {
				Creeper c = (Creeper) l.getWorld().spawnEntity(l, EntityType.CREEPER);
				c.setTarget(p);
			} else if (clore.contains(tTwo)) {
				Creeper c = (Creeper) l.getWorld().spawnEntity(l, EntityType.CREEPER);
				Creeper c2 = (Creeper) l.getWorld().spawnEntity(l, EntityType.CREEPER);
				c.setTarget(p);
				c2.setTarget(p);
			} else if (clore.contains(tThree)) {
				Creeper c = (Creeper) l.getWorld().spawnEntity(l, EntityType.CREEPER);
				c.setPowered(true);
				c.setTarget(p);
			}
		} else if (inv.getLeggings() != null) {
			if (llore == null)
				return;
			if (clore.contains(tOne)) {
				Creeper c = (Creeper) l.getWorld().spawnEntity(l, EntityType.CREEPER);
				c.setTarget(p);
			} else if (clore.contains(tTwo)) {
				Creeper c = (Creeper) l.getWorld().spawnEntity(l, EntityType.CREEPER);
				Creeper c2 = (Creeper) l.getWorld().spawnEntity(l, EntityType.CREEPER);
				c.setTarget(p);
				c2.setTarget(p);
			} else if (clore.contains(tThree)) {
				Creeper c = (Creeper) l.getWorld().spawnEntity(l, EntityType.CREEPER);
				c.setPowered(true);
				c.setTarget(p);
			}
		} else if (inv.getBoots() != null) {
			if (blore == null)
				return;
			if (clore.contains(tOne)) {
				Creeper c = (Creeper) l.getWorld().spawnEntity(l, EntityType.CREEPER);
				c.setTarget(p);
			} else if (clore.contains(tTwo)) {
				Creeper c = (Creeper) l.getWorld().spawnEntity(l, EntityType.CREEPER);
				Creeper c2 = (Creeper) l.getWorld().spawnEntity(l, EntityType.CREEPER);
				c.setTarget(p);
				c2.setTarget(p);
			} else if (clore.contains(tThree)) {
				Creeper c = (Creeper) l.getWorld().spawnEntity(l, EntityType.CREEPER);
				c.setPowered(true);
				c.setTarget(p);
			}
		}
	}
}
