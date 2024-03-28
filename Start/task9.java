package Start;

//break, continue
public class task9 {
    public static void main(String[] args) {
        int i = 0;
        //     while (true) {
    //         if (i == 15) {
    //             break;
    //         }
    //         System.out.println(i);
    //         i++;
    //     }
    //     System.out.println("Вы вышли из цикла!");
    // }
        for(i = 0; i <=15; i++) {
            if (i%2 == 0){
                continue;
            }
            System.out.println("Это нечетное число " + i);
        }
    }
}

