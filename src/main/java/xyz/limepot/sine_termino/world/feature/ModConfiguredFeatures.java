package xyz.limepot.sine_termino.world.feature;

import java.util.List;

import net.minecraft.util.registry.DynamicRegistryManager.RegistryEntry;
import net.minecraft.world.gen.feature.*;
import xyz.limepot.sine_termino.SineTermino;
import xyz.limepot.sine_termino.block.ModBlocks;

public class ModConfiguredFeatures {
    public static final List<OreFeatureConfig.Target> OVERWORLD_ALUMINIUM_ORES = List.of (
        OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES, ModBlocks.ALUMINIUM_ORE.getDefaultState())
    );
    public static final List<OreFeatureConfig.Target> OVERWORLD_TIN_ORES = List.of (
        OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES, ModBlocks.TIN_ORE.getDefaultState())
    );
    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> ALUMINIUM_ORE =
        ConfiguredFeature("aluminium_ore", Feature.ORE, new OreFeatureConfig(OVERWORLD_ALUMINIUM_ORES, 9));
        public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> TIN_ORE =
        ConfiguredFeature("tin_ore", Feature.ORE, new OreFeatureConfig(OVERWORLD_TIN_ORES, 9));
    

    public static void registerConfiguredFeatures(){
        SineTermino.LOGGER.debug("Registering the ModConfiguredFeatures");


    }


    private static RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> ConfiguredFeature(String string,
            Feature<OreFeatureConfig> ore, OreFeatureConfig oreFeatureConfig) {
        return null;
    }
}
