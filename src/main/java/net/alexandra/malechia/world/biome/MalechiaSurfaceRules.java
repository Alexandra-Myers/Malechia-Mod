package net.alexandra.malechia.world.biome;

import com.google.common.collect.ImmutableList;
import net.alexandra.malechia.block.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.world.gen.surfacebuilder.MaterialRules;
import net.minecraft.world.gen.surfacebuilder.VanillaSurfaceRules;

public class MalechiaSurfaceRules {
    private static final MaterialRules.MaterialRule ETHEREAL_DIRT = block(ModBlocks.ETHEREAL_DIRT.getDefaultState());
    private static final MaterialRules.MaterialRule ETHEREAL_GRASS_BLOCK = block(ModBlocks.ETHEREAL_GRASS_BLOCK.getDefaultState());

    public static MaterialRules.MaterialRule createDefaultRule() {
        MaterialRules.MaterialRule materialRule = MaterialRules.sequence(MaterialRules.condition( MaterialRules.biome(MalechiaBiomeKeys.ETHEREAL_CORE), ETHEREAL_GRASS_BLOCK), ETHEREAL_DIRT);
        ImmutableList.Builder builder = ImmutableList.builder();
        builder.add(materialRule);
        return MaterialRules.sequence((MaterialRules.MaterialRule[])builder.build().toArray(MaterialRules.MaterialRule[]::new));
    }

    private static MaterialRules.MaterialRule block(BlockState state) {
        return MaterialRules.block(state);
    }
}
