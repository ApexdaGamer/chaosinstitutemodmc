
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.chaosinstitute.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.chaosinstitute.block.EBlock;
import net.mcreator.chaosinstitute.ChaosInstituteMod;

public class ChaosInstituteModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, ChaosInstituteMod.MODID);
	public static final RegistryObject<Block> E = REGISTRY.register("e", () -> new EBlock());
}
