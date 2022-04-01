package net.alexandra.malechia.worldgeneration.feature;

import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.feature.PlacedFeatures;
import net.minecraft.world.gen.feature.VegetationPlacedFeatures;
import net.minecraft.world.gen.placementmodifier.HeightRangePlacementModifier;

import static net.alexandra.malechia.worldgeneration.feature.ModOreFeatures.modifiersWithCount;

public class ModPlacedFeatures {
    public static final RegistryEntry<PlacedFeature> ALLIAN_ORE_PLACED;
    public static final RegistryEntry<PlacedFeature> LITRIUM_ORE_PLACED;
    public static final RegistryEntry<PlacedFeature> ETHEREAL_TREE_PLACED = PlacedFeatures.register("ethereal_tree_placed",
            ModConfiguredFeatures.ETHEREAL_SPAWN, VegetationPlacedFeatures.modifiers(
                    PlacedFeatures.createCountExtraModifier(1, 0.1f, 2)));
    public static final RegistryEntry<PlacedFeature> ALOTIC_ORE_PLACED = PlacedFeatures.register("alotic_ore_placed",
            ModConfiguredFeatures.ALOTIC_ORE, modifiersWithCount(6,
                    HeightRangePlacementModifier.trapezoid(YOffset.aboveBottom(-64), YOffset.aboveBottom(32))));
    public static final RegistryEntry<PlacedFeature> HALORIUM_ORE_PLACED = PlacedFeatures.register("halorium_ore_placed",
            ModConfiguredFeatures.HALORIUM_ORE, modifiersWithCount(8,
                    HeightRangePlacementModifier.uniform(YOffset.aboveBottom(-16), YOffset.aboveBottom(64))));
    public static final RegistryEntry<PlacedFeature> QUARITE_ORE_PLACED = PlacedFeatures.register("quarite_ore_placed",
            ModConfiguredFeatures.QUARITE_ORE, modifiersWithCount(8,
                    HeightRangePlacementModifier.trapezoid(YOffset.aboveBottom(-64), YOffset.aboveBottom(32))));
    public static final RegistryEntry<PlacedFeature> LOCRONITE_ORE_PLACED = PlacedFeatures.register("locronite_ore_placed",
            ModConfiguredFeatures.LOCRONITE_ORE, modifiersWithCount(6,
                    HeightRangePlacementModifier.trapezoid(YOffset.aboveBottom(-48), YOffset.aboveBottom(40))));
    public static final RegistryEntry<PlacedFeature> MYCRONIUM_ORE_PLACED = PlacedFeatures.register("mycronium_ore_placed",
            ModConfiguredFeatures.MYCRONIUM_ORE, modifiersWithCount(8,
                    HeightRangePlacementModifier.uniform(YOffset.aboveBottom(-16), YOffset.aboveBottom(64))));
    public static final RegistryEntry<PlacedFeature> AURAUM_ORE_PLACED = PlacedFeatures.register("auraum_ore_placed",
            ModConfiguredFeatures.AURAUM_ORE, modifiersWithCount(6,
                    HeightRangePlacementModifier.uniform(YOffset.aboveBottom(-16), YOffset.aboveBottom(64))));
    public static final RegistryEntry<PlacedFeature> CHRYON_ORE_PLACED = PlacedFeatures.register("chryon_ore_placed",
            ModConfiguredFeatures.CHRYON_ORE, modifiersWithCount(7,
                    HeightRangePlacementModifier.trapezoid(YOffset.aboveBottom(-64), YOffset.aboveBottom(32))));
    public static final RegistryEntry<PlacedFeature> ERETH_ORE_PLACED = PlacedFeatures.register("ereth_ore_placed",
            ModConfiguredFeatures.ERETH_ORE, modifiersWithCount(7,
                    HeightRangePlacementModifier.trapezoid(YOffset.aboveBottom(-48), YOffset.aboveBottom(40))));
    static {
        ALLIAN_ORE_PLACED = PlacedFeatures.register("ore_allian", ModConfiguredFeatures.ALLIAN_ORE, modifiersWithCount(4, HeightRangePlacementModifier.trapezoid(YOffset.aboveBottom(-80), YOffset.aboveBottom(80))));
        LITRIUM_ORE_PLACED = PlacedFeatures.register("ore_litrium", ModConfiguredFeatures.LITRIUM_ORE, modifiersWithCount(6, HeightRangePlacementModifier.trapezoid(YOffset.aboveBottom(-64), YOffset.aboveBottom(16))));
    }
}
