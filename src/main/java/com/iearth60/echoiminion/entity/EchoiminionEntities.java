package com.iearth60.echoiminion.entity;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

public class EchoiminionEntities {
    public static final EntityType<EchoiminionEntity> ECHOIMINION_MOB = Registry.register(
            Registries.ENTITY_TYPE,
            Identifier.of("echoiminion", "echoiminion"),
            EntityType.Builder.create(EchoiminionEntity::new, SpawnGroup.MONSTER)
                    .dimensions(0.3f, 0.75f)
                    .build(RegistryKey.of(RegistryKeys.ENTITY_TYPE, Identifier.of("echoiminion", "echoiminion")))
    );

    public static void registerEntityAttributes() {
        FabricDefaultAttributeRegistry.register(ECHOIMINION_MOB, EchoiminionEntity.createMyMobAttributes());
    }
}
