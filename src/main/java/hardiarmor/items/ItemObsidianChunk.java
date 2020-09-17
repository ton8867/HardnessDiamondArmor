package hardiarmor.items;

import cpw.mods.fml.common.registry.GameRegistry;
import hardiarmor.main.Main;
import hardiarmor.register.RegisterAchievement;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.world.World;

public class ItemObsidianChunk extends ItemSword{
	public ItemObsidianChunk(ToolMaterial toolMaterial) {
		super(toolMaterial);
		String name="ObsidianChunk";
		this.setUnlocalizedName(name);
		this.setCreativeTab(Main.HarDiArmor);
		this.setTextureName("hardiarmor:ObsidianC");
		maxStackSize = 64;
		GameRegistry.registerItem(this,name);
	}

	@Override
	public void onCreated(ItemStack stack,World world, EntityPlayer player) {
		player.triggerAchievement(RegisterAchievement.CreateObsidianC);
		super.onCreated(stack, world, player);
	}

	@Override
	public boolean hitEntity(ItemStack itemStack,EntityLivingBase target,EntityLivingBase player) {
		itemStack.damageItem(4, player);
		return true;
	}
}
