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
        System.out.println("[CraftableItems] Das Plugin wurde geladen!");
    }

    @Override
    public void onDisable() {
        System.out.println("[CraftableItems] Das Plugin wird entladen!");
    }
}
