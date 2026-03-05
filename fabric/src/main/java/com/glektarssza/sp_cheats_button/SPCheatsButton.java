package com.glektarssza.sp_cheats_button;

import net.fabricmc.api.ModInitializer;

public class SPCheatsButton implements ModInitializer {
    @Override
    public void onInitialize() {
        Constants.LOG.info("Hello Fabric world!");
        CommonClass.init();
    }
}
