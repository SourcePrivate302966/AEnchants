package com.nomic.ArchonEnchants;

import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import com.nomic.ArchonEnchants.Enchants.Blast;
import com.nomic.ArchonEnchants.Enchants.Confusion;
import com.nomic.ArchonEnchants.Enchants.Feast;
import com.nomic.ArchonEnchants.Enchants.Haste;
import com.nomic.ArchonEnchants.Enchants.Life;
import com.nomic.ArchonEnchants.Enchants.Lightning;
import com.nomic.ArchonEnchants.Enchants.LightsOut;
import com.nomic.ArchonEnchants.Enchants.ObsidianDestroyer;
import com.nomic.ArchonEnchants.Enchants.Soul;
import com.nomic.ArchonEnchants.Enchants.SwordBlock;
import com.nomic.ArchonEnchants.Enchants.Thunderous;

public class Main extends JavaPlugin {
	
	public void onEnable() {
		registerEvents();
	}

	public void registerEvents() {
		PluginManager pm = getServer().getPluginManager();
		
		pm.registerEvents(new Haste(), this);
		pm.registerEvents(new Lightning(), this);
		pm.registerEvents(new Blast(), this);
		pm.registerEvents(new Life(), this);
		pm.registerEvents(new Soul(), this);
		pm.registerEvents(new Thunderous(), this);
		pm.registerEvents(new LightsOut(), this);
		pm.registerEvents(new ObsidianDestroyer(), this);
		pm.registerEvents(new SwordBlock(), this);
		pm.registerEvents(new Confusion(), this);
		pm.registerEvents(new Feast(), this);
	}
}
