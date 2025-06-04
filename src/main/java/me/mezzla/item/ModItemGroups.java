package me.mezzla.item;

import me.mezzla.Anihilia;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups{

    public static void registerModBlocks(){


    }
    public static final ItemGroup STICK_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(Anihilia.MOD_ID,"stick"), FabricItemGroup.builder().displayName(Text.translatable("itemGroup.stick"))
            .icon(() -> new ItemStack(ModItems.AEUXULIUM)).entries((displayContext, entries) -> {
                entries.add(ModItems.AEUXULIUM);
            }).build());
    public static void registerItemGroups(){

        Anihilia.LOGGER.info("Registering Mod Item Group for"+ Anihilia.MOD_ID);


    }
}
