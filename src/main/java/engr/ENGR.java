package engr;

import engr.reference.Reference;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
public class ENGR {

	@EventHandler
	public void init(FMLInitializationEvent event) {
		System.out.println("Hello World!");
	}
}
