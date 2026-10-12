package com.iearth60.echoiminion;

import com.iearth60.echoiminion.entity.EchoiminionEntities;
import com.iearth60.echoiminion.item.ModItems;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroups;

public class Echoiminion implements ModInitializer {

    @Override
    public void onInitialize() {
        EchoiminionEntities.registerEntityAttributes();

        ModItems.registerItems();

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.SPAWN_EGGS).register(entries -> {
            entries.add(ModItems.ECHOIMINION_SPAWN_EGG);
        });
    }
}
