package net.alexandra.malechia.block;

import net.alexandra.malechia.MalechiaMod;
import net.alexandra.malechia.item.ModItemGroups;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.util.registry.Registry;

public class ModBlocks {

    public static final Block ETHEREAL_LOG = registerBlock("ethereal_log",
            new PillarBlock(FabricBlockSettings.copy(Blocks.CRIMSON_STEM).strength(4.0f).requiresTool()), ModItemGroups.MALECHIA_BLOCKS);
    public static final Block ETHEREAL_WOOD = registerBlock("ethereal_wood",
            new PillarBlock(FabricBlockSettings.copy(Blocks.CRIMSON_HYPHAE).strength(4.0f).requiresTool()), ModItemGroups.MALECHIA_BLOCKS);
    public static final Block STRIPPED_ETHEREAL_LOG = registerBlock("stripped_ethereal_log",
            new PillarBlock(FabricBlockSettings.copy(Blocks.STRIPPED_CRIMSON_STEM).strength(4.0f).requiresTool()), ModItemGroups.MALECHIA_BLOCKS);
    public static final Block STRIPPED_ETHEREAL_WOOD = registerBlock("stripped_ethereal_wood",
            new PillarBlock(FabricBlockSettings.copy(Blocks.STRIPPED_CRIMSON_HYPHAE).strength(4.0f).requiresTool()), ModItemGroups.MALECHIA_BLOCKS);
    public static final Block FIERY_ETHEREAL_LOG = registerBlock("fiery_ethereal_log",
            new PillarBlock(FabricBlockSettings.copy(Blocks.CRIMSON_STEM).strength(4.0f).requiresTool()), ModItemGroups.MALECHIA_BLOCKS);
    public static final Block FIERY_ETHEREAL_WOOD = registerBlock("fiery_ethereal_wood",
            new PillarBlock(FabricBlockSettings.copy(Blocks.CRIMSON_HYPHAE).strength(4.0f).requiresTool()), ModItemGroups.MALECHIA_BLOCKS);
    public static final Block STRIPPED_FIERY_ETHEREAL_LOG = registerBlock("stripped_fiery_ethereal_log",
            new PillarBlock(FabricBlockSettings.copy(Blocks.STRIPPED_CRIMSON_STEM).strength(4.0f).requiresTool()), ModItemGroups.MALECHIA_BLOCKS);
    public static final Block STRIPPED_FIERY_ETHEREAL_WOOD = registerBlock("stripped_fiery_ethereal_wood",
            new PillarBlock(FabricBlockSettings.copy(Blocks.STRIPPED_CRIMSON_HYPHAE).strength(4.0f).requiresTool()), ModItemGroups.MALECHIA_BLOCKS);
    public static final Block INFINITY_ETHEREAL_LOG = registerBlock("infinity_ethereal_log",
            new PillarBlock(FabricBlockSettings.copy(Blocks.CRIMSON_STEM).strength(4.0f).requiresTool()), ModItemGroups.MALECHIA_BLOCKS);
    public static final Block INFINITY_ETHEREAL_WOOD = registerBlock("infinity_ethereal_wood",
            new PillarBlock(FabricBlockSettings.copy(Blocks.CRIMSON_HYPHAE).strength(4.0f).requiresTool()), ModItemGroups.MALECHIA_BLOCKS);
    public static final Block STRIPPED_INFINITY_ETHEREAL_LOG = registerBlock("stripped_infinity_ethereal_log",
            new PillarBlock(FabricBlockSettings.copy(Blocks.STRIPPED_CRIMSON_STEM).strength(4.0f).requiresTool()), ModItemGroups.MALECHIA_BLOCKS);
    public static final Block STRIPPED_INFINITY_ETHEREAL_WOOD = registerBlock("stripped_infinity_ethereal_wood",
            new PillarBlock(FabricBlockSettings.copy(Blocks.STRIPPED_CRIMSON_HYPHAE).strength(4.0f).requiresTool()), ModItemGroups.MALECHIA_BLOCKS);
    public static final Block QUARITE_ORE = registerBlock("quarite_ore",
            new OreBlock(FabricBlockSettings.of(Material.STONE).strength(20f).requiresTool(),
                    UniformIntProvider.create(2, 6)), ModItemGroups.MALECHIA_BLOCKS);
    public static final Block DEEPSLATE_QUARITE_ORE = registerBlock("deepslate_quarite_ore",
            new OreBlock(FabricBlockSettings.of(Material.STONE).strength(30f).requiresTool(),
                    UniformIntProvider.create(2, 6)), ModItemGroups.MALECHIA_BLOCKS);
    public static final Block MYCRONIUM_ORE = registerBlock("mycronium_ore",
            new OreBlock(FabricBlockSettings.of(Material.STONE).strength(20f).requiresTool(),
                    UniformIntProvider.create(2, 6)), ModItemGroups.MALECHIA_BLOCKS);
    public static final Block DEEPSLATE_MYCRONIUM_ORE = registerBlock("deepslate_mycronium_ore",
            new OreBlock(FabricBlockSettings.of(Material.STONE).strength(30f).requiresTool(),
                    UniformIntProvider.create(2, 6)), ModItemGroups.MALECHIA_BLOCKS);
    public static final Block AURAUM_ORE = registerBlock("auraum_ore",
            new OreBlock(FabricBlockSettings.of(Material.STONE).strength(20f).requiresTool(),
                    UniformIntProvider.create(2, 6)), ModItemGroups.MALECHIA_BLOCKS);
    public static final Block DEEPSLATE_AURAUM_ORE = registerBlock("deepslate_auraum_ore",
            new OreBlock(FabricBlockSettings.of(Material.STONE).strength(30f).requiresTool(),
                    UniformIntProvider.create(2, 6)), ModItemGroups.MALECHIA_BLOCKS);
    public static final Block LOCRONITE_ORE = registerBlock("locronite_ore",
            new OreBlock(FabricBlockSettings.of(Material.STONE).strength(20f).requiresTool(),
                    UniformIntProvider.create(2, 6)), ModItemGroups.MALECHIA_BLOCKS);
    public static final Block DEEPSLATE_LOCRONITE_ORE = registerBlock("deepslate_locronite_ore",
            new OreBlock(FabricBlockSettings.of(Material.STONE).strength(30f).requiresTool(),
                    UniformIntProvider.create(2, 6)), ModItemGroups.MALECHIA_BLOCKS);
    public static final Block ALOTIC_ORE = registerBlock("alotic_ore",
            new OreBlock(FabricBlockSettings.of(Material.STONE).strength(20f).requiresTool(),
                    UniformIntProvider.create(2, 6)), ModItemGroups.MALECHIA_BLOCKS);
    public static final Block DEEPSLATE_ALOTIC_ORE = registerBlock("deepslate_alotic_ore",
            new OreBlock(FabricBlockSettings.of(Material.STONE).strength(30f).requiresTool(),
                    UniformIntProvider.create(2, 6)), ModItemGroups.MALECHIA_BLOCKS);
    public static final Block ERETH_ORE = registerBlock("ereth_ore",
            new OreBlock(FabricBlockSettings.of(Material.STONE).strength(20f).requiresTool(),
                    UniformIntProvider.create(2, 6)), ModItemGroups.MALECHIA_BLOCKS);
    public static final Block DEEPSLATE_ERETH_ORE = registerBlock("deepslate_ereth_ore",
            new OreBlock(FabricBlockSettings.of(Material.STONE).strength(30f).requiresTool(),
                    UniformIntProvider.create(2, 6)), ModItemGroups.MALECHIA_BLOCKS);
    public static final Block CHRYON_ORE = registerBlock("chryon_ore",
            new OreBlock(FabricBlockSettings.of(Material.STONE).strength(20f).requiresTool(),
                    UniformIntProvider.create(2, 6)), ModItemGroups.MALECHIA_BLOCKS);
    public static final Block DEEPSLATE_CHRYON_ORE = registerBlock("deepslate_chryon_ore",
            new OreBlock(FabricBlockSettings.of(Material.STONE).strength(30f).requiresTool(),
                    UniformIntProvider.create(2, 6)), ModItemGroups.MALECHIA_BLOCKS);
    public static final Block HALORIUM_ORE = registerBlock("halorium_ore",
            new OreBlock(FabricBlockSettings.of(Material.STONE).strength(20f).requiresTool(),
                    UniformIntProvider.create(2, 6)), ModItemGroups.MALECHIA_BLOCKS);
    public static final Block DEEPSLATE_HALORIUM_ORE = registerBlock("deepslate_halorium_ore",
            new OreBlock(FabricBlockSettings.of(Material.STONE).strength(30f).requiresTool(),
                    UniformIntProvider.create(2, 6)), ModItemGroups.MALECHIA_BLOCKS);
    public static final Block LITRIUM_ORE = registerBlock("litrium_ore",
            new OreBlock(FabricBlockSettings.of(Material.STONE).strength(20f).requiresTool(),
                    UniformIntProvider.create(2, 6)), ModItemGroups.MALECHIA_BLOCKS);
    public static final Block DEEPSLATE_LITRIUM_ORE = registerBlock("deepslate_litrium_ore",
            new OreBlock(FabricBlockSettings.of(Material.STONE).strength(30f).requiresTool(),
                    UniformIntProvider.create(2, 6)), ModItemGroups.MALECHIA_BLOCKS);
    public static final Block ALLIAN_ORE = registerBlock("allian_ore",
            new OreBlock(FabricBlockSettings.of(Material.STONE).strength(20f).requiresTool(),
                    UniformIntProvider.create(6, 10)), ModItemGroups.MALECHIA_BLOCKS);
    public static final Block DEEPSLATE_ALLIAN_ORE = registerBlock("deepslate_allian_ore",
            new OreBlock(FabricBlockSettings.of(Material.STONE).strength(30f).requiresTool(),
                    UniformIntProvider.create(6, 10)), ModItemGroups.MALECHIA_BLOCKS);
    public static final Block MALECHIA_BLOCK = registerBlock("malechia_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(100f).requiresTool().luminance(15)), ModItemGroups.MALECHIA_BLOCKS);
    public static final Block BOSS_ESSENCE_IRON_BLOCK = registerBlock("boss_essence_iron_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(50f).requiresTool().luminance(4)), ModItemGroups.MALECHIA_BLOCKS);

    private static Block registerBlock(String name, Block block, ItemGroup group) {
        registerBlockItem(name, block, group);
        return Registry.register(Registry.BLOCK, new Identifier(MalechiaMod.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup group) {
        return Registry.register(Registry.ITEM, new Identifier(MalechiaMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(group)));
    }

    public static void registerModBlocks() {
        MalechiaMod.LOGGER.info("registering mod blocks for " + MalechiaMod.MOD_ID);
    }

}
