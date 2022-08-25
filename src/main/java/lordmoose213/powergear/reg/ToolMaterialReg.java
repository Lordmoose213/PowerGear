package lordmoose213.powergear.reg;

import lordmoose213.powergear.BaseToolMaterial;

import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;

public class ToolMaterialReg {

	public static final Tier TESTMATERIAL = new BaseToolMaterial(100, 2f, 20f, 7, 5,() -> Ingredient.of(ItemReg.ITEM_1.get()));
}
