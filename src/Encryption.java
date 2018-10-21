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
 * 10/20/2018
 * CIS_5371
 * ElGamal Implementation
 */
public class Encryption {

	private
	//member variables
	String thePlainText;
	int theKeyLength;
	byte [] theCipherText;

	//member methods
	void encryptThePlainText() {



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
