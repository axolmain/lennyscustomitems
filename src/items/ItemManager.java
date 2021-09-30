package items;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class ItemManager {
	
	public static ItemStack yoyo;
	public static ItemStack gonsrod;
	public static ItemStack rainbow;
    public static ItemStack mjolnir;
    public static ItemStack trident;
    public static ItemStack excalibur;
    public static ItemStack zeus;
	
	public static void init() {
		createYoyo();
		createGonsrod();
		createRainbow();
		createMjolnir();
		createTrident();
		createZeus();
		createExcalibur();
	}
	
	private static void createYoyo() {
		ItemStack item = new ItemStack(Material.STICK, 1);
		ItemMeta meta= item.getItemMeta();
		meta.setDisplayName("§7§lKillua's yoyo");
		List<String> lore = new ArrayList<>();
		lore.add("§2This powerful tool isn't a yoyo");
		lore.add("§2but a stick");
		meta.setLore(lore);
		meta.addEnchant(Enchantment.LUCK, 1, false);
		meta.addEnchant(Enchantment.DAMAGE_ALL, 5, true);
		meta.addEnchant(Enchantment.KNOCKBACK, 2, false);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		item.setItemMeta(meta);
		yoyo = item;
	}
	
	private static void createGonsrod() {
		ItemStack item = new ItemStack(Material.FISHING_ROD, 1);
		ItemMeta meta= item.getItemMeta();
		meta.setDisplayName("§2§lGon's fishing rod");
		ArrayList<String> lore = new ArrayList<>();
		lore.add("§6This fishing rod was once Ging's");
		lore.add("§6§oI wonder what he caught with it");
		meta.setLore(lore);
		meta.addEnchant(Enchantment.DAMAGE_ALL, 13,false);
		meta.addEnchant(Enchantment.LUCK, 3, false);
		meta.addEnchant(Enchantment.LURE, 8, false);
		meta.addEnchant(Enchantment.DURABILITY, 5, false);
		item.setItemMeta(meta);
		gonsrod = item;
	}

	private static void createRainbow() {
		ItemStack item = new ItemStack(Material.BOW, 1);
		ItemMeta meta = item.getItemMeta();
		meta.setDisplayName("七色弓箭");
		ArrayList<String> lore = new ArrayList<>();
		lore.add("§4Right click for Red arrow ");
		lore.add("§6Left click for Orange arrow");
		meta.setLore(lore);
        meta.addEnchant(Enchantment.DURABILITY, 1000, false);
        meta.addEnchant(Enchantment.MENDING, 1000, false);
		meta.addEnchant(Enchantment.ARROW_DAMAGE, 4, true);
		meta.addEnchant(Enchantment.PIERCING, 3, false);
		item.setItemMeta(meta);
		rainbow = item;
	}

	private static void createMjolnir() {
	    ItemStack item = new ItemStack(Material.IRON_AXE, 1);
	    ItemMeta meta = item.getItemMeta();
	    meta.setDisplayName("§e§lThor's Hammer");
	    ArrayList<String> lore = new ArrayList<>();
	    lore.add("§7This hammer once belonged to the mighty Thor");
	    lore.add("§7But now it seems to have found you...");
	    meta.setLore(lore);
        meta.addEnchant(Enchantment.DURABILITY, 1000, false);
	    meta.addEnchant(Enchantment.DIG_SPEED, 5, true);
        meta.addEnchant(Enchantment.DAMAGE_ALL, 13, true);
        meta.addEnchant(Enchantment.KNOCKBACK, 3, false);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        item.setItemMeta(meta);
        mjolnir = item;
    }

    private static void createTrident() {
	    ItemStack item = new ItemStack(Material.TRIDENT, 1);
	    ItemMeta meta = item.getItemMeta();
	    meta.setDisplayName("§3§lPoseidon's Trident");
	    ArrayList<String> lore = new ArrayList<>();
	    lore.add("§bThis Trident is like no other,");
	    lore.add("§bforged by the Cyclopes's themselves");
	    lore.add("§bit holds much power. Treat it well.");
        meta.setLore(lore);
        meta.addEnchant(Enchantment.DURABILITY, 1000, false);
        meta.addEnchant(Enchantment.LOYALTY, 5, true);
        meta.addEnchant(Enchantment.DAMAGE_ALL, 10, true);
		meta.addEnchant(Enchantment.RIPTIDE, 3, false);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        item.setItemMeta(meta);
        trident = item;
    }

    private static void createZeus() {
	    ItemStack item = new ItemStack(Material.BLAZE_ROD, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§e§lZeus's §b§llightning bolt");
        ArrayList<String> lore = new ArrayList<>();
        lore.add("§6The very lightning bolt that");
        lore.add("§6sent the titans back to");
        lore.add("§6the depths of Tartarus");
        meta.setLore(lore);
        meta.addEnchant(Enchantment.DAMAGE_ALL, 13, false);
        meta.addEnchant(Enchantment.DURABILITY, 1000, false);
		meta.addEnchant(Enchantment.FIRE_ASPECT, 5, false);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        item.setItemMeta(meta);
        zeus = item;
    }
    private static void createExcalibur() {
        ItemStack item = new ItemStack(Material.IRON_SWORD, 1);
        ItemMeta meta= item.getItemMeta();
        meta.setDisplayName("§7§lExcalibur`");
        List<String> lore = new ArrayList<>();
        lore.add("§2Made by the lady of the lake");
        lore.add("§2only the worthy shall be able");
        lore.add("§2to yield its power");
        meta.setLore(lore);
        meta.addEnchant(Enchantment.LUCK, 1, false);
        meta.addEnchant(Enchantment.DAMAGE_ALL, 14, true);
        meta.addEnchant(Enchantment.FIRE_ASPECT, 2, false);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        item.setItemMeta(meta);
        excalibur = item;
    }

}