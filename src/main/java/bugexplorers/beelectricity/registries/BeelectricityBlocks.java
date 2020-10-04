package bugexplorers.beelectricity.registries;

import bugexplorers.beelectricity.Beelectricity;
import net.minecraft.block.Block;
import net.minecraft.util.registry.Registry;

public interface BeelectricityBlocks {

    static void registerBlocks() {

    }

    static <T extends Block> T putBlock(String name, T block) {
        return Registry.register(Registry.BLOCK, Beelectricity.createId(name), block);
    }
}
