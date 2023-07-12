package com.myname.mymodid;

import java.io.File;

import net.minecraftforge.common.config.Configuration;


var greeting = "Hello World"

fun synchronizeConfiguration(configFile: File) {
    val configuration = Configuration(configFile);

    greeting = configuration.getString("greeting", Configuration.CATEGORY_GENERAL, greeting, "How shall I greet?");

    if (configuration.hasChanged()) {
        configuration.save();
    }
}
