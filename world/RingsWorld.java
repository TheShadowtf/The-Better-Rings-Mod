package com.xSowl.betterrings.world;

import com.xSowl.betterrings.world.gen.WorldGenRing;

import cpw.mods.fml.common.IWorldGenerator;
import cpw.mods.fml.common.registry.GameRegistry;

public class RingsWorld {

	public static void mainRegistry() {
		initWorldGen();
	}
	
	public static void initWorldGen() {
		registerWorldGen(new WorldGenRing(), 1);
	}
	
	public static void registerWorldGen(IWorldGenerator worldGenClass, int weight) {
		GameRegistry.registerWorldGenerator(worldGenClass, weight);
	}
	
}
