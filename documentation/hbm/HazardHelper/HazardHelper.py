import os;
def convert_file(input_path, output_path):

    subHazards = []
    addEntries = ""

    def handle_gtdusts(name, float_value, mainHaz):
        outfile.write(f'HazardSystem.register("dustTiny{name}", makeData({mainHaz}, {round(float_value / 9.0, 2)}F)){addEntries};\n')
        outfile.write(f'HazardSystem.register("dustSmall{name}", makeData({mainHaz}, {round(float_value/4, 2)}F)){addEntries};\n')
        outfile.write(f'HazardSystem.register("dust{name}", makeData({mainHaz}, {float_value}F)){addEntries};\n')

    def handle_gtingot(name, float_value, mainHaz):
        outfile.write(f'HazardSystem.register("nugget{name}", makeData({mainHaz}, {round(float_value/9, 2)}F)){addEntries};\n')
        outfile.write(f'HazardSystem.register("ingot{name}", makeData({mainHaz}, {float_value}F)){addEntries};\n')
        outfile.write(f'HazardSystem.register("block{name}", makeData({mainHaz}, {float_value*9}F)){addEntries};\n')

    def handle_gtitems(name, float_value, mainHaz):
        outfile.write(f'HazardSystem.register("plate{name}", makeData({mainHaz}, {float_value}F)){addEntries};\n')
        outfile.write(f'HazardSystem.register("stick{name}", makeData({mainHaz}, {round(float_value/2, 2)}F)){addEntries};\n')
        outfile.write(f'HazardSystem.register("gear{name}", makeData({mainHaz}, {round(float_value*5, 2)}F)){addEntries};\n')

    def handle_gtorerw(name, float_value, mainHaz):
        outfile.write(f'HazardSystem.register("dustImpure{name}", makeData({mainHaz}, {float_value}F)){addEntries};\n')
        outfile.write(f'HazardSystem.register("dustPure{name}", makeData({mainHaz}, {float_value}F)){addEntries};\n')
        outfile.write(f'HazardSystem.register("crushed{name}", makeData({mainHaz}, {float_value}F)){addEntries};\n')
        outfile.write(f'HazardSystem.register("crushedPurified{name}", makeData({mainHaz}, {float_value}F)){addEntries};\n')
        outfile.write(f'HazardSystem.register("crushedCentrifuged{name}", makeData({mainHaz}, {float_value}F)){addEntries};\n')

    def handle_cs(name, float_value, mainHaz):
        outfile.write(f'HazardSystem.register("{name}", makeData({mainHaz}, {float_value}F)){addEntries};')

    def buildAddEntry():    
        nonlocal addEntries
        for hazard in subHazards:
            addEntries += f'.addEntry({hazard_enum[hazard["name"]]},{hazard["value"]}F)'

    modifier_handlers = {
        "gtDusts": handle_gtdusts,
        "gtIngots": handle_gtingot,
        "gtItems": handle_gtitems,
        "gtOreRaw": handle_gtorerw,
        "cs": handle_cs
    }
    hazard_enum = {
        "rad": "RADIATION",
        "hot": "HOT",
        "dig": "DIGAMMA",
        "blnd": "BLINDING",
        "asb": "ASBESTOS",
        "col": "COAL",
        "hyd": "HYDROACTIVE",
        "exp": "EXPLOSIVE"
    }

    with open(input_path, 'r') as infile, open(output_path, 'w') as outfile:
        for line in infile:
            line = line.strip()
            if not line or ':' not in line:
                continue 

            try:
                addEntries = ""
                # God i love String Manipulation
                name, value, mainHaz ,modifier, subHazs = map(str.strip, line.split(":"))
                float_value = float(value)
                modifiers = modifier.split(',')
                hasSubHazs = subHazs != '' and subHazs != ""

                if hasSubHazs : 
                    subHazs = subHazs.rstrip("!")
                    subPairs = subHazs.split("!")
                    structuredSubPairs = [{"name": name, "value": float(value)} for name, value in (pair.split(",") for pair in subPairs)]
                    subHazards = structuredSubPairs
       
                if hasSubHazs:
                    buildAddEntry()

                for key, handler in modifier_handlers.items():
                    if key in modifiers:
                        handler(name, float_value, hazard_enum[mainHaz])

                outfile.write('\n')

            except ValueError as e:
                print(f"Skipping invalid line: {line}, {e}")

# Example usage:
 
convert_file("data.txt", "output.txt")
