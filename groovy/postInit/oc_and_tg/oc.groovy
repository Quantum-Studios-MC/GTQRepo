// File: postInit/techguns/opencomputers.groovy

import gregtech.api.recipes.ingredients.nbtmatch.*

def solder = fluid('soldering_alloy') * 72

def name_removals = [
"opencomputers:adapter0",
"opencomputers:assembler1",
"opencomputers:cable2",
"opencomputers:capacitor3",
"opencomputers:case14",
"opencomputers:case35",
"opencomputers:case26",
"opencomputers:chameliumblock7",
"opencomputers:material157",
"opencomputers:chameliumblock158",
"opencomputers:charger8",
"opencomputers:disassembler9",
"opencomputers:diskdrive10",
"opencomputers:geolyzer11",
"opencomputers:hologram112",
"opencomputers:hologram213",
"opencomputers:motionsensor15",
"opencomputers:powerconverter16",
"opencomputers:powerdistributor17",
"opencomputers:material41",
"opencomputers:printer18",
"opencomputers:raid19",
"opencomputers:redstone20",
"opencomputers:relay21",
"opencomputers:screen122",
"opencomputers:screen323",
"opencomputers:screen224",
"opencomputers:rack25",
"opencomputers:waypoint26",
"opencomputers:endstone27",
"opencomputers:netsplitter28",
"opencomputers:transposer29",
"opencomputers:carpetedcapacitor30",
"opencomputers:material31",
"opencomputers:material32", // GROG
"opencomputers:material33",
"opencomputers:material34",
"opencomputers:material35",
"opencomputers:material36", //microchips
"opencomputers:material37",
"opencomputers:material38",
"opencomputers:material39", //ALU
"opencomputers:material40",
"opencomputers:material42", //interweb !! WARNING !! REDDIT REFERENCE !! ACIDIC !!
"opencomputers:material46", //tablet case 1
"opencomputers:material47", //tablet case 2
"opencomputers:material48", //microcontroller cases
"opencomputers:material49", 
"opencomputers:material50", //drone cases
"opencomputers:material51", 
"opencomputers:material52", //ink cartridges	
"opencomputers:material53", 
"opencomputers:material54", //chamelium
"opencomputers:material132", //diamond chip
"opencomputers:tool55", //analyzer
"opencomputers:tool56", //remote control
"opencomputers:tool57", //texture picker
"opencomputers:tool58", //manual
"opencomputers:tool61", //nanomachines
"opencomputers:wrench59", //scrench
"opencomputers:hoverboots60",
"opencomputers:component62", //CPUs
"opencomputers:component63",
"opencomputers:component64",
"opencomputers:component65", //Component Buses
"opencomputers:component66",
"opencomputers:component67",
"opencomputers:component68", //RAMs
"opencomputers:component69",
"opencomputers:component70",
"opencomputers:component71",
"opencomputers:component72",
"opencomputers:component73",
"opencomputers:component74", //Servers
"opencomputers:component75",
"opencomputers:component76",
"opencomputers:component77", //APUs
"opencomputers:component78",
"opencomputers:component79",
"opencomputers:component80",
"opencomputers:card81", //GPUs
"opencomputers:card82",
"opencomputers:card83",
"opencomputers:card84", //Redstone cards
"opencomputers:card85",
"opencomputers:card86", //Network cards
"opencomputers:card87",
"opencomputers:card88",
"opencomputers:card89", //Linked cards (interdimensional transfer is too OP i guess)
"opencomputers:card90", //Data cards
"opencomputers:card91",
"opencomputers:card92",
"opencomputers:upgrade93", 
"opencomputers:upgrade94", //Battery upgrades
"opencomputers:upgrade95",
"opencomputers:upgrade96",
"opencomputers:upgrade97", 
"opencomputers:upgrade98", //Card containers
"opencomputers:upgrade99",
"opencomputers:upgrade100",
"opencomputers:upgrade101", //Upgrade containers
"opencomputers:upgrade102",
"opencomputers:upgrade103",
"opencomputers:upgrade104", //Crafting table upgrade
"opencomputers:upgrade105", //Storage upgrades
"opencomputers:upgrade106",
"opencomputers:upgrade107",
"opencomputers:upgrade108", //XP upgrades
"opencomputers:upgrade109", //Generator upgrade (might be unrealistic) TODO
"opencomputers:upgrade110", //Inventory upgrade
"opencomputers:upgrade111", //Inventory control upgrade
"opencomputers:upgrade112", //Navigation upgrade
"opencomputers:upgrade113", //Piston upgrade
"opencomputers:upgrade114", //Sign upgrade
"opencomputers:upgrade115", //Solar generator upgrade (might be unrealistic) TODO
"opencomputers:upgrade116", //Tank upgrade
"opencomputers:upgrade117", //Tank control upgrade
"opencomputers:upgrade118", //Magnet upgrade
"opencomputers:upgrade119", //Lead upgrade
"opencomputers:upgrade120", //Hover upgrade
"opencomputers:upgrade121", //Hover upgrade
"opencomputers:upgrade122", //Trading upgrade
"opencomputers:upgrade123", //MFU
"opencomputers:upgrade124", //Redstone Wireless Card
"opencomputers:upgrade125", //Sticky Piston Upgrade
"opencomputers:storage126", //EEPROM
"opencomputers:storage127", //Floppy
"opencomputers:storage128", //HDDs
"opencomputers:storage129",
"opencomputers:storage130",
"computronics:iron_note_block0",
"computronics:audio_cable1",
"computronics:speaker5",
"computronics:tape_reader7",
"computronics:camera3",
"computronics:chat_box4",
"computronics:cipher8",
"computronics:cipher_advanced10",
"computronics:colorful_lamp2",
"computronics:parts21", //tape track
"computronics:tape12", //tapes
"computronics:tape13",
"computronics:tape14",
"computronics:tape15",
"computronics:tape16",
"computronics:tape17",
"computronics:tape18",
"computronics:tape19",
"computronics:tape20",
"computronics:portable_tape_drive11",
"computronics:oc_parts22",
"computronics:oc_parts23",
"computronics:oc_parts24",
"computronics:oc_parts25",
"computronics:oc_parts26",
"computronics:oc_parts27",
"computronics:oc_parts28",
"computronics:oc_parts29",
"computronics:oc_parts30",
"computronics:oc_parts31",
"computronics:oc_parts32",
"computronics:oc_parts33",
"computronics:oc_parts34",
"computronics:oc_parts35",
"computronics:speech_box6"

]

for (item in name_removals) {
    crafting.remove(item);
}


mods.gregtech.assembler.recipeBuilder()
    .inputs(ore('plateRubber'))
    .inputs(ore('wireGtSingleTin'))
    .circuitMeta(2)
    .outputs(item('opencomputers:cable'))
    .duration(80)
    .EUt(60)
    .fluidInputs(fluid('tin') * 144)
    .buildAndRegister()

mods.gregtech.assembler.recipeBuilder()
    .inputs(ore('cableGtSingleTin') * 4)
    .inputs(metaitem('hull.mv'))
    .inputs(ore('circuitMv'))
    .fluidInputs(fluid('tin') * 144)
    .outputs(item('opencomputers:adapter'))
    .duration(200)
    .EUt(120)
    .buildAndRegister()

mods.gregtech.assembler.recipeBuilder()
    .inputs(ore('cableGtSingleCopper') * 4)
    .inputs(metaitem('hull.mv'))
    .inputs(metaitem('robot.arm.mv'))
    .inputs(metaitem('conveyor.module.mv') * 2)
    .inputs(ore('circuitMv'))
    .fluidInputs(fluid('tin') * 144)
    .outputs(item('opencomputers:assembler'))
    .duration(250)
    .EUt(150)
    .buildAndRegister()

mods.gregtech.assembler.recipeBuilder()
    .inputs(ore('cableGtSingleCopper') * 4)
    .inputs(metaitem('hull.mv'))
    .inputs(ore('screwAluminium') * 4)
    .inputs(ore('rotorSteel') * 2)
    .inputs(item('opencomputers:component', 3))
    .inputs(ore('circuitMv'))
    .fluidInputs(fluid('tin') * 144)
    .circuitMeta(1)
    .outputs(item('opencomputers:case1'))
    .duration(240)
    .EUt(120)
    .buildAndRegister()

mods.gregtech.assembler.recipeBuilder()
    .inputs(ore('cableGtSingleGold') * 4)
    .inputs(metaitem('hull.hv'))
    .inputs(ore('screwStainlessSteel') * 4)
    .inputs(ore('rotorStainlessSteel') * 2)
    .inputs(item('opencomputers:component', 4))
    .inputs(ore('circuitHv'))
    .fluidInputs(fluid('tin') * 144)
    .circuitMeta(1)
    .outputs(item('opencomputers:case2'))
    .duration(260)
    .EUt(180)
    .buildAndRegister()

mods.gregtech.assembler.recipeBuilder()
    .inputs(ore('cableGtSingleAluminium') * 4)
    .inputs(metaitem('hull.ev'))
    .inputs(ore('screwTitanium') * 4)
    .inputs(ore('rotorTitanium') * 2)
    .inputs(item('opencomputers:component', 5))
    .inputs(ore('circuitEv'))
    .fluidInputs(fluid('tin') * 144)
    .circuitMeta(1)
    .outputs(item('opencomputers:case3'))
    .duration(300)
    .EUt(240)
    .buildAndRegister()

mods.gregtech.assembler.recipeBuilder()
    .inputs(metaitem('hull.mv'))
    .inputs(ore('cableGtSingleTin') * 4)
    .fluidInputs(fluid('tin') * 144)
    .circuitMeta(4)
    .outputs(item('opencomputers:charger'))
    .duration(160)
    .EUt(90)
    .buildAndRegister()

mods.gregtech.assembler.recipeBuilder()
    .inputs(metaitem('hull.mv'))
    .inputs(ore('circuitMv'))
    .inputs(metaitem('sensor.mv'))
    .inputs(metaitem('emitter.mv'))
    .inputs(ore('lensGlass'))
    .fluidInputs(fluid('tin') * 144)
    .outputs(item('opencomputers:diskdrive'))
    .duration(220)
    .EUt(120)
    .buildAndRegister()

mods.gregtech.assembler.recipeBuilder()
    .inputs(metaitem('hull.hv'))
    .inputs(ore('circuitHv'))
    .inputs(metaitem('sensor.hv') * 2)
    .fluidInputs(fluid('tin') * 144)
    .circuitMeta(2)
    .outputs(item('opencomputers:geolyzer'))
    .duration(250)
    .EUt(240)
    .buildAndRegister()

mods.gregtech.assembler.recipeBuilder()
    .inputs(metaitem('hull.hv'))
    .inputs(ore('circuitHv'))
    .inputs(metaitem('emitter.hv') * 2)
    .fluidInputs(fluid('tin') * 144)
    .circuitMeta(3)
    .outputs(item('opencomputers:hologram1'))
    .duration(260)
    .EUt(240)
    .buildAndRegister()

mods.gregtech.assembler.recipeBuilder()
    .inputs(metaitem('hull.ev'))
    .inputs(ore('circuitEv'))
    .inputs(metaitem('emitter.ev') * 2)
    .fluidInputs(fluid('tin') * 144)
    .circuitMeta(3)
    .outputs(item('opencomputers:hologram2'))
    .duration(280)
    .EUt(360)
    .buildAndRegister()

mods.gregtech.assembler.recipeBuilder()
    .inputs(metaitem('hull.hv'))
    .inputs(ore('circuitHv'))
    .inputs(metaitem('sensor.hv'))
    .fluidInputs(fluid('tin') * 144)
    .circuitMeta(2)
    .outputs(item('opencomputers:motionsensor'))
    .duration(200)
    .EUt(180)
    .buildAndRegister()

mods.gregtech.assembler.recipeBuilder()
    .inputs(metaitem('hull.mv'))
    .inputs(ore('plateIron'))
    .inputs(ore('wireGtSingleCopper') * 2)
    .inputs(ore('cableGtSingleCopper') * 4)
    .inputs(ore('circuitMv'))
    .fluidInputs(fluid('tin') * 144)
    .circuitMeta(1)
    .outputs(item('opencomputers:powerdistributor'))
    .duration(220)
    .EUt(120)
    .buildAndRegister()

mods.gregtech.assembler.recipeBuilder()
    .inputs(metaitem('hull.ev'))
    .inputs(metaitem('drum.stainless_steel'))
    .inputs(metaitem('electric.pump.ev') * 2)
    .fluidInputs(fluid('tin') * 144)
    .circuitMeta(4)
    .outputs(item('opencomputers:printer'))
    .duration(260)
    .EUt(180)
    .buildAndRegister()

mods.gregtech.assembler.recipeBuilder()
    .inputs(metaitem('hull.hv'))
    .inputs(metaitem('plate.random_access_memory'))
    .inputs(metaitem('plate.central_processing_unit'))
    .inputs(item('opencomputers:diskdrive') * 3)
    .inputs(ore('circuitHv'))
    .fluidInputs(fluid('tin') * 144)
    .circuitMeta(2)
    .outputs(item('opencomputers:raid'))
    .duration(300)
    .EUt(240)
    .buildAndRegister()

mods.gregtech.assembler.recipeBuilder()
    .inputs(metaitem('hull.mv'))
    .inputs(item('opencomputers:card', 4))
    .inputs(ore('circuitMv'))
    .fluidInputs(fluid('tin') * 144)
    .circuitMeta(1)
    .outputs(item('opencomputers:redstone'))
    .duration(160)
    .EUt(90)
    .buildAndRegister()

mods.gregtech.assembler.recipeBuilder()
    .inputs(metaitem('hull.mv'))
    .inputs(item('opencomputers:card', 6))
    .inputs(ore('cableGtSingleCopper') * 4)
    .inputs(ore('circuitMv'))
    .fluidInputs(fluid('tin') * 144)
    .circuitMeta(1)
    .outputs(item('opencomputers:relay'))
    .duration(200)
    .EUt(120)
    .buildAndRegister()

mods.gregtech.assembler.recipeBuilder()
    .inputs(metaitem('hull.mv'))
    .inputs(metaitem('monitor_screen'))
    .fluidInputs(fluid('tin') * 144)
    .circuitMeta(3)
    .outputs(item('opencomputers:screen1'))
    .duration(200)
    .EUt(120)
    .buildAndRegister()


mods.gregtech.assembler.recipeBuilder()
    .inputs(metaitem('hull.hv'))
    .inputs(metaitem('monitor_screen') * 2)
    .inputs(ore('batteryHv'))
    .fluidInputs(fluid('tin') * 144)
    .outputs(item('opencomputers:screen2'))
    .duration(240)
    .EUt(480)
    .buildAndRegister();

mods.gregtech.assembler.recipeBuilder()
    .inputs(metaitem('hull.ev'))
    .inputs(metaitem('monitor_screen') * 4)
    .inputs(metaitem('emitter.ev'))
    .fluidInputs(fluid('tin') * 144)
    .outputs(item('opencomputers:screen3'))
    .duration(300)
    .EUt(1920)
    .buildAndRegister();

mods.gregtech.assembler.recipeBuilder()
    .inputs(item('opencomputers:relay'))
    .inputs(item('opencomputers:powerdistributor'))
    .inputs(metaitem('hull.mv'))
    .inputs(item('opencomputers:upgrade', 31))
    .inputs(ore('gearSteel'))
    .fluidInputs(fluid('tin') * 144)
    .outputs(item('opencomputers:rack'))
    .duration(250)
    .EUt(120)
    .buildAndRegister();

mods.gregtech.assembler.recipeBuilder()
    .inputs(metaitem('hull.mv'))
    .inputs(item('opencomputers:card', 6))
    .inputs(metaitem('springSteel'))
    .circuitMeta(2)
    .fluidInputs(fluid('tin') * 144)
    .outputs(item('opencomputers:waypoint'))
    .duration(220)
    .EUt(120)
    .buildAndRegister();

mods.gregtech.assembler.recipeBuilder()
    .inputs(metaitem('hull.mv'))
    .inputs(ore('cableGtSingleCopper') * 2)
    .inputs(ore('circuitLv') * 2)
    .inputs(metaitem('emitter.mv'))
    .circuitMeta(3)
    .fluidInputs(fluid('tin') * 144)
    .outputs(item('opencomputers:netsplitter'))
    .duration(240)
    .EUt(120)
    .buildAndRegister();

mods.gregtech.assembler.recipeBuilder()
    .inputs(metaitem('hull.mv'))
    .inputs(ore('pipeNormalItemPolyvinylChloride') * 2)
    .inputs(ore('pipeNormalFluidAluminium') * 2)
    .inputs(ore('circuitLv') * 2)
    .inputs(metaitem('electric.motor.mv'))
    .fluidInputs(fluid('tin') * 144)
    .outputs(item('opencomputers:transposer'))
    .duration(240)
    .EUt(120)
    .buildAndRegister();

mods.gregtech.assembler.recipeBuilder()
    .inputs(ore('stickIron'))
    .inputs(metaitem('circuit_board.plastic'))
    .fluidInputs(fluid('tin') * 144)
    .outputs(item('opencomputers:material', 5))
    .duration(200)
    .EUt(120)
    .buildAndRegister();

mods.gregtech.assembler.recipeBuilder()
    .inputNBT(metaitem('power_unit.mv').item, 1, metaitem('power_unit.mv').metadata, NBTMatcher.ANY, NBTCondition.ANY)
    .inputs(ore('cableGtSingleCopper') * 4)
    .inputs(ore('screwAluminium') * 2)
    .inputs(ore('plateAluminium') * 4)
    .inputs(item('opencomputers:component', 3))
    .inputs(ore('gearAluminium'))
    .fluidInputs(fluid('tin') * 144)
    .circuitMeta(1)
    .outputs(item('opencomputers:material', 17))
    .duration(240)
    .EUt(120)
    .buildAndRegister();

// Helper functions
def cardRecipe(tier, componentCount, wireType, wireAmount, boardType, circuit, output, duration, eut) {
    mods.gregtech.circuit_assembler.recipeBuilder()
        .inputs(item('opencomputers:component', componentCount))
        .inputs(ore(wireType) * wireAmount)
        .inputs(metaitem(boardType))
        .fluidInputs(fluid('tin') * 144)
        .circuitMeta([circuit])
        .outputs(item('opencomputers:card', output))
        .duration(duration)
        .EUt(eut)
        .buildAndRegister()
}

def upgradeRecipe(inputs, fluidAmount, circuit, output, duration, eut) {
    mods.gregtech.assembler.recipeBuilder()
        .inputs(inputs)
        .fluidInputs(fluid('tin') * fluidAmount)
        .circuitMeta([circuit])
        .outputs(item('opencomputers:upgrade', output))
        .duration(duration)
        .EUt(eut)
        .buildAndRegister()
}

// Card recipes
cardRecipe(1, 6, 'wireFineCopper', 4, 'circuit_board.good', 1, 1, 400, 30)
cardRecipe(2, 8, 'wireFineGold', 4, 'circuit_board.plastic', 2, 2, 400, 120)
cardRecipe(3, 9, 'wireFineAluminium', 4, 'circuit_board.advanced', 2, 3, 400, 480)
cardRecipe(1, 1, 'wireFineRedAlloy', 4, 'circuit_board.good', 1, 4, 400, 30)
cardRecipe(2, 1, 'wireFineRedAlloy', 16, 'circuit_board.plastic', 2, 5, 400, 120)
cardRecipe(1, 0, 'wireFineCopper', 4, 'circuit_board.good', 1, 6, 400, 30)
cardRecipe(2, 0, 'wireFineGold', 8, 'circuit_board.plastic', 2, 7, 400, 120)
cardRecipe(3, 0, 'wireFineAluminium', 8, 'circuit_board.advanced', 3, 8, 400, 480)
cardRecipe(1, 1, 'wireFineCopper', 4, 'circuit_board.good', 10, 10, 400, 30)
cardRecipe(2, 1, 'wireFineGold', 4, 'circuit_board.plastic', 11, 11, 400, 120)
cardRecipe(3, 2, 'wireFineAluminium', 4, 'circuit_board.advanced', 12, 12, 400, 480)

// Upgrade recipes
upgradeRecipe([
    metaitem('power_unit.mv'),
    metaitem('circuit_board.good')
], 144, 1, 1, 400, 120)

upgradeRecipe([
    metaitem('power_unit.hv'),
    metaitem('circuit_board.plastic')
], 144, 2, 2, 400, 120)

upgradeRecipe([
    metaitem('power_unit.ev'),
    metaitem('circuit_board.advanced')
], 144, 3, 3, 400, 120)

upgradeRecipe([
    ore('plateAluminium') * 4,
    item('opencomputers:material', 5)
], 144, 1, 5, 400, 120)

upgradeRecipe([
    ore('plateStainlessSteel') * 4,
    item('opencomputers:material', 5)
], 144, 2, 6, 400, 120)

upgradeRecipe([
    ore('plateTitanium') * 4,
    item('opencomputers:material', 5)
], 144, 3, 7, 400, 120)

upgradeRecipe([
    ore('plateAluminium') * 4,
    ore('screwAluminium') * 4
], 144, 11, 8, 400, 120)

upgradeRecipe([
    ore('plateStainlessSteel') * 4,
    ore('screwStainlessSteel') * 4
], 144, 12, 9, 400, 120)

upgradeRecipe([
    ore('plateTitanium') * 4,
    ore('screwTitanium') * 4
], 144, 13, 10, 400, 120)

upgradeRecipe([
    ore('plateAluminium') * 4,
    item('minecraft:crafting_table')
], 144, 1, 11, 400, 120)

upgradeRecipe([
    ore('plateAluminium') * 4,
    ore('oc:hdd1')
], 144, 1, 12, 400, 120)

upgradeRecipe([
    ore('plateStainlessSteel') * 4,
    ore('oc:hdd2')
], 144, 2, 13, 400, 120)

upgradeRecipe([
    ore('plateTitanium') * 4,
    ore('oc:hdd3')
], 144, 3, 14, 400, 120)

upgradeRecipe([
    ore('plateAluminium') * 4,
    metaitem('crate.steel')
], 144, 1, 17, 400, 120)

upgradeRecipe([
    ore('plateStainlessSteel') * 4,
    metaitem('robot.arm.hv')
], 144, 1, 18, 400, 120)

upgradeRecipe([
    ore('plateStainlessSteel') * 4,
    item('minecraft:compass')
], 144, 1, 19, 400, 120)

upgradeRecipe([
    ore('plateAluminium') * 4,
    metaitem('electric.piston.mv')
], 144, 1, 20, 400, 120)

upgradeRecipe([
    ore('plateAluminium') * 4,
    ore('dyeBlack') * 2
], 144, 1, 21, 400, 120)

upgradeRecipe([
    ore('plateAluminium') * 4,
    metaitem('drum.aluminium')
], 144, 1, 23, 400, 120)

upgradeRecipe([
    ore('plateStainlessSteel') * 4,
    metaitem('electric.pump.hv')
], 144, 1, 24, 400, 120)

upgradeRecipe([
    ore('plateTitanium') * 4,
    ore('stickNeodymiumAlloyMagnetic')
], 144, 1, 25, 400, 120)

upgradeRecipe([
    ore('plateAluminium') * 4,
    item('minecraft:lead')
], 144, 1, 26, 400, 120)

upgradeRecipe([
    ore('plateTitanium') * 4,
    metaitem('sensor.ev'),
    metaitem('emitter.ev')
], 144, 10, 30, 400, 120)

upgradeRecipe([
    ore('plateAluminium') * 4,
    metaitem('electric.piston.lv')
], 36, 10, 33, 400, 120)

// Storage recipes
mods.gregtech.circuit_assembler.recipeBuilder()
    .inputs(metaitem('component.transistor') * 16)
    .inputs(metaitem('circuit_board.good'))
    .fluidInputs(fluid('tin') * 144)
    .circuitMeta([1])
    .outputs(item('opencomputers:storage'))
    .duration(400)
    .EUt(30)
    .buildAndRegister()

mods.gregtech.assembler.recipeBuilder()
    .inputs(item('opencomputers:material', 12))
    .inputs(ore('platePlastic') * 1)
    .inputs(ore('dyeBlack'))
    .fluidInputs(fluid('tin') * 144)
    .circuitMeta([1])
    .outputs(item('opencomputers:storage', 1))
    .duration(400)
    .EUt(120)
    .buildAndRegister()
    
mods.gregtech.assembler.recipeBuilder()
    .inputs(item('opencomputers:material', 12))
    .inputs(ore('plateAluminium') * 4)
    .fluidInputs(fluid('tin') * 144)
    .circuitMeta([1])
    .outputs(item('opencomputers:storage', 2))
    .duration(400)
    .EUt(120)
    .buildAndRegister()
    
mods.gregtech.assembler.recipeBuilder()
    .inputs(item('opencomputers:material', 12) * 2)
    .inputs(ore('plateStainlessSteel') * 4)
    .fluidInputs(fluid('tin') * 144)
    .circuitMeta([1])
    .outputs(item('opencomputers:storage', 3))
    .duration(400)
    .EUt(120)
    .buildAndRegister()

mods.gregtech.assembler.recipeBuilder()
    .inputs(item('opencomputers:material', 12) * 4)
    .inputs(ore('plateTitanium') * 4)
    .fluidInputs(fluid('tin') * 144)
    .circuitMeta([1])
    .outputs(item('opencomputers:storage', 4))
    .duration(400)
    .EUt(120)
    .buildAndRegister()

// WLAN component
mods.gregtech.circuit_assembler.recipeBuilder()
    .inputs(ore('circuitHv'))
    .inputs(ore('oc:wlanCard2'))
    .inputs(metaitem('circuit_board.plastic'))
    .fluidInputs(fluid('tin') * 144)
    .circuitMeta([1])
    .outputs(item('opencomputers:component', 19))
    .duration(400)
    .EUt(120)
    .buildAndRegister()

// These recipes are unique to OpenComputers.groovy and not present in ammos.groovy

// Plastic Circuit Board (Material 26) - Unique to OpenComputers.groovy
mods.gregtech.assembler.recipeBuilder()
    .inputs(ore('platePlastic') * 4)
    .fluidInputs(fluid('tin') * 144) // Replaced solder
    .outputs(item('opencomputers:material', 26))
    .circuitMeta(15)
    .duration(200)
    .EUt(120)
    .buildAndRegister();

// Printed Circuit Board (Material 27) - Unique to OpenComputers.groovy
mods.gregtech.assembler.recipeBuilder()
    .inputs(ore('dyeBlack'), ore('dyeCyan'), ore('dyeYellow'), ore('dyeMagenta'))
    .inputs(item('opencomputers:material', 26))
    .outputs(item('opencomputers:material', 27))
    .duration(200)
    .EUt(120)
    .buildAndRegister();

// OpenComputers Tool (Default) - Unique to OpenComputers.groovy
mods.gregtech.assembler.recipeBuilder()
    .inputNBT(metaitem('power_unit.mv'), NBTMatcher.ANY, NBTCondition.ANY)
    .inputs(ore('cableGtSingleCopper') * 1)
    .inputs(ore('plateAluminium') * 2)
    .inputs(metaitem('sensor.mv'))
    .inputs(ore('circuitMv'))
    .fluidInputs(fluid('tin') * 144) // Replaced solder
    .circuitMeta(3)
    .outputs(item('opencomputers:tool'))
    .duration(200)
    .EUt(120)
    .buildAndRegister();

// OpenComputers Tool (Tier 2) - Unique to OpenComputers.groovy
mods.gregtech.assembler.recipeBuilder()
    .inputNBT(metaitem('power_unit.mv'), NBTMatcher.ANY, NBTCondition.ANY)
    .inputs(item('opencomputers:card', 7))
    .inputs(ore('plateAluminium') * 2)
    .inputs(metaitem('monitor_screen'))
    .inputs(ore('circuitMv'))
    .fluidInputs(fluid('tin') * 144) // Replaced solder
    .circuitMeta(3)
    .outputs(item('opencomputers:tool', 2))
    .duration(200)
    .EUt(120)
    .buildAndRegister();

// OpenComputers Tool (Tier 3) - Unique to OpenComputers.groovy
mods.gregtech.assembler.recipeBuilder()
    .inputs(ore('plateAluminium') * 2)
    .inputs(metaitem('sensor.lv'))
    .inputs(ore('circuitMv'))
    .fluidInputs(fluid('tin') * 144) // Replaced solder
    .circuitMeta(4)
    .outputs(item('opencomputers:tool', 3))
    .duration(200)
    .EUt(120)
    .buildAndRegister();

// Component Recipes (Tier 1-3) - Unique to OpenComputers.groovy
mods.gregtech.circuit_assembler.recipeBuilder()
    .inputs(metaitem('plate.central_processing_unit'))
    .inputs(metaitem('circuit_board.good'))
    .fluidInputs(fluid('tin') * 144) // Replaced solder
    .circuitMeta(1)
    .outputs(item('opencomputers:component'))
    .duration(200)
    .EUt(30)
    .buildAndRegister();

mods.gregtech.circuit_assembler.recipeBuilder()
    .inputs(metaitem('plate.central_processing_unit') * 2)
    .inputs(metaitem('circuit_board.plastic'))
    .fluidInputs(fluid('tin') * 144) // Replaced solder
    .circuitMeta(2)
    .outputs(item('opencomputers:component', 1))
    .duration(200)
    .EUt(120)
    .buildAndRegister();

mods.gregtech.circuit_assembler.recipeBuilder()
    .inputs(metaitem('plate.central_processing_unit') * 4)
    .inputs(metaitem('circuit_board.advanced'))
    .fluidInputs(fluid('tin') * 144) // Replaced solder
    .circuitMeta(3)
    .outputs(item('opencomputers:component', 2))
    .duration(200)
    .EUt(480)
    .buildAndRegister();

// Logic Component Recipes - Unique to OpenComputers.groovy
mods.gregtech.circuit_assembler.recipeBuilder()
    .inputs(metaitem('plate.integrated_logic_circuit'))
    .inputs(metaitem('circuit_board.good'))
    .fluidInputs(fluid('tin') * 144) // Replaced solder
    .circuitMeta(1)
    .outputs(item('opencomputers:component', 3))
    .duration(200)
    .EUt(30)
    .buildAndRegister();

mods.gregtech.circuit_assembler.recipeBuilder()
    .inputs(metaitem('plate.integrated_logic_circuit') * 2)
    .inputs(metaitem('circuit_board.plastic'))
    .fluidInputs(fluid('tin') * 144) // Replaced solder
    .circuitMeta(2)
    .outputs(item('opencomputers:component', 4))
    .duration(200)
    .EUt(120)
    .buildAndRegister();

mods.gregtech.circuit_assembler.recipeBuilder()
    .inputs(metaitem('plate.integrated_logic_circuit') * 4)
    .inputs(metaitem('circuit_board.advanced'))
    .fluidInputs(fluid('tin') * 144) // Replaced solder
    .circuitMeta(3)
    .outputs(item('opencomputers:component', 5))
    .duration(200)
    .EUt(480)
    .buildAndRegister();

// RAM Component Recipes - Unique to OpenComputers.groovy
mods.gregtech.circuit_assembler.recipeBuilder()
    .inputs(metaitem('plate.random_access_memory'))
    .inputs(metaitem('circuit_board.good'))
    .fluidInputs(fluid('tin') * 144) // Replaced solder
    .circuitMeta(1)
    .outputs(item('opencomputers:component', 6))
    .duration(200)
    .EUt(30)
    .buildAndRegister();

mods.gregtech.circuit_assembler.recipeBuilder()
    .inputs(metaitem('plate.random_access_memory') * 2)
    .inputs(metaitem('circuit_board.good'))
    .fluidInputs(fluid('tin') * 144) // Replaced solder
    .circuitMeta(2)
    .outputs(item('opencomputers:component', 7))
    .duration(400)
    .EUt(30)
    .buildAndRegister();

mods.gregtech.circuit_assembler.recipeBuilder()
    .inputs(metaitem('plate.random_access_memory') * 4)
    .inputs(metaitem('circuit_board.plastic'))
    .fluidInputs(fluid('tin') * 144) // Replaced solder
    .circuitMeta(3)
    .outputs(item('opencomputers:component', 8))
    .duration(200)
    .EUt(120)
    .buildAndRegister();

mods.gregtech.circuit_assembler.recipeBuilder()
    .inputs(metaitem('plate.random_access_memory') * 6)
    .inputs(metaitem('circuit_board.plastic'))
    .fluidInputs(fluid('tin') * 144) // Replaced solder
    .circuitMeta(4)
    .outputs(item('opencomputers:component', 9))
    .duration(400)
    .EUt(120)
    .buildAndRegister();

mods.gregtech.circuit_assembler.recipeBuilder()
    .inputs(metaitem('plate.random_access_memory') * 8)
    .inputs(metaitem('circuit_board.advanced'))
    .fluidInputs(fluid('tin') * 144) // Replaced solder
    .circuitMeta(5)
    .outputs(item('opencomputers:component', 10))
    .duration(200)
    .EUt(480)
    .buildAndRegister();

mods.gregtech.circuit_assembler.recipeBuilder()
    .inputs(metaitem('plate.random_access_memory') * 12)
    .inputs(metaitem('circuit_board.advanced'))
    .fluidInputs(fluid('tin') * 144) // Replaced solder
    .circuitMeta(6)
    .outputs(item('opencomputers:component', 11))
    .duration(400)
    .EUt(480)
    .buildAndRegister();

// Server Component Recipes - Unique to OpenComputers.groovy
mods.gregtech.circuit_assembler.recipeBuilder()
    .inputs(item('opencomputers:component', 7))
    .inputs(item('opencomputers:component'))
    .inputs(ore('wireFineCopper') * 4)
    .inputs(metaitem('circuit_board.good'))
    .fluidInputs(fluid('tin') * 144) // Replaced solder
    .circuitMeta(15)
    .outputs(item('opencomputers:component', 13))
    .duration(400)
    .EUt(30)
    .buildAndRegister();

mods.gregtech.circuit_assembler.recipeBuilder()
    .inputs(item('opencomputers:component', 9))
    .inputs(item('opencomputers:component', 1))
    .inputs(ore('wireFineGold') * 8)
    .inputs(metaitem('circuit_board.plastic'))
    .fluidInputs(fluid('tin') * 144) // Replaced solder
    .circuitMeta(15)
    .outputs(item('opencomputers:component', 14))
    .duration(400)
    .EUt(120)
    .buildAndRegister();

mods.gregtech.circuit_assembler.recipeBuilder()
    .inputs(item('opencomputers:component', 11))
    .inputs(item('opencomputers:component', 2))
    .inputs(ore('wireFineAluminium') * 16)
    .inputs(metaitem('circuit_board.advanced'))
    .fluidInputs(fluid('tin') * 144) // Replaced solder
    .circuitMeta(15)
    .outputs(item('opencomputers:component', 15))
    .duration(400)
    .EUt(480)
    .buildAndRegister();

// Component Bus Recipes - Unique to OpenComputers.groovy
mods.gregtech.circuit_assembler.recipeBuilder()
    .inputs(item('opencomputers:card', 2))
    .inputs(item('opencomputers:component', 4))
    .inputs(item('opencomputers:component', 1))
    .inputs(ore('wireFineCopper') * 16)
    .inputs(metaitem('circuit_board.good'))
    .fluidInputs(fluid('tin') * 144) // Replaced solder
    .circuitMeta(1)
    .outputs(item('opencomputers:component', 16))
    .duration(400)
    .EUt(30)
    .buildAndRegister();

mods.gregtech.circuit_assembler.recipeBuilder()
    .inputs(item('opencomputers:card', 3))
    .inputs(item('opencomputers:component', 5))
    .inputs(item('opencomputers:component', 2))
    .inputs(ore('wireFineGold') * 4)
    .inputs(metaitem('circuit_board.advanced'))
    .fluidInputs(fluid('tin') * 144) // Replaced solder
    .circuitMeta(2)
    .outputs(item('opencomputers:component', 17))
    .duration(400)
    .EUt(120)
    .buildAndRegister();

// Disk Drive Recipe - Unique to OpenComputers.groovy
mods.gregtech.assembler.recipeBuilder()
    .inputs(metaitem('circuit_board.plastic'))
    .inputs(ore('circuitMv'))
    .inputs(metaitem('sensor.mv'))
    .inputs(metaitem('emitter.mv'))
    .inputs(ore('lensGlass'))
    .fluidInputs(fluid('tin') * 144) // Replaced solder
    .outputs(item('opencomputers:diskdrive'))
    .duration(200)
    .EUt(120)
    .buildAndRegister();

// Disk Platter Recipe - Unique to OpenComputers.groovy
mods.gregtech.assembler.recipeBuilder()
    .inputs(ore('lensGlass') * 4)
    .inputs(ore('dustSmallSilver'))
    .outputs(item('opencomputers:material', 12))
    .duration(400)
    .EUt(120)
    .buildAndRegister();

