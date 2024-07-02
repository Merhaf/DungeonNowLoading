package dev.hexnowloading.dungeonnowloading.platform;

import dev.hexnowloading.dungeonnowloading.platform.services.ItemHelper;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SpawnEggItem;

import java.util.function.Supplier;

public class FabricItemHelper implements ItemHelper {
    @Override
    public Supplier<Item> makeSpawnEgg(Supplier<EntityType<? extends Mob>> entityType, int bg, int fg, Item.Properties properties) {
        return () -> new SpawnEggItem(entityType.get(), bg, fg, properties);
    }
}
