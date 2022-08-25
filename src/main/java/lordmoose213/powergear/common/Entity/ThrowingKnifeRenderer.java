package lordmoose213.powergear.common.Entity;

import lordmoose213.powergear.PowerGear;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.math.Vector3f;

import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.ItemRenderer;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider.Context;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;

public class ThrowingKnifeRenderer extends EntityRenderer<ThrowingKnifeEntity>{

	private static final ResourceLocation TEXTURE = new ResourceLocation(PowerGear.MOD_ID, "textures/entities/throwing_knife_entity.png");
	private ThrowingKnifeModel<ThrowingKnifeEntity> model;
	
	
	public ThrowingKnifeRenderer(Context context) {
		super(context);
		this.model  = new ThrowingKnifeModel<>(context.bakeLayer(ThrowingKnifeModel.LAYER_LOCATION));
	}
	
	
	
	public void render(ThrowingKnifeEntity p_116111_, float p_116112_, float p_116113_, PoseStack p_116114_, MultiBufferSource p_116115_, int p_116116_) {
	      p_116114_.pushPose();
	      p_116114_.mulPose(Vector3f.YP.rotationDegrees(Mth.lerp(p_116113_, p_116111_.yRotO, p_116111_.getYRot()) - 90.0F));
	      p_116114_.mulPose(Vector3f.ZP.rotationDegrees(Mth.lerp(p_116113_, p_116111_.xRotO, p_116111_.getXRot()) + 90.0F));
	      VertexConsumer vertexconsumer = p_116115_.getBuffer(this.model.renderType(TEXTURE));
	      this.model.renderToBuffer(p_116114_, vertexconsumer, p_116116_, OverlayTexture.NO_OVERLAY, 1.0F, 1.0F, 1.0F, 1.0F);
	      p_116114_.scale(1.5F, 1.5F, 1.5F);
	      p_116114_.popPose();
	      super.render(p_116111_, p_116112_, p_116113_, p_116114_, p_116115_, p_116116_);
	   }



	@Override
	public ResourceLocation getTextureLocation(ThrowingKnifeEntity p_114482_) {
		// TODO Auto-generated method stub
		return TEXTURE;		
	}
}
