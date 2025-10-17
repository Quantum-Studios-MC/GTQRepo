
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

materialBuilder(32221, "twilight_coal")
    .flags()
    .gem()
    .color(0x000000)
    .iconSet('FLINT')
    .components(material("coal"), material("quartz_black"))
    .ore()
    .burnTime(12200)
.build();

materialBuilder(32222, "twilight_coke")
    .flags()
    .gem()
    .colorAverage()
    .iconSet('FLINT')
    .components(material("twilight_coal"), material("coke"))
    .ore()
    .burnTime(24400)
.build();
}

// die in a fire
// ghughughughughughgghughghgu