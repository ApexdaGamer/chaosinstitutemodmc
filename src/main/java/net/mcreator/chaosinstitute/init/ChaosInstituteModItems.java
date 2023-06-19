
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.chaosinstitute.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.chaosinstitute.ChaosInstituteMod;

public class ChaosInstituteModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, ChaosInstituteMod.MODID);
	public static final RegistryObject<Item> E = block(ChaosInstituteModBlocks.E);

	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
