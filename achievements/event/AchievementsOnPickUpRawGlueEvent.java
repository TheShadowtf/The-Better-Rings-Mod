package com.xSowl.betterrings.achievements.event;

import com.xSowl.betterrings.achievements.ModAchievements;
import com.xSowl.betterrings.item.ModItems;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent;
import net.minecraft.item.ItemStack;

public class AchievementsOnPickUpRawGlueEvent {

	@SubscribeEvent
	public void onCraftRing(PlayerEvent.ItemPickupEvent e) {
		if(e.pickedUp.getEntityItem().isItemEqual(new ItemStack(ModItems.items_craft, 1, 5))) {
			e.player.addStat(ModAchievements.achievementPickRawGlue, 1);
		}
	}
	
}
