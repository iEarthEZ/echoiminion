package com.iearth60.echoiminion.item;

import net.minecraft.item.Item;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import com.iearth60.echoiminion.entity.EchoiminionEntities;

public class ModItems {

    public static final Item ECHOIMINION_SPAWN_EGG = Registry.register(
            Registries.ITEM,
            Identifier.of("echoiminion", "echoiminion_spawn_egg"),
            new SpawnEggItem(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of("echoiminion", "echoiminion_spawn_egg"))).spawnEgg(EchoiminionEntities.ECHOIMINION_MOB))
    );

    public static void registerItems() {

    }

}
