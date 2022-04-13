package de.shaulen.ares;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import de.shaulen.ares.helper.CodeGenerator;
import de.shaulen.ares.helper.Hermes;
import de.shaulen.ares.helper.UpdateAuthCode;

@SpringBootApplication
public class AresApplication {

	public static void main(String[] args) {
		SpringApplication.run(AresApplication.class, args);
		CodeGenerator gen = new CodeGenerator();
		Hermes ratatoeskr = new Hermes();
		UpdateAuthCode.getInstance(gen, ratatoeskr).start();;
	}

}
