package bugexplorers.beelectricity.registries;

import bugexplorers.beelectricity.Beelectricity;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.util.registry.Registry;

public interface BeelectricityEntities {

    static void registerEntities() {

    }

    static <T extends Entity> EntityType<T> putEntityType(String name, EntityType<T> type) {
        return Registry.register(Registry.ENTITY_TYPE, Beelectricity.createId(name), type);
    }
}
