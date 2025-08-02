
recipemap('assembler').recipeBuilder()
        .inputs(ore('fiberSiliconCarbide') * 2)
        .fluidInputs(fluid('polymethylsilylene_methylene') * 100 )
        .outputs(item('nuclearcraft:alloy', 14))
        .duration(120).EUt(120).buildAndRegister()

recipemap('assembler').recipeBuilder()
        .inputs(ore('dustZirconia'))
        .inputs(ore('sinteredZirconia'))
        .fluidInputs(fluid('polyphenylene_sulfide') * 100 )
        .outputs(item('nuclearcraft:part', 19))
        .duration(120).EUt(120).buildAndRegister()