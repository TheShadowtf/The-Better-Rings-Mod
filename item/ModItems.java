package com.xSowl.betterrings.item;

import com.xSowl.betterrings.item.init.BTTRItem;
import com.xSowl.betterrings.item.items.Breathing2Ring;
import com.xSowl.betterrings.item.items.Breathing3Ring;
import com.xSowl.betterrings.item.items.BreathingRing;
import com.xSowl.betterrings.item.items.Fire2Ring;
import com.xSowl.betterrings.item.items.Fire3Ring;
import com.xSowl.betterrings.item.items.FireRing;
import com.xSowl.betterrings.item.items.Haste2Ring;
import com.xSowl.betterrings.item.items.Haste3Ring;
import com.xSowl.betterrings.item.items.HasteRing;
import com.xSowl.betterrings.item.items.Invisibility2Ring;
import com.xSowl.betterrings.item.items.Invisibility3Ring;
import com.xSowl.betterrings.item.items.InvisibilityRing;
import com.xSowl.betterrings.item.items.ItemAngelRing;
import com.xSowl.betterrings.item.items.ItemRing;
import com.xSowl.betterrings.item.items.Jump2Ring;
import com.xSowl.betterrings.item.items.Jump3Ring;
import com.xSowl.betterrings.item.items.JumpRing;
import com.xSowl.betterrings.item.items.ModItemsCraft;
import com.xSowl.betterrings.item.items.NightVision2Ring;
import com.xSowl.betterrings.item.items.NightVision3Ring;
import com.xSowl.betterrings.item.items.NightVisionRing;
import com.xSowl.betterrings.item.items.Poison2Ring;
import com.xSowl.betterrings.item.items.Poison3Ring;
import com.xSowl.betterrings.item.items.PoisonRing;
import com.xSowl.betterrings.item.items.Regeneration2Ring;
import com.xSowl.betterrings.item.items.Regeneration3Ring;
import com.xSowl.betterrings.item.items.RegenerationRing;
import com.xSowl.betterrings.item.items.Resistance2Ring;
import com.xSowl.betterrings.item.items.Resistance3Ring;
import com.xSowl.betterrings.item.items.ResistanceRing;
import com.xSowl.betterrings.item.items.Slowness2Ring;
import com.xSowl.betterrings.item.items.Slowness3Ring;
import com.xSowl.betterrings.item.items.SlownessRing;
import com.xSowl.betterrings.item.items.Speed2Ring;
import com.xSowl.betterrings.item.items.Speed3Ring;
import com.xSowl.betterrings.item.items.SpeedRing;
import com.xSowl.betterrings.item.items.Strengh2Ring;
import com.xSowl.betterrings.item.items.Strengh3Ring;
import com.xSowl.betterrings.item.items.StrenghRing;
import com.xSowl.betterrings.item.items.StuffOfLight;
import com.xSowl.betterrings.item.items.Token;
import com.xSowl.betterrings.item.items.Weakness2Ring;
import com.xSowl.betterrings.item.items.Weakness3Ring;
import com.xSowl.betterrings.item.items.WeaknessRing;
import com.xSowl.betterrings.item.items.Wither2Ring;
import com.xSowl.betterrings.item.items.Wither3Ring;
import com.xSowl.betterrings.item.items.WitherRing;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.oredict.OreDictionary;

public class ModItems {
	public static BTTRItem angel_ring = null;
	
	public static BTTRItem item_ring = null;
	
	public static BTTRItem items_craft = null;
	
	public static BTTRItem token = null;
	
	public static BTTRItem stuff_of_light = null;
	
	public static BTTRItem slowness_ring = null;
	public static BTTRItem slowness_ring_2 = null;
	public static BTTRItem slowness_ring_3 = null;
	
	public static BTTRItem weakness_ring = null;
	public static BTTRItem weakness_ring_2 = null;
	public static BTTRItem weakness_ring_3 = null;
	
	public static BTTRItem poison_ring = null;
	public static BTTRItem poison_ring_2 = null;
	public static BTTRItem poison_ring_3 = null;
	
	public static BTTRItem speed_ring = null;
	public static BTTRItem speed_ring_2 = null;
	public static BTTRItem speed_ring_3 = null;

	public static BTTRItem jump_ring = null;
	public static BTTRItem jump_ring_2 = null;
	public static BTTRItem jump_ring_3 = null;

	public static BTTRItem fire_ring = null;
	public static BTTRItem fire_ring_2 = null;
	public static BTTRItem fire_ring_3 = null;

	public static BTTRItem strength_ring = null;
	public static BTTRItem strength_ring_2 = null;
	public static BTTRItem strength_ring_3 = null;

	public static BTTRItem haste_ring = null;
	public static BTTRItem haste_ring_2 = null;
	public static BTTRItem haste_ring_3 = null;

	public static BTTRItem night_vision_ring = null;
	public static BTTRItem night_vision_ring_2 = null;
	public static BTTRItem night_vision_ring_3 = null;

	public static BTTRItem resistance_ring = null;
	public static BTTRItem resistance_ring_2 = null;
	public static BTTRItem resistance_ring_3 = null;

	public static BTTRItem breathing_ring = null;
	public static BTTRItem breathing_ring_2 = null;
	public static BTTRItem breathing_ring_3 = null;

	public static BTTRItem regeneration_ring = null;
	public static BTTRItem regeneration_ring_2 = null;
	public static BTTRItem regeneration_ring_3 = null;

	public static BTTRItem invisibility_ring = null;
	public static BTTRItem invisibility_ring_2 = null;
	public static BTTRItem invisibility_ring_3 = null;

	public static BTTRItem wither_ring = null;
	public static BTTRItem wither_ring_2 = null;
	public static BTTRItem wither_ring_3 = null;
	
	public static void init() {
		angel_ring = new ItemAngelRing("angel_ring");
		
		item_ring = new ItemRing("item_ring");
		
		items_craft = new ModItemsCraft("items_craft");
		
		token = new Token("token");
		
		stuff_of_light = new StuffOfLight("stuff_of_light");
		
		slowness_ring = new SlownessRing("slowness_ring");
		slowness_ring_2 = new Slowness2Ring("slowness_ring");
		slowness_ring_3 = new Slowness3Ring("slowness_ring");
		
		weakness_ring = new WeaknessRing("weakness_ring");
		weakness_ring_2 = new Weakness2Ring("weakness_ring_2");
		weakness_ring_3 = new Weakness3Ring("weakness_ring_3");
		
		poison_ring = new PoisonRing("poison_ring");
		poison_ring_2 = new Poison2Ring("poison_ring_2");
		poison_ring_3 = new Poison3Ring("poison_ring_3");
		
		speed_ring = new SpeedRing("speed_ring");
		speed_ring_2 = new Speed2Ring("speed_ring_2");
		speed_ring_3 = new Speed3Ring("speed_ring_3");

		jump_ring = new JumpRing("jump_ring");
		jump_ring_2 = new Jump2Ring("jump_ring_2");
		jump_ring_3 = new Jump3Ring("jump_ring_3");

		fire_ring = new FireRing("fire_ring");
		fire_ring_2 = new Fire2Ring("fire_ring_2");
		fire_ring_3 = new Fire3Ring("fire_ring_3");

		strength_ring = new StrenghRing("strength_ring");
		strength_ring_2 = new Strengh2Ring("strength_ring_2");
		strength_ring_3 = new Strengh3Ring("strength_ring_3");

		haste_ring = new HasteRing("haste_ring");
		haste_ring_2 = new Haste2Ring("haste_ring_2");
		haste_ring_3 = new Haste3Ring("haste_ring_3");

		night_vision_ring = new NightVisionRing("night_vision_ring");
		night_vision_ring_2 = new NightVision2Ring("night_vision_ring_2");
		night_vision_ring_3 = new NightVision3Ring("night_vision_ring_3");

		resistance_ring = new ResistanceRing("resistance_ring");
		resistance_ring_2 = new Resistance2Ring("resistance_ring_2");
		resistance_ring_3 = new Resistance3Ring("resistance_ring_3");

		breathing_ring = new BreathingRing("breathing_ring");
		breathing_ring_2 = new Breathing2Ring("breathing_ring_2");
		breathing_ring_3 = new Breathing3Ring("breathing_ring_3");

	    regeneration_ring = new RegenerationRing("regeneration_ring");
		regeneration_ring_2 = new Regeneration2Ring("regeneration_ring_2");
		regeneration_ring_3 = new Regeneration3Ring("regeneration_ring_3");

		invisibility_ring = new InvisibilityRing("invisibility_ring");
		invisibility_ring_2 = new Invisibility2Ring("invisibility_ring_2");
		invisibility_ring_3 = new Invisibility3Ring("invisibility_ring_3");

		wither_ring = new WitherRing("wither_ring");
		wither_ring_2 = new Wither2Ring("wither_ring_2");
		wither_ring_3 = new Wither3Ring("wither_ring_3");
	}
	
	public static void registerItems() {
		
		GameRegistry.registerItem(token, "token");
		
		GameRegistry.registerItem(items_craft, "items_craft");
		
		GameRegistry.registerItem(item_ring, "item_ring");
		
		GameRegistry.registerItem(angel_ring, "angel_ring");
		
		GameRegistry.registerItem(stuff_of_light, "stuff_of_light");
		
		GameRegistry.registerItem(weakness_ring, "weakness_ring");
		GameRegistry.registerItem(weakness_ring_2, "weakness_ring_2");
		GameRegistry.registerItem(weakness_ring_3, "weakness_ring_3");
		
		GameRegistry.registerItem(poison_ring, "poison_ring");
		GameRegistry.registerItem(poison_ring_2, "poison_ring_2");
		GameRegistry.registerItem(poison_ring_3, "poison_ring_3");
		
		GameRegistry.registerItem(slowness_ring, "slowness_ring");
		GameRegistry.registerItem(slowness_ring_2, "slowness_ring_2");
		GameRegistry.registerItem(slowness_ring_3, "slowness_ring_3");

		GameRegistry.registerItem(speed_ring, "speed_ring");
		GameRegistry.registerItem(speed_ring_2, "speed_ring_2");
		GameRegistry.registerItem(speed_ring_3, "speed_ring_3");

		GameRegistry.registerItem(jump_ring, "jump_ring");
		GameRegistry.registerItem(jump_ring_2, "jump_ring_2");
		GameRegistry.registerItem(jump_ring_3, "jump_ring_3");

		GameRegistry.registerItem(fire_ring, "fire_ring");
		GameRegistry.registerItem(fire_ring_2, "fire_ring_2");
		GameRegistry.registerItem(fire_ring_3, "fire_ring_3");

		GameRegistry.registerItem(strength_ring, "strength_ring");
		GameRegistry.registerItem(strength_ring_2, "strength_ring_2");
		GameRegistry.registerItem(strength_ring_3, "strength_ring_3");

		GameRegistry.registerItem(haste_ring, "haste_ring");
		GameRegistry.registerItem(haste_ring_2, "haste_ring_2");
		GameRegistry.registerItem(haste_ring_3, "haste_ring_3");

		GameRegistry.registerItem(resistance_ring, "resistance_ring");
		GameRegistry.registerItem(resistance_ring_2, "resistance_ring_2");
		GameRegistry.registerItem(resistance_ring_3, "resistance_ring_3");

		GameRegistry.registerItem(night_vision_ring, "night_vision_ring");
		GameRegistry.registerItem(night_vision_ring_2, "night_vision_ring_2");
		GameRegistry.registerItem(night_vision_ring_3, "night_vision_ring_3");
		
		GameRegistry.registerItem(breathing_ring, "breathing_ring");
		GameRegistry.registerItem(breathing_ring_2, "breathing_ring_2");
		GameRegistry.registerItem(breathing_ring_3, "breathing_ring_3");

		GameRegistry.registerItem(regeneration_ring, "regeneration_ring");
		GameRegistry.registerItem(regeneration_ring_2, "regeneration_ring_2");
		GameRegistry.registerItem(regeneration_ring_3, "regeneration_ring_3");

		GameRegistry.registerItem(invisibility_ring, "invisibility_ring");
		GameRegistry.registerItem(invisibility_ring_2, "invisibility_ring_2");
		GameRegistry.registerItem(invisibility_ring_3, "invisibility_ring_3");

		GameRegistry.registerItem(wither_ring, "wither_ring");
		GameRegistry.registerItem(wither_ring_2, "wither_ring_2");
		GameRegistry.registerItem(wither_ring_3, "wither_ring_3");
	}
	
	public static void registerItemsOre() {
		OreDictionary.registerOre("token", token);
		
		OreDictionary.registerOre("items_craft", items_craft);
		
		OreDictionary.registerOre("item_ring", item_ring);
		
		OreDictionary.registerOre("angel_ring", angel_ring);
		
		OreDictionary.registerOre("stuff_of_light", stuff_of_light);
		
		OreDictionary.registerOre("speed_ring", speed_ring);
		OreDictionary.registerOre("speed_ring_2", speed_ring_2);
		OreDictionary.registerOre("speed_ring_3", speed_ring_3);
		
		OreDictionary.registerOre("wither_ring", wither_ring);
		OreDictionary.registerOre("wither_ring_2", wither_ring_2);
		OreDictionary.registerOre("wither_ring_3", wither_ring_3);
		
		OreDictionary.registerOre("invisibility_ring", invisibility_ring);
		OreDictionary.registerOre("invisibility_ring_2", invisibility_ring_2);
		OreDictionary.registerOre("invisibility_ring_3", invisibility_ring_3);
		
		OreDictionary.registerOre("regeneration_ring", regeneration_ring);
		OreDictionary.registerOre("regeneration_ring_2", regeneration_ring_2);
		OreDictionary.registerOre("regeneration_ring_3", regeneration_ring_3);
		
		OreDictionary.registerOre("breathing_ring", breathing_ring);
		OreDictionary.registerOre("breathing_ring_2", breathing_ring_2);
		OreDictionary.registerOre("breathing_ring_3", breathing_ring_3);
		
		OreDictionary.registerOre("night_vision_ring", night_vision_ring);
		OreDictionary.registerOre("night_vision_ring_2", night_vision_ring_2);
		OreDictionary.registerOre("night_vision_ring_3", night_vision_ring_3);
		
		OreDictionary.registerOre("resistance_ring", resistance_ring);
		OreDictionary.registerOre("resistance_ring_2", resistance_ring_2);
		OreDictionary.registerOre("resistance_ring_3", resistance_ring_3);
		
		OreDictionary.registerOre("haste_ring", haste_ring);
		OreDictionary.registerOre("haste_ring_2", haste_ring_2);
		OreDictionary.registerOre("haste_ring_3", haste_ring_3);
		
		OreDictionary.registerOre("strength_ring", strength_ring);
		OreDictionary.registerOre("strength_ring_2", strength_ring_2);
		OreDictionary.registerOre("strength_ring_3", strength_ring_3);
		
		OreDictionary.registerOre("fire_ring", fire_ring);
		OreDictionary.registerOre("fire_ring_2", fire_ring_2);
		OreDictionary.registerOre("fire_ring_3", fire_ring_3);
		
		OreDictionary.registerOre("jump_ring", jump_ring);
		OreDictionary.registerOre("jump_ring_2", jump_ring_2);
		OreDictionary.registerOre("jump_ring_3", jump_ring_3);
	}
	
	public static void registerGrass() {
		MinecraftForge.addGrassSeed(new ItemStack(ModItems.items_craft, 1, 5), 1);
	}

}
