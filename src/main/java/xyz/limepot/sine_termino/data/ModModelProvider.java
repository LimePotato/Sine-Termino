package xyz.limepot.sine_termino.data;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.model.BlockStateModelGenerator;
import net.minecraft.data.client.model.Models;
import xyz.limepot.sine_termino.block.ModBlocks;
import xyz.limepot.sine_termino.item.ModItems;

public class ModModelProvider extends FabricModelProvider {
	public ModModelProvider(FabricDataOutput output) {
		super(output);
	}

	@Override
	public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
		blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.MOON_DUST);
		blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.MOON_ROCK);
		blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.ALUMINIUM_ORE);
		blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.DEEPSLATE_ALUMINIUM_ORE);
		blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.TIN_ORE);
		blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.DEEPSLATE_TIN_ORE);

	}

	@Override
	public void generateItemModels(ItemModelGenerator itemModelGenerator) {
		//itemModelGenerator.register(ModItems.ALUMINIUM_INGOT, Models.GENERATED);
	}
}
