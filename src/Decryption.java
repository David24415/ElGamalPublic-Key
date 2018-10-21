/*
 * Author : Jammy Jean
 * 10//2018
 * CIS_5371
 * ElGamal Implementation
 */


/*
 * http://www.java2s.com/Tutorial/Java/0490__Security/ElGamalexamplewithrandomkeygeneration.htm
 * use the final lines on this example to implement the decryption
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
