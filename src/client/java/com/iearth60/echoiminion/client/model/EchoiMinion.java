package com.iearth60.echoiminion.client.model;

import com.iearth60.echoiminion.client.render.entity.state.MyEchoiMinionEntityRenderState;
import net.minecraft.client.model.*;
import net.minecraft.client.render.entity.model.EntityModel;

public class EchoiMinion extends EntityModel<MyEchoiMinionEntityRenderState> {
	private final ModelPart bb_main;
	public EchoiMinion(ModelPart root) {
		super(root);
		this.bb_main = root.getChild("bb_main");
	}
	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();
		ModelPartData bb_main = modelPartData.addChild("bb_main", ModelPartBuilder.create().uv(16, 12).cuboid(-2.0F, -2.0F, -3.0F, 4.0F, 2.0F, 6.0F, new Dilation(0.0F))
		.uv(0, 12).cuboid(-2.0F, -11.0F, -2.0F, 4.0F, 9.0F, 4.0F, new Dilation(0.0F))
		.uv(0, 0).cuboid(-3.0F, -17.0F, -3.0F, 6.0F, 6.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 24.0F, 0.0F, 0f, 0f, 0f));
		return TexturedModelData.of(modelData, 32, 32);
	}

	@Override
	public void setAngles(MyEchoiMinionEntityRenderState state)
	{
		super.setAngles(state);
	}
}