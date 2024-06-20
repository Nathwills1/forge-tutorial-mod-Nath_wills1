package net.nath.tutorialmod.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.nath.tutorialmod.TutorialMod;
import net.nath.tutorialmod.block.ModBlocks;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TutorialMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> MODS_TAB = CREATIVE_MODE_TABS.register("mods_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(Moditems.SAPPHIRE.get()))
                    .title(Component.translatable("creativetab.mods_tab"))
                    .displayItems((pPerameters, p0utput) -> {
                        p0utput.accept(Moditems.Raw_SAPPHIRE.get());
                        p0utput.accept(Moditems.SAPPHIRE.get());

                        p0utput.accept(Moditems.METAL_DETECTOR.get());

                        p0utput.accept(Moditems.STRAWBERRY.get());

                        p0utput.accept(Moditems.SAPPHIRE_STAFF.get());

                        p0utput.accept(Moditems.PINE_CONE.get());

                        p0utput.accept(ModBlocks.RAW_SAPPHIRE_BLOCK.get());
                        p0utput.accept(ModBlocks.SAPPHIRE_BLOCK.get());

                        p0utput.accept(ModBlocks.SAPPHIRE_ORE.get());
                        p0utput.accept(ModBlocks.DEEPSLATE_SAPPHIRE_ORE.get());
                        p0utput.accept(ModBlocks.NETHER_SAPPHIRE_ORE.get());
                        p0utput.accept(ModBlocks.END_STONE_SAPPHIRE_ORE.get());

                        p0utput.accept(ModBlocks.SOUND_BLOCK.get());

                        p0utput.accept(ModBlocks.SAPPHIRE_STAIRS.get());
                        p0utput.accept(ModBlocks.SAPPHIRE_SLAB.get());
                        p0utput.accept(ModBlocks.SAPPHIRE_BUTTON.get());
                        p0utput.accept(ModBlocks.SAPPHIRE_PRESSURE_PLATE.get());

                        p0utput.accept(ModBlocks.SAPPHIRE_FENCE.get());
                        p0utput.accept(ModBlocks.SAPPHIRE_FENCE_GATE.get());
                        p0utput.accept(ModBlocks.SAPPHIRE_WALL.get());

                        p0utput.accept(ModBlocks.SAPPHIRE_DOOR.get());
                        p0utput.accept(ModBlocks.SAPPHIRE_TRAPDOOR.get());

                        p0utput.accept(Moditems.SAPPHIRE_SWORD.get());
                        p0utput.accept(Moditems.SAPPHIRE_PICKAXE.get());
                        p0utput.accept(Moditems.SAPPHIRE_AXE.get());
                        p0utput.accept(Moditems.SAPPHIRE_SHOVEL.get());
                        p0utput.accept(Moditems.SAPPHIRE_HOE.get());

                        p0utput.accept(Moditems.SAPPHIRE_HELMET.get());
                        p0utput.accept(Moditems.SAPPHIRE_CHESTPLATE.get());
                        p0utput.accept(Moditems.SAPPHIRE_LEGGINGS.get());
                        p0utput.accept(Moditems.SAPPHIRE_BOOTS.get());

                    })
                    .build());


    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
