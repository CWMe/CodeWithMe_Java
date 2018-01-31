import java.io.*;
import java.util.*;

public class HashSetSolution {

    public static void main(String[] args) {
        try {
            Scanner s = new Scanner(new FileReader("input.txt"));
            int t = s.nextInt();
            String[] pair_left = new String[t];
            String[] pair_right = new String[t];
            HashSet<String> set = new HashSet<String>();
            for (int i = 0; i < t; i++) {
                pair_left[i] = s.next();
                pair_right[i] = s.next();
                set.add(pair_left[i] + " " + pair_right[i]);
                System.out.println(set.size());
            }
        } catch(Exception e){
            System.out.println("Input file not found");
        }
    }
}