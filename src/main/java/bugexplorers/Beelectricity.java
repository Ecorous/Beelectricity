package bugexplorers;

import bugexplorers.registry.ModBlocks;
import bugexplorers.registry.ModItems;
import net.fabricmc.api.ModInitializer;

public class Beelectricity implements ModInitializer
{
    @Override
    public void onInitialize() {
        ModItems.RegisterItems();
        ModBlocks.RegisterBlocks();

    }
    
    public static String ID = "beelectricity";
}
