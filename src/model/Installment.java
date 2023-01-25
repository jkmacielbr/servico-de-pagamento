package model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Installment {
    private LocalDate duedate;
    private Double ammount;
    static DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public Installment(LocalDate duedate, Double ammount) {
        this.duedate = duedate;
        this.ammount = ammount;
    }


    @Override
    public String toString() {
        return duedate.format(fmt) +" - " + String.format("%.2f", ammount);
    }
}
