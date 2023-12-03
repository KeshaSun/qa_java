package com.example;

import java.util.List;

public class Cat {
    //объявляем переменную, которая является экземпляром интерфейса Predator.
   Predator predator;
    //создает экземпляр класса Cat и передает в него объект feline
    public Cat(Feline feline) {
    // присваиваем переменной predator текущего объекта значение переданного параметра feline.
        this.predator = feline;
    }
    // создаём метод, который возвращает текст "Мяу"
    public String getSound() {
        return "Мяу";
    }
    //метод, который возвращает в виде List<String> обращение к .eatMeat()
    public List<String> getFood() throws Exception {
       return predator.eatMeat();
    }

}
