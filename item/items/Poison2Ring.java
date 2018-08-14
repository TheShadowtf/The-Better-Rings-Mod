package com.xSowl.betterrings.item.items;

import java.util.List;

import com.xSowl.betterrings.item.init.BTTRItem;
import com.xSowl.betterrings.item.init.IItem;
import com.xSowl.betterrings.main.BetterRingsCore;
import com.xSowl.betterrings.main.Reference;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.StatCollector;
import net.minecraft.world.World;

public class Poison2Ring extends BTTRItem implements IItem{

	public Poison2Ring(String name){
		this.setCreativeTab(BetterRingsCore.BetterRingsTab);
		this.setUnlocalizedName("poison_ring_2");
		this.setTextureName(Reference.MODID + ":" + name);
		this.setHasSubtypes(true);
		this.setMaxStackSize(1);
	}
	
	public void onUpdate(final ItemStack itemStack, final World world, final Entity entity, final int i, final boolean b) {
        super.onUpdate(itemStack, world, entity, i, b);
        if (entity instanceof EntityLivingBase) {
            ((EntityLivingBase)entity).addPotionEffect(new PotionEffect(Potion.poison.id, 0, 1));
        }
    }
	
	public int getEntityLifespan(final ItemStack itemStack, final World world) {
        return 2147473647;
    }
	
	@SideOnly(Side.CLIENT)
	public void addInformation(final ItemStack par1ItemStack, final EntityPlayer par2EntityPlayer, final List par3List,
			final boolean par4) {
		par3List.add(("" + StatCollector.translateToLocal("Give to player poison II.").trim()));
		par3List.add(("PS: This item is for troll."));
		super.addInformation(par1ItemStack, par2EntityPlayer, par3List, par4);
	}
	
	@Override
	public String getUnlocalizedName(ItemStack itemstack) {
		switch (itemstack.getItemDamage()) {
		case 0:
			return "bttrm.poison_ring_2";
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
