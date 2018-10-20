
/*
 * Authors : David Dorneau & Jammy Jean
 * 10/3/2018
 * CIS_5371
 * DES Implementation
 */

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
public class ElGamal {


	public static void main(String[] args) throws InvalidKeyException, 
	NoSuchAlgorithmException, 
	NoSuchPaddingException, 
	IllegalBlockSizeException, 
	BadPaddingException 
	{
		// TODO Auto-generated method stub

		String yourSecretKey;
		String yourPlainText;
		String OriginalText;
		SecretKey yourWrappedSecretKey;
		Scanner myIn = new Scanner(System.in);
		// use this to store the cipher text
		byte [] yourCipherText;

		//create encryption object
		Encryption myEncryption = new Encryption() ;


		//get the secret key from user
		do {

			System.out.println("please enter your secret key, making sure it is a 64 byte key(8 characters)");
			yourSecretKey = myIn.nextLine();

		}while(yourSecretKey.length() != 8);

		//get the plaintext from user
		System.out.println("please enter your plaintext");
		yourPlainText = myIn.nextLine();

		//set the plaintext and the secret key
		myEncryption.setThePlainText(yourPlainText);
		myEncryption.setTheSecretKey(yourSecretKey);

		//perform the encryption

		//use this secret key object for decryption as well
		yourWrappedSecretKey = myEncryption.encryptThePlainText();


		//output the encrypted message to the user in string format
		System.out.println("Your resulting cipher text is: " + new String(myEncryption.getTheCipherText()));

		/*use the ciphertext in stored in byte array format, and the secret key 
		 * object to do the decryption in the decryption class and output to user
		 * 
		 */

		//create decryption object
		Decryption myDecryption = new Decryption() ;

		//set CipherText and the secret key that resulted from the encryption
		yourCipherText = myEncryption.getTheCipherText();
		myDecryption.setTheSecretKey(yourWrappedSecretKey);
		myDecryption.setCipherText(yourCipherText);

		//make sure the decryption scheme knows what the plaintext from the user was
		myDecryption.setThePlainText(yourPlainText);

		//decrypt the cipherText using the Secret key, and return the resulting plaintext
		OriginalText = myDecryption.decryptThePlainText();

		System.out.println("\nYour Decrypted text is: " + OriginalText );

		myIn.close();





	}

}
