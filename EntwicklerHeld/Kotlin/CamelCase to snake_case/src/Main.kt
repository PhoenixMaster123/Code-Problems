fun main() {

    val input1 = mapOf(
            "bookName" to "The Pragmatic Programmer",
    "price" to 29.99,
    "author" to mapOf(
        "firstName" to "Andy",
        "lastName" to "Hunt"
    )
    )

    val input2 = mapOf(
        "bookName" to "The Pragmatic Programmer",
        "price" to 29.99,
        "authors" to listOf(
            mapOf(
                "firstName" to "Andy",
                "lastName" to "Hunt",
                "phoneNumbers" to listOf(
                    mapOf(
                        "type" to "home",
                        "phoneNumber" to "49 228 42150-0"
                    ),
                    mapOf(
                        "type" to "mobile",
                        "phoneNumber" to "0173-9568472"
                    )
                )
            ),
            mapOf(
                "firstName" to "Dave",
                "lastName" to "Thomas",
                "phoneNumbers" to listOf(
                    mapOf(
                        "type" to "home",
                        "phoneNumber" to "49 228 42150-0"
                    ),
                    mapOf(
                        "type" to "mobile",
                        "phoneNumber" to "0173-9568472"
                    )
                )
            )
        )
    )
    println(camelcaseToSnakeCase(input1))
    println(camelcaseToSnakeCase(input2))
}

fun camelcaseToSnakeCase(map: Map<String, Any>): Map<String, Any> {
    ////////////////////////////////////// Variant 1 //////////////////////////////
   /* return map.mapKeys { (key, _) ->
        camelToSnake(key)
    }.mapValues { (_, value) ->
        when (value) {
            is Map<*, *> -> camelcaseToSnakeCase(value as Map<String, Any>)
            is List<*> -> value.map { item ->
                if (item is Map<*, *>) camelcaseToSnakeCase(item as Map<String, Any>)
                else item
            }
            else -> value
        }
    }

    */
    ////////////////////////////////////// Variant 2 //////////////////////////////
    return map.mapValues { (_, value) ->
        when (value) {
            is Map<*, *> -> camelcaseToSnakeCase(value as Map<String, Any>)
            is List<*> -> value.map { item ->
                if (item is Map<*, *>) camelcaseToSnakeCase(item as Map<String, Any>)
                else item
            }
            else -> value
        }
    }.mapKeys { (key, _) ->
        camelToSnake(key)
    }
}

fun camelToSnake(input: String): String {
    ////////////////////////////////////// Variant 1 //////////////////////////////
   /* val regex = "([a-z])([A-Z])".toRegex()
    return input.replace(regex, "$1_$2").toLowerCase()

    */
    ////////////////////////////////////// Variant 2 //////////////////////////////
    val builder = StringBuilder()
    for (char in input) {
        if (char.isUpperCase()) {
            builder.append('_').append(char.toLowerCase())
        } else {
            builder.append(char)
        }
    }
    return builder.toString()
}

