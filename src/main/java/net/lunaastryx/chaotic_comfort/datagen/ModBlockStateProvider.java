package net.lunaastryx.chaotic_comfort.datagen;

import net.lunaastryx.chaotic_comfort.ChaoticComfort;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;

public class ModBlockStateProvider extends BlockStateProvider {


    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, ChaoticComfort.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        //blockWithItem(ModBlocks.idkbro)
    }

    private void blockWithItem(DeferredBlock<?> deferredBlock) {
        simpleBlockWithItem(deferredBlock.get(), cubeAll(deferredBlock.get()));
    }
}
