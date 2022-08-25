package lordmoose213.powergear.common.Entity;

import lordmoose213.powergear.PowerGear;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.math.Vector3f;

import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.ItemRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider.Context;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.projectile.LlamaSpit;
import net.minecraft.world.entity.projectile.ShulkerBullet;
import net.minecraft.world.entity.projectile.ThrownTrident;

public class Projectile_1Renderer extends EntityRenderer<Projectile1>{

	
	private static final ResourceLocation TEXTURE = new ResourceLocation(PowerGear.MOD_ID, "textures/entities/projectile_1.png");
	private Projectile_1Model<Projectile1> model;
	
	
	public Projectile_1Renderer(Context context) {
		super(context);
		this.model  = new Projectile_1Model<>(context.bakeLayer(Projectile_1Model.LAYER_LOCATION));
	}
	
	
	
	public void render(Projectile1 p_116111_, float p_116112_, float p_116113_, PoseStack p_116114_, MultiBufferSource p_116115_, int p_116116_) {
	      p_116114_.pushPose();
	      p_116114_.mulPose(Vector3f.YP.rotationDegrees(Mth.lerp(p_116113_, p_116111_.yRotO, p_116111_.getYRot()) - 90.0F));
	      p_116114_.mulPose(Vector3f.ZP.rotationDegrees(Mth.lerp(p_116113_, p_116111_.xRotO, p_116111_.getXRot()) + 90.0F));
	      VertexConsumer vertexconsumer = ItemRenderer.getFoilBufferDirect(p_116115_, this.model.renderType(this.getTextureLocation(p_116111_)), false, p_116111_.isFoil());
	      this.model.renderToBuffer(p_116114_, vertexconsumer, p_116116_, OverlayTexture.NO_OVERLAY, 1.0F, 1.0F, 1.0F, 1.0F);
	      p_116114_.popPose();
	      super.render(p_116111_, p_116112_, p_116113_, p_116114_, p_116115_, p_116116_);
	   }

	@Override
	public ResourceLocation getTextureLocation(Projectile1 projectile1) {
		// TODO Auto-generated method stub
		return TEXTURE;
	}





	
}
