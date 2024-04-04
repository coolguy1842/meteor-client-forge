/*
 * This file is part of the Meteor Client distribution (https://github.com/MeteorDevelopment/meteor-client).
 * Copyright (c) Meteor Development.
 */

package meteordevelopment.meteorclient.mixin;

import net.minecraft.item.EntityBucketItem;
import org.spongepowered.asm.mixin.Mixin;
@Mixin(EntityBucketItem.class)
public interface EntityBucketItemAccessor {
    // TODO FISH
    // @Accessor("entityTypeSupplier")
    // Supplier<EntityType<?>> getEntityTypeSupplier();
}
