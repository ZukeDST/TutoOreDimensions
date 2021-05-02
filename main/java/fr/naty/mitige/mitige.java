package fr.naty.mitige;

import fr.naty.mitige.blocks.MitigeBlocks;
import fr.naty.mitige.init.ModFeatures;
import fr.naty.mitige.items.MitigeItems;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(mitige.MODID)
public class mitige {

	public static final String MODID = "mitige";
	
	public mitige() 
	{	
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::clientSetup);
		
		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
		MitigeBlocks.BLOCKS.register(bus);
	}	
	private void setup(FMLCommonSetupEvent e)
	{
        ModFeatures features = new ModFeatures();
        features.init();
        MinecraftForge.EVENT_BUS.register(features);			
	}
		private void clientSetup(FMLClientSetupEvent e)
	{	
	}
}
