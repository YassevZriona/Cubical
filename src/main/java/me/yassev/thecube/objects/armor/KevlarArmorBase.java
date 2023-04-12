package me.yassev.thecube.objects.armor;

import me.yassev.thecube.Cubical;
import me.yassev.thecube.init.ModItems;
import me.yassev.thecube.util.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public class KevlarArmorBase extends ItemArmor implements IHasModel {
    public KevlarArmorBase(String name, ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
        super(materialIn, renderIndexIn, equipmentSlotIn);
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(CreativeTabs.COMBAT);
        ModItems.ITEMS.add(this);
        setNoRepair();
    }
    @Override
    public void registerModels() {
        Cubical.proxy.registerItemRenderer(this, 0, "inventory");
    }
}
