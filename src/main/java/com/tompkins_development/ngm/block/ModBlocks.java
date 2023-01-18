package com.tompkins_development.ngm.block;

import com.tompkins_development.ngm.NichsGroceryMod;
import com.tompkins_development.ngm.block.custom.OvenBlock;
import com.tompkins_development.ngm.block.custom.TomatoPlantBlock;
import com.tompkins_development.ngm.item.ModCreativeModTab;
import com.tompkins_development.ngm.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, NichsGroceryMod.MOD_ID);

    public static final RegistryObject<Block> SALT_BLOCK = registerBlock("salt_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(2f).requiresCorrectToolForDrops()), ModCreativeModTab.FOOD_TAB);

    public static final RegistryObject<Block> TOMATO_PLANT = registerBlockWithoutItem("tomato_plant",
            () -> new TomatoPlantBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).strength(0.1f).noOcclusion()));

    public static final RegistryObject<Block> OVEN = registerBlock("oven",
            () -> new OvenBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(2f).noOcclusion()), ModCreativeModTab.FOOD_TAB);


    private static <T extends Block>RegistryObject<T> registerBlockWithoutItem(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        return toReturn;
    }

    private static <T extends Block>RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block>RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
