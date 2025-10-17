
recipemap('electrical_sprengel_pump').recipeBuilder()
        .inputs(ore('wireFineCopper') * 2)
        .inputs(ore('paper') * 3)
        .inputs(item('gregtech:meta_item_1', 517) * 2)
        .outputs(item('gregtech:meta_item_1', 516) * 2)
        .duration(50).EUt(32).buildAndRegister()


mods.gregtech.assembler.removeByInput(7, [metaitem('component.glass.tube'), metaitem('boltSteel') * 2, metaitem('wireGtSingleCopper') * 2, metaitem('circuit.integrated').withNbt(['Configuration': 1])], null)
// Vacuum Tube * 3
mods.gregtech.assembler.removeByInput(7, [metaitem('component.glass.tube'), metaitem('boltSteel') * 2, metaitem('wireGtSingleCopper') * 2], [fluid('red_alloy') * 18])
// Vacuum Tube * 4
mods.gregtech.assembler.removeByInput(7, [metaitem('component.glass.tube'), metaitem('boltSteel') * 2, metaitem('wireGtSingleAnnealedCopper') * 2], [fluid('red_alloy') * 18])

