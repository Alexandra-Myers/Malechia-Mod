package net.alexandra.malechia.block;

import net.alexandra.malechia.MalechiaMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {

    public static final Block DEEPSLATE_QUARITE_ORE = registerBlock("deepslate_quarite_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(30f).requiresTool()), ItemGroup.BUILDING_BLOCKS);
    public static final Block DEEPSLATE_MYCRONIUM_ORE = registerBlock("deepslate_mycronium_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(30f).requiresTool()), ItemGroup.BUILDING_BLOCKS);
    public static final Block DEEPSLATE_AURAUM_ORE = registerBlock("deepslate_auraum_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(30f).requiresTool()), ItemGroup.BUILDING_BLOCKS);
    public static final Block DEEPSLATE_LOCRONITE_ORE = registerBlock("deepslate_locronite_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(30f).requiresTool()), ItemGroup.BUILDING_BLOCKS);
    public static final Block DEEPSLATE_ALOTIC_ORE = registerBlock("deepslate_alotic_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(30f).requiresTool()), ItemGroup.BUILDING_BLOCKS);
    public static final Block DEEPSLATE_ERETH_ORE = registerBlock("deepslate_ereth_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(30f).requiresTool()), ItemGroup.BUILDING_BLOCKS);
    public static final Block DEEPSLATE_CHRYON_ORE = registerBlock("deepslate_chryon_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(30f).requiresTool()), ItemGroup.BUILDING_BLOCKS);
    public static final Block DEEPSLATE_HALORIUM_ORE = registerBlock("deepslate_halorium_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(30f).requiresTool()), ItemGroup.BUILDING_BLOCKS);
    public static final Block DEEPSLATE_LITRIUM_ORE = registerBlock("deepslate_litrium_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(30f).requiresTool()), ItemGroup.BUILDING_BLOCKS);
    public static final Block DEEPSLATE_ALLIAN_ORE = registerBlock("deepslate_allian_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(30f).requiresTool()), ItemGroup.BUILDING_BLOCKS);
    public static final Block QUARITE_ORE = registerBlock("quarite_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(20f).requiresTool()), ItemGroup.BUILDING_BLOCKS);
    public static final Block MYCRONIUM_ORE = registerBlock("mycronium_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(20f).requiresTool()), ItemGroup.BUILDING_BLOCKS);
    public static final Block AURAUM_ORE = registerBlock("auraum_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(20f).requiresTool()), ItemGroup.BUILDING_BLOCKS);
    public static final Block LOCRONITE_ORE = registerBlock("locronite_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(20f).requiresTool()), ItemGroup.BUILDING_BLOCKS);
    public static final Block ALOTIC_ORE = registerBlock("alotic_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(20f).requiresTool()), ItemGroup.BUILDING_BLOCKS);
    public static final Block ERETH_ORE = registerBlock("ereth_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(20f).requiresTool()), ItemGroup.BUILDING_BLOCKS);
    public static final Block CHRYON_ORE = registerBlock("chryon_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(20f).requiresTool()), ItemGroup.BUILDING_BLOCKS);
    public static final Block HALORIUM_ORE = registerBlock("halorium_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(20f).requiresTool()), ItemGroup.BUILDING_BLOCKS);
    public static final Block LITRIUM_ORE = registerBlock("litrium_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(20f).requiresTool()), ItemGroup.BUILDING_BLOCKS);
    public static final Block ALLIAN_ORE = registerBlock("allian_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(20f).requiresTool()), ItemGroup.BUILDING_BLOCKS);
    public static final Block MALECHIA_BLOCK = registerBlock("malechia_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(100f).requiresTool().luminance(15)), ItemGroup.BUILDING_BLOCKS);
    public static final Block BOSS_ESSENCE_IRON_BLOCK = registerBlock("boss_essence_iron_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(50f).requiresTool().luminance(4)), ItemGroup.BUILDING_BLOCKS);

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
