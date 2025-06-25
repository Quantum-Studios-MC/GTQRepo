mods.roots.fey_crafter.recipeBuilder()
    .name('gay_sex')
    .input(item('minecraft:stick'),item('minecraft:stick'),ore('gemAmethyst'),ore('gemAmethyst'),ore('gemAmethyst')) // Must be exactly 5
    .output(item('mysticalworld:amethyst_pickaxe'))
    .xp(25)
    .register()

mods.roots.fey_crafter.recipeBuilder()
    .name('gay_sex1')
    .input(item('minecraft:stick'),ore('vine'),ore('gemAmethyst'),ore('gemAmethyst'),ore('gemAmethyst')) // Must be exactly 5
    .output(item('mysticalworld:amethyst_axe'))
    .xp(25)
    .register()

mods.roots.fey_crafter.recipeBuilder()
    .name('gay_sex2')
    .input(item('minecraft:stick'),item('minecraft:stick'),ore('vine'),ore('gemAmethyst'),ore('gemAmethyst')) // Must be exactly 5
    .output(item('mysticalworld:amethyst_hoe'))
    .xp(25)
    .register()

mods.roots.fey_crafter.recipeBuilder()
    .name('gay_sex3')
    .input(item('minecraft:stick'),item('minecraft:stick'),ore('vine'),ore('gemAmethyst'),ore('gemAmethyst')) // Must be exactly 5
    .output(item('mysticalworld:amethyst_sword'))
    .xp(25)
    .register()

mods.roots.fey_crafter.recipeBuilder()
    .name('gay_sex4')
    .input(item('minecraft:stick'),item('minecraft:stick'),ore('vine'),ore('vine'),ore('gemAmethyst')) // Must be exactly 5
    .output(item('mysticalworld:amethyst_shovel'))
    .xp(25)
    .register()

mods.roots.rituals.recipeBuilder()
    .ritual(ritual('ritual_transmutation'))
    .input(ore('runestone'),item('pyrotech:material', 35),item('roots:cloud_berry'),ore('gemAmber'),ore('gemAmethyst')) 
    .register()


mods.roots.fey_crafter.recipeBuilder()
    .name('say_gex')
    .input(ore('feyLeather'),item('roots:runic_dust'),ore('runedObsidian'),ore('runedObsidian'),ore('runedObsidian')) // Must be exactly 5
    .output(item('dimensionaledibles:nether_cake'))
    .xp(100)
    .register()

mods.roots.fey_crafter.recipeBuilder()
    .name('say_gex1')
    .input(item('yurtmod:tent_canvas'),item('yurtmod:tent_canvas'),ore('cobblestone'),item('minecraft:stick'),item('minecraft:stick')) // Must be exactly 5
    .output(item('yurtmod:mallet'))
    .xp(10)
    .register()


mods.roots.fey_crafter.recipeBuilder()
    .name('say_gex1')
    .input(ore('gemDiamond'),ore('nuggetGold'),ore('gemAmethyst'),ore('gemAmethyst'),item('yurtmod:mallet')) // Must be exactly 5
    .output(item('yurtmod:super_mallet'))
    .xp(10)
    .register()

mods.roots.fey_crafter.recipeBuilder()
    .name('say_gex1')
    .input(ore('ingotBrick'),ore('ingotBrick'),ore('ingotBrick'),ore('runestone'),item('roots:wildroot')) // Must be exactly 5
    .output(item('bonsaitrees:bonsaipot'))
    .xp(10)
    .register()

mods.roots.mortar.recipeBuilder()
    .name('im_going_to_cum')
    .input(ore('rootsBarkWildwood'),item('roots:runic_dust'),item('thaumcraft:crystal_essence').withNbt(['Aspects': [['key': 'aqua', 'amount': 1]]]),item('thaumcraft:crystal_essence').withNbt(['Aspects': [['key': 'terra', 'amount': 1]]]), item('thaumcraft:crystal_essence').withNbt(['Aspects': [['key': 'ignis', 'amount': 1]]]))
    .generate(true)
    .output(item('thaumcraft:salis_mundus'))
    .color(1, 0, 0.1, 1, 0, 0.1)
    .register()

    // botania is after this.

mods.roots.fey_crafter.recipeBuilder()
    .name('mega_gay')
    .input(ore('dustBone'),item('roots:terra_spores'),item('roots:cloud_berry'),item('roots:moonglow_leaf'),item('roots:wildroot')) // Must be exactly 5
    .output(item('botania:fertilizer'))
    .xp(3)
    .register()
    
mods.roots.mortar.recipeBuilder()
    .name('im_going_to_cum')
    .input(item('roots:runic_dust'), item('botania:fertilizer'))
    .generate(true)
    .output(item('botania:fertilizer') * 2)
    .color(1, 0, 0.1, 1, 0, 0.1)
    .register()

mods.roots.transmutation.recipeBuilder()
    .name('apothecary121212')
    .start(blockstate('pyrotech:soaking_pot'))
    .output(item('botania:altar'))
    .condition(mods.roots.predicates.stateBuilder().blockstate(blockstate('roots:runestone')).below().register())
    .register()

mods.roots.transmutation.recipeBuilder()
    .name('apothecary')
    .start(blockstate('botania:pool'))
    .output(item('botania:runealtar'))
    .condition(mods.roots.predicates.stateBuilder().blockstate(blockstate('botania:livingrock')).below().register())
    .register()


mods.roots.fey_crafter.recipeBuilder()
    .name('say_gex1')
    .input(item('yurtmod:tent_canvas'),item('yurtmod:tent_canvas'),ore('cobblestone'),item('minecraft:stick'),item('minecraft:stick')) // Must be exactly 5
    .output(item('yurtmod:mallet'))
    .xp(10)
    .register()
