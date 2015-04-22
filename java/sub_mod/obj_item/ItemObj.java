package sub_mod.obj_item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemObj extends Item {

	public ItemObj() {
		super();
		setCreativeTab(CreativeTabs.tabMisc);
		setFull3D();
		setTextureName(ModItemObj.MODID + ":item_obj");
		setUnlocalizedName(ModItemObj.MODID + ".item_obj");
	}

}
