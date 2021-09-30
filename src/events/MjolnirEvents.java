package events;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

import items.ItemManager;


public class MjolnirEvents implements Listener {

    @EventHandler
    public static void onRightClick(PlayerInteractEvent event) {
        if (event.getAction() == Action.RIGHT_CLICK_AIR) {
            if (event.getItem() != null) {
                if (event.getItem().getItemMeta().equals(ItemManager.mjolnir.getItemMeta())) {
                    Player player = event.getPlayer();
                    player.setAbsorptionAmount(4);
                    player.getWorld().strikeLightning(player.getTargetBlock(null, 50).getLocation());
                }
            }
        }
    }
}