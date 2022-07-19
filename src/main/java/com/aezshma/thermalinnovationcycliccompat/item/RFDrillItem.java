package com.aezshma.thermalinnovationcycliccompat.item;

import com.lothrazar.cyclic.enchant.EnchantXp;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.registries.ForgeRegistries;

public class RFDrillItem extends cofh.thermal.innovation.item.RFDrillItem {
    public RFDrillItem(Item.Properties builder, int maxEnergy, int maxTransfer) {
        super(builder, maxEnergy, maxTransfer);
    }

    public static void setupEnchants() {
        cofh.thermal.innovation.item.RFDrillItem.setupEnchants();
        VALID_ENCHANTS.add(ForgeRegistries.ENCHANTMENTS.getValue(new ResourceLocation(EnchantXp.ID)));
    }
}
