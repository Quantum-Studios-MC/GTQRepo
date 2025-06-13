
// listen to gregtech material event

mods.gregtech.materialEvent {

materialBuilder(30049, "lignin_slurry")
    .liquid(fluidBuilder())
    .color(0x5D3A1A)
    .components(material("carbon") * 12, material("hydrogen") * 14, material("oxygen") * 6) // Approximate monomer
.build();

materialBuilder(30050, "white_rot_culture")
    .dust()
    .color(0xE8D8B0)
.build();

materialBuilder(30051, "aromatic_sludge")
    .liquid(fluidBuilder())
    .color(0x7F4F24)
    .components(material("carbon") * 9, material("hydrogen") * 8, material("oxygen"))
.build();

materialBuilder(30052, "vanillin")
    .liquid(fluidBuilder())
    .color(0xEADBC8)
    .components(material("carbon") * 8, material("hydrogen") * 8, material("oxygen"))
.build();

materialBuilder(30053, "syringaldehyde")
    .liquid(fluidBuilder())
    .color(0xCBAE94)
    .components(material("carbon") * 9, material("hydrogen") * 10, material("oxygen"))
.build();

materialBuilder(30054, "hydroxybenzoic_acid")
    .liquid(fluidBuilder())
    .color(0xAD8B73)
    .components(material("carbon") * 7, material("hydrogen") * 6, material("oxygen"))
.build();

materialBuilder(30055, "fungal_extract")
    .dust()
    .color(0x50341A)
.build();

materialBuilder(30056, "lignin")
    .dust()
    .color(0x5D3A1A)
.build();

materialBuilder(30057, "bio_aromatic_mix")
    .liquid(fluidBuilder())
    .color(0xAD8B73)
.build();


}
