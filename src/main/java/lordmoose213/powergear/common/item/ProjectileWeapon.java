package lordmoose213.powergear.common.item;

import java.util.function.Predicate;

import lordmoose213.powergear.common.Entity.Projectile1;
import lordmoose213.powergear.reg.EntityReg;

import net.minecraft.client.model.EntityModel;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.Snowball;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ProjectileWeaponItem;
import net.minecraft.world.level.Level;

public class ProjectileWeapon extends ProjectileWeaponItem{

	public ProjectileWeapon(Properties properties) {
		super(properties);
		// TODO Auto-generated constructor stub
	}

	
	
	@Override
	public int getDefaultProjectileRange() {
		// TODO Auto-generated method stub
		return 15;
	}
	
	
	
	@Override
	public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
		
		ItemStack itemstack = player.getItemInHand(hand);
		level.playSound(player, player.getX(), player.getY(),player.getZ(), SoundEvents.LARGE_AMETHYST_BUD_PLACE, SoundSource.NEUTRAL, .5F, .5F);
		player.getCooldowns().addCooldown(this, 10);
		if(!level.isClientSide) {
			Projectile1 projectile1 = new Projectile1(EntityReg.PROJECTILE_1.get(), level);
			
			projectile1.shootFromRotation(player, player.getXRot(), player.getYRot(), 0.0F, 1.5F, 1.0F);
			level.addFreshEntity(projectile1); 
			System.out.println("Success");
		}
		
		return InteractionResultHolder.success(itemstack);
	}



	@Override
	public Predicate<ItemStack> getAllSupportedProjectiles() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public Projectile1 projectile(Projectile1 projectile1) {
		return projectile1;
	}
}