import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/*
 * Author : David Dorneau
 * 10/3/2018
 * CIS_5371
 * DES Implementation
 */
public class Encryption {

	private
	//member variables
	String theSecretKey,
	thePlainText;
	byte [] theCipherText;

	//member methods
	SecretKey encryptThePlainText() throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, IllegalBlockSizeException, BadPaddingException {

		//specify encryption scheme, mode of operation & padding type
		/*
		 * we specify padding to ensure that we have the correct length of plaintext, 
		 * instead of checking for it during the time of user input. That way we fill each set of length 8 blocks.
		 */
		Cipher myCipher = Cipher.getInstance("DES/ECB/PKCS5Padding");

		//convert the secret  key string into Bytes
		byte [] yourKeyInBytes = theSecretKey.getBytes();

		//wrap the users key
		SecretKey secretKey = new SecretKeySpec(yourKeyInBytes, "DES");

		//do the encryption and return as an array of bytes
		myCipher.init(Cipher.ENCRYPT_MODE, secretKey);

		theCipherText = myCipher.doFinal(thePlainText.getBytes());

		return secretKey;

	}

	//getters and setter
	void setTheSecretKey(String aSecretKey) {
		theSecretKey = aSecretKey;
	}

	void setThePlainText(String aPlainText) {
		thePlainText = aPlainText;
	}
	byte [] getTheCipherText() {

		return theCipherText;
	}
}
