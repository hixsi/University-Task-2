package com.company;

public enum Material {
    COTTON(3),POLYESTER(2),VISCOSE(5);
    double price;

    Material(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
