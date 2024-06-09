package net.aZOthe.Atomas.item;

import net.aZOthe.Atomas.Atomas;
import net.aZOthe.Atomas.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.awt.*;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Atomas.MOD_ID);

    public static final RegistryObject<CreativeModeTab> ATOMAS_TAB = CREATIVE_MODE_TABS.register("atomas_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.COBALT_INGOT.get()))
            .title(Component.translatable("creativetab.atomas_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.COBALT_INGOT.get());
                        output.accept(ModBlocks.COBALT_BLOCK.get());
                        output.accept(ModItems.COBALT_NUGGET.get());
                        output.accept(ModItems.RAW_COBALT.get());
                        output.accept(ModBlocks.RAW_COBALT_BLOCK.get());
                        output.accept(ModBlocks.COBALT_ORE.get());
                        output.accept(ModBlocks.DEEPSLATE_COBALT_ORE.get());
                    })
            .build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
