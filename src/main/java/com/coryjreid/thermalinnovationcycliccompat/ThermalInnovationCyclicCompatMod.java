package com.coryjreid.thermalinnovationcycliccompat;

import com.coryjreid.thermalinnovationcycliccompat.item.CustomFluxbore;
import com.coryjreid.thermalinnovationcycliccompat.item.CustomFluxsaw;

import net.minecraft.item.Item;
import net.minecraft.item.Rarity;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

import cofh.lib.util.constants.Constants;
import cofh.thermal.lib.common.ThermalItemGroups;
import static com.coryjreid.thermalinnovationcycliccompat.ThermalInnovationCyclicCompatMod.MOD_ID;

/**
 * The main entry point for the mod.
 */
@Mod(MOD_ID)
public class ThermalInnovationCyclicCompatMod {
    /**
     * The ID for this mod.
     */
    public static final String MOD_ID = "thermalinnovationcycliccompat";

    public ThermalInnovationCyclicCompatMod() {
        FMLJavaModLoadingContext.get().getModEventBus().addGenericListener(Item.class, this::registerItems);
    }

    /**
     * Registers all items provided by this mod.
     *
     * @param event the event to listen for
     */
    private void registerItems(final RegistryEvent.Register<Item> event) {
        final Item.Properties properties =
            new Item.Properties().stacksTo(1).tab(ThermalItemGroups.THERMAL_TOOLS).rarity(Rarity.COMMON);

        event.getRegistry().registerAll(
            new CustomFluxbore(properties, CustomFluxbore.MAX_ENERGY, CustomFluxbore.MAX_TRANSFER).setRegistryName(
                Constants.ID_THERMAL,
                CustomFluxbore.ID),
            new CustomFluxsaw(properties, CustomFluxsaw.MAX_ENERGY, CustomFluxsaw.MAX_TRANSFER).setRegistryName(
                Constants.ID_THERMAL,
                CustomFluxsaw.ID));
    }
}
