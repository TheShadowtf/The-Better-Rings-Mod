package com.xSowl.betterrings.item.items;

import java.util.List;

import com.xSowl.betterrings.item.init.BTTRItem;
import com.xSowl.betterrings.item.init.IItem;
import com.xSowl.betterrings.main.BetterRingsCore;
import com.xSowl.betterrings.main.Reference;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

public class ModItemsCraft extends BTTRItem implements IItem {

	@SideOnly(Side.CLIENT)
	private IIcon[] materialIcons;

	public ModItemsCraft(String name) {
		this.setUnlocalizedName(name);
		this.setCreativeTab(BetterRingsCore.BetterRingsTab);
		this.setHasSubtypes(true);
	}

	@Override
	public String getUnlocalizedName(ItemStack itemstack) {
		switch (itemstack.getItemDamage()) {
		case 0:
			return Reference.MODID + "." + "fly_core";
		case 1:
			return Reference.MODID + "." + "gold_feather";
		case 2:
			return Reference.MODID + "." + "wing";
		case 3:
			return Reference.MODID + "." + "stick";
		case 4:
			return Reference.MODID + "." + "light_ball";
		case 5:
			return Reference.MODID + "." + "raw_glue";
		case 6:
			return Reference.MODID + "." + "glue";
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
		materialIcons = new IIcon[7];
		materialIcons[0] = iconRegister.registerIcon(Reference.MODID + ":" + "fly_core");
		materialIcons[1] = iconRegister.registerIcon(Reference.MODID + ":" + "gold_feather");
		materialIcons[2] = iconRegister.registerIcon(Reference.MODID + ":" + "wing");
		materialIcons[3] = iconRegister.registerIcon(Reference.MODID + ":" + "stick");
		materialIcons[4] = iconRegister.registerIcon(Reference.MODID + ":" + "light_ball");
		materialIcons[5] = iconRegister.registerIcon(Reference.MODID + ":" + "raw_glue");
		materialIcons[6] = iconRegister.registerIcon(Reference.MODID + ":" + "glue");
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
		return null;
	}

	@Override
	public int getItemStack() {
		return 0;
	}

}
