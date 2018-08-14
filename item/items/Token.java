package com.xSowl.betterrings.item.items;

import java.util.List;

import com.xSowl.betterrings.item.init.BTTRItem;
import com.xSowl.betterrings.item.init.IItem;
import com.xSowl.betterrings.main.BetterRingsCore;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

public class Token extends BTTRItem implements IItem {

	@SideOnly(Side.CLIENT)
	private IIcon[] materialIcons;

	public Token(String name) {
		this.setUnlocalizedName(name);
		this.setCreativeTab(BetterRingsCore.BetterRingsTab);
		this.setHasSubtypes(true);
	}

	@Override
	public String getUnlocalizedName(ItemStack itemstack) {
		switch (itemstack.getItemDamage()) {
		case 0:
			return "bttrm.token_blank";
		case 1:
			return "bttrm.token_speed";
		case 2:
			return "bttrm.token_night_vision";
		case 3:
			return "bttrm.token_poison";
		case 4:
			return "bttrm.token_weakness";
		case 5:
			return "bttrm.token_fire_resistance";
		case 6:
			return "bttrm.token_strength";
		case 7:
			return "bttrm.token_haste";
		case 8:
			return "bttrm.token_jump";
		case 9:
			return "bttrm.token_resistance";
		case 10:
			return "bttrm.token_breathing";
		case 11:
			return "bttrm.token_regeneration";
		case 12:
			return "bttrm.token_invisibility";
		case 13:
			return "bttrm.token_wither";
		case 14:
			return "bttrm.token_slowness";
		}

		return super.getUnlocalizedName(itemstack);
	}

	@Override
	public void onCreated(ItemStack itemstack, World world, EntityPlayer player) {
		super.onCreated(itemstack, world, player);

		switch (itemstack.getItemDamage()) {

		}
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerIcons(IIconRegister iconRegister) {
		materialIcons = new IIcon[15];
		materialIcons[0] = iconRegister.registerIcon("bttrm:token_blank");
		materialIcons[1] = iconRegister.registerIcon("bttrm:token_speed");
		materialIcons[2] = iconRegister.registerIcon("bttrm:token_night_vision");
		materialIcons[3] = iconRegister.registerIcon("bttrm:token_poison");
		materialIcons[4] = iconRegister.registerIcon("bttrm:token_weakness");
		materialIcons[5] = iconRegister.registerIcon("bttrm:token_fire_resistance");
		materialIcons[6] = iconRegister.registerIcon("bttrm:token_strength");
		materialIcons[7] = iconRegister.registerIcon("bttrm:token_haste");
		materialIcons[8] = iconRegister.registerIcon("bttrm:token_jump");
		materialIcons[9] = iconRegister.registerIcon("bttrm:token_resistance");
		materialIcons[10] = iconRegister.registerIcon("bttrm:token_breathing");
		materialIcons[11] = iconRegister.registerIcon("bttrm:token_regeneration");
		materialIcons[12] = iconRegister.registerIcon("bttrm:token_invisibility");
		materialIcons[13] = iconRegister.registerIcon("bttrm:token_wither");
		materialIcons[14] = iconRegister.registerIcon("bttrm:token_slowness");
	}

	@SideOnly(Side.CLIENT)
	@Override
	public IIcon getIconFromDamage(int damage) {
		if (damage < 0 || damage >= materialIcons.length) {
			return super.getIconFromDamage(damage);
		}

		return materialIcons[damage];
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void getSubItems(Item item, CreativeTabs tab, List list) {
		for (int i = 0; i < materialIcons.length; ++i) {
			list.add(new ItemStack(item, 1, i));
		}
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
