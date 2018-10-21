
/*
 * Authors : David Dorneau & Jammy Jean
 * 10/21/2018
 * CIS_5371
 * El Gamal  Implementation
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

		int yourKeyLength;
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

			System.out.println("please enter your key size, making sure it is a "
					+ "64 byte(8 characters) or 128 byte(16 characters");
			
			yourKeyLength = myIn.nextInt();

		}while(yourKeyLength != 64 || yourKeyLength != 128);

		//get the plaintext from user
		System.out.println("please enter your plaintext");
		yourPlainText = myIn.nextLine();

		//set the plaintext and the secret key
		myEncryption.setThePlainText(yourPlainText);
		

		//perform the encryption



		myIn.close();





	}

}
