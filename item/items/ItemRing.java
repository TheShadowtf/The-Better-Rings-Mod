package com.xSowl.betterrings.item.items;

import java.util.List;

import com.xSowl.betterrings.item.init.BTTRItem;
import com.xSowl.betterrings.item.init.IItem;
import com.xSowl.betterrings.main.BetterRingsCore;
import com.xSowl.betterrings.main.Reference;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.StatCollector;

public class ItemRing extends BTTRItem implements IItem {

	public ItemRing(String name) {
		this.setCreativeTab(BetterRingsCore.BetterRingsTab);
		this.setUnlocalizedName("item_ring");
		this.setTextureName(Reference.MODID + ":" + name);
		this.setHasSubtypes(true);
		this.setMaxStackSize(64);
	}
	
	@SideOnly(Side.CLIENT)
	public void addInformation(final ItemStack par1ItemStack, final EntityPlayer par2EntityPlayer, final List par3List,
			final boolean par4) {
		par3List.add(("" + StatCollector.translateToLocal("With this item you can make every ring in this mod.").trim()));
		super.addInformation(par1ItemStack, par2EntityPlayer, par3List, par4);
	}
	
	@Override
	public String getUnlocalizedName(ItemStack itemstack) {
		switch (itemstack.getItemDamage()) {
		case 0:
			return "bttrm.item_ring";
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
