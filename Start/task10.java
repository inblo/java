package Start;

//Switch
import java.util.Scanner;

public class task10 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Введите Ваш возраст: ");
            int age = sc.nextInt();
            switch (age) {
                case 0:
                    System.out.println("Ты родился!");
                    break;
                case 7:
                    System.out.println("Ты пошел в школу!");
                    break;
                case 18:
                    System.out.println("Ты закончил школу!");
                    break;
                    default:
                    System.out.println("Ни одно из предъидущих условий не выполнено!");

            }
        }

    }
}
