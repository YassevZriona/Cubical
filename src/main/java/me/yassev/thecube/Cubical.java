package me.yassev.thecube;

import me.yassev.thecube.proxy.CommonProxy;
import me.yassev.thecube.util.refer.Reference;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

import java.io.File;


@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION)
public class Cubical {
    private static Logger logger;
    public static File config;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        logger = event.getModLog();
    }
    @EventHandler
    public void init(FMLInitializationEvent event) {}
    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {}

    @SidedProxy(clientSide = "me.yassev.thecube.proxy.ClientProxy", serverSide = "me.yassev.thecube.proxy.CommonProxy")
    public static CommonProxy proxy;
}
