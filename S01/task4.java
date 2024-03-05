// Напишите метод, который находит самую длинную строку 
// общего префикса среди массива строк.
// Если общего префикса нет, вернуть пустую строку "".
package S01;

public class task4 {
    public static void main(String[] args) {
        String[] words = {"flowers", "flow", "flight"};
        System.out.println(getMaxPrefix(words));        
    }

    public static String getMaxPrefix(String[] words) {
        if (words.length == 0 || words == null){
            return "";
        }
        String prefix = words[0];
        for (int i= 1; i < words.length; i++) {
            while (words[i].indexOf(prefix) !=0){
                prefix = prefix.substring(0,prefix.length()-1);

                if (prefix.isEmpty()){
                    return "";
                }
            }
        }
        return prefix;
        
    }
}
