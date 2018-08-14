package com.xSowl.betterrings.achievements;

import com.xSowl.betterrings.achievements.event.AchievementsOnCraftAngleRingEvent;
import com.xSowl.betterrings.achievements.event.AchievementsOnCraftBreathingRingEvent;
import com.xSowl.betterrings.achievements.event.AchievementsOnCraftBreathingRingEvent2;
import com.xSowl.betterrings.achievements.event.AchievementsOnCraftBreathingRingEvent3;
import com.xSowl.betterrings.achievements.event.AchievementsOnCraftFireRingEvent;
import com.xSowl.betterrings.achievements.event.AchievementsOnCraftFireRingEvent2;
import com.xSowl.betterrings.achievements.event.AchievementsOnCraftFireRingEvent3;
import com.xSowl.betterrings.achievements.event.AchievementsOnCraftHasteRingEvent;
import com.xSowl.betterrings.achievements.event.AchievementsOnCraftHasteRingEvent2;
import com.xSowl.betterrings.achievements.event.AchievementsOnCraftHasteRingEvent3;
import com.xSowl.betterrings.achievements.event.AchievementsOnCraftInvisibilityRingEvent;
import com.xSowl.betterrings.achievements.event.AchievementsOnCraftInvisibilityRingEvent2;
import com.xSowl.betterrings.achievements.event.AchievementsOnCraftInvisibilityRingEvent3;
import com.xSowl.betterrings.achievements.event.AchievementsOnCraftJumpRingEvent;
import com.xSowl.betterrings.achievements.event.AchievementsOnCraftJumpRingEvent2;
import com.xSowl.betterrings.achievements.event.AchievementsOnCraftJumpRingEvent3;
import com.xSowl.betterrings.achievements.event.AchievementsOnCraftRegenerationRingEvent;
import com.xSowl.betterrings.achievements.event.AchievementsOnCraftRegenerationRingEvent2;
import com.xSowl.betterrings.achievements.event.AchievementsOnCraftRegenerationRingEvent3;
import com.xSowl.betterrings.achievements.event.AchievementsOnCraftResistanceRingEvent;
import com.xSowl.betterrings.achievements.event.AchievementsOnCraftResistanceRingEvent2;
import com.xSowl.betterrings.achievements.event.AchievementsOnCraftResistanceRingEvent3;
import com.xSowl.betterrings.achievements.event.AchievementsOnCraftRingEvent;
import com.xSowl.betterrings.achievements.event.AchievementsOnCraftSlownessRingEvent;
import com.xSowl.betterrings.achievements.event.AchievementsOnCraftSlownessRingEvent2;
import com.xSowl.betterrings.achievements.event.AchievementsOnCraftSlownessRingEvent3;
import com.xSowl.betterrings.achievements.event.AchievementsOnCraftSpeedRingEvent;
import com.xSowl.betterrings.achievements.event.AchievementsOnCraftSpeedRingEvent2;
import com.xSowl.betterrings.achievements.event.AchievementsOnCraftSpeedRingEvent3;
import com.xSowl.betterrings.achievements.event.AchievementsOnCraftStrengthRingEvent;
import com.xSowl.betterrings.achievements.event.AchievementsOnCraftStrengthRingEvent2;
import com.xSowl.betterrings.achievements.event.AchievementsOnCraftStrengthRingEvent3;
import com.xSowl.betterrings.achievements.event.AchievementsOnCraftStuffOfLightEvent;
import com.xSowl.betterrings.achievements.event.AchievementsOnCraftVisionRingEvent;
import com.xSowl.betterrings.achievements.event.AchievementsOnCraftVisionRingEvent2;
import com.xSowl.betterrings.achievements.event.AchievementsOnCraftVisionRingEvent3;
import com.xSowl.betterrings.achievements.event.AchievementsOnCraftWeekneesRingEvent;
import com.xSowl.betterrings.achievements.event.AchievementsOnCraftWeekneesRingEvent2;
import com.xSowl.betterrings.achievements.event.AchievementsOnCraftWeekneesRingEvent3;
import com.xSowl.betterrings.achievements.event.AchievementsOnCraftWitherRingEvent;
import com.xSowl.betterrings.achievements.event.AchievementsOnCraftWitherRingEvent2;
import com.xSowl.betterrings.achievements.event.AchievementsOnCraftWitherRingEvent3;
import com.xSowl.betterrings.achievements.event.AchievementsOnPickUpRawGlueEvent;
import com.xSowl.betterrings.achievements.event.AchievementsOnPickGluEvent;
import com.xSowl.betterrings.item.ModItems;

import cpw.mods.fml.common.FMLCommonHandler;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.Achievement;
import net.minecraftforge.common.AchievementPage;

public class ModAchievements {
	
	public static Achievement achievementCraftRing;
	
	public static Achievement achievementCraftStuffOfLight;
	
	public static Achievement achievementPickRawGlue;
	
	public static Achievement achievementCraftAngelRing;
	public static Achievement achievementPickGlue;
	
	public static Achievement achievementCraftStrengthRing;
	public static Achievement achievementCraftStrengthRing2;
	public static Achievement achievementCraftStrengthRing3;
	
	public static Achievement achievementCraftJumpRing;
	public static Achievement achievementCraftJumpRing2;
	public static Achievement achievementCraftJumpRing3;
	
	public static Achievement achievementCraftNightVisionRing;
	public static Achievement achievementCraftNightVisionRing2;
	public static Achievement achievementCraftNightVisionRing3;
	
	public static Achievement achievementCraftHasteRing;
	public static Achievement achievementCraftHasteRing2;
	public static Achievement achievementCraftHasteRing3;
	
	public static Achievement achievementCraftBreathingRing;
	public static Achievement achievementCraftBreathingRing2;
	public static Achievement achievementCraftBreathingRing3;
	
	public static Achievement achievementCraftRegenerationRing;
	public static Achievement achievementCraftRegenerationRing2;
	public static Achievement achievementCraftRegenerationRing3;
	
	public static Achievement achievementCraftResistanceRing;
	public static Achievement achievementCraftResistanceRing2;
	public static Achievement achievementCraftResistanceRing3;
	
	public static Achievement achievementCraftInvisibilityRing;
	public static Achievement achievementCraftInvisibilityRing2;
	public static Achievement achievementCraftInvisibilityRing3;
	
	public static Achievement achievementCraftSpeedRing;
	public static Achievement achievementCraftSpeedRing2;
	public static Achievement achievementCraftSpeedRing3;
	
	public static Achievement achievementCraftFireRing;
	public static Achievement achievementCraftFireRing2;
	public static Achievement achievementCraftFireRing3;
	
	public static Achievement achievementCraftWeekneesRing;
	public static Achievement achievementCraftWeekneesRing2;
	public static Achievement achievementCraftWeekneesRing3;
	
	public static Achievement achievementCraftSlownessRing;
	public static Achievement achievementCraftSlownessRing2;
	public static Achievement achievementCraftSlownessRing3;
	
	public static Achievement achievementCraftWitherRing;
	public static Achievement achievementCraftWitherRing2;
	public static Achievement achievementCraftWitherRing3;
	
	public static void init() {
		achievementCraftRing = new Achievement("achievement.craftRing", "craftRing", 0, 0, ModItems.item_ring, achievementCraftRing).registerStat();
		
		achievementCraftStuffOfLight = new Achievement("achievement.stuffOfLight", "stuffOfLight", 1, 0, ModItems.stuff_of_light, achievementCraftStuffOfLight).registerStat();
		
		achievementPickRawGlue = new Achievement("achievement.pickRawGlue", "pickRawGlue", 2, 0, new ItemStack(ModItems.items_craft, 1, 5), achievementPickRawGlue).registerStat();
		achievementPickGlue = new Achievement("achievement.pickGlue", "pickGlue", 2, -1, new ItemStack(ModItems.items_craft, 1, 6), achievementPickGlue).registerStat();
		
		achievementCraftStrengthRing = new Achievement("achievement.craftStrengthRing", "craftStrengthRing", 3, 0, ModItems.strength_ring, achievementCraftAngelRing).registerStat();
		achievementCraftStrengthRing2 = new Achievement("achievement.craftStrengthRing2", "craftStrengthRing2", 3, -1, ModItems.strength_ring_2, achievementCraftStrengthRing2).registerStat();
		achievementCraftStrengthRing3 = new Achievement("achievement.craftStrengthRing3", "craftStrengthRing3", 3, -2, ModItems.strength_ring_3, achievementCraftStrengthRing3).registerStat();
		
		achievementCraftJumpRing = new Achievement("achievement.craftJumpRing", "craftJumpRing", 4, 0, ModItems.jump_ring, achievementCraftJumpRing).registerStat();
		achievementCraftJumpRing2 = new Achievement("achievement.craftJumpRing2", "craftJumpRing2", 4, -1, ModItems.jump_ring_2, achievementCraftJumpRing2).registerStat();
		achievementCraftJumpRing3 = new Achievement("achievement.craftJumpRing3", "craftJumpRing3", 4, -2, ModItems.jump_ring_3, achievementCraftJumpRing3).registerStat();
		
		achievementCraftNightVisionRing = new Achievement("achievement.craftNightVisionRing", "craftNightVisionRing", 5, 0, ModItems.jump_ring, achievementCraftNightVisionRing).registerStat();
		achievementCraftNightVisionRing2 = new Achievement("achievement.craftNightVisionRing2", "craftNightVisionRing2", 5, -1, ModItems.jump_ring_2, achievementCraftNightVisionRing2).registerStat();
		achievementCraftNightVisionRing3 = new Achievement("achievement.craftNightVisionRing3", "craftNightVisionRing3", 5, -2, ModItems.jump_ring_3, achievementCraftNightVisionRing3).registerStat();
		
		achievementCraftHasteRing = new Achievement("achievement.craftHasteRing", "craftHasteRing", 6, 0, ModItems.haste_ring, achievementCraftHasteRing).registerStat();
		achievementCraftHasteRing2 = new Achievement("achievement.craftHasteRing2", "craftHasteRing2", 6, -1, ModItems.haste_ring_2, achievementCraftHasteRing2).registerStat();
		achievementCraftHasteRing3 = new Achievement("achievement.craftHasteRing3", "craftHasteRing3", 6, -2, ModItems.haste_ring_3, achievementCraftHasteRing3).registerStat();
		
		achievementCraftBreathingRing = new Achievement("achievement.craftBreathingRing", "craftBreathingRing", 7, 0, ModItems.breathing_ring, achievementCraftBreathingRing).registerStat();
		achievementCraftBreathingRing2 = new Achievement("achievement.craftBreathingRing2", "craftBreathingRing2", 7, -1, ModItems.breathing_ring_2, achievementCraftBreathingRing2).registerStat();
		achievementCraftBreathingRing3 = new Achievement("achievement.craftBreathingRing3", "craftBreathingRing3", 7, -2, ModItems.breathing_ring_3, achievementCraftBreathingRing3).registerStat();
		
		achievementCraftRegenerationRing = new Achievement("achievement.craftRegenerationRing", "craftRegenerationRing", 8, 0, ModItems.regeneration_ring, achievementCraftRegenerationRing).registerStat();
		achievementCraftRegenerationRing2 = new Achievement("achievement.craftRegenerationRing2", "craftRegenerationRing2", 8, -1, ModItems.regeneration_ring_2, achievementCraftRegenerationRing2).registerStat();
		achievementCraftRegenerationRing3 = new Achievement("achievement.craftRegenerationRing3", "craftRegenerationRing3", 8, -2, ModItems.regeneration_ring_3, achievementCraftRegenerationRing3).registerStat();
		
		achievementCraftResistanceRing = new Achievement("achievement.craftResistanceRing", "craftResistanceRing", 9, 0, ModItems.breathing_ring, achievementCraftResistanceRing).registerStat();
		achievementCraftResistanceRing2 = new Achievement("achievement.craftResistanceRing2", "craftResistanceRing2", 9, -1, ModItems.breathing_ring_2, achievementCraftResistanceRing2).registerStat();
		achievementCraftResistanceRing3 = new Achievement("achievement.craftResistanceRing3", "craftResistanceRing3", 9, -2, ModItems.breathing_ring_3, achievementCraftResistanceRing3).registerStat();
		
		achievementCraftInvisibilityRing = new Achievement("achievement.craftInvisibilityRing", "craftInvisibilityRing", 10, 0, ModItems.invisibility_ring, achievementCraftInvisibilityRing).registerStat();
		achievementCraftInvisibilityRing2 = new Achievement("achievement.craftInvisibilityRing2", "craftInvisibilityRing2", 10, -1, ModItems.invisibility_ring_2, achievementCraftInvisibilityRing2).registerStat();
		achievementCraftInvisibilityRing3 = new Achievement("achievement.craftInvisibilityRing3", "craftInvisibilityRing3", 10, -2, ModItems.invisibility_ring_3, achievementCraftInvisibilityRing3).registerStat();
		
		achievementCraftSpeedRing = new Achievement("achievement.craftSpeedRing", "craftSpeedRing", 11, 0, ModItems.speed_ring, achievementCraftSpeedRing).registerStat();
		achievementCraftSpeedRing2 = new Achievement("achievement.craftSpeedRing2", "craftSpeedRing2", 11, -1, ModItems.speed_ring_2, achievementCraftSpeedRing2).registerStat();
		achievementCraftSpeedRing3 = new Achievement("achievement.craftSpeedRing3", "craftSpeedRing3", 11, -2, ModItems.speed_ring_3, achievementCraftSpeedRing3).registerStat();
		
		achievementCraftFireRing = new Achievement("achievement.craftFireRing", "craftFireRing", 12, 0, ModItems.fire_ring, achievementCraftFireRing).registerStat();
		achievementCraftFireRing2 = new Achievement("achievement.craftFireRing2", "craftFireRing2", 12, -1, ModItems.fire_ring_2, achievementCraftFireRing2).registerStat();
		achievementCraftFireRing3 = new Achievement("achievement.craftFireRing3", "craftFireRing3", 12, -2, ModItems.fire_ring_3, achievementCraftFireRing3).registerStat();
		
		achievementCraftWeekneesRing = new Achievement("achievement.craftWeekneesRing", "craftWeekneesRing", 13, 0, ModItems.weakness_ring, achievementCraftWeekneesRing).registerStat();
		achievementCraftWeekneesRing2 = new Achievement("achievement.craftWeekneesRing2", "craftWeekneesRing2", 13, -1, ModItems.weakness_ring_2, achievementCraftWeekneesRing2).registerStat();
		achievementCraftWeekneesRing3 = new Achievement("achievement.craftWeekneesRing3", "craftWeekneesRing3", 13, -2, ModItems.weakness_ring_3, achievementCraftWeekneesRing3).registerStat();
		
		achievementCraftSlownessRing = new Achievement("achievement.craftSlownessRing", "craftSlownessRing", 14, 0, ModItems.slowness_ring, achievementCraftSlownessRing).registerStat();
		achievementCraftSlownessRing2 = new Achievement("achievement.craftSlownessRing2", "craftSlownessRing2", 14, -1, ModItems.slowness_ring_2, achievementCraftSlownessRing2).registerStat();
		achievementCraftSlownessRing3 = new Achievement("achievement.craftSlownessRing3", "craftSlownessRing3", 14, -2, ModItems.slowness_ring_3, achievementCraftSlownessRing3).registerStat();
		
		achievementCraftWitherRing = new Achievement("achievement.craftWitherRing", "craftWitherRing", 15, 0, ModItems.slowness_ring, achievementCraftWitherRing).registerStat();
		achievementCraftWitherRing2 = new Achievement("achievement.craftWitherRing2", "craftWitherRing2", 15, -1, ModItems.slowness_ring_2, achievementCraftWitherRing2).registerStat();
		achievementCraftWitherRing3 = new Achievement("achievement.craftWitherRing3", "craftWitherRing3", 15, -2, ModItems.slowness_ring_3, achievementCraftWitherRing3).registerStat();
		
		achievementCraftAngelRing = new Achievement("achievement.craftAngelRing", "craftAngelRing", 16, 0, ModItems.angel_ring, achievementCraftAngelRing).registerStat();
	}
	
	public static void registerAchievementPage() {
		AchievementPage.registerAchievementPage(new AchievementPage("Better Rings Mod", new Achievement[] {
				achievementCraftRing, 
				achievementCraftStuffOfLight, 
				achievementPickRawGlue,
				achievementPickGlue,
				achievementCraftAngelRing,
				achievementCraftStrengthRing, 
				achievementCraftStrengthRing2, 
				achievementCraftStrengthRing3,
				achievementCraftJumpRing,
				achievementCraftJumpRing2,
				achievementCraftJumpRing3,
				achievementCraftNightVisionRing,
				achievementCraftNightVisionRing2,
				achievementCraftNightVisionRing3,
				achievementCraftHasteRing,
				achievementCraftHasteRing2,
				achievementCraftHasteRing3,
				achievementCraftBreathingRing,
				achievementCraftBreathingRing2,
				achievementCraftBreathingRing3,
				achievementCraftRegenerationRing,
				achievementCraftRegenerationRing2,
				achievementCraftRegenerationRing3,
				achievementCraftResistanceRing,
				achievementCraftResistanceRing2,
				achievementCraftResistanceRing3,
				achievementCraftInvisibilityRing,
				achievementCraftInvisibilityRing2,
				achievementCraftInvisibilityRing3,
				achievementCraftSpeedRing,
				achievementCraftSpeedRing2,
				achievementCraftSpeedRing3,
				achievementCraftFireRing,
				achievementCraftFireRing2,
				achievementCraftFireRing3,
				achievementCraftWeekneesRing,
				achievementCraftWeekneesRing2,
				achievementCraftWeekneesRing3,
				achievementCraftSlownessRing,
				achievementCraftSlownessRing2,
				achievementCraftSlownessRing3,
				achievementCraftWitherRing,
				achievementCraftWitherRing2,
				achievementCraftWitherRing3
		}));
	}
	
	public static void registerAchievement() {
		FMLCommonHandler.instance().bus().register(new AchievementsOnCraftRingEvent());
		
		FMLCommonHandler.instance().bus().register(new AchievementsOnCraftStuffOfLightEvent());
		
		FMLCommonHandler.instance().bus().register(new AchievementsOnPickUpRawGlueEvent());
		FMLCommonHandler.instance().bus().register(new AchievementsOnPickGluEvent());
		
		FMLCommonHandler.instance().bus().register(new AchievementsOnCraftAngleRingEvent());
		
		FMLCommonHandler.instance().bus().register(new AchievementsOnCraftStrengthRingEvent());
		FMLCommonHandler.instance().bus().register(new AchievementsOnCraftStrengthRingEvent2());
		FMLCommonHandler.instance().bus().register(new AchievementsOnCraftStrengthRingEvent3());
		
		FMLCommonHandler.instance().bus().register(new AchievementsOnCraftJumpRingEvent());
		FMLCommonHandler.instance().bus().register(new AchievementsOnCraftJumpRingEvent2());
		FMLCommonHandler.instance().bus().register(new AchievementsOnCraftJumpRingEvent3());
		
		FMLCommonHandler.instance().bus().register(new AchievementsOnCraftVisionRingEvent());
		FMLCommonHandler.instance().bus().register(new AchievementsOnCraftVisionRingEvent2());
		FMLCommonHandler.instance().bus().register(new AchievementsOnCraftVisionRingEvent3());
		
		FMLCommonHandler.instance().bus().register(new AchievementsOnCraftHasteRingEvent());
		FMLCommonHandler.instance().bus().register(new AchievementsOnCraftHasteRingEvent2());
		FMLCommonHandler.instance().bus().register(new AchievementsOnCraftHasteRingEvent3());
		
		FMLCommonHandler.instance().bus().register(new AchievementsOnCraftBreathingRingEvent());
		FMLCommonHandler.instance().bus().register(new AchievementsOnCraftBreathingRingEvent2());
		FMLCommonHandler.instance().bus().register(new AchievementsOnCraftBreathingRingEvent3());
		
		FMLCommonHandler.instance().bus().register(new AchievementsOnCraftRegenerationRingEvent());
		FMLCommonHandler.instance().bus().register(new AchievementsOnCraftRegenerationRingEvent2());
		FMLCommonHandler.instance().bus().register(new AchievementsOnCraftRegenerationRingEvent3());
		
		FMLCommonHandler.instance().bus().register(new AchievementsOnCraftResistanceRingEvent());
		FMLCommonHandler.instance().bus().register(new AchievementsOnCraftResistanceRingEvent2());
		FMLCommonHandler.instance().bus().register(new AchievementsOnCraftResistanceRingEvent3());
		
		FMLCommonHandler.instance().bus().register(new AchievementsOnCraftInvisibilityRingEvent());
		FMLCommonHandler.instance().bus().register(new AchievementsOnCraftInvisibilityRingEvent2());
		FMLCommonHandler.instance().bus().register(new AchievementsOnCraftInvisibilityRingEvent3());
		
		FMLCommonHandler.instance().bus().register(new AchievementsOnCraftSpeedRingEvent());
		FMLCommonHandler.instance().bus().register(new AchievementsOnCraftSpeedRingEvent2());
		FMLCommonHandler.instance().bus().register(new AchievementsOnCraftSpeedRingEvent3());
		
		FMLCommonHandler.instance().bus().register(new AchievementsOnCraftFireRingEvent());
		FMLCommonHandler.instance().bus().register(new AchievementsOnCraftFireRingEvent2());
		FMLCommonHandler.instance().bus().register(new AchievementsOnCraftFireRingEvent3());
		
		FMLCommonHandler.instance().bus().register(new AchievementsOnCraftWeekneesRingEvent());
		FMLCommonHandler.instance().bus().register(new AchievementsOnCraftWeekneesRingEvent2());
		FMLCommonHandler.instance().bus().register(new AchievementsOnCraftWeekneesRingEvent3());
		
		FMLCommonHandler.instance().bus().register(new AchievementsOnCraftSlownessRingEvent());
		FMLCommonHandler.instance().bus().register(new AchievementsOnCraftSlownessRingEvent2());
		FMLCommonHandler.instance().bus().register(new AchievementsOnCraftSlownessRingEvent3());
		
		FMLCommonHandler.instance().bus().register(new AchievementsOnCraftWitherRingEvent());
		FMLCommonHandler.instance().bus().register(new AchievementsOnCraftWitherRingEvent2());
		FMLCommonHandler.instance().bus().register(new AchievementsOnCraftWitherRingEvent3());
	}
}

