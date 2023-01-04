package DTO;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;
import java.util.Date;
import java.util.List;

public class JaxBSerialisationXML {
    public static void main(String[] args) {
        try {
            JAXBContext context = JAXBContext.newInstance(Releve.class);
            Marshaller marshaller = context.createMarshaller();
            Operations listOperations = new Operations(List.of(
                    new Operation("test",new Date(),12233,"cccccc"),
                    new Operation("test1",new Date(),12233,"cccccc")
            ),new Date());
            Releve releve = new Releve(new Date(), (float) (Math.random()*9888),1111111, listOperations);
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,true);
            marshaller.marshal(releve,new File("testReleve.xml"));
        } catch (JAXBException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Hello world!");
    }

}
