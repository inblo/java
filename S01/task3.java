// Дан массив nums = [3,2,2,3] и число val = 3.
// Если в массиве есть числа, равные заданному, нужно перенести эти элементы в конец массива.
// Таким образом, первые несколько (или все) элементов массива должны быть отличны от заданного, а 
// остальные - равны ему.
package S01;

import java.util.Arrays;

// Дан массив nums = [3,2,2,3] и число val = 3.
// Если в массиве есть числа, равные заданному, нужно перенести эти элементы в конец массива.
// Таким образом, первые несколько (или все) элементов массива должны быть отличны от заданного, а 
// остальные - равны ему.

public class task3 {
    public static void main(String[] args) {

        int[] nums = {5, 3, 2, 3, 3, 3, 2, 3, 3, 3, 3};
        int val = 3;

        moveToEndArray(nums, val);
        System.out.println(Arrays.toString(nums));

    }
    public static void moveToEndArray(int[] nums, int val){

        int right = nums.length - 1;


        for (int left = 0; left < right; left++) {
            while(nums[right] == val && left < right){
                right--;
            }
            if (nums[left] == val){
                nums[left] = nums[right];
                nums[right] = val;
                right--;
            }

        }

    }
}