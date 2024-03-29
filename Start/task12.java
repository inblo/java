package Start;

public class task12 {
    public static void main(String[] args) {
        String[] str = new String[3];
        str[0] = "Привет Мир!";
        str[1] = "Игорь";
        str[2] = "Hello!";

        for (int i = 0; i < str.length; i++) {
            System.out.println(str[i]);
        }
        for (String string : str) {
            System.out.println(string);

        }
        int[] num = { 1, 3, 7 };
        int sum = 0;
        for (int i : num) {
            sum = sum + i;
        }
        System.out.println(sum);
    }
}
