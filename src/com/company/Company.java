package com.company;

import java.util.ArrayList;
import java.util.List;

public class Company {
    String name;
    List<TextileItem> textileItemList;
    double salaryPerHour;

    public Company(String name, List<TextileItem> textileItemList, double salaryPerHour) {
        this.name = name;
        this.textileItemList = new ArrayList<>();
        this.salaryPerHour = salaryPerHour;
    }

    public String getName() {
        return name;
    }

    public double getSalaryPerHour() {
        return salaryPerHour;
    }


}
