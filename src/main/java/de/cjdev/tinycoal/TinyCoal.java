package de.cjdev.tinycoal;

import de.cjdev.papermodapi.PaperModAPI;
import de.cjdev.papermodapi.api.itemgroup.CustomItemGroup;
import de.cjdev.tinycoal.item.ModItems;
import de.cjdev.tinycoal.item.ModRecipes;
import net.kyori.adventure.text.Component;
import org.bukkit.NamespacedKey;
import org.bukkit.plugin.java.JavaPlugin;

public final class TinyCoal extends JavaPlugin {
    private static TinyCoal plugin;

    @Override
    public void onEnable() {
        plugin = this;

        ModItems.init();
        ModRecipes.init();
        CustomItemGroup.builder()
                .displayName(Component.translatable("item.tinycoal.tinycoal"))
                .icon(ModItems.TINY_COAL::getDefaultStack)
                .entries((b, entries) -> {
                    entries.add(ModItems.TINY_COAL);
                    entries.add(ModItems.TINY_CHARCOAL);
                }).build();

        PaperModAPI.registerFuel(ModItems.TINY_COAL, 200);
        PaperModAPI.registerFuel(ModItems.TINY_CHARCOAL, 200);
    }

    public static NamespacedKey key(String id){
        return NamespacedKey.fromString(id, getPlugin());
    }

    public static TinyCoal getPlugin(){
        return plugin;
    }
}
