package com.tompkins_development.ngm.tabs;

import net.minecraft.client.Minecraft;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.material.Material;

public class GroceryModCreativeTab {
    public static final CreativeModeTab FOOD_TAB = new CreativeModeTab("foodtab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack();
        }
    }
}
