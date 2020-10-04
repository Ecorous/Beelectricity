package bugexplorers.beelectricity.registries;

import bugexplorers.beelectricity.Beelectricity;
import net.minecraft.item.Item;
import net.minecraft.util.registry.Registry;

public interface BeelectricityItems {

    static void registerItems() {

    }

    static <T extends Item> T putItem(String name, T item) {
        return Registry.register(Registry.ITEM, Beelectricity.createId(name), item);
    }
}
