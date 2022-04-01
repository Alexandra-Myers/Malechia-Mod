package net.alexandra.malechia.worldgeneration.gen.surfacebuilder;

import com.google.common.collect.ImmutableList;
import net.alexandra.malechia.MalechiaMod;
import net.alexandra.malechia.block.ModBlocks;
import net.alexandra.malechia.worldgeneration.biome.MalechiaBiomeKeys;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.gen.noise.NoiseParametersKeys;
import net.minecraft.world.gen.surfacebuilder.MaterialRules;

public class MalechiaSurfaceRules {
    private static final MaterialRules.MaterialRule AIR;
    private static final MaterialRules.MaterialRule GRASS_BLOCK;
    private static final MaterialRules.MaterialRule DIRT;

    public MalechiaSurfaceRules() {
    }

    private static MaterialRules.MaterialRule block(Block block) {
        return MaterialRules.block(block.getDefaultState());
    }

    public static MaterialRules.MaterialRule createEtherealSurfaceRule() {
        return createDefaultRule(true, false, true);
    }

    public static MaterialRules.MaterialRule createDefaultRule(boolean surface, boolean bedrockRoof, boolean bedrockFloor) {
        MaterialRules.MaterialCondition materialCondition8 = MaterialRules.water(0, 0);
        MaterialRules.MaterialRule materialRule = MaterialRules.sequence(new MaterialRules.MaterialRule[]{MaterialRules.condition(materialCondition8, GRASS_BLOCK), DIRT});
        MaterialRules.MaterialRule materialRule8 = MaterialRules.sequence(new MaterialRules.MaterialRule[]{MaterialRules.condition(MaterialRules.biome(new RegistryKey[]{MalechiaBiomeKeys.THE_CORE}), materialRule)});
        ImmutableList.Builder<MaterialRules.MaterialRule> builder = ImmutableList.builder();
        return MaterialRules.sequence((MaterialRules.MaterialRule[])builder.build().toArray((i) -> {
            return new MaterialRules.MaterialRule[i];
        }));
    }

    private static MaterialRules.MaterialCondition surfaceNoiseThreshold(double min) {
        return MaterialRules.noiseThreshold(NoiseParametersKeys.SURFACE, min / 8.25D, 1.7976931348623157E308D);
    }

    static {
        AIR = block(Blocks.AIR);
        DIRT = block(ModBlocks.ETHEREAL_DIRT);
        GRASS_BLOCK = block(ModBlocks.ETHEREAL_GRASS_BLOCK);
    }
    public static void registerSurfaceRules(){
        MalechiaMod.LOGGER.info("Registering surface rules for " + MalechiaMod.MOD_ID);
    }
}