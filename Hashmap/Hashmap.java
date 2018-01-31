//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class Hashmap{
    public static void main(String []argh)
    {
        try {
            Scanner in = new Scanner(new FileReader("input.txt"));
            int n = in.nextInt();
            in.nextLine();

            for (int i = 0; i < n; i++) {
                String name = in.nextLine();
                int phone = in.nextInt();

                in.nextLine();
            }
            while (in.hasNext()) {
                String s = in.nextLine();

            }
        } catch(Exception e){
            System.out.println("Input file not found");
        }
    }
}