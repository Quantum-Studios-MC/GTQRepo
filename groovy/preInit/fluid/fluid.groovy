
// listen to gregtech material event

mods.gregtech.materialEvent {
    materialBuilder(32140, 'highly_impure_fluix_slurry')
        .liquid(fluidBuilder())
        .color(0x5400a3)
.build()

    materialBuilder(32143, 'pure_fluix_slurry')
        .liquid(fluidBuilder())
        .color(0x6f2ab0)
.build()

    materialBuilder(32144, 'redstone_reactant')
        .liquid(fluidBuilder())
        .color(0x6f2ab0)
        .components(material('lithium'), material('redstone'))
.build()

    materialBuilder(32150, 'thermally_expanded_redstone_solution')
        .liquid(fluidBuilder())
        .color(0xad0000)
.build()

    materialBuilder(31999, 'endogenic_coat')
        .liquid(fluidBuilder())
        .color(0x2200c9)
.build()

    materialBuilder(31699, 'fluix_soldering_alloy')
        .liquid(fluidBuilder())
        .color(0x6f2ab0)
.build()
// Cholesterol
materialBuilder(30000, "cholesterol")
    .liquid(fluidBuilder())
    .color(0x7a0008) // Dark red-brown color
.build();

// Pregnenolone
materialBuilder(30001, "pregnenolone")
    .liquid(fluidBuilder())
    .color(0xffcc00) // Golden yellow
.build();

// 17α-Hydroxypregnenolone
materialBuilder(30002, "seventeena_hydroxypregnenolone")
    .liquid(fluidBuilder())
    .color(0xffe066) // Pale yellow
.build();

// 17α-Hydroxyprogesterone
materialBuilder(30003, "seventeena_hydroxyprogesterone")
    .liquid(fluidBuilder())
    .color(0xffb732) // Amber
.build();

// 11-Deoxycortisol
materialBuilder(30004, "elevendeoxycortisol")
    .liquid(fluidBuilder())
    .color(0xc39bd3) // Soft purple
.build();

// Cortisol
materialBuilder(30005, "cortisol")
    .liquid(fluidBuilder())
    .color(0x8e44ad) // Deep purple
.build();

// Biochemistry Line: Amino Acids and Polypeptide Synthesis

// Material Definitions
materialBuilder(30009, "glycine")
    .dust()
    .color(0xa0d6a0) // Pale green
.build();

materialBuilder(30010, "alanine")
    .dust()
    .color(0xa080d6) // Lavender
.build();

materialBuilder(30011, "serine")
    .dust()
    .color(0xd6a080) // Peach
.build();

materialBuilder(30012, "advanced_polypeptide")
    .ingot()
    .polymer()
    .flags("generate_plate")
    .color(0x606060) // Gray
.build();

materialBuilder(30024, "androstenedione")
    .liquid(fluidBuilder())
    .color(0xb87333) // Copper-like
.build();

materialBuilder(30028, "testosterone")
    .liquid(fluidBuilder())
    .color(0xffd700) // Gold-like
.build();

materialBuilder(30025, "estrogen")
    .liquid(fluidBuilder())
    .color(0xff69b4) // Pink
.build();

materialBuilder(30026, "estradiol")
    .liquid(fluidBuilder())
    .color(0xffa07a) // Light salmon
.build();

materialBuilder(30027, "estrone")
    .liquid(fluidBuilder())
    .color(0xffc0cb) //
    .build();

materialBuilder(30039, "infernal_fluorohaemathaumic_solution")
    .liquid(fluidBuilder())
    .colorAverage() //
    .build();

materialBuilder(30041, "fluorohaemathaumic_solution")
    .liquid(fluidBuilder())
    .colorAverage() //
    .build();

materialBuilder(30042, "oxidized_watz_mud")
    .liquid(fluidBuilder())
    .colorAverage() //
    .components(material("oxygen") * 12, material('thorium') * 7, material('uranium') * 3, material('sodium_hydroxide'))    
    .build();

materialBuilder(30043, "low_concentration_saturnite_mix")
    .liquid(fluidBuilder())
    .colorAverage() //
    .components(material("helium_3") * 7, material('platinum') * 4, material('phosphorus'), material('osmium'))
    .build();

materialBuilder(30100, "certus_quartz_sand")
    .liquid(fluidBuilder())
    .colorAverage() //
    .components(material('certus_quartz') * 2, material('quartzite'))
    .build();

materialBuilder(30101, "urine")
    .liquid(fluidBuilder())
    .color(0xffd700) 
    .build();


    // thaumcrap!

materialBuilder(30102, "aer")
    .liquid(fluidBuilder())
    .color(0xF4E242)
    .element("Aer")
    .build();

materialBuilder(30103, "ignis")
    .liquid(fluidBuilder())
    .color(0xFF3300)
    .element("Ignis")
    .build();

materialBuilder(30104, "terra")
    .liquid(fluidBuilder())
    .color(0x3A8A2E)
    .element("Terra")
    .build();

materialBuilder(30105, "aqua")
    .liquid(fluidBuilder())
    .color(0x2E86C1)
    .element("Aqua")
    .build();

materialBuilder(30106, "ordo")
    .liquid(fluidBuilder())
    .color(0xBFBFBF)
    .element("Ordo")
    .build();

materialBuilder(30107, "perditio")
    .liquid(fluidBuilder())
    .color(0x222222)
    .element("Perditio")
    .build();

// compound aspects

materialBuilder(30108, "vacuos").liquid(fluidBuilder()).gem().color(0xA0A0A0).element("Vacuos").build();
materialBuilder(30109, "lux").liquid(fluidBuilder()).gem().color(0xFFFFFF).element("Lux").build();
materialBuilder(30110, "motus").liquid(fluidBuilder()).gem().color(0x6699FF).element("Motus").build();
materialBuilder(30111, "gelum").liquid(fluidBuilder()).gem().color(0x00FFFF).element("Gelum").build();
materialBuilder(30112, "vitreus").liquid(fluidBuilder()).gem().color(0x66CCFF).element("Vitreus").build();
materialBuilder(30113, "metallum").liquid(fluidBuilder()).gem().color(0xAAAAAA).element("Metallum").build();
materialBuilder(30114, "victus").liquid(fluidBuilder()).gem().color(0xD94A38).element("Victus").build();
materialBuilder(30115, "mortuus").liquid(fluidBuilder()).gem().color(0x4A1A1A).element("Mortuus").build();
materialBuilder(30116, "potentia").liquid(fluidBuilder()).gem().color(0xAA55FF).element("Potentia").build();
materialBuilder(30117, "permutatio").liquid(fluidBuilder()).gem().color(0x55FF55).element("Permutatio").build();
materialBuilder(30118, "praecantatio").liquid(fluidBuilder()).gem().color(0x9933CC).element("Praecantatio").build();
materialBuilder(30119, "auram").liquid(fluidBuilder()).gem().color(0xFF99FF).element("Auram").build();
materialBuilder(30120, "alkimia").liquid(fluidBuilder()).gem().color(0x2AA198).element("Alkimia").build();
materialBuilder(30121, "vitium").liquid(fluidBuilder()).gem().color(0x9900CC).element("Vitium").build();
materialBuilder(30122, "tenebrae").liquid(fluidBuilder()).gem().color(0x1A1A1A).element("Tenebrae").build();
materialBuilder(30123, "alienis").liquid(fluidBuilder()).gem().color(0x8A2BE2).element("Alienis").build();
materialBuilder(30124, "volatus").liquid(fluidBuilder()).gem().color(0xF5F5F5).element("Volatus").build();
materialBuilder(30125, "herba").liquid(fluidBuilder()).gem().color(0x33AA33).element("Herba").build();
materialBuilder(30126, "instrumentum").liquid(fluidBuilder()).gem().color(0x4466AA).element("Instrumentum").build();
materialBuilder(30127, "fabrico").liquid(fluidBuilder()).gem().color(0x77DDFF).element("Fabrico").build();
materialBuilder(30128, "machina").liquid(fluidBuilder()).gem().color(0x224466).element("Machina").build();
materialBuilder(30129, "vinculum").liquid(fluidBuilder()).gem().color(0x333344).element("Vinculum").build();
materialBuilder(30130, "spiritus").liquid(fluidBuilder()).gem().color(0xAAAAFF).element("Spiritus").build();
materialBuilder(30131, "cognitio").liquid(fluidBuilder()).gem().color(0xDDCC88).element("Cognitio").build();
materialBuilder(30132, "sensus").liquid(fluidBuilder()).gem().color(0x88FF88).element("Sensus").build();
materialBuilder(30133, "aversio").liquid(fluidBuilder()).gem().color(0xAA2222).element("Aversio").build();
materialBuilder(30134, "praemunio").liquid(fluidBuilder()).gem().color(0x336699).element("Praemunio").build();
materialBuilder(30135, "desiderium").liquid(fluidBuilder()).gem().color(0xFFD700).element("Desiderium").build();
materialBuilder(30136, "exanimis").liquid(fluidBuilder()).gem().color(0x999999).element("Exanimis").build();
materialBuilder(30137, "bestia").liquid(fluidBuilder()).gem().color(0x885522).element("Bestia").build();
materialBuilder(30138, "humanus").liquid(fluidBuilder()).gem().color(0xFFCCAA).element("Humanus").build();
materialBuilder(30139, "sol").liquid(fluidBuilder()).gem().color(0xFFFF33).element("Sol").build();
materialBuilder(30140, "luna").liquid(fluidBuilder()).gem().color(0xCCCCFF).element("Luna").build();
materialBuilder(30141, "stellae").liquid(fluidBuilder()).gem().color(0x3366FF).element("Stellae").build();
materialBuilder(30142, "diabolus").liquid(fluidBuilder()).gem().color(0x660000).element("Diabolus").build();
materialBuilder(30143, "fluctus").liquid(fluidBuilder()).gem().color(0x33CCFF).element("Fluctus").build();
materialBuilder(30144, "sonus").liquid(fluidBuilder()).gem().color(0xFFAA44).element("Sonus").build();
materialBuilder(30145, "exitium").liquid(fluidBuilder()).gem().color(0x772222).element("Exitium").build();
materialBuilder(30146, "caeles").liquid(fluidBuilder()).gem().color(0xFFEEAA).element("Caeles").build();
materialBuilder(30147, "draco").liquid(fluidBuilder()).gem().color(0x3399FF).element("Draco").build();
materialBuilder(30148, "infernum").liquid(fluidBuilder()).gem().color(0x990000).element("Infernum").build();
materialBuilder(30149, "ventus").liquid(fluidBuilder()).gem().color(0xE6E6FA).element("Ventus").build();
materialBuilder(30150, "visum").liquid(fluidBuilder()).gem().color(0x66FF66).element("Visum").build();
materialBuilder(30151, "imperium").liquid(fluidBuilder()).gem().color(0xFFBB00).element("Imperium").build();
materialBuilder(30152, "life_essence").liquid(fluidBuilder()).gem().color(0xFFBB00).components(material('mortuus'), material('victus')).build();
materialBuilder(30153, "manifested_mana").liquid(fluidBuilder()).colorAverage().components(material('praecantatio'), material('auram')).build();
materialBuilder(30154, "will").liquid(fluidBuilder()).gem().color(0xbafff9).components(material('mortuus'), material('cognitio') * 99, material('visum') * 33, material('caeles') * 12, material('victus')).build();
materialBuilder(30155, "indraic_water").liquid(fluidBuilder()).gem().color(0xbafff9).components(material('caeles'), material('distilled_water') * 99, material('sensus') * 33, material('spiritus') * 12, material('gelum')).build();
materialBuilder(30156, "cryotheum").liquid(fluidBuilder()).gem().color(0x5eb1ff).components(material('gelum') * 4, material('indraic_water')).build();
materialBuilder(30157, "aerotheum").liquid(fluidBuilder()).gem().colorAverage().components(material('aer') * 4, material('visum')).build();
materialBuilder(30158, "pyrotheum").liquid(fluidBuilder()).gem().colorAverage().components(material('infernum') * 4, material('blaze')).build();
}

// ribhyas hair looks
