
recipemap('extractor').recipeBuilder()
    .inputs(ore('sugarcane'))
    .fluidOutputs(fluid('sugarcane_juice') * 250) 
    .duration(15).EUt(10).buildAndRegister();

recipemap('fluid_heater').recipeBuilder()
    .fluidInputs(fluid('sugarcane_juice') * 1000)
    .fluidOutputs(fluid('hot_sugarcane_juice') * 100) 
    .duration(60).EUt(10).buildAndRegister();

recipemap('centrifuge').recipeBuilder()
    .fluidInputs(fluid('hot_sugarcane_juice') * 1000)
    .fluidOutputs(fluid('molasses') * 700) 
    .outputs(metaitem('dustCaneSugar') * 3) 
    .duration(120).EUt(25).buildAndRegister();
