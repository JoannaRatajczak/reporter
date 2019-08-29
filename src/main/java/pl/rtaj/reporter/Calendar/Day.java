package pl.rtaj.reporter.Calendar;

import org.hibernate.annotations.Cascade;
import org.springframework.format.annotation.DateTimeFormat;
import pl.rtaj.reporter.Report.Report;
import pl.rtaj.reporter.Shift.Shift;


import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Day {

    //*****************KEYS
    @Id
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate date;
    @Id
    private Shift shift;
    // ***********************

    private String shortcut;

    @OneToOne
    private Report report;








}
