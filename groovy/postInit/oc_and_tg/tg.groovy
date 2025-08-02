
import gregtech.api.GTValues;

CANNER = recipemap('canner')
LATHE = recipemap('lathe')
CHEMICAL_BATH = recipemap('chemical_bath')

def name_removals = [
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

for (name in name_removals) {
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

crafting.replaceShaped("techguns:sawedoff", item('techguns:sawedoff'), [
        [ore('springSmallSteel'), item('techguns:itemshared:38'), null],
        [item('techguns:itemshared:38'), item('techguns:itemshared', 33), item('techguns:itemshared', 2)],
        [null, item('techguns:itemshared', 2), item('techguns:itemshared', 42)]
]);

crafting.replaceShaped("techguns:pistolrounds", item('techguns:itemshared', 1) * 4, [
    [ore('plateBrass'), ore('gunpowder'), ore('roundFerroboron')],
])

crafting.replaceShaped("techguns:shotgunrounds", item('techguns:itemshared', 2) * 8, [
        [ore('plateSteel'), ore('gunpowder'), ore('roundFerroboron')],
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

mods.gregtech.assembler.recipeBuilder()
    .inputs(metaitem('hull.lv'))
    .inputs(metaitem('electric.motor.lv'))
    .inputs(ore('circuitLv'))
    .inputs(ore('wireFineRedAlloy'))
    .inputs(ore('plateSteel') * 4)
    .fluidInputs(fluid('soldering_alloy') * 72)
    .outputs(item('techguns:basicmachine', 3))
    .duration(100)
    .EUt(GTValues.VA[GTValues.ULV])
    .buildAndRegister()

// Define solder fluids once at the top
def solders = [
    'tin': 72,
    'soldering_alloy': 36,
    'lead': 144
]

// Receiver recipes with improved structure
solders.each { fluidName, amount ->
    // Iron Receiver (ULV)
    mods.gregtech.assembler.recipeBuilder()
        .inputs(
            ore('plateIron') * 3,
            ore('stickIron') * 2,
            ore('gearSmallIron'),
            ore('springSmallIron'),
            ore('boltIron') * 2,
            ore('screwIron') * 2
        )
        .fluidInputs(fluid(fluidName) * amount)
        .outputs(item('techguns:itemshared', 33))
        .duration(100)
        .EUt(GTValues.VA[GTValues.ULV])
        .buildAndRegister()

    // Steel Receiver (LV)
    mods.gregtech.assembler.recipeBuilder()
        .inputs(
            ore('plateSteel') * 3,
            ore('stickSteel') * 2,
            ore('gearSmallSteel'),
            ore('springSmallSteel'),
            ore('boltSteel') * 2,
            ore('screwSteel') * 2
        )
        .fluidInputs(fluid(fluidName) * amount)
        .outputs(item('techguns:itemshared:34'))
        .duration(80)
        .EUt(GTValues.VA[GTValues.LV])
        .buildAndRegister()

    // Stainless Steel Receiver (MV)
    mods.gregtech.assembler.recipeBuilder()
        .inputs(
            ore('plateStainlessSteel') * 3,
            ore('stickStainlessSteel') * 2,
            ore('gearSmallStainlessSteel'),
            ore('springSmallStainlessSteel'),
            ore('boltStainlessSteel') * 2,
            ore('screwStainlessSteel') * 2
        )
        .fluidInputs(fluid(fluidName) * amount)
        .outputs(item('techguns:itemshared:35'))
        .duration(80)
        .EUt(GTValues.VA[GTValues.MV])
        .buildAndRegister()

    // Carbon Fiber Receiver (HV)
    mods.gregtech.assembler.recipeBuilder()
        .inputs(
            ore('plateGraphene') * 3,
            ore('wireGtSingleGraphene') * 2,
            ore('gearSmallTungstenSteel'),
            ore('springSmallTungsten'),
            ore('boltTungstenSteel') * 2,
            ore('screwTungstenSteel') * 2
        )
        .fluidInputs(fluid(fluidName) * amount)
        .outputs(item('techguns:itemshared:36'))
        .duration(80)
        .EUt(GTValues.VA[GTValues.HV])
        .buildAndRegister()
}

// Weapon recipes with improved structure
def makeWeaponRecipes() {
    // Pistol (LV)
    mods.gregtech.assembler.recipeBuilder()
        .inputs(
            ore('springSmallSteel'),
            ore('gearSmallSteel'),
            item('techguns:itemshared:38'), // Iron barrel
            ore('plateRubber') * 2,
            item('techguns:itemshared:11') // Magazine
        )
        .fluidInputs(fluid('tin') * 144)
        .outputs(item('techguns:pistol'))
        .duration(300)
        .EUt(GTValues.VA[GTValues.LV])
        .buildAndRegister()

    // Revolver (LV)
    mods.gregtech.assembler.recipeBuilder()
        .inputs(
            item('techguns:itemshared:38'), // Iron barrel
            item('techguns:itemshared:42'), // Stock
            ore('plateSteel'),
            ore('gearSmallSteel'),
            ore('boltSteel'),
            ore('springSmallSteel')
        )
        .fluidInputs(fluid('tin') * 144)
        .outputs(item('techguns:revolver'))
        .duration(200)
        .EUt(GTValues.VA[GTValues.LV])
        .buildAndRegister()

    // AK-47 (MV)
    mods.gregtech.assembler.recipeBuilder()
        .inputs(
            item('techguns:itemshared:38'),
            item('techguns:itemshared:34'), // Steel receiver
            item('techguns:itemshared:42'), // Stock
            item('techguns:itemshared:13'), // Magazine
            ore('plateWood') // Wooden grip
        )
        .fluidInputs(fluid('soldering_alloy') * 72)
        .outputs(item('techguns:ak47'))
        .duration(300)
        .EUt(GTValues.VA[GTValues.MV])
        .buildAndRegister()

    // Minigun (HV)
    mods.gregtech.assembler.recipeBuilder()
        .inputs(
            item('techguns:itemshared:38') * 6,
            metaitem('electric.motor.hv'),
            item('techguns:itemshared:35'), // Stainless receiver
            item('techguns:itemshared:18')  // Drum magazine
        )
        .fluidInputs(fluid('soldering_alloy') * 288)
        .outputs(item('techguns:minigun'))
        .duration(600)
        .EUt(GTValues.VA[GTValues.HV])
        .buildAndRegister()
}

// Magazine recipes
def makeMagazineRecipes() {
    // Pistol Magazine (LV)
    mods.gregtech.assembler.recipeBuilder()
        .circuitMeta(1)
        .inputs(ore('plateSteel'))
        .inputs(ore('springSmallSteel') * 4)
        .fluidInputs(fluid('tin') * 144)
        .outputs(item('techguns:itemshared:12') * 4) // Pistol mag
        .duration(20)
        .EUt(GTValues.VA[GTValues.LV])
        .buildAndRegister()

    // Rifle Magazine (MV)
    mods.gregtech.assembler.recipeBuilder()
        .circuitMeta(2)
        .inputs(ore('plateStainlessSteel'))
        .inputs(ore('springSmallStainlessSteel') * 4)
        .fluidInputs(fluid('soldering_alloy') * 72)
        .outputs(item('techguns:itemshared:14') * 4) // Rifle mag
        .duration(20)
        .EUt(GTValues.VA[GTValues.MV])
        .buildAndRegister()
}

// Call the functions to build all recipes
makeWeaponRecipes()
makeMagazineRecipes()

mods.gregtech.assembler.recipeBuilder()
    .inputs(ore('plateCupronickel'))
    .inputs(ore('dustGunpowder'))
    .inputs(ore('roundFerroboron'))
    .outputs(item('techguns:itemshared', 3) * 8)
    .duration(10)
    .EUt(16)
    .buildAndRegister();

mods.gregtech.assembler.recipeBuilder()
    .inputs(ore('plateAluminium'))
    .inputs(ore('dustGunpowder'))
    .inputs(ore('roundFerroboron'))
    .outputs(item('techguns:itemshared', 4) * 8)
    .duration(10)
    .EUt(16)
    .buildAndRegister();

mods.gregtech.assembler.recipeBuilder()
    .inputs(ore('dustGunpowder') * 2)
    .inputs(ore('plateSteel'))
    .inputs(ore('ringSteel') * 2)
    .inputs(ore('boltSteel'))
    .circuitMeta(1)
    .outputs(item('techguns:itemshared', 5) * 4)
    .duration(80)
    .EUt(30)
    .buildAndRegister();

mods.gregtech.assembler.recipeBuilder()
    .inputs(ore('dustGunpowder') * 2)
    .inputs(ore('plateSteel'))
    .inputs(ore('ringSteel') * 2)
    .inputs(ore('boltSteel'))
    .inputs(ore('roundFerroboron') * 4)
    .circuitMeta(2)
    .outputs(item('techguns:fraggrenade') * 4)
    .duration(80)
    .EUt(30)
    .buildAndRegister();

mods.gregtech.assembler.recipeBuilder()
    .inputs(ore('platePlastic') * 4)
    .circuitMeta(1)
    .outputs(item('techguns:itemshared', 43))
    .duration(200)
    .EUt(GTValues.VA[GTValues.ULV])
    .buildAndRegister();

mods.gregtech.assembler.recipeBuilder()
    .inputs(ore('plateBrass'))
    .inputs(ore('dustGunpowder'))
    .inputs(ore('roundFerroboron'))
    .circuitMeta(1)
    .outputs(item('techguns:itemshared', 1) * 12)
    .duration(10)
    .EUt(GTValues.VA[GTValues.ULV])
    .buildAndRegister();

mods.gregtech.assembler.recipeBuilder()
    .inputs(ore('plateBrass') * 2)
    .inputs(ore('dustGunpowder'))
    .inputs(ore('roundFerroboron') * 3)
    .circuitMeta(2)
    .outputs(item('techguns:itemshared', 2) * 5)
    .duration(10)
    .EUt(GTValues.VA[GTValues.ULV])
    .buildAndRegister();

mods.gregtech.assembler.recipeBuilder()
    .inputs(ore('platePlastic') * 4)
    .inputs(ore('ringTin') * 2)
    .outputs(item('techguns:itemshared', 28))
    .duration(200)
    .EUt(GTValues.VA[GTValues.ULV])
    .buildAndRegister();

mods.gregtech.assembler.recipeBuilder()
    .inputs(metaitem('electric.pump.mv'))
    .inputs(ore('ringSteel') * 2)
    .inputs(ore('platePlastic') * 4)
    .outputs(item('techguns:itemshared', 72))
    .duration(200)
    .EUt(GTValues.VA[GTValues.ULV])
    .buildAndRegister();

mods.gregtech.forming_press.recipeBuilder()
    .inputs(ore('plateBronze'))
    .inputs(ore('plateSteel'))
    .inputs(ore('plateBrass'))
    .inputs(ore('boltBronze'))
    .inputs(ore('boltSteel'))
    .inputs(ore('boltBrass'))
    .outputs(item('techguns:itemshared', 45))
    .duration(60)
    .EUt(GTValues.VA[GTValues.ULV])
    .buildAndRegister()

LATHE.recipeBuilder()
    .inputs(ore('stickIron'))
    .outputs(item('techguns:itemshared', 38))
    .duration(80)
    .EUt(GTValues.VA[GTValues.ULV])
    .buildAndRegister()

LATHE.recipeBuilder()
    .inputs(ore('stickSteel'))
    .outputs(item('techguns:itemshared:38'))
    .duration(80)
    .EUt(GTValues.VA[GTValues.ULV])
    .buildAndRegister()

CHEMICAL_BATH.recipeBuilder()
    .inputs(item('techguns:itemshared', 4) * 4)
    .fluidInputs(fluid('glyceryl_trinitrate') * 250)
    .outputs(item('techguns:itemshared', 144) * 4)
    .duration(100)
    .EUt(30)
    .buildAndRegister();

CANNER.recipeBuilder()
    .inputs(item('techguns:itemshared', 2) * 4)
    .inputs(ore('dustPhosphorus'))
    .outputs(item('techguns:itemshared', 106) * 4)
    .duration(100)
    .EUt(30)
    .buildAndRegister();

CANNER.recipeBuilder()
    .inputs(item('techguns:itemshared', 4) * 4)
    .inputs(ore('dustPhosphorus'))
    .outputs(item('techguns:itemshared', 108) * 4)
    .duration(100)
    .EUt(30)
    .buildAndRegister();

CANNER.recipeBuilder()
    .inputs(item('techguns:itemshared', 1) * 6)
    .inputs(ore('dustPhosphorus'))
    .outputs(item('techguns:itemshared', 109) * 6)
    .duration(100)
    .EUt(30)
    .buildAndRegister();

CANNER.recipeBuilder()
    .inputs(item('techguns:itemshared', 3) * 4)
    .inputs(ore('dustPhosphorus'))
    .outputs(item('techguns:itemshared', 110) * 4)
    .duration(100)
    .EUt(30)
    .buildAndRegister();

crafting.replaceShaped("techguns:riot_shield", item('techguns:riot_shield'), [
    [metaitem('stickLongSteel'), metaitem('platePolyvinylChloride'), metaitem('stickLongSteel')],
    [metaitem('stickSteel'), metaitem('plateSteel'), metaitem('stickSteel')],
    [metaitem('stickLongSteel'), metaitem('platePolyvinylChloride'), metaitem('stickLongSteel')]
]);

crafting.replaceShaped("techguns:ballistic_shield", item('techguns:ballistic_shield'), [
    [metaitem('plateExtreme'), item('gregtech:transparent_casing'), metaitem('plateExtreme')],
    [metaitem('plateHardCarbon'), item('techguns:riot_shield'), metaitem('plateHardCarbon')],
    [metaitem('plateExtreme'), metaitem('plateHardCarbon'), metaitem('plateExtreme')]
]);

crafting.addShaped("stone_barrel", item('techguns:itemshared:37'), [
    [null, ore('craftingToolFile'), null],
    [ore('craftingToolScrewdriver'), ore('stone'), ore('craftingToolHardHammer')]
]);

crafting.addShaped("wood_stock", item('techguns:itemshared:42'), [
    [ore('plankWood'), ore('plankWood'), null],
    [ore('craftingToolSaw'), ore('plankWood'), ore('craftingToolFile')]
]);

crafting.addShaped("stone_bullets", item('techguns:itemshared:0')*16, [
    [ore('rock'), ore('rock'), null],
    [ore('rock'), ore('dustGunpowder'), null]
]);

crafting.addShaped("iron_barrel", item('techguns:itemshared:38'), [
    [null, ore('craftingToolFile'), null],
    [ore('craftingToolScrewdriver'), ore('stickIron'), ore('craftingToolHardHammer')]
]);

crafting.addShaped("steel_barrel", item('techguns:itemshared:38'), [
    [null, ore('craftingToolFile'), null],
    [ore('craftingToolScrewdriver'), ore('stickSteel'), ore('craftingToolHardHammer')]
]);


crafting.addShaped("heavy_cloth", item('techguns:itemshared:60')*6, [
    [ore('platePlastic'), ore('platePlastic'), ore('platePlastic')],
    [ore('wireFineSteel'), ore('wireFineSteel'), ore('wireFineSteel')],
    [ore('platePlastic'), ore('platePlastic'), ore('platePlastic')]
]);

crafting.addShaped("techguns_iron_receiver", item('techguns:itemshared:33'), [
        [ore('plateIron'), ore('plateIron'), ore('plateIron')],
        [ore('craftingToolScrewdriver'), ore('stickLongIron'), ore('springIron')],
        [null, ore('screwIron'), ore('screwIron')]
]);

crafting.replaceShaped("techguns:t1_combat_helmet", item('techguns:t1_combat_helmet'), [
    [ore('plateSteel'), ore('plateSteel'), ore('plateSteel')],
    [item('techguns:itemshared:60'), ore('craftingToolHardHammer'), item('techguns:itemshared:60')]
]);

crafting.replaceShaped("techguns:t1_combat_chestplate", item('techguns:t1_combat_chestplate'), [
    [item('techguns:itemshared:60'), ore('craftingToolHardHammer'), item('techguns:itemshared:60')],
    [ore('plateSteel'), ore('plateSteel'), ore('plateSteel')],
    [item('techguns:itemshared:60'), item('techguns:itemshared:60'), item('techguns:itemshared:60')]
]);

crafting.replaceShaped("techguns:t1_combat_leggings", item('techguns:t1_combat_leggings'), [
    [ore('plateSteel'), ore('plateSteel'), ore('plateSteel')],
    [item('techguns:itemshared:60'), ore('craftingToolHardHammer'), item('techguns:itemshared:60')],
    [item('techguns:itemshared:60'), null, item('techguns:itemshared:60')]
]);

crafting.replaceShaped("techguns:t1_combat_boots", item('techguns:t1_combat_boots'), [
    [item('techguns:itemshared:60'), null, item('techguns:itemshared:60')],
    [ore('plateSteel'), ore('craftingToolHardHammer'), ore('plateSteel')]
]);

crafting.addShaped("tg_pistol_rounds", item('techguns:itemshared:1')*12, [
    [null, ore('craftingToolHardHammer'), null],
    [null, ore('roundFerroboron'), null],
    [ore('plateBrass'), ore('dustGunpowder'), ore('plateBrass')]
]);

crafting.addShaped("tg_glider_backpack", item('techguns:itemshared:90'), [
    [item('techguns:itemshared:60'), item('techguns:itemshared:60'), item('techguns:itemshared:60')],
    [ore('boltAluminium'), ore('plateAluminium'), ore('boltAluminium')],
    [item('techguns:itemshared:60'), item('techguns:itemshared:60'), item('techguns:itemshared:60')]
]);

crafting.addShaped("tg_glider_wing", item('techguns:itemshared:91'), [
    [ore('stickAluminium'), ore('stickAluminium'), ore('stickAluminium')],
    [ore('platePlastic'), ore('platePlastic'), ore('platePlastic')],
    [ore('platePlastic'), ore('platePlastic'), ore('platePlastic')]
]);

crafting.replaceShapeless("techguns:thompson_ammo_default", item('techguns:thompson'), [
    item('techguns:thompson:*'), 
    item('techguns:itemshared', 9)
]);

crafting.replaceShapeless("techguns:thompson_ammo_incendiary", item('techguns:thompson').withNbt([ammovariant: 'incendiary', ammo: 20]), [
    item('techguns:thompson:*'), 
    item('techguns:itemshared', 112)
]);

crafting.replaceShapeless("techguns:pistol_ammo_default", item('techguns:pistol'), [
    item('techguns:pistol:*'), 
    item('techguns:itemshared', 11)
]);

crafting.replaceShapeless("techguns:pistol_ammo_incendiary", item('techguns:pistol').withNbt([ammovariant: 'incendiary', ammo: 18]), [
    item('techguns:pistol:*'), 
    item('techguns:itemshared', 113)
]);

crafting.replaceShapeless("techguns:ak47_ammo_default", item('techguns:ak47'), [
    item('techguns:ak47:*'), 
    item('techguns:itemshared', 13)
]);

crafting.replaceShapeless("techguns:ak47_ammo_incendiary", item('techguns:ak47').withNbt([ammovariant: 'incendiary', ammo: 30]), [
    item('techguns:ak47:*'), 
    item('techguns:itemshared', 115)
]);

crafting.addShapeless("techguns:boltaction_ammo1", item('techguns:boltaction').withNbt([ammovariant: 'incendiary', ammo: 6]), [
    item('techguns:boltaction:*'), 
    item('techguns:itemshared', 110)
]);

crafting.addShapeless("techguns:boltaction_ammo2", item('techguns:boltaction'), [
    item('techguns:boltaction:*'), 
    item('techguns:itemshared', 3)
]);

crafting.addShapeless("techguns:revolver_ammo1", item('techguns:revolver').withNbt([ammovariant: 'incendiary', ammo: 6]), [
    item('techguns:revolver:*'), 
    item('techguns:itemshared', 109)
]);

crafting.addShapeless("techguns:revolver_ammo2", item('techguns:revolver'), [
    item('techguns:revolver:*'), 
    item('techguns:itemshared', 1)
]);

//Shotgun reloading recipes 

crafting.shapelessBuilder()
    .name('techguns:sawedoff_ammo1')
    .output(item('techguns:sawedoff').withNbt([ammovariant: 'incendiary', ammo: 2])) 
    .input(item('techguns:sawedoff:*').mark('ammo'))  
    .input(item('techguns:itemshared', 106)) 
    .recipeFunction { output, inputs, info ->
        if (!output.hasTagCompound()) { 
            output.setTagCompound(new net.minecraft.nbt.NBTTagCompound()) 
        }
        if (inputs['ammo'].getTagCompound().getString("ammovariant") != 'incendiary') {
            output.getTagCompound().setShort("ammo", (short) 1) 
        }
        else {
            short currentAmmo = inputs['ammo'].getTagCompound().getShort("ammo")
            short newAmmo = (short) Math.min(currentAmmo + 1, 2)        
            output.getTagCompound().setShort("ammo", (short) newAmmo)
        }
    }
    .register()  


crafting.shapelessBuilder()
    .name('techguns:sawedoff_ammo2') 
    .output(item('techguns:sawedoff').withNbt([ammovariant: 'default', ammo: 2])) 
    .input(item('techguns:sawedoff:*').mark('ammo'))
    .input(item('techguns:itemshared', 2))
    .recipeFunction { output, inputs, info -> 
        if (!output.hasTagCompound()) { 
            output.setTagCompound(new net.minecraft.nbt.NBTTagCompound())
        }
        if (inputs['ammo'].getTagCompound().getString("ammovariant") == 'incendiary') {            
            output.getTagCompound().setShort("ammo", (short) 1) 
        }
        else {
            short currentAmmo = inputs['ammo'].getTagCompound().getShort("ammo")
            short newAmmo = (short) Math.min(currentAmmo + 1, 2)        
            output.getTagCompound().setShort("ammo", (short) newAmmo)
        }
    }
    .register()

crafting.shapelessBuilder()
    .name('techguns:combatshotgun_ammo_default') 
    .output(item('techguns:combatshotgun').withNbt([ammovariant: 'default', ammo: 8])) 
    .input(item('techguns:combatshotgun:*').mark('ammo')) 
    .input(item('techguns:itemshared', 2))
    .recipeFunction { output, inputs, info -> 
        if (!output.hasTagCompound()) { 
            output.setTagCompound(new net.minecraft.nbt.NBTTagCompound()) 
        }
        if (inputs['ammo'].getTagCompound().getString("ammovariant") == 'incendiary') {
            output.getTagCompound().setShort("ammo", (short) 1) 
        }
        else {
            short currentAmmo = inputs['ammo'].getTagCompound().getShort("ammo")
            short newAmmo = (short) Math.min(currentAmmo + 1, 8)        
            output.getTagCompound().setShort("ammo", (short) newAmmo)
        }
    }
    .register()

crafting.shapelessBuilder()
    .name('techguns:combatshotgun_ammo_incendiary') 
    .output(item('techguns:combatshotgun').withNbt([ammovariant: 'incendiary', ammo: 8]))
    .input(item('techguns:combatshotgun:*').mark('ammo')) 
    .input(item('techguns:itemshared', 106))
    .recipeFunction { output, inputs, info -> 
        if (!output.hasTagCompound()) { 
            output.setTagCompound(new net.minecraft.nbt.NBTTagCompound()) 
        }
        if (inputs['ammo'].getTagCompound().getString("ammovariant") != 'incendiary') {
            output.getTagCompound().setShort("ammo", (short) 1) 
        }
        else {
            short currentAmmo = inputs['ammo'].getTagCompound().getShort("ammo")
            short newAmmo = (short) Math.min(currentAmmo + 1, 8)        
            output.getTagCompound().setShort("ammo", (short) newAmmo)
        }
    }
    .register()

//--------------------GregTech machines only recipes--------------------

mods.gregtech.forming_press.recipeBuilder()
    .inputs(ore('platePlastic') * 2)
    .inputs(ore('wireFineSteel'))
    .outputs(item('techguns:itemshared:60') * 2)
    .duration(40)
    .EUt(16)
    .buildAndRegister();

mods.gregtech.forming_press.recipeBuilder()
    .inputs(ore('foilSteel'))
    .inputs(item('techguns:itemshared:38'))
    .outputs(item('techguns:itemshared:39'))
    .duration(30)
    .EUt(30)
    .buildAndRegister();

mods.gregtech.assembler.recipeBuilder()
    .inputs(item('minecraft:leather'))
    .fluidInputs(fluid('water') * 1000)
    .outputs(item('techguns:itemshared:77'))
    .duration(85)
    .EUt(7)
    .buildAndRegister();

mods.gregtech.assembler.recipeBuilder()
    .circuitMeta(1)
    .inputs(ore('platePlastic') * 5)
    .inputs(ore('plateExtreme') * 2)
    .outputs(item('techguns:t2_commando_helmet'))
    .duration(100)
    .EUt(960)
    .buildAndRegister();

mods.gregtech.assembler.recipeBuilder()
    .circuitMeta(2)
    .inputs(ore('platePlastic') * 8)
    .inputs(ore('plateExtreme') * 4)
    .outputs(item('techguns:t2_commando_chestplate'))
    .duration(100)
    .EUt(960)
    .buildAndRegister();

mods.gregtech.assembler.recipeBuilder()
    .circuitMeta(3)
    .inputs(ore('platePlastic') * 7)
    .inputs(ore('plateExtreme') * 3)
    .outputs(item('techguns:t2_commando_leggings'))
    .duration(100)
    .EUt(960)
    .buildAndRegister();

mods.gregtech.assembler.recipeBuilder()
    .circuitMeta(4)
    .inputs(ore('platePlastic') * 4)
    .inputs(ore('plateExtreme') * 2)
    .outputs(item('techguns:t2_commando_boots'))
    .duration(100)
    .EUt(960)
    .buildAndRegister();

mods.gregtech.assembler.recipeBuilder()
    .circuitMeta(1)
    .inputs(ore('plateHardCarbon') * 5)
    .inputs(ore('plateExtreme') * 2)
    .outputs(item('techguns:t2_combat_helmet'))
    .duration(100)
    .EUt(960)
    .buildAndRegister();

mods.gregtech.assembler.recipeBuilder()
    .circuitMeta(2)
    .inputs(ore('plateHardCarbon') * 8)
    .inputs(ore('plateExtreme') * 4)
    .outputs(item('techguns:t2_combat_chestplate'))
    .duration(100)
    .EUt(960)
    .buildAndRegister();

mods.gregtech.assembler.recipeBuilder()
    .circuitMeta(3)
    .inputs(ore('plateHardCarbon') * 7)
    .inputs(ore('plateExtreme') * 3)
    .outputs(item('techguns:t2_combat_leggings'))
    .duration(100)
    .EUt(960)
    .buildAndRegister();

mods.gregtech.assembler.recipeBuilder()
    .circuitMeta(4)
    .inputs(ore('plateHardCarbon') * 4)
    .inputs(ore('plateExtreme') * 2)
    .outputs(item('techguns:t2_combat_boots'))
    .duration(100)
    .EUt(960)
    .buildAndRegister();
    
//Armor upgrades

mods.gregtech.assembler.recipeBuilder()
    .circuitMeta(10)
    .inputs(ore('plateSteel') * 4)
    .outputs(item('techguns:itemshared:147'))
    .duration(100)
    .EUt(30)
    .buildAndRegister();

mods.gregtech.assembler.recipeBuilder()
    .circuitMeta(11)
    .inputs(ore('plateSteel') * 2)
    .inputs(ore('platePlastic') * 2)
    .outputs(item('techguns:itemshared:150'))
    .duration(100)
    .EUt(120)
    .buildAndRegister();

mods.gregtech.assembler.recipeBuilder()
    .circuitMeta(12)
    .inputs(ore('plateExtreme') * 2)
    .inputs(ore('plateHardCarbon') * 2)
    .outputs(item('techguns:itemshared:153'))
    .duration(100)
    .EUt(480)
    .buildAndRegister();

mods.gregtech.assembler.recipeBuilder()
    .circuitMeta(13)
    .inputs(ore('plateSteel') * 4)
    .outputs(item('techguns:itemshared:148'))
    .duration(100)
    .EUt(30)
    .buildAndRegister();

mods.gregtech.assembler.recipeBuilder()
    .circuitMeta(14)
    .inputs(ore('plateSteel') * 2)
    .inputs(ore('platePlastic') * 2)
    .outputs(item('techguns:itemshared:151'))
    .duration(100)
    .EUt(120)
    .buildAndRegister();

mods.gregtech.assembler.recipeBuilder()
    .circuitMeta(15)
    .inputs(ore('plateExtreme') * 2)
    .inputs(ore('plateSteel') * 2)
    .outputs(item('techguns:itemshared:154'))
    .duration(100)
    .EUt(480)
    .buildAndRegister();

mods.gregtech.assembler.recipeBuilder()
    .circuitMeta(16)
    .inputs(ore('plateSteel') * 4)
    .outputs(item('techguns:itemshared:149'))
    .duration(100)
    .EUt(30)
    .buildAndRegister();

mods.gregtech.assembler.recipeBuilder()
    .circuitMeta(17)
    .inputs(ore('plateSteel') * 2)
    .inputs(ore('platePlastic') * 2)
    .outputs(item('techguns:itemshared:152'))
    .duration(100)
    .EUt(120)
    .buildAndRegister();

mods.gregtech.assembler.recipeBuilder()
    .circuitMeta(18)
    .inputs(ore('plateExtreme') * 2)
    .inputs(ore('plateHardCarbon') * 2)
    .outputs(item('techguns:itemshared:155'))
    .duration(100)
    .EUt(480)
    .buildAndRegister();

// --------------------Techguns recipes end--------------------

// jackus is