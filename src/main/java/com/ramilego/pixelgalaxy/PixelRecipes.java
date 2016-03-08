package com.ramilego.pixelgalaxy;

import net.minecraft.init.Blocks;
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
/*------------------------------------------------------------------------------------------------------------------------------------*/			
			//IronPixel Sword
			GameRegistry.addRecipe(new ItemStack(PixelGalaxyItems.ironPixelSword, 1), new Object[]{
				" D ",
				" D ",
				" S ",
				'D', PixelGalaxyItems.ironPixelIngot,
				'S', PixelGalaxyItems.pixelWoodStickItem
			});
			
			//IronPixel Hoe
			GameRegistry.addRecipe(new ItemStack(PixelGalaxyItems.ironPixelHoe, 1), new Object[]{
				"DD ",
				" S ",
				" S ",
				'D', PixelGalaxyItems.ironPixelIngot,
				'S', PixelGalaxyItems.pixelWoodStickItem
			});
			
			GameRegistry.addRecipe(new ItemStack(PixelGalaxyItems.ironPixelHoe, 1), new Object[]{
				" DD",
				" S ",
				" S ",
				'D', PixelGalaxyItems.ironPixelIngot,
				'S', PixelGalaxyItems.pixelWoodStickItem
			});
			
			//IronPixel Pickaxe
			GameRegistry.addRecipe(new ItemStack(PixelGalaxyItems.ironPixelPickaxe, 1), new Object[]{
				"DDD",
				" S ",
				" S ",
				'D', PixelGalaxyItems.ironPixelIngot,
				'S', PixelGalaxyItems.pixelWoodStickItem
			});
			
			//IronPixel Shovel
			GameRegistry.addRecipe(new ItemStack(PixelGalaxyItems.ironPixelShovel, 1), new Object[]{
				" D ",
				" S ",
				" S ",
				'D', PixelGalaxyItems.ironPixelIngot,
				'S', PixelGalaxyItems.pixelWoodStickItem
			});
			
			//IronPixel Axe
			GameRegistry.addRecipe(new ItemStack(PixelGalaxyItems.ironPixelAxe, 1), new Object[]{
				" DD",
				" SD",
				" S ",
				'D', PixelGalaxyItems.ironPixelIngot,
				'S', PixelGalaxyItems.pixelWoodStickItem
			});
			
			GameRegistry.addRecipe(new ItemStack(PixelGalaxyItems.ironPixelAxe, 1), new Object[]{
				"DD ",
				"DS ",
				" S ",
				'D', PixelGalaxyItems.ironPixelIngot,
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
			
/*-----------------------------------------------------------------------------------------------------------------------------------------*/		
			//DiamondPixel Helmet
			GameRegistry.addRecipe(new ItemStack(PixelGalaxyItems.diamondPixelHelmet, 1), new Object[]{
				"DDD",
				"D D",
				"   ",
				'D', PixelGalaxyItems.diamondPixel
			});
			//DiamondPixel Chestplate
			GameRegistry.addRecipe(new ItemStack(PixelGalaxyItems.diamondPixelChestplate, 1), new Object[]{
				"D D",
				"DDD",
				"DDD",
				'D', PixelGalaxyItems.diamondPixel
			});
			//DiamondPixel Legging
			GameRegistry.addRecipe(new ItemStack(PixelGalaxyItems.diamondPixelLeggings, 1), new Object[]{
				"DDD",
				"D D",
				"D D",
				'D', PixelGalaxyItems.diamondPixel
			});		
			//DiamondPixel Boots
			GameRegistry.addRecipe(new ItemStack(PixelGalaxyItems.diamondPixelBoots, 1), new Object[]{
				"   ",
				"D D",
				"D D",
				'D', PixelGalaxyItems.diamondPixel
			});
			GameRegistry.addRecipe(new ItemStack(PixelGalaxyItems.diamondPixelBoots, 1), new Object[]{
				"D D",
				"D D",
				"   ",
				'D', PixelGalaxyItems.diamondPixel
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
		//diamondPixel Block
			GameRegistry.addRecipe(new ItemStack(PixelGalaxyBlocks.pixelIronBlock, 1), new Object[]{
				"DDD",
				"DDD",
				"DDD",
				'D', PixelGalaxyItems.ironPixelIngot
			});
		//blueStone Block
			GameRegistry.addRecipe(new ItemStack(PixelGalaxyBlocks.GlowingBlueStoneBlock, 1), new Object[]{
					"DDD",
					"DDD",
					"DDD",
					'D', PixelGalaxyItems.blueStoneIngot
			});
			//PixelCoal Block
			GameRegistry.addRecipe(new ItemStack(PixelGalaxyBlocks.pixelCoalBlocks, 1), new Object[]{
					"DDD",
					"DDD",
					"DDD",
					'D', PixelGalaxyItems.pixelCoal
				});
		//Pixel Wood Block Level 0:
			GameRegistry.addRecipe(new ItemStack(PixelGalaxyBlocks.pixelWoodBlock, 1), new Object[]{
					"WWW",
					"W W",
					"WWW",
					'W', PixelGalaxyItems.pixelWoodItem
				});
			
			//PixelRiceBread
			GameRegistry.addRecipe(new ItemStack(PixelGalaxyItems.pixelRiceBread, 2), new Object[]{
					"WWW",
					"   ",
					"   ",
					'W', PixelGalaxyItems.pixelRice
				});
			
			GameRegistry.addRecipe(new ItemStack(PixelGalaxyItems.pixelRiceBread, 2), new Object[]{
					"   ",
					"WWW",
					"   ",
					'W', PixelGalaxyItems.pixelRice
				});
			
			GameRegistry.addRecipe(new ItemStack(PixelGalaxyItems.pixelRiceBread, 2), new Object[]{
					"   ",
					"   ",
					"WWW",
					'W', PixelGalaxyItems.pixelRice
				});
/*-----------------------------------------------------------------------------------------------------------------------------------------------------------------*/
			//IronPixel Helmet
			GameRegistry.addRecipe(new ItemStack(PixelGalaxyItems.ironPixelHelmet, 1), new Object[]{
				"DDD",
				"D D",
				"   ",
				'D', PixelGalaxyItems.ironPixelIngot
			});
			//IronPixel Chestplate
			GameRegistry.addRecipe(new ItemStack(PixelGalaxyItems.ironPixelChestplate, 1), new Object[]{
				"D D",
				"DDD",
				"DDD",
				'D', PixelGalaxyItems.ironPixelIngot
			});
			//IronPixel Legging
			GameRegistry.addRecipe(new ItemStack(PixelGalaxyItems.ironPixelLeggings, 1), new Object[]{
				"DDD",
				"D D",
				"D D",
				'D', PixelGalaxyItems.ironPixelIngot
			});		
			//DiamondPixel Boots
			GameRegistry.addRecipe(new ItemStack(PixelGalaxyItems.ironPixelBoots, 1), new Object[]{
				"   ",
				"D D",
				"D D",
				'D', PixelGalaxyItems.ironPixelIngot
			});
			GameRegistry.addRecipe(new ItemStack(PixelGalaxyItems.ironPixelBoots, 1), new Object[]{
				"D D",
				"D D",
				"   ",
				'D', PixelGalaxyItems.ironPixelIngot
			});
/*-----------------------------------------------------------------------------------------------------------------------------------------------------------------*/
			
			//ChainPixel Helmet
			GameRegistry.addRecipe(new ItemStack(PixelGalaxyItems.ChainPixelHelmet, 1), new Object[]{
				"DDD",
				"D D",
				"   ",
				'D', PixelGalaxyItems.pixelChain
			});
			//ChainPixel Chestplate
			GameRegistry.addRecipe(new ItemStack(PixelGalaxyItems.ChainPixelChestplate, 1), new Object[]{
				"D D",
				"DDD",
				"DDD",
				'D', PixelGalaxyItems.pixelChain
			});
			//ChainPixel Legging
			GameRegistry.addRecipe(new ItemStack(PixelGalaxyItems.ChainPixelLeggings, 1), new Object[]{
				"DDD",
				"D D",
				"D D",
				'D', PixelGalaxyItems.pixelChain
			});		
			//ChainPixel Boots
			GameRegistry.addRecipe(new ItemStack(PixelGalaxyItems.ChainPixelBoots, 1), new Object[]{
				"   ",
				"D D",
				"D D",
				'D', PixelGalaxyItems.pixelChain
			});
			GameRegistry.addRecipe(new ItemStack(PixelGalaxyItems.ChainPixelBoots, 1), new Object[]{
				"D D",
				"D D",
				"   ",
				'D', PixelGalaxyItems.pixelChain
			});
/*-----------------------------------------------------------------------------------------------------------------------------------------------------------------*/
			//stonePixel Sword
			GameRegistry.addRecipe(new ItemStack(PixelGalaxyItems.stonePixelSword, 1), new Object[]{
				" D ",
				" D ",
				" S ",
				'D', PixelGalaxyBlocks.pixelCobblestoneStone,
				'S', PixelGalaxyItems.pixelWoodStickItem
			});
			
			//stonePixel Hoe
			GameRegistry.addRecipe(new ItemStack(PixelGalaxyItems.stonePixelHoe, 1), new Object[]{
				"DD ",
				" S ",
				" S ",
				'D', PixelGalaxyBlocks.pixelCobblestoneStone,
				'S', PixelGalaxyItems.pixelWoodStickItem
			});
			
			GameRegistry.addRecipe(new ItemStack(PixelGalaxyItems.stonePixelHoe, 1), new Object[]{
				" DD",
				" S ",
				" S ",
				'D', PixelGalaxyBlocks.pixelCobblestoneStone,
				'S', PixelGalaxyItems.pixelWoodStickItem
			});
			
			//stonePixel Pickaxe
			GameRegistry.addRecipe(new ItemStack(PixelGalaxyItems.stonePixelPickaxe, 1), new Object[]{
				"DDD",
				" S ",
				" S ",
				'D', PixelGalaxyBlocks.pixelCobblestoneStone,
				'S', PixelGalaxyItems.pixelWoodStickItem
			});
			
			//stonePixel Shovel
			GameRegistry.addRecipe(new ItemStack(PixelGalaxyItems.stonePixelShovel, 1), new Object[]{
				" D ",
				" S ",
				" S ",
				'D', PixelGalaxyBlocks.pixelCobblestoneStone,
				'S', PixelGalaxyItems.pixelWoodStickItem
			});
			
			//stonePixel Axe
			GameRegistry.addRecipe(new ItemStack(PixelGalaxyItems.stonePixelAxe, 1), new Object[]{
				" DD",
				" SD",
				" S ",
				'D', PixelGalaxyBlocks.pixelCobblestoneStone,
				'S', PixelGalaxyItems.pixelWoodStickItem
			});
			
			GameRegistry.addRecipe(new ItemStack(PixelGalaxyItems.stonePixelAxe, 1), new Object[]{
				"DD ",
				"DS ",
				" S ",
				'D', PixelGalaxyBlocks.pixelCobblestoneStone,
				'S', PixelGalaxyItems.pixelWoodStickItem
			});		

/*-----------------------------------------------------------------------------------------------------------------------------------------------------------------*/
			//woodPixel Sword
			GameRegistry.addRecipe(new ItemStack(PixelGalaxyItems.woodPixelSword, 1), new Object[]{
				" D ",
				" D ",
				" S ",
				'D', PixelGalaxyItems.pixelWoodItem,
				'S', PixelGalaxyItems.pixelWoodStickItem
			});
			
			//woodPixel Hoe
			GameRegistry.addRecipe(new ItemStack(PixelGalaxyItems.woodPixelHoe, 1), new Object[]{
				"DD ",
				" S ",
				" S ",
				'D', PixelGalaxyItems.pixelWoodItem,
				'S', PixelGalaxyItems.pixelWoodStickItem
			});
			
			GameRegistry.addRecipe(new ItemStack(PixelGalaxyItems.woodPixelHoe, 1), new Object[]{
				" DD",
				" S ",
				" S ",
				'D', PixelGalaxyItems.pixelWoodItem,
				'S', PixelGalaxyItems.pixelWoodStickItem
			});
			
			//woodPixel Pickaxe
			GameRegistry.addRecipe(new ItemStack(PixelGalaxyItems.woodPixelPickaxe, 1), new Object[]{
				"DDD",
				" S ",
				" S ",
				'D', PixelGalaxyItems.pixelWoodItem,
				'S', PixelGalaxyItems.pixelWoodStickItem
			});
			
			//woodPixel Shovel
			GameRegistry.addRecipe(new ItemStack(PixelGalaxyItems.woodPixelShovel, 1), new Object[]{
				" D ",
				" S ",
				" S ",
				'D', PixelGalaxyItems.pixelWoodItem,
				'S', PixelGalaxyItems.pixelWoodStickItem
			});
			
			//woodPixel Axe
			GameRegistry.addRecipe(new ItemStack(PixelGalaxyItems.woodPixelAxe, 1), new Object[]{
				" DD",
				" SD",
				" S ",
				'D', PixelGalaxyItems.pixelWoodItem,
				'S', PixelGalaxyItems.pixelWoodStickItem
			});
			
			GameRegistry.addRecipe(new ItemStack(PixelGalaxyItems.woodPixelAxe, 1), new Object[]{
				"DD ",
				"DS ",
				" S ",
				'D', PixelGalaxyItems.pixelWoodItem,
				'S', PixelGalaxyItems.pixelWoodStickItem
			});		
//beta Items and blocks
			//crafting table
			GameRegistry.addRecipe(new ItemStack(Blocks.crafting_table, 1), new Object[]{
					"DD ",
					"DD ",
					"   ",
					'D', PixelGalaxyItems.pixelWoodItem,
				});
			GameRegistry.addRecipe(new ItemStack(Blocks.crafting_table, 1), new Object[]{
					"   ",
					"DD ",
					"DD ",
					'D', PixelGalaxyItems.pixelWoodItem,
				});	
			GameRegistry.addRecipe(new ItemStack(Blocks.crafting_table, 1), new Object[]{
					"   ",
					" DD",
					" DD",
					'D', PixelGalaxyItems.pixelWoodItem,
				});	
			GameRegistry.addRecipe(new ItemStack(Blocks.crafting_table, 1), new Object[]{
					" DD",
					" DD",
					"   ",
					'D', PixelGalaxyItems.pixelWoodItem,
				});	
			GameRegistry.addRecipe(new ItemStack(Blocks.furnace, 1), new Object[]{
					"DDD",
					"D D",
					"DDD",
					'D', PixelGalaxyBlocks.pixelCobblestoneStone,
				});				
/*-----------------------------------------------------------------------------------------------------------------------------------------------------------------*/
			//Bowl
			GameRegistry.addRecipe(new ItemStack(PixelGalaxyItems.pixelbowl, 1), new Object[]{
					"   ",
					"B B",
					" B ",
					'B', PixelGalaxyItems.pixelWoodItem,
				});
			GameRegistry.addRecipe(new ItemStack(PixelGalaxyItems.pixelbowl, 1), new Object[]{
					"B B",
					" B ",
					"   ",
					'B', PixelGalaxyItems.pixelWoodItem,
				});	
			//pixelBeetRootsoup
			GameRegistry.addRecipe(new ItemStack(PixelGalaxyItems.pixelbeetrootsoup, 1), new Object[]{
					"BBB",
					"BBB",
					" H ",
					'B', PixelGalaxyItems.pixelBeetroot,
					'H', PixelGalaxyItems.pixelbowl,
				});	
			//pixelPotatoSoup
			GameRegistry.addRecipe(new ItemStack(PixelGalaxyItems.pixelPotatoSoup, 1), new Object[]{
					"BBB",
					"BBB",
					" H ",
					'B', PixelGalaxyItems.pixelPotato,
					'H', PixelGalaxyItems.pixelbowl,
				});	
			//pixelCarrotSoup
			GameRegistry.addRecipe(new ItemStack(PixelGalaxyItems.pixelCarrotSoup, 1), new Object[]{
					"BBB",
					"BBB",
					" H ",
					'B', PixelGalaxyItems.pixelCarrot,
					'H', PixelGalaxyItems.pixelbowl,
				});	
			//pixelPeaStew
			GameRegistry.addRecipe(new ItemStack(PixelGalaxyItems.pixelPeaStew, 1), new Object[]{
					"BBB",
					" R ",
					" H ",
					'R', PixelGalaxyItems.pixelRice,
					'B', PixelGalaxyItems.pixelPea,
					'H', PixelGalaxyItems.pixelbowl,
				});	
			
/*------PixelStick--------------------------------------------------------------------------------------------------------------------------------------*/
			GameRegistry.addRecipe(new ItemStack(PixelGalaxyItems.pixelWoodStickItem, 4), new Object[]{
					"   ",
					"B  ",
					"B  ",
					'B', PixelGalaxyItems.pixelWoodItem,
				});	
			GameRegistry.addRecipe(new ItemStack(PixelGalaxyItems.pixelWoodStickItem, 4), new Object[]{
					"   ",
					" B ",
					" B ",
					'B', PixelGalaxyItems.pixelWoodItem,
				});	
			GameRegistry.addRecipe(new ItemStack(PixelGalaxyItems.pixelWoodStickItem, 4), new Object[]{
					"   ",
					"  B",
					"  B",
					'B', PixelGalaxyItems.pixelWoodItem,
				});	
			GameRegistry.addRecipe(new ItemStack(PixelGalaxyItems.pixelWoodStickItem, 4), new Object[]{
					"B  ",
					"B  ",
					"   ",
					'B', PixelGalaxyItems.pixelWoodItem,
				});	
			GameRegistry.addRecipe(new ItemStack(PixelGalaxyItems.pixelWoodStickItem, 4), new Object[]{
					" B ",
					" B ",
					"   ",
					'B', PixelGalaxyItems.pixelWoodItem,
				});	
			GameRegistry.addRecipe(new ItemStack(PixelGalaxyItems.pixelWoodStickItem, 4), new Object[]{
					"  B",
					"  B",
					"   ",
					'B', PixelGalaxyItems.pixelWoodItem,
				});	
/*-----------------------------------------------------------------------------------------------------------------------------------------------------------------*/
			GameRegistry.addShapelessRecipe(new ItemStack(PixelGalaxyItems.pixelizerIngot, 9), new Object[]{ PixelGalaxyBlocks.pixelizerBlock});
			GameRegistry.addShapelessRecipe(new ItemStack(PixelGalaxyItems.diamondPixel, 9), new Object[]{ PixelGalaxyBlocks.pixelizerdiamondBlock});
			GameRegistry.addShapelessRecipe(new ItemStack(PixelGalaxyItems.ironPixelIngot, 9), new Object[]{ PixelGalaxyBlocks.pixelIronBlock});
			GameRegistry.addShapelessRecipe(new ItemStack(PixelGalaxyItems.blueStoneIngot, 9), new Object[]{ PixelGalaxyBlocks.GlowingBlueStoneBlock});
			GameRegistry.addShapelessRecipe(new ItemStack(PixelGalaxyItems.pixelPumkinSeed, 4), new Object[]{ PixelGalaxyBlocks.pixelPumpkin});
			GameRegistry.addShapelessRecipe(new ItemStack(PixelGalaxyItems.pixelCoal, 9), new Object[]{ PixelGalaxyBlocks.pixelCoalBlocks});
			GameRegistry.addShapelessRecipe(new ItemStack(PixelGalaxyItems.pixelPeaSeed, 3), new Object[]{ PixelGalaxyItems.pixelPea});
	}
	
	public static void registerSmeltingRecipes(){
		GameRegistry.addSmelting(PixelGalaxyBlocks.pixelizerOre, new ItemStack(PixelGalaxyItems.pixelizerIngot, 1), 1.0F);
		GameRegistry.addSmelting(PixelGalaxyBlocks.pixelizerDiamondOre, new ItemStack(PixelGalaxyItems.diamondPixel, 1), 1.0F);
		GameRegistry.addSmelting(PixelGalaxyBlocks.pixelIronOre, new ItemStack(PixelGalaxyItems.ironPixelIngot, 1), 1.0F);
		GameRegistry.addSmelting(PixelGalaxyBlocks.pixelCobblestoneStone, new ItemStack(PixelGalaxyBlocks.pixelStone, 1), 0F);
		GameRegistry.addSmelting(PixelGalaxyItems.pixelWoodItem, new ItemStack(PixelGalaxyItems.pixelCharCoal, 1), 0F);
		GameRegistry.addSmelting(PixelGalaxyBlocks.pixelCoalOre, new ItemStack(PixelGalaxyItems.pixelCoal, 1), 0F);
		GameRegistry.addSmelting(PixelGalaxyItems.pixelPotato, new ItemStack(PixelGalaxyItems.pixelBakedPotato, 1), 0.35F);
		GameRegistry.addSmelting(PixelGalaxyItems.pixelRewPorkchop, new ItemStack(PixelGalaxyItems.pixelCookedPorkchop, 1), 0.35F);
		GameRegistry.addSmelting(PixelGalaxyItems.pixelbeefraw, new ItemStack(PixelGalaxyItems.pixelbeefcooked, 1), 0.35F);
		GameRegistry.addSmelting(PixelGalaxyItems.ironPixelIngot, new ItemStack(PixelGalaxyItems.pixelChain, 4), 0.35F);
	}
}
