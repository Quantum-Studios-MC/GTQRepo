// TOMBAC
recipemap('assembler').recipeBuilder()
        .inputs(ore('plateTombac') * 6)
        .inputs(ore('frameGtBrass'))
        .circuitMeta(6)
        .outputs(item('gtquantumcore:gtqu_multiblock_casing'))
        .duration(50).EUt(16).buildAndRegister();

recipemap('assembler').recipeBuilder()
        .inputs(item('gtquantumcore:gtqu_multiblock_casing'))
        .inputs(ore('circuitLv'))
        .inputs(metaitem('electric.pump.lv') * 4)
        .outputs(item('gtquantumcore:gtqu_special_part'))
        .duration(50).EUt(16).buildAndRegister();
