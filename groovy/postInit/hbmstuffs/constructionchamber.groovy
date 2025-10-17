
recipemap('construction_chamber').recipeBuilder()
        .inputs(ore('plateBronze') * 16)
        .inputs(ore('plateTreatedWood') * 32)
        .inputs(item('pyrotech:masonry_brick_block') * 8)
        .outputs(item('hbm:pump_steam'))
        .duration(120).EUt(2).buildAndRegister()
