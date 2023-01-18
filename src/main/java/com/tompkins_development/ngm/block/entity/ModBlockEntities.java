package com.tompkins_development.ngm.block.entity;

import com.tompkins_development.ngm.NichsGroceryMod;
import com.tompkins_development.ngm.block.ModBlocks;
import com.tompkins_development.ngm.block.entity.custom.OvenBlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockEntities {

    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITIES, NichsGroceryMod.MOD_ID);

    public static final RegistryObject<BlockEntityType<OvenBlockEntity>> OVEN_ENTITY = BLOCK_ENTITIES.register("oven_entity", () ->
            BlockEntityType.Builder.of(OvenBlockEntity::new, ModBlocks.OVEN.get()).build(null));

    public static void register(IEventBus eventBus) {
        BLOCK_ENTITIES.register(eventBus);
    }

}
