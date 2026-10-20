package com.serilum.huskspawn.config;

import com.natamus.collective.config.DuskConfig;
import com.serilum.huskspawn.util.Reference;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class ConfigHandler extends DuskConfig {
	public static HashMap<String, List<String>> configMetaData = new HashMap<String, List<String>>();

	@Entry(min = 0, max = 1.0) public static double chanceZombieIsHusk = 0.15;
	@Entry public static boolean onlySpawnHusksOnSurface = false;
	@Entry(registry = "dimension") public static String dimensionsToSpawnIn = "";
	@Entry(registry = "worldgen/biome") public static String biomesToSpawnIn = "";

	public static void initConfig() {
		configMetaData.put("chanceZombieIsHusk", Arrays.asList(
			"The chance a zombie that has spawned is of the husk variant."
		));
		configMetaData.put("onlySpawnHusksOnSurface", Arrays.asList(
			"When enabled, husks will only spawn on the surface."
		));
		configMetaData.put("dimensionsToSpawnIn", Arrays.asList(
			"Dimensions in which zombies can turn into husks, separated by a comma. Leave empty for every dimension. For example: 'minecraft:overworld,minecraft:the_nether'."
		));
		configMetaData.put("biomesToSpawnIn", Arrays.asList(
			"Biomes in which zombies can turn into husks, separated by a comma. Biome tags work too, starting with a '#'. Leave empty for every biome. For example: 'minecraft:desert,#minecraft:is_badlands'."
		));

		DuskConfig.init(Reference.NAME, Reference.MOD_ID, ConfigHandler.class);
	}
}