package com.nomic.AEnchants.Events;

import java.util.List;

import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.bukkit.inventory.AnvilInventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class AnvilCombine extends Event {
	private static final HandlerList handlers = new HandlerList();
	private Player player;
	private ItemStack result;
	private ItemMeta meta;
	private AnvilInventory anvil;
	private List<String> anvillore;
	private List<String> itemlore;
	private ItemStack clear;
	private int cost;
	private int plevel;

    public AnvilCombine(Player player, ItemStack result, ItemMeta meta, AnvilInventory anvil, List<String> anvillore, List<String> itemlore, ItemStack clear, int cost, int plevel) {
        this.player = player;
        this.result = result;
        this.meta = meta;
        this.anvil = anvil;
        this.anvillore = anvillore;
        this.itemlore = itemlore;
        this.clear = clear;
        this.cost = cost;
        this.plevel = plevel;
    }
    
    public Player getPlayer(){
        return player;
    }
    
    public ItemStack getResultItem(){
        return result;
    }
    
    public ItemMeta getMeta(){
        return meta;
    }
    
    public AnvilInventory getAnvil(){
        return anvil;
    }
    
    public List<String> getAnvilLore(){
        return anvillore;
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

    @Override
    public HandlerList getHandlers() {
        return handlers;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }
}
