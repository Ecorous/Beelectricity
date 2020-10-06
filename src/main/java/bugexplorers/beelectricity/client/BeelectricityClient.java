package bugexplorers.beelectricity.client;


import bugexplorers.beelectricity.registries.BeelectricityBlocks;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;

import static net.minecraft.client.render.RenderLayer.getTranslucent;

public class BeelectricityClient implements ClientModInitializer {

        @Override
        public final void onInitializeClient() {

            BlockRenderLayerMap.INSTANCE.putBlock(
                    BeelectricityBlocks.CRYSTALLIZED_HONEY_BLOCK, RenderLayer.getTranslucent());
        }
    }

