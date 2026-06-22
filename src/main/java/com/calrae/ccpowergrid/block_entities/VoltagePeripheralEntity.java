package com.calrae.ccpowergrid.block_entities;

import dan200.computercraft.api.peripheral.IPeripheral;
import org.patryk3211.powergrid.collections.ModdedBlockEntities;
import org.patryk3211.powergrid.electricity.gauge.VoltageGaugeBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.Nullable;
import com.calrae.ccpowergrid.peripherals.*;

public class VoltagePeripheralEntity extends VoltageGaugeBlockEntity implements PeripheralBlockEntity {
    private VoltmeterPeripheral peripheral;

    public VoltagePeripheralEntity(BlockPos pos, BlockState state) {
        super(ModdedBlockEntities.VOLTAGE_METER.get(), pos, state);
    }

    public IPeripheral getPeripheral(@Nullable Direction side) {
        if (peripheral == null)
            peripheral = new VoltmeterPeripheral(this);
        return peripheral;
    }
}