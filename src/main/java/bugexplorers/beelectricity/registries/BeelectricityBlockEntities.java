package bugexplorers.beelectricity.registries;

import bugexplorers.beelectricity.Beelectricity;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.util.registry.Registry;

public interface BeelectricityBlockEntities {

    static void registerBlockEntities() {

    }

    static <T extends BlockEntity> BlockEntityType<T> putBlockEntityType(String name, BlockEntityType<T> type) {
        return Registry.register(Registry.BLOCK_ENTITY_TYPE, Beelectricity.createId(name), type);
    }
}
