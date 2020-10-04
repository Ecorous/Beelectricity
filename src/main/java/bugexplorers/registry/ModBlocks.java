package bugexplorers.registry;

import bugexplorers.Beelectricity;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks
{
  public static final Block NETHER_HIVE_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).hardness(4.0f));
  
  public static final Block CRYSTALIZED_HONEY_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).hardness(4.0f));
  
  
  
    public static void RegisterBlocks()
    {
     Registry.register(Registry.BLOCK, new Identifier(Beelectricity.ID, "nether_hive"), NETHER_HIVE_BLOCK);
     
     Registry.register(Registry.BLOCK, new Identifier(Beelectricity.ID, "crystallized_honey_block"), CRYSTALIZED_HONEY_BLOCK);
     
     Registry.register(Registry.ITEM, new Identifier(Beelectricity.ID, "crystallized_honey_block"), new BlockItem(CRYSTALIZED_HONEY_BLOCK, new Item.Settings().group(ItemGroup.MISC)));

     Registry.register(Registry.ITEM, new Identifier(Beelectricity.ID, "nether_hive"), new BlockItem(NETHER_HIVE_BLOCK, new Item.Settings().group(ItemGroup.MISC)));

    }
}
