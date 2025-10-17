
recipemap('extractor').recipeBuilder()
        .inputs(item('integrateddynamics:menril_berries') * 4)
        .outputs(metaitem('dustMenrilExtract'))
        .duration(120).EUt(2).buildAndRegister()

recipemap('chemical_reactor').recipeBuilder()
        .inputs(ore('dustMenrilExtract'))
        .inputs(ore('dustMenrilWaste'))
        .outputs(metaitem('dustArtificialGlowstone'))
        .duration(120).EUt(2).buildAndRegister()

        recipemap('alloy_smelter').recipeBuilder()
        .inputs(ore('gemMenril'))
        .inputs(ore('dustTinyGlass'))
        .outputs(item('integrateddynamics:crystalized_menril_chunk'))
        .duration(120).EUt(2).buildAndRegister();

recipemap('primitive_blast_furnace').recipeBuilder()
        .inputs(ore('dustPhosphorite') * 2)
        .inputs(ore('gemCoke'))
        .outputs(metaitem('dustRedPhosphorus'))
        .duration(200).EUt(16).buildAndRegister()

