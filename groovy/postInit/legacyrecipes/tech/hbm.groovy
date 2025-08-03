// MV (all of them)

import gregtech.api.metatileentity.multiblock.CleanroomType

// Chemical reactor recipe for kerosene
recipemap('chemical_reactor').recipeBuilder()
        .inputs(ore('dustSulfur') * 6)
        .fluidInputs(fluid('steam') * 500 )
        .fluidInputs(fluid('diesel') * 120 )
        .fluidOutputs(fluid('kerosene') * 240 )
        .duration(400).EUt(120).buildAndRegister()

// Assembler recipe for HBM generic small warhead
recipemap('assembler').recipeBuilder()
        .inputs(item('gregtech:meta_item_1', 498) * 2)
        .inputs(ore('plateDenseAluminium') * 2)
        .inputs(ore('plateSteel') * 2)
        .fluidInputs(fluid('steel') * 120)
        .outputs(item('hbm:warhead_generic_small'))
        .duration(200).EUt(120).buildAndRegister()

// Assembler recipe for HBM launch pad
recipemap('assembler').recipeBuilder()
        .inputs(ore('wireFineAluminium') * 2)
        .inputs(ore('frameGtBlackSteel') * 12)
        .inputs(ore('plateSteel') * 24)
        .inputs(ore('circuitMv') * 4)
        .inputs(ore('componentDiode') * 4)
        .fluidInputs(fluid('steel') * 500)
        .outputs(item('hbm:launch_pad'))
        .duration(200).EUt(120).buildAndRegister()

// Assembler recipe for HBM small thruster
recipemap('assembler').recipeBuilder()
        .inputs(ore('plateSteel') * 2)
        .inputs(ore('plateAluminium') * 12)
        .inputs(item('gregtech:meta_item_1', 81))
        .inputs(ore('componentResistor') * 1)
        .inputs(ore('componentDiode') * 4)
        .fluidInputs(fluid('steel') * 200)
        .outputs(item('hbm:thruster_small'))
        .duration(200).EUt(120).buildAndRegister()

// Assembler recipe for HBM small fuel tank
recipemap('assembler').recipeBuilder()
        .inputs(ore('plateSteel') * 2)
        .inputs(ore('plateAluminium') * 12)
        .inputs(item('gregtech:meta_item_1', 81))
        .fluidInputs(fluid('steel') * 200)
        .outputs(item('hbm:fuel_tank_small') * 2)
        .duration(200).EUt(120).buildAndRegister()

// Assembler recipe for HBM small incendiary warhead
recipemap('assembler').recipeBuilder()
        .inputs(item('hbm:warhead_generic_medium'))
        .inputs(ore('plateDenseAluminium') * 2)
        .inputs(ore('dustRedPhosphorus') * 2)
        .fluidInputs(fluid('toluene') * 120)
        .outputs(item('hbm:warhead_incendiary_small'))
        .duration(200).EUt(120).buildAndRegister()

// Assembler recipe for HBM small cluster warhead
recipemap('assembler').recipeBuilder()
        .inputs(item('hbm:warhead_generic_medium'))
        .inputs(item('hbm:pellet_cluster') * 2)
        .fluidInputs(fluid('steel') * 120)
        .outputs(item('hbm:warhead_cluster_small'))
        .duration(200).EUt(120).buildAndRegister()

// Assembler recipe for HBM cluster pellet
recipemap('assembler').recipeBuilder()
        .inputs(item('minecraft:tnt'))
        .inputs(ore('plateSteel') * 2)
        .fluidInputs(fluid('steel') * 120)
        .outputs(item('hbm:pellet_cluster') * 8)
        .duration(200).EUt(120).buildAndRegister()

// Assembler recipe for HBM small buster warhead
recipemap('assembler').recipeBuilder()
        .inputs(item('hbm:warhead_generic_medium'))
        .inputs(item('hbm:det_cord') * 8)
        .fluidInputs(fluid('aluminium') * 120)
        .outputs(item('hbm:warhead_buster_small'))
        .duration(200).EUt(120).buildAndRegister()

// MV.
recipemap('assembler').recipeBuilder()
        .inputs(ore('plateAluminium') * 2)
        .inputs(ore('wireFineCopper') * 4)
        .inputs(item('gregtech:meta_item_1', 521))
        .inputs(item('hbm:circuit_aluminium') * 2)
        .fluidInputs(fluid('tin') * 120)
        .outputs(item('hbm:circuit_copper') * 2)
        .duration(200).EUt(120).buildAndRegister()
        
// Centrifuge recipe for extracting mercury from redstone ore, 5% chance increases 10 by tier.
// LV.
recipemap('centrifuge').recipeBuilder()
        .inputs(ore('oreRedstone') * 2)
        .chancedOutput(item('hbm:nugget', 60), 500, 1000)
        .duration(200).EUt(32).buildAndRegister()
// EBF-Related Recipes

// MV
recipemap('electric_blast_furnace').recipeBuilder()
        .inputs(ore('dustCobalt') * 6)
        .inputs(ore('ingotSteel') * 6)
        .fluidInputs(fluid('oxygen') * 250 )
        .outputs(item('hbm:ingot', 32) * 2)
        .property("temperature", 1200)
        .duration(400).EUt(140).buildAndRegister()

// AltRecipe for HBM HSS, HV.
recipemap('electric_blast_furnace').recipeBuilder()
        .inputs(ore('dustGraphene') * 2)
        .inputs(ore('ingotSteel') * 6)
        .fluidInputs(fluid('tungsten') * 250 )
        .outputs(item('hbm:ingot', 32) * 2)
        .property("temperature", 2700)
        .duration(400).EUt(470).buildAndRegister()

recipemap('mixer').recipeBuilder()
        .inputs(ore('dustRedstone') * 1)
        .inputs(ore('dustStainlessSteel') * 1)
        .inputs(ore('dustAnnealedCopper') * 1)
        .outputs(metaitem('dustAdvancedAlloy') * 1)
        .duration(420).EUt(120).buildAndRegister()

// Idiot, i forgot the flroping missile comps :cry:

recipemap('assembler').recipeBuilder()
        .inputs(item('gregtech:meta_item_1', 460) * 2)
        .inputs(ore('plateDenseStainlessSteel') * 2)
        .inputs(ore('plateSteel') * 12)
        .inputs(ore('screwStainlessSteel') * 2)
        .fluidInputs(fluid('silicone_rubber') * 120)
        .outputs(item('hbm:warhead_generic_medium'))
        .duration(200).EUt(500).buildAndRegister()

recipemap('assembler').recipeBuilder()
        .inputs(ore('plateSteel') * 2)
        .inputs(ore('plateStainlessSteel') * 4)
        .inputs(ore('platePolyethylene') * 4)
        .inputs(ore('componentResistor') * 1)
        .inputs(ore('circuitLv') * 4)
        .fluidInputs(fluid('stainless_steel') * 200)
        .outputs(item('hbm:thruster_medium'))
        .duration(200).EUt(500).buildAndRegister()

recipemap('assembler').recipeBuilder()
        .inputs(ore('plateStainlessSteel') * 2)
        .inputs(ore('plateBlackSteel') * 4)
        .inputs(ore('platePolyethylene') * 4)
        .inputs(ore('componentResistor') * 1)
        .inputs(ore('circuitLv') * 4)
        .fluidInputs(fluid('stainless_steel') * 200)
        .outputs(item('hbm:fuel_tank_medium'))
        .duration(200).EUt(500).buildAndRegister()

recipemap('assembler').recipeBuilder()
        .inputs(item('hbm:warhead_generic_medium'))
        .inputs(ore('plateDenseAluminium') * 2)
        .inputs(ore('dustRedPhosphorus') * 2)
        .fluidInputs(fluid('glyceryl_trinitrate') * 120)
        .outputs(item('hbm:warhead_incendiary_medium'))
        .duration(200).EUt(500).buildAndRegister()

recipemap('assembler').recipeBuilder()
        .inputs(item('hbm:warhead_generic_medium'))
        .inputs(item('hbm:det_charge') * 4)
        .fluidInputs(fluid('stainless_steel') * 120)
        .outputs(item('hbm:warhead_buster_medium'))
        .duration(200).EUt(500).buildAndRegister()

recipemap('assembler').recipeBuilder()
        .inputs(item('hbm:warhead_generic_medium'))
        .inputs(item('hbm:det_cord') * 2)
        .inputs(item('hbm:pellet_cluster') * 4)
        .fluidInputs(fluid('stainless_steel') * 120)
        .outputs(item('hbm:warhead_cluster_medium'))
        .duration(200).EUt(500).buildAndRegister()

recipemap('assembler').recipeBuilder()
        .inputs(ore('circuitHv'))
        .inputs(ore('wireFineAluminium') * 2)
        .fluidInputs(fluid('soldering_alloy') * 120)
        .outputs(item('hbm:circuit_red_copper'))
        .duration(200).EUt(500).buildAndRegister()

recipemap('assembler').recipeBuilder()
        .inputs(ore('circuitHv'))
        .inputs(ore('wireFineElectrum') * 2)
        .fluidInputs(fluid('soldering_alloy') * 120)
        .outputs(item('hbm:circuit_gold'))
        .duration(200).EUt(500).buildAndRegister()

// fusion recipes for schrab
recipemap('fusion_reactor').recipeBuilder()
        .fluidInputs(fluid('germanium_72') * 250)
        .fluidInputs(fluid('plutonium') * 500 )
        .fluidOutputs(fluid('schrabidium') * 750)
        .duration(400).EUt(62000).buildAndRegister()

// Coolant.

recipemap('chemical_reactor').recipeBuilder()
        .inputs(ore('dustSaltpeter'))
        .inputs(ore('rodBlizz') * 4)
        .fluidInputs(fluid('distilled_water') * 120 )
        .fluidInputs(fluid('water') * 120 )
        .fluidOutputs(fluid('coolant') * 40 )
        .duration(400).EUt(510).buildAndRegister()

// cursed IC recipe for schrab
recipemap('implosion_compressor').recipeBuilder()
        .inputs(ore('dustUranium') * 24)
        .inputs(ore('dustSteel') * 2)
        .outputs(metaitem('nuggetSchrabidium'))
        .property("explosives", item('hbm:missile_generic'))
        .duration(400).EUt(120).buildAndRegister()

// H202, why does greg not have this>??!?!?!?

recipemap('chemical_reactor').recipeBuilder()
        .fluidInputs(fluid('hydrogen') * 200 )
        .fluidInputs(fluid('oxygen') * 200 )
        .fluidOutputs(fluid('peroxide') * 300 )
        .duration(400).EUt(32).buildAndRegister()

        recipemap('chemical_reactor').recipeBuilder()
        .inputs(ore('dustBoneAsh') * 3 )
        .fluidInputs(fluid('oxygen') * 1000 )
        .chancedOutput(metaitem('dustRedPhosphorus'), 10, 20)
        .duration(1200).EUt(120).buildAndRegister()

recipemap('chemical_reactor').recipeBuilder()
 .fluidInputs(fluid('biomass') * 100)
 .inputs(ore('dustRedPhosphorus'))
 .fluidOutputs(fluid('bio_resin') * 100)
 .duration(1200).EUt(120)