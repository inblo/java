// Напишите метод, который принимает на вход строку (String) 
// и определяет является ли строка палиндромом (возвращает
// boolean значение).
package S02;

public class task3 {
    public static void main(String[] args) {
        String str = "level";
        System.out.println(isPalindrome(str));
    }

    public static boolean isPalindrome(String str) {
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

}