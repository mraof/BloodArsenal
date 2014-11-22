package com.arc.bloodarsenal.items.tinkers;

import com.arc.bloodarsenal.BloodArsenal;
import cpw.mods.fml.common.registry.GameRegistry;
import tconstruct.library.TConstructRegistry;
import tconstruct.library.client.TConstructClientRegistry;

public class BloodArsenalTinkers
{
    public static PartHelper ARROWHEAD;
    public static PartHelper AXE_HEAD;
    public static PartHelper BATTLE_SIGN_HEAD;
    public static PartHelper BINDING;
    public static PartHelper CHISEL_HEAD;
    public static PartHelper CHUNK;
    public static PartHelper CROSSBAR;
    public static PartHelper EXCAVATOR_HEAD;
    public static PartHelper FRYPAN_HEAD;
    public static PartHelper FULL_GUARD;
    public static PartHelper HAMMER_HEAD;
    public static PartHelper KNIFE_BLADE;
    public static PartHelper LARGE_GUARD;
    public static PartHelper LARGE_SWORD_BLADE;
    public static PartHelper LARGEPLATE;
    public static PartHelper LUMBERAXE_HEAD;
    public static PartHelper MEDIUM_GUARD;
    public static PartHelper PICKAXE_HEAD;
    public static PartHelper SCYTHE_HEAD;
    public static PartHelper SHOVEL_HEAD;
    public static PartHelper SWORD_BLADE;
    public static PartHelper TOOLROD;
    public static PartHelper TOUGHBIND;
    public static PartHelper TOUGHROD;

    public static void addMaterials()
    {
        if (BloodArsenal.isTinkersConstructLoaded)
        {
            TConstructRegistry.addToolMaterial(250, "Blood Infused Iron", 3, 250, 2000, 2, 0.75F, 0, 0.0F   , "", "");

            TConstructClientRegistry.addMaterialRenderMapping(250, "BloodArsenal", "blood_infused_iron", true);

            TConstructRegistry.addBowMaterial(250, 500, 40, 1.2F);

            TConstructRegistry.addArrowMaterial(250, 4.7F, 0.2F, 100.0F);
        }
    }

    public static void addParts()
    {
        initParts();

        addMaterialToParts(250, "blood.infused.iron", "blood_infused_iron");

        registerParts();
    }

    private static void initParts()
    {
        ARROWHEAD = new PartHelper("arrowhead", 0, "");
        AXE_HEAD = new PartHelper("axe.head", 0, "");
        BATTLE_SIGN_HEAD = new PartHelper("battle.sign", 0, "");
        BINDING = new PartHelper("binding", 0, "");
        CHISEL_HEAD = new PartHelper("chisel.head", 0, "");
        CHUNK = new PartHelper("chunk", 0, "");
        CROSSBAR = new PartHelper("crossbar", 0, "");
        EXCAVATOR_HEAD = new PartHelper("excavator.head", 0, "");
        FRYPAN_HEAD = new PartHelper("frypan.head", 0, "");
        FULL_GUARD = new PartHelper("full.guard", 0, "");
        HAMMER_HEAD = new PartHelper("hammer.head", 0, "");
        KNIFE_BLADE = new PartHelper("knife.blade", 0, "");
        LARGE_GUARD = new PartHelper("large.guard", 0, "");
        LARGE_SWORD_BLADE = new PartHelper("large.sword.blade", 0, "");
        LARGEPLATE = new PartHelper("largeplate", 0, "");
        LUMBERAXE_HEAD = new PartHelper("lumberaxe.head", 0, "");
        MEDIUM_GUARD = new PartHelper("medium.guard", 0, "");
        PICKAXE_HEAD = new PartHelper("pickaxe.head", 0, "");
        SCYTHE_HEAD = new PartHelper("scythe.head", 0, "");
        SHOVEL_HEAD = new PartHelper("shovel.head", 0, "");
        SWORD_BLADE = new PartHelper("sword.blade", 0, "");
        TOOLROD = new PartHelper("toolrod", 0, "");
        TOUGHBIND = new PartHelper("toughbind", 0, "");
        TOUGHROD = new PartHelper("toughrod", 0, "");
    }

    private static void addMaterialToParts(int materialID, String unlocalizedName, String texture)
    {
        ARROWHEAD.addMaterial(materialID, unlocalizedName, texture + "_arrowhead");
        AXE_HEAD.addMaterial(materialID, unlocalizedName, texture + "_axe_head");
        BATTLE_SIGN_HEAD.addMaterial(materialID, unlocalizedName, texture + "_battlesign_head");
        BINDING.addMaterial(materialID, unlocalizedName, texture + "_binding");
        CHISEL_HEAD.addMaterial(materialID, unlocalizedName, texture + "_chisel_head");
        CHUNK.addMaterial(materialID, unlocalizedName, texture + "_chunk");
        CROSSBAR.addMaterial(materialID, unlocalizedName, texture + "_crossbar");
        EXCAVATOR_HEAD.addMaterial(materialID, unlocalizedName, texture + "_excavator_head");
        FRYPAN_HEAD.addMaterial(materialID, unlocalizedName, texture + "_frypan_head");
        FULL_GUARD.addMaterial(materialID, unlocalizedName, texture + "_full_guard");
        HAMMER_HEAD.addMaterial(materialID, unlocalizedName, texture + "_hammer_head");
        KNIFE_BLADE.addMaterial(materialID, unlocalizedName, texture + "_knife_blade");
        LARGE_GUARD.addMaterial(materialID, unlocalizedName, texture + "_large_guard");
        LARGE_SWORD_BLADE.addMaterial(materialID, unlocalizedName, texture + "_large_sword_blade");
        LARGEPLATE.addMaterial(materialID, unlocalizedName, texture + "_largeplate");
        LUMBERAXE_HEAD.addMaterial(materialID, unlocalizedName, texture + "_lumberaxe_head");
        MEDIUM_GUARD.addMaterial(materialID, unlocalizedName, texture + "_medium_guard");
        PICKAXE_HEAD.addMaterial(materialID, unlocalizedName, texture + "_pickaxe_head");
        SCYTHE_HEAD.addMaterial(materialID, unlocalizedName, texture + "_scythe_head");
        SHOVEL_HEAD.addMaterial(materialID, unlocalizedName, texture + "_shovel_head");
        SWORD_BLADE.addMaterial(materialID, unlocalizedName, texture + "_sword_blade");
        TOOLROD.addMaterial(materialID, unlocalizedName, texture + "_rod");
        TOUGHBIND.addMaterial(materialID, unlocalizedName, texture + "_toughbind");
        TOUGHROD.addMaterial(materialID, unlocalizedName, texture + "_toughrod");
    }

    private static void registerParts()
    {
        GameRegistry.registerItem(ARROWHEAD, "arrowhead");
        GameRegistry.registerItem(AXE_HEAD, "axeHead");
        GameRegistry.registerItem(BATTLE_SIGN_HEAD, "battleSign");
        GameRegistry.registerItem(BINDING, "binding");
        GameRegistry.registerItem(CHISEL_HEAD, "chiselHead");
        GameRegistry.registerItem(CHUNK, "chunk");
        GameRegistry.registerItem(CROSSBAR, "crossbar");
        GameRegistry.registerItem(EXCAVATOR_HEAD, "excavatorHead");
        GameRegistry.registerItem(FRYPAN_HEAD, "frypanHead");
        GameRegistry.registerItem(FULL_GUARD, "fullGuard");
        GameRegistry.registerItem(HAMMER_HEAD, "hammerHead");
        GameRegistry.registerItem(KNIFE_BLADE, "knifeBlade");
        GameRegistry.registerItem(LARGE_GUARD, "largeGuard");
        GameRegistry.registerItem(LARGE_SWORD_BLADE, "largeSwordBlade");
        GameRegistry.registerItem(LARGEPLATE, "largeplate");
        GameRegistry.registerItem(LUMBERAXE_HEAD, "lumberaxeHead");
        GameRegistry.registerItem(MEDIUM_GUARD, "mediumGuard");
        GameRegistry.registerItem(PICKAXE_HEAD, "pickaxeHead");
        GameRegistry.registerItem(SCYTHE_HEAD, "scytheHead");
        GameRegistry.registerItem(SHOVEL_HEAD, "shovelHead");
        GameRegistry.registerItem(SWORD_BLADE, "swordBlade");
        GameRegistry.registerItem(TOOLROD, "toolrod");
        GameRegistry.registerItem(TOUGHBIND, "toughbind");
        GameRegistry.registerItem(TOUGHROD, "toughrod");
    }
}
