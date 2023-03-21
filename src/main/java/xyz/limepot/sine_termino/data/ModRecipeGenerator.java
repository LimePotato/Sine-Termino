package xyz.limepot.sine_termino.data;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonFactory;
import net.minecraft.recipe.RecipeCategory;
import net.minecraft.recipe.ShapelessRecipe;
import org.quiltmc.qsl.recipe.api.builder.ShapelessRecipeBuilder;
import xyz.limepot.sine_termino.block.ModBlocks;
import xyz.limepot.sine_termino.item.ModItems;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeGenerator extends FabricRecipeProvider {
	public ModRecipeGenerator(FabricDataOutput output) {
		super(output);
	}

	@Override
	public void generateRecipes(Consumer<RecipeJsonProvider> exporter) {
		offerSmelting(exporter, List.of(ModItems.RAW_ALUMINIUM), RecipeCategory.MISC, ModItems.ALUMINIUM_INGOT, 3f, 300, "aluminium");



		//EXAMPLE
		/*
		offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.TIN_INGOT, RecipeCategory.DECORATIONS,
				ModBlocks.ALUMINIUM_ORE);


		ShapelessRecipeJsonFactory.create(RecipeCategory.MISC, ModItems.ALUMINIUM_INGOT)
				.ingredient()
		*/
	}
}
