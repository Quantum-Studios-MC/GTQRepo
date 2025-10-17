import gregtech.api.unification.material.event.PostMaterialEvent

event_manager.listen { PostMaterialEvent event ->

    def void_mat = material('void') 
    void_mat.addFlags("generate_welded_plate", "generate_cast_plate", "generate_shell", "generate_ntmpipe", "generate_dense_wire", "generate_billet", "generate_tablet", "generate_curved_plate",  "generate_piston", "generate_structural", "generate_bar", "generate_structure_c")

    def vitalium = material('vitalium')
    vitalium.addFlags("generate_welded_plate", "generate_cast_plate", "generate_shell", "generate_ntmpipe", "generate_dense_wire", "generate_billet", "generate_tablet", "generate_curved_plate",  "generate_piston", "generate_structural", "generate_bar", "generate_structure_c")

    def dark_steel = material('dark_steel')
    dark_steel.addFlags("generate_welded_plate", "generate_cast_plate", "generate_shell", "generate_ntmpipe", "generate_dense_wire", "generate_billet", "generate_tablet", "generate_curved_plate",  "generate_piston", "generate_structural", "generate_bar", "generate_structure_c")

    def electrical_steel = material('electrical_steel')
    electrical_steel.addFlags("generate_welded_plate", "generate_cast_plate", "generate_shell", "generate_ntmpipe", "generate_dense_wire", "generate_billet", "generate_tablet", "generate_curved_plate",  "generate_piston", "generate_structural", "generate_bar", "generate_structure_c")

    def energetic_alloy = material('energetic_alloy')
    energetic_alloy.addFlags("generate_welded_plate", "generate_cast_plate", "generate_shell", "generate_ntmpipe", "generate_dense_wire", "generate_billet", "generate_tablet", "generate_curved_plate",  "generate_piston", "generate_structural", "generate_bar", "generate_structure_c")

    def energetic_silver = material('energetic_silver')
    energetic_silver.addFlags("generate_welded_plate", "generate_cast_plate", "generate_shell", "generate_ntmpipe", "generate_dense_wire", "generate_billet", "generate_tablet", "generate_curved_plate",  "generate_piston", "generate_structural", "generate_bar", "generate_structure_c")

    def vivid_alloy = material('vivid_alloy')
    vivid_alloy.addFlags("generate_welded_plate", "generate_cast_plate", "generate_shell", "generate_ntmpipe", "generate_dense_wire", "generate_billet", "generate_tablet", "generate_curved_plate",  "generate_piston", "generate_structural", "generate_bar", "generate_structure_c")

    def pulsating_iron = material('pulsating_iron')
    pulsating_iron.addFlags("generate_welded_plate", "generate_cast_plate", "generate_shell", "generate_ntmpipe", "generate_dense_wire", "generate_billet", "generate_tablet", "generate_curved_plate",  "generate_piston", "generate_structural", "generate_bar", "generate_structure_c")

    def end_steel = material('end_steel')
    end_steel.addFlags("generate_welded_plate", "generate_cast_plate", "generate_shell", "generate_ntmpipe", "generate_dense_wire", "generate_billet", "generate_tablet", "generate_curved_plate",  "generate_piston", "generate_structural", "generate_bar", "generate_structure_c")

    def vibranium = material('vibranium')
    vibranium.addFlags("generate_welded_plate", "generate_cast_plate", "generate_shell", "generate_ntmpipe", "generate_dense_wire", "generate_billet", "generate_tablet", "generate_curved_plate",  "generate_piston", "generate_structural", "generate_bar", "generate_structure_c")

    def schrabidium_vibranium = material('schrabidium_vibranium')
    schrabidium_vibranium.addFlags("generate_welded_plate", "generate_cast_plate", "generate_shell", "generate_ntmpipe", "generate_dense_wire", "generate_billet", "generate_tablet", "generate_curved_plate",  "generate_piston", "generate_structural", "generate_bar", "generate_structure_c")

    def shaboinkium = material('shaboinkium')
    shaboinkium.addFlags("generate_welded_plate", "generate_cast_plate", "generate_shell", "generate_ntmpipe", "generate_dense_wire", "generate_billet", "generate_tablet", "generate_curved_plate",  "generate_piston", "generate_structural", "generate_bar", "generate_structure_c")

    def soularium = material('soularium')
    soularium.addFlags("generate_welded_plate", "generate_cast_plate", "generate_shell", "generate_ntmpipe", "generate_dense_wire", "generate_billet", "generate_tablet", "generate_curved_plate",  "generate_piston", "generate_structural", "generate_bar", "generate_structure_c")

    def vibrant_alloy = material('vibrant_alloy')
    vibrant_alloy.addFlags("generate_welded_plate", "generate_cast_plate", "generate_shell", "generate_ntmpipe", "generate_dense_wire", "generate_billet", "generate_tablet", "generate_curved_plate",  "generate_piston", "generate_structural", "generate_bar", "generate_structure_c")

    def sigmacum = material('sigmacum')
    sigmacum.addFlags("generate_welded_plate", "generate_cast_plate", "generate_shell", "generate_ntmpipe", "generate_dense_wire", "generate_billet", "generate_tablet", "generate_curved_plate",  "generate_piston", "generate_structural", "generate_bar", "generate_structure_c")

    def desh = material('desh')
    desh.addFlags("generate_welded_plate", "generate_cast_plate", "generate_shell", "generate_ntmpipe", "generate_dense_wire", "generate_billet", "generate_tablet", "generate_curved_plate",  "generate_piston", "generate_structural", "generate_bar", "generate_structure_c")

    def omegnalium = material('omegnalium')
    omegnalium.addFlags("generate_welded_plate", "generate_cast_plate", "generate_shell", "generate_ntmpipe", "generate_dense_wire", "generate_billet", "generate_tablet", "generate_curved_plate",  "generate_piston", "generate_structural", "generate_bar", "generate_structure_c")

    def manasteel = material('manasteel')
    manasteel.addFlags("generate_welded_plate", "generate_cast_plate", "generate_shell", "generate_ntmpipe", "generate_dense_wire", "generate_billet", "generate_tablet", "generate_curved_plate",  "generate_piston", "generate_structural", "generate_bar", "generate_structure_c")

    def terrasteel = material('terrasteel')
    terrasteel.addFlags("generate_welded_plate", "generate_cast_plate", "generate_shell", "generate_ntmpipe", "generate_dense_wire", "generate_billet", "generate_tablet", "generate_curved_plate",  "generate_piston", "generate_structural", "generate_bar", "generate_structure_c")

    def hiihirokane = material('hiihirokane')
    hiihirokane.addFlags("generate_welded_plate", "generate_cast_plate", "generate_shell", "generate_ntmpipe", "generate_dense_wire", "generate_billet", "generate_tablet", "generate_curved_plate",  "generate_piston", "generate_structural", "generate_bar", "generate_structure_c")

    def mythril = material('mythril')
    mythril.addFlags("generate_welded_plate", "generate_cast_plate", "generate_shell", "generate_ntmpipe", "generate_dense_wire", "generate_billet", "generate_tablet", "generate_curved_plate",  "generate_piston", "generate_structural", "generate_bar", "generate_structure_c")

    def redstone_alloy = material('redstone_alloy')
    redstone_alloy.addFlags("generate_welded_plate", "generate_cast_plate", "generate_shell", "generate_ntmpipe", "generate_dense_wire", "generate_billet", "generate_tablet", "generate_curved_plate",  "generate_piston", "generate_structural", "generate_bar", "generate_structure_c")

    def conductive_iron = material('conductive_iron')
    conductive_iron.addFlags("generate_welded_plate", "generate_cast_plate", "generate_shell", "generate_ntmpipe", "generate_dense_wire", "generate_billet", "generate_tablet", "generate_curved_plate",  "generate_piston", "generate_structural", "generate_bar", "generate_structure_c")

    def crystalline_alloy = material('crystalline_alloy')
    crystalline_alloy.addFlags("generate_welded_plate", "generate_cast_plate", "generate_shell", "generate_ntmpipe", "generate_dense_wire", "generate_billet", "generate_tablet", "generate_curved_plate",  "generate_piston", "generate_structural", "generate_bar", "generate_structure_c")

    def melodic_alloy = material('melodic_alloy')
    melodic_alloy.addFlags("generate_welded_plate", "generate_cast_plate", "generate_shell", "generate_ntmpipe", "generate_dense_wire", "generate_billet", "generate_tablet", "generate_curved_plate",  "generate_piston", "generate_structural", "generate_bar", "generate_structure_c")

    def stellar_alloy = material('stellar_alloy')
    stellar_alloy.addFlags("generate_welded_plate", "generate_cast_plate", "generate_shell", "generate_ntmpipe", "generate_dense_wire", "generate_billet", "generate_tablet", "generate_curved_plate",  "generate_piston", "generate_structural", "generate_bar", "generate_structure_c")

    def supercooled_afcdnds = material('supercooled_afcdnds')
    supercooled_afcdnds.addFlags("generate_welded_plate", "generate_cast_plate", "generate_shell", "generate_ntmpipe", "generate_dense_wire", "generate_billet", "generate_tablet", "generate_curved_plate",  "generate_piston", "generate_structural", "generate_bar", "generate_structure_c")

    def stable_neoveline = material('stable_neoveline')
    stable_neoveline.addFlags("generate_welded_plate", "generate_cast_plate", "generate_shell", "generate_ntmpipe", "generate_dense_wire", "generate_billet", "generate_tablet", "generate_curved_plate",  "generate_piston", "generate_structural", "generate_bar", "generate_structure_c")

    def astanene = material('astanene')
    astanene.addFlags("generate_welded_plate", "generate_cast_plate", "generate_shell", "generate_ntmpipe", "generate_dense_wire", "generate_billet", "generate_tablet", "generate_curved_plate",  "generate_piston", "generate_structural", "generate_bar", "generate_structure_c")

    def twinitrixite = material('twinitrixite')
    twinitrixite.addFlags("generate_welded_plate", "generate_cast_plate", "generate_shell", "generate_ntmpipe", "generate_dense_wire", "generate_billet", "generate_tablet", "generate_curved_plate",  "generate_piston", "generate_structural", "generate_bar", "generate_structure_c")

    def demetarium = material('demetarium')
    demetarium.addFlags("generate_welded_plate", "generate_cast_plate", "generate_shell", "generate_ntmpipe", "generate_dense_wire", "generate_billet", "generate_tablet", "generate_curved_plate",  "generate_piston", "generate_structural", "generate_bar", "generate_structure_c")

    def advanced_alloy = material('advanced_alloy')
    advanced_alloy.addFlags("generate_welded_plate", "generate_cast_plate", "generate_shell", "generate_ntmpipe", "generate_dense_wire", "generate_billet", "generate_tablet", "generate_curved_plate",  "generate_piston", "generate_structural", "generate_bar", "generate_structure_c")

    def saturnite = material('saturnite')
    saturnite.addFlags("generate_welded_plate", "generate_cast_plate", "generate_shell", "generate_ntmpipe", "generate_dense_wire", "generate_billet", "generate_tablet", "generate_curved_plate",  "generate_piston", "generate_structural", "generate_bar", "generate_structure_c")

    def c_m_b_steel = material('c_m_b_steel')
    c_m_b_steel.addFlags("generate_welded_plate", "generate_cast_plate", "generate_shell", "generate_ntmpipe", "generate_dense_wire", "generate_billet", "generate_tablet", "generate_curved_plate",  "generate_piston", "generate_structural", "generate_bar", "generate_structure_c")

    def euphemium = material('euphemium')
    euphemium.addFlags("generate_welded_plate", "generate_cast_plate", "generate_shell", "generate_ntmpipe", "generate_dense_wire", "generate_billet", "generate_tablet", "generate_curved_plate",  "generate_piston", "generate_structural", "generate_bar", "generate_structure_c")

    def starmetal = material('starmetal')
    starmetal.addFlags("generate_welded_plate", "generate_cast_plate", "generate_shell", "generate_ntmpipe", "generate_dense_wire", "generate_billet", "generate_tablet", "generate_curved_plate",  "generate_piston", "generate_structural", "generate_bar", "generate_structure_c")

    def psi = material('psi')
    psi.addFlags("generate_welded_plate", "generate_cast_plate", "generate_shell", "generate_ntmpipe", "generate_dense_wire", "generate_billet", "generate_tablet", "generate_curved_plate",  "generate_piston", "generate_structural", "generate_bar", "generate_structure_c")

    def ebony_psi = material('ebony_psi')
    ebony_psi.addFlags("generate_welded_plate", "generate_cast_plate", "generate_shell", "generate_ntmpipe", "generate_dense_wire", "generate_billet", "generate_tablet", "generate_curved_plate",  "generate_piston", "generate_structural", "generate_bar", "generate_structure_c")

    def ivory_psi = material('ivory_psi')
    ivory_psi.addFlags("generate_welded_plate", "generate_cast_plate", "generate_shell", "generate_ntmpipe", "generate_dense_wire", "generate_billet", "generate_tablet", "generate_curved_plate",  "generate_piston", "generate_structural", "generate_bar", "generate_structure_c")

    def pixiemetal = material('pixiemetal')
    pixiemetal.addFlags("generate_welded_plate", "generate_cast_plate", "generate_shell", "generate_ntmpipe", "generate_dense_wire", "generate_billet", "generate_tablet", "generate_curved_plate",  "generate_piston", "generate_structural", "generate_bar", "generate_structure_c")

    def pidginmetal = material('pidginmetal')
    pidginmetal.addFlags("generate_welded_plate", "generate_cast_plate", "generate_shell", "generate_ntmpipe", "generate_dense_wire", "generate_billet", "generate_tablet", "generate_curved_plate",  "generate_piston", "generate_structural", "generate_bar", "generate_structure_c")


    // collect all materials that have generate_plate
    def plateMats = [
        "iron_compressed",
        "space_grade_steel",
        "mithglar",
        "skadiite",
        "geldrun",
        "vidium",
        "freyrite",
        "swartim",
        "trimla",
        "rodanil",
        "drustins",
        "dowmandir",
        "breytir",
        "geadris",
        "rootmetal",
        "dawnstone",
        "carved_masonry",
        "silverwood",
        "greatwood",
        "arcanum",
        "mingrade",
        "electrotine_alloy",
        "licium",
        "cerulean",
        "aurorianite",
        "moonstone",
        "thauminite",
        "knightslime",
        "pigiron",
        "duraluminium",
        "constantan",
        "dawnimythrkite",
        "ichorium",
        "livingrock",
        "meteoric_iron",
        "silicon_germanium",
        "ionized_gold"
    ]

    plateMats.each { matName ->
        def mat = material(matName)
        mat.addFlags(
            "generate_welded_plate",
            "generate_cast_plate",
            "generate_shell",
            "generate_ntmpipe",
            "generate_dense_wire",
            "generate_billet", "generate_tablet", "generate_curved_plate",  "generate_piston", "generate_structural", "generate_bar", "generate_structure_c"
        )
    }

    def ferroboron = material('ferroboron')
    ferroboron.addFlags("generate_welded_plate", "generate_cast_plate", "generate_shell", "generate_ntmpipe", "generate_dense_wire", "generate_billet", "generate_tablet", "generate_curved_plate",  "generate_piston", "generate_structural", "generate_bar", "generate_structure_c")

    def tough = material('tough')
    tough.addFlags("generate_welded_plate", "generate_cast_plate", "generate_shell", "generate_ntmpipe", "generate_dense_wire", "generate_billet", "generate_tablet", "generate_curved_plate",  "generate_piston", "generate_structural", "generate_bar", "generate_structure_c")

    def hard_carbon = material('hard_carbon')
    hard_carbon.addFlags("generate_welded_plate", "generate_cast_plate", "generate_shell", "generate_ntmpipe", "generate_dense_wire", "generate_billet", "generate_tablet", "generate_curved_plate",  "generate_piston", "generate_structural", "generate_bar", "generate_structure_c")

    def extreme = material('extreme')
    extreme.addFlags("generate_welded_plate", "generate_cast_plate", "generate_shell", "generate_ntmpipe", "generate_dense_wire", "generate_billet", "generate_tablet", "generate_curved_plate",  "generate_piston", "generate_structural", "generate_bar", "generate_structure_c")

    def thermoconducting = material('thermoconducting')
    thermoconducting.addFlags("generate_welded_plate", "generate_cast_plate", "generate_shell", "generate_ntmpipe", "generate_dense_wire", "generate_billet", "generate_tablet", "generate_curved_plate",  "generate_piston", "generate_structural", "generate_bar", "generate_structure_c")

    def pewter = material('pewter')
    pewter.addFlags("generate_welded_plate", "generate_cast_plate", "generate_shell", "generate_ntmpipe", "generate_dense_wire", "generate_billet", "generate_tablet", "generate_curved_plate",  "generate_piston", "generate_structural", "generate_bar", "generate_structure_c")

    def cast_iron = material('cast_iron')
    cast_iron.addFlags("generate_welded_plate", "generate_cast_plate", "generate_shell", "generate_ntmpipe", "generate_dense_wire", "generate_billet", "generate_tablet", "generate_curved_plate",  "generate_piston", "generate_structural", "generate_bar", "generate_structure_c")

    def babbitt_metal = material('babbitt_metal')
    babbitt_metal.addFlags("generate_welded_plate", "generate_cast_plate", "generate_shell", "generate_ntmpipe", "generate_dense_wire", "generate_billet", "generate_tablet", "generate_curved_plate",  "generate_piston", "generate_structural", "generate_bar", "generate_structure_c")

    def nickel_steel = material('nickel_steel')
    nickel_steel.addFlags("generate_welded_plate", "generate_cast_plate", "generate_shell", "generate_ntmpipe", "generate_dense_wire", "generate_billet", "generate_tablet", "generate_curved_plate",  "generate_piston", "generate_structural", "generate_bar", "generate_structure_c")

    def german_silver = material('german_silver')
    german_silver.addFlags("generate_welded_plate", "generate_cast_plate", "generate_shell", "generate_ntmpipe", "generate_dense_wire", "generate_billet", "generate_tablet", "generate_curved_plate",  "generate_piston", "generate_structural", "generate_bar", "generate_structure_c")

    def manganese_steel = material('manganese_steel')
    manganese_steel.addFlags("generate_welded_plate", "generate_cast_plate", "generate_shell", "generate_ntmpipe", "generate_dense_wire", "generate_billet", "generate_tablet", "generate_curved_plate",  "generate_piston", "generate_structural", "generate_bar", "generate_structure_c")

    def monel = material('monel')
    monel.addFlags("generate_welded_plate", "generate_cast_plate", "generate_shell", "generate_ntmpipe", "generate_dense_wire", "generate_billet", "generate_tablet", "generate_curved_plate",  "generate_piston", "generate_structural", "generate_bar", "generate_structure_c")

    def spiegeleisen = material('spiegeleisen')
    spiegeleisen.addFlags("generate_welded_plate", "generate_cast_plate", "generate_shell", "generate_ntmpipe", "generate_dense_wire", "generate_billet", "generate_tablet", "generate_curved_plate",  "generate_piston", "generate_structural", "generate_bar", "generate_structure_c")

    def bell_metal = material('bell_metal')
    bell_metal.addFlags("generate_welded_plate", "generate_cast_plate", "generate_shell", "generate_ntmpipe", "generate_dense_wire", "generate_billet", "generate_tablet", "generate_curved_plate",  "generate_piston", "generate_structural", "generate_bar", "generate_structure_c")

    def type_metal = material('type_metal')
    type_metal.addFlags("generate_welded_plate", "generate_cast_plate", "generate_shell", "generate_ntmpipe", "generate_dense_wire", "generate_billet", "generate_tablet", "generate_curved_plate",  "generate_piston", "generate_structural", "generate_bar", "generate_structure_c")

    def tombac = material('tombac')
    tombac.addFlags("generate_welded_plate", "generate_cast_plate", "generate_shell", "generate_ntmpipe", "generate_dense_wire", "generate_billet", "generate_tablet", "generate_curved_plate",  "generate_piston", "generate_structural", "generate_bar", "generate_structure_c")

    def silicon_bronze = material('silicon_bronze')
    silicon_bronze.addFlags("generate_welded_plate", "generate_cast_plate", "generate_shell", "generate_ntmpipe", "generate_dense_wire", "generate_billet", "generate_tablet", "generate_curved_plate",  "generate_piston", "generate_structural", "generate_bar", "generate_structure_c")

    def white_metal = material('white_metal')
    white_metal.addFlags("generate_welded_plate", "generate_cast_plate", "generate_shell", "generate_ntmpipe", "generate_dense_wire", "generate_billet", "generate_tablet", "generate_curved_plate",  "generate_piston", "generate_structural", "generate_bar", "generate_structure_c")

    def dura_steel = material('dura_steel')
    dura_steel.addFlags("generate_welded_plate", "generate_cast_plate", "generate_shell", "generate_ntmpipe", "generate_dense_wire", "generate_billet", "generate_tablet", "generate_curved_plate",  "generate_piston", "generate_structural", "generate_bar", "generate_structure_c")

    def menril_steel = material('menril_steel')
    menril_steel.addFlags("generate_welded_plate", "generate_cast_plate", "generate_shell", "generate_ntmpipe", "generate_dense_wire", "generate_billet", "generate_tablet", "generate_curved_plate",  "generate_piston", "generate_structural", "generate_bar", "generate_structure_c")
}
