# The Hazard System
All in all the Hazard System in HBM:NTMCe is Pretty easy to work with 

All the Groovy Scripts for the Hazard System are to be Placed in the preInit Folder

Pre Registration:
Before you Register a Hazard i recommend importing all the HBM Components and Pre-Defining the Hazards that you want to use.
(This Example uses the Radiation Hazard):


```java
import com.hbm.hazard.HazardSystem; 
import com.hbm.hazard.type.*;
import com.hbm.hazard.HazardData;
import com.hbm.hazard.type.HazardTypeRadiation;

final HazardTypeBase RADIATION = new HazardTypeRadiation():
```
Of course you are free to use Multiple Hazard Types: 

```java
final HazardTypeBase RADIATION = new HazardTypeRadiation():
final HazardTypeBase HOT = new HazardTypeHot():
```

The Hazard Types currently are: 
```java
HazardTypeAsbestos() => ASBESTOS
HazardTypeBlinding() => BLINDING
HazardTypeCoal() => COAL
HazardTypeCold() => COLD
HazardTypeDigamma() => DIGAMMA 
HazardTypeExplosive() => EXPLOSIVE
HazardTypeHot() => HOT
HazardTypeHydroactive() => HYDROACTIVE
HazardTypeRadiation() => RADIATION
HazardTypeToxic() => TOXIC
```

Then One of the Most Important things, the makeData Function.
It is used to Define what type of Hazard is added to the item an how strong it is and packs it all together.
(Just copy this, might implement some tools if i feel like it to make this a bit easier):

```java 
private static HazardData makeData(HazardTypeBase hazard, float level) 
{
    return new HazardData().addEntry(hazard, level); 
}
```

## Adding the Hazard to the Item 

```java
//Design of the Register Function:
HazardSystem.register("oreDictName", makeData(Hazard, strength));

//Example, Adding a Radiation of 5.0 RAD/s to Iron Ingot:
HazardSystem.register("ingotIron", makeData(RADIATION, 5.0F));

//Example, Adding a Radiation of 5.0 RAD/s and a Hot of level 5.0f 
HazardSystem.register("ingotIron", makeData(RADIATION, 5.0F).addEntry(HOT, 5.0F));
```

Source: [Hazard System HBM:NTMCE](https://github.com/MisterNorwood/Hbm-s-Nuclear-Tech-CE/tree/master/src/main/java/com/hbm/hazard)


## The Hazard Helper
The [Hazard Helper](../hbm/HazardHelper/HazardHelper.py) is a Python Script written by me, to help with Generating a lot of Hazards at Once that share the same Name.

An Example of what the Hazard Helper does can be seen in [Radtiation.groovy](../../preInit/items/radiation.groovy)

I recommend modifying Hazard Helper to your needs. !!
If you want to just generate the Hazard exactly to the OreDictName use the ```cs``` modifier
The Hazard Helper works best if you need to generate lots of register for one type of Item like Gregtech Items for example: uranium238 for all types of processed uranium238

!! The Hazard Helper currently just Supports the Radiation Hazard, will work on that though!!

Input Data Structure Example:
```
oreDict : floatValue : modifier
```

Example Adding Radiation of 5.0F to Iron Ingot 
```
ingotIron : 5.0F : cs
```