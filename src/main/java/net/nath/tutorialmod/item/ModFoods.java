package net.nath.tutorialmod.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoods {
    public static final FoodProperties STRAWBERRY = new FoodProperties.Builder().nutrition(5).fast().alwaysEat()
            .saturationMod(0.5f).effect(() -> new MobEffectInstance(MobEffects.INVISIBILITY, 1000), 0.5f).build();

}
