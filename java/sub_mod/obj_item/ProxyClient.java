package sub_mod.obj_item;

import net.minecraftforge.client.MinecraftForgeClient;

public class ProxyClient extends ProxyCommon {

	public void preInit() {
		super.preInit();
	}

	public void init() {
		super.init();

		//Item
		MinecraftForgeClient.registerItemRenderer(ModItemObj.item_obj, new RenderItemObj());

	}

}
