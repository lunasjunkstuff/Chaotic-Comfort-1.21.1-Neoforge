package net.lunaastryx.chaotic_comfort.datagen;

import net.lunaastryx.chaotic_comfort.ChaoticComfort;
import net.lunaastryx.chaotic_comfort.item.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends ItemTagsProvider {
    public ModItemTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, CompletableFuture<TagLookup<Block>> blockTags, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, blockTags, ChaoticComfort.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        tag(ItemTags.BEACON_PAYMENT_ITEMS)
                .add(Items.COPPER_INGOT);

        tag(ItemTags.AXES)
                .add(ModItems.ELECTRIC_GUITAR.get())
                .add(ModItems.GLITCHY_ELECTRIC_GUITAR.get());
    }
}
