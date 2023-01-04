package DTO;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.SchemaOutputResolver;
import javax.xml.transform.Result;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.List;

public class JaxBGenerateSchema {
    public static void main(String[] args) {
        try {
            JAXBContext context = JAXBContext.newInstance(Releve.class);
           context.generateSchema(new SchemaOutputResolver() {
               @Override
               public Result createOutput(String namespaceUri, String suggestedFileName) throws IOException {
                   File f = new File("releve.xsd");
                   StreamResult result = new StreamResult(f);
                   result.setSystemId(f.getName());
                   return result;
               }
           });
        } catch (JAXBException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
