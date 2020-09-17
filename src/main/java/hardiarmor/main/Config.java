package hardiarmor.main;

import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.common.config.Configuration;

public class Config {
	public static Configuration cfg;
	public static boolean easymode;
	public static void load_config(FMLPreInitializationEvent event) {
		cfg = new Configuration(event.getSuggestedConfigurationFile(),Reference.MOD_VERSION, false);
		try {
			cfg.load();
			easymode=cfg.getBoolean("easymode","mode",false,"ObsidianChunk Cost Down.");
		}finally {
			cfg.save();
		}
	}
}
