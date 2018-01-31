import java.io.*;
import java.util.HashSet;
import java.util.Scanner;

public class Challenge {

    public static void main(String[] args) {
        try {
            Scanner s = new Scanner(new FileReader("input.txt"));
            int t = s.nextInt();
            String[] pair_left = new String[t];
            String[] pair_right = new String[t];

            for (int i = 0; i < t; i++) {
                pair_left[i] = s.next();
                pair_right[i] = s.next();
            }
        } catch(Exception e){
            System.out.println("Input file not found");
        }
    }
}