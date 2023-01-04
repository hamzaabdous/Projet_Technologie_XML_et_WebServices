package DTO;

import javax.xml.bind.annotation.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@XmlRootElement(name="Operations")
@XmlAccessorType(XmlAccessType.FIELD)

public class Operations implements Serializable {
    @XmlElement(name = "operation")

    private List<Operation> operationsList;
   @XmlAttribute(name = "dateDebut")
    private Date dateDebut;


    public Operations() {
    }

    public Operations(List<Operation> operationsList, Date dateDebut) {
        this.operationsList = operationsList;
        this.dateDebut = dateDebut;
    }

    public List<Operation> getOperationsList() {
        return operationsList;
    }

    public void setOperationsList(List<Operation> operationsList) {
        this.operationsList = operationsList;
    }

    public Date getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(Date dateDebut) {
        this.dateDebut = dateDebut;
    }
}
