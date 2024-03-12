// Напишите функцию printPrimeNums, которая выведет на экран 
// все простые числа в промежутке от 1 до 1000, каждое на новой строке.
package H01;

public class task2 {
    public void printPrimeNums() {

        // Проход начинается с 2, т.к. это число является наименьшим простым
        for (int i = 2; i <= 1000; i++) {
            boolean isPrime = true;
            // Проверка, является ли число i простым
            // Проход по циклу до корня числа,
            // т.к. дальше нет смысла искать, делителей нет.
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            // Если число i простое, вывод его на экран
            if (isPrime)
                System.out.println(i);
        }
    }
    public static void main(String[] args) {

        task2 ans = new task2();
        ans.printPrimeNums();
    }
}