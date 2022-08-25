package lordmoose213.powergear.common.item;

import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;


public class AdvancedItem extends Item{

	public AdvancedItem(Properties properties) {
		super(properties);
		// TODO Auto-generated constructor stub
		
	}
	
	@Override
	public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
		ItemStack itemstack = player.getItemInHand(hand);
		level.playSound(player, player.getX(), player.getY(),player.getZ(), SoundEvents.ANVIL_USE, SoundSource.NEUTRAL, .5F, .5F);
		
		return InteractionResultHolder.sidedSuccess(itemstack, level.isClientSide());
	}

}
