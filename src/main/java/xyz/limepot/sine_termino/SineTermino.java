package xyz.limepot.sine_termino;

import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import xyz.limepot.sine_termino.block.ModBlocks;
import xyz.limepot.sine_termino.item.ModItems;
import xyz.limepot.sine_termino.world.feature.ModConfiguredFeatures;

public class SineTermino implements ModInitializer {


	public static final String MOD_ID = "sine-termino";

	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod name as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger("Sine Termino");



	@Override
	public void onInitialize(ModContainer mod) {
		//ModConfiguredFeatures MUST ALWAYS be called first
		ModConfiguredFeatures.registerConfiguredFeatures();
		//ModConfiguredFeatures MUST ALWAYS be called first

		ModItems.registerModItems();
		LOGGER.info(MOD_ID + ": Items Registered");
		ModBlocks.registerModBlocks();
		LOGGER.info(MOD_ID + ": Blocks Registered");



		LOGGER.warn("Sine Termino has initialized.");
	}
}
