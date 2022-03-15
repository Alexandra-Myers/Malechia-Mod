package net.alexandra.malechia;

import net.alexandra.malechia.util.MalechiaModelPredicateProvider;
import net.fabricmc.api.ClientModInitializer;

public class MalechiaClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        MalechiaModelPredicateProvider.registerModModels();
    }
}
