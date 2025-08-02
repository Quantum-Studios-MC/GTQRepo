mods.botania.mana_infusion.recipeBuilder()
    .input(ore('ingotSteel'))
    .output(item('thaumcraft:ingot', 1))
    .mana(5000)
    .catalyst(blockstate('thaumcraft:metal_alchemical'))
    .register()


mods.botania.mana_infusion.recipeBuilder()
    .input(ore('ingotSteel'))
    .output(item('enderio:item_alloy_ingot', 1))
    .mana(25000)
    .catalyst(blockstate('bloodmagic:teleposer'))
    .register()

mods.botanicadds.gaia_plate.recipeBuilder()
    .input(ore('ingotThaumium'))
    .output(item('gregtech:meta_ingot', 32020) * 2)
    .mana(4000)
    .register()

mods.botania.mana_infusion.recipeBuilder()
    .input(ore('dustMythril'))
    .output(item('gregtech:meta_ingot', 32142))
    .mana(5000)
    .catalyst(blockstate('botania:storage', 1))
    .register()

mods.botania.orechid.removeAll()

