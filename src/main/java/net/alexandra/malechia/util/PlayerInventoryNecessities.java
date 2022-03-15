package net.alexandra.malechia.util;

import com.google.common.collect.ImmutableList;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.Inventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tag.TagKey;
import net.minecraft.text.Text;
import net.minecraft.util.Nameable;
import net.minecraft.util.collection.DefaultedList;

import java.util.Iterator;
import java.util.List;

public class PlayerInventoryNecessities implements Inventory, Nameable {
    public final DefaultedList<ItemStack> main;
    public final DefaultedList<ItemStack> armor;
    public final DefaultedList<ItemStack> offHand;
    public final List<DefaultedList<ItemStack>> combinedInventory;

    public PlayerInventoryNecessities(PlayerEntity player) {
        this.main = DefaultedList.ofSize(36, ItemStack.EMPTY);
        this.armor = DefaultedList.ofSize(4, ItemStack.EMPTY);
        this.offHand = DefaultedList.ofSize(1, ItemStack.EMPTY);
        this.combinedInventory = ImmutableList.of(this.main, this.armor, this.offHand);
    }


    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public ItemStack getStack(int slot) {
        return null;
    }

    @Override
    public ItemStack removeStack(int slot, int amount) {
        return null;
    }

    @Override
    public ItemStack removeStack(int slot) {
        return null;
    }

    @Override
    public void setStack(int slot, ItemStack stack) {

    }

    @Override
    public void markDirty() {

    }

    @Override
    public boolean canPlayerUse(PlayerEntity player) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public Text getName() {
        return null;
    }
}
