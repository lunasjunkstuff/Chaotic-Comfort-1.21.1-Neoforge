package net.lunaastryx.chaotic_comfort.item;

import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.neoforged.neoforge.common.SimpleTier;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModToolTiers {
    public static final Tier ELECTRIC_GUITAR = new SimpleTier(BlockTags.INCORRECT_FOR_NETHERITE_TOOL,
            2467, 9.0f, 8f, 17, () -> Ingredient.of(Blocks.ACACIA_PLANKS, Blocks.SPRUCE_PLANKS, Blocks.MANGROVE_PLANKS, Blocks.JUNGLE_PLANKS,
                    Blocks.DARK_OAK_PLANKS, Blocks.BIRCH_PLANKS, Blocks.BAMBOO_PLANKS, Blocks.CHERRY_PLANKS, Blocks.OAK_PLANKS));

    public static final Tier BAGUETTE = new SimpleTier(BlockTags.INCORRECT_FOR_NETHERITE_TOOL,
            6720, 6.7f, 7f, 19, () -> Ingredient.of(Items.BREAD));

}
