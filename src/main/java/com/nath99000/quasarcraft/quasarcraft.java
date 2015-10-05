package com.nath99000.quasarcraft;

        import com.nath99000.quasarcraft.EventHandler.OnCraftEvent;
        import com.nath99000.quasarcraft.EventHandler.OnMineEvent;
        import com.nath99000.quasarcraft.block.TileEntity.TileEntityStatue;
        import com.nath99000.quasarcraft.config.ConfigHandler;
        import com.nath99000.quasarcraft.entity.ModEntity;
        import com.nath99000.quasarcraft.init.*;
        import com.nath99000.quasarcraft.proxy.RenderProxies.*;
        import com.nath99000.quasarcraft.proxy.Iproxy;
        import com.nath99000.quasarcraft.proxy.Commonproxy;
        import com.nath99000.quasarcraft.reference.Reference;
        import com.nath99000.quasarcraft.utility.LogHelper;
        import com.nath99000.quasarcraft.world.QCWorldGen;
        import cpw.mods.fml.common.FMLCommonHandler;
        import cpw.mods.fml.common.Mod;
        import cpw.mods.fml.common.SidedProxy;
        import cpw.mods.fml.common.event.FMLInitializationEvent;
        import cpw.mods.fml.common.event.FMLPostInitializationEvent;
        import cpw.mods.fml.common.event.FMLPreInitializationEvent;
        import cpw.mods.fml.common.registry.GameRegistry;
        import net.minecraft.item.ItemStack;
        import net.minecraft.stats.Achievement;
        import net.minecraftforge.common.AchievementPage;
        import net.minecraftforge.oredict.OreDictionary;

@Mod(modid = Reference.Id, name = Reference.Name, version = Reference.Version)
public class quasarcraft
{
            @Mod.Instance(Reference.Id)
    public static quasarcraft instance;

    @SidedProxy(clientSide = Reference.ClientProxy, serverSide = Reference.ServerProxy)
    public static Iproxy proxy;
    public static Commonproxy proxycommon;
    public static RServerProxy serverside;
    public static RClientProxy clientside;
    public static Achievement QCAUranium;
    public static Achievement QCAQuasar;


            @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
            {
                ConfigHandler.init(event.getSuggestedConfigurationFile());
                LogHelper.info("*Yaaaawn*");
                ModItems.init();
                ModBlocks.init();
                Recipes.init();
                ModTileEntity.init();
                ModEntity.init();
                EntityRender.init();
            }

            @Mod.EventHandler
    public void init(FMLInitializationEvent event)
            {
                GameRegistry.registerWorldGenerator(new QCWorldGen(), 1);
                LogHelper.info("I-i-i-i'm awake!!");
                //achievements
                QCAUranium = new Achievement("achievement.Uranium", "Uranium", 2 , 1, new ItemStack(ModItems.Uranium), QCAQuasar).registerStat();
                QCAQuasar = new Achievement("achievement.CraftQuasar", "CraftQuasar", 0, 0, ModItems.Quasar, (Achievement)null).initIndependentStat().registerStat();
                AchievementPage.registerAchievementPage(new AchievementPage("QuasarCraft", new Achievement[]{QCAUranium, QCAQuasar}));
                GameRegistry.registerTileEntity(TileEntityStatue.class, "TileEntityStatue");
                OreDictionary.registerOre("Uranium", ModItems.Uranium);
                OreDictionary.registerOre("materialRealiyThread", ModItems.Reality);
                OreDictionary.registerOre("itemQuasarWeak", ModItems.Quasar);
                OreDictionary.registerOre("itemQuasarMid", ModItems.QuasarMid);





                FMLCommonHandler.instance().bus().register(new OnMineEvent());
                FMLCommonHandler.instance().bus().register(new OnCraftEvent());
            }

            @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
            {
                LogHelper.info("Aaaaand I'm done!");
            }
        }
