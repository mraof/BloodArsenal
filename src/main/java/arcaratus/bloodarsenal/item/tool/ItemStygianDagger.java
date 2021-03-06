package arcaratus.bloodarsenal.item.tool;

import WayofTime.bloodmagic.client.IVariantProvider;
import arcaratus.bloodarsenal.BloodArsenal;
import net.minecraft.item.ItemSword;

public class ItemStygianDagger extends ItemSword implements IVariantProvider
{
    public ItemStygianDagger(String name)
    {
        super(ToolMaterial.GOLD);

        setTranslationKey(BloodArsenal.MOD_ID + "." + name);
        setCreativeTab(BloodArsenal.TAB_BLOOD_ARSENAL);
        setMaxStackSize(1);
        setMaxDamage(3);
        setFull3D();
    }

//    @Override
//    @SideOnly(Side.CLIENT)
//    public void getSubItems(Item id, CreativeTabs creativeTab, NonNullList<ItemStack> list)
//    {
//        for (int i = 0; i < 3; i++)
//            list.add(new ItemStack(id, 1, i));
//    }
//
//    @Override
//    public boolean showDurabilityBar(ItemStack stack)
//    {
//        return false;
//    }
//
//    @Override
//    @SideOnly(Side.CLIENT)
//    public void addInformation(ItemStack stack, EntityPlayer player, List<String> tooltip, boolean advanced)
//    {
//        if (I18n.hasKey("tooltip.bloodarsenal.stygianDagger.desc"))
//            tooltip.add(TextHelper.localizeEffect("tooltip.bloodarsenal.stygianDagger.desc"));
//
//        tooltip.add(TextHelper.localizeEffect("tooltip.bloodmagic.currentTier", stack.getItemDamage() + 1));
//    }
//
//    @Override
//    public boolean hitEntity(ItemStack stack, EntityLivingBase target, EntityLivingBase attacker)
//    {
//        if (target != null && attacker != null)
//        {
//            if (attacker instanceof EntityPlayer)
//            {
//                int tier = stack.getItemDamage() + 1;
//                target.addPotionEffect(new PotionEffect(ModPotions.BLEEDING, itemRand.nextInt(tier * 3) * 20, tier));
//
//                NetworkHelper.getSoulNetwork((EntityPlayer) attacker).syphonAndDamage((EntityPlayer) attacker, tier * 500 * itemRand.nextInt(tier + 1));
//            }
//        }
//
//        return true;
//    }
//
//    @Override
//    public int getItemEnchantability()
//    {
//        return 0;
//    }
//
//    @Override
//    public EnumRarity getRarity(ItemStack stack)
//    {
//        return EnumRarity.UNCOMMON;
//    }
//
//    @Override
//    public Multimap<String, AttributeModifier> getItemAttributeModifiers(EntityEquipmentSlot equipmentSlot)
//    {
//        Multimap<String, AttributeModifier> multimap = super.getItemAttributeModifiers(equipmentSlot);
//        if (equipmentSlot == EntityEquipmentSlot.MAINHAND)
//        {
//            multimap.put(SharedMonsterAttributes.ATTACK_DAMAGE.getName(), new AttributeModifier(ATTACK_DAMAGE_MODIFIER, "Weapon modifier", 0, 0));
//            multimap.put(SharedMonsterAttributes.ATTACK_SPEED.getName(), new AttributeModifier(ATTACK_SPEED_MODIFIER, "Tool modifier", 0, 0));
//        }
//        return multimap;
//    }
//
//    @Override
//    public List<Pair<Integer, String>> getVariants()
//    {
//        List<Pair<Integer, String>> ret = new ArrayList<>();
//        ret.add(new ImmutablePair<>(0, "normal"));
//        return ret;
//    }
}
