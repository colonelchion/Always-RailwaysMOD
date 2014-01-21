package shion.minecraft.mods;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class IPod extends Item
{
    public IPod(int par1)
    {
	super(par1);
	setCreativeTab(CreativeTabs.tabMaterials);
	setUnlocalizedName("IPod");
	setTextureName("forge:ipod");
	setMaxStackSize(64);
    }

    public boolean onItemUse(ItemStack item, EntityPlayer player, World world, int x, int y, int z, int side, float disX, float disY, float disZ)
    {
	return false;
    }

    public ItemStack onItemRightClick(ItemStack item, World world, EntityPlayer player)
    {
	return item;
    }
}