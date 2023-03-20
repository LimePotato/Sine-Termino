package xyz.limepot.sine_termino.block;

import org.quiltmc.qsl.block.extensions.api.QuiltBlockSettings;
import org.quiltmc.qsl.item.setting.api.QuiltItemSettings;

import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import xyz.limepot.sine_termino.SineTermino;
import xyz.limepot.sine_termino.block.custom.ArcFurnaceBlock;
import xyz.limepot.sine_termino.block.custom.CeramicFurnaceBlock;

//NOTE: this file only registers the blocks, for more indepth block coding, make a new java file in "BlockName.java" Format
//and make extra code there.

public class ModBlocks {

    //ores
    public static final Block TIN_ORE = registerBlock("tin_ore", new Block(QuiltBlockSettings.of(Material.STONE)
			.strength(4f).requiresTool()));
    public static final Block ALUMINIUM_ORE = registerBlock("aluminium_ore", new Block(QuiltBlockSettings.of(Material.STONE)
			.strength(4f).requiresTool()));
    //special blocks
    public static final Block ARC_FURNACE = registerBlock("arc_furnace", new ArcFurnaceBlock(QuiltBlockSettings.of(Material.METAL)
			.strength(2f)));
    public static final Block ENGINEERING_TABLE = registerBlock("engineering_table", new Block(QuiltBlockSettings.of(Material.METAL)
			.strength(2f)));
	public static final Block CERAMIC_FURNACE = registerBlock("ceramic_furnace", new CeramicFurnaceBlock(QuiltBlockSettings.of(Material.STONE)
			.nonOpaque().strength(2f).luminance(state -> state.get(CeramicFurnaceBlock.LIT) ? 7 : 0)));
    //don't forget to add these to the tools shit thingy in the resources.
    public static final Block MOON_DUST = registerBlock("moon_dust", new Block(QuiltBlockSettings.of(Material.SNOW_BLOCK)
			.strength(2f)));
    public static final Block MOON_ROCK = registerBlock("moon_rock", new Block(QuiltBlockSettings.of(Material.STONE)
			.strength(2f)));



    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(SineTermino.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(SineTermino.MOD_ID, name),
        new BlockItem(block, new QuiltItemSettings()));
    }

    public static void registerModBlocks() {
        SineTermino.LOGGER.debug("Registering Blocks...");
    }

}
