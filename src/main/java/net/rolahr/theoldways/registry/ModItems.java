package net.rolahr.theoldways.registry;

import net.rolahr.theoldways.TheOldWays;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item ASH = new Item(new Item.Settings().group(ItemGroup.MATERIALS).rarity(Rarity.UNCOMMON));

    public static void registerItems() {
        Registry.register(Registry.ITEM, new Identifier(TheOldWays.MOD_ID, "mind_ash"), ASH);
    }
}
