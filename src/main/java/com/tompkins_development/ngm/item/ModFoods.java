package com.tompkins_development.ngm.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoods {
    public static final FoodProperties SALT = (new FoodProperties.Builder()).nutrition(-4).saturationMod(-0.3F).effect(new MobEffectInstance(MobEffects.CONFUSION, 200, 0), 0.4F).build();
    public static final FoodProperties BUTTER = (new FoodProperties.Builder()).nutrition(1).saturationMod(0.1F).build();
    public static final FoodProperties SLICED_BREAD = (new FoodProperties.Builder()).nutrition(1).saturationMod(0.5F).build();
    public static final FoodProperties DOUGH = (new FoodProperties.Builder()).nutrition(1).saturationMod(0.1F).build();
}
