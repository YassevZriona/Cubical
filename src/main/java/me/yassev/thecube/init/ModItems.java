package me.yassev.thecube.init;

import me.yassev.thecube.objects.armor.KevlarArmorBase;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import me.yassev.thecube.objects.items.ItemBase;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraft.init.SoundEvents;

import java.util.ArrayList;
import java.util.List;

public class ModItems {
    public static final List<Item> ITEMS = new ArrayList<Item>();

    public static final ArmorMaterial ARMOR_KEVLAR1 = EnumHelper.addArmorMaterial("armor_kevlar1", "cubical:kevlar1", 32, new int[]{3, 6, 8, 3}, 12, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0.5f);
    public static final ArmorMaterial ARMOR_KEVLAR2 = EnumHelper.addArmorMaterial("armor_kevlar2", "cubical:kevlar2", 32, new int[]{3, 6, 8, 3}, 12, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0.5f);
    public static final ArmorMaterial ARMOR_KEVLAR3 = EnumHelper.addArmorMaterial("armor_kevlar3", "cubical:kevlar3", 32, new int[]{3, 6, 8, 3}, 12, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0.5f);
    public static final ArmorMaterial ARMOR_KEVLAR4 = EnumHelper.addArmorMaterial("armor_kevlar4", "cubical:kevlar4", 32, new int[]{3, 6, 8, 3}, 12, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0.5f);

    public static final Item WALKIE_TALKIE = new ItemBase("walkie_talkie");
    public static final Item LENS = new ItemBase("lens");

    public static final Item KEVLAR1_HELMET = new KevlarArmorBase("kevlar1_helmet", ARMOR_KEVLAR1, 1, EntityEquipmentSlot.HEAD);
    public static final Item KEVLAR1_CHESTPLATE = new KevlarArmorBase("kevlar1_chestplate", ARMOR_KEVLAR1, 1, EntityEquipmentSlot.CHEST);
    public static final Item KEVLAR1_LEGGINGS = new KevlarArmorBase("kevlar1_leggings", ARMOR_KEVLAR1, 2, EntityEquipmentSlot.LEGS);
    public static final Item KEVLAR1_BOOTS = new KevlarArmorBase("kevlar1_boots", ARMOR_KEVLAR1, 1, EntityEquipmentSlot.FEET);

    public static final Item KEVLAR2_HELMET = new KevlarArmorBase("kevlar2_helmet", ARMOR_KEVLAR2, 1, EntityEquipmentSlot.HEAD);
    public static final Item KEVLAR2_CHESTPLATE = new KevlarArmorBase("kevlar2_chestplate", ARMOR_KEVLAR2, 1, EntityEquipmentSlot.CHEST);
    public static final Item KEVLAR2_LEGGINGS = new KevlarArmorBase("kevlar2_leggings", ARMOR_KEVLAR2, 2, EntityEquipmentSlot.LEGS);
    public static final Item KEVLAR2_BOOTS = new KevlarArmorBase("kevlar2_boots", ARMOR_KEVLAR2, 1, EntityEquipmentSlot.FEET);

    public static final Item KEVLAR3_HELMET = new KevlarArmorBase("kevlar3_helmet", ARMOR_KEVLAR3, 1, EntityEquipmentSlot.HEAD);
    public static final Item KEVLAR3_CHESTPLATE = new KevlarArmorBase("kevlar3_chestplate", ARMOR_KEVLAR3, 1, EntityEquipmentSlot.CHEST);
    public static final Item KEVLAR3_LEGGINGS = new KevlarArmorBase("kevlar3_leggings", ARMOR_KEVLAR3, 2, EntityEquipmentSlot.LEGS);
    public static final Item KEVLAR3_BOOTS = new KevlarArmorBase("kevlar3_boots", ARMOR_KEVLAR3, 1, EntityEquipmentSlot.FEET);

    public static final Item KEVLAR4_HELMET = new KevlarArmorBase("kevlar4_helmet", ARMOR_KEVLAR4, 1, EntityEquipmentSlot.HEAD);
    public static final Item KEVLAR4_CHESTPLATE = new KevlarArmorBase("kevlar4_chestplate", ARMOR_KEVLAR4, 1, EntityEquipmentSlot.CHEST);
    public static final Item KEVLAR4_LEGGINGS = new KevlarArmorBase("kevlar4_leggings", ARMOR_KEVLAR4, 2, EntityEquipmentSlot.LEGS);
    public static final Item KEVLAR4_BOOTS = new KevlarArmorBase("kevlar4_boots", ARMOR_KEVLAR4, 1, EntityEquipmentSlot.FEET);

}
