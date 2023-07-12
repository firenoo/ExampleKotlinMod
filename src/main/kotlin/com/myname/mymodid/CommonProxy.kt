package com.myname.mymodid;

import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;

open class CommonProxy {

    // preInit "Run before anything else. Read your config, create blocks, items, etc, and register them with the
    // GameRegistry." (Remove if not needed)
    open fun preInit(event: FMLPreInitializationEvent) {
        synchronizeConfiguration(event.getSuggestedConfigurationFile());

        MyMod.LOG.info(greeting);
        MyMod.LOG.info("I am " + Tags.MODNAME + " at version " + Tags.VERSION);
    }

    // load "Do your mod setup. Build whatever data structures you care about. Register recipes." (Remove if not needed)
    open fun init(event: FMLInitializationEvent) {}

    // postInit "Handle interaction with other mods, complete your setup based on this." (Remove if not needed)
    open fun postInit(event: FMLPostInitializationEvent) {}

    // register server commands in this event handler (Remove if not needed)
    open fun serverStarting(event: FMLServerStartingEvent) {}
}
