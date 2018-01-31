//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class HashmapSolution{
    public static void main(String []argh)
    {
        try {
            Scanner in = new Scanner(new FileReader("input.txt"));
            int n = in.nextInt();
            in.nextLine();
            HashMap<String, Integer> phonebook = new HashMap<String, Integer>();
            for (int i = 0; i < n; i++) {
                String name = in.nextLine();
                int phone = in.nextInt();
                phonebook.put(name, phone);
                in.nextLine();
            }
            while (in.hasNext()) {
                String s = in.nextLine();
                Integer phone = phonebook.get(s);
                if (phone != null) {
                    System.out.println(s + "=" + phone);
                } else {
                    System.out.println("Not found");
                }

            }
        } catch(Exception e){
            System.out.println("Input file not found");
        }
    }
}