package xyz.limepot.sine_termino.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;

import org.quiltmc.qsl.item.setting.api.QuiltItemSettings;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import xyz.limepot.sine_termino.SineTermino;

public class ModItems {

    public static final Item TIN_INGOT = registerItem("tin_ingot",
        new Item(new QuiltItemSettings()));

    public static final Item BRONZE_INGOT = registerItem("bronze_ingot",
        new Item(new QuiltItemSettings()));

    public static final Item ALUMINIUM_INGOT = registerItem("aluminium_ingot",
        new Item(new QuiltItemSettings()));

    public static final Item PIG_IRON_INGOT = registerItem("pig_iron_ingot",
        new Item(new QuiltItemSettings()));

	//RAW
	public static final Item RAW_PIG_IRON = registerItem("raw_pig_iron",
			new Item(new QuiltItemSettings()));

	public static final Item RAW_ALUMINIUM = registerItem("raw_aluminium",
			new Item(new QuiltItemSettings()));

	public static final Item RAW_TIN = registerItem("raw_tin",
			new Item(new QuiltItemSettings()));

	public static final Item RAW_BRONZE = registerItem("raw_bronze",
			new Item(new QuiltItemSettings()));



    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, new Identifier(SineTermino.MOD_ID, name), item);
    }

    public static void registerModItems() {
        SineTermino.LOGGER.debug("Registering Items....");
    }

}
