package preInit;

import gregtech.api.GTValues;
import gregtech.api.GregTechAPI;
import gregtech.api.items.metaitem.*;
import gregtech.api.unification.material.MarkerMaterials;
import gregtech.api.unification.ore.OrePrefix;
import net.minecraft.util.text.TextFormatting;
import gregtech.api.unification.material.event.PostMaterialEvent;
import gregtech.common.items.behaviors.TooltipBehavior;

eventManager.listen {
    PostMaterialEvent event ->

        log.infoMC("Adding metaitems...")

        StandardMetaItem customMetaItems = new StandardMetaItem((short)2);
        customMetaItems.setRegistryName("meta_battery")

customMetaItems.addItem(4010, "battery.lv.amber_cell")
    .addComponents(ElectricStats.createRechargeableBattery(120000, GTValues.LV))
    .setUnificationData(OrePrefix.battery, MarkerMaterials.Tier.LV)
    .setModelAmount(1)
    .setCreativeTabs(GregTechAPI.TAB_GREGTECH_TOOLS);

customMetaItems.addItem(4011, "battery.uev.test")
    .addComponents(ElectricStats.createRechargeableBattery(3000000000, GTValues.UEV))
    .setUnificationData(OrePrefix.battery, MarkerMaterials.Tier.UEV)
    .setModelAmount(1)
    .setCreativeTabs(GregTechAPI.TAB_GREGTECH_TOOLS);
}