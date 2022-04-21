package ru.yandex;

import io.qameta.allure.Step;

public class Praktikum {

    @Step("Проверка текста для эмбоссирования")
    public static void main(String args[]) {

        String name = "Тимоти Шаламе";

        Account account = new Account(name);
        if (account.checkNameToEmboss()) {
            System.out.println(name + " - можно напечатать данные владельца на банковской карте");
        } else {
            System.out.println(name + " - нельзя напечатать данные владельца на банковской карте");
        }

        /*
             В этом методе заложи логику работы с классом Account.
             Нужно создать экземпляр класса Account: в качестве аргумента передать тестируемое имя
             и вызвать метод, который проверяет, можно ли использовать фамилию и имя для печати на банковской карте.
         */
    }
}
