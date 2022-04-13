package de.shaulen.valkyrie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import de.shaulen.valkyrie.helper.CodeGenerator;
import de.shaulen.valkyrie.helper.Ratatoeskr;
import de.shaulen.valkyrie.helper.UpdateAuthCode;

@SpringBootApplication
public class ValkyrieApplication {

	public static void main(String[] args) {
		SpringApplication.run(ValkyrieApplication.class, args);
		CodeGenerator gen = new CodeGenerator();
		Ratatoeskr ratatoeskr = new Ratatoeskr();
		UpdateAuthCode.getInstance(gen, ratatoeskr).start();;
	}

}
