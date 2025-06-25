recipemap('chemical_reactor').recipeBuilder()
    .inputs(ore('dustCarbon') * 1)
    .fluidInputs(fluid('nitrogen') * 500, fluid('water') * 500)
    .outputs(item('gregtech:meta_dust', 30009))
    .duration(200).EUt(256).buildAndRegister();

// Alanine Synthesis
recipemap('chemical_reactor').recipeBuilder()
    .inputs(ore('dustCarbon') * 3)
    .fluidInputs(fluid('nitrogen') * 500)
    .outputs(item('gregtech:meta_dust', 30010))
    .duration(300).EUt(512).buildAndRegister();

// Serine Synthesis
recipemap('chemical_reactor').recipeBuilder()
    .inputs(ore('dustCarbon') * 3)
    .fluidInputs(fluid('nitrogen') * 500, fluid('oxygen') * 500)
    .outputs(item('gregtech:meta_dust', 30011))
    .duration(400).EUt(768).buildAndRegister();

// Advanced Polypeptide Synthesis
recipemap('large_chemical_reactor').recipeBuilder()
    .inputs(ore('dustGlycine'), ore('dustAlanine'), ore('dustSerine'))
    .fluidInputs(fluid('nitrogen') * 1000)
    .outputs(item('gregtech:meta_ingot', 30012))
    .duration(1200).EUt(8192).buildAndRegister();

    //peanits.
