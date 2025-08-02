import gregtech.api.GTValues;

recipemap('electric_blast_furnace').recipeBuilder()
        .inputs(ore('dustBSCCO'))
        .inputs(ore('wireFineGold') * 2)
        .fluidInputs(fluid('ionized_gold') * 144 )
        .outputs(item('qmd:part', 4))
        .property("temperature", 3600)
        .duration(1200).EUt(512).buildAndRegister()

recipemap('electric_blast_furnace').recipeBuilder()
        .inputs(ore('dustSSFAF'))
        .inputs(ore('wireFineGold') * 2)
        .fluidInputs(fluid('ionized_gold') * 144 )
        .outputs(item('qmd:part', 11))
        .property("temperature", 3600)
        .duration(1200).EUt(512).buildAndRegister()

recipemap('electric_blast_furnace').recipeBuilder()
        .inputs(ore('dustYBCO'))
        .inputs(ore('wireFineGold') * 2)
        .fluidInputs(fluid('ionized_gold') * 144 )
        .fluidInputs(fluid('neodymium') * 144 )
        .outputs(item('qmd:part', 12))
        .property("temperature", 3600)
        .duration(1200).EUt(512).buildAndRegister()


recipemap('electric_blast_furnace').recipeBuilder()
        .inputs(ore('wireFineTungstenSteel'))
        .fluidInputs(fluid('ionized_gold') * 144 )
        .outputs(item('qmd:part', 6))
        .property("temperature", 3600)
        .duration(1200).EUt(512).buildAndRegister()