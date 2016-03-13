package com.nomic.AEnchants.Events;

import java.util.List;

import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.bukkit.inventory.ItemStack;

public class ArmorHotbar extends Event {
	private static final HandlerList handlers = new HandlerList();
	private Player player;
	private ItemStack item;
	private List<String> lore;

    public ArmorHotbar(Player player, ItemStack item, List<String> lore) {
        this.player = player;
        this.item = item;
        this.lore = lore;
    }
    
    public Player getPlayer(){
        return player;
    }
    
    public ItemStack getItem(){
        return item;
    }
    
    public List<String> getLore(){
        return lore;
    }

    @Override
    public HandlerList getHandlers() {
        return handlers;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }
}
