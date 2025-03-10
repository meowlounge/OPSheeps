package com.chilllounge.opsheep.item;

import com.chilllounge.opsheep.Opsheep;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class OpSheepItemGroups {

	public static final RegistryKey<ItemGroup> SUPER_ITEM_GROUP_KEY = RegistryKey.of(
			Registries.ITEM_GROUP.getKey(),
			Identifier.of(Opsheep.MOD_ID, "super_items")
	);

	public static final ItemGroup SUPER_ITEM_GROUP = Registry.register(
			Registries.ITEM_GROUP,
			SUPER_ITEM_GROUP_KEY.getValue(),
			FabricItemGroup.builder()
					.icon(() -> new ItemStack(OpSheepItems.SUPER_DYE))
					.displayName(Text.translatable("itemgroups.opsheep.super_items"))
					.entries((displayContext, entries) -> {
						entries.add(OpSheepItems.SUPER_DYE);
//						entries.add(opsheepItems.SUPER_SHEAR_V69);
						entries.add(OpSheepItems.SUPER_SHEAR_V1);
						entries.add(OpSheepItems.SUPER_SHEAR_V2);
						entries.add(OpSheepItems.SUPER_SHEAR_V3);
						entries.add(OpSheepItems.SUPER_SHEAR_V4);
						entries.add(OpSheepItems.SUPER_SHEAR_V5);
//						entries.add(opsheepItems.GROW_BACK);

						entries.add(OpSetLoot.OP_HELMET_V1);
						entries.add(OpSetLoot.OP_CHESTPLATE_V1);
						entries.add(OpSetLoot.OP_LEGGINGS_V1);
						entries.add(OpSetLoot.OP_BOOTS_V1);
						entries.add(OpSetLoot.OP_SWORD_V1);
						entries.add(OpSetLoot.OP_PICKAXE_V1);
						entries.add(OpSetLoot.OP_AXE_V1);
						entries.add(OpSetLoot.OP_SHOVEL_V1);
						entries.add(OpSetLoot.OP_HOE_V1);

						entries.add(OpSetLoot.OP_HELMET_V2);
						entries.add(OpSetLoot.OP_CHESTPLATE_V2);
						entries.add(OpSetLoot.OP_LEGGINGS_V2);
						entries.add(OpSetLoot.OP_BOOTS_V2);
						entries.add(OpSetLoot.OP_SWORD_V2);
						entries.add(OpSetLoot.OP_AXE_V2);
						entries.add(OpSetLoot.OP_PICKAXE_V2);
						entries.add(OpSetLoot.OP_SHOVEL_V2);
						entries.add(OpSetLoot.OP_HOE_V2);

//						entries.add(Items.SHEEP_SPAWN_EGG);
					})
					.build()
	);

	public static void registerItemGroups() {
		Opsheep.LOGGER.info("🐑 REGISTER ITEMGROUPS");
	}
}