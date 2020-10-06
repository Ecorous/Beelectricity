package bugexplorers.beelectricity.registries;

import bugexplorers.beelectricity.Beelectricity;
import bugexplorers.beelectricity.blocks.CrystalHoneyBlock;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class BeelectricityBlocks {

    public static final Block HORNET_HIVE_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).hardness(4.0f));
    public static final CrystalHoneyBlock CRYSTALLIZED_HONEY_BLOCK = new CrystalHoneyBlock(FabricBlockSettings.of(Material.METAL).hardness(4.0f));

    private BeelectricityBlocks() {
    }

    public static void registerBlocks() {
        putBlock("hornet_hive_block", HORNET_HIVE_BLOCK);
        putBlockItem("hornet_hive_block", HORNET_HIVE_BLOCK);

        putBlock("crystallized_honey_block", CRYSTALLIZED_HONEY_BLOCK);
        putBlockItem("crystallized_honey_block", CRYSTALLIZED_HONEY_BLOCK);
    }

    private static void putBlock(String name, Block block) {
        Registry.register(Registry.BLOCK, Beelectricity.createId(name), block);
    }

    private static void putBlockItem(String name, Block block) {
        Registry.register(Registry.ITEM, Beelectricity.createId(name), new BlockItem(block, new Item.Settings().group(BeelectricityItemGroups.GROUP_1)));
    }
}
