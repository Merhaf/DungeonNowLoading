package dev.hexnowloading.dungeonnowloading.platform;

import dev.hexnowloading.dungeonnowloading.capabilities.CapabilityList;
import dev.hexnowloading.dungeonnowloading.capabilities.player.IPlayerCapability;
import dev.hexnowloading.dungeonnowloading.capabilities.player.PlayerCapabilityHandler;
import dev.hexnowloading.dungeonnowloading.platform.services.DataHelper;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.player.Player;

import java.util.List;
import java.util.Optional;

public class FabricDataHelper implements DataHelper {
    @Override
    public void setPoint(Player player, int amount) {
        CapabilityList.PLAYER_CAP.get(player).setPoint(amount);
        /*if (CapabilityList.PLAYER_CAP.isProvidedBy(player)) {
            CapabilityList.PLAYER_CAP.get(player).setPoint(amount);
        }*/
    }

    @Override
    public int getPoint(Player player) {
        if (CapabilityList.PLAYER_CAP.isProvidedBy(player)) {
            IPlayerCapability capabilityHandler = CapabilityList.PLAYER_CAP.get(player);
            return capabilityHandler.getPoint();
        }
        return 0;
    }

    @Override
    public Optional<List<BlockPos>> getFairkeeperChestPositionList(Player player) {
        return Optional.empty();
    }

    @Override
    public void addFairkeeperChestPositionList(Player player, BlockPos blockPos) {
    }

    @Override
    public void copyFairkeeperChestPositionList(Player player, List<BlockPos> list) {
    }
}
