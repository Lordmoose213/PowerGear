package lordmoose213.powergear.client.event;

import java.util.Collection;
import java.util.Map;

import lordmoose213.powergear.PowerGear;
import lordmoose213.powergear.client.KeyMappings;
import lordmoose213.powergear.reg.ItemReg;
import net.minecraft.client.Minecraft;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.TickEvent.ClientTickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

@Mod.EventBusSubscriber(modid = PowerGear.MOD_ID, bus = Bus.FORGE, value = Dist.CLIENT)
public final class ClientForgeEvents {
	
	@SuppressWarnings("resource")
	@SubscribeEvent
	public static void clientTick(ClientTickEvent event) {
		//Declarations
		Player player = Minecraft.getInstance().player;
		Level level = Minecraft.getInstance().level;
		ItemStack heldItem;
		ItemStack offhandItem;
		ItemStack playerHelmet;
		ItemStack playerChestplate;
		ItemStack playerLeggings;
		ItemStack PlayerBoots;
		MobEffectInstance helmetNightVision = new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 0, true, true, true);
		
		//Only runs if the player actually exists, if the player does not exist then it is null and it crashes
		if(player != null) {
			//Actually assigns the variables to properties of the player
			heldItem = player.getMainHandItem();
			offhandItem = player.getOffhandItem();
			playerHelmet = player.getItemBySlot(EquipmentSlot.HEAD);
			playerChestplate = player.getItemBySlot(EquipmentSlot.CHEST);
			playerLeggings = player.getItemBySlot(EquipmentSlot.LEGS);
			PlayerBoots = player.getItemBySlot(EquipmentSlot.FEET);
			
			
			if(KeyMappings.testKeyMap.consumeClick() && playerHelmet.is(ItemReg.HELMET_1.get())) {
				level.playSound(player, player.getX(), player.getY()+1.0,player.getZ(), SoundEvents.DRIPSTONE_BLOCK_FALL, SoundSource.NEUTRAL, .5F, .5F);
				if(!player.hasEffect(MobEffects.NIGHT_VISION)) {
					player.addEffect(helmetNightVision, player);
					System.out.println("1");
				} else if(player.hasEffect(MobEffects.NIGHT_VISION)) {
					player.removeEffect(MobEffects.NIGHT_VISION);
					System.out.println("2");
				}
			}
			//Start next one that relies on the player here.
		}
		
	}
}
