package com.nomic.AEnchants.Events;

import java.util.List;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.bukkit.inventory.AnvilInventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class AnvilApply extends Event {
	private static final HandlerList handlers = new HandlerList();
	private Player player;
	private AnvilInventory anvil;
	private List<String> itemlore;
	private ItemStack clear;
	private int cost;
	private int plevel;
	private ItemStack item;
	private ItemMeta oldmeta;
	private ItemMeta newmeta;
	private Material m;

    public AnvilApply(Player player, AnvilInventory anvil, List<String> itemlore, ItemStack clear, int cost, int plevel, ItemStack item, ItemMeta oldmeta, ItemMeta newmeta, Material m) {
        this.player = player;
        this.anvil = anvil;
        this.itemlore = itemlore;
        this.clear = clear;
        this.cost = cost;
        this.plevel = plevel;
        this.item = item;
        this.oldmeta = oldmeta;
        this.newmeta = newmeta;
        this.m = m;
    }
    
    public Player getPlayer(){
        return player;
    }
    
    public AnvilInventory getAnvil(){
        return anvil;
    }
    
    public List<String> getItemLore(){
        return itemlore;
    }
    
    public ItemStack getClearItem(){
        return clear;
    }
    
    public int getCost(){
        return cost;
    }
    
    public int getPlayerLevel(){
        return plevel;
    }
    
    public ItemStack getItem(){
        return item;
    }
    
    public ItemMeta getOldMeta(){
        return oldmeta;
    }
    
    public ItemMeta getNewMeta(){
        return newmeta;
    }
    
    public Material getMaterial(){
        return m;
    }

    @Override
    public HandlerList getHandlers() {
        return handlers;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }
}
