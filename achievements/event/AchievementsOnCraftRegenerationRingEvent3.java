package com.xSowl.betterrings.achievements.event;

import com.xSowl.betterrings.achievements.ModAchievements;
import com.xSowl.betterrings.item.ModItems;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent;

public class AchievementsOnCraftRegenerationRingEvent3 {

	@SubscribeEvent
	public void onCraftRing(PlayerEvent.ItemCraftedEvent e) {
		if(e.crafting.getItem().equals(ModItems.regeneration_ring_3)) {
			e.player.addStat(ModAchievements.achievementCraftRegenerationRing3, 1);
		}
	}
	
}
