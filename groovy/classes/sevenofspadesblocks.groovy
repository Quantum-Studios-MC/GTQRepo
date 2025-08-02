import static gregtech.common.metatileentities.MetaTileEntities.registerMetaTileEntity;
import gregtech.api.metatileentity.SimpleMachineMetaTileEntity;
import gregtech.api.GTValues
import gregtech.api.recipes.RecipeMaps;
import gregtech.client.renderer.texture.Textures;
import gregtech.client.rerer.ICubeRenderer;
import gregtech.api.recipes.RecipeMap;
import gregtech.api.util.GTUtility;

import java.util.function.Function;

import net.minecraft.util.ResourceLocation

public class MetaTileEntities {
public static final def THAUMIC_FURNACE = new SimpleMachineMetaTileEntity[GTValues.V.length - 1]
  
    private static void registerSimpleMTE(SimpleMachineMetaTileEntity[] machines, int maxTier, int startId, String name, RecipeMap<?> map, ICubeRenderer texture, boolean hasFrontFacing, Function<Integer, Integer> tankScalingFunction) {
        for (int i = 0; i <= maxTier; i++) {
            machines[i] = registerMetaTileEntity(startId + i, new SimpleMachineMetaTileEntity(gtaurora(String.format("%s.%s", name, GTValues.VN[i + 1].toLowerCase())), map, texture, i + 1, hasFrontFacing, tankScalingFunction));
        }
    }

    public static ResourceLocation gtaurora(String name) {
      return resource("gtaurora", "thaumic_furnace")  
    }
    
    public static void init() {
      registerSimpleMTE(THAUMIC_FURNACE, 32000, 12, "thaumic_furnace", RecipeMaps.THAUMIC_FURNACE, Textures.ALLOY_SMELTER, [hasFrontFacing (true)], GTUtility.defaultTankSizeFunction) 
    }

  private static final RecipeMap<SimpleRecipeBuilder> THAUMIC_FURNACE = new RecipeMap<>("thaumic_furnace", 2, 1, 1, 0, new SimpleRecipeBuilder(), false)


}