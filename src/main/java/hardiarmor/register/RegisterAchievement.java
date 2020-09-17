package hardiarmor.register;

import hardiarmor.main.Main;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.Achievement;
import net.minecraftforge.common.AchievementPage;

public class RegisterAchievement {
	public static Achievement CreateObsidianC;
	public static void registry (Main mod) {
		CreateObsidianC = new Achievement("CreateObsidianC","CreateObsidianC",0,0,new ItemStack(RegisterItem.ObsidianC,0,0),null);
		AchievementPage.registerAchievementPage(new AchievementPage("HardnessDiamondArmor", new Achievement[] {CreateObsidianC}));
	}
}
