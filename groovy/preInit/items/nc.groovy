
// listen to gregtech material event
mods.gregtech.materialEvent {

materialBuilder(31600, "ferroboron")
        .ingot()
        .fluid()
        .iconSet('DULL')
        .color(0x444444)
        .flags('generate_plate', 'generate_rod', 'generate_gear', 'generate_dense', 'generate_spring', "generate_ring", "generate_bolt_screw", "generate_round")
        .components(material('boron'), material('steel'))
.build();

materialBuilder(31601, "tough")
        .ingot()  
        .fluid()
        .iconSet('DULL')
        .color(0x1b1622)
        .flags('generate_plate', 'generate_rod', 'generate_gear', 'generate_dense', 'generate_spring', "generate_ring", "generate_bolt_screw", "generate_round")
    .components(material('ferroboron'), material('lithium'), material('iron'))
.build();

materialBuilder(31602, "hard_carbon")
        .ingot()  
        .fluid()
        .iconSet('DULL')
        .color(0x0f3353)
        .flags('generate_plate', 'generate_rod', 'generate_gear', 'generate_dense', 'generate_spring', "generate_ring", "generate_bolt_screw", "generate_round")
    .components(material('graphite'))
.build();

materialBuilder(31603, "extreme")
        .ingot()  
        .fluid()
        .iconSet('DULL')
        .color(0x5c213c)
        .flags('generate_plate', 'generate_rod', 'generate_gear', 'generate_dense', 'generate_spring', "generate_ring", "generate_bolt_screw", "generate_round")
    .components(material('tough'), material('hard_carbon'))
.build();

materialBuilder(31604, "thermoconducting")
        .ingot()  
        .fluid()
        .iconSet('DULL')
        .color(0x657253)
        .flags('generate_plate', 'generate_rod', 'generate_gear', 'generate_dense', 'generate_spring', "generate_ring", "generate_bolt_screw", "generate_round")
    .components(material('extreme'), material('boron'), material('arsenic'))
.build();
}
