package net.nath.tutorialmod.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.MinecartItem;
import net.minecraft.world.item.crafting.AbstractCookingRecipe;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;
import net.nath.tutorialmod.TutorialMod;
import net.nath.tutorialmod.block.ModBlocks;
import net.nath.tutorialmod.item.Moditems;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    private static final List<ItemLike> SAPPHIRE_SMELTABLES = List.of(Moditems.Raw_SAPPHIRE.get(),
            ModBlocks.SAPPHIRE_ORE.get(), ModBlocks.DEEPSLATE_SAPPHIRE_ORE.get(), ModBlocks.NETHER_SAPPHIRE_ORE.get(),
            ModBlocks.END_STONE_SAPPHIRE_ORE.get());

    public ModRecipeProvider(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> pWriter) {
        oreSmelting(pWriter, SAPPHIRE_SMELTABLES, RecipeCategory.MISC, Moditems.SAPPHIRE.get(), 0.25f, 200,"sapphire");
        oreBlasting(pWriter, SAPPHIRE_SMELTABLES, RecipeCategory.MISC, Moditems.SAPPHIRE.get(), 0.25f, 100,"sapphire");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC,ModBlocks.SAPPHIRE_BLOCK.get())
                .pattern("SSS")
                .pattern("SSS")
                .pattern("SSS")
                .define('S', Moditems.SAPPHIRE.get())
                .unlockedBy(getHasName(Moditems.SAPPHIRE.get()), has(Moditems.SAPPHIRE.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC,ModBlocks.RAW_SAPPHIRE_BLOCK.get())
                .pattern("SSS")
                .pattern("SSS")
                .pattern("SSS")
                .define('S', Moditems.Raw_SAPPHIRE.get())
                .unlockedBy(getHasName(Moditems.Raw_SAPPHIRE.get()), has(Moditems.Raw_SAPPHIRE.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC,ModBlocks.SAPPHIRE_STAIRS.get(), 4)
                .pattern("  S")
                .pattern(" SS")
                .pattern("SSS")
                .define('S', Moditems.SAPPHIRE.get())
                .unlockedBy(getHasName(Moditems.SAPPHIRE.get()), has(Moditems.SAPPHIRE.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC,ModBlocks.SAPPHIRE_SLAB.get(), 6)
                .pattern("   ")
                .pattern("SSS")
                .pattern("   ")
                .define('S', ModBlocks.SAPPHIRE_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.SAPPHIRE_BLOCK.get()), has(ModBlocks.SAPPHIRE_BLOCK.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC,ModBlocks.SAPPHIRE_DOOR.get(), 3)
                .pattern("SS ")
                .pattern("SS ")
                .pattern("SS ")
                .define('S', ModBlocks.SAPPHIRE_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.SAPPHIRE_BLOCK.get()), has(ModBlocks.SAPPHIRE_BLOCK.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC,ModBlocks.SAPPHIRE_WALL.get(), 6)
                .pattern("SSS")
                .pattern("XXX")
                .pattern("   ")
                .define('S', Moditems.SAPPHIRE.get())
                .unlockedBy(getHasName(Moditems.SAPPHIRE.get()), has(Moditems.SAPPHIRE.get()))
                .define('X', Moditems.Raw_SAPPHIRE.get())
                .unlockedBy(getHasName(Moditems.Raw_SAPPHIRE.get()), has(Moditems.Raw_SAPPHIRE.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC,ModBlocks.SAPPHIRE_TRAPDOOR.get(),2)
                .pattern("   ")
                .pattern("SSS")
                .pattern("SSS")
                .define('S', Moditems.SAPPHIRE.get())
                .unlockedBy(getHasName(Moditems.SAPPHIRE.get()), has(Moditems.SAPPHIRE.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC,ModBlocks.SAPPHIRE_PRESSURE_PLATE.get())
                .pattern("   ")
                .pattern("SS ")
                .pattern("   ")
                .define('S', Moditems.SAPPHIRE.get())
                .unlockedBy(getHasName(Moditems.SAPPHIRE.get()), has(Moditems.SAPPHIRE.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC,ModBlocks.SAPPHIRE_FENCE.get(), 3)
                .pattern("   ")
                .pattern("SXS")
                .pattern("SXS")
                .define('S', Moditems.SAPPHIRE.get())
                .unlockedBy(getHasName(Moditems.SAPPHIRE.get()), has(Moditems.SAPPHIRE.get()))
                .define('X', Moditems.Raw_SAPPHIRE.get())
                .unlockedBy(getHasName(Moditems.Raw_SAPPHIRE.get()), has(Moditems.Raw_SAPPHIRE.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC,ModBlocks.SAPPHIRE_FENCE_GATE.get(), 1)
                .pattern("   ")
                .pattern("XSX")
                .pattern("XSX")
                .define('S', Moditems.SAPPHIRE.get())
                .unlockedBy(getHasName(Moditems.SAPPHIRE.get()), has(Moditems.SAPPHIRE.get()))
                .define('X', Moditems.Raw_SAPPHIRE.get())
                .unlockedBy(getHasName(Moditems.Raw_SAPPHIRE.get()), has(Moditems.Raw_SAPPHIRE.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC,ModBlocks.SAPPHIRE_BUTTON.get())
                .pattern("   ")
                .pattern(" S ")
                .pattern("   ")
                .define('S', Moditems.SAPPHIRE.get())
                .unlockedBy(getHasName(Moditems.SAPPHIRE.get()), has(Moditems.SAPPHIRE.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC,Moditems.METAL_DETECTOR.get())
                .pattern(" XX")
                .pattern(" X ")
                .pattern("SS ")
                .define('S', Moditems.SAPPHIRE.get())
                .unlockedBy(getHasName(Moditems.SAPPHIRE.get()), has(Moditems.SAPPHIRE.get()))
                .define('X', Moditems.Raw_SAPPHIRE.get())
                .unlockedBy(getHasName(Moditems.Raw_SAPPHIRE.get()), has(Moditems.Raw_SAPPHIRE.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC,ModBlocks.SOUND_BLOCK.get())
                .pattern("SSS")
                .pattern("SXS")
                .pattern("SSS")
                .define('S', Moditems.SAPPHIRE.get())
                .unlockedBy(getHasName(Moditems.SAPPHIRE.get()), has(Moditems.SAPPHIRE.get()))
                .define('X', Moditems.Raw_SAPPHIRE.get())
                .unlockedBy(getHasName(Moditems.Raw_SAPPHIRE.get()), has(Moditems.Raw_SAPPHIRE.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC,Moditems.SAPPHIRE_STAFF.get())
                .pattern("S  ")
                .pattern("S  ")
                .pattern("S  ")
                .define('S', Moditems.SAPPHIRE.get())
                .unlockedBy(getHasName(Moditems.SAPPHIRE.get()), has(Moditems.SAPPHIRE.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC,Moditems.SAPPHIRE_SWORD.get())
                .pattern(" S ")
                .pattern(" S ")
                .pattern(" X ")
                .define('S', Moditems.SAPPHIRE.get())
                .unlockedBy(getHasName(Moditems.SAPPHIRE.get()), has(Moditems.SAPPHIRE.get()))
                .define('X', Moditems.Raw_SAPPHIRE.get())
                .unlockedBy(getHasName(Moditems.Raw_SAPPHIRE.get()), has(Moditems.Raw_SAPPHIRE.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC,Moditems.SAPPHIRE_PICKAXE.get())
                .pattern("SSS")
                .pattern(" X ")
                .pattern(" X ")
                .define('S', Moditems.SAPPHIRE.get())
                .unlockedBy(getHasName(Moditems.SAPPHIRE.get()), has(Moditems.SAPPHIRE.get()))
                .define('X', Moditems.Raw_SAPPHIRE.get())
                .unlockedBy(getHasName(Moditems.Raw_SAPPHIRE.get()), has(Moditems.Raw_SAPPHIRE.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC,Moditems.SAPPHIRE_AXE.get())
                .pattern(" SS")
                .pattern(" XS")
                .pattern(" X ")
                .define('S', Moditems.SAPPHIRE.get())
                .unlockedBy(getHasName(Moditems.SAPPHIRE.get()), has(Moditems.SAPPHIRE.get()))
                .define('X', Moditems.Raw_SAPPHIRE.get())
                .unlockedBy(getHasName(Moditems.Raw_SAPPHIRE.get()), has(Moditems.Raw_SAPPHIRE.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC,Moditems.SAPPHIRE_HOE.get())
                .pattern(" SS")
                .pattern(" X ")
                .pattern(" X ")
                .define('S', Moditems.SAPPHIRE.get())
                .unlockedBy(getHasName(Moditems.SAPPHIRE.get()), has(Moditems.SAPPHIRE.get()))
                .define('X', Moditems.Raw_SAPPHIRE.get())
                .unlockedBy(getHasName(Moditems.Raw_SAPPHIRE.get()), has(Moditems.Raw_SAPPHIRE.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC,Moditems.SAPPHIRE_SHOVEL.get())
                .pattern(" S ")
                .pattern(" X ")
                .pattern(" X ")
                .define('S', Moditems.SAPPHIRE.get())
                .unlockedBy(getHasName(Moditems.SAPPHIRE.get()), has(Moditems.SAPPHIRE.get()))
                .define('X', Moditems.Raw_SAPPHIRE.get())
                .unlockedBy(getHasName(Moditems.Raw_SAPPHIRE.get()), has(Moditems.Raw_SAPPHIRE.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC,Moditems.SAPPHIRE_HELMET.get())
                .pattern("SSS")
                .pattern("S S")
                .pattern("   ")
                .define('S', Moditems.SAPPHIRE.get())
                .unlockedBy(getHasName(Moditems.SAPPHIRE.get()), has(Moditems.SAPPHIRE.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC,Moditems.SAPPHIRE_CHESTPLATE.get())
                .pattern("S S")
                .pattern("SSS")
                .pattern("SSS")
                .define('S', Moditems.SAPPHIRE.get())
                .unlockedBy(getHasName(Moditems.SAPPHIRE.get()), has(Moditems.SAPPHIRE.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC,Moditems.SAPPHIRE_LEGGINGS.get())
                .pattern("SSS")
                .pattern("S S")
                .pattern("S S")
                .define('S', Moditems.SAPPHIRE.get())
                .unlockedBy(getHasName(Moditems.SAPPHIRE.get()), has(Moditems.SAPPHIRE.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC,Moditems.SAPPHIRE_BOOTS.get())
                .pattern("   ")
                .pattern("S S")
                .pattern("S S")
                .define('S', Moditems.SAPPHIRE.get())
                .unlockedBy(getHasName(Moditems.SAPPHIRE.get()), has(Moditems.SAPPHIRE.get()))
                .save(pWriter);


        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Moditems.SAPPHIRE.get(), 9)
                .requires(ModBlocks.SAPPHIRE_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.SAPPHIRE_BLOCK.get()), has(ModBlocks.SAPPHIRE_BLOCK.get()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Moditems.Raw_SAPPHIRE.get(), 9)
                .requires(ModBlocks.RAW_SAPPHIRE_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.RAW_SAPPHIRE_BLOCK.get()), has(ModBlocks.RAW_SAPPHIRE_BLOCK.get()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Moditems.STRAWBERRY_SEEDS.get(), 4)
                .requires(Moditems.STRAWBERRY.get())
                .unlockedBy(getHasName(Moditems.STRAWBERRY.get()), has(Moditems.STRAWBERRY.get()))
                .save(pWriter);
    }

    protected static void oreSmelting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTIme, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.SMELTING_RECIPE, pIngredients, pCategory, pResult, pExperience, pCookingTIme, pGroup, "_from_smelting");
    }

    protected static void oreBlasting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.BLASTING_RECIPE, pIngredients, pCategory, pResult, pExperience, pCookingTime, pGroup, "_from_blasting");
    }

    protected static void oreCooking(Consumer<FinishedRecipe> pFinishedRecipeConsumer, RecipeSerializer<? extends AbstractCookingRecipe> pCookingSerializer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup, String pRecipeName) {
        for(ItemLike itemlike : pIngredients) {
            SimpleCookingRecipeBuilder.generic(Ingredient.of(itemlike), pCategory, pResult,
                    pExperience, pCookingTime, pCookingSerializer)
                    .group(pGroup).unlockedBy(getHasName(itemlike), has(itemlike))
                    .save(pFinishedRecipeConsumer,  TutorialMod.MOD_ID + ":" + getItemName(pResult) + pRecipeName + "_" + getItemName(itemlike));
        }
    }
}