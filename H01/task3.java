// В методе calculate класса Calculator реализовать калькулятор, 
// который будет выполнять математические операции (+, -, *, /) 
// над двумя целыми числами и возвращать результат вещественного типа.
// В классе Printer необходимо реализовать проверку переданного оператора,
// при некорректном операторе программа должна вывести сообщение об ошибке 
// "Некорректный оператор: 'оператор'".

package H01;

import java.util.Scanner;

public class task3 {
    // метод получения числа
    @SuppressWarnings("resource")
    static int scanNumber() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        return number;
    }

    // метод получения числа операции
    @SuppressWarnings("resource")
    static String scanOperations() {
        Scanner scanner = new Scanner(System.in);
        String operations = scanner.nextLine();
        return operations;

    }
    // метод получения результата
    static int getResult(String opr, int num1, int num2) {
        int result = 0;
        switch (opr) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                result = num1 / num2;
            default:
                System.out.println("Введите оператор: -, +, *, /");
                break;
        }
        return result;

    }

    public static void main(String[] args) {
        System.out.println("Введите первое число: ");
        int num1 = scanNumber();
        System.out.println("Введите оператор: -, +, *, /");
        String operations = scanOperations();
        System.out.println("Введите второе число: ");
        int num2 = scanNumber();
        int result = getResult(operations, num1, num2);
        System.out.printf("%d %s %d = %d", num1, operations, num2, result);

    }

}