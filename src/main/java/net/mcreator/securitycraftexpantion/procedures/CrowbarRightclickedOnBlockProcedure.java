package net.mcreator.securitycraftexpantion.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.block.Blocks;

import net.mcreator.securitycraftexpantion.SecuritycraftExpantionMod;

import java.util.Random;
import java.util.Map;

public class CrowbarRightclickedOnBlockProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				SecuritycraftExpantionMod.LOGGER.warn("Failed to load dependency world for procedure CrowbarRightclickedOnBlock!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				SecuritycraftExpantionMod.LOGGER.warn("Failed to load dependency x for procedure CrowbarRightclickedOnBlock!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				SecuritycraftExpantionMod.LOGGER.warn("Failed to load dependency y for procedure CrowbarRightclickedOnBlock!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				SecuritycraftExpantionMod.LOGGER.warn("Failed to load dependency z for procedure CrowbarRightclickedOnBlock!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				SecuritycraftExpantionMod.LOGGER.warn("Failed to load dependency entity for procedure CrowbarRightclickedOnBlock!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		Entity entity = (Entity) dependencies.get("entity");
		if (!(Blocks.BEDROCK == (world.getBlockState(new BlockPos(x, y, z))).getBlock())) {
			{
				ItemStack _ist = ((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY);
				if (_ist.attemptDamageItem((int) 17, new Random(), null)) {
					_ist.shrink(1);
					_ist.setDamage(0);
				}
			}
			world.setBlockState(new BlockPos(x, y, z), Blocks.AIR.getDefaultState(), 3);
		}
	}
}
