package xyz.limepot.sine_termino.world.feature;


import net.minecraft.world.gen.feature.OreConfiguredFeatures;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import xyz.limepot.sine_termino.SineTermino;
import xyz.limepot.sine_termino.block.ModBlocks;

import java.util.List;

public class ModConfiguredFeatures{/*
	public static final List<OreFeatureConfig.Target> OVERWORLD_ALUMINIUM_ORES = List.of(
			OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES, ModBlocks.ALUMINIUM_ORE.getDefaultState()));
	        //DEEPSLATE VERSIONS
	public static final List<OreFeatureConfig.Target> OVERWORLD_TIN_ORES = List.of(
			OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES, ModBlocks.TIN_ORE.getDefaultState()));
			//DEEPSLATE VERSIONS



	//public static final DynamicRegistryManager.RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> ALUMINIUM_ORE =
	//		ConfiguredFeatures.register("aluminium_ore", Feature.ORE, new OreFeatureConfig(OVERWORLD_ALUMINIUM_ORES, 9));
*/

    public static void registerConfiguredFeatures(){
        SineTermino.LOGGER.debug("Registering the ModConfiguredFeatures");
    }
}
