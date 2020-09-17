package hardiarmor.main;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import hardiarmor.creativetabs.HDATab;
import hardiarmor.register.RegisterAchievement;
import hardiarmor.register.RegisterArmor;
import hardiarmor.register.RegisterItem;
import hardiarmor.register.RegisterRecipe;
import net.minecraft.creativetab.CreativeTabs;

@Mod(modid = Reference.MOD_ID,name = Reference.MOD_NAME,version = Reference.MOD_VERSION)
public class Main {
	public static CreativeTabs HarDiArmor = new HDATab("HarDiArmor");
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		Config.load_config(event);
		RegisterItem.registry(this);
		RegisterArmor.registry(this);
		RegisterAchievement.registry(this);
	}

	@EventHandler
	public void init(FMLInitializationEvent event) {
		RegisterRecipe.registry(this);
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {

	}
}
