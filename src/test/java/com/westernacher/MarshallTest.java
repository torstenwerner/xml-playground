package com.westernacher;

import org.junit.Test;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.StringReader;

import static javax.xml.bind.Marshaller.JAXB_FORMATTED_OUTPUT;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class MarshallTest {
    private final Marshaller marshaller;
    private final Unmarshaller unmarshaller;

    public MarshallTest() throws JAXBException {
        final JAXBContext jaxbContext = JAXBContext.newInstance(Person.class);
        marshaller = jaxbContext.createMarshaller();
        marshaller.setProperty(JAXB_FORMATTED_OUTPUT, true);
        unmarshaller = jaxbContext.createUnmarshaller();
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

    @Test
    public void unmarshal() throws Exception {
        final String xml = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n" +
                "<xnot:Person xmlns:xnot=\"http://www.bnotk.de/schemas/xnotariat\">\n" +
                "    <xnot:Adresse>\n" +
                "        <xnot:Id>id001</xnot:Id>\n" +
                "        <xnot:Ort>Berlin</xnot:Ort>\n" +
                "        <xnot:StrasseHausnummer>Musterstraße 26</xnot:StrasseHausnummer>\n" +
                "    </xnot:Adresse>\n" +
                "    <xnot:AdresseReferenz>id001</xnot:AdresseReferenz>\n" +
                "</xnot:Person>";
        final Person person = (Person) unmarshaller.unmarshal(new StringReader(xml));
        assertThat(person.getAdresse().getOrt(), is("Berlin"));
        assertThat(person.getAdresse(), is(person.getAdresseReferenz()));
    }
}
