package me.mezzla.item;

import me.mezzla.Anihilia;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item AEUXULIUM = registerItem("aeuxulium", new Item(new FabricItemSettings()));

    public static final Item AEUXULIUM_SWORD = registerItem("aeuxulium_sword", new SwordItem(ModToolMaterial.AEUXULIUM, 5, 3f, new FabricItemSettings()));

    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries) {
        entries.add(AEUXULIUM);

    }
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Anihilia.MOD_ID, name ), item);
    }
    public static void registerModItems(){


        Anihilia.LOGGER.info("Registering Mod Items for "+ Anihilia.MOD_ID);
    }
}
