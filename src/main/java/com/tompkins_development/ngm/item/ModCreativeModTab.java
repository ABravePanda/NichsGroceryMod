package com.tompkins_development.ngm.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModTab {
    public static final CreativeModeTab FOOD_TAB = new CreativeModeTab("foodtab") {

        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.SALT.get());
        }

    };
}
