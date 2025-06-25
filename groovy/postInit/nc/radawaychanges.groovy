
recipemap('assembler').recipeBuilder()
        .inputs(ore('platePlastic') * 2)
        .fluidInputs(fluid('radaway') * 250 )
        .outputs(item('hbm:radaway'))
        .duration(120).EUt(12).buildAndRegister()

recipemap('assembler').recipeBuilder()
        .inputs(item('hbm:radaway'))
        .fluidInputs(fluid('oxidized_watz_mud') * 100 )
        .outputs(item('hbm:radaway_strong'))
        .duration(120).EUt(12).buildAndRegister()

recipemap('assembler').recipeBuilder()
        .inputs(item('hbm:radaway_strong'))
        .inputs(ore('dustIodine'))
        .outputs(item('hbm:radaway_flush'))
        .duration(120).EUt(12).buildAndRegister()

// RadAway * 1
mods.gregtech.chemical_reactor.removeByInput(15, [item('nuclearcraft:part', 6) * 2 * 2], [fluid('radaway') * 250 * 250])
// Slow-Acting RadAway * 1
mods.gregtech.chemical_reactor.removeByInput(15, [item('nuclearcraft:part', 6) * 2 * 2], [fluid('radaway_slow') * 250 * 250])
