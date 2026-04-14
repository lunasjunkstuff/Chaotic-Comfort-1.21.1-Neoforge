package net.lunaastryx.chaotic_comfort.datagen;

import net.lunaastryx.chaotic_comfort.ChaoticComfort;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Blocks;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends BlockTagsProvider {
    public ModBlockTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, ChaoticComfort.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        tag(BlockTags.BEACON_BASE_BLOCKS)
                .add(Blocks.COPPER_BLOCK)
                .add(Blocks.WAXED_COPPER_BLOCK)
                .add(Blocks.CUT_COPPER)
                .add(Blocks.WAXED_CUT_COPPER)
                .add(Blocks.EXPOSED_COPPER)
                .add(Blocks.WAXED_EXPOSED_COPPER)
                .add(Blocks.EXPOSED_CUT_COPPER)
                .add(Blocks.WAXED_EXPOSED_CUT_COPPER)
                .add(Blocks.WEATHERED_COPPER)
                .add(Blocks.WAXED_WEATHERED_COPPER)
                .add(Blocks.WEATHERED_CUT_COPPER)
                .add(Blocks.WAXED_WEATHERED_COPPER)
                .add(Blocks.OXIDIZED_COPPER)
                .add(Blocks.WAXED_OXIDIZED_COPPER)
                .add(Blocks.OXIDIZED_CUT_COPPER)
                .add(Blocks.WAXED_OXIDIZED_CUT_COPPER);
    }
}
