package com.java.wrokshope.tempreaturedata.beans;

public class TempretureSensor implements Sensor {
    private float tempreture;
    public TempretureSensor(float atempreture){
        tempreture = atempreture;
    }
    public float getReading(){
        return tempreture;
    }
    }
