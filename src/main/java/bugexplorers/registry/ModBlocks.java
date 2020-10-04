package bugexplorers.registry;

public class ModBlocks
{
  public static final Block NETHER_HIVE_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).hardness(4.0f));
  
  public static final Block CRYSTALIZED_HONEY_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).hardness(4.0f));
  
  
  
    public static void RegisterBlocks()
    {
     Registry.register(Registry.BLOCK, new Identifier(Beelectricity.ID, "nether_hive"), NETHER_HIVE_BLOCK);
     
     Registry.register(Registry.BLOCK, new Identifier(Beelectricity, "crystallized_honey_block"), CRYSTALIZED_HONEY_BLOCK);
     
     Registry.register(Registry.ITEM, new Identifier(Beelectricity.ID, "crystallized_honey_block"), new BlockItem(CRYSTALLIZED_HONEY_BLOCK, new Item.Settings().group(ItemGroup.MISC)));

     Registry.register(Registry.ITEM, new Identifier(Beelectricity.ID, "nether_hive"), new BlockItem(NETHER_HIVE_BLOCK, new Item.Settings().group(ItemGroup.MISC)));

    }
}
