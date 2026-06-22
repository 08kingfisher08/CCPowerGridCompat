package com.calrae.ccpowergrid.peripherals;

import dan200.computercraft.api.lua.LuaFunction;
import dan200.computercraft.api.peripheral.IPeripheral;
import org.patryk3211.powergrid.electricity.gauge.PowerGaugeBlockEntity;
import org.jetbrains.annotations.Nullable;

public class PowerMeterPeripheral implements IPeripheral {
    private final PowerGaugeBlockEntity gauge;

    public PowerMeterPeripheral(PowerGaugeBlockEntity gauge) {
        this.gauge = gauge;
    }

    @Override
    public String getType() {
        return "powermeter";
    }

    @LuaFunction
    public double getPower() {
        return gauge.getValue();
    }

    @Override
    public boolean equals(@Nullable IPeripheral other) {
        return other instanceof PowerMeterPeripheral o && gauge == o.gauge;
    }
}
