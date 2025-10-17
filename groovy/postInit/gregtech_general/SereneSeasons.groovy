def unwanted = [
	item('sereneseasons:season_sensor_summer'),
	item('sereneseasons:season_sensor_autumn'),
	item('sereneseasons:season_sensor_winter'),
	item('sereneseasons:ss_icon')
]
for (item in unwanted) {
	mods.jei.ingredient.removeAndHide(item)
}

///////	Season Clock
crafting.removeByOutput(item('sereneseasons:season_clock'))
crafting.addShaped(item('sereneseasons:season_clock'),[[ore('ringZinc'), ore('plateNetherQuartz'), ore('ringZinc')],[ore('plateNetherQuartz'), item('minecraft:clock'), ore('plateNetherQuartz')],[ore('toolScrewdriver'), ore('plateNetherQuartz'), ore('toolWrench')]])
crafting.addShaped(item('sereneseasons:season_clock'),[[ore('ringZinc'), ore('plateCertusQuartz'), ore('ringZinc')],[ore('plateCertusQuartz'), item('minecraft:clock'), ore('plateCertusQuartz')],[ore('toolScrewdriver'), ore('plateCertusQuartz'), ore('toolWrench')]])
crafting.addShaped(item('sereneseasons:season_clock'),[[ore('ringZinc'), ore('plateQuartzite'), ore('ringZinc')],[ore('plateQuartzite'), item('minecraft:clock'), ore('plateQuartzite')],[ore('toolScrewdriver'), ore('plateQuartzite'), ore('toolWrench')]])

mods.gregtech.assembler.recipeBuilder().inputs(item('minecraft:clock'), ore('plateNetherQuartz') * 4, ore('ringZinc') * 2).outputs(item('sereneseasons:season_clock')).duration(100).EUt(16).buildAndRegister()
mods.gregtech.assembler.recipeBuilder().inputs(item('minecraft:clock'), ore('plateCertusQuartz') * 4, ore('ringZinc') * 2).outputs(item('sereneseasons:season_clock')).duration(100).EUt(16).buildAndRegister()
mods.gregtech.assembler.recipeBuilder().inputs(item('minecraft:clock'), ore('plateQuartzite') * 4, ore('ringZinc') * 2).outputs(item('sereneseasons:season_clock')).duration(100).EUt(16).buildAndRegister()

///////	Season Sensor
crafting.removeByOutput(item('sereneseasons:season_sensor_spring'))
crafting.addShaped(item('sereneseasons:season_sensor_spring'),[[item('minecraft:glass'), item('minecraft:glass'), item('minecraft:glass')],[ore('plateNetherQuartz'), item('sereneseasons:season_clock'), ore('plateNetherQuartz')],[item('minecraft:stone_slab'), ore('stickRedAlloy'), item('minecraft:stone_slab')]])
crafting.addShaped(item('sereneseasons:season_sensor_spring'),[[item('minecraft:glass'), item('minecraft:glass'), item('minecraft:glass')],[ore('plateCertusQuartz'), item('sereneseasons:season_clock'), ore('plateCertusQuartz')],[item('minecraft:stone_slab'), ore('stickRedAlloy'), item('minecraft:stone_slab')]])
crafting.addShaped(item('sereneseasons:season_sensor_spring'),[[item('minecraft:glass'), item('minecraft:glass'), item('minecraft:glass')],[ore('plateQuartzite'), item('sereneseasons:season_clock'), ore('plateQuartzite')],[item('minecraft:stone_slab'), ore('stickRedAlloy'), item('minecraft:stone_slab')]])

///////	Greenhouse Glass
crafting.removeByOutput(item('sereneseasons:greenhouse_glass'))
mods.gregtech.assembler.recipeBuilder().inputs(ore('frameGtWood'), ore('dyeCyan')).fluidInputs(fluid('glass') * 144).outputs(item('sereneseasons:greenhouse_glass')).duration(160).EUt(8).buildAndRegister()