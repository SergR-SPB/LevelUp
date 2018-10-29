package Level_1.Part_3.Task_1;
/*
        задача 1, занятие 3
        Создать класс Калькулятор. У него должны быть методы:
        1. Сумма
        2. Деление
        3. Умножение
        4. Вычитание
        Все методы должны быть перегружены
        и работать с тремя типами - double, long и int.
*/

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        System.out.println("Result sum: " + calculator.sum(5, 4));
        System.out.println("Result subtraction: " + calculator.subtraction(5.02, 4));
        System.out.println("Result multiplication: " + calculator.multiplication(5000, 4.2));
        System.out.println("Result division: " + calculator.division(5, 4.02));


    }
}

