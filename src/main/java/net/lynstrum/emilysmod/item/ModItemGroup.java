package net.lynstrum.emilysmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.lynstrum.emilysmod.EmilysMod;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroup {

    public static ItemGroup EMILYSMOD;

    public static void registerItemGroups(){
        EMILYSMOD = FabricItemGroup.builder(new Identifier(EmilysMod.MOD_ID, "emilys_mod"))
                .displayName(Text.translatable("itemgroup.emilysmod"))
                .icon(() -> new ItemStack(ModItems.TIN_INGOT)).build();
    }
}
