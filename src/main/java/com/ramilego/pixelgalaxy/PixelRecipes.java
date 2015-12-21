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
				'S', PixelGalaxyItems.pixelWoodStickItem});
			
			//Pixelizer Hoe
			GameRegistry.addRecipe(new ItemStack(PixelGalaxyItems.pixelizerHoe, 1), new Object[]{
				"PP ",
				" S ",
				" S ",
				'P', PixelGalaxyItems.pixelizerIngot,
				'S', PixelGalaxyItems.pixelWoodStickItem
			});
			
			GameRegistry.addRecipe(new ItemStack(PixelGalaxyItems.pixelizerHoe, 1), new Object[]{
				" PP",
				" S ",
				" S ",
				'P', PixelGalaxyItems.pixelizerIngot,
				'S', PixelGalaxyItems.pixelWoodStickItem
			});
			
			//Pixelizer Pickaxe
			GameRegistry.addRecipe(new ItemStack(PixelGalaxyItems.pixelizerPickaxe, 1), new Object[]{
				"PPP",
				" S ",
				" S ",
				'P', PixelGalaxyItems.pixelizerIngot,
				'S', PixelGalaxyItems.pixelWoodStickItem
			});
			
			//Pixelizer Shovel
			GameRegistry.addRecipe(new ItemStack(PixelGalaxyItems.pixelizerShovel, 1), new Object[]{
				" P ",
				" S ",
				" S ",
				'P', PixelGalaxyItems.pixelizerIngot,
				'S', PixelGalaxyItems.pixelWoodStickItem
			});
			
			//Pixelizer Axe
			GameRegistry.addRecipe(new ItemStack(PixelGalaxyItems.pixelizerAxe, 1), new Object[]{
				" PP",
				" SP",
				" S ",
				'P', PixelGalaxyItems.pixelizerIngot,
				'S', PixelGalaxyItems.pixelWoodStickItem
			});
			
			//Pixelizer Axe
			GameRegistry.addRecipe(new ItemStack(PixelGalaxyItems.pixelizerAxe, 1), new Object[]{
				"PP ",
				"PS ",
				" S ",
				'P', PixelGalaxyItems.pixelizerIngot,
				'S', PixelGalaxyItems.pixelWoodStickItem
			});
			
			//diamondPixel Sword
			GameRegistry.addRecipe(new ItemStack(PixelGalaxyItems.diamondPixelSword, 1), new Object[]{
				" D ",
				" D ",
				" S ",
				'D', PixelGalaxyItems.diamondPixel,
				'S', PixelGalaxyItems.pixelWoodStickItem
			});
			
			//diamondPixel Hoe
			GameRegistry.addRecipe(new ItemStack(PixelGalaxyItems.diamondPixelHoe, 1), new Object[]{
				"DD ",
				" S ",
				" S ",
				'D', PixelGalaxyItems.diamondPixel,
				'S', PixelGalaxyItems.pixelWoodStickItem
			});
			
			//diamondPixel Hoe
			GameRegistry.addRecipe(new ItemStack(PixelGalaxyItems.diamondPixelHoe, 1), new Object[]{
				" DD",
				" S ",
				" S ",
				'D', PixelGalaxyItems.diamondPixel,
				'S', PixelGalaxyItems.pixelWoodStickItem
			});
			
			//diamondPixel Pickaxe
			GameRegistry.addRecipe(new ItemStack(PixelGalaxyItems.diamondPixelPickaxe, 1), new Object[]{
				"DDD",
				" S ",
				" S ",
				'D', PixelGalaxyItems.diamondPixel,
				'S', PixelGalaxyItems.pixelWoodStickItem
			});
			
			//diamondPixel Shovel
			GameRegistry.addRecipe(new ItemStack(PixelGalaxyItems.diamondPixelShovel, 1), new Object[]{
				" D ",
				" S ",
				" S ",
				'D', PixelGalaxyItems.diamondPixel,
				'S', PixelGalaxyItems.pixelWoodStickItem
			});
			
			//diamondPixel Axe
			GameRegistry.addRecipe(new ItemStack(PixelGalaxyItems.diamondPixelAxe, 1), new Object[]{
				" DD",
				" SD",
				" S ",
				'D', PixelGalaxyItems.diamondPixel,
				'S', PixelGalaxyItems.pixelWoodStickItem
			});
			
			GameRegistry.addRecipe(new ItemStack(PixelGalaxyItems.diamondPixelAxe, 1), new Object[]{
				"DD ",
				"DS ",
				" S ",
				'D', PixelGalaxyItems.diamondPixel,
				'S', PixelGalaxyItems.pixelWoodStickItem
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
		//diamondPixel Block
			GameRegistry.addRecipe(new ItemStack(PixelGalaxyBlocks.pixelizerdiamondBlock, 1), new Object[]{
				"DDD",
				"DDD",
				"DDD",
				'D', PixelGalaxyItems.diamondPixel
			});
			
		//Pixel Wood Block Level 0:
			GameRegistry.addRecipe(new ItemStack(PixelGalaxyBlocks.pixelWoodBlock, 1), new Object[]{
					"WW ",
					"WW ",
					"   ",
					'W', PixelGalaxyItems.pixelWoodItem
				});
			
			GameRegistry.addShapelessRecipe(new ItemStack(PixelGalaxyItems.pixelizerIngot, 9), new Object[]{ PixelGalaxyBlocks.pixelizerBlock });
			GameRegistry.addShapelessRecipe(new ItemStack(PixelGalaxyItems.diamondPixel, 9), new Object[]{ PixelGalaxyBlocks.pixelizerdiamondBlock });
			GameRegistry.addShapelessRecipe(new ItemStack(PixelGalaxyItems.pixelWoodStickItem, 4), new Object[]{ PixelGalaxyItems.pixelWoodItem });
	}
	
	public static void registerSmeltingRecipes(){
		GameRegistry.addSmelting(PixelGalaxyBlocks.pixelizerOre, new ItemStack(PixelGalaxyItems.pixelizerIngot, 1), 1.0F);
		GameRegistry.addSmelting(PixelGalaxyBlocks.pixelizerDiamondOre, new ItemStack(PixelGalaxyItems.diamondPixel, 1), 1.0F);
	}
}
