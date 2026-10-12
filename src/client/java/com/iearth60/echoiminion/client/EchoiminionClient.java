package com.iearth60.echoiminion.client;

import com.iearth60.echoiminion.client.model.EchoiMinion;
import com.iearth60.echoiminion.client.render.entity.MyEchoiMinionEntityRenderer;
import com.iearth60.echoiminion.entity.EchoiminionEntities;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.util.Identifier;

public class EchoiminionClient implements ClientModInitializer {

    public static final EntityModelLayer ECHOIMINION_LAYER = new EntityModelLayer(Identifier.of("echoiminion", "echoiminion"), "main");

    @Override
    public void onInitializeClient() {
        EntityModelLayerRegistry.registerModelLayer(ECHOIMINION_LAYER, EchoiMinion::getTexturedModelData);
        EntityRendererRegistry.register(EchoiminionEntities.ECHOIMINION_MOB, MyEchoiMinionEntityRenderer::new);
    }
}
