package bugexplorers.beelectricity.registries;

import bugexplorers.beelectricity.Beelectricity;
import net.minecraft.item.Item;
import net.minecraft.util.registry.Registry;

public class BeelectricityItems {

    private BeelectricityItems() {
    }

    public static void registerItems() {

    }

    private static void putItem(String name, Item item) {
        Registry.register(Registry.ITEM, Beelectricity.createId(name), item);
    }
}
