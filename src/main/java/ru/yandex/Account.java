package ru.yandex;

import io.qameta.allure.Step;

public class Account {

    private final String name;

    public Account(String name) {
        this.name = name;
    }

    public boolean checkNameToEmboss() {

        if (name == null) {
            return false;
        }

        return name.matches("(?=.{3,19}$)[a-zA-Zа-яёА-ЯЁ]+\\s[a-zA-Zа-яёА-ЯЁ]+");

         /*
             Этот метод должен проверять, что сохранённая через конструктор строка соответствует требованиям.
             Если строка удовлетворяет условиям, метод возвращает true, иначе — false.
         */
    }
}
