package events;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.potion.*;
import items.ItemManager;

public class GonsRodEvents implements Listener {

	@EventHandler
	public static void onRightClick(PlayerInteractEvent event) {
		if (event.getAction() == Action.LEFT_CLICK_BLOCK) {
			if (event.getItem() != null) {
				if (event.getItem().getItemMeta().equals(ItemManager.gonsrod.getItemMeta())) {
					Player player = event.getPlayer();
					player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 6 * 20, 4));
					player.sendMessage("§2Get away quick");
				}
			}
		}
			if (event.getAction() == Action.LEFT_CLICK_AIR) {
				if (event.getItem() != null) {
					if (event.getItem().getItemMeta().equals(ItemManager.gonsrod.getItemMeta())) {
						Player player = event.getPlayer();
						player.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, 6 * 20, 4));
						player.sendMessage("§2Get away quick but you can jump");
					}
				}
			}
			if (event.getAction() == Action.RIGHT_CLICK_BLOCK) {
				if (event.getItem() != null) {
					if (event.getItem().getItemMeta().equals(ItemManager.gonsrod.getItemMeta())) {
						Player player = event.getPlayer();
						player.addPotionEffect(new PotionEffect(PotionEffectType.INVISIBILITY, 10 * 20, 4));
						player.addPotionEffect(new PotionEffect(PotionEffectType.NIGHT_VISION, 10 * 20, 4));
						player.sendMessage("§2You have 10 seconds of invisibilty, keep count");
					}
				}
			}
	}
}