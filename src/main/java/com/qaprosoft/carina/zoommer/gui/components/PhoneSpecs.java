package com.qaprosoft.carina.zoommer.gui.components;

public enum PhoneSpecs {
    RAM4("4 GB"),
    RAM6("6 GB"),
    RAM8("8 GB"),
    STORAGE64("64 GB"),
    STORAGE128("128 GB"),
    STORAGE256("256 GB"),
    STORAGE512("512 GB");

    private String spec;

    public String getSpec() {
        return spec;
    }

    PhoneSpecs(String spec) {
        this.spec = spec;
    }
}
