package xyz.limepot.sine_termino.world.feature;

import net.minecraft.world.gen.feature.PlacementModifier;
import java.util.List;


public class ModPlacedFeatures {
    
    private static List<PlacementModifier> modifiers(PlacementModifier countModifier, PlacementModifier heightModifier) {
        return List.of(countModifier, SquarePlacementModifier.of(), heightModifier, BiomePlacementModifier.of());
    }
}
