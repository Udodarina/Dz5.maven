package ru.netology.mymavenDz5.services;

public class HolidayService {

    public int calculate(int income, int expenses, int threshold) {
        int count = 0; // счетчик месяцев отдыха
        int money = 0; // количество денег на счету
        for (int month = 0; month < 12; month++) {
            if (money >= threshold) // условие для месяца отдыха
            {
                count++; // увеличивает счетчик месяцев отдыха
                money = (money - expenses) / 3; // количество денег при отдыхе
            } else {
                money = money + income - expenses; // количество денег при работе
            }
        }
        return count;
    }
}

