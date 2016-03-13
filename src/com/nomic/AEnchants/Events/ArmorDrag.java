package com.nomic.AEnchants.Events;

import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.bukkit.event.inventory.InventoryType.SlotType;
import org.bukkit.inventory.ItemStack;

public class ArmorDrag extends Event {
	private static final HandlerList handlers = new HandlerList();
	private Player player;
	private ItemStack item;
	private ItemStack citem;
	private SlotType stype;

    public ArmorDrag(Player player, ItemStack item, ItemStack citem, SlotType stype) {
        this.player = player;
        this.item = item;
        this.citem = citem;
        this.stype = stype;
    }
    
    public Player getPlayer(){
        return player;
    }
    
    public ItemStack getItem(){
        return item;
    }
    
    public ItemStack getCItem(){
        return citem;
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
