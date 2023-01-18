package com.tompkins_development.ngm.util;

import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import org.jetbrains.annotations.Nullable;

import java.util.Random;

public class InventoryUtils {

    public static ItemStack damage(ItemStack itemStack, int damage, @Nullable ServerPlayer serverPlayer) {
        ItemStack newItem = itemStack.copy();
        newItem.hurt(damage, new Random(), serverPlayer);
        System.out.println(newItem.getMaxDamage());
        if(itemStack.getItem().getDamage(itemStack) >= newItem.getMaxDamage()) return new ItemStack(Items.AIR);
        return newItem;
    }
}
