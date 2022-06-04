package custom_encryption

import org.junit.Assert.*
import org.junit.Test

class MapOfAlphanumericTest {
    @Test
    fun testMapOfAlphanumericIndex() {
        val text = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#\$%^&*()`-=[];,./~_+{}|:<>?\" "
        text.forEachIndexed { index, c ->
            assertEquals(index, mapOfAlphanumeric.keys.indexOf(c))
        }
    }

    @Test
    fun testMapOfAlphanumericSize() {
        val text = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#\$%^&*()`-=[];,./~_+{}|:<>?\" "
        assertEquals(text.length, mapOfAlphanumeric.keys.size)
    }
}