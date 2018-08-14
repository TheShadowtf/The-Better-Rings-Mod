package com.xSowl.betterrings.event.key;

import cpw.mods.fml.client.registry.ClientRegistry;
import net.minecraft.client.settings.KeyBinding;

public class KeyBindings
{
	public static KeyBinding explorergui;
	
	public static void init()
	{
		ClientRegistry.registerKeyBinding(explorergui);
	}
}
