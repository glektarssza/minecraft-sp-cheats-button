package com.glektarssza.sp_cheats_button;

import net.neoforged.fml.common.Mod;

@Mod(Constants.MOD_ID)
public class SPCheatsButton {
    public SPCheatsButton() {
        Constants.LOG.info("Hello NeoForge world!");
        CommonClass.init();
    }
}
