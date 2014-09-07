package com.saundersmayhem.thaumicAE;

import com.saundersmayhem.thaumicAE.handler.ConfigurationHandler;
import com.saundersmayhem.thaumicAE.init.ModBlocks;
import com.saundersmayhem.thaumicAE.init.ModItems;
import com.saundersmayhem.thaumicAE.init.Recipes;
import com.saundersmayhem.thaumicAE.proxy.IProxy;
import com.saundersmayhem.thaumicAE.reference.Reference;
import com.saundersmayhem.thaumicAE.utility.LogHelper;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION, guiFactory = Reference.GUI_FACTORY_CLASS)
public class ThaumicAE
{
    @Mod.Instance(Reference.MOD_ID)
    public static ThaumicAE instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static IProxy proxy;
    
    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        ConfigurationHandler.init(event.getSuggestedConfigurationFile());
        FMLCommonHandler.instance().bus().register(new ConfigurationHandler());
        
        ModItems.init();
        
        ModBlocks.init();
        
        LogHelper.info("Pre Initialization Complete!");
        
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
    	
    	Recipes.init();
        
        LogHelper.info("Initialization Complete!");
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        LogHelper.info("Post Initialization Complete!");
    }
}