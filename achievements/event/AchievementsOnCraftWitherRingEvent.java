package com.xSowl.betterrings.achievements.event;

import com.xSowl.betterrings.achievements.ModAchievements;
import com.xSowl.betterrings.item.ModItems;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent;

public class AchievementsOnCraftWitherRingEvent {

	@SubscribeEvent
	public void onCraftRing(PlayerEvent.ItemCraftedEvent e) {
		if(e.crafting.getItem().equals(ModItems.wither_ring)) {
			e.player.addStat(ModAchievements.achievementCraftWitherRing, 1);
		}
	}
	
}
