package com.company;


import java.util.ArrayList;
import java.util.List;

public class TextileItem implements CanBeSewed,Comparable<TextileItem> {
    private List<Details> detailsList;
    private boolean isDamaged;
    private double productionPrice;
    private double sellingPrice;


    public TextileItem( boolean isDamaged) {
        this.detailsList = new ArrayList<>();
        this.isDamaged = isDamaged;
        this.productionPrice = 0;
        this.sellingPrice = 0;
    }

    public double getProductionPrice() {
        return productionPrice;
    }


    public void setProductionPrice(double productionPrice) {
        this.productionPrice = productionPrice;
    }

    public void setSellingPrice(double sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    public List<Details> getDetailsList() {
        return detailsList;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }

    public boolean isDamaged() {
        return isDamaged;
    }

    public double productionPrice(double materialCosts, double labourCosts) {
        this.productionPrice = materialCosts + labourCosts;
        return this.productionPrice;

    }
    public double sellingPrice(double markup){
           return this. getProductionPrice() + this.getProductionPrice() * markup;

    }

    @Override
    public int compareTo(TextileItem o) {
        return 0;
    }
}