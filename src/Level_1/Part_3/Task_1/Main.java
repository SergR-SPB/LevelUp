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
        Calculator calculatorVar2 = new Calculator();

        System.out.println("Result sum: " + calculatorVar2.sum(5, 4));
        System.out.println("Result subtraction: " + calculatorVar2.subtraction(5.02, 4));
        System.out.println("Result multiplication: " + calculatorVar2.multiplication(5000, 4.2));
        System.out.println("Result division: " + calculatorVar2.division(5, 4.02));


    }
}

