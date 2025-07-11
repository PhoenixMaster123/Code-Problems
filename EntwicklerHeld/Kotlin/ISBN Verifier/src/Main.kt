fun main() {

    val stringToVerify = "3-598-2X507-9"

    println(isValid(stringToVerify))

}

/////////////////////////////// Variant 2 - besser ////////////////////////////////
/*fun isValid(stringToVerify: String): Boolean {
    val normalized = stringToVerify.replace("-", "")
    if (!("^[0-9]{9}[0-9X]$".toRegex().matches(normalized))) {
        return false;
    }
    return normalized
        .map { c -> if (c == 'X') 10 else c.digitToInt() }
        .mapIndexed { i, d -> d * (10 - i) }
        .sum() % 11 == 0
}
 */
/////////////////////////////// Variant 3 ///////////////////////////////
/*fun isValid(stringToVerify: String): Boolean =
with (stringToVerify.replace("-", "")) {
    matches(Regex("\\d{9}[\\dX]")) &&
            mapIndexed { i, c -> c.asInt() * (10 - i) }.sum() % 11 == 0
}

fun Char.asInt(): Int = if (this.isDigit()) this - '0' else 10

 */
/////////////////////////////// Variant 4 ///////////////////////////////
fun isValid(stringToVerify: String): Boolean {
    val cleanedString = stringToVerify.replace("-", "")

    if(cleanedString.length != 10) {
        return false
    }

    val intList = cleanedString
        .toCharArray()
        .mapIndexed { index, it ->
            if(index == cleanedString.length-1 && it == 'X') {
                10
            } else if (it.isDigit()) {
                it.digitToInt()
            } else {
                return false
            }
        }

    val sum = intList
        .reduceIndexed { index, acc, char ->
            val sum = char*(11 - (intList.size - index))
            acc + sum
        }

    return sum % 11 == 0
}
////////////////////////////////////////// Variant my ///////////////////////////////
/*fun isValid(stringToVerify: String): Boolean
{
    val digits = stringToVerify.replace("-", "")

    if(digits.length != 10)
    {
        return false
    }
    val ch = digits.toCharArray()
    var isReadable = false
    var isX = false
    for(i in ch.indices)
    {
        if(ch[i] >= '0' && ch[i] <= '9' || ch[i] == 'X')
        {
            if(ch[i] == 'X')
            {
                isX = true
            }
            isReadable = true
        }
        else
        {
            isReadable = false
            break
        }
    }
    if(isX)
    {
        for (i in ch.indices)
        {
            if(ch[ch.indices.last] != 'X')
            {
                return false
            }
        }
    }
    if(!isReadable)
    {
        return false
    }
    var sum = 0
    var counter = 10
    for (i in ch.indices)
    {
        if(ch[i] == 'X')
        {
            sum += counter * 10
        }
        else
        {
            sum += counter * Character.getNumericValue(ch[i])
        }
        counter--
    }
    return sum % 11 == 0;
}

 */
