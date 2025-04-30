package com.example.Simulatore_Tasse_Uni_Backend;

import com.example.Simulatore_Tasse_Uni_Backend.calcolotassa.CalcoloTassa;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SimulatoreTasseUniBackendApplication {

	public static void main(String[] args) {
		CalcoloTassa calcoloTassa = new CalcoloTassa();
		calcoloTassa.calcoloTasse();

		SpringApplication.run(SimulatoreTasseUniBackendApplication.class, args);
	}

}
