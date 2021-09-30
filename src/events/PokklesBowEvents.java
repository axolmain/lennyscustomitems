package events;

import items.ItemManager;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.*;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.entity.EntityShootBowEvent;
import org.bukkit.event.entity.ProjectileHitEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.util.Vector;

public class PokklesBowEvents implements Listener {

    @EventHandler


    public void onEntityBow(EntityShootBowEvent e) {

        if (e.getEntity() instanceof Player) {
            Player p = (Player) e.getEntity();
            if (p.hasPermission("lennyscustomitems.pokkle")) {
                if (p.getInventory().getItemInMainHand().equals(ItemManager.rainbow)) {
                    Arrow arrow = (Arrow) e.getProjectile();
                    Vector vec = p.getLocation().getDirection();
                    arrow.setVelocity((vec).multiply(4));
                }
            }
        }
    }

    @EventHandler
    public static void onRightClick(PlayerInteractEvent event) {
        if (event.getAction() == Action.LEFT_CLICK_BLOCK) {
            if (event.getItem() != null) {
                if (event.getItem().getItemMeta().equals(ItemManager.rainbow.getItemMeta())) {
                    Player player = event.getPlayer();
                    if (player.hasPermission("lennyscustomitems.pokkle")) {
                        player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 15 * 20, 4));
                        player.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, 15 * 20, 4));
                        player.sendMessage("§2You have 10 seconds of agility and extra hop, keep count");
                    }
                }
            }
        }
    }

    @EventHandler
    public void hit(ProjectileHitEvent e) {
        if (e.getEntity() instanceof Arrow &
                e.getEntity().getShooter() instanceof Player) {

            Arrow a = (Arrow) e.getEntity();
            Player s = (Player) a.getShooter();
            if (s.hasPermission("lennyscustomitems.pokkle")) {
                Player p = (Player) e.getEntity();
                if (p.getInventory().getItemInMainHand().equals(ItemManager.rainbow)) {


                    Location loc = a.getLocation();

                    World world = loc.getWorld();
                    double x = loc.getX();
                    double y = loc.getY();
                    double z = loc.getZ();

                    world.createExplosion(
                            x,
                            y,
                            z,
                            3, //size
                            false, // set fire
                            true); //block break

                }
            }
        }
    }
}