package com.nath99000.quasarcraft;

        import com.nath99000.quasarcraft.config.ConfigHandler;
        import com.nath99000.quasarcraft.init.ModBlocks;
        import com.nath99000.quasarcraft.init.ModItems;
        import com.nath99000.quasarcraft.init.Recipes;
        import com.nath99000.quasarcraft.proxy.Iproxy;
        import com.nath99000.quasarcraft.reference.Reference;
        import com.nath99000.quasarcraft.utility.LogHelper;
        import cpw.mods.fml.common.Mod;
        import cpw.mods.fml.common.SidedProxy;
        import cpw.mods.fml.common.event.FMLInitializationEvent;
        import cpw.mods.fml.common.event.FMLPostInitializationEvent;
        import cpw.mods.fml.common.event.FMLPreInitializationEvent;

        @Mod(modid = Reference.Id, name = Reference.Name, version = Reference.Version)
public class quasarcraft
{
            @Mod.Instance(Reference.Id)
    public static quasarcraft instance;

    @SidedProxy(clientSide = Reference.ClientProxy, serverSide = Reference.ServerProxy)
    public static Iproxy proxy;

            @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
            {
                ConfigHandler.init(event.getSuggestedConfigurationFile());
                LogHelper.info("*Yaaaawn*");
                ModItems.init();
                ModBlocks.init();
                Recipes.init();

            }

            @Mod.EventHandler
    public void init(FMLInitializationEvent event)
            {
                LogHelper.info("I-i-i-i'm awake!!");
            }

            @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
            {
                LogHelper.info("Aaaaand I'm done!");
            }
        }
