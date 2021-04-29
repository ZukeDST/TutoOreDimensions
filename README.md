# TutoOreDimensions
comment générer un minerais dans l'end (ou dans tout ce que vous voulez tant que c'est dans Minecraft, il suffit de vous adapter un minuscule peu^^)

Tout d'abord suivre la vidéo de Zom' sur la géneration de minerais (https://www.youtube.com/watch?v=tHJTESns7LU)

Ici, on ne parlera que du package init crée dans le tuto.

-on commence par créer une classe "ModOreFeatureConfig":

	on copie dedans la classe "OreFeatureConfig" de minecraft (tout est annoté dans mon code)

-ensuit, dans la classe "ModFeature" crée dans le tuto de Zom':

	faire appel a votre classe de mod au lieu de celle de minecraft (annoté dans la code aussi)

tips: en jeu, quand le menu F3 est ouvert, on peut apercevoir les tag des blocs visées (#enderman_holdable, #dragon_immune, etc..)


MàJ: petites modifications due au passage en 1.16.4 vers la 1.16.5 sur le ModFeatures (withConfiguration => configured; getDefaultState => defaultBlockState; func-jesaisplusquoi => count) et sur le ModOreFeatureConfig (
