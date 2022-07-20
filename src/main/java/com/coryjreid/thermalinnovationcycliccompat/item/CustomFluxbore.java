package com.coryjreid.thermalinnovationcycliccompat.item;

import com.lothrazar.cyclic.ModCyclic;
import com.lothrazar.cyclic.enchant.EnchantXp;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.registries.ForgeRegistries;

import cofh.thermal.innovation.item.RFDrillItem;

/**
 * An {@link RFDrillItem} which permits {@link EnchantXp}.
 */
public class CustomFluxbore extends RFDrillItem {

    public static final String ID = "flux_drill";
    public static final int MAX_ENERGY = 50000;
    public static final int MAX_TRANSFER = 1000;

    public CustomFluxbore(Item.Properties builder, int maxEnergy, int maxTransfer) {
        super(builder, maxEnergy, maxTransfer);
        setupEnchants();
    }

    @Override
    public boolean canApplyAtEnchantingTable(final ItemStack stack, final Enchantment enchantment) {
        return super.canApplyAtEnchantingTable(stack, enchantment) || enchantment instanceof EnchantXp;
    }

    public static void setupEnchants() {
        RFDrillItem.setupEnchants();
        VALID_ENCHANTS.add(ForgeRegistries.ENCHANTMENTS.getValue(new ResourceLocation(ModCyclic.MODID, EnchantXp.ID)));
    }
}
