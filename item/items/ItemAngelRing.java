package com.xSowl.betterrings.item.items;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.xSowl.betterrings.helper.XUHelper;
import com.xSowl.betterrings.item.init.BTTRItem;
import com.xSowl.betterrings.item.init.IItem;
import com.xSowl.betterrings.main.BetterRingsCore;
import com.xSowl.betterrings.main.Reference;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.StatCollector;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.living.LivingEvent;

public class ItemAngelRing extends BTTRItem implements IItem {

	public static boolean foundItem;
	public static Map<String, Integer> curFlyingPlayers;

	public ItemAngelRing(String name) {
		this.setCreativeTab(BetterRingsCore.BetterRingsTab);
		this.setUnlocalizedName("angel_ring");
		this.setTextureName(Reference.MODID + ":" + name);
		this.setHasSubtypes(true);
		this.setMaxStackSize(1);
	}

	public static void addPlayer(final EntityPlayer player, final int i, final boolean override) {
		final String name = player.getGameProfile().getName();
		if (!ItemAngelRing.curFlyingPlayers.containsKey(name) || ItemAngelRing.curFlyingPlayers.get(name) == null
				|| (override && ItemAngelRing.curFlyingPlayers.get(name) != i)) {
			ItemAngelRing.curFlyingPlayers.put(name, i);
		}
	}

	public static void removePlayer(final EntityPlayer player) {
		final String name = player.getGameProfile().getName();
		if (ItemAngelRing.curFlyingPlayers.containsKey(name)) {
			ItemAngelRing.curFlyingPlayers.remove(name);
		}
	}

	@SideOnly(Side.CLIENT)
	public void addInformation(final ItemStack par1ItemStack, final EntityPlayer par2EntityPlayer, final List par3List,
			final boolean par4) {
		par3List.add(("" + StatCollector.translateToLocal("Give to player creative fly.").trim()));
		super.addInformation(par1ItemStack, par2EntityPlayer, par3List, par4);
	}

	public void onUpdate(final ItemStack itemstack, final World world, final Entity entity, final int slot,
			final boolean par5) {
		super.onUpdate(itemstack, world, entity, slot, par5);
		if (world.isRemote) {
			return;
		}
		if (!(entity instanceof EntityPlayerMP)) {
			return;
		}
		final NBTTagCompound nbt = XUHelper.getPersistantNBT(entity);
		nbt.setByte("XU|Flying", (byte) 20);
		addPlayer((EntityPlayer) entity, itemstack.getItemDamage(), par5);
		if (!((EntityPlayerMP) entity).capabilities.allowFlying || !nbt.hasKey("XU|FlyingDim")
				|| nbt.getInteger("XU|FlyingDim") != world.provider.dimensionId) {
			addPlayer((EntityPlayer) entity, itemstack.getItemDamage(), false);
			((EntityPlayerMP) entity).capabilities.allowFlying = true;
			((EntityPlayerMP) entity).sendPlayerAbilities();
		}
		nbt.setInteger("XU|FlyingDim", world.provider.dimensionId);
	}

	public void onWornTick(final ItemStack itemstack, final EntityLivingBase player) {
		this.onUpdate(itemstack, player.worldObj, (Entity) player, -1, true);
	}

	public void onEquipped(final ItemStack itemstack, final EntityLivingBase player) {
	}

	public void onUnequipped(final ItemStack itemstack, final EntityLivingBase player) {
	}

	public boolean canEquip(final ItemStack itemstack, final EntityLivingBase player) {
		return true;
	}

	public boolean canUnequip(final ItemStack itemstack, final EntityLivingBase player) {
		return true;
	}

	static {
		ItemAngelRing.foundItem = false;
		ItemAngelRing.curFlyingPlayers = new HashMap<String, Integer>();
		final EventHandlerRing handler = new EventHandlerRing();
		MinecraftForge.EVENT_BUS.register((Object) handler);
		FMLCommonHandler.instance().bus().register((Object) handler);
	}

	public static class EventHandlerRing {
		@SubscribeEvent
		public void playerLogin(final PlayerEvent.PlayerLoggedInEvent event) {
			for (final String name : MinecraftServer.getServer().getAllUsernames()) {
				if (ItemAngelRing.curFlyingPlayers.containsKey(name)) {
				}
			}
		}

		@SubscribeEvent
		public void entTick(final LivingEvent.LivingUpdateEvent event) {
			if (event.entity.worldObj.isRemote) {
				return;
			}
			ItemAngelRing.foundItem = true;
			Byte t = XUHelper.getPersistantNBT(event.entity).getByte("XU|Flying");
			t = (byte) (t - 1);
			if (t == 0) {
				XUHelper.getPersistantNBT(event.entity).removeTag("XU|Flying");
				if (event.entity instanceof EntityPlayerMP) {
					final EntityPlayerMP entityPlayer = (EntityPlayerMP) event.entity;
					ItemAngelRing.removePlayer((EntityPlayer) entityPlayer);
					if (!entityPlayer.capabilities.isCreativeMode) {
						entityPlayer.capabilities.allowFlying = false;
						entityPlayer.capabilities.isFlying = false;
						entityPlayer.sendPlayerAbilities();
					}
				}
			} else {
				XUHelper.getPersistantNBT(event.entity).setByte("XU|Flying", (byte) t);
			}
		}
	}
	
	@Override
	public String getUnlocalizedName(ItemStack itemstack) {
		switch (itemstack.getItemDamage()) {
		case 0:
			return "bttrm.angel_ring";
		}

		return super.getUnlocalizedName(itemstack);
	}

	@Override
	public String getItemName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getItemStack() {
		// TODO Auto-generated method stub
		return 0;
	}

}
