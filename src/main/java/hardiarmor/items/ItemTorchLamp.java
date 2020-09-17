package hardiarmor.items;

import cpw.mods.fml.common.registry.GameRegistry;
import hardiarmor.main.Main;
import net.minecraft.item.Item;

public class ItemTorchLamp extends Item{
	public ItemTorchLamp() {
		String name = "TorchLamp";
		this.setUnlocalizedName(name);
		this.setTextureName("hardiarmor:torchlamp");
		this.setCreativeTab(Main.HarDiArmor);
		maxStackSize=64;
		GameRegistry.registerItem(this, name);
	}
}
