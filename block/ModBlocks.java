package com.xSowl.betterrings.block;

import com.xSowl.betterrings.block.blocks.GhostLight;
import com.xSowl.betterrings.block.blocks.RingMaterialOreEnd;
import com.xSowl.betterrings.block.blocks.RingMaterialOreNether;
import com.xSowl.betterrings.block.blocks.RingMaterialOreOverworld;
import com.xSowl.betterrings.block.init.BTTRBlock;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;

public class ModBlocks {

	public static Block ring_material_ore_overworld;
	public static Block ring_material_ore_nether;
	public static Block ring_material_ore_end;
	public static BTTRBlock ghost_light;
	
	public static final int alloySmelterID = 0;
	
	public static final int guiIDRingCrafter = 1;
	
	public static void init() {
		ring_material_ore_overworld = new RingMaterialOreOverworld();
		ring_material_ore_nether = new RingMaterialOreNether();
		ring_material_ore_end = new RingMaterialOreEnd();
	    ghost_light = new GhostLight();
	}
	
	public static void registerBlocks() {
//		GameRegistry.registerBlock(ring_material_ore_overworld, "ring_material_ore_overworld");
//		GameRegistry.registerBlock(ring_material_ore_nether, "ring_material_ore_nether");
//		GameRegistry.registerBlock(ring_material_ore_end, "ring_material_ore_end");
		GameRegistry.registerBlock(ghost_light, "ghost_light");
	}
	
	public static void registerBlockOre() {
		
	}
	
}
