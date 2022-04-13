package de.shaulen.valkyrie.helper;

import java.util.Random;

import org.springframework.util.DigestUtils;

public class CodeGenerator {
	
	private static CodeGenerator instance;
	
	public static CodeGenerator getInstance() {
		
		if(instance == null) {
			instance = new CodeGenerator();
		}
		
		return instance;
		
	}
	
	
	/* Private Section */
	
	public String generateRandomString() {
		
		int leftLimit = 33;
		int rightLimit = 126;
		
		int stringLength = 128;
		
		StringBuilder buffer = new StringBuilder(stringLength);
		Random random = new Random();
		
		for(int i = 0; i < stringLength; i++) {
			int randomInt = leftLimit + (int) (random.nextFloat() * (rightLimit - leftLimit + 1));
			buffer.append((char) randomInt);
		}
		
		String result = buffer.toString();
		return result;
		
	}
	
	public String encodeString(String toEncode) {
		
		String encoded = DigestUtils.md5DigestAsHex(toEncode.getBytes());

		return encoded;
	}

}
