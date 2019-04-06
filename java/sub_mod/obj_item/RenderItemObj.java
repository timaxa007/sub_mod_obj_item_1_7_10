package sub_mod.obj_item;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.Minecraft;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.IItemRenderer;

public class RenderItemObj implements IItemRenderer {

	public static final ResourceLocation texture = new ResourceLocation(ModItemObj.MODID, "textures/items/item_obj.png");

	@Override
	public boolean handleRenderType(ItemStack is, ItemRenderType type) {
		if (type == ItemRenderType.INVENTORY) return false;
		return true;
	}

	@Override
	public boolean shouldUseRenderHelper(ItemRenderType type, ItemStack is, ItemRendererHelper helper) {
		if (type == ItemRenderType.INVENTORY) return false;
		return true;
	}

	@Override
	public void renderItem(ItemRenderType type, ItemStack is, Object... data) {
		GL11.glPushMatrix();
		GL11.glTranslatef(0.5F, 0.0F, 0.5F);
		Minecraft.getMinecraft().renderEngine.bindTexture(texture);
		GL11.glCallList(ProxyClient.displayList[0]);
		GL11.glPopMatrix();
	}

}
