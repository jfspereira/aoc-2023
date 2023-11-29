const val defaultExample1 = "_example1.txt"
const val defaultExample2 = "_example2.txt"
const val defaultPart1 = "_part1.txt"
const val defaultPart2 = "_part2.txt"

class InputFileLocator{
    companion object{
        fun getExample1(dayConstant: DayConstantEnum): String{
            return "$dayConstant.directory$defaultExample1"
        }
        fun getExample2(dayConstant: DayConstantEnum): String{
            return "$dayConstant.directory$defaultExample2"
        }
        fun getPart1(dayConstant: DayConstantEnum): String{
            return "$dayConstant.directory$defaultPart1"
        }
        fun getPart2(dayConstant: DayConstantEnum): String{
            return "$dayConstant.directory$defaultPart2"
        }
    }

    enum class DayConstantEnum(val directory: String) {
        DAY_1("d1/d1"),
        DAY_2("d2/d2"),
        DAY_3("d3/d3"),
        DAY_4("d4/d4"),
        DAY_5("d5/d5"),
        DAY_6("d6/d6"),
        DAY_7("d7/d7"),
        DAY_8("d8/d8"),
        DAY_9("d9/d9"),
        DAY_10("d10/d10"),
        DAY_11("d11/d11"),
        DAY_12("d12/d12"),
        DAY_13("d13/d13"),
        DAY_14("d14/d14"),
        DAY_15("d15/d15"),
        DAY_16("d16/d16"),
        DAY_17("d17/d17"),
        DAY_18("d18/d18"),
        DAY_19("d19/d19"),
        DAY_20("d20/d20"),
        DAY_21("d21/d21"),
        DAY_22("d22/d22"),
        DAY_23("d23/d23"),
        DAY_24("d24/d24"),
        DAY_25("d25/d25");
    }
}