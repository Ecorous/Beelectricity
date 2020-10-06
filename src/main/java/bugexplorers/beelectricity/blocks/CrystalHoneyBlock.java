package bugexplorers.beelectricity.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.Material;


public class CrystalHoneyBlock extends Block {

    public CrystalHoneyBlock() {
        this(Settings.of(Material.STONE).nonOpaque());
    }

    public CrystalHoneyBlock(Settings settings) {
        super(settings);
    }
}
