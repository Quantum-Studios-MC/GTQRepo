

import net.minecraft.item.ItemFood
import net.minecraft.potion.PotionEffect
import net.minecraft.potion.Potion
import net.minecraft.item.ItemStack
import net.minecraft.world.World
import net.minecraft.entity.player.EntityPlayer
import net.minecraft.item.Item


content.createItem('botathaumamanic_glass_board').register()
content.createItem('quantum_credit').register()
content.createItem('racism').register()
content.createItem('starmetal_cobalt_processing_module_component').register()
content.createItem('schrabidium_neutronium_processing_module_component').register()
content.createItem('hume_field_regulation_component').register()
content.createItem('circuit.exotic_mainframe').register()
content.createItem('circuit.exotic_assemblyanim').register()
content.createItem('circuit.exotic_capsule').register()
content.createItem('data.neutrino').register()
content.createItem('data.elementary').register()
content.createItem('data.subatomic').register()
content.createItem('data.nuclear').register()
content.createItem('circuit.optical_mainframe').register()
content.createItem('circuit.optical_assembly').register()
content.createItem('circuit.optical_processor').register()
content.createItem('circuit.optical_array').register()
content.createItem('circuit_board.optical').register()
content.createBlock('superschrabidiccasing').register()
content.createItem('circuit.amped_wetware_mainframe').register()
content.createItem('circuit.amped_wetware_assembly').register()
content.createItem('circuit.amped_wetware_processor').register()
content.createItem('circuit.amped_wetware_array').register()
content.createItem('circuit_board.amped_wetware').register()
content.createItem('contraschrabidic_core').register()
content.createItem('etched_draconic_plate').register()
content.createItem('space_data_t1').register()
content.createItem('token_lucifer').register()
// blocks
content.createBlock('deco_computer').register()
content.createBlock('machine_casing_ampridge').register()
content.createBlock('machine_casing_bioreactor').register()

// juicey beans

content.registerItem('juicey_beans', (new ItemFood(999, 999, false) {
    protected void onFoodEaten(ItemStack stack, World worldIn, EntityPlayer player) {
        if (!worldIn.isRemote) {
            player.addPotionEffect(new PotionEffect(Potion.getPotionFromResourceLocation('minecraft:regeneration'), 240000, 3, false, false))
            player.addPotionEffect(new PotionEffect(Potion.getPotionFromResourceLocation('minecraft:resistance'), 240000, 3, false, false))
        }
    }
}).setAlwaysEdible())

class ItemWithDurability extends Item {

    ItemWithDurability(int durability) {
        maxStackSize = 1
        setMaxDamage(durability)
    }

}

content.registerItem("elemental_relic", new ItemWithDurability(50))

content.registerItem('brachy_juice', (new ItemFood(2, 3, true) {
    protected void onFoodEaten(ItemStack stack, World worldIn, EntityPlayer player) {
        if (!worldIn.isRemote) {
            player.addPotionEffect(new PotionEffect(Potion.getPotionFromResourceLocation('minecraft:regeneration'), 240000, 3, false, false))
            player.addPotionEffect(new PotionEffect(Potion.getPotionFromResourceLocation('minecraft:resistance'), 240000, 3, false, false))
        }
    }
}).setAlwaysEdible())

