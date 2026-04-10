package com.natamus.huskspawn;

import com.natamus.collective.objects.SAMObject;
import com.natamus.huskspawn.config.ConfigHandler;
import net.minecraft.world.entity.EntityType;

public class ModCommon {

	public static void init() {
		ConfigHandler.initConfig();
		load();
	}

	private static void load() {
		new SAMObject(EntityType.ZOMBIE, EntityType.HUSK, null, ConfigHandler.chanceZombieIsHusk, false, false, false);
	}
}