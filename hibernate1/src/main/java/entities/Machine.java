package entities;


import services.SalleService;

import javax.persistence.*;
import java.util.Date;

@Entity
@NamedQuery(name="findBetweenDate",query="from Machine where dateAchat between :d1 and :d2")
@NamedNativeQuery(name="findBetweenDateNative",query ="select * from machine where dateAchat between :d1 and :d2 ",resultClass = Machine.class)
public class Machine {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String ref;

    @Temporal(TemporalType.DATE)
    private Date dateAchat;

    @ManyToOne
    private Salle salle;

    public Machine() {
    }

    public Machine(String ref, Date dateAchat, Salle salle) {
        this.ref = ref;
        this.dateAchat = dateAchat;
        this.salle = salle;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public Date getDateAchat() {
        return dateAchat;
    }

    public void setDateAchat(Date dateAchat) {
        this.dateAchat = dateAchat;
    }

    public Salle getSalle() {
        return salle;
    }

    public void setSalle(Salle salle) {
        this.salle = salle;
    }




}


