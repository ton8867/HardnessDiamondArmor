package hardiarmor.armor;

import hardiarmor.main.Main;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class LampHelmet extends ItemArmor{
	public LampHelmet(ItemArmor.ArmorMaterial armorMaterial) {
		super(armorMaterial, 0, 0);
		this.setCreativeTab(Main.HarDiArmor);
		maxStackSize = 1;
	}

	@Override
	public String getArmorTexture(ItemStack itemStack, Entity entity,int slot,String type) {
		return "hardiarmor:textures/models/lamphelmet.png";
	}

	@Override
	public void onArmorTick(World world, EntityPlayer player,ItemStack itemStack) {
		PotionEffect effect = new PotionEffect(Potion.nightVision.id,1,0);
		player.addPotionEffect(effect);
	}
}
