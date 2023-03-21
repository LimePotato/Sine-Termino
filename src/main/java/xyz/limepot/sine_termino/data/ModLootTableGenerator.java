package xyz.limepot.sine_termino.data;


import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.loot.LootTable;
import net.minecraft.util.Identifier;
import xyz.limepot.sine_termino.block.ModBlocks;
import xyz.limepot.sine_termino.item.ModItems;

import java.util.function.BiConsumer;

public class ModLootTableGenerator extends FabricBlockLootTableProvider {
	public ModLootTableGenerator(FabricDataOutput dataOutput) {
		super(dataOutput);
	}


	@Override
	public void generate() {
		addDrop(ModBlocks.ARC_FURNACE);
		addDrop(ModBlocks.CERAMIC_FURNACE);
		addDrop(ModBlocks.ENGINEERING_TABLE);
		addDrop(ModBlocks.MOON_DUST);
		addDrop(ModBlocks.MOON_ROCK);
		oreDrops(ModBlocks.ALUMINIUM_ORE, ModItems.RAW_ALUMINIUM);
		oreDrops(ModBlocks.DEEPSLATE_ALUMINIUM_ORE, ModItems.RAW_ALUMINIUM);
		oreDrops(ModBlocks.TIN_ORE, ModItems.RAW_TIN);
		oreDrops(ModBlocks.DEEPSLATE_TIN_ORE, ModItems.RAW_TIN);
	}

	@Override
	public void accept(BiConsumer<Identifier, LootTable.Builder> identifierBuilderBiConsumer) {

	}
}
