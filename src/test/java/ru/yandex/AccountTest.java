package ru.yandex;

import io.qameta.allure.Description;
import io.qameta.allure.junit4.DisplayName;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;

@RunWith(Parameterized.class)

public class AccountTest {

    private Account account;
    private final String name;
    private final boolean expected;


    public AccountTest(String name, boolean expected) {
        this.name = name;
        this.expected = expected;
    }

    @Before
    public void setUp(){
        account = new Account(name);
    }

    @Parameterized.Parameters(name = "{index}: для имени: {0} метод checkNameToEmboss возвращает {1} ")
    public static Iterable<Object[]> data() {
        return Arrays.asList(new Object[][]{
                        //проверка с null
                        {null, false},
                        //пустая строка
                        {"", false},
                        // 3 знака из них 1 пробел посередине
                        {"М А", true},
                        // 2 знака без пробела
                        {"ТШ", false},
                        //3 пробела
                        {"   ", false},
                        //13 знаков без пробелов
                        {"ТимотиШаламен", false},
                        //17 знаков с 2 пробелами
                        {"Тимоти  Шаламеннн", false},
                        //18 знаков с пробелом посередине
                        {"Тимоти Шаламеннннн", true},
                        //18 знаков с пробелом в конце строки
                        {"ТимотиШаламеннннн ", false},
                        //18 знаков с пробелом в начале строки
                        {" ТимотиШаламеннннн", false},
                        //19 знаков с 2 пробелами в разных местах
                        {"Тимоти Шала меннннн", false},
                        //19 знаков с пробелом посередине
                        {"Тимоти Шаламенннннн", true},
                        //20 знаков с пробелом посередине
                        {"Тимоти Шаламеннннннн", false}
                }
        );
    }

    @Test
    @DisplayName("method checkNameToEmboss")
    @Description("check method checkNameToEmboss, the method return true or false")
    public void printAccountFirstNameAndLastName() {

        Assert.assertEquals(account.checkNameToEmboss(),expected);
    }
}
