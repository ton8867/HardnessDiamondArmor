package hardiarmor.armor;

import hardiarmor.main.Main;
import hardiarmor.register.RegisterArmor;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class HardnessDiamondArmor extends ItemArmor{
	public HardnessDiamondArmor(int type) {
		super(RegisterArmor.HDArmor, 0, type);
		this.setCreativeTab(Main.HarDiArmor);
	}

	@Override
	public String getArmorTexture(ItemStack itemStack, Entity entity,int slot,String type) {
		if(this.armorType==2) {
			return "hardiarmor:textures/models/hardnessdiamond_layer_2.png";
		}
		return "hardiarmor:textures/models/hardnessdiamond_layer_1.png";
	}
}
