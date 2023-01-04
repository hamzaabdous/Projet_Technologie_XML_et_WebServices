package DTO;

import javax.xml.bind.annotation.*;
import java.io.Serializable;
import java.util.Date;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name="operation")
public class Operation implements Serializable {
    @XmlAttribute(name = "type")
    private String type ;
    @XmlAttribute(name = "date")
    private Date date ;
    @XmlAttribute(name = "montant")
    private String montant ;
    @XmlAttribute(name = "description")
    private String description ;





    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getMontant() {
        return montant;
    }

    public void setMontant(String montant) {
        this.montant = montant;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Operation(String type, Date date, int montant, String description) {
        this.type = type;
        this.date = date;
        this.montant = String.valueOf(montant);
        this.description = description;

    }

    public Operation() {
    }
}
