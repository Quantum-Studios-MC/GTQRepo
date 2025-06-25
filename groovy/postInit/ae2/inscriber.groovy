import gregtech.api.GTValues;


recipemap('assembler').recipeBuilder()
        .notConsumable(item('appliedenergistics2:material', 19))
        .inputs(ore('gemUltrapureSilicon'))
        .outputs(item('appliedenergistics2:material', 20))
        .duration(80).EUt(GTValues.VA[GTValues.MV]).buildAndRegister()

recipemap('assembler').recipeBuilder()
        .notConsumable(item('appliedenergistics2:material', 15))
        .inputs(ore('ingotGold'))
        .outputs(item('appliedenergistics2:material', 18))
        .duration(80).EUt(GTValues.VA[GTValues.MV]).buildAndRegister()

recipemap('assembler').recipeBuilder()
        .notConsumable(item('appliedenergistics2:material', 15))
        .inputs(ore('gemXen'))
        .outputs(item('appliedenergistics2:material', 18) * 8)
        .duration(80).EUt(GTValues.VA[GTValues.MV]).buildAndRegister()

recipemap('assembler').recipeBuilder()
        .notConsumable(item('appliedenergistics2:material', 13))
        .inputs(ore('gemQuartzite') * 2)
        .outputs(item('appliedenergistics2:material', 16))
        .duration(80).EUt(GTValues.VA[GTValues.MV]).buildAndRegister()

recipemap('assembler').recipeBuilder()
        .notConsumable(item('appliedenergistics2:material', 13))
        .inputs(ore('gemCertusQuartz'))
        .outputs(item('appliedenergistics2:material', 16))
        .duration(80).EUt(GTValues.VA[GTValues.MV]).buildAndRegister()

recipemap('assembler').recipeBuilder()
        .notConsumable(item('appliedenergistics2:material', 14))
        .inputs(ore('gemDiamond'))
        .outputs(item('appliedenergistics2:material', 17))
        .duration(80).EUt(GTValues.VA[GTValues.MV]).buildAndRegister()

// ebf

recipemap('electric_blast_furnace').recipeBuilder()
        .inputs(ore('dustFluix') * 2)
        .inputs(ore('dustIron'))
        .property("temperature", 1784)
        .outputs(item('threng:material', 2))
        .duration(600).EUt(GTValues.VA[GTValues.MV]).buildAndRegister()

recipemap('electric_blast_furnace').recipeBuilder()
        .inputs(item('appliedenergistics2:sky_stone_block'))
        .property("temperature", 2001)
        .outputs(item('appliedenergistics2:material', 45))
        .duration(600).EUt(GTValues.VA[GTValues.MV]).buildAndRegister()

// joining!

recipemap('assembler').recipeBuilder()
        .inputs(item('appliedenergistics2:material', 20))
        .inputs(item('appliedenergistics2:material', 16))
        .fluidInputs(fluid('fluix_soldering_alloy') * 10)
        .outputs(item('appliedenergistics2:material', 23))
        .duration(80).EUt(GTValues.VA[GTValues.MV]).buildAndRegister()

recipemap('assembler').recipeBuilder()
        .inputs(item('appliedenergistics2:material', 17))
        .inputs(item('appliedenergistics2:material', 20))
        .fluidInputs(fluid('fluix_soldering_alloy') * 10)
        .outputs(item('appliedenergistics2:material', 24))
        .duration(80).EUt(GTValues.VA[GTValues.MV]).buildAndRegister()

recipemap('assembler').recipeBuilder()
        .inputs(item('appliedenergistics2:material', 20))
        .inputs(item('appliedenergistics2:material', 18))
        .fluidInputs(fluid('fluix_soldering_alloy') * 10)
        .outputs(item('appliedenergistics2:material', 22))
        .duration(80).EUt(GTValues.VA[GTValues.MV]).buildAndRegister()

// joining done

// hehehehe time for some stuff.. what stuff you ask? DN!!!!!!!!!!!

