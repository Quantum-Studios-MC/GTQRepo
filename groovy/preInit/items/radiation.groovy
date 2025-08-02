import com.hbm.hazard.HazardSystem; 
import com.hbm.hazard.type.*;
import com.hbm.hazard.HazardData;
import com.hbm.hazard.type.HazardTypeRadiation

final HazardTypeBase RADIATION = new HazardTypeRadiation();

// Rad/s is Calculated from the Isotopes Half Life
// I say Calculated :> seems more like completely made the fuck up
// Higher Half Life means lower Rad/s 
/*
a means years btw 

5a = 30 Rads => 30.0f 
4.500.000.000a = 000,25 Rads  => 0.25f

*/
// Float Level determines Rad/s 1:1

HazardSystem.register("stickLongUranium235", makeData(RADIATION, 1.0F));

HazardSystem.register("dustTinyUranium238", makeData(RADIATION, 0.03F));
HazardSystem.register("dustSmallUranium238", makeData(RADIATION, 0.06F));
HazardSystem.register("dustImpureUranium238", makeData(RADIATION, 0.25F));
HazardSystem.register("dustPureUranium238", makeData(RADIATION, 0.25F));
HazardSystem.register("crushedUranium238", makeData(RADIATION, 0.25F));
HazardSystem.register("crushedPurifiedUranium238", makeData(RADIATION, 0.25F));
HazardSystem.register("crushedCentrifugedUranium238", makeData(RADIATION, 0.25F));
HazardSystem.register("plateUranium238", makeData(RADIATION, 0.25F));
HazardSystem.register("stickUranium238", makeData(RADIATION, 0.12F));

HazardSystem.register("dustTinyUranium235", makeData(RADIATION, 0.11F));
HazardSystem.register("dustSmallUranium235", makeData(RADIATION, 0.25F));
HazardSystem.register("dustImpureUranium235", makeData(RADIATION, 1.0F));
HazardSystem.register("dustPureUranium235", makeData(RADIATION, 1.0F));
HazardSystem.register("crushedUranium235", makeData(RADIATION, 1.0F));
HazardSystem.register("dustUranium235", makeData(RADIATION, 1.0F));
HazardSystem.register("crushedPurifiedUranium235", makeData(RADIATION, 1.0F));
HazardSystem.register("crushedCentrifugedUranium235", makeData(RADIATION, 1.0F));
HazardSystem.register("plateUranium235", makeData(RADIATION, 1.0F));
HazardSystem.register("stickUranium235", makeData(RADIATION, 0.5F));

HazardSystem.register("nuggetRadium", makeData(RADIATION, 0.83F));
HazardSystem.register("dustRadium", makeData(RADIATION, 7.5F));
HazardSystem.register("ingotRadium", makeData(RADIATION, 7.5F));
HazardSystem.register("blockRadium", makeData(RADIATION, 67.5F));

HazardSystem.register("nuggetActinium", makeData(RADIATION, 3.33F));
HazardSystem.register("dustActinium", makeData(RADIATION, 30.0F));
HazardSystem.register("ingotActinium", makeData(RADIATION, 30.0F));
HazardSystem.register("blockActinium", makeData(RADIATION, 270.0F));

HazardSystem.register("dustTinyNeptunium", makeData(RADIATION, 0.83F));
HazardSystem.register("dustSmallNeptunium", makeData(RADIATION, 1.88F));

HazardSystem.register("dustTinyAmericium", makeData(RADIATION, 0.94F));
HazardSystem.register("dustSmallAmericium", makeData(RADIATION, 2.12F));
HazardSystem.register("dustImpureAmericium", makeData(RADIATION, 8.5F));
HazardSystem.register("dustPureAmericium", makeData(RADIATION, 8.5F));
HazardSystem.register("crushedAmericium", makeData(RADIATION, 8.5F));
HazardSystem.register("crushedPurifiedAmericium", makeData(RADIATION, 8.5F));
HazardSystem.register("crushedCentrifugedAmericium", makeData(RADIATION, 8.5F));
HazardSystem.register("plateAmericium", makeData(RADIATION, 8.5F));
HazardSystem.register("stickAmericium", makeData(RADIATION, 4.25F));
HazardSystem.register("nuggetAmericium", makeData(RADIATION, 0.94F));
HazardSystem.register("dustAmericium", makeData(RADIATION, 8.5F));
HazardSystem.register("ingotAmericium", makeData(RADIATION, 8.5F));
HazardSystem.register("blockAmericium", makeData(RADIATION, 76.5F));

HazardSystem.register("dustTinyPlutonium239", makeData(RADIATION, 0.56F));
HazardSystem.register("dustSmallPlutonium239", makeData(RADIATION, 1.25F));
HazardSystem.register("dustImpurePlutonium239", makeData(RADIATION, 5.0F));
HazardSystem.register("dustPurePlutonium239", makeData(RADIATION, 5.0F));
HazardSystem.register("crushedPlutonium239", makeData(RADIATION, 5.0F));
HazardSystem.register("crushedPurifiedPlutonium239", makeData(RADIATION, 5.0F));
HazardSystem.register("crushedCentrifugedPlutonium239", makeData(RADIATION, 5.0F));
HazardSystem.register("platePlutonium239", makeData(RADIATION, 5.0F));
HazardSystem.register("stickPlutonium239", makeData(RADIATION, 2.5F));

HazardSystem.register("dustTinyThorium", makeData(RADIATION, 0.01F));
HazardSystem.register("dustSmallThorium", makeData(RADIATION, 0.03F));
HazardSystem.register("dustImpureThorium", makeData(RADIATION, 0.1F));
HazardSystem.register("dustPureThorium", makeData(RADIATION, 0.1F));
HazardSystem.register("crushedThorium", makeData(RADIATION, 0.1F));
HazardSystem.register("crushedPurifiedThorium", makeData(RADIATION, 0.1F));
HazardSystem.register("crushedCentrifugedThorium", makeData(RADIATION, 0.1F));
HazardSystem.register("plateThorium", makeData(RADIATION, 0.1F));
HazardSystem.register("stickThorium", makeData(RADIATION, 0.05F));

HazardSystem.register("nuggetTechnetium", makeData(RADIATION, 0.31F));
HazardSystem.register("dustTechnetium", makeData(RADIATION, 2.75F));
HazardSystem.register("ingotTechnetium", makeData(RADIATION, 2.75F));
HazardSystem.register("blockTechnetium", makeData(RADIATION, 24.75F));

HazardSystem.register("dustTinyPlutonium241", makeData(RADIATION, 2.78F));
HazardSystem.register("dustSmallPlutonium241", makeData(RADIATION, 6.25F));
HazardSystem.register("dustImpurePlutonium241", makeData(RADIATION, 25.0F));
HazardSystem.register("dustPurePlutonium241", makeData(RADIATION, 25.0F));
HazardSystem.register("crushedPlutonium241", makeData(RADIATION, 25.0F));
HazardSystem.register("crushedPurifiedPlutonium241", makeData(RADIATION, 25.0F));
HazardSystem.register("crushedCentrifugedPlutonium241", makeData(RADIATION, 25.0F));
HazardSystem.register("platePlutonium241", makeData(RADIATION, 25.0F));
HazardSystem.register("stickPlutonium241", makeData(RADIATION, 12.5F));

HazardSystem.register("dustTinyTechnetium", makeData(RADIATION, 0.31F));
HazardSystem.register("dustSmallTechnetium", makeData(RADIATION, 0.69F));
HazardSystem.register("blockPlutonium241", makeData(RADIATION, 225.0F));
HazardSystem.register("stickLongPlutonium241", makeData(RADIATION, 25.0F));
HazardSystem.register("foilPlutonium241", makeData(RADIATION, 6.25F));
HazardSystem.register("plateDensePlutonium239", makeData(RADIATION, 45.0F));
HazardSystem.register("plateDoublePlutonium241", makeData(RADIATION, 50.0F));
HazardSystem.register("dustPlutonium241", makeData(RADIATION, 25.0F));
HazardSystem.register("dustUranium235", makeData(RADIATION, 1.0F));


private static HazardData makeData(HazardTypeBase hazard, float level) 
{
    return new HazardData().addEntry(hazard, level); 
}
