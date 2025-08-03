#reloadable

recipes.remove(<rpsideas:battlecaster>);
recipes.remove(<rpsideas:gauss_bullet>);
recipes.remove(<rpsideas:keypad>);
recipes.remove(<rpsideas:psi_cuff_key>);
recipes.remove(<rpsideas:psi_cuffs>);
recipes.remove(<rpsideas:optimized_cad_core>);
recipes.remove(<rpsideas:magazine>);
recipes.remove(<rpsideas:twinflow_battery>);
recipes.remove(<rpsideas:shielded_battery>);
recipes.remove(<rpsideas:trigger_sensor>);
recipes.remove(<rpsideas:biotic_sensor>);
recipes.remove(<rpsideas:wide_socket>);
recipes.remove(<psi:vector_ruler>);
recipes.remove(<psi:exosuit_sensor:3>);
recipes.remove(<psi:exosuit_sensor:2>);
recipes.remove(<psi:exosuit_sensor:1>);
recipes.remove(<psi:exosuit_sensor>);
recipes.remove(<psi:spell_drive>);
recipes.remove(<psi:exosuit_controller>);
recipes.remove(<psi:detonator>);
recipes.remove(<psi:spell_bullet:8>);
recipes.remove(<psi:spell_bullet:12>);
recipes.remove(<psi:spell_bullet:6>);
recipes.remove(<psi:spell_bullet>);
recipes.remove(<psi:cad_battery:1>);
recipes.remove(<psi:cad_battery:2>);
recipes.remove(<psi:cad_battery>);
recipes.remove(<psi:cad_socket:3>);
recipes.remove(<psi:cad_socket:4>);
recipes.remove(<psi:cad_socket:2>);
recipes.remove(<psi:cad_socket>);
recipes.remove(<psi:cad_core:4>);
recipes.remove(<psi:cad_core:2>);
recipes.remove(<psi:cad_core:1>);
recipes.remove(<psi:cad_core>);

// adding

recipes.addShaped(<rpsideas:gauss_bullet>, [[null, <ore:craftingToolHardHammer>, null], [<ore:platePsi>, <psi:cad_core:1>, <ore:platePsi>], [null, <ore:springPsi>, null]]);
recipes.addShaped(<rpsideas:battlecaster>, [[<rpsideas:virtual_thread_cad_core>, <ore:circuitUlv>, <rpsideas:virtual_thread_cad_core>], [<ore:toolFile>, <psi:cad_core:1>, <ore:toolWrench>], [<rpsideas:virtual_thread_cad_core>, <ore:circuitUlv>, <rpsideas:virtual_thread_cad_core>]]);
recipes.addShaped(<rpsideas:keypad>, [[<ore:plateObsidian>, <ore:circuitUlv>, <ore:plateObsidian>], [<ore:toolFile>, <psi:cad_core:1>, <ore:toolWrench>], [<ore:plateObsidian>, <ore:circuitUlv>, <ore:plateObsidian>]]);
recipes.addShaped(<rpsideas:psi_cuff_key>, [[<ore:stickLongEbonyPsi>, <psi:spell_drive>, <ore:stickLongEbonyPsi>], [<psi:spell_drive>, <ore:plateIvoryPsi>, <psi:spell_drive>], [<ore:stickLongEbonyPsi>, <ore:craftingToolWrench>, <ore:stickLongEbonyPsi>]]);
recipes.addShaped(<rpsideas:psi_cuffs>, [[<ore:plateEbonyPsi>, <ore:craftingToolHardHammer>, <ore:plateEbonyPsi>], [<ore:stickLongPsi>, <ore:plateEbonyPsi>, <ore:stickLongPsi>], [<ore:springPsi>, <ore:toolWrench>, <ore:springPsi>]]);
recipes.addShaped(<rpsideas:hyperthreaded_cad_core>, [[<ore:stickLongIvoryPsi>, <ore:craftingToolHardHammer>, <ore:gearEbonyPsi>], [<psi:cad_core:4>, <ore:circuitMv>, <psi:cad_core:4>], [<ore:gearEbonyPsi>, <ore:toolWrench>, <ore:stickLongIvoryPsi>]]);
recipes.addShaped(<psi:cad_core:1>, [[<ore:stickLongIvoryPsi>, <ore:craftingToolHardHammer>, <ore:stickLongIvoryPsi>], [<psi:cad_core>, <ore:circuitUlv>, <psi:cad_core>], [<ore:stickLongIvoryPsi>, <ore:toolWrench>, <ore:stickLongIvoryPsi>]]);
recipes.addShaped(<rpsideas:optimized_cad_core>, [[<ore:stickLongPsi>, <ore:craftingToolHardHammer>, <ore:stickLongPsi>], [<psi:cad_core>, <ore:circuitUlv>, <psi:cad_core>], [<ore:stickLongPsi>, <ore:toolWrench>, <ore:stickLongPsi>]]);
recipes.addShaped(<rpsideas:magazine>, [[<ore:springEbonyPsi>, <psi:spell_drive>, <ore:toolFile>], [<ore:gearEbonyPsi>, <psi:cad_socket>, <ore:gearEbonyPsi>], [<ore:craftingToolHardHammer>, <psi:spell_drive>, <ore:springEbonyPsi>]]);
recipes.addShaped(<rpsideas:twinflow_battery>, [[<ore:stickLongIvoryPsi>, <ore:craftingToolFile>, <ore:stickLongIvoryPsi>], [<psi:cad_battery>, <psi:cad_battery:2>, <psi:cad_battery>], [<ore:stickLongIvoryPsi>, <ore:craftingToolHardHammer>, <ore:stickLongIvoryPsi>]]);
recipes.addShaped(<rpsideas:shielded_battery>, [[<ore:stickLongEbonyPsi>, <ore:craftingToolFile>, <ore:stickLongEbonyPsi>], [<psi:cad_battery>, <psi:cad_battery:2>, <psi:cad_battery>], [<ore:stickLongEbonyPsi>, <ore:craftingToolHardHammer>, <ore:stickLongEbonyPsi>]]);
recipes.addShaped(<rpsideas:biotic_sensor>, [[<ore:screwTerrasteel>, <psi:exosuit_sensor:3>], [<ore:craftingToolHardHammer>, <ore:runeLustB>]]);
recipes.addShaped(<rpsideas:trigger_sensor>, [[<ore:stickArcanum>, <psi:exosuit_sensor:3>], [<ore:craftingToolHardHammer>, <ore:dustAnySmokeless>]]);
recipes.addShaped(<rpsideas:flash_ring>, [[<ore:toolFile>, <ore:plateEbonyPsi>, <ore:platePsi>], [<ore:stickLongEbonyPsi>, <ore:gemFlawlessEmerald>, <ore:stickLongEbonyPsi>], [<ore:platePsi>, <ore:plateEbonyPsi>, <ore:craftingToolHardHammer>]]);
recipes.addShaped(<rpsideas:wide_socket>, [[<ore:toolFile>, <ore:stickArcanum>, <psi:cad_socket>], [<ore:stickArcanum>, <psi:cad_socket>, <ore:stickArcanum>], [<psi:cad_socket>, <ore:stickArcanum>, <ore:craftingToolHardHammer>]]);
recipes.addShaped(<psi:vector_ruler>, [[null, <ore:craftingToolHardHammer>, <ore:gemPsi>], [null, <ore:stickArcanum>, <ore:toolWrench>], [<ore:stickArcanum>, null, null]]);
recipes.addShaped(<psi:exosuit_sensor:3>, [[<ore:craftingPiston>, <ore:plateEbonyPsi>, <ore:craftingPiston>], [<ore:platePsi>, <ore:craftingToolHardHammer>, <ore:platePsi>], [<ore:stickArcanum>, <ore:toolFile>, <ore:stickArcanum>]]);
recipes.addShaped(<psi:exosuit_sensor:2>, [[<ore:dustNetherrack>, <ore:plateEbonyPsi>, <ore:dustNetherrack>], [<ore:platePsi>, <ore:craftingToolHardHammer>, <ore:platePsi>], [<ore:stickArcanum>, <ore:toolFile>, <ore:stickArcanum>]]);
recipes.addShaped(<psi:exosuit_sensor:1>, [[<ore:crystalsPrismarine>, <ore:plateEbonyPsi>, <ore:crystalsPrismarine>], [<ore:platePsi>, <ore:craftingToolHardHammer>, <ore:platePsi>], [<ore:stickArcanum>, <ore:toolFile>, <ore:stickArcanum>]]);
recipes.addShaped(<psi:exosuit_sensor>, [[<ore:dustGlowstone>, <ore:plateEbonyPsi>, <ore:dustGlowstone>], [<ore:platePsi>, <ore:craftingToolHardHammer>, <ore:platePsi>], [<ore:stickArcanum>, <ore:toolFile>, <ore:stickArcanum>]]);
recipes.addShaped(<psi:exosuit_sensor>, [[<ore:boltManasteel>, <ore:plateEbonyPsi>, <ore:boltManasteel>], [<ore:platePsi>, <ore:craftingToolHardHammer>, <ore:platePsi>], [<ore:stickArcanum>, <ore:toolFile>, <ore:stickArcanum>]]);
recipes.addShaped(<psi:exosuit_controller>, [[<ore:boltManasteel>, <ore:plateEbonyPsi>, <ore:boltManasteel>], [<ore:platePsi>, <ore:craftingToolHardHammer>, <ore:platePsi>], [<ore:stickArcanum>, <ore:toolFile>, <ore:stickArcanum>]]);
recipes.addShaped(<psi:detonator>, [[<ore:boltManasteel>, <ore:plateObsidian>, <ore:boltManasteel>], [<ore:platePsi>, <ore:craftingToolHardHammer>, <ore:platePsi>], [<ore:stickArcanum>, <ore:toolFile>, <ore:stickArcanum>]]);
recipes.addShaped(<psi:spell_drive>, [[<ore:stickLongPsi>, <ore:plateObsidian>, <ore:stickLongPsi>], [<ore:platePsi>, <ore:craftingToolHardHammer>, <ore:platePsi>], [<ore:stickLongPsi>, <ore:plateObsidian>, <ore:stickLongPsi>]]);
recipes.addShaped(<psi:spell_bullet:12>, [[null, <ore:craftingToolHardHammer>, null], [<ore:springSmallCopper>, <ore:platePsi>, <ore:springSmallCopper>], [null, <ore:stickManasteel>, null]]);
recipes.addShaped(<psi:spell_bullet:8>, [[<ore:dustAnySmokeless>, <ore:craftingToolHardHammer>, <ore:dustAnySmokeless>], [<ore:dustAnySmokeless>, <ore:platePsi>, <ore:dustAnySmokeless>], [<ore:dustAnySmokeless>, <gregtech:meta_item_1:517>, <ore:dustAnySmokeless>]]);
recipes.addShaped(<psi:spell_bullet:6>, [[null, <ore:craftingToolHardHammer>, null], [<ore:boltManasteel>, <ore:platePsi>, <ore:boltManasteel>], [null, <gregtech:meta_item_1:517>, null]]);
recipes.addShaped(<psi:spell_bullet>, [[<ore:craftingToolHardHammer>], [<ore:platePsi>]]);
recipes.addShaped(<psi:cad_battery:2>, [[<psi:cad_battery:1>, <ore:platePsi>, <psi:cad_battery:1>], [<psi:cad_battery:1>, <ore:craftingToolHardHammer>, <psi:cad_battery:1>], [<psi:cad_battery:1>, <ore:platePsi>, <psi:cad_battery:1>]]);
recipes.addShaped(<psi:cad_battery:1>, [[<ore:gemPsi>, <ore:platePsi>, <ore:gemPsi>], [<ore:dustArcanum>, <ore:craftingToolHardHammer>, <ore:dustArcanum>], [<ore:gemPsi>, <ore:platePsi>, <ore:gemPsi>]]);
recipes.addShaped(<psi:cad_battery>, [[<ore:screwDawnstone>, <ore:platePsi>, <ore:screwDawnstone>], [<ore:dustPsi>, <ore:craftingToolHardHammer>, <ore:dustPsi>], [<ore:screwDawnstone>, <ore:platePsi>, <ore:screwDawnstone>]]);
recipes.addShaped(<psi:cad_socket:4>, [[<ore:craftingToolFile>, <ore:plateIvoryPsi>, <ore:gearIvoryPsi>], [<ore:plateIvoryPsi>, <ore:craftingToolHardHammer>, <ore:stickMythril>], [<ore:springIvoryPsi>, <ore:stickMythril>, <ore:boltMythril>]]);
recipes.addShaped(<psi:cad_socket:3>, [[<ore:craftingToolFile>, <ore:platePsi>, <ore:gearPsi>], [<ore:platePsi>, <ore:craftingToolHardHammer>, <ore:stickTerrasteel>], [<ore:springPsi>, <ore:stickTerrasteel>, <ore:screwTerrasteel>]]);
recipes.addShaped(<psi:cad_socket:2>, [[<ore:craftingToolFile>, <ore:platePsi>, <ore:gearPsi>], [<ore:platePsi>, <ore:craftingToolHardHammer>, <ore:stickArcanum>], [<ore:springPsi>, <ore:stickArcanum>, <ore:stickArcanum>]]);
recipes.addShaped(<psi:cad_socket>, [[<ore:craftingToolFile>, <ore:platePsi>, <ore:gearPsi>], [<ore:platePsi>, <ore:craftingToolHardHammer>, <ore:boltDawnstone>], [<ore:springPsi>, <ore:boltDawnstone>, <ore:stickPsi>]]);
recipes.addShaped(<psi:cad_core:4>, [[<ore:plateIvoryPsi>, <ore:craftingToolHardHammer>, <ore:plateEbonyPsi>], [<ore:platePidginmetal>, <psi:cad_core:2>, <ore:platePidginmetal>], [<ore:plateEbonyPsi>, <ore:craftingToolFile>, <ore:plateIvoryPsi>]]);
recipes.addShaped(<psi:cad_core:2>, [[<ore:platePsi>, <ore:craftingToolHardHammer>, <ore:platePsi>], [<ore:dustTerrasteel>, <psi:cad_core:1>, <ore:dustTerrasteel>], [<ore:platePsi>, <ore:craftingToolFile>, <ore:platePsi>]]);
recipes.addShaped(<psi:cad_core:1>, [[<ore:platePsi>, <ore:craftingToolHardHammer>, <ore:platePsi>], [<ore:dustGraniteBlack>, <psi:cad_core>, <ore:dustGraniteBlack>], [<ore:platePsi>, <ore:craftingToolFile>, <ore:platePsi>]]);
recipes.addShaped(<psi:cad_core>, [[<ore:plateObsidian>, <ore:craftingToolHardHammer>, <ore:plateObsidian>], [<ore:dustGraniteBlack>, <ore:dustPsi>, <ore:dustGraniteBlack>], [<ore:plateObsidian>, <ore:craftingToolFile>, <ore:plateObsidian>]]);

// badoingadoing

// misc, for edecor xd

recipes.addShaped(<engineersdecor:small_milking_machine>, [[<ore:screwSteel>, <ore:craftingToolHardHammer>, <ore:screwSteel>], [<ore:plateTreatedWood>, <gtwp:gtwp_metal_casing>, <ore:plateTreatedWood>], [<ore:toolWrench>, <ore:gearNickelSteel>, <ore:toolFile>]]);
recipes.addShaped(<engineersdecor:small_fluid_funnel>, [[null, <hbm:steel_grate>, null], [<ore:craftingToolHardHammer>, <ore:toolWrench>, <ore:toolFile>], [null, <ore:plateTypeMetal>, null]]);
recipes.addShaped(<engineersdecor:small_mineral_smelter>, [[<ore:plateNickelSteel>, <ore:springMonel>, <ore:plateNickelSteel>], [<ore:craftingToolFile>, <gregtech:machine:986>, <ore:craftingToolHardHammer>], [<ore:plateNickelSteel>, <ore:springMonel>, <ore:plateNickelSteel>]]);
recipes.addShaped(<engineersdecor:small_tree_cutter>, [[null, <ore:plateSteel>, null], [<ore:toolHeadBuzzSawIron>, <ore:frameGtSteel>, <ore:toolHeadBuzzSawIron>], [<ore:craftingToolHardHammer>, <gregtech:meta_item_1:127>, <ore:toolFile>]]);
recipes.addShaped(<engineersdecor:small_block_breaker>, [[<ore:toolScrewdriver>, <ore:plateManganeseSteel>, <ore:toolWrench>], [<ore:plateManganeseSteel>, <gregtech:machine:19>, <ore:plateManganeseSteel>], [<ore:toolFile>, <ore:plateManganeseSteel>, <ore:craftingToolHardHammer>]]);
recipes.addShaped(<engineersdecor:factory_placer>, [[<ore:toolScrewdriver>, <ore:plateManganeseSteel>, <ore:toolWrench>], [<ore:plateManganeseSteel>, <minecraft:dispenser>, <ore:plateManganeseSteel>], [<ore:toolFile>, <ore:plateManganeseSteel>, <ore:craftingToolHardHammer>]]);
recipes.addShaped(<engineersdecor:factory_dropper>, [[<ore:toolScrewdriver>, <ore:plateManganeseSteel>, <ore:toolWrench>], [<ore:plateManganeseSteel>, <minecraft:dropper>, <ore:plateManganeseSteel>], [<ore:toolFile>, <ore:plateManganeseSteel>, <ore:craftingToolHardHammer>]]);
recipes.addShaped(<engineersdecor:factory_hopper>, [[<ore:toolScrewdriver>, <ore:plateManganeseSteel>, <ore:toolWrench>], [<ore:plateManganeseSteel>, <ore:hopper>, <ore:plateManganeseSteel>], [<ore:toolFile>, <ore:plateManganeseSteel>, <ore:craftingToolHardHammer>]]);
recipes.addShaped(<engineersdecor:small_electrical_furnace>, [[null, <ore:plateManganeseSteel>, null], [<ore:craftingToolHardHammer>, <engineersdecor:small_lab_furnace>, <ore:toolWrench>], [null, <ore:plateManganeseSteel>, null]]);
recipes.addShaped(<engineersdecor:small_lab_furnace>, [[<ore:plateManganeseSteel>, <gregtech:meta_item_1:127>, <ore:plateManganeseSteel>], [<ore:craftingToolWrench>, <ore:craftingFurnace>, <ore:craftingToolHardHammer>], [<ore:plateManganeseSteel>, <gregtech:meta_item_1:127>, <ore:plateManganeseSteel>]]);
recipes.addShaped(<engineersdecor:labeled_crate>, [[<ore:plateTreatedWood>, <ore:craftingToolHardHammer>, <ore:plateTreatedWood>], [<ore:stickIron>, <gtwp:gtwp_metal_casing>, <ore:stickIron>], [<ore:plateTreatedWood>, <ore:craftingToolFile>, <ore:plateTreatedWood>]]);

recipes.remove(<engineersdecor:small_milking_machine>);
recipes.remove(<engineersdecor:passive_fluid_accumulator>);
recipes.remove(<engineersdecor:small_fluid_funnel>);
recipes.remove(<engineersdecor:straight_pipe_valve_redstone_analog>);
recipes.remove(<engineersdecor:straight_pipe_valve_redstone>);
recipes.remove(<engineersdecor:straight_pipe_valve>);
recipes.remove(<engineersdecor:small_mineral_smelter>);
recipes.remove(<engineersdecor:small_solar_panel>);
recipes.remove(<engineersdecor:small_waste_incinerator>);
recipes.remove(<engineersdecor:small_tree_cutter>);
recipes.remove(<engineersdecor:factory_dropper>);
recipes.remove(<engineersdecor:small_block_breaker>);
recipes.remove(<engineersdecor:factory_placer>);
recipes.remove(<engineersdecor:factory_hopper>);
recipes.remove(<engineersdecor:small_electrical_furnace>);
recipes.remove(<engineersdecor:small_lab_furnace>);
recipes.remove(<engineersdecor:labeled_crate>);
recipes.remove(<engineersdecor:treated_wood_crafting_table>);