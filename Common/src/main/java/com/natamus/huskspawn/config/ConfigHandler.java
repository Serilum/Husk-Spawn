package com.natamus.huskspawn.config;

import com.natamus.collective.config.DuskConfig;
import com.natamus.huskspawn.util.Reference;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class ConfigHandler extends DuskConfig {
	public static HashMap<String, List<String>> configMetaData = new HashMap<String, List<String>>();

	@Entry(min = 0, max = 1.0) public static double chanceZombieIsHusk = 0.15;

	public static void initConfig() {
		configMetaData.put("chanceZombieIsHusk", Arrays.asList(
			"The chance a zombie that has spawned is of the husk variant."
		));

		DuskConfig.init(Reference.NAME, Reference.MOD_ID, ConfigHandler.class);
	}
}