package xyz.limepot.sine_termino;

import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;

import net.minecraft.util.registry.Registry;
import org.quiltmc.qsl.item.setting.api.QuiltItemSettings;

public class SineTermino implements ModInitializer {

	public static final String MOD_ID = "sine-termino";

	public static final Item TIN_INGOT = registerItem("tin_ingot", 
        new Item(new QuiltItemSettings().group(ItemGroup.MISC)));

    public static final Item BRONZE_INGOT = registerItem("bronze_ingot", 
        new Item(new QuiltItemSettings().group(ItemGroup.MISC)));

    public static final Item ALUMINIUM_INGOT = registerItem("aluminium_ingot", 
        new Item(new QuiltItemSettings().group(ItemGroup.MISC)));


		private static Item registerItem(String name, Item item){
			return Registry.register(Registry.ITEM, new Identifier(SineTermino.MOD_ID, name), item);
		}

	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod name as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger("Sine Termino");

	@Override
	public void onInitialize(ModContainer mod) {

		
		LOGGER.warn("Initialization Hijacked!!!!");
		LOGGER.info("~=============================================~", mod.metadata().name());
		LOGGER.info("~ Ouroboros Process Initialized....", mod.metadata().name());
		LOGGER.info("~ SONIA Initialized....", mod.metadata().name());
		LOGGER.info("~ Enabling SONIA.ChildProcess....", mod.metadata().name());
		LOGGER.info("~ Child Process 'SIDIOS' Initialized....", mod.metadata().name());
		LOGGER.info("~ .............", mod.metadata().name());
		LOGGER.info("~ .............", mod.metadata().name());
		LOGGER.info("~ We know everything about you.", mod.metadata().name());
		LOGGER.info("~=============================================~", mod.metadata().name());
	}
}
