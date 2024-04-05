package meteordevelopment.meteorclient.utils;

import java.util.Map;

import net.minecraft.entity.EntityType;
import net.minecraft.item.EntityBucketItem;

import java.util.HashMap;

public class EntityBucketItemTypes {
    // TODO can cause memory leak
    public static Map<EntityBucketItem, EntityType<?>> entityTypes = new HashMap<>();
}
