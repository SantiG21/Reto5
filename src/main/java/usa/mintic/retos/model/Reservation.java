package usa.mintic.retos.model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="reservation")
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer idReservation;
    @Column(length = 45, name = "start_date")
    private Date startDate;
    @Column(length = 45, name = "devolution_date")
    private Date devolutionDate;
    @Column(length = 45)
    private String status = "created";
    @ManyToOne
    @JoinColumn(name = "motorbike_id")
    @JsonIgnoreProperties("reservations")
    private Motorbike motorbike;
    @ManyToOne
    @JoinColumn(name = "client_id")
    @JsonIgnoreProperties({"reservations", "messages"})
    private Client client;
    @OneToOne
    @JoinColumn(name = "score_id")
    @JsonIgnoreProperties("reservation")
    private Score score;

    public Reservation() {
    }

    public Reservation(Integer idReservation, Date startDate, Date devolutionDate, String status, Motorbike motorbike, Client client, Score score) {
        this.idReservation = idReservation;
        this.startDate = startDate;
        this.devolutionDate = devolutionDate;
        this.status = status;
        this.motorbike = motorbike;
        this.client = client;
        this.score = score;
    }

    public Integer getIdReservation() {
        return idReservation;
    }

    public void setIdReservation(Integer idReservation) {
        this.idReservation = idReservation;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getDevolutionDate() {
        return devolutionDate;
    }

    public void setDevolutionDate(Date devolutionDate) {
        this.devolutionDate = devolutionDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Motorbike getMotorbike() {
        return motorbike;
    }

    public void setMotorbike(Motorbike motorbike) {
        this.motorbike = motorbike;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Score getScore() {
        return score;
    }

    public void setScore(Score score) {
        this.score = score;
    }

}
