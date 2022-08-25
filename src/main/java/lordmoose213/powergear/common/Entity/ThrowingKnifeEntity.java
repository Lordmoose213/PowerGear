package lordmoose213.powergear.common.Entity;

import lordmoose213.powergear.common.item.ThrowingKnife;
import lordmoose213.powergear.reg.EntityReg;
import lordmoose213.powergear.reg.ItemReg;

import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.monster.Blaze;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.ThrowableItemProjectile;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.EntityHitResult;
import net.minecraft.world.phys.HitResult;
import net.minecraftforge.registries.RegistryObject;

public class ThrowingKnifeEntity extends ThrowableItemProjectile{

	public ThrowingKnifeEntity(EntityType<? extends ThrowableItemProjectile> p_37438_, LivingEntity p_37439_,
			Level p_37440_) {
		super(p_37438_, p_37439_, p_37440_);
		// TODO Auto-generated constructor stub
	}

	public ThrowingKnifeEntity(EntityType<? extends ThrowableItemProjectile> p_37442_, Level p_37443_) {
		super(p_37442_, p_37443_);
		// TODO Auto-generated constructor stub
	}

	public ThrowingKnifeEntity(EntityType<? extends ThrowableItemProjectile> p_37432_, double p_37433_, double p_37434_,
			double p_37435_, Level p_37436_) {
		super(p_37432_, p_37433_, p_37434_, p_37435_, p_37436_);
		// TODO Auto-generated constructor stub
	}
	
	public ThrowingKnifeEntity(Level level) {
	    this(EntityReg.THROWING_KNIFE.get(), level);
	}

	public ThrowingKnifeEntity(Level p_37399_, LivingEntity p_37400_) {
	      super(EntityReg.THROWING_KNIFE.get(), p_37400_, p_37399_);
	   }

	@Override
	public Item getDefaultItem() {
		return null;
	}

	protected void onHitEntity(EntityHitResult p_37404_) {
	      super.onHitEntity(p_37404_);
	      Entity entity = p_37404_.getEntity();
	      entity.hurt(DamageSource.thrown(this, this.getOwner()), (float)4);
	}

	protected void onHit(HitResult p_37406_) {
	      super.onHit(p_37406_);
	      if (!this.level.isClientSide) {
	         this.level.broadcastEntityEvent(this, (byte)3);
	         this.discard();
	      }
   }

	public boolean isFoil() {
		// TODO Auto-generated method stub
		return false;
	}
	
}
