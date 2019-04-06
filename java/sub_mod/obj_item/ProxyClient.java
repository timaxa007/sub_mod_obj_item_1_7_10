package sub_mod.obj_item;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.renderer.GLAllocation;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.MinecraftForgeClient;
import net.minecraftforge.client.model.AdvancedModelLoader;
import net.minecraftforge.client.model.IModelCustom;

public class ProxyClient extends ProxyCommon {

	public static int[] displayList = new int[1];//for 1 model

	public void preInit() {
		super.preInit();
	}

	public void init() {
		super.init();

		final IModelCustom model = AdvancedModelLoader.loadModel(new ResourceLocation(ModItemObj.MODID, "obj/item.obj"));
		displayList[0] = GLAllocation.generateDisplayLists(1);
		GL11.glNewList(displayList[0], GL11.GL_COMPILE);
		model.renderAll();
		GL11.glEndList();

		//Item
		MinecraftForgeClient.registerItemRenderer(ModItemObj.item_obj, new RenderItemObj());

	}

}
