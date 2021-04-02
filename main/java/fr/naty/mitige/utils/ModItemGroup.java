package fr.naty.mitige.utils;

import fr.naty.mitige.blocks.MitigeBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ModItemGroup {

	public static final ItemGroup Mitige = new ItemGroup("mitigetab")
	{
		@Override
		public ItemStack createIcon () {
			return new ItemStack(MitigeBlocks.Mitige_block.get());
		}
	};
}
