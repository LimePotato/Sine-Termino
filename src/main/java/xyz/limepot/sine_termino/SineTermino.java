package xyz.limepot.sine_termino;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.Items;
import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import xyz.limepot.sine_termino.block.ModBlocks;
import xyz.limepot.sine_termino.item.ModItems;
import xyz.limepot.sine_termino.item.ModItems.*;

import static xyz.limepot.sine_termino.block.ModBlocks.*;
import static xyz.limepot.sine_termino.item.ModItems.*;

@SuppressWarnings("ALL")
public class SineTermino implements ModInitializer {


	public static final String MOD_ID = "sine-termino";

	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod name as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger("Sine Termino");



	@Override
	public void onInitialize(ModContainer mod) {
		//ModConfiguredFeatures MUST ALWAYS be called first
		//ModConfiguredFeatures.registerConfiguredFeatures();
		//ModConfiguredFeatures MUST ALWAYS be called first

		ModItems.registerModItems();
		LOGGER.debug(MOD_ID + ": Items Registered");
		ModBlocks.registerModBlocks();
		LOGGER.debug(MOD_ID + ": Blocks Registered");


		//CREATIVE TABS
		SineTermino.LOGGER.debug("Registering Creative Tab Entries...");
			//ITEMS
			ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(content -> {
				content.addAfter(Items.IRON_BARS, TIN_INGOT);
			});
			ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(content -> {
				content.addAfter(Items.IRON_BARS, BRONZE_INGOT);
			});
			ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(content -> {
				content.addAfter(Items.IRON_BARS, ALUMINIUM_INGOT);
			});
			ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(content -> {
				content.addAfter(Items.IRON_BARS, PIG_IRON_INGOT);
			});
				//RAW ALLOY

			ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(content -> {
				content.addAfter(Items.RAW_GOLD, RAW_TIN);
			});
			ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(content -> {
				content.addAfter(Items.RAW_GOLD, RAW_BRONZE);
			});
			ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(content -> {
				content.addAfter(Items.RAW_GOLD, RAW_ALUMINIUM);
			});
			ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(content -> {
				content.addAfter(Items.RAW_GOLD, RAW_PIG_IRON);
			});
				//BLOCKS
					//ORES
			ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL_BLOCKS).register(content -> {
				content.addAfter(Items.DEEPSLATE_DIAMOND_ORE, TIN_ORE);
			});
			ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL_BLOCKS).register(content -> {
				content.addAfter(Items.DEEPSLATE_DIAMOND_ORE, DEEPSLATE_TIN_ORE);
			});
			ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL_BLOCKS).register(content -> {
				content.addAfter(Items.DEEPSLATE_DIAMOND_ORE, ALUMINIUM_ORE);
			});
			ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL_BLOCKS).register(content -> {
				content.addAfter(Items.DEEPSLATE_DIAMOND_ORE, DEEPSLATE_ALUMINIUM_ORE);
			});
			//OTHER BLOCKS
			ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL_BLOCKS).register(content -> {
				content.addAfter(Items.FARMLAND, MOON_DUST);
			});
			ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL_BLOCKS).register(content -> {
				content.addAfter(Items.FARMLAND, MOON_ROCK);
			});
			ItemGroupEvents.modifyEntriesEvent(ItemGroups.FUNCTIONAL_BLOCKS).register(content -> {
				content.addAfter(Items.BLAST_FURNACE, ARC_FURNACE);
			});
			ItemGroupEvents.modifyEntriesEvent(ItemGroups.FUNCTIONAL_BLOCKS).register(content -> {
				content.addAfter(Items.BLAST_FURNACE, CERAMIC_FURNACE);
			});
		LOGGER.debug(MOD_ID + ": Creative Tab Entries Registered");



		LOGGER.warn("Sine Termino has initialized, See you in the stars!");
	}
}
