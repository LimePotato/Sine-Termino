package xyz.limepot.sine_termino.world.feature;



import java.util.List;

import net.minecraft.world.gen.feature.OreConfiguredFeatures;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import xyz.limepot.sine_termino.SineTermino;
import xyz.limepot.sine_termino.block.ModBlocks;

public class ModConfiguredFeatures {

    public static final List<OreFeatureConfig.Target> OVERWORLD_ALUMINIUM_ORES = List.of (
        OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES, ModBlocks.ALUMINIUM_ORE.getDefaultState())
    );
    public static final List<OreFeatureConfig.Target> OVERWORLD_TIN_ORES = List.of (
        OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES, ModBlocks.TIN_ORE.getDefaultState())
    );

    public static void registerConfigureFeatures(){
        SineTermino.LOGGER.debug("Registering Configure Features....");
    }

}
