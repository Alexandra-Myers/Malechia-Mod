package net.alexandra.malechia.world.feature;

import net.alexandra.malechia.MalechiaMod;
import net.alexandra.malechia.block.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.foliage.BlobFoliagePlacer;
import net.minecraft.world.gen.foliage.RandomSpreadFoliagePlacer;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.minecraft.world.gen.trunk.BendingTrunkPlacer;
import net.minecraft.world.gen.trunk.StraightTrunkPlacer;

import java.util.List;

public class ModTreeConfiguredFeatures {
    public static final RegistryEntry<ConfiguredFeature<TreeFeatureConfig, ?>> ETHEREAL_TREE;
    public ModTreeConfiguredFeatures() {
    }

    private static TreeFeatureConfig.Builder builder(Block log, Block leaves, int baseHeight, int firstRandomHeight, int secondRandomHeight, int radius) {
        return new TreeFeatureConfig.Builder(BlockStateProvider.of(log), new StraightTrunkPlacer(baseHeight, firstRandomHeight, secondRandomHeight), BlockStateProvider.of(leaves), new BlobFoliagePlacer(ConstantIntProvider.create(radius), ConstantIntProvider.create(0), 3), new TwoLayersFeatureSize(1, 0, 1));
    }

    static {
        ETHEREAL_TREE = ConfiguredFeatures.register("ethereal_tree", Feature.TREE, (new TreeFeatureConfig.Builder(BlockStateProvider.of(ModBlocks.ETHEREAL_LOG), new BendingTrunkPlacer(4, 2, 0, 3, UniformIntProvider.create(1, 2)), BlockStateProvider.of(ModBlocks.ETHEREAL_LEAVES), new RandomSpreadFoliagePlacer(ConstantIntProvider.create(3), ConstantIntProvider.create(0), ConstantIntProvider.create(2), 50), new TwoLayersFeatureSize(1, 0, 1))).dirtProvider(BlockStateProvider.of(ModBlocks.ETHEREAL_STONE)).forceDirt().build());
    }
    public static final RegistryEntry<PlacedFeature> ETHEREAL_TREE_CHECKED = PlacedFeatures.register("ethereal_tree_checked",
            ETHEREAL_TREE, PlacedFeatures.wouldSurvive(ModBlocks.ETHEREAL_BUSH));
    public static final RegistryEntry<ConfiguredFeature<RandomFeatureConfig, ?>> ETHEREAL_SPAWN = ConfiguredFeatures.register("ethereal_spawn",
            Feature.RANDOM_SELECTOR,
                new RandomFeatureConfig(List.of(new RandomFeatureEntry(ETHEREAL_TREE_CHECKED, 0.6F)), ETHEREAL_TREE_CHECKED));

    public static void registerConfiguredFeatures() {
        System.out.println("Registering ModConfiguredFeatures for " + MalechiaMod.MOD_ID);
    }
}
