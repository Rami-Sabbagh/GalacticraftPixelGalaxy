package com.ramilego.pixelgalaxy;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

import com.ramilego.pixelgalaxy.blocks.PixelGalaxyBlocks;
import com.ramilego.pixelgalaxy.items.PixelGalaxyItems;

import cpw.mods.fml.common.registry.GameRegistry;

public class PixelRecipes {
	public static void registerCraftingRecipes(){
		//Tools :
			//Pixelizer Sword
			GameRegistry.addRecipe(new ItemStack(PixelGalaxyItems.pixelizerSword, 1), new Object[]{
				" P ",
				" P ",
				" S ",
				'P', PixelGalaxyItems.pixelizerIngot,
				'S', Items.stick});
			
			//Pixelizer Hoe
			GameRegistry.addRecipe(new ItemStack(PixelGalaxyItems.pixelizerHoe, 1), new Object[]{
				"PP ",
				" S ",
				" S ",
				'P', PixelGalaxyItems.pixelizerIngot,
				'S', Items.stick
			});
			
			GameRegistry.addRecipe(new ItemStack(PixelGalaxyItems.pixelizerHoe, 1), new Object[]{
				" PP",
				" S ",
				" S ",
				'P', PixelGalaxyItems.pixelizerIngot,
				'S', Items.stick
			});
			
			//Pixelizer Pickaxe
			GameRegistry.addRecipe(new ItemStack(PixelGalaxyItems.pixelizerPickaxe, 1), new Object[]{
				"PPP",
				" S ",
				" S ",
				'P', PixelGalaxyItems.pixelizerIngot,
				'S', Items.stick
			});
			
			//Pixelizer Shovel
			GameRegistry.addRecipe(new ItemStack(PixelGalaxyItems.pixelizerShovel, 1), new Object[]{
				" P ",
				" S ",
				" S ",
				'P', PixelGalaxyItems.pixelizerIngot,
				'S', Items.stick
			});
			
			//Pixelizer Axe
			GameRegistry.addRecipe(new ItemStack(PixelGalaxyItems.pixelizerAxe, 1), new Object[]{
				" PP",
				" SP",
				" S ",
				'P', PixelGalaxyItems.pixelizerIngot,
				'S', Items.stick
			});
			
			GameRegistry.addRecipe(new ItemStack(PixelGalaxyItems.pixelizerAxe, 1), new Object[]{
				"PP ",
				"PS ",
				" S ",
				'P', PixelGalaxyItems.pixelizerIngot,
				'S', Items.stick
			});
		
		//Armors:
			//Pixelizer Helmet
			GameRegistry.addRecipe(new ItemStack(PixelGalaxyItems.pixelizerHelmet, 1), new Object[]{
				"PPP",
				"P P",
				"   ",
				'P', PixelGalaxyItems.pixelizerIngot
			});
			
			//Pixelizer Chestplate
			GameRegistry.addRecipe(new ItemStack(PixelGalaxyItems.pixelizerChestplate, 1), new Object[]{
				"P P",
				"PPP",
				"PPP",
				'P', PixelGalaxyItems.pixelizerIngot
			});
			
			//Pixelizer Legging
			GameRegistry.addRecipe(new ItemStack(PixelGalaxyItems.pixelizerLeggings, 1), new Object[]{
				"PPP",
				"P P",
				"P P",
				'P', PixelGalaxyItems.pixelizerIngot
			});
			
			//Pixelizer Boots
			GameRegistry.addRecipe(new ItemStack(PixelGalaxyItems.pixelizerBoots, 1), new Object[]{
				"   ",
				"P P",
				"P P",
				'P', PixelGalaxyItems.pixelizerIngot
			});
			
			GameRegistry.addRecipe(new ItemStack(PixelGalaxyItems.pixelizerBoots, 1), new Object[]{
				"P P",
				"P P",
				"   ",
				'P', PixelGalaxyItems.pixelizerIngot
			});
			
		//Pixelizer Block :
			GameRegistry.addRecipe(new ItemStack(PixelGalaxyBlocks.pixelizerBlock, 1), new Object[]{
				"PPP",
				"PPP",
				"PPP",
				'P', PixelGalaxyItems.pixelizerIngot
			});
			
			GameRegistry.addShapelessRecipe(new ItemStack(PixelGalaxyItems.pixelizerIngot, 9), new Object[]{ PixelGalaxyBlocks.pixelizerBlock });
	}
	
	public static void registerSmeltingRecipes(){
		GameRegistry.addSmelting(PixelGalaxyBlocks.pixelizerOre, new ItemStack(PixelGalaxyItems.pixelizerIngot, 1), 1.0F);
	}
}
