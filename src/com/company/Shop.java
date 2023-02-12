package com.company;

public class Shop {
    public <T extends TextileItem> String sellTextileItems(T item){
        return item +" is sold for the price of " + item.getSellingPrice();
    }
}
