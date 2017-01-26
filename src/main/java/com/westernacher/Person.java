package com.westernacher;

import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;

@XmlRootElement(name = "Person")
public class Person {
    private Adresse Adresse;
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    private Adresse AdresseReferenz;

    public Adresse getAdresse() {
        return Adresse;
    }

    public void setAdresse(Adresse adresse) {
        Adresse = adresse;
    }

    public Person withAdresse(Adresse adresse) {
        setAdresse(adresse);
        return this;
    }

    public Adresse getAdresseReferenz() {
        return AdresseReferenz;
    }

    public void setAdresseReferenz(Adresse adresseReferenz) {
        AdresseReferenz = adresseReferenz;
    }

    public Person withAdresseReferenz(Adresse adresseReferenz) {
        setAdresseReferenz(adresseReferenz);
        return this;
    }
}
