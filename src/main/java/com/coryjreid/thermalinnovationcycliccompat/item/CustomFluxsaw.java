package com.coryjreid.thermalinnovationcycliccompat.item;

import com.lothrazar.cyclic.ModCyclic;
import com.lothrazar.cyclic.enchant.EnchantXp;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.registries.ForgeRegistries;

import cofh.thermal.innovation.item.RFSawItem;

/**
 * An {@link RFSawItem} which permits {@link EnchantXp}.
 */
public class CustomFluxsaw extends RFSawItem {

    public static final String ID = "flux_saw";
    public static final int MAX_ENERGY = 50000;
    public static final int MAX_TRANSFER = 1000;

    public CustomFluxsaw(Properties builder, int maxEnergy, int maxTransfer) {
        super(builder, maxEnergy, maxTransfer);
        setupEnchants();
    }

    @Override
    public boolean canApplyAtEnchantingTable(final ItemStack stack, final Enchantment enchantment) {
        return super.canApplyAtEnchantingTable(stack, enchantment) || enchantment instanceof EnchantXp;
    }

    public static void setupEnchants() {
        RFSawItem.setupEnchants();
        VALID_ENCHANTS.add(ForgeRegistries.ENCHANTMENTS.getValue(new ResourceLocation(ModCyclic.MODID, EnchantXp.ID)));
    }
}
