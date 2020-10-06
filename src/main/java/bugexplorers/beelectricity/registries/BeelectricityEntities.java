package bugexplorers.beelectricity.registries;

import bugexplorers.beelectricity.Beelectricity;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.util.registry.Registry;

public class BeelectricityEntities {

    private BeelectricityEntities() {
    }

    public static void registerEntities() {

    }

    private static void putEntityType(String name, EntityType<? extends Entity> type) {
        Registry.register(Registry.ENTITY_TYPE, Beelectricity.createId(name), type);
    }
}
