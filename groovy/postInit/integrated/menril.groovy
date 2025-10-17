
recipemap('extractor').recipeBuilder()
        .inputs(item('integrateddynamics:menril_log'))
        .outputs(item('gtaurora:menril_sticky_resin'))
        .duration(120).EUt(2).buildAndRegister()

recipemap('extractor').recipeBuilder()
        .inputs(item('gtaurora:menril_sticky_resin'))
        .outputs(metaitem('dustRawMenril'))
        .duration(120).EUt(2).buildAndRegister()

recipemap('centrifuge').recipeBuilder()
        .inputs(item('gtaurora:menril_sticky_resin'))
        .outputs(metaitem('dustRawMenril'))
        .fluidOutputs(fluid('menrilresin') * 1000)
        .duration(120).EUt(16).buildAndRegister()

recipemap('alloy_smelter').recipeBuilder()
        .inputs(ore('dustRawMenril'))
        .inputs(ore('dustRedPhosphorus'))
        .outputs(metaitem('gemMenril'))
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

recipemap('chemical_reactor').recipeBuilder()
        .inputs(ore('dustRawMenril'))
        .inputs(ore('dustRedPhosphorus'))
        .outputs(metaitem('gemMenril'))
        .chancedOutput(metaitem('dustMenrilWaste'), 1000, 2000)
        .duration(50).EUt(16).buildAndRegister()