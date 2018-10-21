/*
 * Author : Jammy Jean
 * 10//2018
 * CIS_5371
 * ElGamal Implementation
 */

import javax.crypto.SecretKey;

public class Decryption {
	

	private
	//member variables
	SecretKey theSecretKey;
	String thePlainText;
	byte [] theEncryptedText,
	theCipherText;

	
	

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
