package com.iearth60.echoiminion.entity;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.tag.BiomeTags;

public class EchoiminionSpawns {

    public static void registerSpawns() {
        BiomeModifications.addSpawn(
                BiomeSelectors.foundInOverworld()
                        .and(context -> !context.hasTag(BiomeTags.IS_OCEAN)),
                SpawnGroup.MONSTER,
                EchoiminionEntities.ECHOIMINION_MOB,
                100,
                1,
                4
        );
    }
}
