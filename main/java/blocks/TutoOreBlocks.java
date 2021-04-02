package fr.naty.mitige.blocks;

import java.util.function.Supplier;
import fr.naty.mitige.mitige;
import fr.naty.mitige.items.MitigeItems;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.CarvedPumpkinBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class MitigeBlocks {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, mitige.MODID);
   
    public static final RegistryObject<Block> Beskar_ore = createBlock( "beskar_ore", () -> new Block(AbstractBlock.Properties.create(Material.ROCK).hardnessAndResistance(3f, 15f).harvestTool(ToolType.PICKAXE).harvestLevel(3).setRequiresTool().sound(SoundType.ANCIENT_DEBRIS)));

    public static RegistryObject<Block> createBlock(String name, Supplier<? extends Block> supplier)
    {
        RegistryObject<Block> block = BLOCKS.register(name, supplier);
        MitigeItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
        return block;
    }
    
    
    
}   
