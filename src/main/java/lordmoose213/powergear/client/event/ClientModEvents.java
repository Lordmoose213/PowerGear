package lordmoose213.powergear.client.event;

import lordmoose213.powergear.PowerGear;
import lordmoose213.powergear.client.KeyMappings;
import lordmoose213.powergear.common.Entity.Projectile_1Model;
import lordmoose213.powergear.common.Entity.Projectile_1Renderer;
import lordmoose213.powergear.common.Entity.ThrowingKnifeModel;
import lordmoose213.powergear.common.Entity.ThrowingKnifeRenderer;
import lordmoose213.powergear.reg.EntityReg;

import lordmoose213.powergear.PowerGear;
import lordmoose213.powergear.client.KeyMappings;
import lordmoose213.powergear.common.Entity.Projectile_1Model;
import lordmoose213.powergear.common.Entity.Projectile_1Renderer;
import lordmoose213.powergear.common.Entity.ThrowingKnifeModel;
import lordmoose213.powergear.common.Entity.ThrowingKnifeRenderer;
import lordmoose213.powergear.reg.EntityReg;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.client.event.EntityRenderersEvent.RegisterLayerDefinitions;
import net.minecraftforge.client.event.EntityRenderersEvent.RegisterRenderers;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = PowerGear.MOD_ID, bus = Bus.MOD, value = Dist.CLIENT)

public class ClientModEvents {
	
	@SubscribeEvent
	public static void ClientSetup(FMLClientSetupEvent event) {
		KeyMappings.reg();
	}
	
	@SubscribeEvent
	public static void onRegisterLayers(RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Projectile_1Model.LAYER_LOCATION, Projectile_1Model::createBodyLayer);
		event.registerLayerDefinition(ThrowingKnifeModel.LAYER_LOCATION, ThrowingKnifeModel::createBodyLayer);
	}
	
	@SubscribeEvent
	public static void onRegisterRenderer(RegisterRenderers event) {
		event.registerEntityRenderer(EntityReg.PROJECTILE_1.get(), Projectile_1Renderer::new);
		event.registerEntityRenderer(EntityReg.THROWING_KNIFE.get(), ThrowingKnifeRenderer::new);
	}

}
