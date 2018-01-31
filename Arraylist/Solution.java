import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        try {
            Scanner s = new Scanner(new FileReader("input.txt"));
            int numOfEntries = s.nextInt();
            ArrayList<Integer> list = new ArrayList<Integer>();
            for (int i = 0; i < numOfEntries; i++) {
                list.add(s.nextInt());
            }
            int numOfActions = s.nextInt();
            int test = 0;
            for (int i = 0; i < numOfActions; i++) {
                String command = s.next();
                switch (command) {
                    case "Insert":
                        list.add(s.nextInt(), s.nextInt());
                        break;
                    case "Delete":
                        list.remove(s.nextInt());
                        break;
                }
            }
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