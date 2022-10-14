package xyz.limepot.sine_termino.item;

import net.minecraft.util.registry.Registry;

import org.quiltmc.qsl.item.setting.api.QuiltItemSettings;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import xyz.limepot.sine_termino.SineTermino;

public class ModItems {

    public static final Item TIN_INGOT = registerItem("tin_ingot", 
        new Item(new QuiltItemSettings().group(ItemGroup.MISC)));

    public static final Item BRONZE_INGOT = registerItem("bronze_ingot", 
        new Item(new QuiltItemSettings().group(ItemGroup.MISC)));

    public static final Item ALUMINIUM_INGOT = registerItem("aluminium_ingot", 
        new Item(new QuiltItemSettings().group(ItemGroup.MISC)));

    public static final Item PIG_IRON_INGOT = registerItem("pig_iron_ingot", 
        new Item(new QuiltItemSettings().group(ItemGroup.MISC)));


    private static Item registerItem(String name, Item item){
        return Registry.register(Registry.ITEM, new Identifier(SineTermino.MOD_ID, name), item);
    }
    
    public static void registerModItems() {
        SineTermino.LOGGER.info("Registering Items....");
    }

}
