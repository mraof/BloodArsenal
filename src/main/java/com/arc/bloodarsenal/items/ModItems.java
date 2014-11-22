package com.arc.bloodarsenal.items;

import WayofTime.alchemicalWizardry.AlchemicalWizardry;
import com.arc.bloodarsenal.BloodArsenal;
import com.arc.bloodarsenal.blocks.ModBlocks;
import com.arc.bloodarsenal.items.armor.VampireCostume;
import com.arc.bloodarsenal.items.block.*;
import com.arc.bloodarsenal.items.sigil.SigilEnder;
import com.arc.bloodarsenal.items.sigil.SigilSwimming;
import com.arc.bloodarsenal.items.tool.*;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemReed;

public class ModItems
{
    public static Item bound_bow;
    public static Item blood_orange;
    public static Item blood_infused_pickaxe_wood;
    public static Item blood_infused_axe_wood;
    public static Item blood_infused_shovel_wood;
    public static Item blood_infused_sword_wood;
    public static Item amorphic_catalyst;
    public static Item blood_infused_stick;
    public static Item bound_sickle;
    public static Item blood_infused_pickaxe_iron;
    public static Item blood_infused_axe_iron;
    public static Item blood_infused_shovel_iron;
    public static Item blood_infused_sword_iron;
    public static Item blood_infused_iron;
    public static Item bound_shears;
    public static Item blood_diamond;
    public static Item blood_infused_diamond_unactive;
    public static Item blood_infused_diamond_active;
    public static Item blood_infused_diamond_bound;
    public static Item blood_infused_pickaxe_diamond;
    public static Item blood_infused_axe_diamond;
    public static Item blood_infused_shovel_diamond;
    public static Item blood_infused_sword_diamond;
    public static Item heart;
    public static Item soul_fragment;
    public static Item item_blood_door_wood;
    public static Item item_blood_door_iron;
    public static Item bound_flint_and_steel;
    public static Item soul_booster;
    public static Item soul_nullifier;
    public static Item blood_cookie;
    public static Item orange_juice;
    public static Item juice_and_cookies;
    public static Item item_blood_cake;
    public static Item vampire_cape;
    public static Item vampire_greaves;
    public static Item vampire_boots;
    public static Item vampire_ring;
    public static Item energy_gatling;
    public static Item creative_dagger;
    public static Item sigil_of_swimming;
    public static Item sigil_of_ender;
    public static Item blood_infused_glowstone_dust;

    public static void init()
    {
        bound_bow = new BoundBow();
        blood_orange = new ItemBloodOrange();
        blood_infused_pickaxe_wood = new InfusedWoodPickaxe();
        blood_infused_axe_wood = new InfusedWoodAxe();
        blood_infused_shovel_wood = new InfusedWoodShovel();
        blood_infused_sword_wood = new InfusedWoodSword();
        amorphic_catalyst = new ItemAmorphicCatalyst();
        blood_infused_stick = new InfusedStick();
        bound_sickle = new BoundSickle(AlchemicalWizardry.bloodBoundToolMaterial);
        blood_infused_pickaxe_iron = new InfusedIronPickaxe();
        blood_infused_axe_iron = new InfusedIronAxe();
        blood_infused_shovel_iron = new InfusedIronShovel();
        blood_infused_sword_iron = new InfusedIronSword();
        blood_infused_iron = new InfusedIron();
        bound_shears = new BoundShears();
        blood_diamond = new InfusedDiamond().setUnlocalizedName("blood_diamond");
        blood_infused_diamond_unactive = new InfusedDiamond().setUnlocalizedName("blood_infused_diamond_unactive");
        blood_infused_diamond_active = new InfusedDiamond().setUnlocalizedName("blood_infused_diamond_active");
        blood_infused_diamond_bound = new InfusedDiamond().setUnlocalizedName("blood_infused_diamond_bound");
        blood_infused_pickaxe_diamond = new InfusedDiamondPickaxe();
        blood_infused_axe_diamond = new InfusedDiamondAxe();
        blood_infused_shovel_diamond = new InfusedDiamondShovel();
        blood_infused_sword_diamond = new InfusedDiamondSword();
        heart = new ItemHeart();
        soul_fragment = new ItemSoulFragment();
        item_blood_door_wood = new BloodDoor(Material.wood).setUnlocalizedName("item_blood_door_wood").setTextureName("BloodArsenal:item_blood_door_wood");
        item_blood_door_iron = new BloodDoor(Material.iron).setUnlocalizedName("item_blood_door_iron").setTextureName("BloodArsenal:item_blood_door_iron");
        bound_flint_and_steel = new BoundFlintAndSteel();
        soul_booster = new ItemSoulBooster();
        soul_nullifier = new ItemSoulNullifier();
        blood_cookie = new ItemBloodCookie();
        orange_juice = new ItemOrangeJuice();
        juice_and_cookies = new ItemJuiceAndCookies();
        item_blood_cake = new ItemReed(ModBlocks.blood_cake).setUnlocalizedName("item_blood_cake").setTextureName("BloodArsenal:item_blood_cake").setCreativeTab(BloodArsenal.BA_TAB);
        vampire_cape = new VampireCostume(1).setUnlocalizedName("vampire_cape");
        vampire_greaves = new VampireCostume(2).setUnlocalizedName("vampire_greaves");
        vampire_boots = new VampireCostume(3).setUnlocalizedName("vampire_boots");
        energy_gatling = new EnergyGatling();
        creative_dagger = new ItemCreativeDagger();
        sigil_of_swimming = new SigilSwimming();
        sigil_of_ender = new SigilEnder();
        blood_infused_glowstone_dust = new ItemBloodInfusedGlowstoneDust();
    }

    public static void registerItems()
    {
        GameRegistry.registerItem(ModItems.bound_bow, "bound_bow");
        GameRegistry.registerItem(ModItems.blood_orange, "blood_orange");
        GameRegistry.registerItem(ModItems.blood_infused_pickaxe_wood, "blood_infused_pickaxe_wood");
        GameRegistry.registerItem(ModItems.blood_infused_axe_wood, "blood_infused_axe_wood");
        GameRegistry.registerItem(ModItems.blood_infused_shovel_wood, "blood_infused_shovel_wood");
        GameRegistry.registerItem(ModItems.blood_infused_sword_wood, "blood_infused_sword_wood");
        GameRegistry.registerItem(ModItems.amorphic_catalyst, "amorphic_catalyst");
        GameRegistry.registerItem(ModItems.blood_infused_stick, "blood_infused_stick");
        GameRegistry.registerItem(ModItems.bound_sickle, "bound_sickle");
        GameRegistry.registerItem(ModItems.blood_infused_pickaxe_iron, "blood_infused_pickaxe_iron");
        GameRegistry.registerItem(ModItems.blood_infused_axe_iron, "blood_infused_axe_iron");
        GameRegistry.registerItem(ModItems.blood_infused_shovel_iron, "blood_infused_shovel_iron");
        GameRegistry.registerItem(ModItems.blood_infused_sword_iron, "blood_infused_sword_iron");
        GameRegistry.registerItem(ModItems.blood_infused_iron, "blood_infused_iron");
        GameRegistry.registerItem(ModItems.bound_shears, "bound_shears");
        GameRegistry.registerItem(ModItems.blood_diamond, "blood_diamond");
        GameRegistry.registerItem(ModItems.blood_infused_diamond_unactive, "blood_infused_diamond_unactive");
        GameRegistry.registerItem(ModItems.blood_infused_diamond_active, "blood_infused_diamond_active");
        GameRegistry.registerItem(ModItems.blood_infused_diamond_bound, "blood_infused_diamond_bound");
        GameRegistry.registerItem(ModItems.blood_infused_pickaxe_diamond, "blood_infused_pickaxe_diamond");
        GameRegistry.registerItem(ModItems.blood_infused_axe_diamond, "blood_infused_axe_diamond");
        GameRegistry.registerItem(ModItems.blood_infused_shovel_diamond, "blood_infused_shovel_diamond");
        GameRegistry.registerItem(ModItems.blood_infused_sword_diamond, "blood_infused_sword_diamond");
        GameRegistry.registerItem(ModItems.heart, "heart");
        GameRegistry.registerItem(ModItems.soul_fragment, "soul_fragment");
        GameRegistry.registerItem(ModItems.item_blood_door_wood, "item_blood_door_wood");
        GameRegistry.registerItem(ModItems.item_blood_door_iron, "item_blood_door_iron");
        GameRegistry.registerItem(ModItems.bound_flint_and_steel, "bound_flint_and_steel");
        GameRegistry.registerItem(ModItems.soul_booster, "soul_booster");
        GameRegistry.registerItem(ModItems.soul_nullifier, "soul_nullfier");
        GameRegistry.registerItem(ModItems.blood_cookie, "blood_cookie");
        GameRegistry.registerItem(ModItems.orange_juice, "orange_juice");
        GameRegistry.registerItem(ModItems.juice_and_cookies, "juice_and_cookies");
        GameRegistry.registerItem(ModItems.vampire_cape, "vampire_cape");
        GameRegistry.registerItem(ModItems.vampire_greaves, "vampire_greaves");
        GameRegistry.registerItem(ModItems.vampire_boots, "vampire_boots");
        GameRegistry.registerItem(ModItems.energy_gatling, "energy_gatling");
        GameRegistry.registerItem(ModItems.creative_dagger, "creative_dagger");
        GameRegistry.registerItem(ModItems.sigil_of_swimming, "sigil_of_swimming");
        GameRegistry.registerItem(ModItems.sigil_of_ender, "sigil_of_ender");
        GameRegistry.registerItem(ModItems.blood_infused_glowstone_dust, "blood_infused_glowstone_dust");
    }
}
