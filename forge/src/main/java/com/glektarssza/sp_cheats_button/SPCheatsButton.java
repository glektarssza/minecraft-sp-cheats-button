package com.glektarssza.sp_cheats_button;

import net.minecraftforge.fml.common.Mod;

@Mod(Constants.MOD_ID)
public class SPCheatsButton {
    public SPCheatsButton() {
        Constants.LOG.info("Hello Forge world!");
        CommonClass.init();

    }
}
