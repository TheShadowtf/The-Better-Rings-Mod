package com.xSowl.betterrings.proxy;

import java.util.ArrayList;
import java.util.List;

import com.xSowl.betterrings.client.IClientCode;
import com.xSowl.betterrings.main.BetterRingsCore;
import com.xSowl.betterrings.network.PacketUseItemAlt;
import com.xSowl.betterrings.network.handler.PacketHandler;
import com.xSowl.betterrings.player.IPlayerRenderer;
import com.xSowl.betterrings.world.gen.WorldGenBurial;

import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;

public class ServerProxy {

	protected List<IPlayerRenderer> playerRenderers = new ArrayList<IPlayerRenderer>();

	public void preInit(FMLPreInitializationEvent e) {

		for (int i = 0; i < BetterRingsCore.getRegisteredMods().size(); i++) {
			BetterRingsCore.getRegisteredMods().get(i).getEntityManager().registerEntities();
		}
	}

	public void init(FMLInitializationEvent e) {
		for (int i = 0; i < BetterRingsCore.getRegisteredMods().size(); i++) {
			BetterRingsCore.getRegisteredMods().get(i).getMonsterManager().registerMobs();
		}

		GameRegistry.registerWorldGenerator(new WorldGenBurial(), 5);
	}

	public void registerRenderInformation() {

	}

	public void postInit(FMLPostInitializationEvent e) {
		//
	}

	public void displayBookJournalGUI(EntityPlayer player, ItemStack stack) {
		;
	}

	public void registerPlayerRenderer(IPlayerRenderer... renderers) {
		;
	}

	public List<IPlayerRenderer> getPlayerRenderers() {
		return playerRenderers;
	}

	// Client Only
	public void registerRenderers() {
	}

	public void spawnParticle(String string, double x, double y, double z, Object... args) {
	}

	public int addArmor(String armor) {
		return 0;
	}

	public void sendUsePacket(final PlayerInteractEvent event) {

	}

	public void sendUsePacket(final int x, final int y, final int z, final int face, final ItemStack item,
			final float f, final float f1, final float f2) {

	}

	public boolean isAltSneaking() {
		return PacketUseItemAlt.altPlace.get() == Boolean.TRUE;
	}

	public void registerClientCommands() {

	}

	public PacketHandler getNewPacketHandler() {
		return new PacketHandler();
	}

	public void exectuteClientCode(final IClientCode clientCode) {

	}

	public void sendAltUsePacket(final int x, final int y, final int z, final int face, final ItemStack item,
			final float f, final float f1, final float f2) {

	}

	public void sendAltUsePacket(final ItemStack item) {

	}

}
