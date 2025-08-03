import gregtech.api.GTValues;


recipemap('assembler').recipeBuilder()
        .inputs(ore('plateTitanium') * 16)
        .inputs(ore('screwExtreme') * 8)
        .fluidInputs(fluid('borosilicate_glass') * 1296)
        .outputs(item('qmd:beamline') * 4)
        .duration(420).EUt(GTValues.VA[GTValues.EV]).buildAndRegister()

recipemap('assembler').recipeBuilder()
        .inputs(ore('plateElite') * 8)
        .inputs(ore('screwExtreme') * 12)
        .inputs(ore('springThermoconducting') * 6)
        .inputs(ore('boltTough') * 4)
        .fluidInputs(fluid('saturnite') * 144)
        .outputs(item('qmd:part') * 4)
        .duration(120).EUt(GTValues.VA[GTValues.HV]).buildAndRegister()

recipemap('assembler').recipeBuilder()
        .inputs(ore('plateElite') * 16)
        .inputs(ore('screwExtreme') * 12)
        .inputs(ore('processorBasic') * 6)
        .inputs(ore('circuitHv') * 4)
        .fluidInputs(fluid('saturnite') * 144)
        .outputs(item('qmd:part', 1) * 4)
        .duration(120).EUt(GTValues.VA[GTValues.HV]).buildAndRegister()
