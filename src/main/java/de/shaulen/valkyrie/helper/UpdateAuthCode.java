package de.shaulen.valkyrie.helper;


public class UpdateAuthCode extends Thread {
	
	private CodeGenerator codeGenIns;
	private Ratatoeskr ratatoeskr;
	private static UpdateAuthCode instance;
	
	public static UpdateAuthCode getInstance(CodeGenerator codeGenIns, Ratatoeskr ratatoeskr) {
		
		if(instance == null) {
			instance = new UpdateAuthCode(codeGenIns, ratatoeskr);
		}
		
		return instance;
		
	}
	
	public UpdateAuthCode(CodeGenerator codeGenIns, Ratatoeskr ratatoeskr) {
		
		this.codeGenIns = codeGenIns;
		this.ratatoeskr = ratatoeskr;
		
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
