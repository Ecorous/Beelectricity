package bugexplorers.beelectricity.registries;

import bugexplorers.beelectricity.Beelectricity;
import bugexplorers.beelectricity.blocks.CrystalHoneyBlock;
import bugexplorers.beelectricity.entities.BeelectricityItemGroups;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public interface BeelectricityBlocks {

    Block HORNET_HIVE_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).hardness(4.0f));
    CrystalHoneyBlock CRYSTALLIZED_HONEY_BLOCK = new CrystalHoneyBlock(FabricBlockSettings.of(Material.METAL).hardness(4.0f));
    static void registerBlocks() {
        Registry.register(Registry.BLOCK, new Identifier(Beelectricity.ID, "hornet_hive_block"), HORNET_HIVE_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(Beelectricity.ID, "hornet_hive_block"), new BlockItem(HORNET_HIVE_BLOCK, new Item.Settings().group(BeelectricityItemGroups.GROUP_1)));
        Registry.register(Registry.BLOCK, new Identifier(Beelectricity.ID, "crystallized_honey_block"), CRYSTALLIZED_HONEY_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(Beelectricity.ID, "crystallized_honey_block"), new BlockItem(CRYSTALLIZED_HONEY_BLOCK, new Item.Settings().group(BeelectricityItemGroups.GROUP_1)));

    }
    static <T extends Block> T putBlock(String name, T block) {
        return Registry.register(Registry.BLOCK, Beelectricity.createId(name), block);
    }
}
