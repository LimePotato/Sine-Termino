package xyz.limepot.sine_termino.data;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricDynamicRegistryProvider;
import net.minecraft.registry.HolderLookup;
import xyz.limepot.sine_termino.SineTermino;

import java.util.concurrent.CompletableFuture;

public class ModWorldGenerator  extends FabricDynamicRegistryProvider {
	public ModWorldGenerator(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
		super(output, registriesFuture);
	}

	@Override
	protected void configure(HolderLookup.Provider registries, Entries entries) {
		//HERE GOES FUTURE WORLDGEN
	}

	@Override
	public String getName() {
		return SineTermino.MOD_ID;
	}
}
