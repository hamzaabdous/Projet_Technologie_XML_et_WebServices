package WS;


import jakarta.xml.bind.annotation.*;

import java.util.Date;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name="operationff")
public class Operation {
    @XmlAttribute(name = "type")

    private String type ;
    @XmlAttribute(name = "date")

    private Date date ;

    @XmlAttribute(name = "montant")
    private Double montant ;
    @XmlAttribute(name = "description")
    private String description ;

    public Operation(String type, Date date, Double montant, String description) {
        this.type = type;
        this.date = date;
        this.montant = montant;
        this.description = description;
    }

    public Operation() {
    }



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

    public Double getMontant() {
        return montant;
    }

    public void setMontant(Double montant) {
        this.montant = montant;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
