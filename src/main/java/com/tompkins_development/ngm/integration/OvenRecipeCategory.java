package com.tompkins_development.ngm.integration;

import com.tompkins_development.ngm.NichsGroceryMod;
import com.tompkins_development.ngm.block.ModBlocks;
import com.tompkins_development.ngm.recipe.OvenRecipe;
import mezz.jei.api.constants.VanillaTypes;
import mezz.jei.api.gui.builder.IRecipeLayoutBuilder;
import mezz.jei.api.gui.drawable.IDrawable;
import mezz.jei.api.helpers.IGuiHelper;
import mezz.jei.api.recipe.IFocusGroup;
import mezz.jei.api.recipe.RecipeIngredientRole;
import mezz.jei.api.recipe.category.IRecipeCategory;
import net.minecraft.core.NonNullList;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;

import javax.annotation.Nonnull;

public class OvenRecipeCategory implements IRecipeCategory<OvenRecipe> {

    public final static ResourceLocation UID = new ResourceLocation(NichsGroceryMod.MOD_ID, "oven");
    public final static ResourceLocation TEXTURE =
            new ResourceLocation(NichsGroceryMod.MOD_ID, "textures/gui/oven_gui_jei.png");

    private final IDrawable background;
    private final IDrawable icon;

    public OvenRecipeCategory(IGuiHelper helper) {
        this.background = helper.createDrawable(TEXTURE, 0, 0, 176, 85);
        this.icon = helper.createDrawableIngredient(VanillaTypes.ITEM, new ItemStack(ModBlocks.OVEN.get()));
    }

    @Override
    public ResourceLocation getUid() {
        return UID;
    }
    @Override
    public Class<? extends OvenRecipe> getRecipeClass() {
        return OvenRecipe.class;
    }

    @Override
    public Component getTitle() {
        return new TextComponent("Oven");
    }

    @Override
    public IDrawable getBackground() {
        return this.background;
    }

    @Override
    public IDrawable getIcon() {
        return this.icon;
    }

    @Override
    public void setRecipe(@Nonnull IRecipeLayoutBuilder builder, @Nonnull OvenRecipe recipe, @Nonnull IFocusGroup focusGroup) {
        builder.addSlot(RecipeIngredientRole.INPUT, 51, 45).addIngredients(Ingredient.of((Items.COAL).getDefaultInstance()));
        builder.addSlot(RecipeIngredientRole.INPUT, 51, 16).addIngredients(recipe.getIngredients().get(0));

        builder.addSlot(RecipeIngredientRole.OUTPUT, 105, 29).addItemStack(recipe.getResultItem());
    }
}
