package com.qaprosoft.carina.zoommer.gui.components;

public enum Language {
    RUSSIAN("RUSSIAN"),
    ENGLISH("ENGLISH"),
    GEORGIAN("GEORGIAN");

    private String lan;

    Language(String lan){
        this.lan = lan;
    }

    public String getLanguage(){
        return lan;
    }
}
