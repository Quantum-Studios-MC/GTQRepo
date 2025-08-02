import thaumcraft.api.aspects.AspectHelper
import thaumcraft.api.aspects.AspectList
import gregtech.api.recipes.RecipeMaps


mods.thaumcraft.crucible.recipeBuilder()
    .researchKey('UNLOCKALCHEMY@3')
    .catalyst(item('minecraft:clay'))
    .output(item('embers:blend_caminite'))
    .aspect(aspect('machina') * 25)
    .aspect(aspect('auram') * 40)
    .register()

mods.thaumcraft.infusion_crafting.recipeBuilder()
    .researchKey('UNLOCKALCHEMY@3')
    .mainInput(ore('stoneMarble'))
    .output(item('astralsorcery:blockblackmarble'))
    .aspect(aspect('perditio') * 200)
    .aspect('praecantatio', 150)
    .input(item('bloodmagic:ritual_stone', 4))
    .input(item('thaumcraft:ingot', 1))
    .input(ore('nuggetMithrillium'))
    .input(item('thaumcraft:metal_alchemical_advanced'))
    .instability(5)
    .register()

mods.thaumcraft.infusion_crafting.recipeBuilder()
    .researchKey('EBTHAUMIUM')
    .mainInput(ore('ingotThaumium'))
    .output(item('gregtech:meta_ingot', 32001))
    .aspect(aspect('perditio') * 200)
    .aspect('vitium', 150)
    .input(item('thaumcraft:curio'))
    .input(ore('ingotThaumiumPerditio'))
    .input(ore('nuggetMithrillium'))
    .instability(5)
    .register()

mods.thaumcraft.infusion_crafting.recipeBuilder()
    .researchKey('UNLOCKALCHEMY@3')
    .mainInput(item('bloodarsenal:base_item', 5))
    .output(item('gt_aurora:botathaumahaemic_sentient_hivemind_cell'))
    .aspect(aspect('perditio') * 120)
    .aspect('mortuus', 50)
    .input(item('bloodmagic:demon_crystal'))
    .input(ore('ingotThaumiumPerditio'))
    .input(item('bloodarsenal:base_item', 4))
    .input(item('bloodmagic:slate', 1))
    .input(ore('ingotManasteel'))
    .instability(20)
    .register()

mods.thaumcraft.dust_trigger.triggerBuilder()
    .researchKey('WITCHINGTOOLS')
    .target(block('thaumcraft:crucible'))
    .output(item('bewitchment:witches_oven'))
    .register()

mods.thaumcraft.dust_trigger.triggerBuilder()
    .researchKey('UNLOCKALCHEMY@3')
    .target(block('thaumcraft:smelter_basic'))
    .output(item('bewitchment:witches_cauldron'))
    .register()


mods.thaumcraft.infusion_crafting.recipeBuilder()
    .researchKey('VITALIUM')
    .mainInput(item('bloodarsenal:blood_diamond', 3))
    .output(item('gregtech:meta_dust', 32107))
    .aspect('mortuus', 150)
    .aspect('victus', 150)
    .input(item('bewitchment:contract'))
    .input(item('bewitchment:demon_heart'))
    .input(item('bewitchment:demonic_elixir'))
    .input(ore('ingotDreadium'))
    .input(ore('ingotBloodInfusedIron'))
    .instability(40)
    .register()


mods.thaumcraft.arcane_workbench.shapedBuilder()
    .researchKey('MANALENS')
    .output(item('botania:lens'))
    .matrix('EEE',
            'ESE',
            'EEE')
    .key('S', ore('blockGlass'))
    .key('E', ore('plateManasteel'))
    .aspect(aspect('ignis'))
    .aspect(aspect('terra'))
    .vis(40)
    .register()


mods.thaumcraft.infusion_crafting.recipeBuilder()
    .researchKey('MANALENS')
    .mainInput(ore('ringManasteel'))
    .output(item('botania:lens'))
    .aspect('praecantatio', 10)
    .aspect('terra', 20)
    .input(item('botania:managlass'))
    .instability(2)
    .register()

mods.thaumcraft.crucible.recipeBuilder()
    .researchKey('FIRSTSTEPS')
    .catalyst(ore('gemFluix'))
    .output(item('gregtech:meta_gem', 31750))
    .aspect(aspect('aqua') * 2)
    .register()

mods.thaumcraft.infusion_crafting.removeByOutput(item('thaumictinkerer:ichor_block'))
 
recipemap('centrifuge').recipeBuilder()
        .inputs(ore('dustAquivite'))
        .outputs(item('serendustry:meta_dust', 177))
        .fluidOutputs(fluid('magic_2') * 10)
        .duration(120).EUt(12).buildAndRegister()
 
recipemap('centrifuge').recipeBuilder()
        .inputs(ore('dustPerditionite'))
        .outputs(item('serendustry:meta_dust', 181))
        .fluidOutputs(fluid('magic_2') * 10)
        .duration(120).EUt(12).buildAndRegister()

recipemap('centrifuge').recipeBuilder()
        .inputs(ore('dustIgnivite'))
        .outputs(item('serendustry:meta_dust', 176))
        .fluidOutputs(fluid('magic_2') * 10)
        .duration(120).EUt(12).buildAndRegister()

recipemap('centrifuge').recipeBuilder()
        .inputs(ore('dustTerratite'))
        .outputs(item('serendustry:meta_dust', 178))
        .fluidOutputs(fluid('magic_2') * 10)
        .duration(120).EUt(12).buildAndRegister()

recipemap('centrifuge').recipeBuilder()
        .inputs(ore('dustAeratite'))
        .outputs(item('serendustry:meta_dust', 179))
        .fluidOutputs(fluid('magic_2') * 10)
        .duration(120).EUt(12).buildAndRegister()

recipemap('centrifuge').recipeBuilder()
        .inputs(ore('dustOrdominite'))
        .outputs(item('serendustry:meta_dust', 180))
        .fluidOutputs(fluid('magic_2') * 10)
        .duration(120).EUt(12).buildAndRegister()

// Ignis Crystal Dust * 1
mods.gregtech.chemical_bath.removeByInput(30, [metaitem('dustDiamond')], [fluid('lava') * 100 * 100])
// Aqua Crystal Dust * 1
mods.gregtech.chemical_bath.removeByInput(30, [metaitem('dustDiamond')], [fluid('distilled_water') * 100 * 100])
// Terra Crystal Dust * 1
mods.gregtech.chemical_bath.removeByInput(30, [metaitem('dustDiamond')], [fluid('plastic') * 100 * 100])
// Aer Crystal Dust * 1
mods.gregtech.chemical_bath.removeByInput(30, [metaitem('dustDiamond')], [fluid('air') * 100 * 100])
// Ordo Crystal Dust * 1
mods.gregtech.chemical_bath.removeByInput(30, [metaitem('dustDiamond')], [fluid('antimony') * 100 * 100])
// Perditio Crystal Dust * 1
mods.gregtech.chemical_bath.removeByInput(30, [metaitem('dustDiamond')], [fluid('tin_alloy') * 100 * 100])
    
recipemap('implosion_compressor').recipeBuilder()
        .inputs(item('thaumcraft:crystal_essence').withNbt(['Aspects': [['key': 'ignis', 'amount': 1]]]))
        .outputs(metaitem('serendustry:gemIgnisCrystal'))
        .property("explosives", item('gregtech:powderbarrel'))
        .duration(120).EUt(512).buildAndRegister()

recipemap('implosion_compressor').recipeBuilder()
        .inputs(item('thaumcraft:crystal_essence').withNbt(['Aspects': [['key': 'aer', 'amount': 1]]]))
        .outputs(metaitem('serendustry:gemAerCrystal'))
        .property("explosives", item('gregtech:powderbarrel'))
        .duration(120).EUt(512).buildAndRegister()

recipemap('implosion_compressor').recipeBuilder()
        .inputs(item('thaumcraft:crystal_essence').withNbt(['Aspects': [['key': 'aqua', 'amount': 1]]]))
        .outputs(metaitem('serendustry:gemAquaCrystal'))
        .property("explosives", item('gregtech:powderbarrel'))
        .duration(120).EUt(512).buildAndRegister()

recipemap('implosion_compressor').recipeBuilder()
        .inputs(item('thaumcraft:crystal_essence').withNbt(['Aspects': [['key': 'terra', 'amount': 1]]]))
        .outputs(metaitem('serendustry:gemTerraCrystal'))
        .property("explosives", item('gregtech:powderbarrel'))
        .duration(120).EUt(512).buildAndRegister()

recipemap('implosion_compressor').recipeBuilder()
        .inputs(item('thaumcraft:crystal_essence').withNbt(['Aspects': [['key': 'ordo', 'amount': 1]]]))
        .outputs(metaitem('serendustry:gemOrdoCrystal'))
        .property("explosives", item('gregtech:powderbarrel'))
        .duration(120).EUt(512).buildAndRegister()

recipemap('implosion_compressor').recipeBuilder()
        .inputs(item('thaumcraft:crystal_essence').withNbt(['Aspects': [['key': 'perditio', 'amount': 1]]]))
        .outputs(metaitem('serendustry:gemPerditioCrystal'))
        .property("explosives", item('gregtech:powderbarrel'))
        .duration(120).EUt(512).buildAndRegister()

def registerAspectGemImplosions(aspects) {
    aspects.each { aspect ->
        def key = aspect.key
        def amount = aspect.amount ?: 1
        def capitalKey = key.capitalize()
        
        // Forward: Thaumcraft crystal ➜ gem (via implosionining.. DN!)
        recipemap('implosion_compressor').recipeBuilder()
            .inputs(item('thaumcraft:crystal_essence')
                .withNbt(['Aspects': [['key': key, 'amount': amount]]]))
            .outputs(metaitem("gem${capitalKey}"))
            .property("explosives", item('gregtech:powderbarrel'))
            .duration(120)
            .EUt(512)
            .buildAndRegister()

        // Reverse: gem ➜ Thaumcraft crystal (via macerating.. dn!!)
        recipemap('extractor').recipeBuilder()
            .inputs(ore("gem${capitalKey}"))
            .outputs(item('thaumcraft:crystal_essence')
                .withNbt(['Aspects': [['key': key, 'amount': amount]]]))
            .duration(80)
            .EUt(120)
            .buildAndRegister()
    }
}

registerAspectGemImplosions([
    [key: 'vacuos'],
    [key: 'lux'],
    [key: 'motus'],
    [key: 'gelum'],
    [key: 'vitreus'],
    
    [key: 'metallum'],
    [key: 'victus'],
    [key: 'mortuus'],
    [key: 'potentia'],
    [key: 'permutatio'],
    [key: 'praecantatio'],
    [key: 'auram'],
    [key: 'alkimia'],
    [key: 'vitium'],
    [key: 'tenebrae'],
    [key: 'alienis'],
    [key: 'volatus'],
    [key: 'herba'],
    [key: 'instrumentum'],
    [key: 'fabrico'],
    [key: 'machina'],
    [key: 'vinculum'],
    [key: 'spiritus'],
    [key: 'cognitio'],
    [key: 'sensus'],
    [key: 'aversio'],
    [key: 'praemunio'],
    [key: 'desiderium'],
    [key: 'exanimis'],
    [key: 'bestia'],
    [key: 'humanus'],
    [key: 'sol'],
    [key: 'luna'],
    [key: 'stellae'],
    [key: 'diabolus'],
    [key: 'fluctus'],
    [key: 'sonus'],
    [key: 'exitium'],
    [key: 'caeles'],
    [key: 'draco'],
    [key: 'infernum'],
    [key: 'ventus'],
    [key: 'visum'],
    [key: 'imperium']
])



// im blooding it. im blooding my magick!

mods.thaumcraft.infusion_crafting.recipeBuilder()
    .researchKey('BLOODALTAR')
    .mainInput(item('thaumcraft:stone_arcane'))
    .output(item('bloodmagic:altar'))
    .aspect('mortuus', 50)
    .aspect('victus', 50)
    .input(item('thaumcraft:stone_arcane'))
    .input(ore('runeWrathB'))
    .input(item('thaumcraft:stone_arcane'))
    .input(ore('runeSummerB'))
    .input(item('thaumcraft:stone_arcane'))
    .input(ore('runeAutumnB'))
    .instability(10)
    .register()

mods.thaumcraft.infusion_crafting.recipeBuilder()
    .researchKey('DAGGER')
    .mainInput(item('botania:terrasword'))
    .output(item('bloodmagic:sacrificial_dagger'))
    .aspect('mortuus', 25)
    .aspect('victus', 25)
    .aspect('aversio', 25)
    .input(item('thaumcraft:stone_arcane'))
    .input(ore('runeWrathB'))
    .input(item('thaumcraft:stone_arcane'))
    .input(ore('runeSlothB'))
    .input(item('thaumcraft:stone_arcane'))
    .input(ore('runeLustB'))
    .instability(20)
    .register()

mods.thaumcraft.infusion_crafting.recipeBuilder()
    .researchKey('BLOODRUNECRAFT')
    .mainInput(item('bloodmagic:slate'))
    .output(item('bloodmagic:blood_rune'))
    .aspect('mortuus', 10)
    .aspect('vinculum', 5)
    .aspect('victus', 10)
    .input(item('thaumcraft:stone_arcane'))
    .input(item('thaumcraft:nitor_yellow'))
    .input(item('thaumcraft:stone_arcane'))
    .input(item('thaumcraft:nitor_yellow'))
    .instability(2)
    .register()

mods.thaumcraft.infusion_crafting.recipeBuilder()
    .researchKey('INSCRIPTIONTOOLS')
    .mainInput(item('natura:nether_sapling2'))
    .output(item('bloodmagic:ritual_diviner'))
    .aspect('mortuus', 25)
    .aspect('victus', 25)
    .aspect('aer', 25)
    .aspect('ignis', 25)
    .aspect('aqua', 25)
    .aspect('terra', 25)
    .input(item('bloodmagic:inscription_tool', 1))
    .input(ore('runeFireB'))
    .input(item('bloodmagic:inscription_tool', 2))
    .input(ore('runeWaterB'))
    .input(item('bloodmagic:inscription_tool', 3))
    .input(ore('runeAirB'))
    .input(item('bloodmagic:inscription_tool', 4))
    .input(ore('runeEarthB'))
    .instability(2)
    .register()

mods.thaumcraft.infusion_crafting.recipeBuilder()
    .researchKey('RITUALSTONES')
    .mainInput(item('bloodmagic:blood_rune'))
    .output(item('bloodmagic:ritual_stone'))
    .aspect('mortuus', 50)
    .aspect('victus', 50)
    .input(item('bloodmagic:slate', 1))
    .input(ore('runeFireB'))
    .input(item('bloodmagic:slate', 1))
    .input(ore('runeWaterB'))
    .input(item('bloodmagic:slate', 1))
    .input(ore('runeAirB'))
    .input(item('bloodmagic:slate', 1))
    .input(ore('runeEarthB'))
    .instability(5)
    .register()

mods.thaumcraft.crucible.recipeBuilder()
    .researchKey('RUDIMENTARYSNARE')
    .catalyst(ore('manaString'))
    .output(item('bloodmagic:soul_snare'))
    .aspect(aspect('vinculum') * 2)
    .register()

mods.thaumcraft.infusion_crafting.recipeBuilder()
    .researchKey('RITUALSTONES')
    .mainInput(item('bloodmagic:ritual_stone'))
    .output(item('bloodmagic:ritual_controller'))
    .aspect('mortuus', 50)
    .aspect('humanus', 50)
    .aspect('victus', 50)
    .input(item('bloodmagic:ritual_stone'))
    .input(ore('runeLustB'))
    .input(item('bloodmagic:ritual_stone'))
    .input(ore('runeLustB'))
    .input(item('bloodmagic:ritual_stone'))
    .input(ore('runeLustB'))
    .input(item('bloodmagic:ritual_stone'))
    .input(ore('runeLustB'))
    .instability(5)
    .register()

// =============================================
// THAUMCRAFT ASPECT EXTRACTION SYSTEM
// =============================================
// =============================================
// ASPECT PROCESSING FUNCTIONS
// =============================================

/**
 * Safely gets aspects from an item stack
 */
def getItemAspects(itemStack) {
    try {
        def aspects = ThaumcraftApiHelper.getObjectAspects(itemStack)
        return aspects ?: new AspectList()
    } catch (Exception e) {
        println("[ERROR] Failed to get aspects for ${itemStack.displayName}: ${e.message}")
        return new AspectList()
    }
}

/**
 * Generates centrifuge recipes for aspect extraction
 */
def generateAspectRecipes(itemNames, baseDuration = 200, baseEUt = 30) {
    itemNames.each { itemName ->
        try {
            def itemStack = item(itemName)
            if (!itemStack) {
                println("[WARNING] Item not found: ${itemName}")
                return
            }

            def aspects = getItemAspects(itemStack)
            
            if (aspects && !aspects.aspects.isEmpty()) {
                def builder = RecipeMaps.CENTRIFUGE_RECIPES.recipeBuilder()
                    .inputs(itemStack)
                    .duration(baseDuration * aspects.size())
                    .EUt(baseEUt)
                
                aspects.aspects.each { aspect, amount ->
                    try {
                        def fluidName = "aspect_" + aspect.tag.toLowerCase()
                        def fluidStack = fluid(fluidName) * amount
                        
                        if (fluidStack) {
                            builder.fluidOutputs(fluidStack)
                        } else {
                            println("[WARNING] Missing fluid for aspect: ${aspect.name}")
                        }
                    } catch (e) {
                        println("[ERROR] Processing aspect ${aspect.name}: ${e.message}")
                    }
                }
                
                builder.buildAndRegister()
                println("[SUCCESS] Created recipe for ${itemName}")
            } else {
                println("[INFO] No aspects found for ${itemName}")
            }
        } catch (e) {
            println("[CRITICAL] Processing ${itemName}: ${e.message}")
        }
    }
}

// =============================================
// ITEM LIST AND INITIALIZATION
// =============================================

// Valid Thaumcraft 6 items for 1.12.2
def thaumcraftItems = [
    'minecraft:iron_ingot',
    'minecraft:gold_ingot',
    'minecraft:diamond',
    'minecraft:redstone',
    'minecraft:quartz',
    'thaumcraft:quicksilver',
    'thaumcraft:amber',
    'minecraft:ender_pearl',
    'minecraft:blaze_rod',
    'minecraft:emerald'
]

// Generate the recipes
generateAspectRecipes(thaumcraftItems)

println("[INIT] Thaumcraft aspect extraction system loaded")