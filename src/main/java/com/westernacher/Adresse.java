package com.westernacher;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Adresse")
public class Adresse {
    private String Ort;
    private String StrasseHausnummer;

    public String getOrt() {
        return Ort;
    }

    public void setOrt(String ort) {
        Ort = ort;
    }

    public Adresse withOrt(String ort) {
        setOrt(ort);
        return this;
    }

    public String getStrasseHausnummer() {
        return StrasseHausnummer;
    }

    public void setStrasseHausnummer(String strasseHausnummer) {
        StrasseHausnummer = strasseHausnummer;
    }

    public Adresse withStrasseHausnummer(String strasseHausnummer) {
        setStrasseHausnummer(strasseHausnummer);
        return this;
    }
}
