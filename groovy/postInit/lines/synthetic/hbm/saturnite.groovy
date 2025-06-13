
recipemap('electric_blast_furnace').recipeBuilder()
    .inputs(ore('dustMoonstone') * 64)
    .property("temperature", 2001)
    .outputs(metaitem('dustSpentCatalystBeta'))
    .fluidOutputs(fluid('helium_3') * 16384)
    .duration(8000).EUt(240).buildAndRegister();
    
recipemap('large_chemical_reactor').recipeBuilder()
    .inputs(ore('dustPlatinum') * 4)
    .inputs(ore('dustPhosphorus'))
    .inputs(ore('dustOsmium'))
    .fluidInputs(fluid('helium_3') * 1000)
    .fluidInputs(fluid('water') * 16384)
    .outputs(metaitem('dustSpentCatalystBeta'))
    .fluidOutputs(fluid('low_concentration_saturnite_mix') * 144)
    .duration(800).EUt(510).buildAndRegister();

recipemap('chemical_reactor').recipeBuilder()
    .inputs(ore('dustMoonstone') * 18, ore('dustDesh') * 9)
    .fluidInputs(fluid('low_concentration_saturnite_mix') * 144)
    .outputs(metaitem('dustSaturnite'))
    .duration(800).EUt(510).buildAndRegister();

recipemap('large_chemical_reactor').recipeBuilder()
    .inputs(ore('dustPlatinum' * 4))
    .inputs(ore('dustPhosphorus'))
    .inputs(ore('dustSpentCatalystBeta'))
    .fluidInputs(fluid('helium_3') * 1000)
    .fluidInputs(fluid('cryotheum') * 8192)
    .outputs(metaitem('dustSpentCatalystBeta'))
    .fluidOutputs(fluid('low_concentration_saturnite_mix') * 144)
    .duration(800).EUt(510).buildAndRegister();