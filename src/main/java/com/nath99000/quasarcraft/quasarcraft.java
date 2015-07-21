package com.nath99000.quasarcraft;

        import com.nath99000.quasarcraft.config.ConfigHandler;
        import com.nath99000.quasarcraft.init.*;
        import com.nath99000.quasarcraft.proxy.Iproxy;
        import com.nath99000.quasarcraft.proxy.Commonproxy;
        import com.nath99000.quasarcraft.reference.Reference;
        import com.nath99000.quasarcraft.utility.LogHelper;
        import com.nath99000.quasarcraft.world.QCWorldGen;
        import cpw.mods.fml.common.Mod;
        import cpw.mods.fml.common.SidedProxy;
        import cpw.mods.fml.common.event.FMLInitializationEvent;
        import cpw.mods.fml.common.event.FMLPostInitializationEvent;
        import cpw.mods.fml.common.event.FMLPreInitializationEvent;
        import cpw.mods.fml.common.network.NetworkRegistry;
        import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = Reference.Id, name = Reference.Name, version = Reference.Version)
public class quasarcraft
{
            @Mod.Instance(Reference.Id)
    public static quasarcraft instance;

    @SidedProxy(clientSide = Reference.ClientProxy, serverSide = Reference.ServerProxy)
    public static Iproxy proxy;
    public static Commonproxy proxycommon;


            @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
            {
                ConfigHandler.init(event.getSuggestedConfigurationFile());
                LogHelper.info("*Yaaaawn*");
                ModItems.init();
                ModBlocks.init();
                Recipes.init();
                ModTileEntity.init();


            }

            @Mod.EventHandler
    public void init(FMLInitializationEvent event)
            {
                GameRegistry.registerWorldGenerator(new QCWorldGen(), 1);
                LogHelper.info("I-i-i-i'm awake!!");
            }

            @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
            {
                LogHelper.info("Aaaaand I'm done!");
            }
        }
