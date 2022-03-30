package net.alexandra.malechia;

import net.alexandra.malechia.block.ModBlocks;
import net.alexandra.malechia.effects.ModEffects;
import net.alexandra.malechia.enchantments.ModEnchantments;
import net.alexandra.malechia.item.ModItems;
import net.alexandra.malechia.util.ModLootTableModifiers;
import net.alexandra.malechia.util.ModRegistries;
import net.alexandra.malechia.worldgeneration.feature.ModConfiguredFeatures;
import net.alexandra.malechia.worldgeneration.gen.ModWorldGen;
import net.fabricmc.api.ModInitializer;
import net.kyrptonaught.customportalapi.api.CustomPortalBuilder;
import net.minecraft.block.Blocks;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;

public class MalechiaMod implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final String MOD_ID = "malechia";
	public static final Logger LOGGER = LoggerFactory.getLogger("Malechia");

	@Override
	public void onInitialize() {
		CustomPortalBuilder.beginPortal()
			.frameBlock(Blocks.NETHERITE_BLOCK)
			.flatPortal()
			.onlyLightInOverworld()
			.lightWithItem(Items.NETHER_STAR)
			.destDimID(new Identifier("malechia:ethereal_core"))
			.tintColor(0, 197, 255)
			.registerPortal();
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.


		ModConfiguredFeatures.registerConfiguredFeatures();
		ModWorldGen.generateModWorldGen();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModEnchantments.registerModEnchantments();
		ModEffects.registerModEffects();
		ModLootTableModifiers.modifyLootTables();
		ModRegistries.registerModStuffs();
	}
}
