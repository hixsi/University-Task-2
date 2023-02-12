package com.company;

public enum DetailType {
    SLEEVE(null,null),
    BELT(null,null),
    LEG(null,null),
    FRONTPART(null,null),
    BACKPART(null,null);

    Material material;
    Color color;


    DetailType(Material material, Color color) {
        this.material = material;
        this.color = color;

    }

    public Material getMaterial() {
        return material;
    }

    public Color getColor() {
        return color;
    }


}
