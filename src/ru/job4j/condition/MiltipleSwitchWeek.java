package ru.job4j.condition;

public class MiltipleSwitchWeek {
    public static int numberOfDay(String name) { // Добавил static
        return switch (name) {
            case "Понедельник", "Modnay" -> 1;
            case "Вторник", "Tuesday" -> 2;
            case "Среда", "Wednesday" -> 3;
            case "Четверг", "Thursday" -> 4;
            case "Пятница", "Friday" -> 5;
            case "Суббота", "Saturday" -> 6;
            case "Воскресенье", "Sunday" -> 7;
            default -> -1;
        };
      }

    public static void main(String[] args) {
        System.out.println(numberOfDay("Sunday"));
    }
}

