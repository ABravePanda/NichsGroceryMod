package com.tompkins_development.ngm.item;

import com.tompkins_development.ngm.NichsGroceryMod;
import com.tompkins_development.ngm.block.ModBlocks;
import com.tompkins_development.ngm.item.custom.KnifeItem;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, NichsGroceryMod.MOD_ID);


    //Food
    public static final RegistryObject<Item> SALT = ITEMS.register("salt", () -> new Item(new Item.Properties().tab(ModCreativeModTab.FOOD_TAB).food(ModFoods.SALT)));
    public static final RegistryObject<Item> BUTTER = ITEMS.register("butter", () -> new Item(new Item.Properties().tab(ModCreativeModTab.FOOD_TAB).food(ModFoods.BUTTER)));
    public static final RegistryObject<Item> SLICED_BREAD = ITEMS.register("sliced_bread", () -> new Item(new Item.Properties().tab(ModCreativeModTab.FOOD_TAB).food(ModFoods.BUTTER)));
    public static final RegistryObject<Item> TOMATO = ITEMS.register("tomato", () -> new Item(new Item.Properties().tab(ModCreativeModTab.FOOD_TAB).food(ModFoods.SALT)));
    public static final RegistryObject<Item> DOUGH = ITEMS.register("dough", () -> new Item(new Item.Properties().tab(ModCreativeModTab.FOOD_TAB).food(ModFoods.DOUGH)));

    //Staples
    public static final RegistryObject<Item> FLOUR = ITEMS.register("flour", () -> new Item(new Item.Properties().tab(ModCreativeModTab.FOOD_TAB)));

    //Seeds
    public static final RegistryObject<Item> TOMATO_SEEDS = ITEMS.register("tomato_seeds", () -> new ItemNameBlockItem(ModBlocks.TOMATO_PLANT.get(), new Item.Properties().tab(ModCreativeModTab.FOOD_TAB)));

    //Tools
    public static final RegistryObject<Item> KNIFE = ITEMS.register("knife",
            () -> new KnifeItem(Tiers.IRON, 2, -2.4f , new Item.Properties().tab(ModCreativeModTab.FOOD_TAB).durability(15)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }


}
