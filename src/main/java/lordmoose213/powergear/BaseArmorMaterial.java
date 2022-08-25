package lordmoose213.powergear;

import java.util.function.Supplier;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;

public class BaseArmorMaterial implements ArmorMaterial {
	
	
	private final int[] durability;
	private final int[] defence;
	private final int enchantability;
	private final SoundEvent equipSound;
	private final Supplier<Ingredient> repairMaterial;
	private final String name;
	private final float toughness;
	private final float knockbackResistance;
	
	public BaseArmorMaterial(String name, int[] durability, int defence[], float toughness, float knockbackResistance, int enchantability, SoundEvent equipSound, Supplier<Ingredient> repairMaterial) {
		this.name = name;
		this.durability = durability;
		this.defence = defence;
		this.enchantability= enchantability;
		this.equipSound = equipSound;
		this.repairMaterial= repairMaterial;
		this.toughness = toughness;
		this.knockbackResistance = knockbackResistance;
	}
	

	@Override
	public int getDurabilityForSlot(EquipmentSlot slot) {
		// TODO Auto-generated method stub
		return this.durability[slot.getIndex()];
	}

	@Override
	public int getDefenseForSlot(EquipmentSlot slot) {
		// TODO Auto-generated method stub
		return this.defence[slot.getIndex()];
	}

	@Override
	public int getEnchantmentValue() {
		// TODO Auto-generated method stub
		return this.enchantability;
	}

	@Override
	public SoundEvent getEquipSound() {
		// TODO Auto-generated method stub
		return this.equipSound;
	}

	@Override
	public Ingredient getRepairIngredient() {
		// TODO Auto-generated method stub
		return this.repairMaterial.get();
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return this.name;
	}

	@Override
	public float getToughness() {
		// TODO Auto-generated method stub
		return this.toughness;
	}

	@Override
	public float getKnockbackResistance() {
		// TODO Auto-generated method stub
		return this.knockbackResistance;
	}

}
