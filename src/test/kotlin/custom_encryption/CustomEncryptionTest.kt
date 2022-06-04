package custom_encryption

import org.junit.Assert.*
import org.junit.Test

class CustomEncryptionTest {

    @Test
    fun encryptThenDecryptText_returnOriginalText(){
        val text = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#\$%^&*()`-=[];,./~_+{}|:<>?\" "
        val encryptedText = encryptedMessage(text, "The Hunter")
        val decryptedText = decryptedMessage(encryptedText, "The Hunter")
        assertEquals(text, decryptedText)
    }
}