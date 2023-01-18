package com.tompkins_development.ngm.item.custom;

import com.tompkins_development.ngm.util.InventoryUtils;
import net.minecraft.world.item.*;

import java.util.Random;

public class KnifeItem extends SwordItem {

    public KnifeItem(Tier pTier, int pAttackDamageModifier, float pAttackSpeedModifier, Properties pProperties) {
        super(pTier, pAttackDamageModifier, pAttackSpeedModifier, pProperties);
    }

    @Override
    public boolean hasContainerItem(ItemStack stack) {
        return true;
    }

    @Override
    public ItemStack getContainerItem(ItemStack itemStack) {
        return InventoryUtils.damage(itemStack, 1, null);
    }

}
