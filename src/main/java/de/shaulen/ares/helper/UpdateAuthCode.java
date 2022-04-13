package de.shaulen.ares.helper;


public class UpdateAuthCode extends Thread {
	
	private CodeGenerator codeGenIns;
	private Hermes hermes;
	private static UpdateAuthCode instance;
	
	public static UpdateAuthCode getInstance(CodeGenerator codeGenIns, Hermes hermes) {
		
		if(instance == null) {
			instance = new UpdateAuthCode(codeGenIns, hermes);
		}
		
		return instance;
		
	}
	
	public UpdateAuthCode(CodeGenerator codeGenIns, Hermes hermes) {
		
		this.codeGenIns = codeGenIns;
		this.hermes = hermes;
		
	}
	
	@Override
	public void run() {
		
		try {
			while(true) {
				String newAuthCode = codeGenIns.encodeString(codeGenIns.generateRandomString());
				instance.sleep(900000);
			}
			
		}catch(Exception e) {
			System.err.println(e);
		}
		
	}

}
