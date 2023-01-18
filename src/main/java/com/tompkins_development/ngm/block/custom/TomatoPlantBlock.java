package com.tompkins_development.ngm.block.custom;

import com.tompkins_development.ngm.item.ModItems;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.CropBlock;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.IntegerProperty;

public class TomatoPlantBlock extends CropBlock {

    public static final IntegerProperty AGE = BlockStateProperties.AGE_5;

    public TomatoPlantBlock(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public int getMaxAge() {
        return 5;
    }

    @Override
    protected ItemLike getBaseSeedId() {
        return ModItems.TOMATO_SEEDS.get();
    }

    @Override
    public float getSpeedFactor() {
        return 5;
    }
}
