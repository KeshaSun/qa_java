package com.example;

import java.util.List;
// объявили метод, подключили наследников и включения
public class Feline extends Animal implements Predator {
    //переопределили метод из Animal, вернули ему параметр "Хищник"
    @Override
    public List<String> eatMeat() throws Exception {
        return getFood("Хищник");
    }
    // переопределили метод из Animal, вернули ему параметр "Кошачьи"

    @Override
    public String getFamily() {
        return "Кошачьи";
    }
    // метод для обращения к getKittens с аргументом 1
    public int getKittens() {
        return getKittens(1);
    }
    // метод для возврата числа преданного в getKittens
    public int getKittens(int kittensCount) {
        return kittensCount;
    }

}
