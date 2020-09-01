package com.example.soeoeoe;

import net.minecraft.creativetab.CreativeTabs;
import com.example.soeoeoe.utils.handlers.Settings;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

import com.example.soeoeoe.init.BlockInit;
import com.example.soeoeoe.init.Recipes;
import com.example.soeoeoe.proxy.CommonProxy;


@Mod(modid = Settings.MODID, name = Settings.NAME, version = Settings.VERSION)
public class Soeoeoe {
    private static Logger logger;
    
	@Instance
	public static Soeoeoe instance;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        logger = event.getModLog();
    }
    
    @EventHandler
    public static void init(FMLInitializationEvent event) {
    	Recipes.init();
    }
    
	@SidedProxy(clientSide = Settings.CLIENT_PROXY_CLASS, serverSide = Settings.COMMON_PROXY_CLASS)
	public static CommonProxy proxy;
    
	
    public static final CreativeTabs TAB = (new CreativeTabs("Soeoe") {
		
		@Override
		public ItemStack getTabIconItem() {
			return new ItemStack(BlockInit.BRAVIN_BLOCK);
		}
	});
	
	@EventHandler
	public static void Postinit(FMLPostInitializationEvent event) {

	}
}
