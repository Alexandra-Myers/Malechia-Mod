package net.alexandra.malechia.worldgeneration.biome;

import net.alexandra.malechia.MalechiaMod;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.biome.Biome;

public abstract class MalechiaBiomeKeys {
    public static final RegistryKey<Biome> THE_CORE = register("the_core");

    public MalechiaBiomeKeys() {
    }

    private static RegistryKey<Biome> register(String name) {
        return RegistryKey.of(Registry.BIOME_KEY, new Identifier(name));
    }
    public static void registerBiomeKeys(){
        MalechiaMod.LOGGER.info("Registering biome keys for " + MalechiaMod.MOD_ID);
    }
}
