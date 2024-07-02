package dev.hexnowloading.dungeonnowloading.platform.services;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.item.Item;

import java.util.function.Supplier;

public interface ItemHelper {
    Supplier<Item> makeSpawnEgg(Supplier<EntityType<? extends Mob>> entityType, int bg, int fg, Item.Properties properties);
}
