import com.hbm.hazard.HazardSystem; 
import com.hbm.hazard.type.*;
import com.hbm.hazard.HazardData;
import com.hbm.hazard.type.HazardTypeRadiation
import com.hbm.hazard.type.HazardTypeHot
import com.hbm.hazard.type.HazardTypeExplosive

final HazardTypeBase RADIATION = new HazardTypeRadiation();
final HazardTypeBase HOT = new HazardTypeHot();
final HazardTypeBase EXPLOSIVE = new HazardTypeExplosive();
final HazardTypeBase HYDROACTIVE = new HazardTypeHydroactive();
//egg splsoive

HazardSystem.register("batteryLv", makeData(EXPLOSIVE, 0.5F).addEntry(HYDROACTIVE, 0.5F));
HazardSystem.register("batteryMv", makeData(EXPLOSIVE, 1.0F).addEntry(HYDROACTIVE, 1.0F));
HazardSystem.register("batteryHv", makeData(EXPLOSIVE, 1.5F).addEntry(HYDROACTIVE, 1.5F));
HazardSystem.register("batteryEv", makeData(EXPLOSIVE, 2.0F).addEntry(HYDROACTIVE, 2.0F));
HazardSystem.register("batteryIv", makeData(EXPLOSIVE, 2.5F).addEntry(HYDROACTIVE, 2.5F));
HazardSystem.register("batteryLuv", makeData(EXPLOSIVE, 3.0F).addEntry(HYDROACTIVE, 3.0F));
HazardSystem.register("batteryZpm", makeData(EXPLOSIVE, 3.5F).addEntry(HYDROACTIVE, 3.5F));
HazardSystem.register("batteryUv", makeData(EXPLOSIVE, 4.0F).addEntry(HYDROACTIVE, 4.0F));

private static HazardData makeData(HazardTypeBase hazard, float level) 
{
    return new HazardData().addEntry(hazard, level); 
}
