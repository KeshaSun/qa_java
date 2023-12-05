package com.example;

import java.util.List;

public class Animal {
    //На вход получает травоядное или хищник, в зависимости от этого отдаёт список потребляемой еды
    //Или отдаёт исключение, если передано что-то иное
    public List<String> getFood(String animalKind) throws Exception {
        if ("Травоядное".equals(animalKind)) {
            return List.of("Трава", "Различные растения");
        } else if ("Хищник".equals(animalKind)) {
            return List.of("Животные", "Птицы", "Рыба");
        } else {
            throw new Exception("Неизвестный вид животного, используйте значение Травоядное или Хищник");
        }
    }
    //При вызове метода возвращает информацию о семействе
    public String getFamily() {
        return "Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи";
    }
}