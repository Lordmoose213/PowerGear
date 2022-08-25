package lordmoose213.powergear.reg;


import java.util.function.Supplier;

import lordmoose213.powergear.PowerGear;
import lordmoose213.powergear.common.Entity.Projectile1;
import lordmoose213.powergear.common.Entity.ThrowingKnifeEntity;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class EntityReg {
	public static final DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister.create(ForgeRegistries.ENTITIES, PowerGear.MOD_ID);
	
	public static final RegistryObject<EntityType<Projectile1>> PROJECTILE_1 = ENTITIES.register("projectile_1", 
			() -> EntityType.Builder.<Projectile1>of(Projectile1::new, MobCategory.MISC)
			.sized(0.5F, 0.5F)
			.clientTrackingRange(4)
			.updateInterval(20)
			.setCustomClientFactory((spawnEntity, level) -> new Projectile1(level))
			.build("projectile_1"));
			

	public static final RegistryObject<EntityType<ThrowingKnifeEntity>> THROWING_KNIFE = ENTITIES.register("throwingknife", 
			() -> EntityType.Builder.<ThrowingKnifeEntity>of(ThrowingKnifeEntity::new, MobCategory.MISC)
			.sized(0.5F, 0.5F)
			.clientTrackingRange(4)
			.updateInterval(20)
			.setCustomClientFactory((spawnEntity, level) -> new ThrowingKnifeEntity(level))
			.build("projectile_1"));
}