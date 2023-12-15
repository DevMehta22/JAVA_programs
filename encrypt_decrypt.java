import java.io.*;

public class encrypt_decrypt {

	public static void encrypt(InputStream is, OutputStream os, int key) throws Exception {
		int i;
		while ((i = is.read()) != -1) {
			os.write((char) (i + key));
		}
		os.close();
		is.close();
	}

	public static void decrypt(InputStream is, OutputStream os, int key) throws Exception {
		int i;
		while ((i = is.read()) != -1) {
			os.write((char) (i - key));
		}
		os.close();
		is.close();
	}

	public static void main(String[] args) throws Exception {

		encrypt(new FileInputStream("input.txt"),
				new FileOutputStream("encrypt.txt"), 3);
		decrypt(new FileInputStream("encrypt.txt"),
				new FileOutputStream("decrypt.txt"), 3);
	}
}
