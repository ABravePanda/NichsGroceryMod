package com.tompkins_development.ngm.recipe;

import com.tompkins_development.ngm.NichsGroceryMod;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModRecipes {

    public static final DeferredRegister<RecipeSerializer<?>> SERIALIZERS = DeferredRegister.create(ForgeRegistries.RECIPE_SERIALIZERS, NichsGroceryMod.MOD_ID);

    public static final RegistryObject<RecipeSerializer<OvenRecipe>> OVEN_SERIALIZER = SERIALIZERS.register("oven",
            () -> OvenRecipe.Serializer.INSTANCE);

    public static void register(IEventBus eventBus) {
        SERIALIZERS.register(eventBus);
    }

}
