package com.saundersmayhem.thaumicAE.creativetab;

import com.saundersmayhem.thaumicAE.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * Created by thezak48 on 28/12/2014.
 */

public class CreativeTab
{
    public static final CreativeTabs TAE_TAB = new CreativeTabs(Reference.MOD_ID)
    {
        @Override
        public Item getTabIconItem()
        {
            return null;
        }
    };
}
