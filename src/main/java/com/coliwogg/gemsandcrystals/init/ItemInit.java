package com.coliwogg.gemsandcrystals.init;

import com.coliwogg.gemsandcrystals.GemsandCrystals;
import com.coliwogg.gemsandcrystals.GemsandCrystals.GemsandCrystalsItemGroup;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.LazyValue;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.Supplier;

public class ItemInit {
    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, GemsandCrystals.MODID);

    /* Items */
    public static final RegistryObject<Item> RUBY = ITEMS.register("ruby", () -> new Item(new Item.Properties().group(GemsandCrystalsItemGroup.instance)));
    public static final RegistryObject<Item> SAPPHIRE = ITEMS.register("sapphire", () -> new Item(new Item.Properties().group(GemsandCrystalsItemGroup.instance)));
    public static final RegistryObject<Item> TOPAZ = ITEMS.register("topaz", () -> new Item(new Item.Properties().group(GemsandCrystalsItemGroup.instance)));
    public static final RegistryObject<Item> AMETHYST = ITEMS.register("amethyst", () -> new Item(new Item.Properties().group(GemsandCrystalsItemGroup.instance)));

    /* Tools */
    public static final RegistryObject<Item> RUBY_AXE = ITEMS.register("ruby_axe", () -> new AxeItem(ModItemTier.RUBY, 5.0F, -2.8F, new Item.Properties().group(GemsandCrystalsItemGroup.instance)));
    public static final RegistryObject<Item> RUBY_HOE = ITEMS.register("ruby_hoe", () -> new HoeItem(ModItemTier.RUBY, 2.0F, new Item.Properties().group(GemsandCrystalsItemGroup.instance)));
    public static final RegistryObject<Item> RUBY_PICKAXE = ITEMS.register("ruby_pickaxe", () -> new PickaxeItem(ModItemTier.RUBY, 1, -2.8F, new Item.Properties().group(GemsandCrystalsItemGroup.instance)));
    public static final RegistryObject<Item> RUBY_SHOVEL = ITEMS.register("ruby_shovel", () -> new ShovelItem(ModItemTier.RUBY, 1.5F, -3.0F, new Item.Properties().group(GemsandCrystalsItemGroup.instance)));
    public static final RegistryObject<Item> RUBY_SWORD = ITEMS.register("ruby_sword", () -> new SwordItem(ModItemTier.RUBY, 3, -2.4F, new Item.Properties().group(GemsandCrystalsItemGroup.instance)));

    public static final RegistryObject<Item> SAPPHIRE_AXE = ITEMS.register("sapphire_axe", () -> new AxeItem(ModItemTier.SAPPHIRE, 5.0F, -2.8F, new Item.Properties().group(GemsandCrystalsItemGroup.instance)));
    public static final RegistryObject<Item> SAPPHIRE_HOE = ITEMS.register("sapphire_hoe", () -> new HoeItem(ModItemTier.SAPPHIRE, 2.0F, new Item.Properties().group(GemsandCrystalsItemGroup.instance)));
    public static final RegistryObject<Item> SAPPHIRE_PICKAXE = ITEMS.register("sapphire_pickaxe", () -> new PickaxeItem(ModItemTier.SAPPHIRE, 1, -2.8F, new Item.Properties().group(GemsandCrystalsItemGroup.instance)));
    public static final RegistryObject<Item> SAPPHIRE_SHOVEL = ITEMS.register("sapphire_shovel", () -> new ShovelItem(ModItemTier.SAPPHIRE, 1.5F, -3.0F, new Item.Properties().group(GemsandCrystalsItemGroup.instance)));
    public static final RegistryObject<Item> SAPPHIRE_SWORD = ITEMS.register("sapphire_sword", () -> new SwordItem(ModItemTier.SAPPHIRE, 3, -2.4F, new Item.Properties().group(GemsandCrystalsItemGroup.instance)));

    public static final RegistryObject<Item> EMERALD_AXE = ITEMS.register("emerald_axe", () -> new AxeItem(ModItemTier.EMERALD, 5.5F, -2.9F, new Item.Properties().group(GemsandCrystalsItemGroup.instance)));
    public static final RegistryObject<Item> EMERALD_HOE = ITEMS.register("emerald_hoe", () -> new HoeItem(ModItemTier.EMERALD, 1.0F, new Item.Properties().group(GemsandCrystalsItemGroup.instance)));
    public static final RegistryObject<Item> EMERALD_PICKAXE = ITEMS.register("emerald_pickaxe", () -> new PickaxeItem(ModItemTier.EMERALD, 1, -2.8F, new Item.Properties().group(GemsandCrystalsItemGroup.instance)));
    public static final RegistryObject<Item> EMERALD_SHOVEL = ITEMS.register("emerald_shovel", () -> new ShovelItem(ModItemTier.EMERALD, 1.5F, -3.0F, new Item.Properties().group(GemsandCrystalsItemGroup.instance)));
    public static final RegistryObject<Item> EMERALD_SWORD = ITEMS.register("emerald_sword", () -> new SwordItem(ModItemTier.EMERALD, 3, -2.4F, new Item.Properties().group(GemsandCrystalsItemGroup.instance)));

    public static final RegistryObject<Item> TOPAZ_AXE = ITEMS.register("topaz_axe", () -> new AxeItem(ModItemTier.TOPAZ, 5.3F, -3.03F, new Item.Properties().group(GemsandCrystalsItemGroup.instance)));
    public static final RegistryObject<Item> TOPAZ_HOE = ITEMS.register("topaz_hoe", () -> new HoeItem(ModItemTier.TOPAZ, -0.3F, new Item.Properties().group(GemsandCrystalsItemGroup.instance)));
    public static final RegistryObject<Item> TOPAZ_PICKAXE = ITEMS.register("topaz_pickaxe", () -> new PickaxeItem(ModItemTier.TOPAZ, 1, -2.8F, new Item.Properties().group(GemsandCrystalsItemGroup.instance)));
    public static final RegistryObject<Item> TOPAZ_SHOVEL = ITEMS.register("topaz_shovel", () -> new ShovelItem(ModItemTier.TOPAZ, 1.5F, -3.0F, new Item.Properties().group(GemsandCrystalsItemGroup.instance)));
    public static final RegistryObject<Item> TOPAZ_SWORD = ITEMS.register("topaz_sword", () -> new SwordItem(ModItemTier.TOPAZ, 3, -2.4F, new Item.Properties().group(GemsandCrystalsItemGroup.instance)));

    public static final RegistryObject<Item> AMETHYST_AXE = ITEMS.register("amethyst_axe", () -> new AxeItem(ModItemTier.AMETHYST, 5.7F, -3.07F, new Item.Properties().group(GemsandCrystalsItemGroup.instance)));
    public static final RegistryObject<Item> AMETHYST_HOE = ITEMS.register("amethyst_hoe", () -> new HoeItem(ModItemTier.AMETHYST, -0.7F, new Item.Properties().group(GemsandCrystalsItemGroup.instance)));
    public static final RegistryObject<Item> AMETHYST_PICKAXE = ITEMS.register("amethyst_pickaxe", () -> new PickaxeItem(ModItemTier.AMETHYST, 1, -2.8F, new Item.Properties().group(GemsandCrystalsItemGroup.instance)));
    public static final RegistryObject<Item> AMETHYST_SHOVEL = ITEMS.register("amethyst_shovel", () -> new ShovelItem(ModItemTier.AMETHYST, 1.5F, -3.0F, new Item.Properties().group(GemsandCrystalsItemGroup.instance)));
    public static final RegistryObject<Item> AMETHYST_SWORD = ITEMS.register("amethyst_sword", () -> new SwordItem(ModItemTier.AMETHYST, 3, -2.4F, new Item.Properties().group(GemsandCrystalsItemGroup.instance)));

    public static final RegistryObject<Item> QUARTZ_AXE = ITEMS.register("quartz_axe", () -> new AxeItem(ModItemTier.QUARTZ, 6.5F, -3.15F, new Item.Properties().group(GemsandCrystalsItemGroup.instance)));
    public static final RegistryObject<Item> QUARTZ_HOE = ITEMS.register("quartz_hoe", () -> new HoeItem(ModItemTier.QUARTZ, -1.5F, new Item.Properties().group(GemsandCrystalsItemGroup.instance)));
    public static final RegistryObject<Item> QUARTZ_PICKAXE = ITEMS.register("quartz_pickaxe", () -> new PickaxeItem(ModItemTier.QUARTZ, 1, -2.8F, new Item.Properties().group(GemsandCrystalsItemGroup.instance)));
    public static final RegistryObject<Item> QUARTZ_SHOVEL = ITEMS.register("quartz_shovel", () -> new ShovelItem(ModItemTier.QUARTZ, 1.5F, -3.0F, new Item.Properties().group(GemsandCrystalsItemGroup.instance)));
    public static final RegistryObject<Item> QUARTZ_SWORD = ITEMS.register("quartz_sword", () -> new SwordItem(ModItemTier.QUARTZ, 3, -2.4F, new Item.Properties().group(GemsandCrystalsItemGroup.instance)));

    /* Armor */
    public static final RegistryObject<Item> RUBY_HELMET = ITEMS.register("ruby_helmet", () -> new ArmorItem(ModArmorMaterial.RUBY, EquipmentSlotType.HEAD, new Item.Properties().group(GemsandCrystalsItemGroup.instance)));
    public static final RegistryObject<Item> RUBY_CHESTPLATE = ITEMS.register("ruby_chestplate", () -> new ArmorItem(ModArmorMaterial.RUBY, EquipmentSlotType.CHEST, new Item.Properties().group(GemsandCrystalsItemGroup.instance)));
    public static final RegistryObject<Item> RUBY_LEGGINGS = ITEMS.register("ruby_leggings", () -> new ArmorItem(ModArmorMaterial.RUBY, EquipmentSlotType.LEGS, new Item.Properties().group(GemsandCrystalsItemGroup.instance)));
    public static final RegistryObject<Item> RUBY_BOOTS = ITEMS.register("ruby_boots", () -> new ArmorItem(ModArmorMaterial.RUBY, EquipmentSlotType.FEET, new Item.Properties().group(GemsandCrystalsItemGroup.instance)));

    public static final RegistryObject<Item> SAPPHIRE_HELMET = ITEMS.register("sapphire_helmet", () -> new ArmorItem(ModArmorMaterial.SAPPHIRE, EquipmentSlotType.HEAD, new Item.Properties().group(GemsandCrystalsItemGroup.instance)));
    public static final RegistryObject<Item> SAPPHIRE_CHESTPLATE = ITEMS.register("sapphire_chestplate", () -> new ArmorItem(ModArmorMaterial.SAPPHIRE, EquipmentSlotType.CHEST, new Item.Properties().group(GemsandCrystalsItemGroup.instance)));
    public static final RegistryObject<Item> SAPPHIRE_LEGGINGS = ITEMS.register("sapphire_leggings", () -> new ArmorItem(ModArmorMaterial.SAPPHIRE, EquipmentSlotType.LEGS, new Item.Properties().group(GemsandCrystalsItemGroup.instance)));
    public static final RegistryObject<Item> SAPPHIRE_BOOTS = ITEMS.register("sapphire_boots", () -> new ArmorItem(ModArmorMaterial.SAPPHIRE, EquipmentSlotType.FEET, new Item.Properties().group(GemsandCrystalsItemGroup.instance)));

    public static final RegistryObject<Item> EMERALD_HELMET = ITEMS.register("emerald_helmet", () -> new ArmorItem(ModArmorMaterial.EMERALD, EquipmentSlotType.HEAD, new Item.Properties().group(GemsandCrystalsItemGroup.instance)));
    public static final RegistryObject<Item> EMERALD_CHESTPLATE = ITEMS.register("emerald_chestplate", () -> new ArmorItem(ModArmorMaterial.EMERALD, EquipmentSlotType.CHEST, new Item.Properties().group(GemsandCrystalsItemGroup.instance)));
    public static final RegistryObject<Item> EMERALD_LEGGINGS = ITEMS.register("emerald_leggings", () -> new ArmorItem(ModArmorMaterial.EMERALD, EquipmentSlotType.LEGS, new Item.Properties().group(GemsandCrystalsItemGroup.instance)));
    public static final RegistryObject<Item> EMERALD_BOOTS = ITEMS.register("emerald_boots", () -> new ArmorItem(ModArmorMaterial.EMERALD, EquipmentSlotType.FEET, new Item.Properties().group(GemsandCrystalsItemGroup.instance)));

    public static final RegistryObject<Item> TOPAZ_HELMET = ITEMS.register("topaz_helmet", () -> new ArmorItem(ModArmorMaterial.TOPAZ, EquipmentSlotType.HEAD, new Item.Properties().group(GemsandCrystalsItemGroup.instance)));
    public static final RegistryObject<Item> TOPAZ_CHESTPLATE = ITEMS.register("topaz_chestplate", () -> new ArmorItem(ModArmorMaterial.TOPAZ, EquipmentSlotType.CHEST, new Item.Properties().group(GemsandCrystalsItemGroup.instance)));
    public static final RegistryObject<Item> TOPAZ_LEGGINGS = ITEMS.register("topaz_leggings", () -> new ArmorItem(ModArmorMaterial.TOPAZ, EquipmentSlotType.LEGS, new Item.Properties().group(GemsandCrystalsItemGroup.instance)));
    public static final RegistryObject<Item> TOPAZ_BOOTS = ITEMS.register("topaz_boots", () -> new ArmorItem(ModArmorMaterial.TOPAZ, EquipmentSlotType.FEET, new Item.Properties().group(GemsandCrystalsItemGroup.instance)));

    public static final RegistryObject<Item> AMETHYST_HELMET = ITEMS.register("amethyst_helmet", () -> new ArmorItem(ModArmorMaterial.AMETHYST, EquipmentSlotType.HEAD, new Item.Properties().group(GemsandCrystalsItemGroup.instance)));
    public static final RegistryObject<Item> AMETHYST_CHESTPLATE = ITEMS.register("amethyst_chestplate", () -> new ArmorItem(ModArmorMaterial.AMETHYST, EquipmentSlotType.CHEST, new Item.Properties().group(GemsandCrystalsItemGroup.instance)));
    public static final RegistryObject<Item> AMETHYST_LEGGINGS = ITEMS.register("amethyst_leggings", () -> new ArmorItem(ModArmorMaterial.AMETHYST, EquipmentSlotType.LEGS, new Item.Properties().group(GemsandCrystalsItemGroup.instance)));
    public static final RegistryObject<Item> AMETHYST_BOOTS = ITEMS.register("amethyst_boots", () -> new ArmorItem(ModArmorMaterial.AMETHYST, EquipmentSlotType.FEET, new Item.Properties().group(GemsandCrystalsItemGroup.instance)));

    public static final RegistryObject<Item> QUARTZ_HELMET = ITEMS.register("quartz_helmet", () -> new ArmorItem(ModArmorMaterial.QUARTZ, EquipmentSlotType.HEAD, new Item.Properties().group(GemsandCrystalsItemGroup.instance)));
    public static final RegistryObject<Item> QUARTZ_CHESTPLATE = ITEMS.register("quartz_chestplate", () -> new ArmorItem(ModArmorMaterial.QUARTZ, EquipmentSlotType.CHEST, new Item.Properties().group(GemsandCrystalsItemGroup.instance)));
    public static final RegistryObject<Item> QUARTZ_LEGGINGS = ITEMS.register("quartz_leggings", () -> new ArmorItem(ModArmorMaterial.QUARTZ, EquipmentSlotType.LEGS, new Item.Properties().group(GemsandCrystalsItemGroup.instance)));
    public static final RegistryObject<Item> QUARTZ_BOOTS = ITEMS.register("quartz_boots", () -> new ArmorItem(ModArmorMaterial.QUARTZ, EquipmentSlotType.FEET, new Item.Properties().group(GemsandCrystalsItemGroup.instance)));

    public enum ModItemTier implements IItemTier {
        // int harvestLevel, int maxUses, float efficiency, float attackDamage, int enchantability, Supplier<Ingredient> repairMaterial
        RUBY(3, 900, 9.0F, 4.0F, 12, () -> {
            return Ingredient.fromItems(ItemInit.RUBY.get());
        }),
        SAPPHIRE(3, 900, 9.0F, 4.0F, 12, () -> {
            return Ingredient.fromItems(ItemInit.SAPPHIRE.get());
        }),
        EMERALD(3, 850, 8.5F, 3.5F, 11, () -> {
            return Ingredient.fromItems(Items.EMERALD);
        }),
        TOPAZ(2, 775, 8.0F, 2.7F, 9, () -> {
            return Ingredient.fromItems(ItemInit.TOPAZ.get());
        }),
        AMETHYST(2, 775, 8.0F, 2.3F, 9, () -> {
            return Ingredient.fromItems(ItemInit.AMETHYST.get());
        }),
        QUARTZ(2, 400, 7.0F, 1.5F, 7, () -> {
            return Ingredient.fromItems(Items.QUARTZ);
        });

        private final int harvestLevel;
        private final int maxUses;
        private final float efficiency;
        private final float attackDamage;
        private final int enchantability;
        private final LazyValue<Ingredient> repairMaterial;

        ModItemTier(int harvestLevel, int maxUses, float efficiency, float attackDamage, int enchantability, Supplier<Ingredient> repairMaterial) {
            this.harvestLevel = harvestLevel;
            this.maxUses = maxUses;
            this.efficiency = efficiency;
            this.attackDamage = attackDamage;
            this.enchantability = enchantability;
            this.repairMaterial = new LazyValue<>(repairMaterial);
        }

        @Override
        public int getMaxUses() {
            return this.maxUses;
        }

        @Override
        public float getEfficiency() {
            return this.efficiency;
        }

        @Override
        public float getAttackDamage() {
            return this.attackDamage;
        }

        @Override
        public int getHarvestLevel() {
            return this.harvestLevel;
        }

        @Override
        public int getEnchantability() {
            return this.enchantability;
        }

        @Override
        public Ingredient getRepairMaterial() {
            return this.repairMaterial.getValue();
        }
    }

    public enum ModArmorMaterial implements IArmorMaterial {

        // String nameIn, int maxDamageFactorIn, int[] damageReductionAmountIn, int enchantabilityIn, String soundEventIn, float toughnessIn, Supplier<Ingredient> repairMaterialIn
        RUBY(GemsandCrystals.MODID + ":ruby", 35, new int[]{4, 7, 9, 4}, 11, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 3.0F, () -> {
            return Ingredient.fromItems(ItemInit.RUBY.get());
        }),

        SAPPHIRE(GemsandCrystals.MODID + ":sapphire", 35, new int[]{4, 7, 9, 4}, 11, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 3.0F, () -> {
            return Ingredient.fromItems(ItemInit.SAPPHIRE.get());
        }),

        EMERALD(GemsandCrystals.MODID + ":emerald", 33, new int[]{4, 6, 9, 3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.5F, () -> {
            return Ingredient.fromItems(Items.EMERALD);
        }),

        TOPAZ(GemsandCrystals.MODID + ":topaz", 20, new int[]{2, 6, 7, 2}, 9, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 1.0F, () -> {
            return Ingredient.fromItems(ItemInit.TOPAZ.get());
        }),

        AMETHYST(GemsandCrystals.MODID + ":amethyst", 17, new int[]{3, 5, 6, 3}, 9, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0.0F, () -> {
            return Ingredient.fromItems(ItemInit.AMETHYST.get());
        }),

        QUARTZ(GemsandCrystals.MODID + ":quartz", 10, new int[]{1, 4, 5, 2}, 12, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0.0F, () -> {
            return Ingredient.fromItems(Items.QUARTZ);
        });

        private static final int[] MAX_DAMAGE_ARRAY = new int[]{16, 16, 16, 16};
        private final String name;
        private final int maxDamageFactor;
        private final int[] damageReductionAmountArray;
        private final int enchantability;
        private final SoundEvent soundEvent;
        private final float toughness;
        private final LazyValue<Ingredient> repairMaterial;

        ModArmorMaterial(String nameIn, int maxDamageFactorIn, int[] damageReductionAmountIn, int enchantabilityIn, SoundEvent soundEventIn, float toughnessIn, Supplier<Ingredient> repairMaterialIn) {
            this.name = nameIn;
            this.maxDamageFactor = maxDamageFactorIn;
            this.damageReductionAmountArray = damageReductionAmountIn;
            this.enchantability = enchantabilityIn;
            this.soundEvent = soundEventIn;
            this.toughness = toughnessIn;
            this.repairMaterial = new LazyValue<>(repairMaterialIn);
        }

        @Override
        public int getDurability(EquipmentSlotType slotIn) {
            return MAX_DAMAGE_ARRAY[slotIn.getIndex()] * this.maxDamageFactor;
        }

        @Override
        public int getDamageReductionAmount(EquipmentSlotType slotIn) {
            return this.damageReductionAmountArray[slotIn.getIndex()];
        }

        @Override
        public int getEnchantability() {
            return this.enchantability;
        }

        @Override
        public SoundEvent getSoundEvent() {
            return this.soundEvent;
        }

        @Override
        public Ingredient getRepairMaterial() {
            return this.repairMaterial.getValue();
        }

        @OnlyIn(Dist.CLIENT)
        @Override
        public String getName() {
            return this.name;
        }

        @Override
        public float getToughness() {
            return this.toughness;
        }
    }
}
