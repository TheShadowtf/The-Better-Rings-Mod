package com.xSowl.betterrings.achievements.event;

import com.xSowl.betterrings.achievements.ModAchievements;
import com.xSowl.betterrings.item.ModItems;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent;

public class AchievementsOnCraftStrengthRingEvent2 {

	@SubscribeEvent
	public void onCraftRing(PlayerEvent.ItemCraftedEvent e) {
		if(e.crafting.getItem().equals(ModItems.strength_ring_2)) {
			e.player.addStat(ModAchievements.achievementCraftStrengthRing2, 1);
		}
	}
	
}
