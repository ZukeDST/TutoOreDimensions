package fr.naty.mitige.init;

//copié collé de la classe OreFeatureConfig de minecraft
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.block.BlockState;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.gen.feature.IFeatureConfig;
import net.minecraft.world.gen.feature.template.RuleTest;
import net.minecraft.world.gen.feature.template.TagMatchRuleTest;

public class ModOreFeatureConfig implements IFeatureConfig {
   public static final Codec<ModOreFeatureConfig> CODEC = RecordCodecBuilder.create((p_236568_0_) -> {
      return p_236568_0_.group(RuleTest.CODEC.fieldOf("target").forGetter((config) -> {
         return config.target;
      }), BlockState.CODEC.fieldOf("state").forGetter((config) -> {
         return config.state;
      }), Codec.intRange(0, 64).fieldOf("size").forGetter((config) -> {
         return config.size;
      })).apply(p_236568_0_, ModOreFeatureConfig::new);
   });
   public final RuleTest target;
   public final int size;
   public final BlockState state;

   public ModOreFeatureConfig(RuleTest p_i241989_1_, BlockState state, int size) {
      this.size = size;
      this.state = state;
      this.target = p_i241989_1_;
   }

   //on supprime le contenu ci dessous, pour le remplacer par celui qu'on veut.
   public static final class FillerBlockType {
      public static final RuleTest DEMO = new TagMatchRuleTest(BlockTags.DRAGON_IMMUNE);
      //ici j'ai utilisé le tag DRAGON_IMMUNE, donc tous les blocs qui ne seront pas détruit par un passage du dragon 
      public static final RuleTest END_STONE = new BlockMatchRuleTest(Blocks.END_STONE);
      //ici j'ai utilisé le bloc d'end stone, tout simplement
   }
}
