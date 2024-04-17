package tasks;

import java.io.*;

public class Exchanger {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine().trim();
        String putput = reader.readLine().trim();
        String[] strings = input.split(" ");
        String[] strings2 = putput.split(" ");

        long min = Long.parseLong(strings2[0]);
        long max = Long.parseLong(strings2[0]);
        for(int i = 1; i<Integer.parseInt(strings[0]); i++) {
            long number = Long.parseLong(strings2[i]);
            if(number > max) {
                max = number;
            } else if (number < min) {
                min = number;
            }
        }
        System.out.println(max - min);
    }
}
