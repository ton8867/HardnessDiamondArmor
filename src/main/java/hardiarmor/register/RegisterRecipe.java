package hardiarmor.register;

import cpw.mods.fml.common.registry.GameRegistry;
import hardiarmor.main.Config;
import hardiarmor.main.Main;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class RegisterRecipe {
	public static void registry( Main mod ) {
		if (!Config.easymode) {
			GameRegistry.addRecipe(new ItemStack(RegisterItem.ObsidianC),
					"xxx",
					"xyx",
					"xxx",
					'x',Blocks.obsidian,
					'y',Items.diamond
			);
		}
		if (Config.easymode) {
			GameRegistry.addRecipe(new ItemStack(RegisterItem.ObsidianC),
			" x ",
			"xyx",
			" x ",
			'x',Blocks.obsidian,
			'y',Items.iron_ingot
			);
		}
		GameRegistry.addRecipe(new ItemStack(RegisterArmor.helmethardnessdia),
			"xxx",
			"xyx",
			'x',RegisterItem.ObsidianC,
			'y',Items.diamond_helmet
		);
		GameRegistry.addRecipe(new ItemStack(RegisterArmor.chestPlatehardnessdia),
			"x x",
			"xyx",
			"xxx",
			'x',RegisterItem.ObsidianC,
			'y',Items.diamond_chestplate
		);
		GameRegistry.addRecipe(new ItemStack(RegisterArmor.leggingshardnessdia),
			"xxx",
			"xyx",
			"x x",
			'x',RegisterItem.ObsidianC,
			'y',Items.diamond_leggings
		);
		GameRegistry.addRecipe(new ItemStack(RegisterArmor.bootshardnessdia),
			"xyx",
			"x x",
			'x',RegisterItem.ObsidianC,
			'y',Items.diamond_boots
		);
		GameRegistry.addShapelessRecipe(new ItemStack(RegisterItem.TorchLamp),
			Blocks.glass,
			Blocks.torch
		);
		GameRegistry.addRecipe(new ItemStack(RegisterArmor.lamphelmet),
			" y ",
			"xxx",
			"xzx",
			'x',Items.iron_ingot,
			'y',RegisterItem.TorchLamp,
			'z',Blocks.glass_pane
		);
	}
}
