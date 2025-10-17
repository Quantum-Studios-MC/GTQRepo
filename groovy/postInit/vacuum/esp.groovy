
recipemap('electrical_sprengel_pump').recipeBuilder()
        .inputs(ore('wireFineCopper') * 2)
        .inputs(ore('paper') * 3)
        .inputs(item('gregtech:meta_item_1', 517) * 2)
        .outputs(item('gregtech:meta_item_1', 516) * 2)
        .duration(50).EUt(32).buildAndRegister()
