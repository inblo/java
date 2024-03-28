package Start;
//While
import java.util.Scanner;

public class task8 {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        // while(num != 5){
        //     System.out.println("Введите число 5!");
        //     num = sc.nextInt();
        // }
        do{
            System.out.println("Введите цифру 5: ");
            num = sc.nextInt();
        }
        while(num != 5); 
        System.out.println("Поздравляем! Вы ввели число 5!");
    }
}
