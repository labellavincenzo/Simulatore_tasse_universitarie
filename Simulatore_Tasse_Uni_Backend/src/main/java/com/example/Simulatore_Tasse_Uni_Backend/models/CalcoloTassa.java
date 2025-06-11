package com.example.Simulatore_Tasse_Uni_Backend.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name = "fascia_reddito")
public class CalcoloTassa {
    @Id
    private int fascia_id;
    //Con Column dico il nome della colonna di riferimento
    @Column (name = "numero_fascia")
    private String numeroFascia;

    @Column (name = "prima_rata")
    private float primaRata;

    @Column (name = "seconda_rata")
    private float secondaRata;

    @Column (name = "terza_rata")
    private float terzaRata;

    //Getter e setter di ogni campo
    public int getFascia_id() {
        return fascia_id;
    }

    public void setFascia_id(int fascia_id) {
        this.fascia_id = fascia_id;
    }

    public String getNumeroFascia() {
        return numeroFascia;
    }

    public void setNumeroFascia(String numeroFascia) {
        this.numeroFascia = numeroFascia;
    }

    public float getPrimaRata() {
        return primaRata;
    }

    public void setPrimaRata(float primaRata) {
        this.primaRata = primaRata;
    }

    public float getSecondaRata() {
        return secondaRata;
    }

    public void setSecondaRata(float secondaRata) {
        this.secondaRata = secondaRata;
    }

    public float getTerzaRata() {
        return terzaRata;
    }

    public void setTerzaRata(float terzaRata) {
        this.terzaRata = terzaRata;
    }
}
