
package net.mcreator.securitycraftexpantion.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import net.mcreator.securitycraftexpantion.itemgroup.SecuretyCraftAditionsItemGroup;
import net.mcreator.securitycraftexpantion.SecuritycraftExpantionModElements;

@SecuritycraftExpantionModElements.ModElement.Tag
public class ReinforcedsteelrodItem extends SecuritycraftExpantionModElements.ModElement {
	@ObjectHolder("securitycraft_expantion:reinforcedsteelrod")
	public static final Item block = null;

	public ReinforcedsteelrodItem(SecuritycraftExpantionModElements instance) {
		super(instance, 9);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(SecuretyCraftAditionsItemGroup.tab).maxStackSize(64).rarity(Rarity.COMMON));
			setRegistryName("reinforcedsteelrod");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}
	}
}
