package com.westernacher;

import org.junit.Test;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import static javax.xml.bind.Marshaller.JAXB_FORMATTED_OUTPUT;

public class MarshallTest {
    private final Marshaller marshaller;

    public MarshallTest() throws JAXBException {
        final JAXBContext jaxbContext = JAXBContext.newInstance(Adresse.class);
        marshaller = jaxbContext.createMarshaller();
        marshaller.setProperty(JAXB_FORMATTED_OUTPUT, true);
    }

    @Test
    public void marshall() throws Exception {
        final Adresse adresse = new Adresse()
                .withOrt("Berlin")
                .withStrasseHausnummer("Musterstraße 26");

        marshaller.marshal(adresse, System.out);
    }
}
