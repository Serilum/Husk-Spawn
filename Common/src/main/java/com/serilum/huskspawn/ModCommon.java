package com.serilum.huskspawn;

import com.natamus.collective.globalcallbacks.ConfigCallback;
import com.natamus.collective.objects.SAMObject;
import com.serilum.huskspawn.config.ConfigHandler;
import com.serilum.huskspawn.util.Reference;
import net.minecraft.world.entity.EntityType;

public class ModCommon {
	private static SAMObject samObject;

	public static void init() {
		ConfigHandler.initConfig();
		load();
	}

	private static void load() {
		samObject = new SAMObject(EntityType.ZOMBIE, EntityType.HUSK, null, ConfigHandler.chanceZombieIsHusk, false, false, ConfigHandler.onlySpawnHusksOnSurface, false, false, Integer.MAX_VALUE);
		samObject.dimensionIds = ConfigHandler.dimensionsToSpawnIn;
		samObject.biomeIds = ConfigHandler.biomesToSpawnIn;

		ConfigCallback.CONFIG_CHANGED.register((String modid) -> {
			if (!modid.equals(Reference.MOD_ID)) {
				return;
			}

			samObject.changeChance = ConfigHandler.chanceZombieIsHusk;
			samObject.onlyOnSurface = ConfigHandler.onlySpawnHusksOnSurface;
			samObject.dimensionIds = ConfigHandler.dimensionsToSpawnIn;
			samObject.biomeIds = ConfigHandler.biomesToSpawnIn;
		});
	}
}