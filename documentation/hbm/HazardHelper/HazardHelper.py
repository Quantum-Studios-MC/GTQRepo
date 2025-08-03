def convert_file(input_path, output_path):
    with open(input_path, 'r') as infile, open(output_path, 'w') as outfile:
        for line in infile:
            line = line.strip()
            if not line or ':' not in line:
                continue  # skip empty or malformed lines

            try:
                name, value, modifier = map(str.strip, line.split(":", 2))
                float_value = float(value)  # validate it's a float

                if modifier == 'full' or modifier == '´dustIngot' or modifier == 'onlySmallDust':
                    outfile.write(f'HazardSystem.register("dustTiny{name}", makeData(RADIATION, {round(float_value/9, 2)}F));\n')
                    outfile.write(f'HazardSystem.register("dustSmall{name}", makeData(RADIATION, {round(float_value/4, 2)}F));\n')
                if modifier == 'full':
                    outfile.write(f'HazardSystem.register("dustImpure{name}", makeData(RADIATION, {float_value}F));\n')
                    outfile.write(f'HazardSystem.register("dustPure{name}", makeData(RADIATION, {float_value}F));\n')
                    outfile.write(f'HazardSystem.register("crushed{name}", makeData(RADIATION, {float_value}F));\n')
                    outfile.write(f'HazardSystem.register("crushedPurified{name}", makeData(RADIATION, {float_value}F));\n')
                    outfile.write(f'HazardSystem.register("crushedCentrifuged{name}", makeData(RADIATION, {float_value}F));\n')
                    outfile.write(f'HazardSystem.register("plate{name}", makeData(RADIATION, {float_value}F));\n')
                    outfile.write(f'HazardSystem.register("stick{name}", makeData(RADIATION, {round(float_value/2, 2)}F));\n\n')
                if modifier == 'dustIngot':
                    outfile.write(f'HazardSystem.register("nugget{name}", makeData(RADIATION, {round(float_value/9, 2)}F));\n')
                    outfile.write(f'HazardSystem.register("dust{name}", makeData(RADIATION, {float_value}F));\n')
                    outfile.write(f'HazardSystem.register("ingot{name}", makeData(RADIATION, {float_value}F));\n')
                    outfile.write(f'HazardSystem.register("block{name}", makeData(RADIATION, {float_value*9}F));\n')

                if modifier == 'cs':
                    outfile.write(f'HazardSystem.register("{name}", makeData(RADIATION, {float_value}F));')

                outfile.write('\n')

            except ValueError:
                print(f"Skipping invalid line: {line}")

# Example usage:
convert_file("input.txt", "output.txt")


## Uranium238 : 0.25 : full
## Uranium235 : 1.0 : full
## Radium : 7.5 : dustIngot
## Actinium : 30.0 : dustIngot
## Neptunium : 7.5 : onlySmallDust
## Americium : 8.5 : full
## Americium : 8.5 : dustIngot
## Plutonium239 : 5.0 : full
## Thorium : 0.1 : full
## Technetium : 2.75 : dustIngot
