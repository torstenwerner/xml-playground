package com.westernacher;

import org.junit.Test;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import static javax.xml.bind.Marshaller.JAXB_FORMATTED_OUTPUT;

public class MarshallTest {
    private final Marshaller marshaller;

    public MarshallTest() throws JAXBException {
        final JAXBContext jaxbContext = JAXBContext.newInstance(Person.class);
        marshaller = jaxbContext.createMarshaller();
        marshaller.setProperty(JAXB_FORMATTED_OUTPUT, true);
    }

    @Test
    public void marshal() throws Exception {
        final Adresse adresse = new Adresse()
                .withId("id001")
                .withOrt("Berlin")
                .withStrasseHausnummer("Musterstraße 26");

        final Person person = new Person()
                .withAdresse(adresse)
                .withAdresseReferenz(adresse);

        marshaller.marshal(person, System.out);
    }
}
