package lordmoose213.powergear.reg;

import lordmoose213.powergear.PowerGear;
import lordmoose213.powergear.common.item.AdvancedItem;
import lordmoose213.powergear.common.item.BaggieItem;
import lordmoose213.powergear.common.item.ProjectileWeapon;
import lordmoose213.powergear.common.item.ThrowingKnife;

import lordmoose213.powergear.PowerGear;
import lordmoose213.powergear.common.item.AdvancedItem;
import lordmoose213.powergear.common.item.BaggieItem;
import lordmoose213.powergear.common.item.ProjectileWeapon;
import lordmoose213.powergear.common.item.ThrowingKnife;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.SwordItem;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemReg {

	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, PowerGear.MOD_ID);
	
	//Normal Items
	public static final RegistryObject<Item> ITEM_1 = ITEMS.register("item_1", () -> new Item(new Item.Properties().tab(PowerGear.TAB_1)));
	public static final RegistryObject<AdvancedItem> ITEM_2 = ITEMS.register("item_2", () -> new AdvancedItem(new Item.Properties().tab(PowerGear.TAB_1).defaultDurability(10).durability(50)));
	public static final RegistryObject<ProjectileWeapon> PROJECTILE_WEAPON = ITEMS.register("projectile_weapon", () -> new ProjectileWeapon(new Item.Properties().tab(PowerGear.TAB_1).durability(100)));
	public static final RegistryObject<ThrowingKnife> THROWING_KNIFE = ITEMS.register("throwing_knife", () -> new ThrowingKnife(new Item.Properties().tab(PowerGear.TAB_1)));
	public static final RegistryObject<BaggieItem> BAGGIE_ITEM = ITEMS.register("baggie", () -> new BaggieItem(new Item.Properties().tab(PowerGear.TAB_1)));
	
	//Tools
	public static final RegistryObject<SwordItem> SWORD_1 =  ITEMS.register("sword_1", () -> new SwordItem(ToolMaterialReg.TESTMATERIAL, 10, 5f, new Item.Properties().tab(PowerGear.TAB_1)));
	public static final RegistryObject<PickaxeItem> PICKAXE_1 = ITEMS.register("pickaxe_1", () -> new PickaxeItem(ToolMaterialReg.TESTMATERIAL, 0, 0, new Item.Properties().tab(PowerGear.TAB_1)));
	
	//Armor
	public static final RegistryObject<ArmorItem> HELMET_1 = ITEMS.register("helmet_1", () -> new ArmorItem(ArmorMaterialReg.TESTARMORMATERIAL, EquipmentSlot.HEAD, new Item.Properties().tab(PowerGear.TAB_1))); 
	public static final RegistryObject<ArmorItem> CHESTPLATE_1 = ITEMS.register("chestplate_1", () -> new ArmorItem(ArmorMaterialReg.TESTARMORMATERIAL, EquipmentSlot.CHEST, new Item.Properties().tab(PowerGear.TAB_1))); 
	public static final RegistryObject<ArmorItem> LEGGINGS_1 = ITEMS.register("leggings_1", () -> new ArmorItem(ArmorMaterialReg.TESTARMORMATERIAL, EquipmentSlot.LEGS, new Item.Properties().tab(PowerGear.TAB_1))); 
	public static final RegistryObject<ArmorItem> BOOTS_1 = ITEMS.register("boots_1", () -> new ArmorItem(ArmorMaterialReg.TESTARMORMATERIAL, EquipmentSlot.FEET, new Item.Properties().tab(PowerGear.TAB_1))); 
	//Block Items
	public static final RegistryObject<BlockItem> BLOCK_ITEM_1 = ITEMS.register("block_2", () -> new BlockItem(BlockReg.BLOCK_2.get(), new Item.Properties().tab(PowerGear.TAB_1)));
	
	
}
