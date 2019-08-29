package pl.rtaj.reporter.Report;

import pl.rtaj.reporter.Calendar.Day;
import pl.rtaj.reporter.User.User;

import javax.persistence.*;
import java.util.List;

@Entity
public class Report {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(columnDefinition="varchar(MAX)")
    private String daily;
    @Column(columnDefinition="varchar(MAX)")
    private String handover; // special event - dorobić w kl day

    @OneToMany
    private User user;

    @OneToOne(mappedBy = "day")
    private Day day;


    public Report() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDaily() {
        return daily;
    }

    public void setDaily(String daily) {
        this.daily = daily;
    }

    public String getHandover() {
        return handover;
    }

    public void setHandover(String handover) {
        this.handover = handover;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
