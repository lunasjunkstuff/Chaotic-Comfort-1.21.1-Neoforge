package net.lunaastryx.chaotic_comfort.item;

import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Blocks;
import net.neoforged.neoforge.common.SimpleTier;

public class ModToolTiers {
    public static final Tier ELECTRIC_GUITAR = new SimpleTier(BlockTags.INCORRECT_FOR_NETHERITE_TOOL,
            2467, 9f, 8f, 17,
            () -> Ingredient.of(Blocks.OAK_PLANKS, Blocks.ACACIA_PLANKS, Blocks.CHERRY_PLANKS, Blocks.BAMBOO_PLANKS, Blocks.BIRCH_PLANKS,
                    Blocks.DARK_OAK_PLANKS, Blocks.JUNGLE_PLANKS, Blocks.MANGROVE_PLANKS, Blocks.SPRUCE_PLANKS));

}
