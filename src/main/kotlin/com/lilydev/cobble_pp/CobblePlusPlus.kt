package com.lilydev.cobble_pp

import net.fabricmc.api.ModInitializer
import org.slf4j.Logger
import org.slf4j.LoggerFactory

object CobblePlusPlus : ModInitializer {

    const val MOD_ID: String = "cobble-pp"
    const val MOD_NAME: String = "Cobble++"

    @JvmField
    val LOGGER: Logger = LoggerFactory.getLogger(MOD_NAME)

    override fun onInitialize() {
        LOGGER.info("Hello Fabric world from $MOD_NAME")
    }
}