package com.saundersmayhem.appliedenergisticsessentials.util;

import net.minecraft.inventory.IInventory;

/**
 * Created by thezak48 on 29/12/2014.
 */

public interface IInventoryUpdateReceiver
{
    public void onInventoryChanged( IInventory sourceInventory );
}