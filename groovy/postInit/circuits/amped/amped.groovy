// first, cortisol line.

// Recipes
// Recipe 1: Cholesterol Synthesis
recipemap('chemical_reactor').recipeBuilder()
        .fluidInputs(fluid('seed_oil') * 1000)
        .fluidInputs(fluid('oxygen') * 500)
        .notConsumable(ore('dustPlatinum'))
        .fluidOutputs(fluid('cholesterol') * 500)
        .duration(200).EUt(480).buildAndRegister();

// Recipe 2: Pregnenolone Synthesis
recipemap('chemical_reactor').recipeBuilder()
        .fluidInputs(fluid('cholesterol') * 500)
        .fluidInputs(fluid('oxygen') * 300)
        .notConsumable(ore('dustPlatinum'))
        .fluidOutputs(fluid('pregnenolone') * 400)
        .duration(300).EUt(960).buildAndRegister();

// Recipe 3: Seventeena-Hydroxypregnenolone Synthesis
recipemap('chemical_reactor').recipeBuilder()
        .fluidInputs(fluid('pregnenolone') * 400)
        .fluidInputs(fluid('peroxide') * 200)
        .notConsumable(ore('dustChrome'))
        .fluidOutputs(fluid('seventeena_hydroxypregnenolone') * 300)
        .duration(300).EUt(960).buildAndRegister();

// Recipe 4: Seventeena-Hydroxyprogesterone Synthesis
recipemap('chemical_reactor').recipeBuilder()
        .fluidInputs(fluid('seventeena_hydroxypregnenolone') * 300)
        .notConsumable(ore('dustNickel'))
        .fluidOutputs(fluid('seventeena_hydroxyprogesterone') * 250)
        .duration(400).EUt(1440).buildAndRegister();

// Recipe 5: Elevendeoxycortisol Synthesis
recipemap('chemical_reactor').recipeBuilder()
        .fluidInputs(fluid('seventeena_hydroxyprogesterone') * 250)
        .fluidInputs(fluid('peroxide') * 200)
        .notConsumable(ore('dustCobalt'))
        .fluidOutputs(fluid('elevendeoxycortisol') * 200)
        .duration(400).EUt(1440).buildAndRegister();

// Recipe 6: Cortisol Synthesis
recipemap('chemical_reactor').recipeBuilder()
        .fluidInputs(fluid('elevendeoxycortisol') * 200)
        .fluidInputs(fluid('peroxide') * 200)
        .notConsumable(ore('dustPalladium'))
        .fluidOutputs(fluid('cortisol') * 150)
        .duration(500).EUt(1920).buildAndRegister();
