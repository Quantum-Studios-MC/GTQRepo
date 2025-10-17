

recipemap('assembler').recipeBuilder()
        .inputs(ore('wireFineAluminium') * 3)
        .inputs(ore('plateSteel'))
        .inputs(ore('paneGlass'))
        .outputs(item('hbm:fuse'))
        .duration(120).EUt(4).buildAndRegister()


recipemap('assembler').recipeBuilder()
        .inputs(ore('wireFineCupronickel') * 3)
        .inputs(ore('wireFineAluminium') * 2)
        .inputs(ore('plateCopper'))
        .inputs(ore('dustQuartz'))
        .outputs(item('hbm:thermo_element'))
        .duration(40).EUt(4).buildAndRegister()

recipemap('canner').recipeBuilder()
        .inputs(item('gregtech:machine', 1625))
        .inputs(ore('dustLithium') * 16)
        .outputs(item('hbm:part_lithium') * 4)
        .duration(120).EUt(8).buildAndRegister()

recipemap('canner').recipeBuilder()
        .inputs(item('gregtech:machine', 1625))
        .inputs(ore('dustCarbon') * 16)
        .outputs(item('hbm:part_carbon') * 4)
        .duration(120).EUt(8).buildAndRegister()

recipemap('canner').recipeBuilder()
        .inputs(item('gregtech:machine', 1625))
        .inputs(ore('dustBeryllium') * 16)
        .outputs(item('hbm:part_beryllium') * 4)
        .duration(120).EUt(8).buildAndRegister()

recipemap('canner').recipeBuilder()
        .inputs(item('gregtech:machine', 1625))
        .inputs(ore('dustCopper') * 16)
        .outputs(item('hbm:part_copper') * 4)
        .duration(120).EUt(8).buildAndRegister()

recipemap('canner').recipeBuilder()
        .inputs(item('gregtech:machine', 1625))
        .inputs(ore('dustPlutonium') * 16)
        .outputs(item('hbm:part_plutonium') * 4)
        .duration(120).EUt(8).buildAndRegister()

recipemap('assembler').recipeBuilder()
        .inputs(ore('plateSteel') * 64)
        .inputs(ore('plateBlackSteel') * 64)
        .inputs(ore('plateStainlesSteel') * 64)
        .inputs(ore('shellSteel') * 3)
        .inputs(item('hbm:thruster_large') * 3)
        .outputs(item('hbm:missile_carrier'))
        .duration(1800).EUt(510).buildAndRegister()

recipemap('assembler').recipeBuilder()
        .inputs(ore('dustSmallGunpowder'))
        .inputs(ore('plateIron'))
        .outputs(item('hbm:primer_357') * 8)
        .duration(60).EUt(8).buildAndRegister()

recipemap('assembler').recipeBuilder()
        .inputs(ore('dustGunpowder'))
        .inputs(ore('plateIron'))
        .outputs(item('hbm:primer_44') * 8)
        .duration(60).EUt(8).buildAndRegister()


recipemap('assembler').recipeBuilder()
        .inputs(item('hbm:circuit', 8) * 2)
        .inputs(ore('shellSteel') * 6)
        .inputs(item('hbm:thruster_small') * 3)
        .outputs(item('hbm:missile_assembly'))
        .duration(240).EUt(120).buildAndRegister()




recipemap('assembler').recipeBuilder()
        .inputs(item('hbm:reinforced_brick') * 8)
        .fluidInputs(fluid('aluminium') * 144)
        .outputs(item('hbm:brick_compound') * 4)
        .duration(80).EUt(60).buildAndRegister()

recipemap('assembler').recipeBuilder()
        .inputs(item('hbm:reinforced_brick') * 8)
        .fluidInputs(fluid('tungsten') * 72)
        .outputs(item('hbm:brick_compound') * 8)
        .duration(40).EUt(30).buildAndRegister()

recipemap('assembler').recipeBuilder()
        .inputs(ore('shellSteel') * 3)
        .outputs(item('hbm:deco_pipe') * 6)
        .duration(120).EUt(8).buildAndRegister()

recipemap('assembler').recipeBuilder()
        .inputs(item('hbm:deco_pipe') * 4)
        .outputs(item('hbm:deco_pipe_quad') * 4)
        .duration(120).EUt(8).buildAndRegister()
        
recipemap('assembler').recipeBuilder()
        .inputs(ore('stickSteel') * 3)
        .outputs(item('hbm:steel_scaffold') * 8)
        .duration(120).EUt(8).buildAndRegister()
                
recipemap('assembler').recipeBuilder()
        .inputs(ore('stickSteel') * 3)
        .outputs(item('hbm:steel_scaffold') * 8)
        .duration(120).EUt(8).buildAndRegister()
                
recipemap('chemical_reactor').recipeBuilder()
        .inputs(ore('ingotRubber') * 9)
        .fluidInputs(fluid('glue') * 72)
        .outputs(item('hbm:plate_polymer'))
        .duration(40).EUt(8).buildAndRegister()
                
recipemap('chemical_reactor').recipeBuilder()
        .inputs(ore('ingotStyreneButadieneRubber') * 3)
        .fluidInputs(fluid('glue') * 72)
        .outputs(item('hbm:plate_polymer'))
        .duration(40).EUt(8).buildAndRegister()

                
recipemap('chemical_reactor').recipeBuilder()
        .inputs(ore('ingotSiliconeRubber'))
        .fluidInputs(fluid('glue') * 72)
        .outputs(item('hbm:plate_polymer'))
        .duration(40).EUt(8).buildAndRegister()

recipemap('chemical_reactor').recipeBuilder()
        .inputs(ore('ingotPolybenzimidazole'))
        .fluidInputs(fluid('glue') * 72)
        .outputs(item('hbm:plate_polymer') * 9)
        .duration(40).EUt(8).buildAndRegister()

recipemap('assembler').recipeBuilder()
        .inputs(item('hbm:thruster_large'))
        .inputs(ore('shellTitanium') * 3)
        .inputs(item('hbm:circuit') * 6)
        .inputs(ore('plateDesh') * 9)
        .inputs(item('hbm:photo_panel') * 24)
        .fluidInputs(fluid('soldering_alloy') * 72)
        .outputs(item('hbm:sat_base'))
        .duration(1200).EUt(510).buildAndRegister()


recipemap('assembler').recipeBuilder()
        .inputs(item('hbm:circuit', 6) * 9)
        .inputs(ore('plateDesh') * 3)
        .inputs(ore('plateSaturnite') * 2)
        .inputs(ore('lensDiamond'))
        .fluidInputs(fluid('red_alloy') * 72)
        .outputs(item('hbm:sat_head_mapper'))
        .duration(600).EUt(120).buildAndRegister()

recipemap('assembler').recipeBuilder()
        .inputs(item('hbm:sat_base'))
        .inputs(ore('plateDesh') * 24)
        .inputs(ore('plateSaturnite') * 12)
        .inputs(ore('toolHeadDrillTitanium'))
        .inputs(item('gregtech:meta_item_1', 711).withNbt(['GT.PartStats': ['Material': 'gregtech:vanadium_steel']]))
        .inputs(item('gregtech:meta_item_1', 332) * 8)
        .fluidInputs(fluid('red_alloy') * 1008)
        .outputs(item('hbm:sat_miner'))
        .duration(600).EUt(120).buildAndRegister()

recipemap('mixer').recipeBuilder()
        .inputs(ore('dustRedstone'))
        .inputs(ore('dustAnnealedCopper'))
        .outputs(metaitem('dustMingrade'))
        .duration(60).EUt(120).buildAndRegister()

// RBMK TIME!!!!!!!!!!!!!!!!!!!

// i did all rbmk in crt brauh