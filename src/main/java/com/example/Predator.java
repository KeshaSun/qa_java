package com.example;

import java.util.List;

public interface Predator {
    //должен предоставить реализацию метода eatMeat(),
    // который должен вернуть список ингредиентов, которые были съедены,
    // и может выбросить исключение, если произошла какая-то непредвиденная ситуация.
    List<String> eatMeat() throws Exception;

}
