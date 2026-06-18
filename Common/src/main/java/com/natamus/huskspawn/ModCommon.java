package com.natamus.huskspawn;

import com.natamus.collective.objects.SAMObject;
import com.natamus.huskspawn.config.ConfigHandler;
import net.minecraft.world.entity.EntityTypes;

public class ModCommon {

	public static void init() {
		ConfigHandler.initConfig();
		load();
	}

	private static void load() {
		new SAMObject(EntityTypes.ZOMBIE, EntityTypes.HUSK, null, ConfigHandler.chanceZombieIsHusk, false, false, false);
	}
}