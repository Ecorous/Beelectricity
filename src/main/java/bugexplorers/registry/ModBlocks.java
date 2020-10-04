package bugexplorers.registry;

public class ModBlocks
{
  public static final Block NETHER_HIVE_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).hardness(4.0f));
    public static void RegisterBlocks()
    {
     Registry.register(Registry.BLOCK, new Identifier(Beelectricity.ID, "nether_hive"), NETHER_HIVE_BLOCK);
    }
}
