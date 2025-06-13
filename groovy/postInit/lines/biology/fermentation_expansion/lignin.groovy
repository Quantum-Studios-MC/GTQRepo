import gregtech.api.GTValues;


recipemap('chemical_reactor').recipeBuilder()
    .inputs(ore('dustLignin') * 2)
    .fluidInputs(fluid('distilled_water') * 1000)
    .fluidOutputs(fluid('lignin_slurry') * 1000)
    .duration(400).EUt(GTValues.VA[GTValues.MV]).buildAndRegister();


recipemap('large_chemical_reactor').recipeBuilder()
    .fluidInputs(fluid('lignin_slurry') * 1000)
    .fluidInputs(fluid('biomass') * 1000)
    .inputs(metaitem('dustWhiteRotCulture'))
    .fluidOutputs(fluid('aromatic_sludge') * 1000)
    .duration(600).EUt(GTValues.VA[GTValues.MV]).buildAndRegister();

recipemap('centrifuge').recipeBuilder()
    .fluidInputs(fluid('aromatic_sludge') * 1000)
    .fluidOutputs(fluid('vanillin') * 250)
    .fluidOutputs(fluid('syringaldehyde') * 250)
    .fluidOutputs(fluid('hydroxybenzoic_acid') * 250)
    .outputs(metaitem('dustPlantMatter') * 1)
    .duration(600).EUt(GTValues.VA[GTValues.MV]).buildAndRegister();

recipemap('large_chemical_reactor').recipeBuilder()
    .fluidInputs(fluid('vanillin') * 1000)
    .fluidInputs(fluid('syringaldehyde') * 1000)
    .fluidInputs(fluid('hydroxybenzoic_acid') * 1000)
    .fluidOutputs(fluid('bio_aromatic_mix') * 3000)
    .duration(600).EUt(GTValues.VA[GTValues.MV]).buildAndRegister();

recipemap('macerator').recipeBuilder()
    .inputs(ore('mushroom'))
    .outputs(metaitem('dustFungalExtract') * 1)
    .duration(20).EUt(GTValues.VA[GTValues.LV]).buildAndRegister();

recipemap('chemical_reactor').recipeBuilder()
    .inputs(ore('dustFungalExtract'))
    .fluidInputs(fluid('biomass') * 1000)
    .outputs(metaitem('dustWhiteRotCulture'))
    .duration(600).EUt(GTValues.VA[GTValues.LV]).buildAndRegister();

recipemap('chemical_reactor').recipeBuilder()
    .inputs(ore('foodVanilla') * 16)
    .fluidInputs(fluid('water') * 1000)
    .fluidInputs(fluid('ethanol') * 200)
    .fluidOutputs(fluid('vanillin') * 1000)
    .duration(600).EUt(GTValues.VA[GTValues.LV]).buildAndRegister();

recipemap('chemical_reactor').recipeBuilder()
    .inputs(ore('foodVanilla') * 16)
    .fluidInputs(fluid('water') * 1000)
    .fluidInputs(fluid('ethanol') * 200)
    .fluidOutputs(fluid('vanillin') * 1000)
    .duration(600).EUt(GTValues.VA[GTValues.LV]).buildAndRegister();

recipemap('chemical_reactor').recipeBuilder()
    .inputs(ore('dustWood') * 8)                      
    .notConsumable(ore('dustSodiumHydroxide'))      // alkali
    .fluidOutputs(fluid('lignin_slurry') * 1000)       
    .duration(400)
    .EUt(GTValues.VA[GTValues.LV])
    .buildAndRegister()


recipemap('centrifuge').recipeBuilder()
    .fluidInputs(fluid('lignin_slurry') * 1000)
    .outputs(metaitem('dustLignin') * 4) 
    .duration(300)
    .EUt(GTValues.VA[GTValues.MV])
    .buildAndRegister()
