package bugexplorers.beelectricity;

import bugexplorers.beelectricity.registries.BeelectricityBlockEntities;
import bugexplorers.beelectricity.registries.BeelectricityBlocks;
import bugexplorers.beelectricity.registries.BeelectricityEntities;
import bugexplorers.beelectricity.registries.BeelectricityItems;
import net.fabricmc.api.ModInitializer;
import net.minecraft.util.Identifier;

public final class Beelectricity implements ModInitializer {
    public static final String MOD_ID = "beelectricity";

    @Override
    public final void onInitialize() {

        BeelectricityBlocks.registerBlocks();
        BeelectricityBlockEntities.registerBlockEntities();
        BeelectricityEntities.registerEntities();
        BeelectricityItems.registerItems();
    }

    public static Identifier createId(String path) {
        return new Identifier(MOD_ID, path);
    }
}
