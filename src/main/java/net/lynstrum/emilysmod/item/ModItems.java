package net.lynstrum.emilysmod.item;

import net.fabricmc.fabric.api.client.networking.v1.C2SPlayChannelEvents;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.lynstrum.emilysmod.EmilysMod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item RAW_TIN = registerItem("raw_tin",
            new Item(new FabricItemSettings()));

    public static final Item TIN_INGOT = registerItem("tin_ingot",
            new Item(new FabricItemSettings()));

    public static final Item GLOW_GOGGLES = registerItem("glow_goggles",
            new Item(new FabricItemSettings()));

    public static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, new Identifier(EmilysMod.MOD_ID, name), item);
    }

    public static void addItemsToItemGroup() {
        addToItemGroup(ModItemGroup.EMILYSMOD, RAW_TIN);
        addToItemGroup(ModItemGroup.EMILYSMOD, TIN_INGOT);
        addToItemGroup(ModItemGroup.EMILYSMOD, GLOW_GOGGLES);
    }

    public static void addToItemGroup(ItemGroup group, Item item){
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
    }

    public static void registerModItems(){
        EmilysMod.LOGGER.debug("Registering Mod Items for " + EmilysMod.MOD_ID);

        addItemsToItemGroup();
    }
}
