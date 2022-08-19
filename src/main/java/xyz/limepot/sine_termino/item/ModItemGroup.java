package xyz.limepot.sine_termino.item;

import org.quiltmc.qsl.item.group.api.QuiltItemGroup;

import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import xyz.limepot.sine_termino.SineTermino;

public class ModItemGroup {
    public static final ItemGroup SINETERMINO = QuiltItemGroup.Builder.build(
        new Identifier(SineTermino.MOD_ID, "sine-termino"), () -> {new ItemStack(ModItems.SINETERMINO);});
    
}
