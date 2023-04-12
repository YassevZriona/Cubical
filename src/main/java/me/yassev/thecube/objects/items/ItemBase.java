package me.yassev.thecube.objects.items;

import me.yassev.thecube.Cubical;
import me.yassev.thecube.init.ModItems;
import me.yassev.thecube.util.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel {
    public ItemBase(String name) {
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(CreativeTabs.TOOLS);
        ModItems.ITEMS.add(this);
    }
    @Override
    public void registerModels() {
        Cubical.proxy.registerItemRenderer(this, 0, "inventory");
    }
}
