package com.nomic.AEnchants;

import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import com.nomic.AEnchants.Enchants.Blast;
import com.nomic.AEnchants.Enchants.Haste;
import com.nomic.AEnchants.Enchants.ObsidianDestroyer;
import com.nomic.AEnchants.Enchants.Armor.Arc;
import com.nomic.AEnchants.Enchants.Armor.Blaze;
import com.nomic.AEnchants.Enchants.Armor.Bump;
import com.nomic.AEnchants.Enchants.Armor.Feast;
import com.nomic.AEnchants.Enchants.Armor.Fish;
import com.nomic.AEnchants.Enchants.Armor.HealthBoost;
import com.nomic.AEnchants.Enchants.Armor.Implode;
import com.nomic.AEnchants.Enchants.Armor.Leaps;
import com.nomic.AEnchants.Enchants.Armor.Reborn;
import com.nomic.AEnchants.Enchants.Armor.Replenish;
import com.nomic.AEnchants.Enchants.Armor.Retreat;
import com.nomic.AEnchants.Enchants.Armor.Scoot;
import com.nomic.AEnchants.Enchants.Armor.Sunlight;
import com.nomic.AEnchants.Enchants.Armor.Tipsy;
import com.nomic.AEnchants.Enchants.Armor.Vanish;
import com.nomic.AEnchants.Enchants.Armor.Weary;
import com.nomic.AEnchants.Enchants.Weapon.Archery;
import com.nomic.AEnchants.Enchants.Weapon.Confusion;
import com.nomic.AEnchants.Enchants.Weapon.Life;
import com.nomic.AEnchants.Enchants.Weapon.Lightning;
import com.nomic.AEnchants.Enchants.Weapon.LightsOut;
import com.nomic.AEnchants.Enchants.Weapon.Soul;
import com.nomic.AEnchants.Enchants.Weapon.SwordBlock;
import com.nomic.AEnchants.Enchants.Weapon.Thunderous;
import com.nomic.AEnchants.Events.ArmorDragListener;
import com.nomic.AEnchants.Events.ArmorHotbarListener;
import com.nomic.AEnchants.Events.ArmorShiftListener;

public class Main extends JavaPlugin {
	
	public void onEnable() {
		registerEvents();
		registerConfig();
		
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
		pm.registerEvents(new Retreat(), this);
		pm.registerEvents(new Bump(), this);
		pm.registerEvents(new Reborn(), this);
		pm.registerEvents(new Vanish(), this);
		pm.registerEvents(new Arc(), this);
		pm.registerEvents(new Weary(), this);
		pm.registerEvents(new Tipsy(), this);
		pm.registerEvents(new Implode(), this);
		pm.registerEvents(new Sunlight(), this);
		pm.registerEvents(new ClickSign(this), this);
		pm.registerEvents(new Anvil(this), this);
	}
	
	private void registerConfig() {
		getConfig().options().copyDefaults(true);
		saveConfig();
	}
}
