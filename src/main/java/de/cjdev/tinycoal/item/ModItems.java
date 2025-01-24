package de.cjdev.tinycoal.item;

import de.cjdev.papermodapi.api.item.CustomItem;
import de.cjdev.papermodapi.api.item.CustomItems;
import de.cjdev.tinycoal.TinyCoal;
import org.bukkit.Material;

public record ModItems() {
    public static final CustomItem TINY_COAL = CustomItems.register(TinyCoal.key("tinycoal"), new CustomItem.Settings().baseMaterial(Material.COAL));
    public static final CustomItem TINY_CHARCOAL = CustomItems.register(TinyCoal.key("tinycharcoal"), new CustomItem.Settings().baseMaterial(Material.CHARCOAL));

    public static void init() {
    }
}
