import mods.pyrotech.Bloomery;
#reloadable
// recipe for an iron bloom from an iron ore
Bloomery.createBloomeryBuilder(
        "magnetite_ore",   // recipe name
        <minecraft:iron_nugget>, // output
        <ore:oreMagnetite>     // input
    )
    .setAnvilTiers(["granite", "ironclad"])
    .setBurnTimeTicks(12200)
    .setFailureChance(0.25)
    .setBloomYield(12, 15)
    .setSlagItem(<pyrotech:generated_slag_iron>, 4)
    .addFailureItem(<pyrotech:slag>, 1)
    .addFailureItem(<pyrotech:generated_slag_iron>, 2)
    .register();

// recipe for an iron bloom from an iron ore
Bloomery.createBloomeryBuilder(
        "pyrite",   // recipe name
        <minecraft:iron_nugget>, // output
        <ore:orePyrite>     // input
    )
    .setAnvilTiers(["granite", "ironclad"])
    .setBurnTimeTicks(12200)
    .setFailureChance(0.25)
    .setBloomYield(12, 15)
    .setSlagItem(<pyrotech:generated_slag_iron>, 4)
    .addFailureItem(<pyrotech:slag>, 1)
    .addFailureItem(<pyrotech:generated_slag_iron>, 2)
    .register();

// recipe for an iron bloom from an iron ore
Bloomery.createBloomeryBuilder(
        "limonite",   // recipe name
        <minecraft:iron_nugget>, // output
        <ore:oreBrownLimonite>     // input
    )
    .setAnvilTiers(["granite", "ironclad"])
    .setBurnTimeTicks(12200)
    .setFailureChance(0.25)
    .setBloomYield(12, 15)
    .setSlagItem(<pyrotech:generated_slag_iron>, 4)
    .addFailureItem(<pyrotech:slag>, 1)
    .addFailureItem(<pyrotech:generated_slag_iron>, 2)
    .register();

// recipe for an iron bloom from an iron ore
Bloomery.createBloomeryBuilder(
        "limonite2",   // recipe name
        <minecraft:iron_nugget>, // output
        <ore:oreYellowLimonite>     // input
    )
    .setAnvilTiers(["granite", "ironclad"])
    .setBurnTimeTicks(12200)
    .setFailureChance(0.25)
    .setBloomYield(12, 15)
    .setSlagItem(<pyrotech:generated_slag_iron>, 1)
    .addFailureItem(<pyrotech:slag>, 1)
    .addFailureItem(<pyrotech:generated_slag_iron>, 1)
    .register();

Bloomery.createBloomeryBuilder(
        "ironbas1",   // recipe name
        <minecraft:iron_nugget>, // output
        <ore:oreGraniticMineralSand>     // input
    )
    .setAnvilTiers(["granite", "ironclad"])
    .setBurnTimeTicks(12200)
    .setFailureChance(0.2)
    .setBloomYield(12, 17)
    .setSlagItem(<pyrotech:generated_slag_iron>, 1)
    .addFailureItem(<pyrotech:slag>, 1)
    .addFailureItem(<pyrotech:generated_slag_iron>, 1)
    .register();

Bloomery.createBloomeryBuilder(
        "ironbas2",   // recipe name
        <minecraft:iron_nugget>, // output
        <ore:oreBasalticMineralSand>     // input
    )
    .setAnvilTiers(["granite", "ironclad"])
    .setBurnTimeTicks(12200)
    .setFailureChance(0.2)
    .setBloomYield(12, 28)
    .setSlagItem(<pyrotech:generated_slag_iron>, 1)
    .addFailureItem(<pyrotech:slag>, 1)
    .addFailureItem(<pyrotech:generated_slag_iron>, 1)
    .register();

// big oreBasalticMineralsand

recipes.addShaped(<hbm:coil_tungsten>, [[<ore:stickIronMagnetic>, <ore:foilCupronickel>, null], [<ore:foilCupronickel>, <ore:stickLongIronMagnetic>, <ore:foilCupronickel>], [null, <ore:foilCupronickel>, <ore:stickIronMagnetic>]]);