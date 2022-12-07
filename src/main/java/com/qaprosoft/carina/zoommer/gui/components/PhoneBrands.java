package com.qaprosoft.carina.zoommer.gui.components;

public enum PhoneBrands {
    APPLE("Apple"),
    SAMSUNG("Samsung"),
    XIAOMI("Xiaomi"),
    GOOGLE("google"),
    NOTHING("Nothing"),
    ONEPLUS("OnePlus"),
    REALME("Realme"),
    NOKIA("Nokia"),
    HONOR("Honor"),
    ZTE("ZTE"),
    ASUS("Asus");

    private String phoneBrand;

    PhoneBrands(String phoneBrand) {
        this.phoneBrand = phoneBrand;
    }

    public String getPhoneBrand() {
        return phoneBrand;
    }
}
