package hardiarmor.creativetabs;

import hardiarmor.register.RegisterItem;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class HDATab extends CreativeTabs{
	public HDATab(String label) {
		super(label);
	}
	@Override
	public Item getTabIconItem() {
		return RegisterItem.ObsidianC;
	}
}
