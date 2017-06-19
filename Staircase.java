import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */





        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        char sol[] = new char[size];

        for(int i = 0; i < size; i++){
            sol[i] = ' ';
        }


        for(int j=1; j <= size; j++){
            sol[size  - j] = '#';
            System.out.println(sol);
        }
      }
}
