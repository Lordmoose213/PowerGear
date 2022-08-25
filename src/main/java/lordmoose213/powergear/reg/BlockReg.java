package lordmoose213.powergear.reg;

import lordmoose213.powergear.PowerGear;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BlockReg {
	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, PowerGear.MOD_ID);
	
	public static final RegistryObject<Block> BLOCK_1 = BLOCKS.register("block_1", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> BLOCK_2 = BLOCKS.register("block_2", () -> new Block(BlockBehaviour.Properties.of(Material.CACTUS, MaterialColor.CLAY).strength(2.0F, 15F).requiresCorrectToolForDrops()));
}
