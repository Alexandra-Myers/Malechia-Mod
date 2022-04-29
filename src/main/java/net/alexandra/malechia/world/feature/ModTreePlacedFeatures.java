package net.alexandra.malechia.world.feature;

import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.feature.PlacedFeatures;
import net.minecraft.world.gen.feature.VegetationPlacedFeatures;

public class ModTreePlacedFeatures {
    public static final RegistryEntry<PlacedFeature> ETHEREAL_TREE_PLACED = PlacedFeatures.register("ethereal_tree_placed",
            ModTreeConfiguredFeatures.ETHEREAL_SPAWN, VegetationPlacedFeatures.modifiers(
                    PlacedFeatures.createCountExtraModifier(1,0.5f, 2)));
}
