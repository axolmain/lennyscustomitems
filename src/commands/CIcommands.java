package commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import items.ItemManager;

public class CIcommands implements CommandExecutor {
	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		if(!(sender instanceof Player)) { return true; }
		Player player = (Player) sender;
		
		if (command.getName().equalsIgnoreCase("giverod")) {
			if(player.hasPermission("lennyscustomitems.gon")) {
				player.getInventory().addItem(ItemManager.gonsrod);
			}else{
					player.sendMessage("Good try but you're not Gon");
			}
		}
		
		if (command.getName().equalsIgnoreCase("giveyoyo")) {
			if(player.hasPermission("lennyscustomitems.killua")) {
			player.getInventory().addItem(ItemManager.yoyo);
			}else{
				player.sendMessage("Good try but you're not Killua");
			}
		}

		if (command.getName().equalsIgnoreCase("giverainbow")) {
			if(player.hasPermission("lennyscustomitems.pokkle")) {
				player.getInventory().addItem(ItemManager.rainbow);
			}else{
				player.sendMessage("Good try but you're not Pokkle");
			}
		}

		if (command.getName().equalsIgnoreCase("givemjolnir")) {
			if(player.hasPermission("lennyscustomitems.admin")) {
				player.getInventory().addItem(ItemManager.mjolnir);
			}else{
				player.sendMessage("Good try but you have to find it :)");
			}
		}

		if (command.getName().equalsIgnoreCase("givezeus")) {
			if(player.hasPermission("lennyscustomitems.admin")) {
				player.getInventory().addItem(ItemManager.zeus);
			}else{
				player.sendMessage("Good try but you have to find it :)");
			}
		}

		if (command.getName().equalsIgnoreCase("givetrident")) {
			if(player.hasPermission("lennyscustomitems.admin")) {
				player.getInventory().addItem(ItemManager.trident);
			}else{
				player.sendMessage("Good try but you have to find it :)");
			}
		}
		if (command.getName().equalsIgnoreCase("livemap")) {
			player.sendMessage("So you want the live map? Here you go: http://45.138.49.95:25576/");
		}
		if (command.getName().equalsIgnoreCase("discord")) {
			player.sendMessage("https://discord.gg/f4zVna8B");
		}
		if (command.getName().equalsIgnoreCase("store")) {
			player.sendMessage("http://axol.tebex.io/");
		}
		return true;
	}
}