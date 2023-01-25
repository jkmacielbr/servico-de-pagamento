package model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Contract {
    private Integer numberContract;
    private LocalDate date;
    private Double totalValue;

    private List<Installment> installment = new ArrayList<>();


    public Contract(Integer numberContract, LocalDate date, Double totalValue) {
        this.numberContract = numberContract;
        this.totalValue = totalValue;
        this.date = date;

    }


    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Double getTotalValue() {
        return totalValue;
    }

    public List<Installment> getInstallment() {
        return installment;
    }
}


