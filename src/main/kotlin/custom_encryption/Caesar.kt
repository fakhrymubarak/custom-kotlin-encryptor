package custom_encryption

import custom_encryption.CustomEncryption.mapOfAlphanumeric

object Caesar {
    fun Char.encryptedWithCaesar(key: Int): Char {
        val maxSizeOfChar = mapOfAlphanumeric.keys.size
        val charPos = mapOfAlphanumeric.keys.indexOf(this)
        val offset = key % maxSizeOfChar
        if (offset == 0) return this
        val encryptedPosition = (charPos + offset)
        val fixEncryptedPosition =
            if (encryptedPosition >= maxSizeOfChar)
                encryptedPosition - maxSizeOfChar
            else if (encryptedPosition < 0)
                encryptedPosition + maxSizeOfChar
            else
                encryptedPosition
        return mapOfAlphanumeric.keys.toList()[fixEncryptedPosition]
    }

    fun Char.decryptWithCaesar(key: Int): Char =
        this.encryptedWithCaesar(mapOfAlphanumeric.keys.size - key)
}