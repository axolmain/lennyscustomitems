package events;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

import items.ItemManager;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class KilluasYoyo implements Listener {
	
	@EventHandler
	public static void onRightClick(PlayerInteractEvent event) {
		if (event.getAction() == Action.RIGHT_CLICK_AIR) {
			if (event.getItem() != null) {
				if (event.getItem().getItemMeta().equals(ItemManager.yoyo.getItemMeta())) {
					Player player = event.getPlayer();
					player.setAbsorptionAmount(4);
					player.getWorld().strikeLightning(player.getTargetBlock(null, 50).getLocation());
					player.sendMessage("not ready");

				}
			}
		}
        if (event.getAction() == Action.LEFT_CLICK_BLOCK) {
            if (event.getItem() != null) {
                if (event.getItem().getItemMeta().equals(ItemManager.yoyo.getItemMeta())) {
                    Player player = event.getPlayer();
                    player.addPotionEffect(new PotionEffect(PotionEffectType.INVISIBILITY, 15 * 20, 4));
                    player.addPotionEffect(new PotionEffect(PotionEffectType.NIGHT_VISION, 15 * 20, 4));
                    player.sendMessage("§2You have 10 seconds of invisibilty, keep count");
                }
            }
        }
	}
}