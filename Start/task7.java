package Start;
//Scanner
import java.util.Scanner;


public class task7 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner s = new Scanner(System.in);
        System.out.println("Введите свое имя: ");
        String str = s.nextLine();
        System.out.println("Вас зовут - " + str);
        System.out.println("Введите число: ");
        int num = s.nextInt();
        System.out.println("Вы ыыели - " + num);
    }
}
