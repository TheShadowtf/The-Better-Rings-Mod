package com.xSowl.betterrings.proxy;

import com.xSowl.betterrings.client.render.RenderUtils;
import com.xSowl.betterrings.event.key.KeyBindings;
import com.xSowl.betterrings.main.BetterRingsCore;
import com.xSowl.betterrings.player.IPlayerRenderer;

import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraft.client.Minecraft;

public class ClientProxy extends ServerProxy{

	public static Minecraft mc = Minecraft.getMinecraft();

	@Override
	public void preInit(FMLPreInitializationEvent e) {
		super.preInit(e);

	}

	@Override
	public void init(FMLInitializationEvent e) {
		super.init(e);

		for (int i = 0; i < BetterRingsCore.getRegisteredMods().size(); i++) {
			BetterRingsCore.getRegisteredMods().get(i).getRenderManager().registerRenderers();
		}

		KeyBindings.init();
	}

	@Override
	public void postInit(FMLPostInitializationEvent e) {
		super.postInit(e);
	}

	public void registerPlayerRenderer(IPlayerRenderer... renderers) {
		for (int i = 0; i < renderers.length; ++i) {
			playerRenderers.add(renderers[i]);
		}
	}

	@Override
	public void registerRenderers() {
		RenderUtils.foliageModel = RenderingRegistry.getNextAvailableRenderId();
		RenderUtils.plantsModel = RenderingRegistry.getNextAvailableRenderId();
		RenderUtils.bonesModel = RenderingRegistry.getNextAvailableRenderId();
		RenderUtils.graveModel = RenderingRegistry.getNextAvailableRenderId();
		RenderUtils.bambooModel = RenderingRegistry.getNextAvailableRenderId();
	}
	
	@Override
	public int addArmor(String armor)
	{
		return RenderingRegistry.addNewArmourRendererPrefix(armor);
	}
	
}
