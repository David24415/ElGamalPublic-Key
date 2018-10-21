import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/*
 * Author : David Dorneau
 * 10/20/2018
 * CIS_5371
 * ElGamal Implementation
 */
public class Encryption {

	private
	//member variables
	String thePlainText;
	int theKeyLength;
	byte [] theCipherText,
			yourPlainTextInBytes;

	//member methods
	Key encryptThePlainText() throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, IllegalBlockSizeException, BadPaddingException {
		
		yourPlainTextInBytes = thePlainText.getBytes();
		Cipher cipher = Cipher.getInstance("ElGamal/None/NoPadding");
		KeyPairGenerator myKeyGen = KeyPairGenerator.getInstance("ElGamal");
		
		SecureRandom myRandomNum = new SecureRandom();
		
		myKeyGen.initialize(theKeyLength, myRandomNum);
		KeyPair pair = myKeyGen.generateKeyPair();
		
		Key publicKey = pair.getPublic();
		Key privateKey = pair.getPrivate();
		
		cipher.init(cipher.ENCRYPT_MODE,publicKey,myRandomNum);
		theCipherText = cipher.doFinal(yourPlainTextInBytes);
		return privateKey;



	}

	//getters and setter

	void setThePlainText(String aPlainText) {
		thePlainText = aPlainText;
	}
	
	void setTheKeyLength(int aKeylength) {
		theKeyLength = aKeylength;
	}
	
	byte [] getTheCipherText() {

		return theCipherText;
	}
	
}
