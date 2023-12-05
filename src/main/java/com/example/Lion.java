package com.example;

import java.util.List;

public class Lion {
    private final Feline feline;
    boolean hasMane;
    private Animal animal;
    public Lion(String sex, Feline feline) throws Exception {
        this.feline = feline;
        if ("Самец".equals(sex)) {
            hasMane = true;
        } else if ("Самка".equals(sex)) {
            hasMane = false;
        } else {
            throw new Exception("Используйте допустимые значения пола животного - самей или самка");
        }
    }
    public int getKittens() {
        return feline.getKittens();
    }
    //Метод, который получает на выход наличие гривы
    public boolean doesHaveMane() {
        return hasMane;
    }
    //Получаем еду, котору ест хищник
    public List<String> getFood() throws Exception {
     return feline.getFood("Хищник");
    }
}
