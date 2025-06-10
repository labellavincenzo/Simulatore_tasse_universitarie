package com.example.Simulatore_Tasse_Uni_Backend.models;
import org.springframework.stereotype.Component;

@Component
public class CalcoloTassa {
    private float valoreISEE; //Valore ISEE espresso in decimale

    public String calcolaFascia(float valoreISEE) {
        if(valoreISEE < 1000.00) {
            return "No tax area";
        } else if (valoreISEE >= 1000.00 && valoreISEE < 2000.00) {
            return "Fascia 1, la tua tassa è 100 euro";
        } else if (valoreISEE >= 2000.00 && valoreISEE < 3000.00) {
            return "Fascia 2, la tua tassa è 200 euro";
        } else if (valoreISEE >= 3000.00 && valoreISEE < 4000.00) {
            return "Fascia 3, la tua tassa è 300 euro";
        } else {
            return "Fascia 4, la tua tassa è 1000 euro";
        }
    }

    public float getValoreISEE() {
        return valoreISEE;
    }

    public void setValoreISEE(float valoreISEE) {
        this.valoreISEE = valoreISEE;
    }




}
