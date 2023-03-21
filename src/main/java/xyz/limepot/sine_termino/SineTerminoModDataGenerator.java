package xyz.limepot.sine_termino;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.minecraft.registry.RegistryKeys;
import org.apache.http.config.RegistryBuilder;
import xyz.limepot.sine_termino.data.ModLootTableGenerator;
import xyz.limepot.sine_termino.data.ModModelProvider;
import xyz.limepot.sine_termino.data.ModRecipeGenerator;
import xyz.limepot.sine_termino.data.ModWorldGenerator;
import xyz.limepot.sine_termino.world.ModConfiguredFeatures;

public class SineTerminoModDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

		pack.addProvider(ModLootTableGenerator::new);
		pack.addProvider(ModRecipeGenerator::new);
		pack.addProvider(ModModelProvider::new);
		pack.addProvider(ModWorldGenerator::new);
	}
}
