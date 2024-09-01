package de.herobrinepromc;

import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;

public final class CraftableItems extends JavaPlugin {

    @Override
    public void onEnable() {
        System.out.println("[CraftableItems] Das Plugin wird geladen!");
        {
            ShapedRecipe rtfl = new ShapedRecipe(new ItemStack(Material.LEATHER, 9));
            rtfl.shape(new String[] {"RRR","RRR","RRR"});
            rtfl.setIngredient('R', Material.ROTTEN_FLESH);
            Bukkit.addRecipe(rtfl);
            System.out.println("[CraftableItems] Rotten Flesh to Leather hinzugefügt!");
        }
        {
            ShapedRecipe opapple = new ShapedRecipe(new ItemStack(Material.ENCHANTED_GOLDEN_APPLE, 1));
            opapple.shape(new String[] {"GGG","GAG","GGG"});
            opapple.setIngredient('G', Material.GOLD_BLOCK);
            opapple.setIngredient('A', Material.APPLE);
            Bukkit.addRecipe(opapple);
            System.out.println("[CraftableItems] OP-Goldapfel hinzugefügt!");
        }
        {
            ShapedRecipe elytra = new ShapedRecipe(new ItemStack(Material.ELYTRA, 1));
            elytra.shape(new String[] {"MF ","SL ","   "});
            elytra.setIngredient('M', Material.PHANTOM_MEMBRANE);
            elytra.setIngredient('F', Material.FEATHER);
            elytra.setIngredient('S', Material.STRING);
            elytra.setIngredient('L', Material.LEATHER_CHESTPLATE);
            Bukkit.addRecipe(elytra);
            System.out.println("[CraftableItems] Elytra hinzugefügt!");
        }
        {
            ShapedRecipe diamondhorsearmor = new ShapedRecipe(new ItemStack(Material.DIAMOND_HORSE_ARMOR, 1));
            diamondhorsearmor.shape(new String[] {"D D","DDD","D D"});
            diamondhorsearmor.setIngredient('D', Material.DIAMOND);
            Bukkit.addRecipe(diamondhorsearmor);
            System.out.println("[CraftableItems] Diamant-Pferderüstung hinzugefügt!");
        }
        {
            ShapedRecipe goldhorsearmor = new ShapedRecipe(new ItemStack(Material.GOLDEN_HORSE_ARMOR, 1));
            goldhorsearmor.shape(new String[] {"G G","GGG","G G"});
            goldhorsearmor.setIngredient('G', Material.GOLD_INGOT);
            Bukkit.addRecipe(goldhorsearmor);
            System.out.println("[CraftableItems] Gold-Pferderüstung hinzugefügt!");
        }
        {
            ShapedRecipe ironhorsearmor = new ShapedRecipe(new ItemStack(Material.IRON_HORSE_ARMOR, 1));
            ironhorsearmor.shape(new String[] {"I I","III","I I"});
            ironhorsearmor.setIngredient('I', Material.IRON_INGOT);
            Bukkit.addRecipe(ironhorsearmor);
            System.out.println("[CraftableItems] Eisen-Pferderüstung hinzugefügt!");
        }
        {
            ShapedRecipe netherbricks = new ShapedRecipe(new ItemStack(Material.NETHER_BRICKS, 1));
            netherbricks.shape(new String[] {" W ","WZW"," W "});
            netherbricks.setIngredient('W', Material.NETHER_WART);
            netherbricks.setIngredient('Z', Material.STONE_BRICKS);
            Bukkit.addRecipe(netherbricks);
            System.out.println("[CraftableItems] Netherziegel wurde hinzugefügt!");
        }
        {
            ShapedRecipe dragonegg = new ShapedRecipe(new ItemStack(Material.DRAGON_EGG, 2)):
            dragonegg.shape(new String[] {"ODO","OEO","OOO"});
            dragonegg.setIngredient('O', Material.OBSIDIAN);
            dragonegg.setIngredient('D', Material.DRAGON_EGG);
            dragonegg.setIngredient('E', Material.EGG);
            Bukkit.addRecipe(dragonegg);
            System.out.println("[CraftableItems] Drachenei wurde hinzugefügt!");
        }
        System.out.println("[CraftableItems] Das Plugin wurde geladen!");
    }

    @Override
    public void onDisable() {
        System.out.println("[CraftableItems] Das Plugin wird entladen!");
    }
}
