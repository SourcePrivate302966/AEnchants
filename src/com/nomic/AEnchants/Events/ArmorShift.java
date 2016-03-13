package com.nomic.AEnchants.Events;

import java.util.List;

import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.bukkit.event.inventory.InventoryType.SlotType;
import org.bukkit.inventory.ItemStack;

public class ArmorShift extends Event {
	private static final HandlerList handlers = new HandlerList();
	private Player player;
	private ItemStack item;
	private List<String> lore;
	private SlotType stype;

    public ArmorShift(Player player, ItemStack item, List<String> lore, SlotType stype) {
        this.player = player;
        this.item = item;
        this.lore = lore;
        this.stype = stype;
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
    
    public SlotType getSlotType(){
        return stype;
    }

    @Override
    public HandlerList getHandlers() {
        return handlers;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }
}
