package com.calrae.ccpowergrid.peripherals;

import dan200.computercraft.api.lua.LuaFunction;
import dan200.computercraft.api.peripheral.IPeripheral;
import org.patryk3211.powergrid.electricity.gauge.VoltageGaugeBlockEntity;
import org.jetbrains.annotations.Nullable;

public class VoltmeterPeripheral implements IPeripheral {
    private final VoltageGaugeBlockEntity gauge;

    public VoltmeterPeripheral(VoltageGaugeBlockEntity gauge) {
        this.gauge = gauge;
    }

    @Override
    public String getType() {
        return "voltmeter";
    }

    @LuaFunction
    public double getVoltage() {
        return gauge.getValue();
    }

    @Override
    public boolean equals(@Nullable IPeripheral other) {
        return other instanceof VoltmeterPeripheral o && gauge == o.gauge;
    }
}