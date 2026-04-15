package com.modifold;

import com.hypixel.hytale.server.core.plugin.JavaPlugin;
import com.hypixel.hytale.server.core.plugin.JavaPluginInit;

import javax.annotation.Nonnull;

public class Main extends JavaPlugin {
    public Main(@Nonnull JavaPluginInit init) {
        super(init);
    }

    @Override
    protected void setup() {
        super.setup();
        new ModifoldAnalytics("optimized-somehow", "1.0.0");
    }

    @Override
    protected void shutdown() {
        super.shutdown();
    }
}