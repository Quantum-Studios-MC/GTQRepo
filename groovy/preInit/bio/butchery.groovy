
// listen to gregtech material event

mods.gregtech.materialEvent {

materialBuilder(30046, "musculoskeletal_tissue")
    .dust()
    .color(0xf7a6a6) 
.build();

materialBuilder(30047, "liquid_fat")
    .liquid(fluidBuilder())
    .color(0xffd700)
.build();

materialBuilder(30048, "skin")
    .dust()
    .color(0xffe8d1)
.build();

}
