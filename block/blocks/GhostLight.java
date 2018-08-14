package com.xSowl.betterrings.block.blocks;

import java.util.Random;

import com.xSowl.betterrings.block.init.BTTRBlock;
import com.xSowl.betterrings.block.init.IBlock;
import com.xSowl.betterrings.main.BetterRingsCore;
import com.xSowl.betterrings.main.Reference;

import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.World;

public class GhostLight extends BTTRBlock implements IBlock {

	public GhostLight() {
		super(Material.wood);
		float f = 0.2F;
		this.setLightLevel(0.9375F);
		this.setTickRandomly(true);
		this.setBlockName(this.getBlockName());
		this.setStepSound(soundTypeCloth);
		this.setBlockTextureName(Reference.MODID + ":" + this.getBlockName());
        this.setCreativeTab((CreativeTabs)BetterRingsCore.BetterRingsTab);
        this.setBlockBounds(0.5F - f, 0.0F, 0.5F - f, 0.5F + f, f * 2.0F, 0.5F + f);
	}

	public AxisAlignedBB getCollisionBoundingBoxFromPool(World p_149668_1_, int p_149668_2_, int p_149668_3_,
			int p_149668_4_) {
		return null;
	}

	public boolean isOpaqueCube() {
		return false;
	}

	public boolean renderAsNormalBlock() {
		return false;
	}

	public int getRenderType() {
		return 0;
	}
	
	public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_)
    {
        return null;
    }
	
	public int quantityDropped(Random p_149745_1_)
    {
        return 0;
    }

	@Override
	public String getBlockName() {
		return "ghost_light";
	}
}
