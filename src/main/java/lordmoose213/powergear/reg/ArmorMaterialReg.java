package lordmoose213.powergear.reg;

import lordmoose213.powergear.BaseArmorMaterial;

import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;

public class ArmorMaterialReg {
	
	public static final ArmorMaterial TESTARMORMATERIAL = 
			new BaseArmorMaterial("test_armor", new int[] {50, 60, 70, 50}, new int[] {5,6,7,5}, 1f, 0f, 10, SoundEvents.AMETHYST_CLUSTER_FALL, () -> Ingredient.of(ItemReg.ITEM_1.get()));
}
