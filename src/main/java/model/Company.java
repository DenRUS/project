package model;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Company {

//    ИНН компании
    private long inn;
//  Год отчетности
    private int year;

//    map Stroki Balansa
    private Map<String, Float> mapSB=new LinkedHashMap<>();

//    map Год отчетности - Строки баланса
//    private Map<Integer,Map<String, Float>> mapYearSB =new HashMap<>();


    public Company() {
    }

    public Company(long inn, int year, Map<String, Float> mapSB) {
        this.inn = inn;
        this.year = year;
        this.mapSB = mapSB;
    }


    public long getInn() {
        return inn;
    }

    public void setInn(long inn) {
        this.inn = inn;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Map<String, Float> getMapSB() {
        return mapSB;
    }

    public void setMapSB(Map<String, Float> mapSB) {
        this.mapSB = mapSB;
    }
}


