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


def name_removals2 = [
    "techguns:basicmachine_0_ammo_press",
    "techguns:basicmachine_1_metal_press_alt",
    "techguns:basicmachine_1_metal_press",
    "techguns:basicmachine_2_chem_lab",
    "techguns:basicmachine_3_turret",
    "techguns:simplemachine2_8_grinder",
    "techguns:simplemachine_11_blast_furnace",
    "techguns:simplemachine_10_charging_station",
    "techguns:multiblockmachine_0_fabricator_housing",
    "techguns:multiblockmachine_1_fabricator_glass",
    "techguns:multiblockmachine_2_fabricator_controller",
    "techguns:multiblockmachine_3_reactionchamber_housing",
    "techguns:multiblockmachine_4_reactionchamber_glass",
    "techguns:multiblockmachine_5_reactionchamber_controller",
    "techguns:oredrill_0_frame",
    "techguns:oredrill_1_scaffold",
    "techguns:oredrill_2_rod",
    "techguns:oredrill_3_engine",
    "techguns:oredrill_4_controller",
    "techguns:itemshared_1_pistolrounds",
    "techguns:itemshared_2_shotgunrounds",
    "techguns:itemshared_7_rocket",
    "techguns:itemshared_10_smgmagazineempty",
    "techguns:itemshared_12_pistolmagazineempty",
    "techguns:itemshared_14_assaultriflemagazineempty",
    "techguns:itemshared_16_lmgmagazineempty",
    "techguns:itemshared_18_minigundrumempty",
    "techguns:itemshared_20_as50magazineempty",
    "techguns:itemshared_22_advancedmagazineempty",
    "techguns:itemshared_26_biotankempty",
    "techguns:itemshared_28_fueltankempty",
    "techguns:itemshared_33_ironreceiver",
    "techguns:itemshared_34_steelreceiver",
    "techguns:itemshared_35_obsidiansteelreceiver",
    "techguns:itemshared_36_carbonreceiver",
    "techguns:itemshared_38_ironbarrel",
    "techguns:itemshared_39_obsidiansteelbarrel",
    "techguns:itemshared_43_plasticstock",
    "techguns:itemshared_61_biomass",
    "techguns:itemshared_62_copperwire",
    "techguns:itemshared_65_circuitboard",
    "techguns:itemshared_66_circuitboardelite",
    "techguns:itemshared_68_coil",
    "techguns:itemshared_70_electricengine",
    "techguns:itemshared_72_pumpmechanism",
    "techguns:itemshared_103_quartzrod",
    "techguns:itemshared_103_quartzrod_alt",
    "techguns:itemshared_104_rcheatray",
    "techguns:itemshared_117_rocket_nuke",
    "techguns:itemshared_118_tacticalnukewarhead",
    "techguns:itemshared_134_oredrillsmall_steel",
    "techguns:itemshared_135_oredrillsmall_obsidiansteel",
    "techguns:itemshared_136_oredrillsmall_carbon",
    "techguns:itemshared_137_oredrillmedium_steel",
    "techguns:itemshared_138_oredrillmedium_obsidiansteel",
    "techguns:itemshared_139_oredrillmedium_carbon",
    "techguns:itemshared_140_oredrilllarge_steel",
    "techguns:itemshared_141_oredrilllarge_obsidiansteel",
    "techguns:itemshared_142_oredrilllarge_carbon",
    "techguns:itemshared_146_infusionbag",
    "techguns:thompson",
    "techguns:thompson_alt",
    "techguns:ak47",
    "techguns:ak47_alt",
    "techguns:m4",
    "techguns:m4_alt",
    "techguns:m4_infiltrator",
    "techguns:m4_infiltrator_alt",
    "techguns:pistol",
    "techguns:pistol_alt",
    "techguns:combatshotgun",
    "techguns:combatshotgun_ammo_default",
    "techguns:combatshotgun_ammo_incendiary",
    "techguns:boltaction_ammo_default",
    "techguns:boltaction_ammo_incendiary",
    "techguns:revolver_ammo_default",
    "techguns:revolver_ammo_incendiary",
    "techguns:goldenrevolver",
    "techguns:mac10",
    "techguns:mac10_alt",
    "techguns:flamethrower",
    "techguns:flamethrower_alt",
    "techguns:fraggrenade",
    "techguns:rocketlauncher",
    "techguns:rocketlauncher_alt",
    "techguns:guidedmissilelauncher",
    "techguns:guidedmissilelauncher_alt",
    "techguns:grimreaper",
    "techguns:grenadelauncher",
    "techguns:aug",
    "techguns:aug_alt",
    "techguns:sawedoff_ammo_default",
    "techguns:sawedoff_ammo_incendiary",
    "techguns:netherblaster",
    "techguns:biogun",
    "techguns:biogun_alt",
    "techguns:teslagun",
    "techguns:teslagun_alt",
    "techguns:lmg",
    "techguns:lmg_alt",
    "techguns:minigun",
    "techguns:minigun_alt",
    "techguns:as50",
    "techguns:as50_alt",
    "techguns:vector",
    "techguns:vector_alt",
    "techguns:scar",
    "techguns:scar_alt",
    "techguns:lasergun",
    "techguns:lasergun_alt",
    "techguns:blasterrifle",
    "techguns:blasterrifle_alt",
    "techguns:sonicshotgun",
    "techguns:sonicshotgun_alt",
    "techguns:pdw",
    "techguns:pdw_alt",
    "techguns:pulserifle",
    "techguns:pulserifle_alt",
    "techguns:mibgun",
    "techguns:mibgun_alt",
    "techguns:powerhammer",
    "techguns:powerhammer_alt",
    "techguns:chainsaw",
    "techguns:chainsaw_alt",
    "techguns:nucleardeathray",
    "techguns:nucleardeathray_alt",
    "techguns:gaussrifle",
    "techguns:gaussrifle_alt",
    "techguns:miningdrill",
    "techguns:miningdrill_alt",
    "techguns:tfg",
    "techguns:tfg_alt",
    "techguns:laserpistol",
    "techguns:laserpistol_alt",
    "techguns:compressedairtankempty",
    "techguns:compressedairtankempty_alt",
    "techguns:simplemachine_8_camo_bench",
    "techguns:simplemachine_9_upgrade_bench",
    "techguns:simplemachine2_9_armor_bench",
    "techguns:itemshared_60_heavycloth",
    "techguns:t2_commando_helmet",
    "techguns:t2_commando_chestplate",
    "techguns:t2_commando_leggings",
    "techguns:t2_commando_boots",
    "techguns:t2_combat_helmet",
    "techguns:t2_combat_chestplate",
    "techguns:t2_combat_leggings",
    "techguns:t2_combat_boots",
    "techguns:t3_exo_helmet",
    "techguns:t3_exo_chestplate",
    "techguns:t3_exo_leggings",
    "techguns:t3_exo_boots",
    "techguns:t3_miner_helmet",
    "techguns:t3_miner_chestplate",
    "techguns:t3_miner_leggings",
    "techguns:t3_miner_boots",
    "techguns:t4_praetor_helmet",
    "techguns:t4_praetor_chestplate",
    "techguns:t4_praetor_leggings",
    "techguns:t4_praetor_boots",
    "techguns:hazmat_helmet",
    "techguns:hazmat_chestplate",
    "techguns:hazmat_leggings",
    "techguns:hazmat_boots",
    "techguns:itemshared_147_upgrade_protection_1",
    "techguns:itemshared_150_upgrade_protection_2",
    "techguns:itemshared_153_upgrade_protection_3",
    "techguns:itemshared_148_upgrade_projectile_protection_1",
    "techguns:itemshared_151_upgrade_projectile_protection_2",
    "techguns:itemshared_154_upgrade_projectile_protection_3",
    "techguns:itemshared_149_upgrade_blast_protection_1",
    "techguns:itemshared_152_upgrade_blast_protection_2",
    "techguns:itemshared_155_upgrade_blast_protection_3",
    "techguns:itemshared_86_nuggetcopper",
    "techguns:itemshared_87_nuggetlead",
    "techguns:itemshared_88_nuggetsteel"
]

for (name in name_removals2) {
    crafting.remove(name);
}

mods.jei.ingredient.yeet( // hide techguns plates, ingots, and ores
    item('techguns:basicore'), //Copper Ore
    item('techguns:basicore', 1), //Tin Ore
    item('techguns:basicore', 2), //Lead Ore
    item('techguns:basicore', 3), //Titanium Ore
    item('techguns:basicore', 4), //Uranium Ore

    item('techguns:itemshared', 46), //Iron Plate
    item('techguns:itemshared', 47), //Copper Plate
    item('techguns:itemshared', 48), //Tin Plate
    item('techguns:itemshared', 49), //Bronze Plate
    item('techguns:itemshared', 50), //Steel Plate
    item('techguns:itemshared', 52), //Lead Plate
    item('techguns:itemshared', 53), //Carbon Plate
    item('techguns:itemshared', 54), //Titanium Plate

    item('techguns:itemshared', 78), //Titanium Ore

    item('techguns:itemshared', 79), //Copper Ingot
    item('techguns:itemshared', 80), //Tin Ingot
    item('techguns:itemshared', 81), //Bronze Ingot
    item('techguns:itemshared', 82), //Lead Ingot
    item('techguns:itemshared', 83), //Steel Ingot
    item('techguns:itemshared', 85)  //Titanium Ingot
)

ore_dict.remove('oreCopper', item('techguns:basicore'))
ore_dict.remove('oreTin', item('techguns:basicore', 1))
ore_dict.remove('oreLead', item('techguns:basicore', 2))

ore_dict.remove('plateIron', item('techguns:itemshared', 46))
ore_dict.remove('plateCopper', item('techguns:itemshared', 47))
ore_dict.remove('plateTin', item('techguns:itemshared', 48))
ore_dict.remove('plateBronze', item('techguns:itemshared', 49))
ore_dict.remove('plateSteel', item('techguns:itemshared', 50))
ore_dict.remove('plateLead', item('techguns:itemshared', 52))
ore_dict.remove('plateCarbon', item('techguns:itemshared', 53))
ore_dict.remove('plateTitanium', item('techguns:itemshared', 54))

ore_dict.remove('ingotCopper', item('techguns:itemshared', 79))
ore_dict.remove('ingotTin', item('techguns:itemshared', 80))
ore_dict.remove('ingotBronze', item('techguns:itemshared', 81))
ore_dict.remove('ingotLead', item('techguns:itemshared', 82))
ore_dict.remove('ingotSteel', item('techguns:itemshared', 83))
ore_dict.remove('ingotTitanium', item('techguns:itemshared', 85))


ASSEMBLER = recipemap('assembler')


crafting.replaceShaped("techguns:stielgranate", item('techguns:stielgranate'), [
    [null, null, null],
    [null, item('techguns:itemshared', 5), null],
    [null, item('minecraft:stick'), null]
])

crafting.replaceShaped("techguns:simplemachine_8_camo_bench", item('techguns:simplemachine', 8), [
    [ore('dye'), ore('dye'), ore('dye')],
    [ore('plateIron'), ore('workbench'), ore('plateIron')],
    [ore('plateIron'), ore('plateIron'), ore('plateIron')]
])

crafting.replaceShaped("techguns:simplemachine_9_repair_bench", item('techguns:simplemachine', 9), [
    [ore('plateIron'), ore('gearSteel'), ore('plateIron')],
    [ore('plateIron'), ore('workbench'), ore('plateIron')],
    [ore('plateIron'), ore('plateIron'), ore('plateIron')]
])

crafting.replaceShaped("techguns:simplemachine2_9_armor_bench", item('techguns:simplemachine2', 9), [
    [ore('plateIron'), metaitem('stickSteel'), ore('plateIron')],
    [ore('gearSteel'), ore('workbench'), ore('gearSteel')],
    [null, ore('circuitLv'), null]
])

crafting.replaceShaped("techguns:explosive_charge_0_tnt", item('techguns:explosive_charge') * 8, [
    [ore('plateRubber'), ore('dustGunpowder'), ore('plateRubber')],
    [ore('dustGunpowder'), ore('circuitLv'), ore('dustGunpowder')],
    [ore('plateRubber'), ore('dustGunpowder'), ore('plateRubber')]
])

crafting.replaceShaped("techguns:explosive_charge_1_advanced", item('techguns:explosive_charge', 1) * 4, [
    [ore('platePlastic'), item('minecraft:tnt'), ore('platePlastic')],
    [item('minecraft:tnt'), ore('circuitMv'), item('minecraft:tnt')],
    [ore('platePlastic'), item('minecraft:tnt'), ore('platePlastic')]
])

crafting.replaceShaped("techguns:lamp0_0", item('techguns:lamp0') * 32, [
    [ore('plateIron'), ore('plateIron'), ore('plateIron')],
    [ore('plateGlass'), ore('dustGlowstone'), ore('plateGlass')],
    [ore('plateGlass'), ore('plateGlass'), ore('plateGlass')]
])

crafting.replaceShaped("techguns:lamp0_12", item('techguns:lamp0', 12) * 32, [
    [ore('plateGlass'), ore('plateIron'), ore('plateGlass')],
    [ore('plateGlass'), ore('dustGlowstone'), ore('plateGlass')],
    [ore('plateGlass'), ore('plateIron'), ore('plateGlass')]
])

crafting.replaceShaped("techguns:neonlights_0", item('techguns:neonlights') * 32, [
    [ore('plateIron'), ore('plateIron'), ore('plateIron')],
    [ore('plateGlass'), ore('dustGlowstone'), ore('plateGlass')],
    [ore('plateIron'), ore('plateIron'), ore('plateIron')]
])

crafting.replaceShaped("techguns:ladder0_8", item('techguns:ladder0', 8) * 16, [
    [ore('stickIron'), ore('stickIron'), ore('stickIron')],
    [null, ore('stickIron'), null],
    [ore('stickIron'), ore('stickIron'), ore('stickIron')]
])

crafting.replaceShaped("techguns:ladder0_8_alt", item('techguns:ladder0', 8) * 16, [
    [ore('stickTin'), ore('stickTin'), ore('stickTin')],
    [null, ore('stickTin'), null],
    [ore('stickTin'), ore('stickTin'), ore('stickTin')]
])

crafting.replaceShaped("techguns:camonet_0", item('techguns:camonet') * 8, [
    [null, null, null],
    [ore('stickWood'), ore('treeLeaves'), ore('stickWood')],
    [ore('stickWood'), ore('treeLeaves'), ore('stickWood')]
])

crafting.replaceShaped("techguns:camonet_top_0", item('techguns:camonet_top') * 16, [
    [ore('stickWood'), ore('treeLeaves'), ore('stickWood')],
    [ore('treeLeaves'), ore('string'), ore('treeLeaves')],
    [ore('stickWood'), ore('treeLeaves'), ore('stickWood')]
])

crafting.replaceShaped("techguns:itemshared_42_woodstock", item('techguns:itemshared', 42), [
    [null, null, null],
    [ore('craftingToolFile'), ore('logWood'), ore('craftingToolSaw')],
    [null, null, null]
])

crafting.replaceShaped("techguns:t1_miner_helmet", item('techguns:t1_miner_helmet'), [
    [null, null, null],
    [ore('plateIron'), ore('dyeYellow'), ore('plateIron')],
    [item('techguns:itemshared', 60), ore('craftingToolHardHammer'), item('techguns:itemshared', 60)]
])

crafting.replaceShaped("techguns:t1_miner_chestplate", item('techguns:t1_miner_chestplate'), [
    [item('techguns:itemshared', 60), ore('craftingToolHardHammer'), item('techguns:itemshared', 60)],
    [item('techguns:itemshared', 60), item('techguns:itemshared', 60), item('techguns:itemshared', 60)],
    [ore('plateIron'), item('techguns:itemshared', 60), ore('plateIron')]
])

crafting.replaceShaped("techguns:t1_miner_leggings", item('techguns:t1_miner_leggings'), [
    [ore('plateIron'), item('techguns:itemshared', 60), ore('plateIron')],
    [item('techguns:itemshared', 60), ore('craftingToolHardHammer'), item('techguns:itemshared', 60)],
    [item('techguns:itemshared', 60), null, item('techguns:itemshared', 60)]
])

crafting.replaceShaped("techguns:t1_miner_boots", item('techguns:t1_miner_boots'), [
    [null, null, null],
    [item('techguns:itemshared', 60), null, item('techguns:itemshared', 60)],
    [ore('plateIron'), ore('craftingToolHardHammer'), ore('plateIron')]
])

crafting.replaceShaped("techguns:steam_helmet", item('techguns:steam_helmet'), [
    [null, null, null],
    [item('techguns:itemshared', 45), item('techguns:itemshared', 45), item('techguns:itemshared', 45)],
    [item('techguns:itemshared', 45), ore('craftingToolWrench'), item('techguns:itemshared', 45)]
])

crafting.replaceShaped("techguns:steam_chestplate", item('techguns:steam_chestplate'), [
    [item('techguns:itemshared', 45), ore('craftingToolWrench'), item('techguns:itemshared', 45)],
    [item('techguns:itemshared', 45), item('techguns:itemshared', 45), item('techguns:itemshared', 45)],
    [item('techguns:itemshared', 45), item('techguns:itemshared', 45), item('techguns:itemshared', 45)]
])

crafting.replaceShaped("techguns:steam_leggings", item('techguns:steam_leggings'), [
    [item('techguns:itemshared', 45), item('techguns:itemshared', 45), item('techguns:itemshared', 45)],
    [item('techguns:itemshared', 45), ore('craftingToolWrench'), item('techguns:itemshared', 45)],
    [item('techguns:itemshared', 45), null, item('techguns:itemshared', 45)]
])

crafting.replaceShaped("techguns:steam_boots", item('techguns:steam_boots'), [
    [null, null, null],
    [item('techguns:itemshared', 45), ore('craftingToolWrench'), item('techguns:itemshared', 45)],
    [item('techguns:itemshared', 45), null, item('techguns:itemshared', 45)]
])

crafting.replaceShaped("techguns:item_bunkerdoor", item('techguns:item_bunkerdoor'), [
    [null, ore('craftingToolHardHammer'), ore('screwIron')],
    [null, ore('plateIron'), item('minecraft:iron_door')],
    [null, ore('craftingToolScrewdriver'), ore('screwIron')]
])

crafting.replaceShaped("techguns:revolver", item('techguns:revolver'), [
    [ore('craftingToolHardHammer'), ore('plateIron'), ore('springSmallIron')],
    [item('techguns:itemshared', 38), ore('gearSmallIron'), ore('boltIron')],
    [ore('craftingToolFile'), item('techguns:itemshared', 42), item('techguns:itemshared', 1)]
])

crafting.replaceShaped("techguns:boltaction", item('techguns:boltaction'), [
    [null, ore('craftingToolWrench'), item('techguns:itemshared', 3)],
    [ore('plateGlass'), ore('ringIron'), ore('plateGlass')],
    [item('techguns:itemshared', 38), item('techguns:itemshared', 33), item('techguns:itemshared', 42)]
])



crafting.replaceShapeless("techguns:sandbags", item('techguns:sandbags') * 8, [
    ore('plateRubber'), 
    ore('sand'),
    ore('sand'),
    ore('sand'),
    ore('sand'),
    ore('sand'),
    ore('sand'),
    ore('sand'),
    ore('sand')
])

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

