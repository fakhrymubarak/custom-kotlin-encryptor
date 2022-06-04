import custom_encryption.CustomEncryption.decryptedMessage
import custom_encryption.CustomEncryption.encryptedMessage

fun main() {
    var isAppRun = true
    while (isAppRun) {
        println("Hello! This is cli for encrypt and decrypt message!")
        println("Do you want to encrypt or decrypt message? e/d/x(exit)")
        val appOption: AppOption =
            when (readln().lowercase()) {
                "e" -> AppOption.ENCRYPT
                "d" -> AppOption.DECRYPT
                "x" -> AppOption.EXIT
                else -> AppOption.DASHBOARD
            }

        when (appOption) {
            AppOption.DASHBOARD -> continue
            AppOption.ENCRYPT -> inputEncryptWithKey()
            AppOption.DECRYPT -> inputDecryptWithKey()
            AppOption.EXIT -> isAppRun = false
        }

    }
}

private fun inputDecryptWithKey() {
    print("Input text to decrypt: ")
    val plainText = readln()
    print("Input decryption key: ")
    val key = readln()
    val decryptedMessage = decryptedMessage(plainText, key)
    println("Your encrypted text: $decryptedMessage")
}

private fun inputEncryptWithKey() {
    print("Input text to encrypt: ")
    val plainText = readln()
    print("Input encryption key: ")
    val key = readln()
    val encryptedMessage = encryptedMessage(plainText, key)
    println("Your encrypted text: $encryptedMessage")
}

enum class AppOption {
    DASHBOARD,
    ENCRYPT,
    DECRYPT,
    EXIT
}
