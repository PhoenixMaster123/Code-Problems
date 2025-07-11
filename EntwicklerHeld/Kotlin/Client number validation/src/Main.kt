fun main() {

    val clientNumber = "8456894318"

    println(validateClientNumber(clientNumber))
}

fun validateClientNumber(clientNumber: String): Boolean
{

    ///////////////////////////////////// Variant 2 - super short //////////////////////////////////
    /*
    return clientNumber.matches(Regex("\\d{10}")) && clientNumber.toLong().countOneBits() % 2 == 0
     */
    ///////////////////////////////////// Variant 1 //////////////////////////////////

     if (!clientNumber.matches("[0-9]{10}".toRegex())) {
        return false
    }

    val number = clientNumber.toLongOrNull() ?: return false // Convert the string to a Long

    return number.countOneBits() % 2 == 0 // Check if the number of set bits is even
    ///////////////////////////////////// Variant 2 //////////////////////////////////
    /*var verify = false
    var counter = 0

    val pass = clientNumber.toCharArray()

    for (i in pass.indices)
    {
        if(pass[i] in '0'..'9')
        {
            verify = true
        }
        else
        {
            verify = false
            return false
        }
    }

    val number = clientNumber.toLong()
    val binary = number.toString(2)
    val num = binary.toCharArray()

    for (i in num.indices)
    {
        if(num[i] == '1')
        {
            counter++
        }
    }
   return clientNumber.length == 10 && verify && counter % 2 == 0

     */
}
