import java.io.*;
import java.util.*;

public class Challenge {

    public static void main(String[] args) {
        try {
            Scanner s = new Scanner(new FileReader("input.txt"));
            int numOfEntries = s.nextInt();
            ArrayList<Integer> list = new ArrayList<Integer>();



            String output="";
            for (int item : list) {
                output+=item+" ";
            }
            System.out.println(output);
        } catch(Exception e){
            System.out.println("Input file not found");
        }
    }
}