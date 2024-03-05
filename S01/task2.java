// Дан массив двоичных чисел, например [1,1,0,1,1,1], вывести
// максимальное количество подряд идущих 1.

package S01;

public class task2 {
    public static void main(String[] args) {
        int[] arr = {1, 1, 0, 1, 1, 1};
        int maxcount = getMaxcount(arr);
        System.out.println("Максимальное количество единиц: " + maxcount);
    }

    private static int getMaxcount(int[] arr) {
        int count = 0;
        int maxcount = 0;

        for(int i = 0; i < arr.length; i++){
            if (arr[i]== 1){
                count++;
            }
            else{
                count = 0;
            }
            if(count > maxcount){
                maxcount = count;
            }
        }
        return maxcount;
    }
}
