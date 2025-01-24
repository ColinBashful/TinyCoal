package de.cjdev.tinycoal.item;

import de.cjdev.papermodapi.PaperModAPI;
import de.cjdev.papermodapi.api.recipe.CustomShapelessRecipe;
import de.cjdev.tinycoal.TinyCoal;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.ShapelessRecipe;

public record ModRecipes() {
    public static void init(){
        ShapelessRecipe tinyCoalRecipe = new ShapelessRecipe(TinyCoal.key("tinycoal"), ModItems.TINY_COAL.getDefaultStack().asQuantity(8));
        tinyCoalRecipe.addIngredient(Material.COAL);

        CustomShapelessRecipe coalRecipe = new CustomShapelessRecipe(Material.COAL);
        coalRecipe.addIngredient(8, ModItems.TINY_COAL);

        ShapelessRecipe tinyCharcoalRecipe = new ShapelessRecipe(TinyCoal.key("tinycharcoal"), ModItems.TINY_CHARCOAL.getDefaultStack().asQuantity(8));
        tinyCharcoalRecipe.addIngredient(Material.CHARCOAL);

        CustomShapelessRecipe charcoalRecipe = new CustomShapelessRecipe(Material.CHARCOAL);
        charcoalRecipe.addIngredient(8, ModItems.TINY_CHARCOAL);

        Bukkit.getServer().addRecipe(tinyCoalRecipe);
        PaperModAPI.addRecipe(TinyCoal.key("coal"), coalRecipe);
        Bukkit.getServer().addRecipe(tinyCharcoalRecipe);
        PaperModAPI.addRecipe(TinyCoal.key("charcoal"), charcoalRecipe);
    }
}
