/*
 * This file is part of the Meteor Client distribution (https://github.com/MeteorDevelopment/meteor-client).
 * Copyright (c) Meteor Development.
 */

package meteordevelopment.meteorclient.mixin;

import net.minecraft.entity.EntityType;
import net.minecraft.fluid.Fluid;
import net.minecraft.item.EntityBucketItem;
import net.minecraft.item.Item;
import net.minecraft.sound.SoundEvent;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import meteordevelopment.meteorclient.utils.entity.EntityBucketItemTypes;

@Mixin(EntityBucketItem.class)
public class EntityBucketItemAccessor {
    @Inject(
        method = "<init>(Lnet/minecraft/entity/EntityType;Lnet/minecraft/fluid/Fluid;Lnet/minecraft/sound/SoundEvent;Lnet/minecraft/item/Item$Settings;)V",
        at = @At(value = "RETURN")
    )
    private void onInit(EntityType<?> type, Fluid fluid, SoundEvent emptyingSound, Item.Settings settings, CallbackInfo ci) {
        EntityBucketItemTypes.entityTypes.put((EntityBucketItem)(Object)this, type);
    }
}
