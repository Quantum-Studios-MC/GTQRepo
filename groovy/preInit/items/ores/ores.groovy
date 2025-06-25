
// listen to gregtech material event

mods.gregtech.materialEvent {

 materialBuilder(31900,'aridium')
    .colorAverage()
    .ore(true)
    .flags()
    .components(material('schrabidium'), material('oxygen') * 4)
    .separatedInto(material('vibranium'), material('schrabidium'))
.build()

materialBuilder(31901, 'cryoxite')
    .colorAverage()
    .ore(true)
    .flags()
    .components(material('oxygen'), material('neon') * 2)
    .addOreByproducts(material('helium'), material('water'))
    .build()

materialBuilder(31902, 'zephyrite')
    .colorAverage()
    .ore(true)
    .flags()
    .components(material('silicon'), material('chlorine') * 2)
    .addOreByproducts(material('calcium'), material('sodium'))
    .build()

materialBuilder(31903, 'tundrite')
    .colorAverage()
    .ore(true)
    .flags()
    .components(material('magnetite'), material('oxygen') * 3)
    .separatedInto(material('pyrite'), material('magnetite'))
    .addOreByproducts(material('nickel'), material('chromium_trioxide'))
    .build()

materialBuilder(31904, 'aetherium')
    .colorAverage()
    .ore(true)
    .flags()
    .components(material('helium'), material('neodymium') * 3)
    .addOreByproducts(material('yttrium'), material('cerium'))
    .build()

materialBuilder(31905, 'ignium')
    .colorAverage()
    .ore(true)
    .flags()
    .components(material('sulfur'), material('pyrite') * 2)
    .addOreByproducts(material('lead'), material('silver'))
    .build()

materialBuilder(31906, 'ferritium')
    .colorAverage()
    .ore(true)
    .flags()
    .components(material('iron'), material('carbon') * 2)
    .separatedInto(material('steel'), material('carbon'))
    .addOreByproducts(material('nickel'), material('manganese'))
    .build()

materialBuilder(31907, 'luminite')
    .colorAverage()
    .ore(true)
    .flags()
    .components(material('phosphorus'), material('aluminium') * 2)
    .separatedInto(material('glowstone'), material('phosphorus'))
    .addOreByproducts(material('calcium'), material('silicon'))
    .build()

materialBuilder(31908, 'thermite')
    .colorAverage()
    .ore(true)
    .flags()
    .components(material('aluminium'), material('iron') * 3)
    .separatedInto(material('pyrite'), material('aluminium'))
    .addOreByproducts(material('magnesium'), material('silicon'))
    .build()

materialBuilder(31909, 'nebulium')
    .colorAverage()
    .ore(true)
    .flags()
    .components(material('neon'), material('helium') * 2)
    .addOreByproducts(material('argon'), material('xenon'))
    .build()

materialBuilder(31910, 'rubidite')
    .colorAverage()
    .ore(true)
    .flags()
    .components(material('rubidium'), material('silicon') * 2)
    .separatedInto(material('quartzite'))
    .addOreByproducts(material('potassium'), material('silicon'))
    .build()

materialBuilder(31911, 'xenotite')
    .colorAverage()
    .ore(true)
    .flags()
    .components(material('xenon'), material('titanium') * 3)
    .separatedInto(material('rutile'))
    .addOreByproducts(material('argon'), material('chromium_trioxide'))
    .build()

materialBuilder(31912, 'aerium')
    .colorAverage()
    .ore(true)
    .flags()
    .components(material('aluminium'), material('oxygen') * 3)
    .separatedInto(material('bauxite'))
    .addOreByproducts(material('nitrogen'), material('silicon'))
    .build()

materialBuilder(31913, 'stellarium')
    .colorAverage()
    .ore(true)
    .flags()
    .components(material('iron'), material('nickel') * 2)
    .separatedInto(material('nickel'), material('iron'))
    .addOreByproducts(material('cobalt'), material('manganese'))
    .build()

materialBuilder(31914, 'polarite')
    .colorAverage()
    .ore(true)
    .flags()
    .components(material('magnetite'), material('carbon') * 2)
    .separatedInto(material('iron'))
    .addOreByproducts(material('nickel'), material('magnesium'))
    .build()

materialBuilder(31915, 'voltium')
    .colorAverage()
    .ore(true)
    .flags()
    .components(material('sulfur'), material('vanadium') * 2)
    .separatedInto(material('vanadium'), material('sulfur'))
    .addOreByproducts(material('lead'), material('copper'))
    .build()

materialBuilder(31916, 'coltan')
    .color(0x544a41)
    .ore(true)
    .flags()
    .iconSet('FINE')
    .components(material('tantalum'), material('asbestos') * 2)
    .addOreByproducts(material('tantalum'), material('asbestos'), material('gypsum'))
    .build()

materialBuilder(31917, 'ragnokaldite')
    .color(0xAB8C5E)
    .ore(true)
    .flags()
    .components(material('mithglar'), material('freyrite'), material('skadiite'))
    .addOreByproducts(material('mithglar'))
    .iconSet('SAND')
.build();

materialBuilder(31712, 'baldrikite')
    .color(0x3A4B6E)
    .ore(true)
    .flags()
    .components(material('skadiite'), material('geldrun'), material('vidium'))
    .addOreByproducts(material('skadiite'))
    .iconSet('FINE')
.build();

materialBuilder(31713, 'eldrithnarite')
    .color(0xFFD700)
    .ore(true)
    .flags()
    .components(material('geldrun'), material('freyrite'), material('trimla'))
    .addOreByproducts(material('geldrun'))
    .iconSet('SAND')
.build();

materialBuilder(31714, 'vikrundite')
    .color(0x4F8A10)
    .ore(true)
    .flags()
    .components(material('vidium'), material('mithglar'), material('skadiite'))
    .addOreByproducts(material('vidium'))
    .iconSet('METALLIC') // Default
.build();

materialBuilder(31715, 'dunratharite')
    .color(0x6E0F0F)
    .ore(true)
    .flags()
    .components(material('freyrite'), material('geldrun'), material('rodanil'))
    .addOreByproducts(material('freyrite'))
    .iconSet('FINE')
.build();

materialBuilder(31716, 'krysthvalite')
    .color(0x2F4F4F)
    .ore(true)
    .flags()
    .components(material('swartim'), material('rodanil'), material('dowmandir'))
    .addOreByproducts(material('swartim'))
    .iconSet('SAND')
.build();

materialBuilder(31717, 'hagronarite')
    .color(0x7A4B3B)
    .ore(true)
    .flags()
    .components(material('trimla'), material('breytir'), material('mithglar'))
    .addOreByproducts(material('trimla'))
    .iconSet('FINE')
.build();

materialBuilder(31718, 'brokfangite')
    .color(0x7C7A7A)
    .ore(true)
    .flags()
    .components(material('rodanil'), material('swartim'), material('freyrite'))
    .addOreByproducts(material('rodanil'))
    .iconSet('SAND')
.build();

materialBuilder(31719, 'drakonirith')
    .color(0x3E9B77)
    .ore(true)
    .flags()
    .components(material('drustins'), material('geadris'), material('dowmandir'))
    .addOreByproducts(material('drustins'))
    .iconSet('METALLIC') // Default
.build();

materialBuilder(31720, 'blodkragarite')
    .color(0x5F4B3C)
    .ore(true)
    .flags()
    .components(material('dowmandir'), material('trimla'), material('breytir'))
    .addOreByproducts(material('dowmandir'))
    .iconSet('FINE')
.build();

materialBuilder(31721, 'jarnfrostrite')
    .color(0xBA5A31)
    .ore(true)
    .flags()
    .components(material('breytir'), material('geadris'), material('mithglar'))
    .addOreByproducts(material('breytir'))
    .iconSet('SAND')
.build();

materialBuilder(31722, 'aegirith')
    .color(0x9E3D3D)
    .ore(true)
    .flags()
    .components(material('geadris'), material('drustins'), material('geldrun'))
    .addOreByproducts(material('geadris'))
    .iconSet('FINE')
.build();

materialBuilder(31723, 'coralium')
    .color(0x126c77)
    .ore()
    .gem()
    .flags()
    .iconSet('FINE')
.build();

materialBuilder(31725, 'rich_coralium')
    .color(0x126c77)
    .ore(true)
    .flags()
    .iconSet('FINE')
.build();

materialBuilder(31724, 'aquivite')
    .color(0x0d9aff)
    .ore(true)
    .flags()
.build();

materialBuilder(31726, 'alkimvite')
    .color(0x002e99)
    .ore()
    .flags()
.build();

materialBuilder(31727, 'ignivite')
    .color(0xfc4103)
    .ore()
    .flags()
.build();

materialBuilder(31728, 'terratite')
    .color(0x03c200)
    .ore()
    .flags()
.build();

materialBuilder(31729, 'aeratite')
    .color(0xf4ff54)
    .ore()
    .flags()
.build();

materialBuilder(31730, 'ordominite')
    .color(0xffffff)
    .ore()
    .flags()
.build();

materialBuilder(31731, 'perditionite')
    .color(0x000000)
    .ore()
    .flags()
.build();


materialBuilder(31733, 'lunarsapphire')
    .colorAverage()
    .ore(true)
    .flags()
    .components(material('sapphire'))
.build();
}
