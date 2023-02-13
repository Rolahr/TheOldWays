package net.rolahr.theoldways;

import net.rolahr.theoldways.registry.ModItems;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TheOldWays implements ModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger("oldways");

    public static final String MOD_ID = "oldways";

    @Override
    public void onInitialize() {
        ModItems.registerItems();
    }
}
