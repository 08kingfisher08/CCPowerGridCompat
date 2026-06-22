package com.calrae.ccpowergrid;


import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;

import dan200.computercraft.api.peripheral.PeripheralCapability;
import org.patryk3211.powergrid.collections.ModdedBlockEntities;

import com.calrae.ccpowergrid.peripherals.*;
import net.neoforged.neoforge.capabilities.RegisterCapabilitiesEvent;




// The value here should match an entry in the META-INF/neoforge.mods.toml file
@Mod(CCPowerGridCompat.MODID)
public class CCPowerGridCompat {
    // Define mod id in a common place for everything to reference
    public static final String MODID = "ccpowergridcompat";

    public CCPowerGridCompat(IEventBus modEventBus, ModContainer modContainer) {
        modEventBus.addListener(this::registerCapabilities);
    }

    public void registerCapabilities(RegisterCapabilitiesEvent event) {
        event.registerBlockEntity(
                PeripheralCapability.get(),
                ModdedBlockEntities.VOLTAGE_METER.get(),
                (blockEntity, side) -> new VoltmeterPeripheral(blockEntity)

        );

                event.registerBlockEntity(
                PeripheralCapability.get(),
                ModdedBlockEntities.POWER_METER.get(),
                (blockEntity, side) -> new PowerMeterPeripheral(blockEntity)

        );

                event.registerBlockEntity(
                PeripheralCapability.get(),
                ModdedBlockEntities.CURRENT_METER.get(),
                (blockEntity, side) -> new AmmeterPeripheral(blockEntity)

        );
    }

    
}