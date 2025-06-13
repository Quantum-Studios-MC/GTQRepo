// listen to gregtech material event

mods.gregtech.materialEvent {
materialBuilder(30333, "assimilated_scraps")
    .dust().fluid()
    .element("Assimilation")
    .color(0xff6347)
.build();

materialBuilder(30339, "contained_hive_field")
    .liquid(fluidBuilder())
    .color(0xff4500) 
.build();

materialBuilder(30340, "laponergium_solution")
    .liquid(fluidBuilder())
    .components(material('ruby') * 5, material('redstone') * 4, material('lapotron'))
    .colorAverage() 
.build();

materialBuilder(30348, "lossless_superconductive_field")
    .liquid(fluidBuilder())
    .components(material("laponergium_solution"), material('yttrium'))
    .colorAverage() 

.build();



materialBuilder(30362, 'fluorene')
    .fluid()
    .color(0x8A2BE2)  // Purple-ish
    .components(material('coal_tar'), material('benzene'))
    .build()

materialBuilder(30363, 'polyfluorene_solvent')
    .fluid()
    .color(0x1539D9)
    .components(material('oil'), material('fluorene'))
    .build()

materialBuilder(30350, 'bio_gel')
    .fluid()
    .color(0x3FA34D)
    .build()

materialBuilder(30351, 'naqneutron_flux')
    .fluid()
    .color(0x7B2CBF)
    .components(material('naquadah'))
    .build()

materialBuilder(30352, 'nanotube_suspension')
    .fluid()
    .color(0x6E6E6E)
    .components(material('carbon'))
    .build()

materialBuilder(30353, 'smart_gel_matrix')
    .fluid()
    .color(0x228B9E)
    .components(material('nanotube_suspension'), material('naqneutron_flux'), material('bio_gel'))
    .build()

materialBuilder(30354, 'nano_connector')
    .ingot().fluid()
    .color(0x345A89)
    .flags('generate_bolt_screw', 'generate_foil', 'generate_fine_wire')
    .components( material('silver'))
    .blastTemp(1800, "HIGH")
    .build()

materialBuilder(30355, 'nano_superconductor')
    .ingot().fluid()
    .color(0x9B30FF)
    .flags('generate_fine_wire')
    .components(material('yttrium_barium_cuprate'), material('silver'))
    .blastTemp(2200, "HIGHER")
    .build()

materialBuilder(30335, "nanite_shells")
     .dust()
    .color(0x808080) 
.build();

materialBuilder(30336, "organic_nanite_shells")
    .liquid(fluidBuilder())
    .color(0x808080) 
.build();

materialBuilder(30337, "sentient_nanites")
    .liquid(fluidBuilder())
    .colorAverage() 
 
.build();

materialBuilder(30341, "irritated_hive_field")
    .liquid(fluidBuilder())
    .components(material("assimilated_scraps"))
    .colorAverage() 
.build();

materialBuilder(30342, "electrified_hive_field")
    .liquid(fluidBuilder())
    .components(material("assimilated_scraps"))
    .colorAverage() 
.build();

materialBuilder(30343, "tortured_hive_field")
    .liquid(fluidBuilder())
    .components(material("assimilated_scraps"))
    .colorAverage() 
.build();

materialBuilder(30344, "gourmet_hive_field")
    .liquid(fluidBuilder())
    .components(material("assimilated_scraps"))
    .colorAverage() 
.build();

materialBuilder(30345, "poisoned_hive_field")
    .liquid(fluidBuilder())
    .components(material("assimilated_scraps"))
    .colorAverage() 
.build();

materialBuilder(30346, "scorching_hive_field")
    .liquid(fluidBuilder())
    .components(material("assimilated_scraps"))
    .colorAverage() 
.build();

materialBuilder(30347, "infernal_lava")
    .liquid(fluidBuilder())
    .components(material("blaze"))
    .colorAverage() 
.build();

materialBuilder(30356, 'hydrocarbon_gas')
    .fluid()
    .color(0xC2B280) 
    .components(material('methane'))  
    .build()

materialBuilder(30357, 'iron_nanocatalyst')
    .dust()
    .color(0xAA4A44)
    .components(material('iron'))
    .build()

materialBuilder(30358, 'carbon_nanotube_suspension')
    .fluid()
    .color(0x444444)
    .components(material('hydrocarbon_gas'), material('iron_nanocatalyst'))
    .build()

materialBuilder(30359, 'carbon_nanotube')
    .ingot()
    .color(0x222222)
    .components(material('carbon_nanotube_suspension'))
    .blastTemp(3500, "HIGHER")
    .build()

materialBuilder(30360, 'intermediate_gel')
    .fluid()
    .color(0x557799)
    .components(material('nanotube_suspension'), material('naqneutron_flux'))
    .build()

materialBuilder(30361, 'poor_neutronium')
    .fluid()
    .color(0x557799)
    .build()

materialBuilder(30364, 'nanomachinery')
    .dust()
    .colorAverage().iconSet('SHINY')
    .color(0x666564)
.build()
}