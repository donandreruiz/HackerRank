import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] inputs = new int[size];

        double negativeNums = 0;
        double positiveNums = 0;
        double zeroNums = 0;

        for(int i = 0; i < size; i++){
            inputs[i] = scanner.nextInt();
            if(inputs[i] < 0){
                negativeNums += 1;
            }else if(inputs[i] > 0){
                positiveNums += 1;
            }else if (inputs[i] == 0){
                zeroNums += 1;
            }
        }

       System.out.println(positiveNums/size);
       System.out.println(negativeNums/size);
       System.out.println(zeroNums/size);
    }
}
