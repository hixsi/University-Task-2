package com.company;

import org.w3c.dom.Text;

public class Sewing <T extends TextileItem> {

    private T item;

    public Sewing(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }

    public void sewing(){
        System.out.println( this.item + " is sewed.");
    }

    public String isItemDamaged(){
        if (this.item.isDamaged())
            return item + "is damaged. ";
        else
            return item + "is okay. ";
    }

    public void packaging(double reduceMarkup){
        double newSellingPrice = this.item.getSellingPrice()- this.item.getSellingPrice()*reduceMarkup;
        this.item.setSellingPrice(newSellingPrice);
    }



    @Override
    public String toString() {
        return "Sewing{" +
                "item=" + item +
                '}';
    }
}
