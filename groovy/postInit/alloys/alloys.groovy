
recipemap('steam_alloy_furnace').recipeBuilder()
        .inputs(ore('ingotZinc') * 2)
        .inputs(ore('ingotCopper'))
        .fluidOutputs(fluid('tombac') * 144)
        .duration(50).EUt(4).buildAndRegister()

recipemap('steam_alloy_furnace').recipeBuilder()
        .inputs(ore('ingotSteel') * 2)
        .inputs(ore('ingotNickel'))
        .fluidOutputs(fluid('nickel_steel') * 144)
        .duration(50).EUt(4).buildAndRegister()

recipemap('steam_alloy_furnace').recipeBuilder()
        .inputs(ore('ingotIron') * 2)
        .fluidOutputs(fluid('cast_iron') * 144)
        .duration(50).EUt(4).buildAndRegister()

recipemap('steam_alloy_furnace').recipeBuilder()
        .inputs(ore('ingotCopper'))
        .inputs(ore('ingotNickel') * 3)
        .inputs(ore('ingotIron') * 2)
        .inputs(ore('ingotManganese') * 2)
        .fluidOutputs(fluid('monel') * 1152)
        .duration(50).EUt(4).buildAndRegister()

recipemap('steam_alloy_furnace').recipeBuilder()
        .inputs(ore('ingotAntimony'))
        .inputs(ore('ingotTin'))
        .inputs(ore('ingotLead') * 2)
        .fluidOutputs(fluid('pewter') * 576)
        .duration(50).EUt(4).buildAndRegister()


//menrilsteel

recipemap('primitive_blast_furnace').recipeBuilder()
        .inputs(ore('ingotSteel') * 1)
        .inputs(ore('dustMenril') * 2)
        .inputs(ore('gemTwilightCoal') * 2)
        .outputs(metaitem('ingotMenrilSteel'))
        .duration(300).EUt(16).buildAndRegister()

// nickelsteel

recipemap('primitive_blast_furnace').recipeBuilder()
        .inputs(ore('ingotNickel') * 6)
        .inputs(ore('ingotSteel') * 4)
        .inputs(ore('gemCoke') * 2)
        .outputs(metaitem('ingotNickelSteel'))
        .duration(1200).EUt(16).buildAndRegister()
