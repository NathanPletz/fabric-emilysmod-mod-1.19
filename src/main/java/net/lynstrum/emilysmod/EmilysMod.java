package net.lynstrum.emilysmod;

import net.fabricmc.api.ModInitializer;
import net.lynstrum.emilysmod.block.ModBlocks;
import net.lynstrum.emilysmod.item.ModItemGroup;
import net.lynstrum.emilysmod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EmilysMod implements ModInitializer {
	public static final String MOD_ID = "emilysmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroup.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}
