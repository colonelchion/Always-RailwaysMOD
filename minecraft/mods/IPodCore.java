package shion.minecraft.mods;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

@Mod(modid="IPod", name="IPod", version="1.1")
public class IPodCore
{
    public static Item IPod;
    public static int IPodID = 28550;

    @Mod.EventHandler
	public void init(FMLInitializationEvent event) {
	LanguageRegistry.addName(IPod, "IPod");
	LanguageRegistry.instance().addNameForObject(IPod, "ja_JP", "IPod グリーン");
    }

    @Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) {
	IPod = new IPod(IPodID);
	GameRegistry.registerItem(IPod, "IPod");

	GameRegistry.addRecipe(new ItemStack(IPod, 1), 
			       new Object[] { "XXX", "XXX", "XXX", 
					      'X', Item.appleRed });
    }
}