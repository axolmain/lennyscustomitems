package events;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

import items.ItemManager;

import java.util.HashMap;
import java.util.Map;

public class ZeusEvents implements Listener {

    Map<String, Long> cooldowns = new HashMap<String, Long>();
    Map<String, Long> cooldown = new HashMap<String, Long>();
    Map<String, Long> flight = new HashMap<String, Long>();



    @EventHandler
    public void onRightClick(PlayerInteractEvent event) {
        if (event.getAction() == Action.RIGHT_CLICK_AIR) {
            Player player = event.getPlayer();
            if (cooldown.containsKey(player.getName())) {
                if (cooldown.get(player.getName()) > System.currentTimeMillis()) {
                    long timeleft = (cooldown.get(player.getName()) - System.currentTimeMillis()) / 1000;
                    player.sendMessage(ChatColor.GOLD + "Ability will be ready in " + timeleft + " second(s)");

                    return;
                }
            }
            cooldown.put(player.getName(), System.currentTimeMillis() + (5 * 1000));

            if (event.getItem() != null) {
                if (event.getItem().getItemMeta().equals(ItemManager.zeus.getItemMeta())) {
                    player.setAbsorptionAmount(4);
                    player.getWorld().strikeLightning(player.getTargetBlock(null, 50).getLocation());
                }
            }
        }

    }

    @EventHandler
    public void onClick(PlayerInteractEvent event) {
        if (event.getPlayer().hasPermission("lennyscustomitems.flight")) {
            Player player = event.getPlayer();
            if (event.getAction() == Action.RIGHT_CLICK_BLOCK) {
                if (cooldowns.containsKey(player.getName())) {
                    if (cooldowns.get(player.getName()) > System.currentTimeMillis()) {
                       long timeleft = (cooldowns.get(player.getName()) - System.currentTimeMillis()) / 1000;
                       player.sendMessage(ChatColor.GOLD + "Ability will be ready in " + timeleft + " second(s)");

                       return;
                    }
                }
                cooldowns.put(player.getName(), System.currentTimeMillis() + (60 * 1000));

                if (event.getItem().getItemMeta().equals(ItemManager.zeus.getItemMeta())) {

                    event.getPlayer().setAllowFlight(true);
                    event.getPlayer().setFlying(true);
                    flight.put(player.getName(), System.currentTimeMillis() + (5 * 1000));
                    event.getPlayer().setAllowFlight(false);
                    event.getPlayer().setFlying(false);

                }
            }
        }
    }
}
