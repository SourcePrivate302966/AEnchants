package com.nomic.AEnchants;

import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import com.nomic.AEnchants.Enchants.Archery;
import com.nomic.AEnchants.Enchants.Blast;
import com.nomic.AEnchants.Enchants.Confusion;
import com.nomic.AEnchants.Enchants.Haste;
import com.nomic.AEnchants.Enchants.Life;
import com.nomic.AEnchants.Enchants.Lightning;
import com.nomic.AEnchants.Enchants.LightsOut;
import com.nomic.AEnchants.Enchants.ObsidianDestroyer;
import com.nomic.AEnchants.Enchants.Soul;
import com.nomic.AEnchants.Enchants.SwordBlock;
import com.nomic.AEnchants.Enchants.Thunderous;
import com.nomic.AEnchants.Enchants.Armor.Blaze;
import com.nomic.AEnchants.Enchants.Armor.Feast;
import com.nomic.AEnchants.Enchants.Armor.Fish;
import com.nomic.AEnchants.Enchants.Armor.HealthBoost;
import com.nomic.AEnchants.Enchants.Armor.Leaps;
import com.nomic.AEnchants.Enchants.Armor.Replenish;
import com.nomic.AEnchants.Enchants.Armor.Scoot;
import com.nomic.AEnchants.Events.ArmorDragListener;
import com.nomic.AEnchants.Events.ArmorHotbarListener;
import com.nomic.AEnchants.Events.ArmorShiftListener;

public class Main extends JavaPlugin {
	
	public void onEnable() {
		registerEvents();
		
	}
	public void registerEvents() {
		PluginManager pm = getServer().getPluginManager();
		
		pm.registerEvents(new ArmorShiftListener(), this);
		pm.registerEvents(new ArmorHotbarListener(), this);
		pm.registerEvents(new ArmorDragListener(), this);
		pm.registerEvents(new Haste(), this);
		pm.registerEvents(new Lightning(), this);
		pm.registerEvents(new Life(), this);
		pm.registerEvents(new Soul(), this);
		pm.registerEvents(new Thunderous(), this);
		pm.registerEvents(new LightsOut(), this);
		pm.registerEvents(new ObsidianDestroyer(), this);
		pm.registerEvents(new SwordBlock(), this);
		pm.registerEvents(new Confusion(), this);
		pm.registerEvents(new HealthBoost(), this);
		pm.registerEvents(new Replenish(), this);
		pm.registerEvents(new Archery(), this);
		pm.registerEvents(new Scoot(), this);
		pm.registerEvents(new Feast(), this);
		pm.registerEvents(new Fish(), this);
		pm.registerEvents(new Blaze(), this);
		pm.registerEvents(new Leaps(), this);
		pm.registerEvents(new Blast(), this);
	}
}
