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

                        p0utput.accept(ModBlocks.RAW_SAPPHIRE_BLOCK.get());
                        p0utput.accept(ModBlocks.SAPPHIRE_BLOCK.get());
                    })
                    .build());


    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
