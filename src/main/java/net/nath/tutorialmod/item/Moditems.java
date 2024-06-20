package net.nath.tutorialmod.item;

import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.nath.tutorialmod.TutorialMod;
import net.nath.tutorialmod.item.custom.FuleItem;
import net.nath.tutorialmod.item.custom.MetalDetectorItem;
import net.nath.tutorialmod.item.custom.ModArmorItem;

import static net.minecraftforge.registries.ForgeRegistries.ITEMS;

public class Moditems {
    public static final DeferredRegister<Item> Items =
            DeferredRegister.create(ITEMS, TutorialMod.MOD_ID);

    public static final RegistryObject<Item> SAPPHIRE = Items.register("sapphire",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> Raw_SAPPHIRE =  Items.register("raw_sapphire",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> METAL_DETECTOR =  Items.register("metal_detector",
            () -> new MetalDetectorItem(new Item.Properties().durability(150)));

    public static final RegistryObject<Item> STRAWBERRY =  Items.register("strawberry",
            () -> new Item(new Item.Properties().food(ModFoods.STRAWBERRY)));

    public static final RegistryObject<Item> SAPPHIRE_STAFF =  Items.register("sapphire_staff",
            () -> new Item(new Item.Properties().stacksTo(1)));

    public static final RegistryObject<Item> PINE_CONE =  Items.register("pine_cone",
            () -> new FuleItem(new Item.Properties(), 400));

    public static final RegistryObject<Item> SAPPHIRE_SWORD = Items.register("sapphire_sword",
            () -> new SwordItem(ModToolTiers.SAPPHIRE, 5, 3, new Item.Properties()));
    public static final RegistryObject<Item> SAPPHIRE_PICKAXE = Items.register("sapphire_pickaxe",
            () -> new PickaxeItem(ModToolTiers.SAPPHIRE, 1, 1, new Item.Properties()));
    public static final RegistryObject<Item> SAPPHIRE_AXE = Items.register("sapphire_axe",
            () -> new AxeItem(ModToolTiers.SAPPHIRE, 7, 1, new Item.Properties()));
    public static final RegistryObject<Item> SAPPHIRE_SHOVEL = Items.register("sapphire_shovel",
            () -> new ShovelItem(ModToolTiers.SAPPHIRE, 0, 0, new Item.Properties()));
    public static final RegistryObject<Item> SAPPHIRE_HOE = Items.register("sapphire_hoe",
            () -> new HoeItem(ModToolTiers.SAPPHIRE, 0, 0, new Item.Properties()));

    public static final RegistryObject<Item> SAPPHIRE_HELMET = Items.register("sapphire_helmet",
            () -> new ModArmorItem(ModArmorMaterials.SAPPHIRE, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> SAPPHIRE_CHESTPLATE = Items.register("sapphire_chestplate",
            () -> new ArmorItem(ModArmorMaterials.SAPPHIRE, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> SAPPHIRE_LEGGINGS = Items.register("sapphire_leggings",
            () -> new ArmorItem(ModArmorMaterials.SAPPHIRE, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> SAPPHIRE_BOOTS = Items.register("sapphire_boots",
            () -> new ArmorItem(ModArmorMaterials.SAPPHIRE, ArmorItem.Type.BOOTS, new Item.Properties()));



    public static void register(IEventBus eventbus) {
        Items.register(eventbus);}
}
