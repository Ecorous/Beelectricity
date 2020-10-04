package bugexplorers.beelectricity;

import net.fabricmc.api.ModInitializer;
import net.minecraft.util.Identifier;

public final class Beelectricity implements ModInitializer {
    private static final String MOD_ID = "beelectricity";

    @Override
    public final void onInitialize() {
    }

    /**
     * @param path Asset/Data directory, or Object Name.
     * @return a new Instance of Identifier with the Beelectricity Modid
     */
    public static Identifier createId(String path) {
        return new Identifier(MOD_ID, path);
    }
}
