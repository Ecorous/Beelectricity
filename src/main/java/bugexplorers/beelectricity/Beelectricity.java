package bugexplorers.beelectricity;

import bugexplorers.beelectricity.registries.BeelectricityBlockEntities;
import bugexplorers.beelectricity.registries.BeelectricityBlocks;
import bugexplorers.beelectricity.registries.BeelectricityEntities;
import bugexplorers.beelectricity.registries.BeelectricityItems;
import net.fabricmc.api.ModInitializer;
import net.minecraft.util.Identifier;

public final class Beelectricity implements ModInitializer {
    private static final String MOD_ID = "beelectricity";

    @Override
    public final void onInitialize() {

        BeelectricityBlocks.register();
        BeelectricityBlockEntities.register();
        BeelectricityEntities.register();
        BeelectricityItems.register();
    }

    /**
     * @param path Asset/Data directory, or Object Name.
     * @return a new Instance of Identifier with the Beelectricity Modid
     */
    public static Identifier createId(String path) {
        return new Identifier(MOD_ID, path);
    }
}
