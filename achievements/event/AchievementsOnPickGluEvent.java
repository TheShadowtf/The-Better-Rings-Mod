package com.xSowl.betterrings.achievements.event;

import com.xSowl.betterrings.achievements.ModAchievements;
import com.xSowl.betterrings.item.ModItems;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent;
import net.minecraft.item.ItemStack;

public class AchievementsOnPickGluEvent {

	@SubscribeEvent
	public void onCraftRing(PlayerEvent.ItemPickupEvent e) {
		e.pickedUp.getEntityItem().equals(new ItemStack(ModItems.items_craft, 1, 6));
		e.player.addStat(ModAchievements.achievementPickGlue, 1);
	}
	
}
