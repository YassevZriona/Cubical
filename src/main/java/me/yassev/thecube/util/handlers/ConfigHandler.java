package me.yassev.thecube.util.handlers;

import me.yassev.thecube.Cubical;
import me.yassev.thecube.util.refer.Reference;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import java.io.File;

public class ConfigHandler {
    public static Configuration config;
    public static void init(File file) {
        config = new Configuration(file);
        String category;
    }

    public static void registerConfig(FMLPreInitializationEvent event) {
        Cubical.config = new File(event.getModConfigurationDirectory() + "/" + Reference.MODID);
        Cubical.config.mkdirs();
        init(new File(Cubical.config.getPath(), Reference.MODID + ".cfg"));
    }
}
