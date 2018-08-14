package com.xSowl.betterrings.item.items;

import java.util.List;

import com.xSowl.betterrings.block.ModBlocks;
import com.xSowl.betterrings.item.init.BTTRItem;
import com.xSowl.betterrings.item.init.IItem;
import com.xSowl.betterrings.main.BetterRingsCore;
import com.xSowl.betterrings.main.Reference;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;
import net.minecraft.util.StatCollector;
import net.minecraft.world.World;

public class StuffOfLight extends BTTRItem implements IItem {
	
	public StuffOfLight(String name) {
		this.setCreativeTab((CreativeTabs)BetterRingsCore.BetterRingsTab);
		this.setUnlocalizedName("stuff_of_light");
		this.maxStackSize = 1;
		this.setMaxDamage(100);
		this.setTextureName(Reference.MODID + ":" + name);
	}
	
	public boolean onItemUse(ItemStack p_77648_1_, EntityPlayer p_77648_2_, World p_77648_3_, int p_77648_4_, int p_77648_5_, int p_77648_6_, int p_77648_7_, float p_77648_8_, float p_77648_9_, float p_77648_10_)
    {
        if(p_77648_3_.getBlock(p_77648_4_, p_77648_5_, p_77648_6_).isReplaceable(p_77648_3_, p_77648_4_, p_77648_5_, p_77648_6_) && p_77648_7_ != 0)
        {
            p_77648_7_ = 1;
            p_77648_5_--;
        }
        if (p_77648_7_ == 0)
        {
            return false;
        }
        else if (!p_77648_3_.isSideSolid(p_77648_4_, p_77648_5_, p_77648_6_, net.minecraftforge.common.util.ForgeDirection.getOrientation(p_77648_7_)))
        {
            return false;
        }
        else
        {
            if (p_77648_7_ == 1)
            {
                ++p_77648_5_;
            }

            if (p_77648_7_ == 2)
            {
                --p_77648_6_;
            }

            if (p_77648_7_ == 3)
            {
                ++p_77648_6_;
            }

            if (p_77648_7_ == 4)
            {
                --p_77648_4_;
            }

            if (p_77648_7_ == 5)
            {
                ++p_77648_4_;
            }

        }
        {
            if (!p_77648_3_.isRemote)
            {
            	p_77648_1_.damageItem(1, p_77648_2_);
                if (!ModBlocks.ghost_light.canPlaceBlockOnSide(p_77648_3_, p_77648_4_, p_77648_5_, p_77648_6_, p_77648_7_)) return false;
                p_77648_3_.setBlock(p_77648_4_, p_77648_5_, p_77648_6_, ModBlocks.ghost_light, p_77648_7_, 2);
                int i1 = 0;

                if (p_77648_7_ == 1)
                {
                    i1 = MathHelper.floor_double((double)(p_77648_2_.rotationYaw * 16.0F / 360.0F) + 0.5D) & 15;
                }
                p_77648_3_.playSoundAtEntity(p_77648_2_, "random.levelup", 1.0F, 5.0F);
            }

            return true;
        }
    }
	
//	 public boolean onItemUse(ItemStack itemStack, EntityPlayer player, World world, int posX, int posY, int posZ, int i, float x, float y, float z) {
//	        if (world.isRemote)
//	        {
//	            return true;
//	        }
//	        else if (i != 1)
//	        {
//	            return false;
//	        }
//	        else
//	        {
//	            ++posY;
//	            GhostLight ghost_light = (GhostLight)ModBlocks.ghost_light;
//	            int i1 = MathHelper.floor_double((double)(player.rotationYaw * 4.0F / 360.0F) + 0.5D) & 3;
//	            byte b0 = 0;
//	            byte b1 = 0;
//
//	            if (i1 == 0)
//	            {
//	                b1 = 1;
//	            }
//
//	            if (i1 == 1)
//	            {
//	                b0 = -1;
//	            }
//
//	            if (i1 == 2)
//	            {
//	                b1 = -1;
//	            }
//
//	            if (i1 == 3)
//	            {
//	                b0 = 1;
//	            }
//
//	            if (player.canPlayerEdit(posX, posY, posZ, i, itemStack) && player.canPlayerEdit(posX + b0, posY, posZ + b1, i, itemStack))
//	            {
//	                if (world.isAirBlock(posX, posY, posZ) && world.isAirBlock(posX + b0, posY, posZ + b1) && World.doesBlockHaveSolidTopSurface(world, posX, posY - 1, posZ) && World.doesBlockHaveSolidTopSurface(world, posY + b0, posY - 1, posZ + b1))
//	                {
//	                	world.setBlock(posX, posY, posZ, ghost_light, i1, 3);
//	                	
//	                    //--itemStack.stackSize;
//	                    return true;
//	                }
//	                else
//	                {
//	                    return false;
//	                }
//	                
//	            }
//	            else
//	            {
//	                return false;
//	            }
//	            
//		}
//	}
	 
	 @SideOnly(Side.CLIENT)
		public void addInformation(final ItemStack par1ItemStack, final EntityPlayer par2EntityPlayer, final List par3List,
				final boolean par4) {
			par3List.add(("" + StatCollector.translateToLocal("Right click for place a ghost light.").trim()));
			super.addInformation(par1ItemStack, par2EntityPlayer, par3List, par4);
		}
	 
	 @Override
		public String getUnlocalizedName(ItemStack itemstack) {
			switch (itemstack.getItemDamage()) {
			case 0:
				return "bttrm.stuff_of_light";
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
