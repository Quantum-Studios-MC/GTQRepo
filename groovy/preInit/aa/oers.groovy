
// listen to gregtech material event

mods.gregtech.materialEvent {
materialBuilder(32220, "quartz_black")
    .flags()
    .gem(2)
    .color(0x000000)
    .iconSet('QUARTZ')
    .components(material("nether_quartz"), material("silicon"), material("carbon"))
    .ore()
.build();
}

// die in a fire
// ghughughughughughgghughghgu