package bugexplorers.beelectricity.registries;

import bugexplorers.beelectricity.Beelectricity;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.util.registry.Registry;

public class BeelectricityBlockEntities {

    private BeelectricityBlockEntities() {
    }

    public static void registerBlockEntities() {

    }

    private static void putBlockEntityType(String name, BlockEntityType<? extends BlockEntity> type) {
        Registry.register(Registry.BLOCK_ENTITY_TYPE, Beelectricity.createId(name), type);
    }
}
