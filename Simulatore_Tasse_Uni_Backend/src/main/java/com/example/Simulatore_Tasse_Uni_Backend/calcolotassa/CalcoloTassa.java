package com.example.Simulatore_Tasse_Uni_Backend.calcolotassa;
import java.util.Scanner;

public class CalcoloTassa {
    private float valoreISEE;

    public void calcoloTasse() {
        Scanner scanner = new Scanner(System.in);
        boolean corretto = false;
        while (!corretto) {
            System.out.println("Inserisci il tuo valore ISEE: ");
            try {
                valoreISEE = Float.parseFloat(scanner.nextLine());
                corretto = true;
            } catch (Exception e) {
                System.out.println("Valore inserito non valido!");
                System.out.println("L'ISEE è un numero, inserisci un valore numerico");
            }
        }
        if(valoreISEE < 1000.00) {
            System.out.println("No tax area");
        } else if (valoreISEE >= 1000.00 && valoreISEE < 2000.00) {
            System.out.println("Fascia 1, la tua tassa è 100 euro");
        } else if (valoreISEE >= 2000.00 && valoreISEE < 3000.00) {
            System.out.println("Fascia 2, la tua tassa è 200 euro");
        } else if (valoreISEE >= 3000.00 && valoreISEE < 4000.00) {
            System.out.println("Fascia 3, la tua tassa è 300 euro");
        }
        scanner.close();
    }

    public float getValoreISEE() {
        return valoreISEE;
    }

    public void setValoreISEE(float valoreISEE) {
        this.valoreISEE = valoreISEE;
    }
}
