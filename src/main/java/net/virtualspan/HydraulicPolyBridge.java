package net.virtualspan;

import net.fabricmc.api.DedicatedServerModInitializer;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerLifecycleEvents;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.server.MinecraftServer;
import net.virtualspan.polymc.FloodgateTracker;
import net.virtualspan.polymc.FloodgatePolyMapHandler;

/**
 * Main mod initializer. Registers Floodgate tracking and PolyMap handler
 * when the dedicated server starts.
 */
public class HydraulicPolyBridge implements DedicatedServerModInitializer {
    @Override
    public void onInitializeServer() {
        // Track Floodgate players early
        FloodgateTracker.register();

        // Hook PolyMapProvider once the server has started, but only if PolyMC is present
        ServerLifecycleEvents.SERVER_STARTED.register((MinecraftServer server) -> {
            if (FabricLoader.getInstance().isModLoaded("polymc")) {
                FloodgatePolyMapHandler.register(server);
            }
        });
    }
}
