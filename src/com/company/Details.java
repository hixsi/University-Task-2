package com.company;

public class Details implements CanBeSewed,Comparable<Details> {

    private DetailType detailType;


    public Details(DetailType detailType) {
        this.detailType = detailType;

    }

    public DetailType getDetailType() {
        return detailType;
    }



    @Override
    public String toString() {
        return "Details{" +
                "detailType=" + detailType +
                '}';
    }


    @Override
    public int compareTo(Details o) {
        return 0;
    }
}
