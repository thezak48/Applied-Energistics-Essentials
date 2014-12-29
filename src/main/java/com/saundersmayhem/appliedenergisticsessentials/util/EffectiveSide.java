package com.saundersmayhem.appliedenergisticsessentials.util;

import cpw.mods.fml.common.FMLCommonHandler;

/**
 * Created by thezak48 on 29/12/2014.
 */

public final class EffectiveSide
{
    /**
     * Cache the handler
     */
    private static FMLCommonHandler FCH = FMLCommonHandler.instance();

    /**
     * True if the thread executing this code is client side.
     *
     * @return
     */
    public static final boolean isClientSide()
    {
        return EffectiveSide.FCH.getEffectiveSide().isClient();
    }

    /**
     * True if the thread executing this code is server side.
     *
     * @return
     */
    public static final boolean isServerSide()
    {
        return EffectiveSide.FCH.getEffectiveSide().isServer();
    }
}