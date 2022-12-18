package xyz.limepot.sine_termino;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;
import xyz.limepot.sine_termino.block.ModBlocks;
import xyz.limepot.sine_termino.util.ModModelPredicateProvider;

public abstract class SineTerminoClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {

		BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(), ModBlocks.CERAMIC_FURNACE);
		BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(), ModBlocks.ARC_FURNACE);


		//ModModelPredicateProvider.registerModModels();
	}
}
