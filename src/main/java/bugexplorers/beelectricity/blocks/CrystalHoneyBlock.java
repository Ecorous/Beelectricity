package bugexplorers.beelectricity.blocks;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Material;


public class CrystalHoneyBlock extends Block
{

    public CrystalHoneyBlock(FabricBlockSettings hardness) {
        super(AbstractBlock.Settings.of(Material.STONE).nonOpaque());
    }
}
