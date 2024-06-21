package net.nath.tutorialmod.datagen;

import net.nath.tutorialmod.TutorialMod;
import net.nath.tutorialmod.item.Moditems;
import net.nath.tutorialmod.loot.AddItemModifier;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.storage.loot.predicates.LootItemBlockStatePropertyCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemRandomChanceCondition;
import net.minecraftforge.common.data.GlobalLootModifierProvider;
import net.minecraftforge.common.loot.LootTableIdCondition;
import net.nath.tutorialmod.loot.AddSusSandItemModifier;

public class ModGlobalLootModifiersProvider extends GlobalLootModifierProvider {
    public ModGlobalLootModifiersProvider(PackOutput output) {
        super(output, TutorialMod.MOD_ID);
    }

    @Override
    protected void start() {
        add("pine_cone_from_grass", new AddItemModifier(new LootItemCondition[] {
                LootItemBlockStatePropertyCondition.hasBlockStateProperties(Blocks.GRASS).build(),
                LootItemRandomChanceCondition.randomChance(0.35f).build()}, Moditems.PINE_CONE.get()));

        add("pine_cone_from_oak_leaves", new AddItemModifier(new LootItemCondition[] {
                LootItemBlockStatePropertyCondition.hasBlockStateProperties(Blocks.OAK_LEAVES).build(),
                LootItemRandomChanceCondition.randomChance(0.50f).build()}, Moditems.PINE_CONE.get()));
        add("pine_cone_from_acacia_leaves", new AddItemModifier(new LootItemCondition[] {
                LootItemBlockStatePropertyCondition.hasBlockStateProperties(Blocks.ACACIA_LEAVES).build(),
                LootItemRandomChanceCondition.randomChance(0.35f).build()}, Moditems.PINE_CONE.get()));
        add("pine_cone_from_azalea_leaves", new AddItemModifier(new LootItemCondition[] {
                LootItemBlockStatePropertyCondition.hasBlockStateProperties(Blocks.AZALEA_LEAVES).build(),
                LootItemRandomChanceCondition.randomChance(0.35f).build()}, Moditems.PINE_CONE.get()));
        add("pine_cone_from_birch_leaves", new AddItemModifier(new LootItemCondition[] {
                LootItemBlockStatePropertyCondition.hasBlockStateProperties(Blocks.BIRCH_LEAVES).build(),
                LootItemRandomChanceCondition.randomChance(0.35f).build()}, Moditems.PINE_CONE.get()));
        add("pine_cone_from_cherry_leaves", new AddItemModifier(new LootItemCondition[] {
                LootItemBlockStatePropertyCondition.hasBlockStateProperties(Blocks.CHERRY_LEAVES).build(),
                LootItemRandomChanceCondition.randomChance(0.35f).build()}, Moditems.PINE_CONE.get()));
        add("pine_cone_from_dark_oak_leaves", new AddItemModifier(new LootItemCondition[] {
                LootItemBlockStatePropertyCondition.hasBlockStateProperties(Blocks.DARK_OAK_LEAVES).build(),
                LootItemRandomChanceCondition.randomChance(0.35f).build()}, Moditems.PINE_CONE.get()));
        add("pine_cone_from_flowering_azalea_leaves", new AddItemModifier(new LootItemCondition[] {
                LootItemBlockStatePropertyCondition.hasBlockStateProperties(Blocks.FLOWERING_AZALEA_LEAVES).build(),
                LootItemRandomChanceCondition.randomChance(0.35f).build()}, Moditems.PINE_CONE.get()));
        add("pine_cone_from_jungle_leaves", new AddItemModifier(new LootItemCondition[] {
                LootItemBlockStatePropertyCondition.hasBlockStateProperties(Blocks.JUNGLE_LEAVES).build(),
                LootItemRandomChanceCondition.randomChance(0.35f).build()}, Moditems.PINE_CONE.get()));
        add("pine_cone_from_mangrove_leaves", new AddItemModifier(new LootItemCondition[] {
                LootItemBlockStatePropertyCondition.hasBlockStateProperties(Blocks.MANGROVE_LEAVES).build(),
                LootItemRandomChanceCondition.randomChance(0.35f).build()}, Moditems.PINE_CONE.get()));
        add("pine_cone_from_spruce_leaves", new AddItemModifier(new LootItemCondition[] {
                LootItemBlockStatePropertyCondition.hasBlockStateProperties(Blocks.SPRUCE_LEAVES).build(),
                LootItemRandomChanceCondition.randomChance(0.35f).build()}, Moditems.PINE_CONE.get()));

        add("pine_cone_from_creeper", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(new ResourceLocation("entities/creeper")).build() }, Moditems.PINE_CONE.get()));

        add("metal_detector_from_jungle_temples", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(new ResourceLocation("chests/jungle_temple")).build() }, Moditems.METAL_DETECTOR.get()));

        add("strawberry_from_jungle_temples", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(new ResourceLocation("chests/jungle_temple")).build() }, Moditems.STRAWBERRY.get()));

        add("strawberry_from_desert_pyramid", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(new ResourceLocation("chests/desert_pyramid")).build() }, Moditems.STRAWBERRY.get()));

        add("pine_cone_from_desert_pyramid", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(new ResourceLocation("chests/desert_pyramid")).build() }, Moditems.PINE_CONE.get()));

        add("metal_detector_from_suspicious_sand", new AddSusSandItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(new ResourceLocation("archaeology/desert_pyramid")).build() }, Moditems.METAL_DETECTOR.get()));

    }
}