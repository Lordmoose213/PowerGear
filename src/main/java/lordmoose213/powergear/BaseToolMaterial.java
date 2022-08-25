package lordmoose213.powergear;

import java.util.function.Supplier;

import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;

public class BaseToolMaterial implements Tier{
	
	private final int durabilty;
	private final float speed;
	private final float attackDamageBonus;
	private final int harvestLevel;
	private final int enchantmentValue;
	private final Supplier<Ingredient> repairMaterial;
	
	public BaseToolMaterial(int durability, float speed, float attackDamageBonus, int harvestLevel, int enchantmentValue, Supplier<Ingredient> repairMaterial) {
		this.durabilty = durability;
		this.speed = speed;
		this.attackDamageBonus = attackDamageBonus;
		this.harvestLevel = harvestLevel;
		this.enchantmentValue = enchantmentValue;
		this.repairMaterial = repairMaterial;
	}
	

	@Override
	public int getUses() {
		// TODO Auto-generated method stub
		return this.durabilty;
	}

	@Override
	public float getSpeed() {
		// TODO Auto-generated method stub
		return this.speed;
	}

	@Override
	public float getAttackDamageBonus() {
		// TODO Auto-generated method stub
		return this.attackDamageBonus;
	}

	@Override
	public int getLevel() {
		// TODO Auto-generated method stub
		return this.harvestLevel;
	}

	@Override
	public int getEnchantmentValue() {
		// TODO Auto-generated method stub
		return this.enchantmentValue;
	}

	@Override
	public Ingredient getRepairIngredient() {
		// TODO Auto-generated method stub
		return this.repairMaterial.get();
	}

}
