package com.aezshma.thermalinnovationcycliccompat.item;

import com.lothrazar.cyclic.ModCyclic;
import com.lothrazar.cyclic.enchant.EnchantXp;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.registries.ForgeRegistries;

public class RFSawItem extends cofh.thermal.innovation.item.RFSawItem {
    public RFSawItem(Properties builder, int maxEnergy, int maxTransfer) {
        super(builder, maxEnergy, maxTransfer);
    }

    public static void setupEnchants() {
        cofh.thermal.innovation.item.RFDrillItem.setupEnchants();
        VALID_ENCHANTS.add(ForgeRegistries.ENCHANTMENTS.getValue(new ResourceLocation(ModCyclic.MODID, EnchantXp.ID)));
    }
}
