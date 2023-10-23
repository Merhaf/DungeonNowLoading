package dev.hexnowloading.skyisland.entity.util;

import dev.hexnowloading.skyisland.entity.boss.ChaosSpawnerEntity;
import net.minecraft.network.syncher.EntityDataSerializer;
import net.minecraft.network.syncher.EntityDataSerializers;

public class EntityStates {
    public static final EntityDataSerializer<ChaosSpawnerEntity.State> CHAOS_SPAWNER_STATE;

    static {
        CHAOS_SPAWNER_STATE = EntityDataSerializer.simpleEnum(ChaosSpawnerEntity.State.class);
        EntityDataSerializers.registerSerializer(CHAOS_SPAWNER_STATE);
    }

}
