package WS;

import jakarta.xml.bind.annotation.*;

import java.util.Date;
@XmlRootElement(name="Releve")
@XmlAccessorType(XmlAccessType.FIELD)
public class Releve {
    @XmlElement(name = "dateReleve")
    private Date dateReleve;
    @XmlElement(name = "sold")
    private float sold;
    @XmlAttribute(name = "RIB")

    private int RIB;

    // @XmlElement(name = "operations")
    private  Operations operations;

    public Releve(Date dateReleve, float sold, int RIB, Operations operations) {
        this.dateReleve = dateReleve;
        this.sold = sold;
        this.RIB = RIB;
        this.operations = operations;
    }

    public Releve() {
    }

    public Date getDateReleve() {
        return dateReleve;
    }

    public void setDateReleve(Date dateReleve) {
        this.dateReleve = dateReleve;
    }

    public float getSold() {
        return sold;
    }

    public void setSold(float sold) {
        this.sold = sold;
    }

    public int getRIB() {
        return RIB;
    }

    public void setRIB(int RIB) {
        this.RIB = RIB;
    }

    public Operations getOperations() {
        return operations;
    }

    public void setOperations(Operations operations) {
        this.operations = operations;
    }
}
