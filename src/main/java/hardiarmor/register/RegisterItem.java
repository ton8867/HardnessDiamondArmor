package hardiarmor.register;

import hardiarmor.items.ItemObsidianChunk;
import hardiarmor.items.ItemTorchLamp;
import hardiarmor.main.Main;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;

public class RegisterItem {
	public static ItemSword ObsidianC;
	public static Item TorchLamp;
	public static void registry(Main mod) {
			ObsidianC = new ItemObsidianChunk(EnumHelper.addToolMaterial("ObsidianC", 0, 0, 0,0.0F,0));
			TorchLamp = new ItemTorchLamp();
	}
}
