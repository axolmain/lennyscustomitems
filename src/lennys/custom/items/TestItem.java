package lennys.custom.items;

import events.*;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

import commands.CIcommands;
import items.ItemManager;

import java.util.HashMap;
import java.util.Map;

public class TestItem extends JavaPlugin {
	// Fired when plugin is first enabled

	@Override
	public void onEnable() {
		getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "[lennyscustomitems]: lennys buggy items are enabled");
		ItemManager.init();
		CIcommands commands = new CIcommands();
		getServer().getPluginManager().registerEvents(new ItemEvents(), this);
		getCommand("giveyoyo").setExecutor(commands);
		getServer().getPluginManager().registerEvents(new GonsRodEvents(), this);
		getCommand("giverod").setExecutor(commands);
		getServer().getPluginManager().registerEvents(new PokklesBowEvents(), this);
		getCommand("giverainbow").setExecutor(commands);
		getServer().getPluginManager().registerEvents(new MjolnirEvents(), this);
		getCommand("givemjolnir").setExecutor(commands);
		getServer().getPluginManager().registerEvents(new ZeusEvents(), this);
		getCommand("givezeus").setExecutor(commands);
		getServer().getPluginManager().registerEvents(new TridentEvents(), this);
		getCommand("givetrident").setExecutor(commands);
	}
	// Fired when plugin is disabled
	@Override
	public void onDisable() {
		getServer().getConsoleSender().sendMessage(ChatColor.RED + "[lennyscustomitems]: lennys buggy items are disabled");
	}
}
