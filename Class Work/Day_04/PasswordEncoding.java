package Day4;

import org.bouncycastle.util.encoders.Base64;

public class PasswordEncoding {

	public static void main(String[] args) {


		String password = "password";

		byte[] encodedPass = Base64.encode(password.getBytes());

		System.out.println("Encoded Password: "+new String(encodedPass));

		byte[] decodedPass = Base64.decode(encodedPass);

		System.out.println("Decoded Password: "+new String(decodedPass));

	}
}
