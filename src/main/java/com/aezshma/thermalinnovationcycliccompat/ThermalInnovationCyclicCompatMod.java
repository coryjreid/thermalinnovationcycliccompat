package com.aezshma.thermalinnovationcycliccompat;

import cofh.thermal.lib.common.ThermalItemGroups;
import com.aezshma.thermalinnovationcycliccompat.item.RFDrillItem;
import com.aezshma.thermalinnovationcycliccompat.item.RFSawItem;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import static com.aezshma.thermalinnovationcycliccompat.ThermalInnovationCyclicCompatMod.MOD_ID;

@Mod(MOD_ID)
public class ThermalInnovationCyclicCompatMod {
    public static final String MOD_ID = "thermalinnovationcycliccompat";

    @SubscribeEvent
    public void registerItem(final RegistryEvent.Register<Item> event) {
        event.getRegistry().registerAll(
                (new RFDrillItem(
                        (new Item.Properties()).stacksTo(1).tab(ThermalItemGroups.THERMAL_TOOLS),
                        50000,
                        1000))
                        .setRegistryName("thermal_innovation", "flux_drill"),
                (new RFSawItem(
                        (new Item.Properties()).stacksTo(1).tab(ThermalItemGroups.THERMAL_TOOLS),
                        50000,
                        1000))
                        .setRegistryName("thermal_innovation", "flux_saw"));
    }
}
