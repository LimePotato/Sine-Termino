package xyz.limepot.sine_termino.block.custom;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.DirectionProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.ActionResult;
import net.minecraft.util.BlockMirror;
import net.minecraft.util.BlockRotation;
import net.minecraft.util.Hand;
import net.minecraft.util.function.BooleanBiFunction;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.random.RandomGenerator;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.stream.Stream;

public class CeramicFurnaceBlock extends Block {

	public static final DirectionProperty FACING = Properties.HORIZONTAL_FACING;
	public static final BooleanProperty LIT = BooleanProperty.of("lit");


	public CeramicFurnaceBlock(Settings settings) {
		super(settings);
		this.setDefaultState((BlockState)((BlockState)((BlockState)this.stateManager.getDefaultState()).with(FACING, Direction.NORTH)).with(LIT, false));
	}

	@Override
	public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
		if(!world.isClient() && hand == Hand.MAIN_HAND) {
			world.setBlockState(pos, state.cycle(LIT));
		}

		return super.onUse(state, world, pos, player, hand, hit);
	}

	private static final VoxelShape SHAPE_NORTH = Stream.of(
			Block.createCuboidShape(4, 2, 4, 12, 4, 12),
			Block.createCuboidShape(5, 4, 5, 11, 5, 11),
			Block.createCuboidShape(6, 5, 6, 10, 6, 10),
			Block.createCuboidShape(5, 5, 5, 6, 7, 11),
			Block.createCuboidShape(10, 5, 5, 11, 7, 11),
			Block.createCuboidShape(6, 5, 10, 10, 7, 11),
			Block.createCuboidShape(6, 5, 5, 10, 7, 6),
			Block.createCuboidShape(3, 0, 3, 13, 2, 13)
	).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get();

	private static final VoxelShape SHAPE_EAST = Stream.of(
			Block.createCuboidShape(4, 2, 4, 12, 4, 12),
			Block.createCuboidShape(5, 4, 5, 11, 5, 11),
			Block.createCuboidShape(6, 5, 6, 10, 6, 10),
			Block.createCuboidShape(5, 5, 5, 11, 7, 6),
			Block.createCuboidShape(5, 5, 10, 11, 7, 11),
			Block.createCuboidShape(5, 5, 6, 6, 7, 10),
			Block.createCuboidShape(10, 5, 6, 11, 7, 10),
			Block.createCuboidShape(3, 0, 3, 13, 2, 13)
	).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get();

	private static final VoxelShape SHAPE_SOUTH = Stream.of(
			Block.createCuboidShape(4, 2, 4, 12, 4, 12),
			Block.createCuboidShape(5, 4, 5, 11, 5, 11),
			Block.createCuboidShape(6, 5, 6, 10, 6, 10),
			Block.createCuboidShape(10, 5, 5, 11, 7, 11),
			Block.createCuboidShape(5, 5, 5, 6, 7, 11),
			Block.createCuboidShape(6, 5, 5, 10, 7, 6),
			Block.createCuboidShape(6, 5, 10, 10, 7, 11),
			Block.createCuboidShape(3, 0, 3, 13, 2, 13)
	).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get();

	private static final VoxelShape SHAPE_WEST = Stream.of(
			Block.createCuboidShape(4, 2, 4, 12, 4, 12),
			Block.createCuboidShape(5, 4, 5, 11, 5, 11),
			Block.createCuboidShape(6, 5, 6, 10, 6, 10),
			Block.createCuboidShape(5, 5, 10, 11, 7, 11),
			Block.createCuboidShape(5, 5, 5, 11, 7, 6),
			Block.createCuboidShape(10, 5, 6, 11, 7, 10),
			Block.createCuboidShape(5, 5, 6, 6, 7, 10),
			Block.createCuboidShape(3, 0, 3, 13, 2, 13)
	).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get();

	@Override
	public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
		switch (state.get(FACING))
		{
			case NORTH:
				return SHAPE_NORTH;
			case EAST:
				return SHAPE_EAST;
			case SOUTH:
				return SHAPE_SOUTH;
			case WEST:
				return SHAPE_WEST;
			default:
				return SHAPE_NORTH;
		}
	}

	@Nullable
	@Override
	public BlockState getPlacementState(ItemPlacementContext ctx) {
		return this.getDefaultState().with(FACING, ctx.getPlayerFacing().getOpposite());
	}
	@Override
	public BlockState rotate(BlockState state, BlockRotation rotation){
		return state.with(FACING, rotation.rotate(state.get(FACING)));
	}
	@Override
	public BlockState mirror(BlockState state, BlockMirror mirror) {
		return state.rotate(mirror.getRotation(state.get(FACING)));
	}
	@Override
	protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
		builder.add(FACING, LIT);
	}



	@Override
	public void randomDisplayTick(BlockState state, World world, BlockPos pos, RandomGenerator random) {
		if ((Boolean)state.get(LIT)) {
			double d = (double)pos.getX() + 0.5;
			double e = (double)pos.getY() + 0.5;
			double f = (double)pos.getZ() + 0.5;
			if (random.nextDouble() < 0.1) {
				world.playSound(d, e, f, SoundEvents.BLOCK_FURNACE_FIRE_CRACKLE, SoundCategory.BLOCKS, 1.0F, 1.0F, false);
			}

			Direction direction = (Direction)state.get(FACING);
			Direction.Axis axis = direction.getAxis();
			double h = random.nextDouble() * 0.6 - 0.3;
			double i = axis == Direction.Axis.Y ? (double)direction.getOffsetY() * 0.52 : h;
			world.addParticle(ParticleTypes.SMOKE, d, e + i, f, 0.0D, 0.0D, 0.0D);
			world.addParticle(ParticleTypes.FLAME, d, e + i, f, 0.0D, 0.0D, 0.0D);
		}}
}
