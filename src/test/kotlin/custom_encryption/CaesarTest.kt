package custom_encryption

import custom_encryption.Caesar.decryptWithCaesar
import custom_encryption.Caesar.encryptedWithCaesar
import org.junit.Assert.assertEquals
import org.junit.Test

class CaesarTest {
    @Test
    fun encryptWithCaesar_shouldEncryptAlphanumericChar_withKey1() {
        val text = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#\$%^&*()`-=[];,./~_+{}|:<>?\" "
        val expectedResult = "BCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#\$%^&*()`-=[];,./~_+{}|:<>?\" A"
        val key = 1
        text.forEachIndexed { index, char ->
            val encryptedChar = char.encryptedWithCaesar(key)
            assertEquals(encryptedChar, expectedResult[index])
        }
    }

    @Test
    fun decryptWithCaesar_shouldDecryptAlphanumericChar_withKey1() {
        val text = "BCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#\$%^&*()`-=[];,./~_+{}|:<>?\" A"
        val expectedResult = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#\$%^&*()`-=[];,./~_+{}|:<>?\" "
        val key = 1
        text.forEachIndexed { index, char ->
            val decryptedChar = char.decryptWithCaesar(key)
            assertEquals(decryptedChar, expectedResult[index])
        }
    }

    @Test
    fun encryptWithCaesar_shouldEncryptAlphanumericChar_withKey0until100000() {
        val text = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#\$%^&*()`-=[];,./~_+{}|:<>?\" "
        text.forEach { char ->
            for (i in 0..100000) {
                val encryptedChar = char.encryptedWithCaesar(i)
                assertEquals(encryptedChar, text.find { it == encryptedChar })
            }
        }
    }

    @Test
    fun decryptWithCaesar_shouldDecryptAlphanumericChar_withKey0until100000() {
        val text = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#\$%^&*()`-=[];,./~_+{}|:<>?\" "
        text.forEach { char ->
            for (i in 0..100000) {
                val decryptedChar = char.decryptWithCaesar(i)
                assertEquals(decryptedChar, text.find { it == decryptedChar })
            }
        }
    }
}