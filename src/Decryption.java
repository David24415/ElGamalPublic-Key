/*
 * Author : Jammy Jean
 * 10/6/2018
 * CIS_5371
 * DES Implementation
 */

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;

public class Decryption {
	/*
	 * sources for completing this class:
	 * https://www.baeldung.com/java-cipher-class
	 * https://www.programcreek.com/java-api-examples/javax.crypto.Cipher
	 * 
	 */

	private
	//member variables
	SecretKey theSecretKey;
	String thePlainText;
	byte [] theEncryptedText,
	theCipherText;

	//member methods
	String decryptThePlainText() throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, IllegalBlockSizeException, BadPaddingException {
		Cipher myCipher = Cipher.getInstance("DES/ECB/PKCS5Padding");

		//do the encryption and return as an array of bytes
		myCipher.init(Cipher.DECRYPT_MODE, theSecretKey);

		theCipherText = myCipher.doFinal(theEncryptedText);

		return new String(theCipherText);
	}

	//getters and setter
	void setTheSecretKey(SecretKey aSecretKey) {
		theSecretKey = aSecretKey;
	}

	void setThePlainText(String aPlainText) {
		thePlainText = aPlainText;
	}

	void setCipherText(byte [] CipherText)
	{
		theEncryptedText = CipherText;
	}

}
