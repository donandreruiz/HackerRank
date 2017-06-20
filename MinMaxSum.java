import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

//in this solution don't forget it's important to get the total sum and use the fact that
//we have the max number and the min number of the array, hence we can find the solution.

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        int max = 0;
        int min = 0;
        int total = 0;

        arr[0] = max = min = total = in.nextInt();

        for(int arr_i=0; arr_i < 5; arr_i++){
            arr[arr_i] = in.nextInt();
            if(arr[arr_i] > max){
                max = arr[arr_i];
            }
            if(arr[arr_i] < min){
                min = arr[arr_i];
            }

            total += arr[arr_i];
        }
        System.out.println((total - max) + " " + (total - min));

    }
}
