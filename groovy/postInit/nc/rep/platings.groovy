import gregtech.api.GTValues;


recipemap('implosion_compressor').recipeBuilder()
        .inputs(ore('plateLead') * 2)
        .inputs(ore('plateFerroboron'))
        .outputs(item('nuclearcraft:part'))
        .property("explosives", item('gregtech:powderbarrel'))
        .duration(400).EUt(GTValues.VA[GTValues.EV]).buildAndRegister()
    
recipemap('implosion_compressor').recipeBuilder()
        .inputs(ore('plateBasic') * 2)
        .inputs(ore('plateTough'))
        .outputs(item('nuclearcraft:part', 1))
        .property("explosives", item('gregtech:powderbarrel'))
        .duration(400).EUt(GTValues.VA[GTValues.EV]).buildAndRegister()
    
recipemap('implosion_compressor').recipeBuilder()
        .inputs(ore('plateAdvanced') * 2)
        .inputs(ore('plateExtreme'))
        .outputs(item('nuclearcraft:part', 2))
        .property("explosives", item('gregtech:powderbarrel'))
        .duration(400).EUt(GTValues.VA[GTValues.EV]).buildAndRegister()
    
recipemap('implosion_compressor').recipeBuilder()
        .inputs(ore('plateDU') * 2)
        .inputs(ore('plateSaturnite'))
        .inputs(ore('foilSaturnite') * 2)
        .outputs(item('nuclearcraft:part', 3))
        .property("explosives", item('gregtech:powderbarrel'))
        .duration(400).EUt(GTValues.VA[GTValues.EV]).buildAndRegister()
    