package custom_encryption

import custom_encryption.Caesar.decryptWithCaesar
import custom_encryption.Caesar.encryptedWithCaesar

object CustomEncryption {
    fun encryptedMessage(str: String, key: String): String {
        var encryptedMessage = ""
        val numericKey = key.sumOf { it.code }
        str.toCharArray().forEach { strChar ->
            mapOfAlphanumeric.forEach { (key, value) ->
                if (strChar == key) {
                    encryptedMessage = encryptedMessage.plus(
                        value.map { it.encryptedWithCaesar(numericKey) }.toCharArray().concatToString()
                    )
                }
            }
        }
        return encryptedMessage
    }

    fun decryptedMessage(encryptedText: String, key: String): String {
        var decryptedMessage = ""
        val numericKey = key.sumOf { it.code }
        encryptedText.chunked(3).forEach { decryptedChar ->
            val alphaNumericValue =
                decryptedChar.map { it.decryptWithCaesar(numericKey) }.toCharArray().concatToString()
            mapOfAlphanumeric.forEach { (key, value) ->
                if (alphaNumericValue == value) {
                    decryptedMessage = decryptedMessage.plus(key)
                }
            }
        }
        return decryptedMessage
    }

    val mapOfAlphanumeric = mutableMapOf(
        'A' to "a8a",
        'B' to "7d9",
        'C' to "a4d",
        'D' to "92f",
        'E' to "246",
        'F' to "1e0",
        'G' to "43f",
        'H' to "74c",
        'I' to "cae",
        'J' to "c0d",
        'K' to "9c2",
        'L' to "147",
        'M' to "c86",
        'N' to "d44",
        'O' to "c54",
        'P' to "933",
        'Q' to "37c",
        'R' to "5bf",
        'S' to "7da",
        'T' to "af3",
        'U' to "986",
        'V' to "01c",
        'W' to "4c8",
        'X' to "276",
        'Y' to "bec",
        'Z' to "4f0",
        'a' to "f3e",
        'b' to "17a",
        'c' to "9da",
        'd' to "214",
        'e' to "a31",
        'f' to "101",
        'g' to "773",
        'h' to "c93",
        'i' to "671",
        'j' to "f8e",
        'k' to "02c",
        'l' to "694",
        'm' to "528",
        'n' to "5ac",
        'o' to "c5a",
        'p' to "e28",
        'q' to "91d",
        'r' to "60e",
        's' to "c74",
        't' to "86b",
        'u' to "f66",
        'v' to "887",
        'w' to "20f",
        'x' to "a9b",
        'y' to "076",
        'z' to "77a",
        '0' to "43c",
        '1' to "7dd",
        '2' to "34c",
        '3' to "d37",
        '4' to "95d",
        '5' to "d55",
        '6' to "cc3",
        '7' to "aff",
        '8' to "f09",
        '9' to "20d",
        '!' to "1d3",
        '@' to "53a",
        '#' to "575",
        '$' to "cb0",
        '%' to "c44",
        '^' to "766",
        '&' to "e2a",
        '*' to "96f",
        '(' to "cb7",
        ')' to "72b",
        '`' to "225",
        '-' to "b5e",
        '=' to "307",
        '[' to "e8b",
        ']' to "608",
        ';' to "f2a",
        ',' to "e6d",
        '.' to "c07",
        '/' to "962",
        '~' to "b58",
        '_' to "535",
        '+' to "be5",
        '{' to "77c",
        '}' to "a87",
        '|' to "9b3",
        ':' to "b5b",
        '<' to "ede",
        '>' to "e39",
        '?' to "f36",
        '"' to "86f",
        ' ' to "86x",
    )

}