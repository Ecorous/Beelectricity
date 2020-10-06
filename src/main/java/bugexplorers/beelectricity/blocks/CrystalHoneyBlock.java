package bugexplorers.beelectricity.blocks;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;


public class CrystalHoneyBlock extends ScaffoldingBlock
{

    public CrystalHoneyBlock(FabricBlockSettings hardness) {
        super(AbstractBlock.Settings.of(Material.STONE).nonOpaque());
    }
}
