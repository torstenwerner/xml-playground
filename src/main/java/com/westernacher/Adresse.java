package com.westernacher;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;

@XmlRootElement(name = "Adresse")
public class Adresse {
    @XmlID
    @XmlSchemaType(name = "ID")
    private String Id;
    @XmlElement(required = true)
    private String Ort;
    private String StrasseHausnummer;

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public Adresse withId(String id) {
        setId(id);
        return this;
    }

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
