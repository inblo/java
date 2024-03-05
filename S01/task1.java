package S01;

import java.time.LocalDateTime;
import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {

        System.out.println("Представьтесь, пожалуйста: ");
        Scanner scanner = new Scanner(System.in, "ibm866");
        String name = scanner.nextLine();
        System.out.println("Привет, " + name + "!");
        System.out.printf("Привет, %s!", name);
        
        scanner.close();

        System.out.println();

        System.out.println("Hello, World!");
        //Date
        //Calendar 
        System.out.println(LocalDateTime.now());

        // int num = 34;
        // double d = 4.6;
        // String str = "Hello!";
        // char c = 'g';
        // boolean b = true;

        // int[] arr = new int[8];
        // int[] arr1 = {3, 5, 7, 8};

        // for (int i = 0; i < arr.length; i++) {

        // }

        // for (int elem : arr1) {
            
        // }

        // while (b) {
            
        // }

        // System.out.println(main1());
    }

    public static String main1() {
        return "";
    }
    
}