package com.xSowl.betterrings.block.blocks;

import com.xSowl.betterrings.block.init.IBlock;
import com.xSowl.betterrings.main.BetterRingsCore;
import com.xSowl.betterrings.main.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class RingMaterialOreEnd extends Block implements IBlock {

	public RingMaterialOreEnd() {
		super(Material.rock);
		this.setBlockName(this.getBlockName());
		this.setStepSound(soundTypeStone);
		this.setBlockTextureName(Reference.MODID + ":" + this.getBlockName());
        this.setCreativeTab((CreativeTabs)BetterRingsCore.BetterRingsTab);
	}

	@Override
	public String getBlockName() {
		return "ring_material_ore_end";
	}

}
