package com.nomic.AEnchants.Events;

import java.util.List;

import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.bukkit.event.inventory.InventoryType.SlotType;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class ArmorShift extends Event {
	private static final HandlerList handlers = new HandlerList();
	private Player player;
	private ItemStack item;
	private List<String> lore;
	private SlotType stype;
	private Inventory inv;

    public ArmorShift(Player player, ItemStack item, List<String> lore, SlotType stype, Inventory inv) {
        this.player = player;
        this.item = item;
        this.lore = lore;
        this.stype = stype;
        this.inv = inv;
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
    
    public Inventory getInventory(){
        return inv;
    }

    @Override
    public HandlerList getHandlers() {
        return handlers;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }
}