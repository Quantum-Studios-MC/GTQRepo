
// listen to gregtech material event

mods.gregtech.materialEvent {

materialBuilder(30034, "hot_sugarcane_juice")
    .liquid(fluidBuilder())
    .color(0xf7a6a6) 
.build();

materialBuilder(30044, "molasses")
    .liquid(fluidBuilder())
    .color(0x1c0800)
.build();

materialBuilder(30045, "cane_sugar")
    .dust()
    .gem()
    .color(0xe4ffb3)
    .iconSet("DIAMOND")
.build();

}
