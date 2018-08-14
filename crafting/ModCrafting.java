package com.xSowl.betterrings.crafting;

import com.xSowl.betterrings.item.ModItems;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class ModCrafting {

	public static void register() {
		// Items //
		GameRegistry.addRecipe(new ItemStack(ModItems.items_craft, 1, 1), new Object[] {
				"GGG", 
				"GFG", 
				"GGG", 
				'G', Items.gold_ingot, 'F', Items.feather 
		});
		
		GameRegistry.addRecipe(new ItemStack(ModItems.items_craft, 1, 0), new Object[] { 
				"GRG", 
				"DFD", 
				"GRG", 
				'R', Items.redstone, 'D', Items.diamond, 
				'W', new ItemStack(ModItems.items_craft, 1, 2),
				'G', new ItemStack(ModItems.items_craft, 1, 1)
		});
		
		GameRegistry.addRecipe(new ItemStack(ModItems.items_craft, 1, 2), new Object[] { 
				"F F", 
				" D ", 
				"GGG", 
				'F', new ItemStack(ModItems.items_craft, 1, 1), 'D', Items.diamond, 'G', Items.gold_ingot
		});
		
		GameRegistry.addRecipe(new ItemStack(ModItems.items_craft, 4, 3), new Object[] { 
				"  S", 
				" S ", 
				"E  ", 
				'E', Items.emerald, 'S', Items.stick
		});
		
		GameRegistry.addRecipe(new ItemStack(ModItems.items_craft, 4, 4), new Object[] { 
				"TTT", 
				"T T", 
				"TTT", 
				'T', Blocks.torch
		});
		
		GameRegistry.addRecipe(new ItemStack(ModItems.stuff_of_light), new Object[] { 
				" L ", 
				"S  ", 
				'L', new ItemStack(ModItems.items_craft, 1, 4), 'S', new ItemStack(ModItems.items_craft, 1, 3)
		});
		
		// Token //
		GameRegistry.addRecipe(new ItemStack(ModItems.token, 5, 0), new Object[] { 
				"NNN", 
				"NGN", 
				"NNN", 
				'N', Items.gold_nugget, 'G', Items.gold_ingot
		});
		
		GameRegistry.addRecipe(new ItemStack(ModItems.token, 2, 1), new Object[] { 
				" S ", 
				"STS", 
				" S ", 
				'S', Items.sugar, 'T', new ItemStack(ModItems.token, 1, 0)
		});
		
		GameRegistry.addRecipe(new ItemStack(ModItems.token, 2, 2), new Object[] { 
				" G ", 
				"GTG", 
				" G ", 
				'G', Items.golden_carrot, 'T', new ItemStack(ModItems.token, 1, 0)
		});
		
		GameRegistry.addRecipe(new ItemStack(ModItems.token, 2, 3), new Object[] { 
				" R ", 
				"RTR", 
				" R ", 
				'R', Items.rotten_flesh, 'T', new ItemStack(ModItems.token, 1, 0)
		});
		
		GameRegistry.addRecipe(new ItemStack(ModItems.token, 2, 4), new Object[] { 
				" F ", 
				"FTF", 
				" F ", 
				'F', Items.fermented_spider_eye, 'T', new ItemStack(ModItems.token, 1, 0)
		});
		
		GameRegistry.addRecipe(new ItemStack(ModItems.token, 2, 5), new Object[] { 
				" M ", 
				"MTM", 
				" M ", 
				'M', Items.magma_cream, 'T', new ItemStack(ModItems.token, 1, 0)
		});
		
		GameRegistry.addRecipe(new ItemStack(ModItems.token, 2, 6), new Object[] { 
				" S ", 
				"STS", 
				" S ", 
				'S', Items.iron_sword, 'T', new ItemStack(ModItems.token, 1, 0)
		});
		
		GameRegistry.addRecipe(new ItemStack(ModItems.token, 2, 7), new Object[] { 
				" P ", 
				"PTP", 
				" P ", 
				'P', Items.iron_pickaxe, 'T', new ItemStack(ModItems.token, 1, 0)
		});
		
		GameRegistry.addRecipe(new ItemStack(ModItems.token, 2, 8), new Object[] { 
				" B ", 
				"BTB", 
				" B ", 
				'B', Items.iron_boots, 'T', new ItemStack(ModItems.token, 1, 0)
		});
		
		GameRegistry.addRecipe(new ItemStack(ModItems.token, 4, 9), new Object[] { 
				" C ", 
				"CTC", 
				" C ", 
				'C', Items.iron_chestplate, 'T', new ItemStack(ModItems.token, 1, 0)
		});
		
		GameRegistry.addRecipe(new ItemStack(ModItems.token, 2, 10), new Object[] { 
				" P ",
				"PTP", 
				" P ", 
				'P', new ItemStack(Items.fish, 1, 3), 'T', new ItemStack(ModItems.token, 1, 0)
		});
		
		GameRegistry.addRecipe(new ItemStack(ModItems.token, 2, 11), new Object[] { 
				" G ", 
				"GTG", 
				" G ", 
				'G', Items.speckled_melon, 'T' , new ItemStack(ModItems.token, 1, 0)
		});
		
		GameRegistry.addRecipe(new ItemStack(ModItems.token, 2, 12), new Object[] { 
				" E ", 
				"ETE", 
				" E ", 
				'E', Items.spider_eye, 'T', new ItemStack(ModItems.token, 1, 0)
		});
		
		GameRegistry.addRecipe(new ItemStack(ModItems.token, 32, 13), new Object[] { 
				" W ", 
				"WTW", 
				" W ", 
				'W', new ItemStack(Items.skull, 1, 1), 'T', new ItemStack(ModItems.token, 1, 0)
		});
		
		// Rings //
		GameRegistry.addRecipe(new ItemStack(ModItems.angel_ring), new Object[] { 
				"WGW", 
				"DCD", 
				"ORO", 
				'W', new ItemStack(ModItems.items_craft, 1, 2),
				'G', new ItemStack(ModItems.items_craft, 1, 6),
				'C', new ItemStack(ModItems.items_craft, 1, 0),
				'R', ModItems.item_ring, 'D', Items.diamond, 'O', Items.gold_ingot
		});
		
		GameRegistry.addRecipe(new ItemStack(ModItems.speed_ring), new Object[] { 
				" T ", 
				" R ", 
				'T', new ItemStack(ModItems.token, 1, 1), 'R', ModItems.item_ring
		});
		
		GameRegistry.addRecipe(new ItemStack(ModItems.speed_ring), new Object[] { 
				"T  ", 
				"R  ", 
				'T', new ItemStack(ModItems.token, 1, 1), 'R', ModItems.item_ring
		});
		
		GameRegistry.addRecipe(new ItemStack(ModItems.speed_ring), new Object[] { 
				"  T", 
				"  R", 
				'T', new ItemStack(ModItems.token, 1, 1), 'R', ModItems.item_ring
		});
		
		GameRegistry.addRecipe(new ItemStack(ModItems.speed_ring_2), new Object[] { 
				" T ", 
				" RT", 
				'T', new ItemStack(ModItems.token, 1, 1), 'R', ModItems.item_ring
		});
		
		GameRegistry.addRecipe(new ItemStack(ModItems.speed_ring_2), new Object[] { 
				"T  ", 
				"RT ", 
				'T', new ItemStack(ModItems.token, 1, 1), 'R', ModItems.item_ring
		});
		
		GameRegistry.addRecipe(new ItemStack(ModItems.speed_ring_2), new Object[] { 
				"  T", 
				" RT", 
				'T', new ItemStack(ModItems.token, 1, 1), 'R', ModItems.item_ring
		});
		
		GameRegistry.addRecipe(new ItemStack(ModItems.speed_ring_3), new Object[] { 
				" T ", 
				" RT", 
				" T ", 
				'T', new ItemStack(ModItems.token, 1, 1), 'R', ModItems.item_ring
		});
		
		GameRegistry.addRecipe(new ItemStack(ModItems.speed_ring_3), new Object[] { 
				"T  ", 
				"RT ", 
				"T  ", 
				'T', new ItemStack(ModItems.token, 1, 1), 'R', ModItems.item_ring
		});
		
		GameRegistry.addRecipe(new ItemStack(ModItems.speed_ring_3), new Object[] { 
				"  T", 
				" RT", 
				"  T", 
				'T', new ItemStack(ModItems.token, 1, 1), 'R', ModItems.item_ring
		});
		
		GameRegistry.addRecipe(new ItemStack(ModItems.jump_ring), new Object[] { 
				" T ", 
				" R ", 
				'T', new ItemStack(ModItems.token, 1, 8), 'R', ModItems.item_ring
		});
		
		GameRegistry.addRecipe(new ItemStack(ModItems.jump_ring), new Object[] { 
				"T  ", 
				"R  ", 
				'T', new ItemStack(ModItems.token, 1, 8), 'R', ModItems.item_ring
		});
		
		GameRegistry.addRecipe(new ItemStack(ModItems.jump_ring), new Object[] { 
				"  T", 
				"  R", 
				'T', new ItemStack(ModItems.token, 1, 8), 'R', ModItems.item_ring
		});
		
		GameRegistry.addRecipe(new ItemStack(ModItems.jump_ring_2), new Object[] { 
				" T ", 
				" RT", 
				'T', new ItemStack(ModItems.token, 1, 8), 'R', ModItems.item_ring
		});
		
		GameRegistry.addRecipe(new ItemStack(ModItems.jump_ring_2), new Object[] { 
				"T  ", 
				"RT ", 
				'T', new ItemStack(ModItems.token, 1, 8), 'R', ModItems.item_ring
		});
		
		GameRegistry.addRecipe(new ItemStack(ModItems.jump_ring_2), new Object[] { 
				"  T", 
				" RT", 
				'T', new ItemStack(ModItems.token, 1, 8), 'R', ModItems.item_ring
		});
		
		GameRegistry.addRecipe(new ItemStack(ModItems.jump_ring_3), new Object[] { 
				" T ", 
				" RT", 
				" T ", 
				'T', new ItemStack(ModItems.token, 1, 8), 'R', ModItems.item_ring
		});
		
		GameRegistry.addRecipe(new ItemStack(ModItems.jump_ring_3), new Object[] { 
				"T  ", 
				"RT ", 
				"T  ", 
				'T', new ItemStack(ModItems.token, 1, 8), 'R', ModItems.item_ring
		});
		
		GameRegistry.addRecipe(new ItemStack(ModItems.jump_ring_3), new Object[] { 
				"  T", 
				" RT", 
				"  T", 
				'T', new ItemStack(ModItems.token, 1, 8), 'R', ModItems.item_ring
		});
		
		GameRegistry.addRecipe(new ItemStack(ModItems.fire_ring), new Object[] { 
				" T ", 
				" R ", 
				'T', new ItemStack(ModItems.token, 1, 5), 'R', ModItems.item_ring
		});
		
		GameRegistry.addRecipe(new ItemStack(ModItems.fire_ring), new Object[] { 
				"T  ", 
				"R  ", 
				'T', new ItemStack(ModItems.token, 1, 5), 'R', ModItems.item_ring
		});
		
		GameRegistry.addRecipe(new ItemStack(ModItems.fire_ring), new Object[] { 
				"  T", 
				"  R", 
				'T', new ItemStack(ModItems.token, 1, 5), 'R', ModItems.item_ring
		});
		
		GameRegistry.addRecipe(new ItemStack(ModItems.fire_ring_2), new Object[] { 
				" T ", 
				" RT", 
				'T', new ItemStack(ModItems.token, 1, 5), 'R', ModItems.item_ring
		});
		
		GameRegistry.addRecipe(new ItemStack(ModItems.fire_ring_2), new Object[] { 
				"T  ", 
				"RT ", 
				'T', new ItemStack(ModItems.token, 1, 5), 'R', ModItems.item_ring
		});
		
		GameRegistry.addRecipe(new ItemStack(ModItems.fire_ring_2), new Object[] { 
				"  T", 
				" RT", 
				'T', new ItemStack(ModItems.token, 1, 5), 'R', ModItems.item_ring
		});
		
		GameRegistry.addRecipe(new ItemStack(ModItems.fire_ring_3), new Object[] { 
				" T ", 
				" RT", 
				" T ", 
				'T', new ItemStack(ModItems.token, 1, 5), 'R', ModItems.item_ring
		});
		
		GameRegistry.addRecipe(new ItemStack(ModItems.fire_ring_3), new Object[] { 
				"T  ", 
				"RT ",
				"T  ", 
				'T', new ItemStack(ModItems.token, 1, 5), 'R', ModItems.item_ring
		});
		
		GameRegistry.addRecipe(new ItemStack(ModItems.fire_ring_3), new Object[] { 
				"  T", 
				" RT", 
				"  T", 
				'T', new ItemStack(ModItems.token, 1, 5), 'R', ModItems.item_ring
		});
		
		GameRegistry.addRecipe(new ItemStack(ModItems.strength_ring), new Object[] { 
				" T ",
				" R ", 
				'T', new ItemStack(ModItems.token, 1, 6), 'R', ModItems.item_ring
		});
		
		GameRegistry.addRecipe(new ItemStack(ModItems.strength_ring), new Object[] { 
				"T  ", 
				"R  ", 
				'T', new ItemStack(ModItems.token, 1, 6), 'R', ModItems.item_ring
		});
		
		GameRegistry.addRecipe(new ItemStack(ModItems.strength_ring), new Object[] { 
				"  T", 
				"  R", 
				'T', new ItemStack(ModItems.token, 1, 6), 'R', ModItems.item_ring
		});
		
		GameRegistry.addRecipe(new ItemStack(ModItems.strength_ring_2), new Object[] { 
				" T ", 
				" RT", 
				'T', new ItemStack(ModItems.token, 1, 6), 'R', ModItems.item_ring
		});
		
		GameRegistry.addRecipe(new ItemStack(ModItems.strength_ring_2), new Object[] { 
				"T  ", 
				"RT ", 
				'T', new ItemStack(ModItems.token, 1, 6), 'R', ModItems.item_ring
		});
		
		GameRegistry.addRecipe(new ItemStack(ModItems.strength_ring_2), new Object[] { 
				"  T", 
				" RT", 
				'T', new ItemStack(ModItems.token, 1, 6), 'R', ModItems.item_ring
		});
		
		GameRegistry.addRecipe(new ItemStack(ModItems.strength_ring_3), new Object[] { 
				" T ", 
				" RT", 
				" T ", 
				'T', new ItemStack(ModItems.token, 1, 6), 'R', ModItems.item_ring
		});
		
		GameRegistry.addRecipe(new ItemStack(ModItems.strength_ring_3), new Object[] { 
				"T  ", 
				"RT ", 
				"T  ", 
				'T', new ItemStack(ModItems.token, 1, 6), 'R', ModItems.item_ring
		});
		
		GameRegistry.addRecipe(new ItemStack(ModItems.strength_ring_3), new Object[] { 
				"  T", 
				" RT", 
				"  T", 
				'T', new ItemStack(ModItems.token, 1, 6), 'R', ModItems.item_ring
		});
		
		GameRegistry.addRecipe(new ItemStack(ModItems.haste_ring), new Object[] {
				" T ", 
				" R ", 
				'T', new ItemStack(ModItems.token, 1, 7), 'R', ModItems.item_ring
		});
		
		GameRegistry.addRecipe(new ItemStack(ModItems.haste_ring), new Object[] { 
				"T  ", 
				"R  ", 
				'T', new ItemStack(ModItems.token, 1, 7), 'R', ModItems.item_ring
		});
		
		GameRegistry.addRecipe(new ItemStack(ModItems.haste_ring), new Object[] { 
				"  T", 
				"  R", 
				'T', new ItemStack(ModItems.token, 1, 7), 'R', ModItems.item_ring
		});
		
		GameRegistry.addRecipe(new ItemStack(ModItems.haste_ring_2), new Object[] { 
				" T ",
				" RT", 
				'T', new ItemStack(ModItems.token, 1, 7), 'R', ModItems.item_ring
		});
		
		GameRegistry.addRecipe(new ItemStack(ModItems.haste_ring_2), new Object[] { 
				"T  ", 
				"RT ", 
				'T', new ItemStack(ModItems.token, 1, 7), 'R', ModItems.item_ring
		});
		
		GameRegistry.addRecipe(new ItemStack(ModItems.haste_ring_2), new Object[] { 
				"  T",
				" RT",
				'T', new ItemStack(ModItems.token, 1, 7), 'R', ModItems.item_ring
		});
		
		GameRegistry.addRecipe(new ItemStack(ModItems.haste_ring_3), new Object[] { 
				" T ", 
				" RT", 
				" T ", 
				'T', new ItemStack(ModItems.token, 1, 7), 'R', ModItems.item_ring
		});
		
		GameRegistry.addRecipe(new ItemStack(ModItems.haste_ring_3), new Object[] { 
				"T  ", 
				"RT ", 
				"T  ", 
				'T', new ItemStack(ModItems.token, 1, 7), 'R', ModItems.item_ring
		});
		
		GameRegistry.addRecipe(new ItemStack(ModItems.haste_ring_3), new Object[] { 
				"  T", 
				" RT", 
				"  T", 
				'T', new ItemStack(ModItems.token, 1, 7), 'R', ModItems.item_ring
		});
		
		GameRegistry.addRecipe(new ItemStack(ModItems.night_vision_ring), new Object[] { 
				" T ",
				" R ",
				'T', new ItemStack(ModItems.token, 1, 2), 'R', ModItems.item_ring
		});
		
		GameRegistry.addRecipe(new ItemStack(ModItems.night_vision_ring), new Object[] { 
				"T  ",
				"R  ", 
				'T', new ItemStack(ModItems.token, 1, 2), 'R', ModItems.item_ring
		});
		
		GameRegistry.addRecipe(new ItemStack(ModItems.night_vision_ring), new Object[] { 
				"  T",
				"  R", 
				'T', new ItemStack(ModItems.token, 1, 2), 'R', ModItems.item_ring
		});
		
		GameRegistry.addRecipe(new ItemStack(ModItems.night_vision_ring_2), new Object[] { 
				" T ", 
				" RT", 
				'T', new ItemStack(ModItems.token, 1, 2), 'R', ModItems.item_ring
		});
		
		GameRegistry.addRecipe(new ItemStack(ModItems.night_vision_ring_2), new Object[] { 
				"T  ", 
				"RT ",
				'T', new ItemStack(ModItems.token, 1, 2), 'R', ModItems.item_ring
		});
		
		GameRegistry.addRecipe(new ItemStack(ModItems.night_vision_ring_2), new Object[] {
				"  T",
				" RT",
				'T', new ItemStack(ModItems.token, 1, 2), 'R', ModItems.item_ring
		});
		
		GameRegistry.addRecipe(new ItemStack(ModItems.night_vision_ring_3), new Object[] {
				" T ", 
				" RT", 
				" T ", 
				'T', new ItemStack(ModItems.token, 1, 2), 'R', ModItems.item_ring
		});
		
		GameRegistry.addRecipe(new ItemStack(ModItems.night_vision_ring_3), new Object[] { 
				"T  ",
				"RT ",
				"T  ", 
				'T', new ItemStack(ModItems.token, 1, 2), 'R', ModItems.item_ring
		});
		
		GameRegistry.addRecipe(new ItemStack(ModItems.night_vision_ring_3), new Object[] { 
				"  T",
				" RT", 
				"  T",
				'T', new ItemStack(ModItems.token, 1, 2), 'R', ModItems.item_ring
		});
		
		GameRegistry.addRecipe(new ItemStack(ModItems.resistance_ring), new Object[] { 
				" T ",
				" R ",
				'T', new ItemStack(ModItems.token, 1, 9), 'R', ModItems.item_ring
		});
		
		GameRegistry.addRecipe(new ItemStack(ModItems.resistance_ring), new Object[] { 
				"T  ",
				"R  ",
				'T', new ItemStack(ModItems.token, 1, 9), 'R', ModItems.item_ring
		});
		
		GameRegistry.addRecipe(new ItemStack(ModItems.resistance_ring), new Object[] { 
				"  T", 
				"  R", 
				'T', new ItemStack(ModItems.token, 1, 9), 'R', ModItems.item_ring
		});
		
		GameRegistry.addRecipe(new ItemStack(ModItems.resistance_ring_2), new Object[] {
				" T ",
				" RT", 
				'T', new ItemStack(ModItems.token, 1, 9), 'R', ModItems.item_ring
		});
		
		GameRegistry.addRecipe(new ItemStack(ModItems.resistance_ring_2), new Object[] { 
				"T  ",
				"RT ",
				'T', new ItemStack(ModItems.token, 1, 9), 'R', ModItems.item_ring
		});
		
		GameRegistry.addRecipe(new ItemStack(ModItems.resistance_ring_2), new Object[] { 
				"  T",
				" RT",
				'T', new ItemStack(ModItems.token, 1, 9), 'R', ModItems.item_ring
		});
		
		GameRegistry.addRecipe(new ItemStack(ModItems.resistance_ring_3), new Object[] {
				" T ", 
				" RT", 
				" T ", 
				'T', new ItemStack(ModItems.token, 1, 9), 'R', ModItems.item_ring
		});
		
		GameRegistry.addRecipe(new ItemStack(ModItems.resistance_ring_3), new Object[] {
				"T  ",
				"RT ", 
				"T  ",
				'T', new ItemStack(ModItems.token, 1, 9), 'R', ModItems.item_ring
		});
		
		GameRegistry.addRecipe(new ItemStack(ModItems.resistance_ring_3), new Object[] { 
				"  T",
				" RT", 
				"  T",
				'T', new ItemStack(ModItems.token, 1, 9), 'R', ModItems.item_ring
		});
		
		GameRegistry.addRecipe(new ItemStack(ModItems.breathing_ring), new Object[] {
				" T ", 
				" R ", 
				'T', new ItemStack(ModItems.token, 1, 10), 'R', ModItems.item_ring
		});
		
		GameRegistry.addRecipe(new ItemStack(ModItems.breathing_ring), new Object[] { 
				"T  ",
				"R  ", 
				'T', new ItemStack(ModItems.token, 1, 10), 'R', ModItems.item_ring
		});
		
		GameRegistry.addRecipe(new ItemStack(ModItems.breathing_ring), new Object[] {
				"  T",
				"  R", 
				'T', new ItemStack(ModItems.token, 1, 10), 'R', ModItems.item_ring
		});
		
		GameRegistry.addRecipe(new ItemStack(ModItems.breathing_ring_2), new Object[] { 
				" T ",
				" RT",
				'T', new ItemStack(ModItems.token, 1, 10), 'R', ModItems.item_ring
		});
		
		GameRegistry.addRecipe(new ItemStack(ModItems.breathing_ring_2), new Object[] { 
				"T  ",
				"RT ", 
				'T', new ItemStack(ModItems.token, 1, 10), 'R', ModItems.item_ring
		});
		
		GameRegistry.addRecipe(new ItemStack(ModItems.breathing_ring_2), new Object[] { 
				"  T",
				" RT", 
				'T', new ItemStack(ModItems.token, 1, 10), 'R', ModItems.item_ring
		});
		
		GameRegistry.addRecipe(new ItemStack(ModItems.breathing_ring_3), new Object[] { 
				" T ",
				" RT", 
				" T ",
				'T', new ItemStack(ModItems.token, 1, 10), 'R', ModItems.item_ring
		});
		
		GameRegistry.addRecipe(new ItemStack(ModItems.breathing_ring_3), new Object[] { 
				"T  ", 
				"RT ", 
				"T  ",
				'T', new ItemStack(ModItems.token, 1, 10), 'R', ModItems.item_ring
		});
		
		GameRegistry.addRecipe(new ItemStack(ModItems.breathing_ring_3), new Object[] {
				"  T", 
				" RT", 
				"  T",
				'T', new ItemStack(ModItems.token, 1, 10), 'R', ModItems.item_ring
		});
		
		GameRegistry.addRecipe(new ItemStack(ModItems.regeneration_ring), new Object[] { 
				" T ", 
				" R ", 
				'T', new ItemStack(ModItems.token, 1, 11), 'R', ModItems.item_ring
		});
		
		GameRegistry.addRecipe(new ItemStack(ModItems.regeneration_ring), new Object[] { 
				"T  ",
				"R  ", 
				'T', new ItemStack(ModItems.token, 1, 11), 'R', ModItems.item_ring
		});
		
		GameRegistry.addRecipe(new ItemStack(ModItems.regeneration_ring), new Object[] {
				"  T",
				"  R",
				'T', new ItemStack(ModItems.token, 1, 11), 'R', ModItems.item_ring
		});
		
		GameRegistry.addRecipe(new ItemStack(ModItems.regeneration_ring_2), new Object[] {
				" T ",
				" RT", 
				'T', new ItemStack(ModItems.token, 1, 11), 'R', ModItems.item_ring
		});
		
		GameRegistry.addRecipe(new ItemStack(ModItems.regeneration_ring_2), new Object[] {
				"T  ", 
				"RT ", 
				'T', new ItemStack(ModItems.token, 1, 11), 'R', ModItems.item_ring
		});
		
		GameRegistry.addRecipe(new ItemStack(ModItems.regeneration_ring_2), new Object[] { 
				"  T",
				" RT",
				'T', new ItemStack(ModItems.token, 1, 11), 'R', ModItems.item_ring
		});
		
		GameRegistry.addRecipe(new ItemStack(ModItems.regeneration_ring_3), new Object[] { 
				" T ",
				" RT", 
				" T ",
				'T', new ItemStack(ModItems.token, 1, 11), 'R', ModItems.item_ring
		});
		
		GameRegistry.addRecipe(new ItemStack(ModItems.regeneration_ring_3), new Object[] {
				"T  ", 
				"RT ",
				"T  ", 
				'T', new ItemStack(ModItems.token, 1, 11), 'R', ModItems.item_ring
		});
		
		GameRegistry.addRecipe(new ItemStack(ModItems.regeneration_ring_3), new Object[] { 
				"  T", 
				" RT",
				"  T",
				'T', new ItemStack(ModItems.token, 1, 11), 'R', ModItems.item_ring
		});
		
		GameRegistry.addRecipe(new ItemStack(ModItems.invisibility_ring), new Object[] {
				" T ",
				" R ", 
				'T', new ItemStack(ModItems.token, 1, 12), 'R', ModItems.item_ring
		});
		
		GameRegistry.addRecipe(new ItemStack(ModItems.invisibility_ring), new Object[] { 
				"T  ",
				"R  ", 
				'T', new ItemStack(ModItems.token, 1, 12), 'R', ModItems.item_ring
		});
		
		GameRegistry.addRecipe(new ItemStack(ModItems.invisibility_ring), new Object[] {
				"  T", 
				"  R", 
				'T', new ItemStack(ModItems.token, 1, 12), 'R', ModItems.item_ring
		});
		
		GameRegistry.addRecipe(new ItemStack(ModItems.invisibility_ring_2), new Object[] { 
				" T ", 
				" RT", 
				'T', new ItemStack(ModItems.token, 1, 12), 'R', ModItems.item_ring
		});
		
		GameRegistry.addRecipe(new ItemStack(ModItems.invisibility_ring_2), new Object[] {
				"T  ",
				"RT ",
				'T', new ItemStack(ModItems.token, 1, 12), 'R', ModItems.item_ring
		});
		
		GameRegistry.addRecipe(new ItemStack(ModItems.invisibility_ring_2), new Object[] { 
				"  T", 
				" RT", 
				'T', new ItemStack(ModItems.token, 1, 12), 'R', ModItems.item_ring
		});
		
		GameRegistry.addRecipe(new ItemStack(ModItems.invisibility_ring_3), new Object[] { 
				" T ",
				" RT",
				" T ",
				'T', new ItemStack(ModItems.token, 1, 12), 'R', ModItems.item_ring
		});
		
		GameRegistry.addRecipe(new ItemStack(ModItems.invisibility_ring_3), new Object[] { 
				"T  ",
				"RT ",
				"T  ", 
				'T', new ItemStack(ModItems.token, 1, 12), 'R', ModItems.item_ring
		});
		
		GameRegistry.addRecipe(new ItemStack(ModItems.invisibility_ring_3), new Object[] { 
				"  T",
				" RT", 
				"  T", 
				'T', new ItemStack(ModItems.token, 1, 12), 'R', ModItems.item_ring
		});
		
		GameRegistry.addRecipe(new ItemStack(ModItems.poison_ring), new Object[] { 
				" T ",
				" R ", 
				'T', new ItemStack(ModItems.token, 1, 3), 'R', ModItems.item_ring
		});
		
		GameRegistry.addRecipe(new ItemStack(ModItems.poison_ring), new Object[] { 
				"T  ", 
				"R  ",
				'T', new ItemStack(ModItems.token, 1, 3), 'R', ModItems.item_ring
		});
		
		GameRegistry.addRecipe(new ItemStack(ModItems.poison_ring), new Object[] {
				"  T", 
				"  R",
				'T', new ItemStack(ModItems.token, 1, 3), 'R', ModItems.item_ring
		});
		
		GameRegistry.addRecipe(new ItemStack(ModItems.poison_ring_2), new Object[] { 
				" T ",
				" RT", 
				'T', new ItemStack(ModItems.token, 1, 3), 'R', ModItems.item_ring
		});
		
		GameRegistry.addRecipe(new ItemStack(ModItems.poison_ring_2), new Object[] { 
				"T  ",
				"RT ", 
				'T', new ItemStack(ModItems.token, 1, 3), 'R', ModItems.item_ring
		});
		
		GameRegistry.addRecipe(new ItemStack(ModItems.poison_ring_2), new Object[] {
				"  T",
				" RT", 
				'T', new ItemStack(ModItems.token, 1, 3), 'R', ModItems.item_ring
		});
		
		GameRegistry.addRecipe(new ItemStack(ModItems.poison_ring_3), new Object[] {
				" T ",
				" RT", 
				" T ",
				'T', new ItemStack(ModItems.token, 1, 3), 'R', ModItems.item_ring
		});
		
		GameRegistry.addRecipe(new ItemStack(ModItems.poison_ring_3), new Object[] { 
				"T  ",
				"RT ", 
				"T  ",
				'T', new ItemStack(ModItems.token, 1, 3), 'R', ModItems.item_ring
		});
		
		GameRegistry.addRecipe(new ItemStack(ModItems.poison_ring_3), new Object[] {
				"  T",
				" RT",
				"  T", 
				'T', new ItemStack(ModItems.token, 1, 3), 'R', ModItems.item_ring
		});
		
		GameRegistry.addRecipe(new ItemStack(ModItems.slowness_ring), new Object[] { 
				" T ", 
				" R ",
				'T', new ItemStack(ModItems.token, 1, 14), 'R', ModItems.item_ring
		});
		
		GameRegistry.addRecipe(new ItemStack(ModItems.slowness_ring), new Object[] {
				"T  ",
				"R  ",
				'T', new ItemStack(ModItems.token, 1, 14), 'R', ModItems.item_ring
		});
		
		GameRegistry.addRecipe(new ItemStack(ModItems.slowness_ring), new Object[] { 
				"  T", 
				"  R", 
				'T', new ItemStack(ModItems.token, 1, 14), 'R', ModItems.item_ring
		});
		
		GameRegistry.addRecipe(new ItemStack(ModItems.slowness_ring_2), new Object[] {
				" T ",
				" RT", 
				'T', new ItemStack(ModItems.token, 1, 14), 'R', ModItems.item_ring
		});
		
		GameRegistry.addRecipe(new ItemStack(ModItems.slowness_ring_2), new Object[] {
				"T  ",
				"RT ", 
				'T', new ItemStack(ModItems.token, 1, 14), 'R', ModItems.item_ring
		});
		
		GameRegistry.addRecipe(new ItemStack(ModItems.slowness_ring_2), new Object[] { 
				"  T",
				" RT",
				'T', new ItemStack(ModItems.token, 1, 14), 'R', ModItems.item_ring
		});
		
		GameRegistry.addRecipe(new ItemStack(ModItems.slowness_ring_3), new Object[] {
				" T ",
				" RT",
				" T ",
				'T', new ItemStack(ModItems.token, 1, 14), 'R', ModItems.item_ring
		});
		
		GameRegistry.addRecipe(new ItemStack(ModItems.slowness_ring_3), new Object[] { 
				"T  ",
				"RT ",
				"T  ",
				'T', new ItemStack(ModItems.token, 1, 14), 'R', ModItems.item_ring
		});
		
		GameRegistry.addRecipe(new ItemStack(ModItems.slowness_ring_3), new Object[] { 
				"  T", 
				" RT", 
				"  T", 
				'T', new ItemStack(ModItems.token, 1, 14), 'R', ModItems.item_ring
		});
		
		GameRegistry.addRecipe(new ItemStack(ModItems.wither_ring), new Object[] { 
				" T ",
				" R ",
				'T', new ItemStack(ModItems.token, 1, 13), 'R', ModItems.item_ring
		});
		
		GameRegistry.addRecipe(new ItemStack(ModItems.wither_ring), new Object[] { 
				"T  ", 
				"R  ", 
				'T', new ItemStack(ModItems.token, 1, 13), 'R', ModItems.item_ring
		});
		
		GameRegistry.addRecipe(new ItemStack(ModItems.wither_ring), new Object[] { 
				"  T",
				"  R",
				'T', new ItemStack(ModItems.token, 1, 13), 'R', ModItems.item_ring
		});
		
		GameRegistry.addRecipe(new ItemStack(ModItems.wither_ring_2), new Object[] { 
				" T ",
				" RT", 
				'T', new ItemStack(ModItems.token, 1, 13), 'R', ModItems.item_ring
		});
		
		GameRegistry.addRecipe(new ItemStack(ModItems.wither_ring_2), new Object[] {
				"T  ",
				"RT ", 
				'T', new ItemStack(ModItems.token, 1, 13), 'R', ModItems.item_ring
		});
		
		GameRegistry.addRecipe(new ItemStack(ModItems.wither_ring_2), new Object[] {
				"  T",
				" RT", 
				'T', new ItemStack(ModItems.token, 1, 13), 'R', ModItems.item_ring
		});
		
		GameRegistry.addRecipe(new ItemStack(ModItems.wither_ring_3), new Object[] {
				" T ", 
				" RT",
				" T ", 
				'T', new ItemStack(ModItems.token, 1, 13), 'R', ModItems.item_ring
		});
		
		GameRegistry.addRecipe(new ItemStack(ModItems.wither_ring_3), new Object[] {
				"T  ", 
				"RT ", 
				"T  ",
				'T', new ItemStack(ModItems.token, 1, 13), 'R', ModItems.item_ring
		});
		
		GameRegistry.addRecipe(new ItemStack(ModItems.wither_ring_3), new Object[] { 
				"  T", 
				" RT", 
				"  T",
				'T', new ItemStack(ModItems.token, 1, 13), 'R', ModItems.item_ring
		});
		
		GameRegistry.addRecipe(new ItemStack(ModItems.weakness_ring), new Object[] { 
				" T ",
				" R ",
				'T', new ItemStack(ModItems.token, 1, 4), 'R', ModItems.item_ring
		});
		
		GameRegistry.addRecipe(new ItemStack(ModItems.weakness_ring), new Object[] {
				"T  ", 
				"R  ", 
				'T', new ItemStack(ModItems.token, 1, 4), 'R', ModItems.item_ring
		});
		
		GameRegistry.addRecipe(new ItemStack(ModItems.weakness_ring), new Object[] { 
				"  T",
				"  R", 
				'T', new ItemStack(ModItems.token, 1, 4), 'R', ModItems.item_ring
		});
		
		GameRegistry.addRecipe(new ItemStack(ModItems.weakness_ring_2), new Object[] { 
				" T ",
				" RT", 
				'T', new ItemStack(ModItems.token, 1, 4), 'R', ModItems.item_ring
		});
		
		GameRegistry.addRecipe(new ItemStack(ModItems.weakness_ring_2), new Object[] {
				"T  ", 
				"RT ", 
				'T', new ItemStack(ModItems.token, 1, 4), 'R', ModItems.item_ring
		});
		
		GameRegistry.addRecipe(new ItemStack(ModItems.weakness_ring_2), new Object[] {
				"  T",
				" RT", 
				'T', new ItemStack(ModItems.token, 1, 4), 'R', ModItems.item_ring
		});
		
		GameRegistry.addRecipe(new ItemStack(ModItems.weakness_ring_3), new Object[] {
				" T ",
				" RT", 
				" T ",
				'T', new ItemStack(ModItems.token, 1, 4), 'R', ModItems.item_ring
		});
		
		GameRegistry.addRecipe(new ItemStack(ModItems.weakness_ring_3), new Object[] {
				"T  ",
				"RT ",
				"T  ", 
				'T', new ItemStack(ModItems.token, 1, 4), 'R', ModItems.item_ring
		});
		
		GameRegistry.addRecipe(new ItemStack(ModItems.weakness_ring_3), new Object[] { 
				"  T",
				" RT", 
				"  T",
				'T', new ItemStack(ModItems.token, 1, 4), 'R', ModItems.item_ring
		});
		
		GameRegistry.addRecipe(new ItemStack(ModItems.item_ring, 4), new Object[] {
				" G ",
				"G G",
				" G ",
				'G', Items.gold_ingot
		});
		
		// Furnace //
		GameRegistry.addSmelting(new ItemStack(ModItems.items_craft, 1, 5),  new ItemStack(ModItems.items_craft, 1, 6), 0.5F);
	}
}
