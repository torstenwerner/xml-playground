package com.westernacher;

import javax.xml.bind.annotation.*;

@XmlRootElement(name = "Person")
@XmlType(propOrder = {"adresse", "adresseReferenz"})
public class Person {
    @XmlElement(name = "Adresse")
    private Adresse adresse;
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    @XmlElement(name = "AdresseReferenz")
    private Adresse adresseReferenz;

    public Adresse getAdresse() {
        return adresse;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }

    public Person withAdresse(Adresse adresse) {
        setAdresse(adresse);
        return this;
    }

    public Adresse getAdresseReferenz() {
        return adresseReferenz;
    }

    public void setAdresseReferenz(Adresse adresseReferenz) {
        this.adresseReferenz = adresseReferenz;
    }

    public Person withAdresseReferenz(Adresse adresseReferenz) {
        setAdresseReferenz(adresseReferenz);
        return this;
    }
}
