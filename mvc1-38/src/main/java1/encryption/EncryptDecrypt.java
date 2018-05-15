package encryption;


import java.io.UnsupportedEncodingException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

import org.apache.commons.codec.binary.Base64;

	// TODO: Auto-generated Javadoc
/**
	 * The Class EncryptDecrypt.
	 */
	public class EncryptDecrypt {

	    /** The Constant SECRET_KEY_1. */
    	private static final String SECRET_KEY_1 = "ssdkF$HUy2A#D%kd";

    	/** The Constant SECRET_KEY_2. */
    	private static final String SECRET_KEY_2 = "weJiSEvR5yAC5ftB";

	    /** The iv parameter spec. */
    	final private IvParameterSpec ivParameterSpec;

    	/** The secret key spec. */
    	final private SecretKeySpec secretKeySpec;

    	/** The cipher. */
    	final private Cipher cipher;

	    /**
    	 * Instantiates a new encrypt decrypt.
    	 *
    	 * @throws UnsupportedEncodingException the unsupported encoding exception
    	 * @throws NoSuchPaddingException the no such padding exception
    	 * @throws NoSuchAlgorithmException the no such algorithm exception
    	 */
    	public EncryptDecrypt() throws UnsupportedEncodingException, NoSuchPaddingException, NoSuchAlgorithmException {
	        ivParameterSpec = new IvParameterSpec(SECRET_KEY_1.getBytes("UTF-8"));
	        secretKeySpec = new SecretKeySpec(SECRET_KEY_2.getBytes("UTF-8"), "AES");
	        cipher = Cipher.getInstance("AES/CBC/PKCS5PADDING");
	    }


	    /**
    	 * Encrypt.
    	 *
    	 * @param toBeEncrypt the to be encrypt
    	 * @return the string
    	 * @throws NoSuchPaddingException the no such padding exception
    	 * @throws NoSuchAlgorithmException the no such algorithm exception
    	 * @throws InvalidAlgorithmParameterException the invalid algorithm parameter exception
    	 * @throws InvalidKeyException the invalid key exception
    	 * @throws BadPaddingException the bad padding exception
    	 * @throws IllegalBlockSizeException the illegal block size exception
    	 */
    	public String encrypt(final String toBeEncrypt) throws NoSuchPaddingException, NoSuchAlgorithmException,
	            InvalidAlgorithmParameterException, InvalidKeyException, BadPaddingException, IllegalBlockSizeException {
	        cipher.init(Cipher.ENCRYPT_MODE, secretKeySpec, ivParameterSpec);
	        final byte[] encrypted = cipher.doFinal(toBeEncrypt.getBytes());
	        return Base64.encodeBase64String(encrypted);
	    }

	    /**
    	 * Decrypt.
    	 *
    	 * @param encrypted the encrypted
    	 * @return the string
    	 * @throws InvalidAlgorithmParameterException the invalid algorithm parameter exception
    	 * @throws InvalidKeyException the invalid key exception
    	 * @throws BadPaddingException the bad padding exception
    	 * @throws IllegalBlockSizeException the illegal block size exception
    	 */
    	public String decrypt(final String encrypted) throws InvalidAlgorithmParameterException, InvalidKeyException,
	            BadPaddingException, IllegalBlockSizeException {
	        cipher.init(Cipher.DECRYPT_MODE, secretKeySpec, ivParameterSpec);
	        final byte[] decryptedBytes = cipher.doFinal(Base64.decodeBase64(encrypted));
	        return new String(decryptedBytes);
	    }


}
