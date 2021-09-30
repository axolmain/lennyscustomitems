package events;

import items.ItemManager;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

import static org.bukkit.Material.WATER;

public class TridentEvents implements Listener {

    @EventHandler
    public static void onClick(PlayerInteractEvent event) {
        if (event.getAction() == Action.LEFT_CLICK_AIR) {
            if (event.getItem() != null) {
                if (event.getItem().getItemMeta().equals(ItemManager.trident.getItemMeta())) {
                    Player player = event.getPlayer();
                    player.setAbsorptionAmount(4);
                    player.getWorld().spawnEntity(player.getTargetBlock(null, 50).getLocation(), EntityType.DROWNED);
                }
            }
        }
        if (event.getAction() == Action.RIGHT_CLICK_AIR) {
            if (event.getItem() != null) {
                if (event.getItem().getItemMeta().equals(ItemManager.trident.getItemMeta())) {
                    Player player = event.getPlayer();
                    player.setAbsorptionAmount(4);
                    player.getWorld().createExplosion(player.getTargetBlock(null, 50).getLocation(), 2.0f );
                }
            }
        }
    }
}