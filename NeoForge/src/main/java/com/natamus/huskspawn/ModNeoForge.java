package com.natamus.huskspawn;

import com.natamus.collective.check.RegisterMod;
import com.natamus.huskspawn.neoforge.config.IntegrateNeoForgeConfig;
import com.natamus.huskspawn.util.Reference;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModLoadingContext;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLLoadCompleteEvent;
import net.neoforged.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Reference.MOD_ID)
public class ModNeoForge {
	
	public ModNeoForge(IEventBus modEventBus) {
		modEventBus.addListener(this::loadComplete);

		setGlobalConstants();
		ModCommon.init();

		IntegrateNeoForgeConfig.registerScreen(ModLoadingContext.get());

		RegisterMod.register(Reference.NAME, Reference.MOD_ID, Reference.VERSION, Reference.ACCEPTED_VERSIONS);
	}

	private void loadComplete(final FMLLoadCompleteEvent event) {

	}

	private static void setGlobalConstants() {

	}
}