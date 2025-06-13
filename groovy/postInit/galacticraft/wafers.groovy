import gregtech.api.GTValues;


recipemap('assembler').recipeBuilder()
        .fluidInputs(fluid('dye_blue') * 1000)
        .inputs(ore('plateSilicon') * 7)
        .inputs(ore('dustRedPhosphorus') * 3)
        .inputs(item('gregtech:meta_item_1', 371))
        .outputs(item('galacticraftcore:basic_item', 12))
        .duration(120).EUt(GTValues.VA[GTValues.MV]).buildAndRegister()
    
recipemap('assembler').recipeBuilder()
        .fluidInputs(fluid('soldering_alloy') * 72)
        .inputs(item('galacticraftcore:basic_item', 12) * 6)
        .inputs(ore('screwSteel') * 2)
        .outputs(item('galacticraftcore:basic_item'))
        .duration(120).EUt(GTValues.VA[GTValues.MV]).buildAndRegister()
    
recipemap('assembler').recipeBuilder()
        .fluidInputs(fluid('soldering_alloy') * 72)
        .inputs(item('galacticraftcore:basic_item') * 6)
        .inputs(ore('wireFineCopper') * 3)
        .inputs(ore('screwAluminium') * 2)
        .outputs(item('galacticraftcore:basic_item', 1))
        .duration(120).EUt(GTValues.VA[GTValues.MV]).buildAndRegister()
    
    // above are solar panels recipes!

// plate

recipemap('implosion_compressor').recipeBuilder()
        .inputs(ore('plateSteel'))
        .inputs(ore('plateAluminium'))
        .outputs(item('galacticraftcore:heavy_plating'))
        .property("explosives", item('gregtech:powderbarrel'))
        .duration(400).EUt(GTValues.VA[GTValues.MV]).buildAndRegister()

recipemap('implosion_compressor').recipeBuilder()
        .inputs(item('galacticraftcore:heavy_plating'))
        .inputs(ore('plateMeteoricIron'))
        .outputs(item('galacticraftplanets:item_basic_mars', 3))
        .property("explosives", item('gregtech:powderbarrel'))
        .duration(400).EUt(GTValues.VA[GTValues.MV]).buildAndRegister()
    
recipemap('implosion_compressor').recipeBuilder()
        .inputs(item('galacticraftplanets:item_basic_mars', 3))
        .inputs(ore('plateDesh'))
        .outputs(item('galacticraftplanets:item_basic_asteroids', 5))
        .property("explosives", item('gregtech:powderbarrel'))
        .duration(400).EUt(GTValues.VA[GTValues.MV]).buildAndRegister()
    
recipemap('implosion_compressor').recipeBuilder()
        .inputs(item('galacticraftplanets:item_basic_asteroids', 5))
        .inputs(ore('plateDesh'))
        .outputs(item('galaxyspace:hdp'))
        .property("explosives", item('gregtech:powderbarrel'))
        .duration(400).EUt(GTValues.VA[GTValues.MV]).buildAndRegister()
    
// SEYELICONE

recipemap('electric_blast_furnace').recipeBuilder()
        .inputs(ore('dustSilicon') * 3)
        .fluidInputs(fluid('hydrochloric_acid') * 1000)
        .property("temperature", 573)
        .outputs(metaitem('dustTrichlorosilane'))
        .fluidOutputs(fluid('hydrogen') * 1000)
        .duration(240).EUt(GTValues.VA[GTValues.MV]).buildAndRegister()

recipemap('electric_blast_furnace').recipeBuilder()
        .inputs(ore('dustTrichlorosilane') * 3)
        .inputs(ore('nuggetSilicon'))
        .property("temperature", 1273)
        .outputs(metaitem('gemUltrapureSilicon'))
        .duration(240).EUt(GTValues.VA[GTValues.HV]).buildAndRegister()
    
recipemap('electric_blast_furnace').recipeBuilder()
        .inputs(ore('dustTrichlorosilane') * 3)
        .inputs(ore('nuggetSilicon'))
        .fluidInputs(fluid('argon') * 1000)
        .property("temperature", 1273)
        .outputs(metaitem('gemUltrapureSilicon'))
        .duration(480).EUt(GTValues.VA[GTValues.HV]).buildAndRegister()
    
recipemap('mixer').recipeBuilder()
        .inputs(ore('dustUltrapureSilicon') * 3)
        .inputs(ore('dustGermanium'))
        .outputs(metaitem('dustSiliconGermanium') * 4)
        .duration(120).EUt(GTValues.VA[GTValues.HV]).buildAndRegister()

recipemap('electric_blast_furnace').recipeBuilder()
        .inputs(ore('dustUltrapureSilicon') * 16)
        .inputs(ore('dustTinyGalliumArsenide'))
        .property("temperature", 1784)
        .outputs(item('gregtech:meta_item_1', 361) * 2)
        .duration(4500).EUt(GTValues.VA[GTValues.MV]).buildAndRegister()

// wafer

recipemap('cutter').recipeBuilder()
        .fluidInputs(fluid('distilled_water') * 100)
        .inputs(ore('gemUltrapureSilicon'))
        .outputs(item('galacticraftcore:basic_item', 13))
        .duration(120).EUt(GTValues.VA[GTValues.MV]).buildAndRegister()
    