package com.xSowl.betterrings.creative_tabs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.xSowl.betterrings.item.ModItems;
import com.xSowl.betterrings.util.ICreativeTabSorting;
import com.xSowl.betterrings.util.LogHelper;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class BetterRingsTab extends CreativeTabs {

	private itemSorter alphabeticalSorter;

	public BetterRingsTab(final String label) {
		super(label);
		this.alphabeticalSorter = new itemSorter();
	}

	@SideOnly(Side.CLIENT)
	public ItemStack getIconItemStack() {
		if (ModItems.angel_ring != null) {
			return new ItemStack(ModItems.angel_ring, 1, 0);
		}
		if (ModItems.angel_ring != null) {
			return new ItemStack(ModItems.angel_ring, 1, 0);
		}
		return null;
	}

	@SideOnly(Side.CLIENT)
	public void displayAllReleventItems(final List par1List) {
		final List newList = new ArrayList();
		super.displayAllReleventItems(newList);
		Collections.sort((List<Object>) newList, this.alphabeticalSorter);
		par1List.addAll(newList);
		for (final ItemStack item : (ArrayList<ItemStack>) newList) {
			if (item.getDisplayName().endsWith(".name")) {
				LogHelper.debug("Missing localization data for " + item.getDisplayName(), new Object[0]);
			}
		}
	}

	@SideOnly(Side.CLIENT)
	public Item getTabIconItem() {
		return null;
	}

	private static class itemSorter implements Comparator {
		@Override
		public int compare(final Object arg0, final Object arg1) {
			final ItemStack i0 = (ItemStack) arg0;
			final ItemStack i2 = (ItemStack) arg1;
			if (i0.getItem() instanceof ItemBlock && !(i2.getItem() instanceof ItemBlock)) {
				return -1;
			}
			if (i2.getItem() instanceof ItemBlock && !(i0.getItem() instanceof ItemBlock)) {
				return 1;
			}
			final String a = this.getString(i0);
			final String b = this.getString(i2);
			return (int) Math.signum(a.compareToIgnoreCase(b));
		}

		public String getString(final ItemStack item) {
			if (item.getItem() instanceof ICreativeTabSorting) {
				return ((ICreativeTabSorting) item.getItem()).getSortingName(item);
			}
			if (item.getItem() instanceof ItemBlock) {
				final Block block_id = ((ItemBlock) item.getItem()).field_150939_a;
				if (block_id instanceof ICreativeTabSorting) {
					((ICreativeTabSorting) block_id).getSortingName(item);
				}
			}
			return item.getDisplayName();
		}
	}

}
