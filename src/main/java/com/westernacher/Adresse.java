package com.westernacher;

import javax.xml.bind.annotation.*;

@XmlRootElement(name = "Adresse")
@XmlType(propOrder = {"id", "ort", "strasseHausnummer"})
public class Adresse {
    @XmlID
    @XmlSchemaType(name = "ID")
    @XmlElement(name = "Id", required = true)
    private String id;
    @XmlElement(name = "Ort", required = true)
    private String ort;
    @XmlElement(name = "StrasseHausnummer")
    private String strasseHausnummer;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Adresse withId(String id) {
        setId(id);
        return this;
    }

    public String getOrt() {
        return ort;
    }

    public void setOrt(String ort) {
        this.ort = ort;
    }

    public Adresse withOrt(String ort) {
        setOrt(ort);
        return this;
    }

    public String getStrasseHausnummer() {
        return strasseHausnummer;
    }

    public void setStrasseHausnummer(String strasseHausnummer) {
        this.strasseHausnummer = strasseHausnummer;
    }

    public Adresse withStrasseHausnummer(String strasseHausnummer) {
        setStrasseHausnummer(strasseHausnummer);
        return this;
    }
}
