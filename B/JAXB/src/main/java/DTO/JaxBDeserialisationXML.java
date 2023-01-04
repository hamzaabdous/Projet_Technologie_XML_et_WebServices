package DTO;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.util.Date;
import java.util.List;

public class JaxBDeserialisationXML {
    public static void main(String[] args) {
        try {

            JAXBContext context = JAXBContext.newInstance(Releve.class);
            Unmarshaller unmarshaller = context.createUnmarshaller();
            Releve re = (Releve) unmarshaller.unmarshal(new File("testReleve.xml"));
            System.out.println("RIB : "+re.getRIB());
            System.out.println("Date releve : "+re.getDateReleve());
            System.out.println("Sold : "+re.getSold());
            Operations op = re.getOperations();
            System.out.println("Date Debut :"+op.getDateDebut());
            System.out.println("Operations :");
            int index=1;

            for (Operation item:op.getOperationsList()) {
                System.out.println("--------------------");

                System.out.println("Operation "+index+" :");

                System.out.println("Operation type : "+item.getType());
                System.out.println("Operation date : "+item.getDate());
                System.out.println("Operation Montant : "+item.getMontant());
                System.out.println("Operation Description : "+item.getDescription());
                index += 1;
            }


        } catch (JAXBException e) {
            throw new RuntimeException(e);
        }
    }
}
