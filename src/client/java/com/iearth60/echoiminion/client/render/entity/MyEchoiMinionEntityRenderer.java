package com.iearth60.echoiminion.client.render.entity;

import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;
import com.iearth60.echoiminion.client.EchoiminionClient;
import com.iearth60.echoiminion.client.model.EchoiMinion;
import com.iearth60.echoiminion.client.render.entity.state.MyEchoiMinionEntityRenderState;
import com.iearth60.echoiminion.entity.EchoiminionEntity;

public class MyEchoiMinionEntityRenderer extends MobEntityRenderer<EchoiminionEntity, MyEchoiMinionEntityRenderState, EchoiMinion> {

    private static final Identifier TEXTURE = Identifier.of("echoiminion", "textures/entity/texture.png");

    public MyEchoiMinionEntityRenderer(EntityRendererFactory.Context context) {
        super(context, new EchoiMinion(context.getPart(EchoiminionClient.ECHOIMINION_LAYER)), 0.5f);
    }

    @Override
    public MyEchoiMinionEntityRenderState createRenderState() {
        return new MyEchoiMinionEntityRenderState();
    }

    @Override
    public Identifier getTexture(MyEchoiMinionEntityRenderState state) {
        return TEXTURE;
    }
}