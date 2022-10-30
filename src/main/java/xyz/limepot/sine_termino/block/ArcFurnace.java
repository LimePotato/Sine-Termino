package xyz.limepot.sine_termino.block;
import net.minecraft.block.BlockState;
import net.minecraft.block.HorizontalFacingBlock;
import net.minecraft.block.ShapeContext;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.state.property.Properties;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import xyz.limepot.sine_termino.block.ArcFurnace;

//NOTE: Maybe ill look into how to make a block entity, and just copy the furnace code, because i do not understand this. or
//why it's not working.

public class ArcFurnace<Block> extends HorizontalFacingBlock {
    //Make the Arc Furnace face the player when placed.
    protected ArcFurnace(Settings settings) {
        super(settings);
        setDefaultState(this.stateManager.getDefaultState().with(Properties.HORIZONTAL_FACING, Direction.NORTH));
    }

    //SUPPOSEDLY im supposed to add THIS FOLLOWING CODE, but IT. DOES. NOT. WORK!
    //////////////////////////////////////////////////////////////////////////
    //@Override
	//protected void appendProperties(StateManager.Builder<Block, BlockState> stateManager) {
	//    stateManager.add(Properties.HORIZONTAL_FACING);
	//}
    //////////////////////////////////////////////////////////////////////////
    //Importing the net.minecraft.state, simply breaks the entire line? why? Says it wants it to override a super? idk what that means.
    
    @Override
	public VoxelShape getOutlineShape(BlockState state, BlockView view, BlockPos pos, ShapeContext ctx) {
		Direction dir = state.get(FACING);
		switch(dir) {
			case NORTH:
				return VoxelShapes.cuboid(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.5f);
			case SOUTH:
				return VoxelShapes.cuboid(0.0f, 0.0f, 0.5f, 1.0f, 1.0f, 1.0f);
			case EAST:
				return VoxelShapes.cuboid(0.5f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
			case WEST:
				return VoxelShapes.cuboid(0.0f, 0.0f, 0.0f, 0.5f, 1.0f, 1.0f);
			default:
				return VoxelShapes.fullCube();
		}
	}


    @Override
	public BlockState getPlacementState(ItemPlacementContext ctx) {
		return (BlockState)this.getDefaultState().with(Properties.HORIZONTAL_FACING, ctx.getPlayerFacing().getOpposite());
	}
    
}
