package sub_mod.obj_item;

import net.minecraft.item.Item;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod (modid = ModItemObj.MODID, name = ModItemObj.MODNAME, version = ModItemObj.VERSION)

public class ModItemObj {

	public static final String MODID = "sub_mod_obj_item";
	public static final String MODNAME = "SM_OI";
	public static final String VERSION = "0.1a";

	@Instance(ModItemObj.MODID) public static ModItemObj instance;
	@SidedProxy(modId = ModItemObj.MODID, clientSide = "sub_mod.obj_item.ProxyClient", serverSide = "sub_mod.obj_item.ProxyCommon")
	public static ProxyCommon proxy;

	public static Item item_obj;

	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) {

		item_obj = new ItemObj();
		GameRegistry.registerItem(item_obj, "item_obj");

		proxy.preInit();

	}

	@Mod.EventHandler
	public void init(FMLInitializationEvent event) {
		proxy.init();
	}

}