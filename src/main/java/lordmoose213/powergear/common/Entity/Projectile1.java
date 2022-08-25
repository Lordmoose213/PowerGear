package lordmoose213.powergear.common.Entity;

import lordmoose213.powergear.reg.EntityReg;

import net.minecraft.network.protocol.Packet;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.ThrowableProjectile;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.EntityHitResult;
import net.minecraft.world.phys.HitResult;
import net.minecraftforge.network.NetworkHooks;



public class Projectile1 extends ThrowableProjectile{ //I know its not throwable, but this does a lot of math for me.

	protected Projectile1(EntityType<Projectile1> projectileEntity, LivingEntity shooter, Level level) {
		super(projectileEntity, shooter, level);
		// TODO Auto-generated constructor stub
	}

	public Projectile1(EntityType<Projectile1> projectileEntity, Level level) {
		super(projectileEntity, level);
		// TODO Auto-generated constructor stub
	}

	protected Projectile1(EntityType<Projectile1> projectileEntity, double x, double y,
			double z, Level level) {
		super(projectileEntity, x, y, z, level);
		// TODO Auto-generated constructor stub
	}
	
	public Projectile1(Level level) {
	    this(EntityReg.PROJECTILE_1.get(), level);
	}
	
	protected void onHitEntity(EntityHitResult hitResult) {
	      super.onHitEntity(hitResult);
	      Entity entity = hitResult.getEntity();
	      entity.hurt(DamageSource.IN_FIRE, 5f);
	}

	protected void onHit(HitResult hitResult) {
	      super.onHit(hitResult);
	      if (!this.level.isClientSide) {
	         this.level.broadcastEntityEvent(this, (byte)3);
	         this.discard();
	      }

	}
	
	@Override
	protected float getGravity() {
	      return 0.03F;
	   }

	@Override
	protected void defineSynchedData() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public Packet<?> getAddEntityPacket() {
	    return NetworkHooks.getEntitySpawningPacket(this);
	}

	public boolean isFoil() {
		// TODO Auto-generated method stub
		return false;
	}


	
}