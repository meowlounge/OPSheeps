package com.chilllounge.opsheeps.item;

import com.chilllounge.opsheeps.Opsheeps;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.component.type.UnbreakableComponent;
import net.minecraft.item.*;
import net.minecraft.item.equipment.ArmorMaterials;
import net.minecraft.item.equipment.EquipmentType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.text.Style;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.Identifier;

public class OPLootTableItems {
	public static final ToolMaterial OP_TOOL_MATERIAL = new ToolMaterial(
			BlockTags.INCORRECT_FOR_NETHERITE_TOOL, -1, 16.0F, 1.5F, 22, ItemTags.DIAMOND_TOOL_MATERIALS
	);

	public static final RegistryKey<Item> OP_HELMET_KEY = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Opsheeps.MOD_ID, "op_helmet"));
	public static final RegistryKey<Item> OP_CHESTPLATE_KEY = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Opsheeps.MOD_ID, "op_chestplate"));
	public static final RegistryKey<Item> OP_LEGGINGS_KEY = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Opsheeps.MOD_ID, "op_leggings"));
	public static final RegistryKey<Item> OP_BOOTS_KEY = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Opsheeps.MOD_ID, "op_boots"));
	public static final RegistryKey<Item> OP_SWORD_KEY = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Opsheeps.MOD_ID, "op_sword"));
	public static final RegistryKey<Item> OP_AXE_KEY = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Opsheeps.MOD_ID, "op_axe"));
	public static final RegistryKey<Item> OP_PICKAXE_KEY = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Opsheeps.MOD_ID, "op_pickaxe"));
	public static final RegistryKey<Item> OP_SHOVEL_KEY = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Opsheeps.MOD_ID, "op_shovel"));
	public static final RegistryKey<Item> OP_HOE_KEY = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Opsheeps.MOD_ID, "op_hoe"));

	public static final Item OP_HELMET = registerItem(OP_HELMET_KEY,
			new ArmorItem(ArmorMaterials.GOLD, EquipmentType.HELMET,
					new Item.Settings()
							.registryKey(OP_HELMET_KEY)
							.enchantable(200)
							.component(DataComponentTypes.ENCHANTMENT_GLINT_OVERRIDE, true)
							.component(DataComponentTypes.UNBREAKABLE, new UnbreakableComponent(false))
							.component(DataComponentTypes.CUSTOM_NAME, Text.translatable("c")
									.setStyle(Style.EMPTY.withColor(Formatting.RED)
											.withBold(true)
											.withItalic(false)))
			)
	);

	public static final Item OP_CHESTPLATE = registerItem(OP_CHESTPLATE_KEY,
			new ArmorItem(ArmorMaterials.GOLD, EquipmentType.CHESTPLATE,
					new Item.Settings()
							.registryKey(OP_CHESTPLATE_KEY)
							.component(DataComponentTypes.ENCHANTMENT_GLINT_OVERRIDE, true)
							.component(DataComponentTypes.UNBREAKABLE, new UnbreakableComponent(false))
							.component(DataComponentTypes.CUSTOM_NAME, Text.translatable("item.opsheeps.op_chestplate")
									.setStyle(Style.EMPTY.withColor(Formatting.RED)
											.withBold(true)
											.withItalic(false)))
			)
	);

	public static final Item OP_LEGGINGS = registerItem(OP_LEGGINGS_KEY,
			new ArmorItem(ArmorMaterials.GOLD, EquipmentType.LEGGINGS,
					new Item.Settings()
							.registryKey(OP_LEGGINGS_KEY)
							.component(DataComponentTypes.ENCHANTMENT_GLINT_OVERRIDE, true)
							.component(DataComponentTypes.UNBREAKABLE, new UnbreakableComponent(false))
							.component(DataComponentTypes.CUSTOM_NAME, Text.translatable("item.opsheeps.op_leggings")
									.setStyle(Style.EMPTY.withColor(Formatting.RED)
											.withBold(true)
											.withItalic(false)))
			)
	);

	public static final Item OP_BOOTS = registerItem(OP_BOOTS_KEY,
			new ArmorItem(ArmorMaterials.GOLD, EquipmentType.BOOTS,
					new Item.Settings()
							.registryKey(OP_BOOTS_KEY)
							.component(DataComponentTypes.ENCHANTMENT_GLINT_OVERRIDE, true)
							.component(DataComponentTypes.UNBREAKABLE, new UnbreakableComponent(false))
							.component(DataComponentTypes.CUSTOM_NAME, Text.translatable("item.opsheeps.op_boots")
									.setStyle(Style.EMPTY.withColor(Formatting.RED)
											.withBold(true)
											.withItalic(false)))
			)
	);

	public static final Item OP_SWORD = registerItem(OP_SWORD_KEY,
			new SwordItem(OP_TOOL_MATERIAL, 6, -1.4F,
					new Item.Settings()
							.enchantable(200)
							.registryKey(OP_SWORD_KEY)
							.component(DataComponentTypes.ENCHANTMENT_GLINT_OVERRIDE, true)
							.component(DataComponentTypes.UNBREAKABLE, new UnbreakableComponent(false))
							.component(DataComponentTypes.CUSTOM_NAME, Text.translatable("item.opsheeps.op_sword")
									.setStyle(Style.EMPTY.withColor(Formatting.RED)
											.withBold(true)
											.withItalic(false)))
			)
	);

	public static final Item OP_AXE = registerItem(OP_AXE_KEY,
			new AxeItem(OP_TOOL_MATERIAL, 11, -3.0F,
					new Item.Settings()
							.enchantable(200)
							.registryKey(OP_AXE_KEY)
							.component(DataComponentTypes.ENCHANTMENT_GLINT_OVERRIDE, true)
							.component(DataComponentTypes.UNBREAKABLE, new UnbreakableComponent(false))
							.component(DataComponentTypes.CUSTOM_NAME, Text.translatable("item.opsheeps.op_axe")
									.setStyle(Style.EMPTY.withColor(Formatting.RED)
											.withBold(true)
											.withItalic(false)))
			)
	);

	public static final Item OP_PICKAXE = registerItem(OP_PICKAXE_KEY,
			new PickaxeItem(OP_TOOL_MATERIAL, 1, -2.8F,
					new Item.Settings()
							.enchantable(200)
							.registryKey(OP_PICKAXE_KEY)
							.component(DataComponentTypes.ENCHANTMENT_GLINT_OVERRIDE, true)
							.component(DataComponentTypes.UNBREAKABLE, new UnbreakableComponent(false))
							.component(DataComponentTypes.CUSTOM_NAME, Text.translatable("item.opsheeps.op_pickaxe")
									.setStyle(Style.EMPTY.withColor(Formatting.RED)
											.withBold(true)
											.withItalic(false)))
			)
	);

	public static final Item OP_SHOVEL = registerItem(OP_SHOVEL_KEY,
			new ShovelItem(OP_TOOL_MATERIAL, 1.5F, -3.0F,
					new Item.Settings()
							.registryKey(OP_SHOVEL_KEY)
							.component(DataComponentTypes.UNBREAKABLE, new UnbreakableComponent(false))
							.component(DataComponentTypes.ENCHANTMENT_GLINT_OVERRIDE, true)
							.component(DataComponentTypes.CUSTOM_NAME, Text.translatable("item.opsheeps.op_shovel")
									.setStyle(Style.EMPTY.withColor(Formatting.RED)
											.withBold(true)
											.withItalic(false)))
			)
	);

	public static final Item OP_HOE = registerItem(OP_HOE_KEY,
			new HoeItem(OP_TOOL_MATERIAL, 0, -1.0F,
					new Item.Settings()
							.registryKey(OP_HOE_KEY)
							.component(DataComponentTypes.UNBREAKABLE, new UnbreakableComponent(false))
							.component(DataComponentTypes.ENCHANTMENT_GLINT_OVERRIDE, true)
							.component(DataComponentTypes.CUSTOM_NAME, Text.translatable("item.opsheeps.op_hoe")
									.setStyle(Style.EMPTY.withColor(Formatting.RED)
											.withBold(true)
											.withItalic(false)))
			)
	);

	private static Item registerItem(RegistryKey<Item> key, Item item) {
		return Registry.register(Registries.ITEM, key.getValue(), item);
	}

	public static void registerLootTableItems() {
		Opsheeps.LOGGER.info("🐑 REGISTER OP LOOTTABLE ITEMS");
	}
}
