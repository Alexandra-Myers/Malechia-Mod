package net.alexandra.malechia.enchantments;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityGroup;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;

public class AutoSmelt extends Enchantment {
    public AutoSmelt() {
        super(Rarity.UNCOMMON, EnchantmentTarget.WEAPON, new EquipmentSlot[] {EquipmentSlot.MAINHAND});
    }
    @Override
    public int getMaxLevel() {
        return 1;
    }

    public boolean isTreasure() {
        return true;
    }

    public boolean canAccept(Enchantment other) {
        return super.canAccept(other) && other != Enchantments.SILK_TOUCH;
    }
}
