
recipemap('roaster').recipeBuilder()
        .inputs(ore('crushedCinnabar') * 3)
        .outputs(metaitem('dustCinnabar') * 3)
        .outputs(metaitem('dustSulfur') * 2)
        .outputs(metaitem('dustSulfur'))
        .fluidOutputs(fluid('mercury_vapor') * 144)
        .duration(120).EUt(16).buildAndRegister()

recipemap('condensation_chamber').recipeBuilder()
        .fluidInputs(fluid('mercury_vapor') * 488)
        .fluidOutputs(fluid('mercury') * 144)
        .duration(60).EUt(16).buildAndRegister()
