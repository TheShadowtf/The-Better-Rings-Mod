package com.xSowl.betterrings.main;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import com.xSowl.betterrings.achievements.ModAchievements;
import com.xSowl.betterrings.achievements.event.AchievementsOnCraftRingEvent;
import com.xSowl.betterrings.achievements.event.AchievementsOnCraftStuffOfLightEvent;
import com.xSowl.betterrings.block.ModBlocks;
import com.xSowl.betterrings.crafting.ModCrafting;
import com.xSowl.betterrings.creative_tabs.BetterRingsTab;
import com.xSowl.betterrings.item.ModItems;
import com.xSowl.betterrings.main.manager.AddonEntityManager;
import com.xSowl.betterrings.main.manager.AddonMonsterManager;
import com.xSowl.betterrings.main.manager.AddonRenderManager;
import com.xSowl.betterrings.main.manager.equipment.EquipmentEntityManager;
import com.xSowl.betterrings.main.manager.equipment.EquipmentMonsterManager;
import com.xSowl.betterrings.main.manager.equipment.EquipmentRenderManager;
import com.xSowl.betterrings.proxy.ServerProxy;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraft.stats.Achievement;
import net.minecraftforge.common.AchievementPage;
import net.minecraftforge.common.config.Configuration;

@Mod(modid = Reference.MODID, version = Reference.VERSION, name = Reference.MOD_NAME)
public class BetterRingsCore {
	
	public static Achievement achievementCraftRing;
	public static Achievement achievementCraftStaffOfLight;
	
	private static List<AddonMod> registeredMods = new ArrayList<AddonMod>();
	public static Logger logger;

	@SidedProxy(modId = Reference.MODID, clientSide = Reference.CLIENT_PROXY_NAME, serverSide = Reference.SERVER_PROXY_NAME)
	public static ServerProxy proxy;
	
	public static Configuration configuration;

	public static final BetterRingsTab BetterRingsTab = new BetterRingsTab(Reference.TAB);

	@Mod.Instance(Reference.MODID)
	public static BetterRingsCore instance;

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		BetterRingsCore.proxy.preInit(event);
	}

	@EventHandler
	public void init(FMLInitializationEvent event) {
		BetterRingsCore.proxy.init(event);
		
		ModItems.init();
		ModItems.registerItems();
		ModItems.registerItemsOre();
		ModItems.registerGrass();

		ModBlocks.init();
		ModBlocks.registerBlocks();
		ModBlocks.registerBlockOre();
		
		ModCrafting.register();

		ModAchievements.init();
		ModAchievements.registerAchievementPage();
		ModAchievements.registerAchievement();
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		BetterRingsCore.proxy.postInit(event);
	}

	public static List<AddonMod> getRegisteredMods() {
		return registeredMods;
	}

	public AddonEntityManager getEntityManager() {
		return new EquipmentEntityManager();
	}

	public AddonMonsterManager getMonsterManager() {
		return new EquipmentMonsterManager();
	}

	public AddonRenderManager getRenderManager() {
		return new EquipmentRenderManager();
	}

	public static void log(String obj) {
		if (logger == null) {
			logger = Logger.getLogger("BetterRingsMod");
		}
		if (obj == null) {
			obj = "null";
		}
		logger.info("[" + FMLCommonHandler.instance().getEffectiveSide() + "] " + obj);
	}

	public List<String> getRelevantDimensions() {
		return null;
	}

	public enum ModObjects {

	}
}
