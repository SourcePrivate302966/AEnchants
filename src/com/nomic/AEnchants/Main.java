package com.nomic.AEnchants;

import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import com.nomic.AEnchants.AnvilUse.Apply1;
import com.nomic.AEnchants.AnvilUse.Apply2;
import com.nomic.AEnchants.AnvilUse.Apply3;
import com.nomic.AEnchants.AnvilUse.Combine;
import com.nomic.AEnchants.Enchants.Blast;
import com.nomic.AEnchants.Enchants.Haste;
import com.nomic.AEnchants.Enchants.ObsidianDestroyer;
import com.nomic.AEnchants.Enchants.Armor.Arc;
import com.nomic.AEnchants.Enchants.Armor.Beast;
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
import com.nomic.AEnchants.Enchants.Armor.Toughness;
import com.nomic.AEnchants.Enchants.Armor.Vanish;
import com.nomic.AEnchants.Enchants.Armor.Weary;
import com.nomic.AEnchants.Enchants.Weapon.Archery;
import com.nomic.AEnchants.Enchants.Weapon.Confusion;
import com.nomic.AEnchants.Enchants.Weapon.Life;
import com.nomic.AEnchants.Enchants.Weapon.Lightning;
import com.nomic.AEnchants.Enchants.Weapon.LightsOut;
import com.nomic.AEnchants.Enchants.Weapon.Soul;
import com.nomic.AEnchants.Enchants.Weapon.SwordBlock;
import com.nomic.AEnchants.Enchants.Weapon.Thief;
import com.nomic.AEnchants.Enchants.Weapon.Thunderous;
import com.nomic.AEnchants.Events.AnvilApply1Listener;
import com.nomic.AEnchants.Events.AnvilApply2Listener;
import com.nomic.AEnchants.Events.AnvilApply3Listener;
import com.nomic.AEnchants.Events.AnvilCombineListener;
import com.nomic.AEnchants.Events.ArmorDragListener;
import com.nomic.AEnchants.Events.ArmorHotbarListener;
import com.nomic.AEnchants.Events.ArmorShiftListener;

public class Main extends JavaPlugin {
	
	public void onEnable() {
		registerEvents();
		registerCommands();
		registerConfig();
		
	}
	public void registerEvents() {
		PluginManager pm = getServer().getPluginManager();
		
		pm.registerEvents(new ArmorShiftListener(), this);
		pm.registerEvents(new ArmorHotbarListener(), this);
		pm.registerEvents(new ArmorDragListener(), this);
		pm.registerEvents(new AnvilCombineListener(this), this);
		pm.registerEvents(new AnvilApply1Listener(this), this);
		pm.registerEvents(new AnvilApply2Listener(this), this);
		pm.registerEvents(new AnvilApply3Listener(this), this);
		pm.registerEvents(new Haste(this), this);
		pm.registerEvents(new Lightning(this), this);
		pm.registerEvents(new Life(this), this);
		pm.registerEvents(new Soul(this), this);
		pm.registerEvents(new Thunderous(this), this);
		pm.registerEvents(new LightsOut(this), this);
		pm.registerEvents(new ObsidianDestroyer(this), this);
		pm.registerEvents(new SwordBlock(this), this);
		pm.registerEvents(new Confusion(this), this);
		pm.registerEvents(new HealthBoost(this), this);
		pm.registerEvents(new Replenish(this), this);
		pm.registerEvents(new Archery(this), this);
		pm.registerEvents(new Scoot(this), this);
		pm.registerEvents(new Feast(this), this);
		pm.registerEvents(new Fish(this), this);
		pm.registerEvents(new Blaze(this), this);
		pm.registerEvents(new Leaps(this), this);
		pm.registerEvents(new Blast(this), this);
		pm.registerEvents(new Retreat(this), this);
		pm.registerEvents(new Bump(this), this);
		pm.registerEvents(new Reborn(this), this);
		pm.registerEvents(new Vanish(this), this);
		pm.registerEvents(new Arc(this), this);
		pm.registerEvents(new Weary(this), this);
		pm.registerEvents(new Tipsy(this), this);
		pm.registerEvents(new Implode(this), this);
		pm.registerEvents(new Thief(this), this);
		pm.registerEvents(new Toughness(this), this);
		pm.registerEvents(new Sunlight(this), this);
		pm.registerEvents(new ClickSign(this), this);
		pm.registerEvents(new Combine(this), this);
		pm.registerEvents(new Apply1(this), this);
		pm.registerEvents(new Apply2(this), this);
		pm.registerEvents(new Apply3(this), this);
		pm.registerEvents(new Beast(this), this);
		pm.registerEvents(new CreateSign(this), this);
	}
	
	public void registerCommands() {
		getCommand("aenchants").setExecutor(new CmdReload(this));
	}
	
	private void registerConfig() {
		getConfig().options().copyDefaults(true);
		saveConfig();
	}
}
