/*
 * This file is part of the Meteor Client distribution (https://github.com/MeteorDevelopment/meteor-client).
 * Copyright (c) Meteor Development.
 */

package meteordevelopment.meteorclient.mixin;

import net.minecraft.client.gui.DrawContext;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(value = DrawContext.class)
public class DrawContextMixin {
    // TODO tooltips
    // @Inject(method = "drawTooltip(Lnet/minecraft/client/font/TextRenderer;Ljava/util/List;Ljava/util/Optional;II)V", at = @At(value = "INVOKE", target = "Ljava/util/Optional;ifPresent(Ljava/util/function/Consumer;)V", shift = At.Shift.BEFORE), locals = LocalCapture.CAPTURE_FAILHARD)
    // private void onDrawTooltip(TextRenderer textRenderer, List<Text> text, Optional<TooltipData> data, int x, int y, CallbackInfo ci, List<TooltipComponent> list) {
    //     if (data.isPresent() && data.get() instanceof MeteorTooltipData meteorTooltipData)
    //         list.add(meteorTooltipData.getComponent());
    // }

    // @ModifyReceiver(method = "drawTooltip(Lnet/minecraft/client/font/TextRenderer;Ljava/util/List;Ljava/util/Optional;II)V", at = @At(value = "INVOKE", target = "Ljava/util/Optional;ifPresent(Ljava/util/function/Consumer;)V"))
    // private Optional<TooltipData> onDrawTooltip_modifyIfPresentReceiver(Optional<TooltipData> data, Consumer<TooltipData> consumer) {
    //     if (data.isPresent() && data.get() instanceof MeteorTooltipData) return Optional.empty();
    //     return data;
    // }
}
