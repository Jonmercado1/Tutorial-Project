package net.jon.tutorialmod.item.custom;

import net.jon.tutorialmod.TutorialMod;
import net.jon.tutorialmod.item.ModItems;
import net.jon.tutorialmod.util.ModTags;
import net.minecraft.client.tutorial.Tutorial;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;

import java.util.List;

public class ModToolTiers {
    public static final Tier SAPPHIRE = TierSortingRegistry.registerTier(
            new ForgeTier(5, 1500, 5f, 4f, 25, ModTags.Blocks.NEEDS_SAPPHIRE_TOOL,
                    () -> Ingredient.of(ModItems.SAPPHIRE.get())),
            ResourceLocation.fromNamespaceAndPath(TutorialMod.MOD_ID, "sapphire"), List.of(Tiers.NETHERITE), List.of());
}
