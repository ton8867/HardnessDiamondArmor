package hardiarmor.register;

import cpw.mods.fml.common.registry.GameRegistry;
import hardiarmor.armor.HardnessDiamondArmor;
import hardiarmor.armor.LampHelmet;
import hardiarmor.main.Main;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.common.util.EnumHelper;

public class RegisterArmor {
	public static ArmorMaterial HDArmor;
	public static Item helmethardnessdia;
	public static Item chestPlatehardnessdia;
	public static Item leggingshardnessdia;
	public static Item bootshardnessdia;
	public static Item lamphelmet;
	public static void registry( Main mod ) {

		HDArmor=EnumHelper.addArmorMaterial("HardnessArmor", 1000,new int[]{6,10,6,4}, 10);
		HDArmor.customCraftingMaterial = Items.diamond;

		helmethardnessdia = new HardnessDiamondArmor(0)
				.setUnlocalizedName("hardnesshelmet")
				.setTextureName("hardiarmor:hardnessdiamond_helmet");
		GameRegistry.registerItem(helmethardnessdia, "hardnesshelmet");

		chestPlatehardnessdia = new HardnessDiamondArmor(1)
				.setUnlocalizedName("hardnesschest")
				.setTextureName("hardiarmor:hardnessdiamond_chestplate");
		GameRegistry.registerItem(chestPlatehardnessdia, "hardnesschest");

		leggingshardnessdia = new HardnessDiamondArmor(2)
				.setUnlocalizedName("hardnessleggings")
				.setTextureName("hardiarmor:hardnessdiamond_leggings");
		GameRegistry.registerItem(leggingshardnessdia, "hardnessleggings");

		bootshardnessdia = new HardnessDiamondArmor(3)
				.setUnlocalizedName("hardnessboots")
				.setTextureName("hardiarmor:hardnessdiamond_boots");
		GameRegistry.registerItem(bootshardnessdia, "hardnessboots");

		lamphelmet = new LampHelmet(EnumHelper.addArmorMaterial("lampArmor", 15, new int[] {2}, 10)) {
			@Override
			public void onCreated(ItemStack stack,World world,EntityPlayer player) {
				stack.addEnchantment(Enchantment.aquaAffinity,1);
				stack.addEnchantment(Enchantment.respiration, 3);
			}
		}
		.setUnlocalizedName("lamphelmet")
		.setTextureName("hardiarmor:lamphelmet");
		GameRegistry.registerItem(lamphelmet, "lamphelmet");
	}
}
