package com.calrae.ccpowergrid.peripherals;

import dan200.computercraft.api.lua.LuaFunction;
import dan200.computercraft.api.peripheral.IPeripheral;
import org.patryk3211.powergrid.electricity.gauge.CurrentGaugeBlockEntity;
import org.jetbrains.annotations.Nullable;

public class AmmeterPeripheral implements IPeripheral {
    private final CurrentGaugeBlockEntity gauge;

    public AmmeterPeripheral(CurrentGaugeBlockEntity gauge) {
        this.gauge = gauge;
    }

    @Override
    public String getType() {
        return "ammeter";
    }

    @LuaFunction
    public double getAmperage() {
        return gauge.getValue();
    }

    @Override
    public boolean equals(@Nullable IPeripheral other) {
        return other instanceof AmmeterPeripheral o && gauge == o.gauge;
    }
}
