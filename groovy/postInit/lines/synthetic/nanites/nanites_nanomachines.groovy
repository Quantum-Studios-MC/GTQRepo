
import gregtech.api.GTValues;

recipemap('large_chemical_reactor').recipeBuilder()
    .fluidInputs(fluid('coal_tar') * 1000)
    .fluidInputs(fluid('benzene') * 1000)
    .fluidOutputs(fluid('fluorene') * 1000)
    .duration(400)
    .EUt(GTValues.VA[GTValues.LV])
    .buildAndRegister()

recipemap('large_chemical_reactor').recipeBuilder()
    .fluidInputs(fluid('oil') * 1000)
    .inputs(ore('dustFluorene') * 4)
    .fluidOutputs(fluid('polyfluorene_solvent') * 1000)
    .duration(400)
    .EUt(GTValues.VA[GTValues.MV])
    .buildAndRegister()

recipemap('large_chemical_reactor').recipeBuilder()
    .inputs(ore('dustWood') * 4)
    .fluidInputs(fluid('gelatin_mixture') * 1000)
    .fluidOutputs(fluid('bio_gel') * 2000)
    .duration(480)
    .EUt(GTValues.VA[GTValues.HV])
    .buildAndRegister()

recipemap('large_chemical_reactor').recipeBuilder()
    .inputs(ore('dustNaquadahAlloy'))
    .fluidInputs(fluid('liquid_helium') * 1000)
    .fluidInputs(fluid('poor_neutronium') * 1000)
    .fluidOutputs(fluid('naqneutron_flux') * 500)
    .duration(600)
    .EUt(GTValues.VA[GTValues.IV])
    .buildAndRegister()

// nanotubes.


recipemap('assembler').recipeBuilder()
    .inputs(ore('dustIron') * 4)
    .inputs(ore('dustPlatinum'))
    .inputs(item('gregtech:meta_item_1', 499) * 16)
    .outputs(metaitem('dustIronNanocatalyst') * 4)
    .duration(200)
    .EUt(GTValues.VA[GTValues.IV])
    .buildAndRegister()

recipemap('electric_blast_furnace').recipeBuilder()
    .fluidInputs(fluid('coal_gas') * 1000)
    .inputs(ore('dustIronNanocatalyst') * 2)
    .property("temperature", 2001)
    .fluidOutputs(fluid('carbon_nanotube_suspension') * 1000)
    .duration(1000)
    .EUt(GTValues.VA[GTValues.HV])
    .buildAndRegister()

recipemap('fluid_solidifier').recipeBuilder()
    .fluidInputs(fluid('carbon_nanotube_suspension') * 1000)
    .outputs(metaitem('dustCarbonNanotube'))
    .duration(12000)
    .EUt(GTValues.VA[GTValues.EV])
    .buildAndRegister()

// gel

// Step 1: Intermediate gel creation
recipemap('chemical_reactor').recipeBuilder()
    .fluidInputs(fluid('nanotube_suspension') * 500)
    .fluidInputs(fluid('naqneutron_flux') * 500)
    .fluidInputs(fluid('gtfo_gelatin_solution') * 500)
    .fluidOutputs(fluid('intermediate_gel') * 500)
    .duration(600)
    .EUt(GTValues.VA[GTValues.EV])
    .buildAndRegister()

recipemap('chemical_reactor').recipeBuilder()
    .fluidInputs(fluid('intermediate_gel') * 500)
    .fluidInputs(fluid('bio_gel') * 500)
    .fluidOutputs(fluid('smart_gel_matrix') * 1000)
    .duration(800)
    .EUt(GTValues.VA[GTValues.EV])
    .buildAndRegister()

// poor neutronium

recipemap('large_chemical_reactor').recipeBuilder()
    .fluidInputs(fluid('starmetal') * 500)
    .inputs(item('gregtech:meta_item_1', 282))
    .fluidOutputs(fluid('poor_neutronium') * 10)
    .duration(800)
    .EUt(GTValues.VA[GTValues.EV])
    .buildAndRegister()

// nanite shell!

recipemap('assembly_line').recipeBuilder()
        .stationResearch(b -> b.researchStack(item('srparasites:living_core')).CWUt(12))
        .inputs(ore('circuitIv') * 16)
        .inputs(ore('screwTungstenSteel') * 64)
        .inputs(ore('dustBioSuperpolymer') * 64)
        .inputs(item('gregtech:meta_item_1', 532) * 16)
        .inputs(item('gregtech:meta_item_1', 531) * 16)
        .inputs(item('gregtech:meta_item_1', 528) * 16)
        .inputs(item('gregtech:meta_item_1', 528) * 16)
        .inputs(ore('wireFineSchrabidium') * 64)
        .fluidInputs(fluid('smart_gel_matrix') * 16000 )
        .fluidInputs(fluid('naqneutron_flux') * 16000 )
        .fluidInputs(fluid('tungsten_steel') * 144 )
        .outputs(metaitem('dustNaniteShells'))
        .duration(800).EUt(2097152).buildAndRegister()
