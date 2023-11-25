
package net.mcreator.securitycraftexpantion.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.securitycraftexpantion.item.CrowbarItem;
import net.mcreator.securitycraftexpantion.SecuritycraftExpantionModElements;

@SecuritycraftExpantionModElements.ModElement.Tag
public class SecuretyCraftAditionsItemGroup extends SecuritycraftExpantionModElements.ModElement {
	public SecuretyCraftAditionsItemGroup(SecuritycraftExpantionModElements instance) {
		super(instance, 3);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabsecurety_craft_aditions") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(CrowbarItem.block);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}

	public static ItemGroup tab;
}
